package com.company;

public class Adapter implements IAdaptee, IDuck, ITurkey {
    private IAdaptee adaptee;

    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void getStatus() {
        adaptee.getStatus();
    }
}
