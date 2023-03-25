package org.example.HW5;

import org.example.HW5.Controller.Controller;
import org.example.HW5.Model.Student;
import org.example.HW5.Model.Teatcher;
import org.example.HW5.Model.User;
import org.example.HW5.View.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userList.add(new Student(new Date(), "StdFIO", new Random().nextInt(1,100)));
        }
        User teatcher = new Teatcher(new Date(), "TeatchFIO", new Random().nextInt(1,100));
        Controller cont = new Controller();
        cont.setTeatcher(teatcher);
        cont.setLs(userList);
        View view = new View();
        System.out.println(view.UserView(cont.AgregateGroup()));
    }
}
