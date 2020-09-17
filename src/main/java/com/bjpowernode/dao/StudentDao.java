package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudent();
    Integer insertStudent(Student stu);
}
