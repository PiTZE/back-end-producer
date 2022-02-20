package com.tapsell.backend.repositories

import com.tapsell.backend.models.ClickEvent
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ClickEventRepository: MongoRepository<ClickEvent, String>