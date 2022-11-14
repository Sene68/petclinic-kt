package com.sample.petclinic.data

import com.sample.petclinic.domain.Owner
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class OwnerData(
        val id: Int,
        val firstName: String,
        val lastName: String,
        val address: String,
        val city: String,
        val telephone: String
) {
    companion object {
        fun fromEntity(owner: Owner): OwnerData {
            return OwnerData(
                id = owner.id!!,
                firstName = owner.firstname,
                lastName = owner.lastName,
                address = owner.address,
                city = owner.city,
                telephone = owner.telephone
            )
        }
    }
}

data class FindOwnerParam(
        @NotNull
        @NotEmpty
        val lastName: String
)