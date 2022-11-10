package com.sample.petclinic.domain

import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.validation.constraints.NotEmpty

@MappedSuperclass
open class Person: BaseEntity() {

    @Column(name= "first_name")
    @NotEmpty
    var firstname = ""

    @Column(name = "last_name")
    @NotEmpty
    var lastName = ""
}