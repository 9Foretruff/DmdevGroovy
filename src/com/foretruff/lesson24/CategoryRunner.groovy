package com.foretruff.lesson24

import com.foretruff.lesson17.Student

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Maks", lastName: "Rokitko")
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("Test arg")
        }
//        student.testStr()
//        student.anotherMethod()

    }
}
