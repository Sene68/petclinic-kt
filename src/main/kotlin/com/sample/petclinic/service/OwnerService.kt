package com.sample.petclinic.service

import com.sample.petclinic.data.OwnerData

interface OwnerService {
    fun owners(): List<OwnerData>

    fun owner(ownerId: Int): OwnerData

    fun findOwners(lastName: String): List<OwnerData>
}