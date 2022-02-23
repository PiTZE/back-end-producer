package com.tapsell.backend.controllers

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {
    fun send(message: String) {
        kafkaTemplate.send("ImpressionEvent", message)
    }
}