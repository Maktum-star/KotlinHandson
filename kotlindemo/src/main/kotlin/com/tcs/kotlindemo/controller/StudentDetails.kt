package com.tcs.kotlindemo.controller

import com.tcs.kotlindemo.model.Student
import com.tcs.kotlindemo.repository.Studentrepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Student")
class StudentDetails(var studentrepository: Studentrepository) {

    @GetMapping("/Greet")
    fun student_details() :String {
        return "Hello Students"
    }

//    @Autowired
//    lateinit var studentrepository: Studentrepository;

    @GetMapping("/getAll")
    fun getAllStudents(): List<Student> {
        return studentrepository.findAll()
    }

}