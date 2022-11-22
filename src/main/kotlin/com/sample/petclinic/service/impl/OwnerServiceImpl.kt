package com.sample.petclinic.service.impl

import com.sample.petclinic.data.AddOwnerParam
import com.sample.petclinic.data.EditOwnerParam
import com.sample.petclinic.data.OwnerData
import com.sample.petclinic.data.toEntity
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.service.OwnerService
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class OwnerServiceImpl(val ownerRepository: OwnerRepository): OwnerService {
    override fun owners(): List<OwnerData> {
        val owners = ownerRepository.findAll()
        return owners.map { OwnerData.fromEntity(it) }
    }

    override fun owner(ownerId: Int): OwnerData {
        val owner = ownerRepository.findById(ownerId)
        return OwnerData.fromEntity(owner)
    }

    override fun findOwners(lastName: String): List<OwnerData> {
        val owners = ownerRepository.findAllByLastName(lastName)
        return owners.map { OwnerData.fromEntity(it) }
    }

    override fun addOwner(addOwnerParam: AddOwnerParam): OwnerData {
        val owner = ownerRepository.save(addOwnerParam.toEntity())
        return OwnerData.fromEntity(owner)
    }

    override fun editOwner(ownerId: Int, editOwnerParam: EditOwnerParam): OwnerData {
        val owner = ownerRepository.findById(ownerId)
        owner.updateOwner(editOwnerParam)
        ownerRepository.save(owner)

        return OwnerData.fromEntity(owner)
    }
}