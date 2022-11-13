package com.sample.petclinic.controller

import com.sample.petclinic.data.OwnerData
import com.sample.petclinic.domain.Owner
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.service.OwnerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
}