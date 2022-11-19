package com.sample.petclinic.service

import com.sample.petclinic.data.AddOwnerParam
import com.sample.petclinic.data.EditOwnerParam
import com.sample.petclinic.data.OwnerData

interface OwnerService {
    fun owners(): List<OwnerData>

    fun owner(ownerId: Int): OwnerData

    fun findOwners(lastName: String): List<OwnerData>

    fun addOwner(addOwnerParam: AddOwnerParam): OwnerData

    fun editOwner(ownerId: Int, editOwnerParam: EditOwnerParam): OwnerData
}