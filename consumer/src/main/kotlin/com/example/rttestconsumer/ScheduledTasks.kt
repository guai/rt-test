package com.example.rttestconsumer

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.core.env.Environment
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClientException
import org.springframework.web.client.RestTemplate


@Component
class ScheduledTasks {

    @Bean
    fun restTemplate(builder: RestTemplateBuilder) = builder.build()

    @Autowired
    lateinit var restTemplate: RestTemplate

    @Autowired
    lateinit var environment: Environment

    val producerHostPort: String by lazy {
        environment.getProperty("PRODUCER_HOST_PORT", "localhost:8080")
    }

    @Scheduled(fixedRate = 30_000)
    fun checkProducerStatus() {
        val uri = "http://$producerHostPort/producer/status"
        try {
            val status = restTemplate.getForObject(
                uri,
                Status::class.java
            )
            log.info(status.toString())
        } catch (e: Exception) {
            log.warn("Could not get the status from $uri")
        }
    }


    companion object {
        private val log = LoggerFactory.getLogger(ScheduledTasks::class.java)
    }
}
