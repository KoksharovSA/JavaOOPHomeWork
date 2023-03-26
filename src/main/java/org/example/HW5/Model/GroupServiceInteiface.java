package org.example.HW5.Model;

import org.example.HW5.View.View;

import java.util.List;

public interface GroupServiceInteiface {
    Group CreateStudyGroup (User teatcher, List<User> studentList);
}
