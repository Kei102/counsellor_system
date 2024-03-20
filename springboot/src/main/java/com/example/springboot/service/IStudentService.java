package com.example.springboot.service;

import com.example.springboot.controller.request.ClassPageRequest;
import com.example.springboot.controller.request.StudentPageRequest;
import com.example.springboot.entity.Class;
import com.example.springboot.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> list();

    Object page(StudentPageRequest studentPageRequest);

    void save(Student obj);

    void deleteById(Integer id);

    void update(Student student);

    Student getById(Integer id);

}
