package com.company;

public class User implements IObserver{
    String message;
    chatRoom room;
    public User(chatRoom room) {
        this.room = room;
    }
    public void display() {
        System.out.println(message);
    }

    @Override
    public void Update() {
        message = this.room.getMessage();
    }
    public void setMessage(String message) {
        this.room.setMessage(message);
    }
}
