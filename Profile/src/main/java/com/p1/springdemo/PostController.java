package com.p1.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class PostController {

	@Autowired
	Profile1DAO studentDAO;
	
	@CachePut(value="Profile")
	@PostMapping("/insert")
	public String insertProfile(@RequestBody Profile1DTO pdto) {
		try {
			studentDAO.save(pdto);
			return "DATA IS INSERTED";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@CachePut(value="Profile")
	@PutMapping("/update")
	public String updateProfile(@RequestBody Profile1DTO Pdto) {
		try {
			Profile1DTO.save(Pdto);
			return "DATA IS UPDATED";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@CachePut(value="students")
	@PatchMapping("/patch")
	public String patchProfile(@RequestBody Profile1DTO pdto) {
		try {
			Profile1DTO.save(pdto);
			return "DATA IS PATCHED";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@CacheEvict(value="Profile")
	@DeleteMapping("/delete/{id}")
	public String deleteProfile(@PathVariable String id) {
		try {
			studentDAO.deleteById(id);
			return "DATA IS DELETED";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
}
