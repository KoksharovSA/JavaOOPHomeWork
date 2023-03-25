package org.example.HW6;

import org.example.HW6.Impl.Agregator;

public class App {
    public static void main(String[] args) {
        Agregator agregator = new Agregator().GenerateBook();
        System.out.println(agregator.toString());
    }
}
