package org.example.HW5.Model;

import java.util.List;

public class StudyGroupService implements GroupService {
    @Override
    public StudyGroup CreateStudyGroup(User teatcher, List<User> studentList) {
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.headGroup = teatcher;
        studyGroup.group = studentList;
        return studyGroup;
    }
}
