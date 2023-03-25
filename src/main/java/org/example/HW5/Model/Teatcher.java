package org.example.HW5.Model;

import java.util.Date;
import java.util.List;

public class Teatcher extends User {
    int exp;
    List<Integer> group;

    @Override
    public String toString() {
        return "Teatcher: " +
                "exp=" + exp +
                ", dateBrith=" + dateBrith +
                ", fio='" + fio + '\'' +
                ", id=" + id + "\n";
    }

    public Teatcher() {
    }

    public Teatcher(Date dateBrith, String fio, int id) {
        super(dateBrith, fio, id);
    }
}
