package com.tapsell.backend.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MessageApi(private val kafkaProducer: KafkaProducer) {
    @PostMapping("/message")
    fun publish(@RequestBody message: String) {
        kafkaProducer.send(message)
    }
}