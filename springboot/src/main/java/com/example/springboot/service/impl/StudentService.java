package com.example.springboot.service.impl;

import com.example.springboot.controller.request.StudentPageRequest;
import com.example.springboot.entity.Department;
import com.example.springboot.entity.Student;
import com.example.springboot.exception.ServiceException;
import com.example.springboot.mapper.StudentMapper;
import com.example.springboot.service.IStudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService implements IStudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public Object page(StudentPageRequest studentPageRequest) {
        PageHelper.startPage(studentPageRequest.getPageNum(),studentPageRequest.getPageSize());
        List<Student> students = studentMapper.listByCondition(studentPageRequest);
        return new PageInfo<>(students);
    }

    @Override
    public void save(Student obj) {
        try {
            studentMapper.save(obj);
        } catch (Exception e) {
            throw new ServiceException("数据插入错误",e);
        }
    }

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void update(Student student) {
        student.setUpdatetime(LocalDate.now());
        studentMapper.updateById(student);
    }

    @Override
    public Student getById(Integer id) {
        return studentMapper.getById(id);
    }

}
