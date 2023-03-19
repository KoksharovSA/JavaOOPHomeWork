package org.example.HW3;

import org.example.HW3.Impl.AbstractGame;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
