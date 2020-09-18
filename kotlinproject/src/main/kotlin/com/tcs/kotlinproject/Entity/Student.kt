package com.tcs.kotlinproject.Entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity

data class Student (
        @Id
        var Id: Int = 0,
        var Name: String = "",
        var Location: String = "",
        var school: String = ""
)
