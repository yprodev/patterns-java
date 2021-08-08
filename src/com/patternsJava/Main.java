package com.patternsJava;

import com.patternsJava.Decorator.CloudStream;
import com.patternsJava.Decorator.CompressedCloudStream;
import com.patternsJava.Decorator.EncryptedCloudStream;
import com.patternsJava.Decorator.Stream;

public class Main {

    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
