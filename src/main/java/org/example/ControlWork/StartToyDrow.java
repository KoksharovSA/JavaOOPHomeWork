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
        ViewMenu menu = new ViewMenu();
        menu.RunMenu(market);
    }
}
