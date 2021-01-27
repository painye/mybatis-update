package com.yp.mybatis.practise.mapper;

import com.alibaba.druid.support.json.JSONUtils;
import com.yp.mybatis.domain.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentMapper {
    void save(Student stu);
    void update(Student stu);
    List<Student> findAll();
    //查询所有系的学生
    List<String> findAllSdept();
    List<Student> findBySdept(String sdept);
    List<Student> findByAgeBetween(@Param("minAge") double minAge, @Param("maxAge") double maxAge);
    List<Student> findByAgeOrder();
    Student findMaxAge();
    int countBySdept(String sdept);
    List<Student> findByLikeName(String name);
}