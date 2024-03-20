package com.example.springboot.controller;


import com.example.springboot.common.Result;
import com.example.springboot.controller.request.StudentPageRequest;
import com.example.springboot.entity.Department;
import com.example.springboot.entity.Student;
import com.example.springboot.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentControllor {

    @Autowired
    IStudentService studentService;


//院系管理
    @GetMapping("/list")
    public Result list() {
        List<Student> students = studentService.list();
        return Result.success(students);
    }

    @GetMapping("/page")
    public Result page(StudentPageRequest studentPageRequest) {
        return Result.success(studentService.page(studentPageRequest));
    }

    @PostMapping("/save")
    public Result save(@RequestBody Student obj) {
        studentService.save(obj);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        studentService.deleteById(id);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Student student) {
        studentService.update(student);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Student student = studentService.getById(id);
        return Result.success(student);
    }

}
