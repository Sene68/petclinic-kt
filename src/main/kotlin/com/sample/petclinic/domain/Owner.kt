package com.sample.petclinic.domain

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
): BaseEntity()