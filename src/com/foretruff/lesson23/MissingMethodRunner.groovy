package com.foretruff.lesson23

import com.foretruff.lesson17.Student

class MissingMethodRunner {
    static void main(String[] args) {
        def student = new Student()
//        student.test()
        println student.abc

        def map = ["1": 11, "2": 22, "abc": 34]
        println map."1"
        println map.abc

        println student.findByAge(90)

    }
}
