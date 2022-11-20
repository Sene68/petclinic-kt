package com.sample.petclinic.domain

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

        @ManyToOne
        @JoinColumn(name = "owner_id")
        var owner: Owner? = null,
) : BaseEntity()