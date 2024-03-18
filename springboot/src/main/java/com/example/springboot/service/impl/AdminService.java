package com.example.springboot.service.impl;

import com.example.springboot.entity.Admin;
import com.example.springboot.mapper.AdminMapper;
import com.example.springboot.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements IAdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> listAdmins() {
        return adminMapper.listAdmins();
    }
}
