package com.sample.petclinic.controller

import com.sample.petclinic.domain.Owner
import com.sample.petclinic.repository.OwnerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/owners")
class OwnerController(val ownerRepository: OwnerRepository) {

    @GetMapping
    fun owners(): List<Owner> {
        return ownerRepository.findAll()
    }
}