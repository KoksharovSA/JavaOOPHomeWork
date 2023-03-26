package org.example.HW5.Model;

import java.util.Date;
import java.util.List;

public class Student extends User{
    private int groupId;
    private List<Integer> grade;

    @Override
    public String toString() {
        return "Student: " +
                "groupId=" + groupId +
                ", dateBrith=" + dateBrith +
                ", fio='" + fio + '\'' +
                ", id=" + id + "\n";
    }

    public Student() {
    }

    public Student(Date dateBrith, String fio, int id) {
        super(dateBrith, fio, id);
    }
}
