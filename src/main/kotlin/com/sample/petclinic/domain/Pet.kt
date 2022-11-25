package com.sample.petclinic.domain

import com.fasterxml.jackson.annotation.JsonBackReference
import com.sample.petclinic.data.EditPetParam
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "pets")
class Pet(
        @Column(name = "name")
        var name: String? = null,

        @Column(name = "birth_date")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        var birthDate: LocalDate? = null,

        @ManyToOne
        @JoinColumn(name = "type_id")
        var type: PetType? = null,

        @JsonBackReference
        @ManyToOne
        @JoinColumn(name = "owner_id")
        var owner: Owner? = null,
) : BaseEntity() {
        fun updatePet(editPetParam: EditPetParam, petType: PetType) {
                this.name = editPetParam.name ?: this.name
                this.birthDate = editPetParam.birthDate ?: this.birthDate
                this.type = petType
        }
}