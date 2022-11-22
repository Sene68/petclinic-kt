package com.sample.petclinic.service.impl

import com.sample.petclinic.data.PetData
import com.sample.petclinic.repository.PetRepository
import com.sample.petclinic.service.PetService
import org.springframework.stereotype.Service

@Service
class PetServiceImpl(val petRepository: PetRepository): PetService {

    override fun pets(): List<PetData> {
        val pets = petRepository.findAll()
        return pets.map { PetData.fromEntity(it) }
    }
}