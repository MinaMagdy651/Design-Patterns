package com.company;

public class Main {

    public static void main(String[] args) {
	    Operation operation1 = new Operation(new MultiplicationBehaviour());
        System.out.println(operation1.DoOperation(5, 6));

        Operation operation2 = new Operation(new AdditionBehaviour());
        System.out.println(operation2.DoOperation(5, 6));
    }
}
