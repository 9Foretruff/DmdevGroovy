package com.foretruff.lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student implements WIthId{
    String firstName
    String lastName
    Integer age

    def getAt(Integer index){
        index == 0 ? firstName : lastName
    }

}