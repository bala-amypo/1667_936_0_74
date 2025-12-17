package com.example.demo.entity;



@Entity 
public class StudentEntity{
     private Integer id ;
     private String username;
     private String email;
     private String password;
     private Date creatAt;
     

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



}