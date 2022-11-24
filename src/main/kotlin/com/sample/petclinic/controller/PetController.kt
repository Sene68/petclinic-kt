package com.sample.petclinic.controller

import com.sample.petclinic.data.AddPetParam
import com.sample.petclinic.data.PetData
import com.sample.petclinic.repository.PetRepository
import com.sample.petclinic.service.PetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/pets")
class PetController(val petService: PetService) {

    @GetMapping
    fun pets(): List<PetData> {
        return petService.pets()
    }

    @PostMapping("/{ownerId}/new")
    fun addPet(@PathVariable("ownerId") ownerId: Int, @Valid addPetParam: AddPetParam): PetData {
        return petService.addPet(ownerId, addPetParam)
    }
}