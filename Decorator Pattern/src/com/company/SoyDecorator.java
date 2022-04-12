package com.company;

public class SoyDecorator extends Condiments{
    Baverage baverage;

    public SoyDecorator(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public String getDescription() {
        return this.baverage.getDescription() + ", " + "Soy";
    }

    @Override
    public double getCost() {
        return this.baverage.getCost() + 4;
    }
}
