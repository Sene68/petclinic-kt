package com.sample.petclinic.controller

import com.sample.petclinic.data.PetData
import com.sample.petclinic.repository.PetRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/pets")
class PetController(val petRepository: PetRepository) {

    @GetMapping
    fun pets(): List<PetData> {
        val pets = petRepository.findAll()
        return pets.map { PetData.fromEntity(it) }
    }
}