package com.yp.mybatis.practise.test;

import com.yo.mybatis.common.util.LogUtil;
import com.yo.mybatis.common.util.MybatisUtil;
import com.yp.mybatis.domain.entity.Course;
import com.yp.mybatis.domain.entity.Student;
import com.yp.mybatis.practise.mapper.ICourseMapper;
import com.yp.mybatis.practise.mapper.IStudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestPractise {
    private static MybatisUtil mybatisUtil;
    public TestPractise(){
        mybatisUtil = new MybatisUtil("mybatis-configuration.xml");
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession = mybatisUtil.openSqlSession();

        IStudentMapper mapper = sqlSession.getMapper(IStudentMapper.class);

        List<String> mt = mapper.findAllSdept();
        LogUtil.INSTANCE.info(mt.getClass(), mt);
        List<Student> between = mapper.findByAgeBetween(20, 30);
        LogUtil.INSTANCE.info(TestPractise.class, between);
        int mt1 = mapper.countBySdept("MT");
        LogUtil.INSTANCE.info(TestPractise.class, mt1);
        List<Student> mt2 = mapper.findBySdept("MT");
        LogUtil.INSTANCE.info(TestPractise.class, mt2);
        Student maxAge = mapper.findMaxAge();
        LogUtil.INSTANCE.info(TestPractise.class, maxAge);
        List<Student> byLikeName = mapper.findByLikeName("张%");
        LogUtil.INSTANCE.info(TestPractise.class, byLikeName);


        /*
        ICourseMapper mapper = sqlSession.getMapper(ICourseMapper.class);
        //mapper.save(new Course("10", "数理逻辑", "6", 2));
        //mapper.delete("10");
        mapper.updateName("3", "信息处理");
        List<Course> allByCPno = mapper.findAllByCPno("6");
        System.out.println(allByCPno);


        sqlSession.commit();
        sqlSession.close();
         */




    }
}
