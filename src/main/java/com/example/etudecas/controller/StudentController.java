package com.example.etudecas.controller;

import com.example.etudecas.entitties.Student;
import com.example.etudecas.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudents")
    @ResponseBody
    public List<Student> gettAllStudent(){
    return this.studentService.findall();
    }

    @PostMapping("/addStudent")
    @ResponseBody
    public Student student(@RequestBody Student student){
        return this.studentService.saveStudent(student);
    }

    @PutMapping("/student/{id}")
    @ResponseBody
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
    return this.studentService.updateStudent(id,student);
    }


    @GetMapping("/student/{id}")
    @ResponseBody
    public Student getStudentById(@PathVariable Long id){
    return this.studentService.findById(id);
    }

    @DeleteMapping("/deleteStudent/{id}")
    @ResponseBody
    public String deleteStudent(@PathVariable Long id){
     this.studentService.deleteStudent(id);
        return "Student with ID : "+id+"deleted successfuly";
    }



}
