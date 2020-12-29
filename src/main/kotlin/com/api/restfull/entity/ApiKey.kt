package com.api.restfull.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Rizki Rian Anandita
 */
@Entity
@Table(name = "api_keys")
data class ApiKey(

        @Id
        val id: String
)
