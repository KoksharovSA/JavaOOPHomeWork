package org.example.HW5;

import java.util.List;

public class UserService implements DataService{

    @Override
    public User create(Student student) {
        return new Student();
    }

    @Override
    public User create(Teatcher teatcher) {
        return new Teatcher();
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
