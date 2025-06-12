package com.doctolib.adifazio.jspecify.nullaway;

import com.doctolib.adifazio.jspecify.nullaway.impl.DefaultTokenExtractor;

public class App {
    public static void main(String[] args) {
        var extractor = new DefaultTokenExtractor();
        var token = extractor.extractToken(null); // <-- warning from Jspecify
        System.out.printf("Extracted token: %s with length %d%n", token, token.length());
    }
}
