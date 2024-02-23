package com.foretruff.lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
        def file = new File(".gitignore")
        println file.text

        file.each { line -> println line }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            // todo
            writer << reader
        }


        //write
        def file2 = new File("text.txt")
        file2.text = "Some text "
        file2 << "new line " << "sout test"

        def srcDir = new File("src")
//        srcDir.eachDirRecurse{ println it}
        srcDir.eachFile(FileType.FILES){ println it}
    }
}
