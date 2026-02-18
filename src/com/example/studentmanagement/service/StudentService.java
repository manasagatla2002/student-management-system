package com.example.studentmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;

@Service
public class StudentService
{
	@Autowired
 private StudentRepository repo;
 
 public Student saveStudent(Student student)
 {
	 return repo.save(student);
 }
 public Optional<Student> getStudentById(Long id)
 {
	 return repo.findById(id);
 }
 public Student updateStudent(Long id, Student student)
 {
	 return repo.save(student);
 }
 public void deleteStudent(Long id)
 {
	 repo.deleteById(id);
	
 }
}
