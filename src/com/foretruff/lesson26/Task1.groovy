package com.foretruff.lesson26

import com.foretruff.lesson17.Student

class Task1 {
    static void main(String[] args) {
//        new HashSet<>([1, 2, 3, 4, 4])
        Class.metaClass.make = { Object[] object ->
            delegate.metaClass.invokeConstructor(object)
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 5])
        def student1 = Student.make("Ivan", "Ivanov", 30)
        def student2 = Student.make()

        println hashSet
        println student1
        println student2
    }
}
