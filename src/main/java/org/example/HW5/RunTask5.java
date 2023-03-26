package org.example.HW5;

import org.example.HW5.Controller.Controller;
import org.example.HW5.Model.*;
import org.example.HW5.View.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RunTask5 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userList.add(new Student(new Date(), "StdFIO", new Random().nextInt(1,100)));
        }
        User teatcher = new Teatcher(new Date(), "TeatchFIO", new Random().nextInt(1,100));
        Controller cont = new Controller();
        View view = new View();
        view.Show(view.UserView(cont.readDataStudyGroup(teatcher, userList)));
    }
}
