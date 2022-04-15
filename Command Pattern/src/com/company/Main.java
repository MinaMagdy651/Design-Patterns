package com.company;

public class Main {

    public static void main(String[] args) {
        //command pattern is used for Undo
        LightReceiver lighBulb = new LightReceiver();
        Invoker invoker1 = new Invoker(new TurnOnCommand(lighBulb));
        invoker1.Do();
        System.out.println(lighBulb.getStatus());
        invoker1.unDo();
        System.out.println(lighBulb.getStatus());

    }
}
