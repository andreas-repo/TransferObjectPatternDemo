package org.demo.model;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    private List<StudentVO> students;

    public StudentBO() {
        this.students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John",1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    //retrieve list of students from the "database"
    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNO) {
        return students.get(rollNO);
    }

    public void updateStudent(StudentVO studentVO) {
        students.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("Student: Roll No " + studentVO.getRollNo() +", updated in the database");
    }
}
