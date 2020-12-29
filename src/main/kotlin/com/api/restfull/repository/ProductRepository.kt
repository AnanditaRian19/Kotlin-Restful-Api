package com.api.restfull.repository

import com.api.restfull.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author Rizki Rian Anandita
 */
interface ProductRepository : JpaRepository<Product, String> {
}