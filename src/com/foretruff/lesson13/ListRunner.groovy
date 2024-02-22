package com.foretruff.lesson13

class ListRunner {
    static void main(String[] args) {
        def list = [1, 2, 3, 4, 5, 6]
        assert list.getClass() == ArrayList

        //read
        assert list[2] == 3
        assert list.get(2) == 3
        assert list[-1] == 6
        assert list[0..2].sum() == 6
        assert list[0..2] == [1, 2, 3]
        assert list[100] == null //

        //write
        list += 9
        list << 11 << 13 << 15 << 7 << 7
        println list
        assert list == [1, 2, 3, 4, 5, 6, 9, 11, 13, 15, 7, 7]
        list -= 7
        assert list == [1, 2, 3, 4, 5, 6, 9, 11, 13, 15]
        list -= [1, 3]
        assert list == [2, 4, 5, 6, 9, 11, 13, 15]
        list *= 3
        assert list == [2, 4, 5, 6, 9, 11, 13, 15, 2, 4, 5, 6, 9, 11, 13, 15, 2, 4, 5, 6, 9, 11, 13, 15]

        // method from queue

        list.push(999)
        def pop = list.pop()
        assert pop == 999
        assert list.head() == 2
        assert list.tail() == [4, 5, 6, 9, 11, 13, 15, 2, 4, 5, 6, 9, 11, 13, 15, 2, 4, 5, 6, 9, 11, 13, 15]
        assert list.last() == 15

        //flatten , reverse , intersect , disjoint
        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6])

        //new operators

        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7


        func(*[8,10])
    }

    static def func(def a, def b) {
        println a
        println b

    }
}
