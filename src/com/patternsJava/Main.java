package com.patternsJava;

import com.patternsJava.Flyweight.PointIconFactory;
import com.patternsJava.Flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}
