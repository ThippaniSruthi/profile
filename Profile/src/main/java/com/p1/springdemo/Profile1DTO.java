package com.p1.springdemo;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sun.istack.NotNull;

    @Entity
    @Table(name="details")
    public class Profile1DTO {

        @Id
        //@GeneratedValue
        private String id;
        @Column
        @NotNull
        private String fname;
        @Column
        private String lname;
        @Column
        private String dob;
        @Column
        private String address;

        public static void save(Profile1DTO pdto) {
        }

        public String getSid() {return id;
        }
        public void setSid(String sid) {
            this.id = id;
        }
        public String getFname() {
            return fname;
        }
        public void setFname(String fname) {
            this.fname = fname;
        }
        public String getLname() {
            return lname;
        }
        public void setLname(String lname) {
            this.lname = lname;
        }
        public String getDob() {
            return dob;
        }
        public void setDob(String dob) {
            this.dob = dob;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
    }


