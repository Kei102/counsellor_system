package com.example.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description student
 * @author NJ
 * @date 2024-03-19
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生id
     */
    private Integer stuId;

    /**
     * 学生学号
     */
    private String stuNo;

    /**
     * 学生姓名
     */
    private String stuName;

    /**
     * 性别
     */
    private String stuSex;

    /**
     * 年龄
     */
    private Integer stuAge;

    /**
     * 学生生源地信息
     */
    private String stuOriadd;

    /**
     * 学生家庭住址
     */
    private String stuAdd;

    /**
     * 民族
     */
    private String stuNation;

    /**
     * 联系方式
     */
    private String stuPhone;

    /**
     * 父母联系方式
     */
    private String paPhone;

    /**
     * 寝室详情
     */
    private String stuDorm;

    /**
     * 科研成功和奖惩情况
     */
    private String stuAward;

    /**
     * 综合测评结果
     */
    private String stuCe;

    /**
     * 照片
     */
    private String stuPhoto;

    /**
     * 班级号
     */
    private String classNo;

    /**
     * 辅导员工号
     */
    private String counsellorNo;

    public Student() {}
}
