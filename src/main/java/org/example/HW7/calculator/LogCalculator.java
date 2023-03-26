package org.example.calculator;

public class LogCalculator implements Calculable{


    private int primaryArg;
    private Log logger;

    public LogCalculator(int primaryArg, Log logger) {
        this.logger = logger;
        this.primaryArg = primaryArg;
        logger.loggerOut("" + primaryArg);
    }


    @Override
    public Calculable sum(int arg) {
        logger.loggerOut("" + arg);
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.loggerOut("" + arg);
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        logger.loggerOut("" + primaryArg);
        return primaryArg;
    }
}
