package com.sample.petclinic.service

import com.sample.petclinic.data.PetData

interface PetService {
    fun pets(): List<PetData>
}