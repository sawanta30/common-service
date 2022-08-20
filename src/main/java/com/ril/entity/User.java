package com.ril.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userid")
    private long id;

    @NotNull
    @Column(name = "firstname")
    private String firstname;

    @NotNull
    @Column(name = "lastname")
    private String lastname;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "mobile")
    private long mobile;

    @NotNull
    @Column(name = "adhar")
    private String adhar;

    @NotNull
    @Column(name = "pan")
    private String pan;

}
