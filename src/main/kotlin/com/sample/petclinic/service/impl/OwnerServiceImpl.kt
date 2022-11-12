package com.sample.petclinic.service.impl

import com.sample.petclinic.data.OwnerData
import com.sample.petclinic.domain.Owner
import com.sample.petclinic.repository.OwnerRepository
import com.sample.petclinic.service.OwnerService
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class OwnerServiceImpl(val ownerRepository: OwnerRepository, val modelMapper: ModelMapper): OwnerService {
    override fun owners(): List<OwnerData> {
        val owners = ownerRepository.findAll()
        return converts(owners)
    }

    private fun converts(owners: List<Owner>): List<OwnerData> {
        val ownerDataList = ArrayList<OwnerData>()

        for (owner in owners) {
            ownerDataList.add(convert(owner))
        }

        return ownerDataList
    }

    private fun convert(owner: Owner): OwnerData {
        return modelMapper.map(owner, OwnerData::class.java)
    }
}