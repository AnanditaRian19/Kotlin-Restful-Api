package com.api.restfull.model

/**
 * @author Rizki Rian Anandita
 */
data class WebResponse<T>(

        val code: Int,

        val status: String,

        val data: T
)