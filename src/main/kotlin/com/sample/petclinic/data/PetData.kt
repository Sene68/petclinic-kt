package com.sample.petclinic.data

import com.sample.petclinic.domain.Owner
import com.sample.petclinic.domain.Pet
import com.sample.petclinic.domain.PetType
import java.time.LocalDate

data class PetData(
        val id: Int,
        val name: String?,
        val birthDate: LocalDate?,
        val type: PetType?,
        val owner: Owner?,
        ) {
    companion object {
        fun fromEntity(pet: Pet): PetData {
            return PetData(
                    id = pet.id!!,
                    name = pet.name,
                    birthDate = pet.birthDate,
                    type = pet.type,
                    owner = pet.owner
            )
        }
    }
}

data class PetInfo(
        val id: Int,
        val name: String?,
        val birthDate: LocalDate?,
        val type: PetType?,
) {
    companion object {
        fun fromEntity(pet: Pet): PetInfo {
            return PetInfo(
                    id = pet.id!!,
                    name = pet.name,
                    birthDate = pet.birthDate,
                    type = pet.type
            )
        }
    }
}