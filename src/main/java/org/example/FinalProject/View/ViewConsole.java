package org.example.FinalProject.View;

import org.example.FinalProject.Model.Complex;

public class ViewConsole implements ViewInterface {
    @Override
    public void output(Complex num) {
        System.out.println(num.toString());
    }
}
