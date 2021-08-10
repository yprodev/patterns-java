package com.patternsJava;

import com.patternsJava.Facade.NotificationService;
import com.patternsJava.Flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var service = new PointService();
        for (var point : service.getPoints())
            point.draw();
    }
}
