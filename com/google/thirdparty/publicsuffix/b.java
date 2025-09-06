package com.google.thirdparty.publicsuffix;

import J1.a;
import J1.b;

@a
@b
public enum com.google.thirdparty.publicsuffix.b {
    PRIVATE(':', ','),
    REGISTRY('!', '?');

    private final char a;
    private final char b;

    private com.google.thirdparty.publicsuffix.b(char c, char c1) {
        this.a = c;
        this.b = c1;
    }

    private static com.google.thirdparty.publicsuffix.b[] a() [...] // Inlined contents

    static com.google.thirdparty.publicsuffix.b b(char c) {
        com.google.thirdparty.publicsuffix.b[] arr_b = com.google.thirdparty.publicsuffix.b.values();
        int v = 0;
        while(v < arr_b.length) {
            com.google.thirdparty.publicsuffix.b b0 = arr_b[v];
            if(b0.c() != c && b0.d() != c) {
                ++v;
                continue;
            }
            return b0;
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c);
    }

    char c() {
        return this.a;
    }

    char d() {
        return this.b;
    }
}

