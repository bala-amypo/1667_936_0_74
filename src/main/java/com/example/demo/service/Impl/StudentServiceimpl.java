package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

import java.util.*;

@Service
public class StudentServiceimpl implements StudentService{
    @Autowired StudentRepository student;
    @Override
    public StudentEntity postdata(StudentEntity stu){
       return student.save(stu);
    }
    
    @Override
    public List<StudentEntity> getAllData(){
        return student.findAll();
    }

    @Override
    public String DeleteData(int id){
        student.deleteById(id);
        return "Deleted Successfully";
    }

    @Override
    public StudentEntity getData(int id){
       return student.findById(id);
    
    }

    @Override
    public StudentEntity UpdateData(int id,StudentEntity stu){
        if (student.existsById(id)){
            entity.setId
            return 
        }
    }
}