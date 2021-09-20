package com.p1.springdemo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	Profile1DAO studentDAO;
	@Autowired
	ProfileDAO student1DAO;
	@Autowired
	MarksDAO marksDAO;

	@GetMapping("/")
	public String firstMethod() {
		return "welcome to spring boot application";
	}
	
	@Cacheable(value="profile")
	@GetMapping("/")
	public List<StudentDTO> getAllStudent(){
		return profile1DAO.findAll();
	}
	
	@Cacheable(value="students")
	@GetMapping("/student/{sid}")
	public Optional<StudentDTO> getAnyStudent( @PathVariable("sid") String sid){
		return  studentDAO.findById(sid);
	}
	
	@Cacheable(value="students")
	@GetMapping("/student/fname/{fname}")
	public Optional<StudentDTO> getAnyStudentByFname( @PathVariable String fname){
		return  studentDAO.findByFname(fname);
	}
	
	@Cacheable(value="students")
	@GetMapping("/student/fnamelname/{fname}/{lname}")
	public Optional<StudentDTO> getAnyStudentByFnameLname( @PathVariable String fname, @PathVariable String lname){
		return  studentDAO.findByFnameAndLname(fname,lname);
	}
	
	@Cacheable(value="students")
	@GetMapping("/student/fname/lname/{fname}/{lname}")
	public List<StudentDTO> getAnyStudentByFnameOrLname( @PathVariable String fname, @PathVariable String lname){
		return  studentDAO.findAllByFnameOrLname(fname,lname);
	}
	
	@Cacheable(value="students")
	@GetMapping("/student/marks")
	public List<Student1DTO> getAllStudentsMarks(){
		return student1DAO.findAll();
	}
	
	@Cacheable(value="students")
	@GetMapping("/student/getDetails")
    public List<String> getStudentDetails(){
        return student1DAO.getJointDetails();
    }
	
	@Cacheable(value="students")
	@GetMapping("/student/getMarks")
    public List<String> getStudentMarks(){
        return marksDAO.getJointMarks();
    }

	
	
	

}
