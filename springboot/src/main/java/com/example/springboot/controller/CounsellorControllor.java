package com.example.springboot.controller;


import com.example.springboot.common.Result;
import com.example.springboot.controller.request.ClassPageRequest;
import com.example.springboot.controller.request.CounsellorPageRequest;
import com.example.springboot.entity.Department;
import com.example.springboot.entity.Class;
import com.example.springboot.service.ICounsellorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/counsellor")
public class CounsellorControllor {

    @Autowired
    ICounsellorService counsellorService;


//院系管理
    @GetMapping("/departmentList")
    public Result listDepartments() {
        List<Department> departments = counsellorService.listDepartments();
        return Result.success(departments);
    }

    @GetMapping("/departmentPage")
    public Result page(CounsellorPageRequest counsellorPageRequest) {
        return Result.success(counsellorService.page(counsellorPageRequest));
    }

    @PostMapping("/departmentSave")
    public Result departmentSave(@RequestBody Department obj) {
        counsellorService.departmentSave(obj);
        return Result.success();
    }

    @DeleteMapping("/departmentDelete/{id}")
    public Result departmentDelete(@PathVariable Integer id) {
        counsellorService.deleteBydpId(id);
        return Result.success();
    }

    @PutMapping("/departmentUpdate")
    public Result departmentUpdate(@RequestBody Department department) {
        counsellorService.departmentUpdate(department);
        return Result.success();
    }

    @GetMapping("/department/{id}")
    public Result getBydpId(@PathVariable Integer id) {
        Department department = counsellorService.getBydpId(id);
        return Result.success(department);
    }


//    班级管理
    @GetMapping("/classList")
    public Result listClass() {
        List<Class> classes = counsellorService.listClasses();
        return Result.success(classes);
    }
    @GetMapping("/classPage")
    public Result page(ClassPageRequest classPageRequest) {
        return Result.success(counsellorService.classpage(classPageRequest));
    }
    @PostMapping("/classSave")
    public Result classSave(@RequestBody Class obj) {
        counsellorService.classSave(obj);
        return Result.success();
    }
    @DeleteMapping("/classDelete/{id}")
    public Result classDelete(@PathVariable Integer id) {
        counsellorService.deleteByclassId(id);
        return Result.success();
    }
    @PutMapping("/classUpdate")
    public Result classUpdate(@RequestBody Class obj) {
        counsellorService.classUpdate(obj);
        return Result.success();
    }
    @GetMapping("/class/{id}")
    public Result getByclassId(@PathVariable Integer id) {
        Class obj = counsellorService.getByclassId(id);
        return Result.success(obj);
    }

}
