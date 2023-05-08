package org.example.ControlWork.Controller;

import org.example.ControlWork.Model.Toy;

import java.util.List;
import java.util.Random;

public class Roulette implements Draws {
    private float lastTry = 0;

    @Override
    public float getLastTry() {
        return lastTry;
    }

    public Roulette() {
        Random rand = new Random();
        this.lastTry = rand.nextFloat(1, 100);
    }

    @Override
    public Toy RunDraw(List<Toy> toys) {
        Toy present = null;
        for (Toy item : toys) {
            if (lastTry <= item.getMaxOfDistributionScale()
                    && lastTry > (item.getMaxOfDistributionScale() - item.getToyDropPercentageOfTotal())) {
                present = item;
                new WorkingWithData().RemoveToy(item.getIdToy());
                new WorkingWithData().WriteData(Settings.dirLog, item.toString());
            }
        }
        return present;
    }
}
