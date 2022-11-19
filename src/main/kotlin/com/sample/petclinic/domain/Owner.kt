package com.sample.petclinic.domain

import com.sample.petclinic.data.AddOwnerParam
import javax.persistence.*

@Entity
@Table(name = "owners")
class Owner(
        @Column(name= "first_name")
        var firstName: String? = null,

        @Column(name = "last_name")
        var lastName: String? = null,

        @Column(name = "address")
        var address: String? = null,

        @Column(name = "city")
        var city: String? = null,

        @Column(name = "telephone")
        var telephone: String? = null,
): BaseEntity() {

        fun updateOwner(editOwnerParam: AddOwnerParam) {
                this.firstName = editOwnerParam.firstName
                this.lastName = editOwnerParam.lastName
                this.address = editOwnerParam.address
                this.city = editOwnerParam.city
                this.telephone = editOwnerParam.telephone
        }
}