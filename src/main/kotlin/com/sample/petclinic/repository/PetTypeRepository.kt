package com.sample.petclinic.repository

import com.sample.petclinic.domain.PetType
import org.springframework.data.repository.Repository
import org.springframework.transaction.annotation.Transactional

interface PetTypeRepository: Repository<PetType, Int> {

    @Transactional(readOnly = true)
    fun findByName(name: String): PetType
}