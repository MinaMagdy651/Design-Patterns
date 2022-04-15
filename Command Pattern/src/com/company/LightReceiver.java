package com.company;

public class LightReceiver {
    private boolean status;
    public void On() {
        System.out.println("On");
        status = true;
    }

    public void Off() {
        System.out.println("Off");
        status = false;
    }
    public boolean getStatus() {
        return status;
    }

}
