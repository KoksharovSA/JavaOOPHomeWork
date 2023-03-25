package org.example.HW5.Controller;

import org.example.HW5.Model.*;
import org.example.HW5.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {
        ls = new ArrayList<>();
    }
    User teatcher;
    List<User> ls;

    public void setTeatcher(User teatcher) {
        this.teatcher = teatcher;
    }

    public void setLs(List<User> ls) {
        this.ls = ls;
    }
    public Group AgregateGroup() {
        GroupService groupService = new StudyGroupService();
        Group studyGroup = groupService.CreateStudyGroup(teatcher, ls);
        return studyGroup;
    }
}
