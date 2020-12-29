package com.api.restfull.auth

import com.api.restfull.error.UnauthorizedException
import com.api.restfull.repository.ApiKeyRepository
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor
import java.lang.Exception

/**
 * @author Rizki Rian Anandita
 */
@Component
class ApiKeyInterceptor(val apiKeyRepository: ApiKeyRepository) : WebRequestInterceptor {

    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("X-Api-Key")
        if (apiKey == null) {
            throw UnauthorizedException()
        }

        if (!apiKeyRepository.existsById(apiKey)) {
            throw UnauthorizedException()
        }

        // Valid
    }

    override fun postHandle(request: WebRequest, model: ModelMap?) {
        // Nothing
    }

    override fun afterCompletion(request: WebRequest, ex: Exception?) {
        // Nothing
    }
}