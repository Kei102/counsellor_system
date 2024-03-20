package com.example.springboot.service;

import com.example.springboot.controller.request.ClassPageRequest;
import com.example.springboot.controller.request.CounsellorPageRequest;
import com.example.springboot.entity.Department;
import com.example.springboot.entity.Class;

import java.util.List;

public interface ICounsellorService {
    List<Department> listDepartments();

    Object page(CounsellorPageRequest counsellorPageRequest);

    void departmentSave(Department obj);

    void deleteBydpId(Integer id);

    void departmentUpdate(Department department);

    Department getBydpId(Integer id);

    List<Class> listClasses();

    Object classpage(ClassPageRequest classPageRequest);

    void classSave(Class obj);

    void deleteByclassId(Integer id);

    void classUpdate(Class obj);

    Class getByclassId(Integer id);
}
