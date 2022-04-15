package com.company;

public class TurnOnCommand implements  ICommand{
    LightReceiver lr;
    public  TurnOnCommand(LightReceiver lr) {
        this.lr = lr;
    }
    @Override
    public void Execute() {
        this.lr.On();
    }

    @Override
    public void unExecute() {
        this.lr.Off();
    }
}
