package com.fasterxml.jackson.core;

public enum g {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 0x20),
    UTF32_LE("UTF-32LE", false, 0x20);

    private final String a;
    private final boolean b;
    private final int c;

    private g(String s1, boolean z, int v1) {
        this.a = s1;
        this.b = z;
        this.c = v1;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

