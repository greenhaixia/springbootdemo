package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = {"/student"})
public class StudentController {
    final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/queryAll")
    public List<Student> queryAll() {
        return  studentService.queryAll();
    }

    @GetMapping("/queryByUid")
    public Student queryByUid(@RequestParam("uid") Integer uid) {
        Student student = studentService.queryByUid(uid);
        return student;
    }

    @GetMapping("/updateUserNameByUid")
    public Integer deleteByUid(@RequestParam("uid") Integer uid,
                               @PathParam("userName") String userName) {
        return studentService.updateUserNameByUid(uid, userName);
    }

    @GetMapping("/addStudent")
    public Integer addStudent() {
        Student student = new Student(102, "spring boot", 10, 0, "American");
        return studentService.addStudent(student);
    }

    @GetMapping("/deleteByUid")
    public Integer deleteByUid(@RequestParam("uid") Integer uid) {
        return studentService.deleteByUid(uid);
    }
}
