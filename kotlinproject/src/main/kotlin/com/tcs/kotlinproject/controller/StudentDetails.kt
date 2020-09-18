package com.tcs.kotlinproject.controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Student")
class StudentDetails {

    @GetMapping("/Greet")
    fun student_details() :String {
        return "Hello Students"
    }
}