package com.example.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description counsellor
 * @author NJ
 * @date 2024-03-19
 */
@Data
public class Counsellor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 辅导员id
     */
    private Integer counsellorId;

    /**
     * 辅导员工号
     */
    private String counsellorNo;

    /**
     * 姓名
     */
    private String counsellorName;

    /**
     * 性别
     */
    private String counsellorSex;

    /**
     * 联系方式
     */
    private String counsellorPhone;

    /**
     * 评论
     */
    private String counsellorCommon;

    /**
     * 照片
     */
    private String counsellorPhoto;

    /**
     * 院系号
     */
    private String dpNo;

    /**
     * 管理员工号
     */
    private String adminNo;

    public Counsellor() {}
}
