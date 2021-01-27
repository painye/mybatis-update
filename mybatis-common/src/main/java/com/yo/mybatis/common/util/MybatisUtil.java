package com.yo.mybatis.common.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;


/**
 * mybatis的封装
 */
public class MybatisUtil {
    private  static  MybatisUtil instance;
    private SqlSessionFactory sqlSessionFactory;


    public MybatisUtil(String fileName){
        init(fileName);
    }

    private void init(String fileName){
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build( Resources.getResourceAsReader(fileName));
        } catch (IOException e) {
            LogUtil.INSTANCE.debug(MybatisUtil.class, e);
        }
    }

    private synchronized static MybatisUtil  getInstance(String fileName){
        if(instance == null){
            instance = new MybatisUtil(fileName);
        }
        return instance;
    }

    public SqlSession openSqlSession(){
        LogUtil.INSTANCE.debug(MybatisUtil.class, "产生一个新的sqlSession");
        return sqlSessionFactory.openSession();
    }
}
