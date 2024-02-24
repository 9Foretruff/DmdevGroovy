package com.foretruff.lesson25

import com.foretruff.lesson17.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            firstName = "Lol"
        }
        println closure.thisObject
        println closure.owner
        println closure.delegate // owner

        def student = new Student("Ivan", "Ivanov", 23)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure()

        student.with closure

        println student

        student.getInfo()()
    }
}
