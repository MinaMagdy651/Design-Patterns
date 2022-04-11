package com.company;

public class Main {

    public static void main(String[] args) {
	    chatRoom room = new chatRoom();
        User user1 = new User(room);
        User user2 = new User(room);
        room.Add(user1);
        room.Add(user2);
        user1.setMessage("not default");
        user2.display();
    }
}
