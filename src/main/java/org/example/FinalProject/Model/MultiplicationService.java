package org.example.FinalProject.Model;

public class MultiplicationService implements ServiceInterface{
    @Override
    public Complex Operation(Complex num1, Complex num2) {
        Complex result = new Complex(
                (num1.getReal() * num2.getReal()) - (num1.getImage() * num2.getImage()),
                (num1.getImage() * num2.getReal()) + (num1.getReal() * num2.getImage()));
        return result;
    }
}
