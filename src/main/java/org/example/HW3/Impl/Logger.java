package org.example.HW3.Impl;

import java.util.List;

public interface Logger {
    public void AddLog(String text);
    public List<String> GetLogs();
    public StringBuilder ShowLogs();
}
