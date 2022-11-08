package com.sample.petclinic.controller

import com.sample.petclinic.data.OwnerData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/owners")
class OwnerController {

    @GetMapping
    fun owners(): List<OwnerData> {
        val owners = ArrayList<OwnerData>()

        val owner1 = OwnerData("A dong", "Seoul", "010-1234-5678")
        val owner2 = OwnerData("B dong", "Seoul", "010-5678-1234")

        owners.add(owner1)
        owners.add(owner2)

        return owners
    }
}