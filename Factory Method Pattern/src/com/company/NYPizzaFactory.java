package com.company;

public class NYPizzaFactory  extends Factory{

    @Override
    public Pizza OrderPizza() {
        return  new CheesePizza();
    }
}
