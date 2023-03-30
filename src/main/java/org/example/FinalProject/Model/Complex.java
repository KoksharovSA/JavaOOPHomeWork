package org.example.FinalProject.Model;

public class Complex {
    private double real;
    private double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        if (this.getImage() > 0) {
            return (this.getReal() + " + " + this.getImage() + "i");
        } else if (this.getImage() < 0) {
            return (this.getReal() + "" + this.getImage() + "i");
        } else {
            return ("" + this.getReal());
        }
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

}
