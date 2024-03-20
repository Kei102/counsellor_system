package com.example.springboot.mapper;

import com.example.springboot.controller.request.ClassPageRequest;
import com.example.springboot.controller.request.CounsellorPageRequest;
import com.example.springboot.entity.Class;
import com.example.springboot.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CounsellorMapper {

    List<Department> deparmentListByCondition(CounsellorPageRequest counsellorPageRequest);

    List<Department> listDepartments();

    void departmentSave(Department obj);

    void deleteBydpId(Integer id);

    void departmentUpdateBydpId(Department department);

    Department getBydpId(Integer id);

    List<Class> listClasses();

    List<Class> classtListByCondition(ClassPageRequest classPageRequest);

    void classSave(Class obj);

    void deleteByclassId(Integer id);

    void classUpdateByclassId(Class obj);

    Class getByclassId(Integer id);
}
