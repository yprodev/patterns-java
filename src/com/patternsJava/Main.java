package com.patternsJava;

import com.patternsJava.Proxy.Ebook;
import com.patternsJava.Proxy.Library;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName : fileNames)
            library.add(new Ebook(fileName));

        library.openEbook("a  o");
    }
}
