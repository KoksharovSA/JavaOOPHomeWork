package org.example.HW5.Model;

import java.util.List;


public class StudyGroup extends Group {
    private String numberStudyGroup;
    public StudyGroup() {
    }

    public void setNumberStudyGroup(String numberStudyGroup) {
        this.numberStudyGroup = numberStudyGroup;
    }

    public String getNumberStudyGroup() {
        return numberStudyGroup;
    }

    public StudyGroup(User headGroup, List<User> group, String numberStudyGroup) {
        super(headGroup, group);
        this.numberStudyGroup = numberStudyGroup;
    }
}
