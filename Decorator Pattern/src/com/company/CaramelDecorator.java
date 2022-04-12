package com.company;

public class CaramelDecorator extends Condiments{
    Baverage baverage;

    public CaramelDecorator(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public String getDescription() {
        return this.baverage.getDescription() + ", " + "Caramel";
    }

    @Override
    public double getCost() {
        return this.baverage.getCost() + 3;
    }
}
