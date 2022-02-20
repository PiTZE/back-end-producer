package com.tapsell.backend.controllers

import com.tapsell.backend.models.ImpressionEvent
import com.tapsell.backend.repositories.ImpressionEventRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

//@RestController
//@RequestMapping("/impressions")
//class ImpressionEventController(private val impressionEventRepository: ImpressionEventRepository) {
//
//    @GetMapping("/")
//    fun getImpressionEvents(): ResponseEntity<List<ImpressionEvent>> {
//        return ResponseEntity.ok(impressionEventRepository.findAll())
//    }
//
//    @GetMapping("/{id}")
//    fun getImpressionEvent(@PathVariable id: String): ResponseEntity<ImpressionEvent> {
//        return ResponseEntity.ok(impressionEventRepository.findByIdOrNull(id))
//    }
//
//    @PostMapping("/")
//    fun createImpressionEvent(@RequestBody impressionEvent: ImpressionEvent): ResponseEntity<ImpressionEvent> {
//        return ResponseEntity.ok(impressionEventRepository.save(impressionEvent))
//    }
//
//    @PutMapping("/{id}")
//    fun updateImpressionEvent(@PathVariable id: String): ResponseEntity<ImpressionEvent> {
//        return ResponseEntity.ok(impressionEventRepository.save(impressionEvent))
//    }
//
//}