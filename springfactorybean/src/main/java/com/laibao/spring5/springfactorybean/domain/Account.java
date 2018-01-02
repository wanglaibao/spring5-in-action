package com.laibao.spring5.springfactorybean.domain;

import java.io.Serializable;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class Account implements Serializable{
    private static final long serialVersionUID = 113211656737270134L;

    private long id;

    private String name;

    public Account(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
