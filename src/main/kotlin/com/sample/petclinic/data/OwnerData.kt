package com.sample.petclinic.data

data class OwnerData(
        var id: Int = 0,
        var firstName: String = "",
        var lastName: String = "",
        var address: String = "",
        var city: String = "",
        var telephone: String = ""
) {
}