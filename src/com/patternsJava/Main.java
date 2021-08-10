package com.patternsJava;

import com.patternsJava.Proxy.EbookProxy;
import com.patternsJava.Proxy.Library;
import com.patternsJava.Proxy.LoggingEbookProxy;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName : fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
    }
}
