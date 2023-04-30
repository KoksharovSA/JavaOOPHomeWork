package org.example.ControlWork.Model;

public abstract class Toy {
    private int idToy;
    private String name;
    private int toyDropRate;

    public Toy() {
        this.idToy = 0;
        this.name = "Нет игрушки";
        this.toyDropRate = 0;
    }

    private float toyDropPercentageOfTotal = 0;

    private float maxOfDistributionScale = 0;

    public float getMaxOfDistributionScale() {
        return maxOfDistributionScale;
    }

    public void setMaxOfDistributionScale(float maxOfDistributionScale) {
        this.maxOfDistributionScale = maxOfDistributionScale;
    }
    public float getToyDropPercentageOfTotal() {
        return toyDropPercentageOfTotal;
    }

    public void setToyDropPercentageOfTotal(float toyDropPercentageOfTotal) {
        this.toyDropPercentageOfTotal = toyDropPercentageOfTotal;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "idToy=" + idToy +
                ", name='" + name + '\'' +
                ", toyDropRate=" + toyDropRate +
                ", toyDropPercentageOfTotal=" + toyDropPercentageOfTotal +
                ", maxOfDistributionScale=" + maxOfDistributionScale +
                '}';
    }

    public int getIdToy() {
        return idToy;
    }

    public void setIdToy(int idToy) {
        this.idToy = idToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getToyDropRate() {
        return toyDropRate;
    }

    public void setToyDropRate(int toyDropRate) {
        if (toyDropRate > 10) {
            this.toyDropRate = 10;
        } else if (toyDropRate < 1) {
            this.toyDropRate = 1;
        } else {
            this.toyDropRate = toyDropRate;
        }
    }

    public Toy(int id, String name, int toyDropRate) {
        this.idToy = id;
        this.name = name;
        this.toyDropRate = toyDropRate;
    }
}
