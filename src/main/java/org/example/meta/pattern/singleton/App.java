package org.example.meta.pattern.singleton;

public class App {
    public static void main(String[] args) {
        DoorMan doorMan = DoorMan.getInstance();
        doorMan.쫒아내(new Cat());
    }
}