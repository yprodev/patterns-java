package com.patternsJava.Proxy;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
