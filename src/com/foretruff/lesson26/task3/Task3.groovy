package com.foretruff.lesson26.task3

class Task3 {
    static void main(String[] args) {
        given {
            a = 2
            b = 4
        } when {
            result = a + b
        } then {
            result == 6
        }
    }

    static def given(Closure closure) {
        def valueHolder = [:]
        closure.delegate = valueHolder
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure()
        ["when": { Closure whenClosure ->
            {
                whenClosure.delegate = valueHolder
                whenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                whenClosure()
                ["then": { Closure thenClosure ->
                    {
                        thenClosure.delegate = valueHolder
                        thenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                        assert thenClosure()
                    }
                }]
            }
        }]
    }

}
