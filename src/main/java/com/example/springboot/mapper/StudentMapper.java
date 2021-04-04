package com.example.springboot.mapper;

import com.example.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> queryAll();
    Student queryByUid(Integer uid);
    Integer addStudent(Student student);
    Integer updateNameByUid(Integer uid, String userName);
    Integer deleteByUid(Integer uid);
}
