package com.foretruff.lesson6

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 3.intdiv(2) == 1
assert 2**3 == 8


//def result = (int) (3/2)
def result = (3 / 2) as Integer

println result <= 29
println result === 1
println result * 130 === 130
println result <=> 130
