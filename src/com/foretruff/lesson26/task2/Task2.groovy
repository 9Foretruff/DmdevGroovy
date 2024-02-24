package com.foretruff.lesson26.task2

class Task2 {
    static void main(String[] args) {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }
}
