package com.tcs.kotlinproject.controller
import com.tcs.kotlinproject.Entity.Student
import com.tcs.kotlinproject.repository.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Student")
class StudentDetails {
    @Autowired
    lateinit var studentrepo: StudentRepo

    @GetMapping("/Greet")
    fun student_details() :String {
        return "Hello Students"
    }

    @GetMapping("/getAll")
    fun getAllStudents(): List<Student> {
        return studentrepo.findAll()
    }
}