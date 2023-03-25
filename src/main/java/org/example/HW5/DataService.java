package org.example.HW5;

import java.util.List;

public interface DataService {
    User create(Student student);
    User create(Teatcher teatcher);
    List<User> read(List<User> userList);

}
