package com.p1.springdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface Profile1DAO extends JpaRepository<Profile1DTO, String>,CrudRepository<Profile1DTO, String> {


	public Optional<Profile1DTO> findByFname(@PathVariable String fname);

	public Optional<Profile1DTO> findByFnameAndLname(@PathVariable String fname, @PathVariable  String lname);
	public List<Profile1DTO> findAllByFnameOrLname(@PathVariable String fname, @PathVariable  String lname);
	
}
