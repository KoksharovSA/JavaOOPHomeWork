package org.example.HW5.Model;

import org.example.HW5.View.View;

import java.util.List;

public class StudyGroupService implements GroupServiceInteiface {
    @Override
    public StudyGroup CreateStudyGroup(User teatcher, List<User> studentList) {
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.setHeadGroup(teatcher);
        studyGroup.setGroup(studentList);
        return studyGroup;
    }
}
