package com.example.springboot.service.impl;

import com.example.springboot.controller.request.ClassPageRequest;
import com.example.springboot.controller.request.CounsellorPageRequest;
import com.example.springboot.entity.Department;
import com.example.springboot.entity.Class;
import com.example.springboot.exception.ServiceException;
import com.example.springboot.mapper.CounsellorMapper;
import com.example.springboot.service.ICounsellorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class CounsellorService implements ICounsellorService {
    @Autowired
    CounsellorMapper counsellorMapper;

    @Override
    public List<Department> listDepartments() {
        return counsellorMapper.listDepartments();
    }

    @Override
    public Object page(CounsellorPageRequest counsellorPageRequest) {
        PageHelper.startPage(counsellorPageRequest.getPageNum(),counsellorPageRequest.getPageSize());
        List<Department> departments = counsellorMapper.deparmentListByCondition(counsellorPageRequest);
        return new PageInfo<>(departments);
    }

    @Override
    public void departmentSave(Department obj) {
        try {
            counsellorMapper.departmentSave(obj);
        } catch (Exception e) {
            throw new ServiceException("数据插入错误",e);
        }
    }

    @Override
    public void deleteBydpId(Integer id) {
        counsellorMapper.deleteBydpId(id);
    }

    @Override
    public void departmentUpdate(Department department) {
        department.setUpdatetime(LocalDate.now());
        counsellorMapper.departmentUpdateBydpId(department);
    }

    @Override
    public Department getBydpId(Integer id) {
        return counsellorMapper.getBydpId(id);
    }

    @Override
    public List<Class> listClasses() {
        return counsellorMapper.listClasses();
    }

    @Override
    public Object classpage(ClassPageRequest classPageRequest) {
        PageHelper.startPage(classPageRequest.getPageNum(),classPageRequest.getPageSize());
        List<Class> departments = counsellorMapper.classtListByCondition(classPageRequest);
        return new PageInfo<>(departments);
    }

    @Override
    public void classSave(Class obj) {
        try {
            counsellorMapper.classSave(obj);
        } catch (Exception e) {
            throw new ServiceException("数据插入错误",e);
        }
    }

    @Override
    public void deleteByclassId(Integer id) {
        counsellorMapper.deleteByclassId(id);
    }

    @Override
    public void classUpdate(Class obj) {
        obj.setUpdatetime(LocalDate.now());
        counsellorMapper.classUpdateByclassId(obj);
    }

    @Override
    public Class getByclassId(Integer id) {
        return counsellorMapper.getByclassId(id);
    }
}
