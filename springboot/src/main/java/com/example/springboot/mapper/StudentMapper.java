package com.example.springboot.mapper;

import com.example.springboot.controller.request.ClassPageRequest;
import com.example.springboot.controller.request.CounsellorPageRequest;
import com.example.springboot.controller.request.StudentPageRequest;
import com.example.springboot.entity.Class;
import com.example.springboot.entity.Department;
import com.example.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> list();

    void save(Student obj);

    List<Student> listByCondition(StudentPageRequest studentPageRequest);

    void deleteById(Integer id);

    void updateById(Student student);

    Student getById(Integer id);
}
