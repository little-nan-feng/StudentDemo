package dao;

import com.nanfeng.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {

    @Select("select * from s_student where id=#{id}")
    Student findStudentById(int id);

    @Select("select * from s_student where cid=#{cid}")
    List<Student> findStudentByCid(int cid);

    @Update("update s_student set name=#{name},age=#{age} where id=#{id}")
    int UpdateStudent(Student student);
}
