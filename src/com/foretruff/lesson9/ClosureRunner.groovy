package com.foretruff.lesson9


import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
        Function<Integer, Integer> func = value -> value + value

        def result = func.apply(5)
//        println result
//        Closure closure = {//->
//            println it
//            it + it
//        }

        Closure closure = { value ->
            println value
            value + value
        }


//        def result1 = closure.call(5)
        def result1 = closure(2)
        println result1

        Stream.of(1, 2, 3, 4, 5, 6)
//                .map(value -> value + 1)
//                .map(func)
                .map(closure)
//                .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)

        int x = 10;
//        check(x > 0, { println(++x) })
        check(x > 0) {
            println(++x)
        }

        println x
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure();
        }
    }
}
