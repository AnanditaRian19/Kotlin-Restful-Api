package com.api.restfull.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
 * @author Rizki Rian Anandita
 */
data class CreateProductRequest(

        // NotBlank untuk String kosong
        @field:NotBlank
        val id: String?,

        @field:NotBlank
        val name: String?,

        // Sisanya gunakan NotNull
        @field:NotNull
        @field:Min(value = 1)
        val price: Long?,

        @field:NotNull
        @field:Min(value = 0)
        val quantity: Int?

)