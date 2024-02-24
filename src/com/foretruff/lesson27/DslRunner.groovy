package com.foretruff.lesson27

import static com.foretruff.lesson27.DslBuilder.*

//def email = new Email()
//email.setFrom("from@gmail.com")
//email.setTo("from@gmail.com")
//email.setTitle("Title")
//
//def body = new EmailBody()
//body.setText("sadsd")
//email.setBody(body)

//builder
mail {
    from "from@gmail.com"
    to "to@gmail.com"
    title "title"
    body {
        text "some text"
        images["some.png"]
    }
}

