package org.example.calculator;

public class Log implements Logger {

    public Log() {
    }

    @Override
    public void loggerOut(String message) {
        System.out.println("log: " + message);
    }
}
