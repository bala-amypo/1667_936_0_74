package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.service.StudentEntity;

@Service
public class StudentServiceimpl implements StudentService{
    @Autowired StudentRepository student;
    public StudentEntity postdata(StudentEntity stu){
      
    }
}