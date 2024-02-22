package com.foretruff.lesson11

import com.foretruff.lesson10.Person

class SwitchRunner {

    static void main(String[] args) {
        int x = 12
        // byte , short , int , char , String , enum
        switch (x) {
            case String: // isInstance
                println 0
                break
            case 5:     //equals ==
                println 1
                break
            case new Person(29):
                println 5
                break
            case ~/\d+/: // pattern.mather(x.toString()).matches
                println 2
                break
            case { it % 5 == 0 }:
                println 3
                break
            case [1, 3, 5, 8, 9]:
                println 4
                break
            default:
                println "None"
                break
        }

        if (x in [1, 2, 3, 4, 5, 6, 7, 8,12]) {
            println x
        }

    }

}
