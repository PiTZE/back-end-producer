package com.tapsell.backend.controllers

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {
    private val logger = LoggerFactory.getLogger(javaClass)
    @KafkaListener(topics = ["ImpressionEvent"], groupId = "Events")
    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }
}