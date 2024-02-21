package com.foretruff

import java.sql.DriverManager

class HelloWorld {

    Integer value

//  PackageScope
    static void main(String[] args) {
        String value = "Hello world!"
        Class<String> clazz = value.getClass();
        assert clazz == String.class
        println "Hello world!"
        println clazz.getClassLoader()
        println HelloWorld.getClassLoader()
        println DriverManager.getClassLoader()
    }

}
