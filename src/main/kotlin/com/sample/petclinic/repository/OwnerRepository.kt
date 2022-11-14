package com.sample.petclinic.repository

import com.sample.petclinic.domain.Owner
import org.springframework.data.repository.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.Cacheable

interface OwnerRepository: Repository<Owner, Int> {

    @Transactional(readOnly = true)
    fun findAll(): List<Owner>

    @Transactional(readOnly = true)
    fun findById(id: Int): Owner

    @Transactional(readOnly = true)
    fun findAllByLastName(lastName: String): List<Owner>

}