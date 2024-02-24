package com.foretruff.lesson22

import com.foretruff.lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

import java.lang.reflect.Method

class MetaClassRunner {
    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
//        println "hello"

        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "Test2")

        //  MetaClassImp
        println student.metaClass
//        println student.metaClass.methods

//        ExpandoMetaClass
        student.metaClass.abc = "Test property"
        student.metaClass.test = {
            println "its new method"
        }

        student.test()
        student.class.metaClass.newMethod = {
            println "new method in class student"
        }
//        println student.newMethod()
        new Student().newMethod()
        println student.metaClass
    }
}
