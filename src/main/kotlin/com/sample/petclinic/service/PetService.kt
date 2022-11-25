package com.sample.petclinic.service

import com.sample.petclinic.data.AddPetParam
import com.sample.petclinic.data.EditPetParam
import com.sample.petclinic.data.PetData

interface PetService {
    fun pets(): List<PetData>

    fun addPet(ownerId: Int, addPetParam: AddPetParam): PetData

    fun editPet(petId: Int, editPetParam: EditPetParam): PetData
}