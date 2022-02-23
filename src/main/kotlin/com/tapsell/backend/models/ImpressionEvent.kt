package com.tapsell.backend.models

data class ImpressionEvent(
    val requestId: String,
    val timestamp: Long,
    val adId: String,
    val adTitle: String,
    val advertiserCost: Double,
    val appId: String,
    val appTitle: String,
)