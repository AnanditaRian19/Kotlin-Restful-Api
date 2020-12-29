package com.api.restfull.auth

import org.springframework.stereotype.Component
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * @author Rizki Rian Anandita
 */
@Component
class ApiKeyConfiguration(val apiKeyInterceptor: ApiKeyInterceptor) : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        super.addInterceptors(registry)

        registry.addWebRequestInterceptor(apiKeyInterceptor)
    }
}