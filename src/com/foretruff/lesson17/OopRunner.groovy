package com.foretruff.lesson17

class OopRunner {
    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" // setFirstName
        println student.firstName // getFirstName
        println student["firstName"]
        println student.'firstName'
        println student.@firstName // not recommended

        def student1 = new Student(firstName: "Petr", lastName: "Petrov", age: 18, id: 2)
        println student1

        student1.properties.each { println it }

        Student student2 = ["Sveta", "Svatikova", 30]
        println student2

        def (fn, ln) = student2
        println fn
        println ln

        assert [student1, student2].collect(it -> it.firstName) == ["Petr", "Sveta"]
        assert [student1, student2]*.firstName == ["Petr", "Sveta"]

        String.mixin(OopRunner.class)

        "Maks".printStr()
    }

    static def printStr(String self){
        println "It`s mixin $self"
    }
}
