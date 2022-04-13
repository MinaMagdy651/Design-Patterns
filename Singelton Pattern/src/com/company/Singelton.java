package com.company;

public class Singelton {
    private static Singelton instance;

    private Singelton() {
    }
    public static Singelton getInstance() {
        if(instance == null)
            return new Singelton();
        return instance;
    }
    public String test() {
        return "test";
    }
}
