package com.foretruff.lesson10;

public class Person {
    private final Integer id;

    public Integer getId() {
        return id;
    }

    public boolean asBoolean() {
        return id > 10;
    }

    public boolean isCase(Object switchValue) {
        System.out.println("invoke isCase: " + switchValue);
        return false;
    }

    public Person(Integer id) {
        this.id = id;
    }
}
