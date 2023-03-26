package org.example.HW5.Controller;

import org.example.HW5.Model.*;
import org.example.HW5.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Group readDataStudyGroup(User headGroup, List<User> sudents){
        GroupServiceInteiface studyGroupService = new StudyGroupService();
        Group studyGroup = studyGroupService.CreateStudyGroup(headGroup, sudents);
        return studyGroup;
    }
}
