package dao;

import com.nanfeng.pojo.IClass;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ClassMapper {

    @Select("select * from c_class where id=#{id}")
    @Results({@Result(id = true,property = "id",column = "id"),
    @Result(property = "classname",column = "classname"),
    @Result(property = "students",column = "id",many = @Many(select = "dao.StudentMapper.findStudentByCid"))})
    IClass findStudentByCid(int id);
}
