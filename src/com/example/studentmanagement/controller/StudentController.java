package com.example.studentmanagement.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
  private StudentService service;
   @PostMapping
   public Student saveStudent(@RequestBody Student student)
   {
	
	return service.saveStudent(student);
   }
   @GetMapping("/{id}")
   public Optional<Student> getStudentById(@PathVariable Long id)
   {
	   return service.getStudentById(id);
   }
   @PutMapping("/{id}")
   public Student updateStudent(@PathVariable Long id,@RequestBody Student student)
   {
	   student.setId(id);
	   return service.updateStudent(id,student);
   }
   @DeleteMapping("/{id}")
   public String deleteById(Long id)
   {
	   service.deleteStudent(id);
	   return "deleted sucessfully";
   }
}
