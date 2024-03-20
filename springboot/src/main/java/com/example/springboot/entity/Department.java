package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

/**
 * @description department
 * @author NJ
 * @date 2024-03-19
 */
@Data
public class Department {


    /**
     * 院系id
     */
    private Integer dpId;

    /**
     * 院系号
     */
    private String dpNo;

    /**
     * 院系名
     */
    private String dpName;

    /**
     * 院系负责人
     */
    private String dpLeader;

    /**
     * 负责人联系方式
     */
    private String dpLephone;

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
}
