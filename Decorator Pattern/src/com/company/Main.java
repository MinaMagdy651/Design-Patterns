package com.company;

public class Main {

    public static void main(String[] args) {
	    Baverage baverage = new Espresso();
        baverage = new CaramelDecorator(baverage);
        baverage = new SoyDecorator(baverage);
        System.out.println(baverage.getCost());
        System.out.println(baverage.getDescription());
    }
}
