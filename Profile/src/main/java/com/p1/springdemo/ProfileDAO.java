package com.p1.springdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDAO extends JpaRepository<Profile1DTO, String> {

	@Query(value = "Select t1.sid, t1.fname, t1.lname, t3.cityname FROM sdetails t1 JOIN connectcity t2 on t1.sid=t2.sid JOIN city t3 on t2.citycode=t3.citycode", nativeQuery = true)
    public List<String> getJointDetails();
}
