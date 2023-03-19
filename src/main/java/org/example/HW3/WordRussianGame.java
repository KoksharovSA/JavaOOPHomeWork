package org.example.HW3;

import org.example.HW3.Impl.AbstractGame;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        String latAlf = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (char sym: latAlf.toCharArray()) {
            charList.add("" + sym);
        }
        return charList;
    }
}
