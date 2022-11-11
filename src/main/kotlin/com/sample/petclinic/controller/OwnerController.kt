package com.sample.petclinic.controller

import com.sample.petclinic.domain.Owner
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.service.OwnerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/owners")
class OwnerController(val ownerService: OwnerService) {

    @GetMapping
    fun owners(): List<Owner> {
        return ownerService.owners()
    }
}