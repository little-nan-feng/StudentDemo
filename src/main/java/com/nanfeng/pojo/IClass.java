package com.nanfeng.pojo;

import java.util.List;

public class IClass {

    private int id;
    private String classname;
    private List<Student> students;

    @Override
    public String toString() {
        return "IClass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", students=" + students +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
