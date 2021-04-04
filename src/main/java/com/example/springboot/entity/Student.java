package com.example.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {
    Integer uid;
    String userName;
    Integer age;
    Integer sex;
    String address;
}
