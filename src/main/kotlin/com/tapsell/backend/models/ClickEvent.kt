package com.tapsell.backend.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ClickEvent(
    @Id
    val requestId: String,
    val timestamp: Long,
)
