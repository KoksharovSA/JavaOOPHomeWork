package org.example.FinalProject.Controller;

import org.example.FinalProject.Log.LogComplexOperation;
import org.example.FinalProject.Model.*;
import org.example.FinalProject.View.ViewConsole;
import org.example.FinalProject.View.ViewInterface;

public class Controller {
    public static void Calculate(String data1_1, String data1_2, String data2_1, String data2_2, String operation) {

        double dat1_1 = Double.parseDouble(data1_1);
        double dat1_2 = Double.parseDouble(data1_2.substring(0, data1_2.length() - 1));
        double dat2_1 = Double.parseDouble(data2_1);
        double dat2_2 = Double.parseDouble(data2_2.substring(0, data2_2.length() - 1));

        Complex num1 = new Complex(dat1_1, dat1_2);
        Complex num2 = new Complex(dat2_1, dat2_2);

        Complex result;

        ServiceInterface oper;

        switch (operation) {
            case ("+"):
                oper = new SummationService();
                break;
            case ("-"):
                oper = new SubstractionService();
                break;
            case ("*"):
                oper = new MultiplicationService();
                break;
            case ("/"):
                if (((num2.getReal() * num2.getReal()) + (num2.getImage() * num2.getImage())) != 0) {
                    oper = new DivisionService();
                } else {
                    oper = null;
                    System.out.println("На ноль делить нельзя!");
                }
                break;
            default:
                oper = null;
        }
        if (oper != null) {
            result = LogComplexOperation.Logging(oper, num1, num2, operation);
            ViewInterface view = new ViewConsole();
            view.output(result);
        }
    }
}
