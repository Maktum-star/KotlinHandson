package com.tcs.kotlindemo.model

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
data class Student (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val StudentName:String = "",
    val StudentClass:String = ""
)