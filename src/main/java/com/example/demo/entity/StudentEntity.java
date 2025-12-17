package com.example.demo.entity;

import java.sql.Date;

@Entity 
public class StudentEntity{
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
     public void setUsername(String username){
        this.username= username;
     }
     public String getUsername(){
        return username;
     }
     public void setEmail(String email){
        this.email=email;
     }
     public String getEmail(){
        return email;
     }
     public void setPassword(String password){
        this.password = password;
     }
     public String getPassword(){
        return password;
     }
     public void setCreated(Date created){
        this.created=created;
     }
     public Date getCreated(){
        return created;
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