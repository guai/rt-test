package com.example.rttestconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class ConsumerApplication


fun main(args: Array<String>) {
	runApplication<ConsumerApplication>(*args)
}
