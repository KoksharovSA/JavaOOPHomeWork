package org.example.FinalProject.View;

import org.example.FinalProject.Model.Complex;

public class ViewConsole implements ViewInterface {
    @Override
    public void output(Complex num) {
        if (num.getImage() > 0) {
            System.out.println(num.getReal() + " + " + num.getImage() + "i");
        } else if (num.getImage() < 0) {
            System.out.println(num.getReal() + "" + num.getImage() + "i");
        } else {
            System.out.println(num.getReal());
        }
    }
}
