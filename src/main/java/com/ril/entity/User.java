package com.ril.entity;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private long id;

    @NotNull(message = "firstname can not be empty")
    @Column(name = "firstname")
    private String firstname;

    @NotNull(message = "lastname can not be empty")
    @Column(name = "lastname")
    private String lastname;

    @NotNull(message = "email can not be empty")
    @Column(name = "email")
    private String email;

    @NotNull(message = "mobile can not be empty")
    @Column(name = "mobile")
    private long mobile;

    @NotNull(message = "adhar can not be empty")
    @Column(name = "adhar")
    private long adhar;

    @NotNull(message = "pan can not be empty")
    @Column(name = "pan")
    private String pan;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getAdhar() {
        return adhar;
    }

    public void setAdhar(long adhar) {
        this.adhar = adhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
