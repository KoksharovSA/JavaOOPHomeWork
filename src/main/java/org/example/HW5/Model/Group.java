package org.example.HW5.Model;

import java.util.List;

public abstract class Group {
    private User headGroup;
    private List<User> group;

    public Group() {
    }

    public Group(User headGroup, List<User> group) {
        this.headGroup = headGroup;
        this.group = group;
    }

    public User getHeadGroup() {
        return headGroup;
    }

    public void setHeadGroup(User headGroup) {
        this.headGroup = headGroup;
    }

    public List<User> getGroup() {
        return group;
    }

    public void setGroup(List<User> group) {
        this.group = group;
    }
}
