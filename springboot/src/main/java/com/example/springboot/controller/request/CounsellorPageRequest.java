package com.example.springboot.controller.request;


import lombok.Data;

@Data
public class CounsellorPageRequest extends BaseRequest{
    private String dpName;
    private Integer dpNo;
}
