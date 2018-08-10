package com.hsb.spring.boot.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Role {
    private Long id;

    private String roleName;

    private String note;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Integer level;
}