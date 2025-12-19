package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity 
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer id ;
     private String username;
     private String email;
     private String password;
     private Date created;
   



}