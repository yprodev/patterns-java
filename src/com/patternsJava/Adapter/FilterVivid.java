package com.patternsJava.Adapter;

public class FilterVivid implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Apply Vivid Filter");
    }
}
