package org.example.FinalProject.Log;

public class Log implements LogInterface{
    public Log() {
    }
    @Override
    public void loggerOut(StringBuilder message) {
        System.out.println(message);
    }
}
