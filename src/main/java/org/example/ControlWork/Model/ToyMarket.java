package org.example.ControlWork.Model;

import java.util.ArrayList;
import java.util.List;

public class ToyMarket {
    private List<Toy> toys;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Игрушки в розыгрыше:");
        for (Toy item: this.toys) {
            result.append("\n" + item.toString());
        }
        return result.toString();
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
        float sumDropRate = 0;
        float distributionScale = 0;
        for (Toy item: toys) {
            sumDropRate += (float)item.getToyDropRate();
        }
        for (int i = 0; i < toys.size(); i++) {
            float temp = (float) ((float)this.toys.get(i).getToyDropRate() * (100.0 / sumDropRate));
            this.toys.get(i).setToyDropPercentageOfTotal(temp);
            distributionScale += this.toys.get(i).getToyDropPercentageOfTotal();
            this.toys.get(i).setMaxOfDistributionScale(distributionScale);
        }
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
        float sumDropRate = 0;
        for (Toy item: toys) {
            sumDropRate += (float)item.getToyDropRate();
        }
        for (int i = 0; i < toys.size(); i++) {
            float temp = (float) ((float)this.toys.get(i).getToyDropRate() * (100.0 / sumDropRate));
            this.toys.get(i).setToyDropPercentageOfTotal(temp);
        }
    }

    public ToyMarket() {
        toys = new ArrayList<>();
    }
}
