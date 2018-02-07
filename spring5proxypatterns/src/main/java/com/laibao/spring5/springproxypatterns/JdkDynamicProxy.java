package com.laibao.spring5.springproxypatterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author laibao wang
 * @date 2018-01-05
 * @version 1.0
 */
public class JdkDynamicProxy implements InvocationHandler{

    /**
     * 被代理的对象
     */
    private Subject target;

    public JdkDynamicProxy(Subject target) {
        this.target = target;
    }

    /**
     * 根据被代理的对象【target】生成对应的代理对象【proxyObj】
     * @param target
     * @return Object
     */
    public Object getProxyObject(Subject target) {
        //this.target = target;
        Class clazz = target.getClass();
        System.out.println("the name of the target class is "+ clazz.getName());
        Object proxyOjb =  Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        System.out.println("the name of the proxyOjb is "+proxyOjb.getClass().getName());
        return proxyOjb;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method!");
        Object result = method.invoke(target, args);
        System.out.println("after method!");
        return result;
    }
}
