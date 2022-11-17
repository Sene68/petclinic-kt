package com.sample.petclinic.data

import com.sample.petclinic.domain.Owner

data class OwnerData(
        val id: Int,
        val firstName: String?,
        val lastName: String?,
        val address: String?,
        val city: String?,
        val telephone: String?
) {
    companion object {
        fun fromEntity(owner: Owner): OwnerData {
            return OwnerData(
                id = owner.id!!,
                firstName = owner.firstName,
                lastName = owner.lastName,
                address = owner.address,
                city = owner.city,
                telephone = owner.telephone
            )
        }
    }
}

data class AddOwnerParam(
    val firstName: String,
    val lastName: String,
    val address: String,
    val city: String,
    val telephone: String
)

fun AddOwnerParam.toEntity() = Owner(
        firstName = firstName,
        lastName = lastName,
        address = address,
        city = city,
        telephone = telephone
)