package org.example.HW3.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.HW3.Answer;
import org.example.HW3.GameStatus;
import org.example.HW3.Log;

import java.security.SecureRandom;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {
    Integer sizeWord;
    String word;
    Integer maxTry;

    static int countTry;
    GameStatus gameStatus = GameStatus.INIT;
    Logger log;
    private String generateWord() {
        List<String> charList = generateCharList();
        SecureRandom random = new SecureRandom();
        String res = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomeIndex = random.nextInt(charList.size());
            res += charList.get(randomeIndex);
            charList.remove(randomeIndex);
        }
        log = new Log();
        log.AddLog("Загадали: " + res);
        return res;
    }

    public Logger getLogs() {
        return log;
    }

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.maxTry = maxTry;
        this.sizeWord = sizeWord;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputAnswer(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))) {
                cow++;
            }
            if (word.charAt(i) == value.charAt(i)) {
                bull++;
            }
        }
        countTry++;
        Answer answer = new Answer(cow, bull, value);
        gameStatus = checkState(value);
        log.AddLog(value);
        return answer;
    }

    private GameStatus checkState(String value) {
        if (value.equals(word)) {
            return gameStatus = GameStatus.WIN;
        } else {
            if (countTry >= maxTry) {
                return gameStatus = GameStatus.LOSE;
            } else {
                return gameStatus = GameStatus.START;
            }
        }

    }

    protected abstract List<String> generateCharList();
}

