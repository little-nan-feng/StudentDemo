package com.nanfeng.pojo;

import com.nanfeng.MyBatisUtils;
import dao.ClassMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class IClassTest {

    SqlSession sqlSession=null;
    ClassMapper classMapper=null;
    @Before
    public void before(){

        sqlSession= MyBatisUtils.getSession();
        classMapper=sqlSession.getMapper(ClassMapper.class);
    }

    @Test
    public void test(){

        //注解-根据id查询班级信息和所属学生信息
        System.out.println(classMapper.findStudentByCid(2));
    }

    @After
    public void after(){
        sqlSession.close();
    }

}