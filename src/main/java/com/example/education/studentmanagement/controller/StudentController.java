package com.example.education.studentmanagement.controller;

import com.example.education.studentmanagement.Service.StudentService;
import com.example.education.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class StudentController<student> {
    @Autowired
   StudentService studentService;

    @GetMapping("readall")
    public String getallStudent()
    {
        return "Hello world from spring";
    }
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }
}
