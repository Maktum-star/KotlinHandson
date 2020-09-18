package com.tcs.kotlindemo.repository

import com.tcs.kotlindemo.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(exported = false)
interface Studentrepository : JpaRepository<Student, Integer> {

}
