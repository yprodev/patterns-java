package com.patternsJava.Bridge;

public class SonyRemoteControl extends RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Sony turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony turn off");
    }
}
