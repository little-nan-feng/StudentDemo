package com.nanfeng.pojo;

import com.nanfeng.MyBatisUtils;
import dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    SqlSession sqlSession=null;
    StudentMapper studentMapper=null;
    @Before
    public void before(){

        sqlSession= MyBatisUtils.getSession();
        studentMapper=sqlSession.getMapper(StudentMapper.class);
    }

    @Test
    public void test(){

/*        //注解-根据ID查询学生
        System.out.println(studentMapper.findStudentById(1));
        */

        //注解-更新学生信息
        Student student=new Student();
        student.setId(1);
        student.setName("钱其");
        student.setAge(16);
        studentMapper.UpdateStudent(student);
    }

    @After
    public void after(){
        sqlSession.close();
    }

}