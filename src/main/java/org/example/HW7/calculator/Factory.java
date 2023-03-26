package org.example.calculator;

public class Factory implements ICalculableFactory{

    @Override
    public Calculable create(int primaryArg) {
//        new LogCal().loggerOut("" + primaryArg);
        return new LogCalculator(primaryArg, new Log());
    }

}
