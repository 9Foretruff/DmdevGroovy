package com.foretruff.lesson17

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

@ToString
@TupleConstructor
@EqualsAndHashCode
//@Canonical == all 3
//@Immutable
@Builder
//@Slf4j
class Student implements WIthId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    static void main(String[] args) {
//        Student.builder()
//                .firstName("Maks")
//                .lastName("Rokitko")
//                .build()
    }

    def methodMissing(String name, Object arguments) {
        println "Misiing method $name is invoked: $arguments"
        def field = name - "findBy"
        println "select * from user where $field = ${arguments[0]}"
    }

    def propertyMissing(String name) {
        println "misiing property: $name"
        "Default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject // == this
            println owner
            println delegate
            Closure second = {
                println thisObject // == this
                println owner
                println delegate
            }
            second()
        }
        closure
    }

}
