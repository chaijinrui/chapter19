package com.hspedu.outputstream_;

import java.io.Externalizable;
import java.io.Serializable;

/**
 * FileName：Dog
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/20
 * Time: 23:23
 * Description：
 */
public class Dog implements Serializable {
    private String name;
    private int age;
    private String description;
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
