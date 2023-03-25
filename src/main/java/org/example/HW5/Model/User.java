package org.example.HW5.Model;

import java.util.Date;

public abstract class User {
    Date dateBrith;
    String fio;
    int id;

    public User() {
    }

    public User(Date dateBrith, String fio, int id) {
        this.dateBrith = dateBrith;
        this.fio = fio;
        this.id = id;
    }
}
