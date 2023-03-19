package org.example.HW3.Impl;

import org.example.HW3.Answer;
import org.example.HW3.GameStatus;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();
    Logger getLogs();
}
