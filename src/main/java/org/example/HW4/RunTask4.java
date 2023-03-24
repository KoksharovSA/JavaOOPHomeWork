package org.example.HW4;

import java.util.ArrayList;
import java.util.Arrays;

public class RunTask4 {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber<>(1,7,6,9,2);
        BoxWithNumber<Double> box2 = new BoxWithNumber<>(1.0,7.0,6.0,9.0,2.0);
        System.out.println(box1.average());
        System.out.println(box1.average());
        System.out.println(box1.compareAverage(box2));

        Calculator<Integer> calc = new Calculator<>();
        System.out.println(calc.sum(new ArrayList<>(Arrays.asList(1,2,3,4,6))));
        System.out.println(calc.mult(new ArrayList<>(Arrays.asList(1,2,3,4,6))));
        System.out.println(calc.div(new ArrayList<>(Arrays.asList(1,2,3,4,6))));
        System.out.println(calc.binary(444));
        System.out.println(calc.binary("444.0"));
    }
}
