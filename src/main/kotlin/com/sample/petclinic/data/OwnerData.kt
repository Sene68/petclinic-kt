package com.sample.petclinic.data

import com.sample.petclinic.domain.Owner
import com.sample.petclinic.domain.Pet

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

data class OwnerInfo(
        val id: Int,
        val firstName: String?,
        val lastName: String?,
        val address: String?,
        val city: String?,
        val telephone: String?,
        val pets: List<PetInfo>
) {
    companion object {
        fun fromEntity(owner: Owner, pets: List<PetInfo>): OwnerInfo {
            return OwnerInfo(
                    id = owner.id!!,
                    firstName = owner.firstName,
                    lastName = owner.lastName,
                    address = owner.address,
                    city = owner.city,
                    telephone = owner.telephone,
                    pets = pets
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

data class EditOwnerParam(
    val firstName: String?,
    val lastName: String?,
    val address: String?,
    val city: String?,
    val telephone: String?
)