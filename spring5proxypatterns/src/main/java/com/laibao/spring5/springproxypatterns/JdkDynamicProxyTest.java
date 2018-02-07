package com.laibao.spring5.springproxypatterns;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author laibao wang
 * @date 2018-01-05
 * @version 1.0
 */
public class JdkDynamicProxyTest {

    public static void main(String args[]) {
        Subject subject = new SubjectImpl();
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(subject);
        Subject proxyObject = (Subject) jdkDynamicProxy.getProxyObject(subject);
        proxyObject.test();

        // 获取代理对象的字节码内容
        byte[] byteData = ProxyGenerator.generateProxyClass("$Proxy01",new Class[]{proxyObject.getClass()});
        try {
            //将字节码输出到E盘
            FileOutputStream fos = new FileOutputStream("E:/$Proxy01.class");
            fos.write(byteData);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
