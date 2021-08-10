package com.patternsJava;

import com.patternsJava.Facade.NotificationService;

public class Main {

    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}
