package com.p1.springdemo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="details")
public class ProfileDTO {

    @Id
    @GeneratedValue
    private String sid;
    @Column
    @NotNull
    private String fname;
    @Column
    private String lname;
    @Column
    private String dob;
    @Column
    private String address;

    @OneToMany
    @JoinColumn(name="id")

    public String getid() {
        return sid;
    }
    public void setid(String sid) {
        this.sid = sid;
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