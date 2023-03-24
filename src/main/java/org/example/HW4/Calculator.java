package org.example.HW4;

import javax.swing.text.html.parser.Parser;
import java.util.List;

public class Calculator<T extends Number> {
    public Double sum (List<T> items){
        double sum = 0;
        for (T i: items){
            sum += i.doubleValue();
        }
        return sum;
    }
    public Double mult (List<T> items){
        double mult = 1;
        for (T i: items){
            mult *= i.doubleValue();
        }
        return mult;
    }
    public Double div (List<T> items){
        double div = 0.0;
        for (T i: items) {
            if (i.doubleValue() != 0.0) {
                if (div == 0.0) {
                    div = i.doubleValue();
                } else {
                    div /= i.doubleValue();
                }
            } else {
                System.out.println("На ноль делить нельзя");
                return 0.0;
            }
        }
        return div;
    }
    public String binary(Integer number) {
        return Integer.toBinaryString(number);
    }
    public String binary(String number) {
        if (isNumeric(number)){
            return Integer.toBinaryString((int)(Double.parseDouble(number)));
        } else {
            return number + "Не является числом.";
        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
