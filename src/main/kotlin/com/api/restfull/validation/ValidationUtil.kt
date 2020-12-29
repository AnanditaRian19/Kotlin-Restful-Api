package com.api.restfull.validation

import org.springframework.stereotype.Component
import javax.validation.ConstraintViolationException
import javax.validation.Validator

/**
 * @author Rizki Rian Anandita
 */
@Component
class ValidationUtil(val validator: Validator) {

    fun validate(any: Any) {
        val result = validator.validate(any)

        if (result.size != 0) {
            throw ConstraintViolationException(result)
        }
    }
}