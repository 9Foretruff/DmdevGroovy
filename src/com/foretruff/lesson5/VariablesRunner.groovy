package com.foretruff.lesson5

import groovy.transform.CompileStatic

//import java.sql.Date
import java.sql.Date as SqlDate

class VariablesRunner {

//    def field

    /**
     * byte , short , int , long , BigInteger
     * float , double , BigDecimal
     * char
     * boolean
     */
    @CompileStatic
    static void main(def args) {
//        int value = 5; ==
        def value = 5
        BigInteger value2 = 36G
        BigDecimal value3 = 3.6G
        new SqlDate(1)
    }

}
