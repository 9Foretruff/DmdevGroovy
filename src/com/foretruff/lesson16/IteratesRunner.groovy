package com.foretruff.lesson16

import com.foretruff.lesson10.Person

class IteratesRunner {
    static void main(String[] args) {
        assert [1, 4, 5, 7, 8].any { it -> it % 2 == 0 }
        assert [1, 4, 5, 7, 8].find { it -> it % 2 == 0 } == 4
        assert [1, 4, 5, 7, 8].findAll { it -> it % 2 != 0 } == [1, 5, 7]
        assert (2..4).collect() == [2, 3, 4]

        def person = new Person(25)
        person.each { println it }

        ["asd", "dsv", "bbc", "445", "339"].grep(~/\d+/) == ["445", "339"]//isCase switch , in , grep
        //isCase switch , in , grep

        def result = ["asd", "dsv", "bbc", "44533", "33922"].grep { it.length() > 4 }
        assert result == ["44533", "33922"]


    }
}
