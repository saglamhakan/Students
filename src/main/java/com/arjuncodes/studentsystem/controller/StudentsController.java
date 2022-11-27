package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/student")
public class StudentsController {

    private StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(name = "/add")
    public String add(Student student) {
        this.studentService.saveStudent(student);
        return "New Student is added";
    }
    @GetMapping(name = "getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
