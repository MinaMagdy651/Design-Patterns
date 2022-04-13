package com.company;

public class CHPizzaFactory extends Factory{
    @Override
    public Pizza OrderPizza() {
        return new PepperoniPizza();
    }
}
