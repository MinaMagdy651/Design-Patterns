package com.company;

public class Main {

    public static void main(String[] args) {
        Factory factory = new NYPizzaFactory();
        Pizza pizza = factory.OrderPizza();
        System.out.println(pizza.getType());

        factory = new CHPizzaFactory();
        pizza = factory.OrderPizza();
        System.out.println(pizza.getType());
    }
}
