package org.example.HW5.View;

import org.example.HW5.Model.Group;
import org.example.HW5.Model.User;

import java.util.List;

public class View implements ViewInterface{
    public StringBuilder UserView (Group group){
        StringBuilder result = new StringBuilder();
        result.append(group.getHeadGroup().toString());
        for (User us: group.getGroup()) {
            result.append(us.toString());
        }
        return result;
    }
    @Override
    public void Show (StringBuilder stringGroup){
        System.out.println(stringGroup);
    }
}
