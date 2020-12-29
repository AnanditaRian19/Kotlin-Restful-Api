package com.api.restfull.service

import com.api.restfull.model.CreateProductRequest
import com.api.restfull.model.ListProductRequest
import com.api.restfull.model.ProductResponse
import com.api.restfull.model.UpdateProductRequest

/**
 * @author Rizki Rian Anandita
 */
interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}