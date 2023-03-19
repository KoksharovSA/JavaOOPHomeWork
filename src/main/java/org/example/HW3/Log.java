package org.example.HW3;

import org.example.HW3.Impl.Logger;

import java.util.ArrayList;
import java.util.List;

public class Log implements Logger {
    private List<String> logs;

    public Log() {
        logs = new ArrayList<String>();
    }

    @Override
    public void AddLog(String text) {
        logs.add(text);
    }

    @Override
    public List<String> GetLogs() {
        return this.logs;
    }

    @Override
    public StringBuilder ShowLogs() {
        StringBuilder result = new StringBuilder();
        for (String log: GetLogs()) {
            result.append(log + "\n");
        }
        return result;
    }
}
