package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.Persistence;

@RestController
public class Rest {
	@Autowired
	private Persistence persistence;
	@PostMapping("/ins")
	public Student insert (@RequestBody Student student) {
		return persistence.save(student);
	}
	@GetMapping("/")
	public List<Student>get(){
		return(List<Student>)persistence.findAll();
	}
	@GetMapping("/{roll}")
	public Student findByid(@PathVariable  long roll) {
		Optional<Student> opt =persistence.findById(roll);
		Student s= opt.get();
		return s;
	}
	@DeleteMapping("/{roll}")
		public String deleteById(@PathVariable long roll) {
		persistence.deleteById(roll);
		return "student deleted successfully";
		}
	
}
