package com.example.springboot.service;

import com.example.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> queryAll();
    Student queryByUid(Integer uid);
    Integer addStudent(Student student);
    Integer updateUserNameByUid(Integer uid, String userName);
    Integer deleteByUid(Integer uid);
}
