package com.sample.petclinic.domain

import com.fasterxml.jackson.annotation.JsonManagedReference
import com.sample.petclinic.data.AddOwnerParam
import com.sample.petclinic.data.EditOwnerParam
import java.util.HashSet
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

        @JsonManagedReference
        @OneToMany(cascade = [CascadeType.ALL], mappedBy = "owner", fetch = FetchType.EAGER)
        var pets: MutableSet<Pet> = HashSet()
): BaseEntity() {

        fun updateOwner(editOwnerParam: EditOwnerParam) {
                this.firstName = editOwnerParam.firstName ?: this.firstName
                this.lastName = editOwnerParam.lastName ?: this.lastName
                this.address = editOwnerParam.address ?: this.address
                this.city = editOwnerParam.city ?: this.city
                this.telephone = editOwnerParam.telephone ?: this.telephone
        }
}