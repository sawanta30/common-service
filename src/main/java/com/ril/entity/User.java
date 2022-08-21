package com.ril.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private long id;

    @NotNull(message = "firstname can not be null")
    @NotEmpty(message = "firstname cannot be empty")
    @Column(name = "firstname")
    private String firstname;

    @NotNull(message = "lastname can not be null")
    @NotEmpty(message = "lastname cannot be empty")
    @Column(name = "lastname")
    private String lastname;

    @NotNull(message = "email can not be empty")
    @Email(message = "Invalid email address")
    @Column(name = "email")
    private String email;

    @NotNull(message = "mobile can not be empty")
    @Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number")
    @Column(name = "mobile")
    private String mobile;

    @NotNull(message = "adhar can not be empty")
    @Column(name = "adhar")
    @Pattern(regexp = "^\\d{12}$",message = "Invalid adhar number")
    private String adhar;

    @NotNull(message = "pan can not be empty")
    @Column(name = "pan")
    private String pan;

    @NotNull(message = "gender can not be null")
    @NotEmpty(message = "gender can not be empty")
    @Column(name = "gender")
    private String gender;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
