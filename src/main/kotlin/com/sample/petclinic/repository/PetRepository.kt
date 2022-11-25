package com.sample.petclinic.repository

import com.sample.petclinic.domain.Pet
import org.springframework.data.repository.Repository
import org.springframework.transaction.annotation.Transactional

interface PetRepository: Repository<Pet, Int> {

    @Transactional(readOnly = true)
    fun findAll(): List<Pet>

    @Transactional(readOnly = true)
    fun findById(id: Int): Pet

    fun save(pet: Pet): Pet
}