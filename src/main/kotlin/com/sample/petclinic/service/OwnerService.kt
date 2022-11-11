package com.sample.petclinic.service

import com.sample.petclinic.domain.Owner

interface OwnerService {
    fun owners(): List<Owner>
}