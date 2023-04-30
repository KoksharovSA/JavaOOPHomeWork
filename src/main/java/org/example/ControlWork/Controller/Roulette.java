package org.example.ControlWork.Controller;

import org.example.ControlWork.Model.Toy;

import java.util.List;
import java.util.Random;

public class Roulette implements Draws{
    private float lastTry = 0;

    @Override
    public float getLastTry() {
        return lastTry;
    }

    public void setLastTry(float lastTry) {
        this.lastTry = lastTry;
    }
    @Override
    public Toy RunDraw(List<Toy> toys) {
        Toy present = null;
        Random rand = new Random();
        lastTry = rand.nextFloat(1,100);
        for (Toy item: toys) {
            if (lastTry <= item.getMaxOfDistributionScale()
                    && lastTry > (item.getMaxOfDistributionScale() - item.getToyDropPercentageOfTotal())) {
                present = item;
            }
        }
        return present;
    }
}
