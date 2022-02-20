package com.tapsell.backend.repositories

import com.tapsell.backend.models.ImpressionEvent
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ImpressionEventRepository: MongoRepository<ImpressionEvent, String>