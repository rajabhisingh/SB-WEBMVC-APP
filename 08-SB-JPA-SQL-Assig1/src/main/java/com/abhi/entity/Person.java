package com.abhi.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSON_TAB")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "PERSON_ID")
    private Integer id;

    @Column(name = "PERSON_NAME")
    private String name;
    
    @Column(name = "PERSON_GENDER")
    private String gender;
    
    @Column(name = "PERSON_DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    
    @Column(name = "PERSON_PHOTO")
    @Lob
    private byte[] photo;
    
    @Column(name = "PERSON_RESUME")
    @Lob
    private byte[] resume;

 }
