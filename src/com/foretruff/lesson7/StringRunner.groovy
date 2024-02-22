package com.foretruff.lesson7

/**
 *  " "
 *  ' '
 *  """ """
 *  ''' '''
 *  / /
 *  $/ /$
 */

def name = "Ivan\"''"
def value = 'Hello "Ho ho !"'

def stringValue = "Hello $name"
println stringValue

def value2 = """ " ' 
SELECT *
FROM 
table WHERE name = ${getWithPrefix("Maks")}
"""                                        //$name

// интерполяция ($name)только в "" или """ """
// если пишем в скрипте deff можно убрать
valueText = "some text"

char someChar = "H"

println someChar

println valueText

println value2

def value5 = /Hello word $name"/
println value5

def value6 = $/Hello $ word $name/$
println value6

println name[2]
println name[-1]
println name[0..3]
println name * 3
println name - 'Ivan'

static def getWithPrefix(String name) {
    "prefix-" + name
}
