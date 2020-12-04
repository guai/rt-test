package com.example.rttestproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@SpringBootApplication
class ProducerApplication

@RestController
class HelloController {
    @RequestMapping("/producer/status", method = [RequestMethod.GET])
    fun status(): String {
        return """
			|{
			|	"status": "UP"
			|}""".trimMargin()
    }
}

fun main(args: Array<String>) {
    runApplication<ProducerApplication>(*args)
}
