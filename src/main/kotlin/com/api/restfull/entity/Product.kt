package com.api.restfull.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Rizki Rian Anandita
 */

@Entity
@Table(name = "products")
data class Product(

        @Id
        val id: String,

        @Column(name = "name")
        var name: String,

        @Column(name = "price")
        var price: Long,

        @Column(name = "quatity")
        var quantity: Int,

        @Column(name = "created_at")
        var createdAt: Date,

        @Column(name = "updated_at")
        var updateAt: Date?
)