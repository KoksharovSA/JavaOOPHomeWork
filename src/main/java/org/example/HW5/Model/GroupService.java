package org.example.HW5.Model;

import java.util.List;

public interface GroupService {
    StudyGroup CreateStudyGroup (User teatcher, List<User> studentList);
}
