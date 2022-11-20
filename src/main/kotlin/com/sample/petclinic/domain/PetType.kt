package com.sample.petclinic.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "types")
class PetType(
        @Column(name = "name")
        var name: String? = null,
) : BaseEntity()