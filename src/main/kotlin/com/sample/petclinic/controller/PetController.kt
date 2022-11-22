package com.sample.petclinic.controller

import com.sample.petclinic.data.PetData
import com.sample.petclinic.repository.PetRepository
import com.sample.petclinic.service.PetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/pets")
class PetController(val petService: PetService) {

    @GetMapping
    fun pets(): List<PetData> {
        return petService.pets()
    }
}