package org.example.HW5.Controller;

import org.example.HW5.Model.*;
import org.example.HW5.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public StudyGroup readDataStudyGroup(User headGroup, List<User> sudents){
        StudyGroupService studyGroupService = new StudyGroupService();
        StudyGroup studyGroup = studyGroupService.CreateStudyGroup(headGroup, sudents);
        return studyGroup;
    }
}
