package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description class
 * @author NJ
 * @date 2024-03-19
 */
@Data
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级id
     */
    private Integer classId;

    /**
     * 班级号
     */
    private String classNo;

    /**
     * 班主任
     */
    private String classLeader;

    /**
     * 班主任联系方式
     */
    private String classPhone;

    /**
     * 院系号
     */
    private String dpNo;

    /**
     * 辅导员工号
     */
    private String counsellorNo;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDate createtime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDate updatetime;

    public Class() {}
}
