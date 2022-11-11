package com.sample.petclinic.service.impl

import com.sample.petclinic.domain.Owner
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.service.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceImpl(val ownerRepository: OwnerRepository): OwnerService {
    override fun owners(): List<Owner> {
        return ownerRepository.findAll()
    }
}