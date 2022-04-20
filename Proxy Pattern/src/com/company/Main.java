package com.company;

public class Main {

    public static void main(String[] args) {
	    Proxy proxy = new Proxy("Mina");
        System.out.println(proxy.getBook());
        System.out.println(proxy.getSize());
    }
}
