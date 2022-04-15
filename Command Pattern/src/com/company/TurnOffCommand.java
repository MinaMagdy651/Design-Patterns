package com.company;

public class TurnOffCommand implements  ICommand{
    LightReceiver lr;
    public  TurnOffCommand(LightReceiver lr) {
        this.lr = lr;
    }
    @Override
    public void Execute() {
        this.lr.Off();
    }

    @Override
    public void unExecute() {
        this.lr.On();
    }
}
