package com.foretruff.lesson12

class LoopsRunner {
    static void main(String[] args) {
//        while / for
        def list = [1, 2, 3, 4, 5]
//        for (i in 0..list.size()) {
//            println i
//        }
//        for (Integer value : list) {
//            println value
//        }
//        for (value in list){
//            println value
//        }

//        0.upto(list.size(), it -> println it)
//        list.size().downto(0, it -> println it)

//        list.size().times{ println it}

        0.step(10,1, it -> println it)
    }
}
