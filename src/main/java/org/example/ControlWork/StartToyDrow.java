package org.example.ControlWork;

import org.example.ControlWork.Controller.Draws;
import org.example.ControlWork.Controller.FillData;
import org.example.ControlWork.Controller.Roulette;
import org.example.ControlWork.Model.ToyMarket;

public class StartToyDrow {
    public static void main(String[] args) {
        ToyMarket market = new ToyMarket();
        market.setToys(FillData.Fill("/home/KSA/GB/JAVA_OOP/HW/src/main/java/org/example/ControlWork/Data/dbToys.csv"));
        System.out.println(market.toString());
        Draws newDrawsRoulette = new Roulette();
        for (int i = 0; i < 10; i++) {
            String output = newDrawsRoulette.RunDraw(market.getToys()).toString();
            System.out.println(newDrawsRoulette.getLastTry() + " => " + output);
        }
    }
}
