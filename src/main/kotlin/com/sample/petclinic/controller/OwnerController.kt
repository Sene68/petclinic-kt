package com.sample.petclinic.controller

import com.sample.petclinic.data.OwnerData
import com.sample.petclinic.service.OwnerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/owners")
class OwnerController(val ownerService: OwnerService) {

    @GetMapping
    fun owners(): List<OwnerData> {
        return ownerService.owners()
    }

    @GetMapping("/{ownerId}")
    fun owner(@PathVariable("ownerId") ownerId: Int): OwnerData {
        return ownerService.owner(ownerId);
    }

    @GetMapping("/find/{lastName}")
    fun findOwners(@PathVariable("lastName") lastName: String): List<OwnerData> {
        return ownerService.findOwners(lastName)
    }
}