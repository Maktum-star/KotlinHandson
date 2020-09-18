package com.tcs.kotlinproject.repository

import com.tcs.kotlinproject.Entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepo: JpaRepository<Student, Integer> {

}

