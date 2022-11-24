package com.sample.petclinic.service.impl

import com.sample.petclinic.data.AddPetParam
import com.sample.petclinic.data.PetData
import com.sample.petclinic.domain.Pet
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.repository.PetRepository
import com.sample.petclinic.repository.PetTypeRepository
import com.sample.petclinic.service.PetService
import org.springframework.stereotype.Service

@Service
class PetServiceImpl(
        val petRepository: PetRepository,
        val petTypeRepository: PetTypeRepository,
        val ownerRepository: OwnerRepository
): PetService {

    override fun pets(): List<PetData> {
        val pets = petRepository.findAll()
        return pets.map { PetData.fromEntity(it) }
    }

    override fun addPet(ownerId: Int, addPetParam: AddPetParam): PetData {
        val owner = ownerRepository.findById(ownerId)
        val petType = petTypeRepository.findByName(addPetParam.type)

        val pet = Pet(
                name = addPetParam.name,
                birthDate = addPetParam.birthDate,
                type = petType,
                owner = owner
        )

        return PetData.fromEntity(petRepository.save(pet))
    }
}