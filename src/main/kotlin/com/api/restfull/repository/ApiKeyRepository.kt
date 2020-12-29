package com.api.restfull.repository

import com.api.restfull.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author Rizki Rian Anandita
 */
interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}