package com.company;

import java.security.PublicKey;
import java.util.ArrayList;

public class chatRoom implements IObservable {
    ArrayList<IObserver> observers = new ArrayList<>();
    String message;
    @Override
    public void Add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void Remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void Notify() {
        for(IObserver observer : observers) {
            observer.Update();
        }
    }
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
        Notify();
    }
}
