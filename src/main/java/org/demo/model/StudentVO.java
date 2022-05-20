package org.demo.model;

import java.util.Objects;

public class StudentVO {
    private String name;
    private int rollNo;

    public StudentVO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentVO studentVO = (StudentVO) o;
        return rollNo == studentVO.rollNo && Objects.equals(name, studentVO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
