package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.
import java.sql.Date;

@Entity 
public class StudentEntity{
    @Id
     private Integer id ;
     private String username;
     private String email;
     private String password;
     private Date created;
     

     public void setId(Integer id){
        this.id = id;
     }

     public Integer getId(){
        return id;
     }

     public String getUsername(){
        return username;
     }

     public void setUsername(String username){
        this.username= username;
     }
     public String getEmail(){
        return email;
     }
     
     public void setEmail(String email){
        this.email=email;
     }

     public String getPassword(){
        return password;
     }
     
     public void setPassword(String password){
        this.password = password;
     }

     public Date getCreated(){
        return created;
     } 
     
     public void setCreated(Date created){
        this.created=created;
     }
     

     public StudentEntity(Integer id,String username, String email,String password,Date created){
        this.id = id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.created=created;
     }

     public StudentEntity(){

     }



}