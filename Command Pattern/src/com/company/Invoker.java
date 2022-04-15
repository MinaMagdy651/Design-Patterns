package com.company;

public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }
    public void Do() {
        command.Execute();
    }
    public void unDo() {
        command.unExecute();
    }

}
