package com.foretruff.lesson15

import static com.foretruff.lesson15.WeekDay.FR
import static com.foretruff.lesson15.WeekDay.MO

class RangeRunner {

    static void main(String[] args) {
        def range = 2..<8 // 2..9
        assert range.getClass() == IntRange

        assert range.get(3) == 5
        assert !range.contains(8)

        range.each { println it }

        ('a'..'d').each { println it }
        (MO..FR).each { println it }
        (FR..MO).each { println it }
    }

}
