package com.sample.petclinic.domain

import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Int? = null

}