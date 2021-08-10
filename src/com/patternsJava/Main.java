package com.patternsJava;

import com.patternsJava.Bridge.AdvancedRemoteControl;
import com.patternsJava.Bridge.RemoteControl;
import com.patternsJava.Bridge.SamsungTV;
import com.patternsJava.Bridge.SonyTV;
import com.patternsJava.Flyweight.PointIconFactory;
import com.patternsJava.Flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();

        var advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.turnOn();

        var remoteControlSamsung = new RemoteControl(new SamsungTV());
        remoteControlSamsung.turnOn();

        var advancedRemoteControlSamsung = new AdvancedRemoteControl(new SamsungTV());
        advancedRemoteControlSamsung.turnOn();
    }
}
