package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.*;

public interface StudentService{
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getAllData();
    String DeleteData(int id);
    StudentEntity getData(int id);
}