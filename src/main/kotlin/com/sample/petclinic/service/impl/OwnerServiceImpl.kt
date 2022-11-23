package com.sample.petclinic.service.impl

import com.sample.petclinic.data.*
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.service.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceImpl(val ownerRepository: OwnerRepository): OwnerService {
    override fun owners(): List<OwnerData> {
        val owners = ownerRepository.findAll()
        return owners.map { OwnerData.fromEntity(it) }
    }

    override fun owner(ownerId: Int): OwnerInfo {
        val owner = ownerRepository.findById(ownerId)
        val pets = owner.pets.map { PetInfo.fromEntity(it) }
        return OwnerInfo.fromEntity(owner, pets)
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