package org.example.ControlWork;

import org.example.ControlWork.Controller.Draws;
import org.example.ControlWork.Controller.Roulette;
import org.example.ControlWork.Controller.Settings;
import org.example.ControlWork.Controller.WorkingWithData;
import org.example.ControlWork.Model.ToyMarket;
import org.example.ControlWork.View.ViewMenu;

public class StartToyDrow {
    public static void main(String[] args) {
        ToyMarket market = new ToyMarket();
        market.setToys(new WorkingWithData()
                .Fill(Settings.dirDb));
//        System.out.println(market.toString());
//        Draws newDrawsRoulette = new Roulette();
//        for (int i = 0; i < 10; i++) {
//            String output = newDrawsRoulette.RunDraw(market.getToys()).toString();
//            System.out.println(newDrawsRoulette.getLastTry() + " => " + output);
//            new WorkingWithData()
//                    .WriteData(Settings.dirLog,
//                            output);
//        }
        ViewMenu menu = new ViewMenu();
        menu.RunMenu(market);
    }
}
