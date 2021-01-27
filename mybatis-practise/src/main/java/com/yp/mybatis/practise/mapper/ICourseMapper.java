package com.yp.mybatis.practise.mapper;

import com.yp.mybatis.domain.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICourseMapper {
    public void save(Course course);
    public void delete(String cno);
    public void updateName(@Param("cno") String cno, @Param("cname") String cname);
    public List<Course> findAllByCPno(String cpno);
}
