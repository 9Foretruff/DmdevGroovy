package com.foretruff.lesson27

class DslBuilder {
    static MailSpecification mail(@DelegatesTo(MailSpecification)Closure closure) {
        def mailSpecification = new MailSpecification()
        mailSpecification.with closure
        mailSpecification
    }
}
