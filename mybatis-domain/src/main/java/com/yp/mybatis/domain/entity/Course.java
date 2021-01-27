package com.yp.mybatis.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String no;
    private String name;
    private String pno;
    private Integer credit;
}
