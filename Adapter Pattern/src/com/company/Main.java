package com.company;

public class Main {

    public static void main(String[] args) {
        IDuck duck_turkey = new Adapter(new WildTurkey());
        duck_turkey.getStatus();
        ITurkey turkey_duck = new Adapter(new MallardDuck());
        turkey_duck.getStatus();
    }
}
