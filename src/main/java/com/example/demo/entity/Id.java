package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.example.demo.entity.Student;
import java.util.Date;

import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer id ;
     private String cardno;

     @OneToOne
     @JoinColumn(name = "stu_id")
     private Student stu_id;

}