package com.example.springboot.service;

import com.example.springboot.entity.Student;
import com.example.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryAll() {
        return studentMapper.queryAll();
    }

    @Override
    public Student queryByUid(Integer uid) {
        return studentMapper.queryByUid(uid);
    }

    @Override
    public Integer addStudent(Student student) {
        try {
            return studentMapper.addStudent(student);
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Integer updateUserNameByUid(Integer uid, String userName) {
        return studentMapper.updateNameByUid(uid, userName);
    }

    @Override
    public Integer deleteByUid(Integer uid) {
        return studentMapper.deleteByUid(uid);
    }
}
