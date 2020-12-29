package com.api.restfull.config

import com.api.restfull.entity.ApiKey
import com.api.restfull.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

/**
 * @author Rizki Rian Anandita
 */
@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository) : ApplicationRunner {

    val apiKey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)) {
            val entity = ApiKey(id = apiKey)
            apiKeyRepository.save(entity)
        }
    }
}