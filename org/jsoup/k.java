package org.jsoup;

import java.io.IOException;

public class k extends IOException {
    private final String a;
    private final String b;

    public k(String s, String s1, String s2) {
        super(s);
        this.a = s1;
        this.b = s2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    @Override
    public String toString() {
        return super.toString() + ". Mimetype=" + this.a + ", URL=" + this.b;
    }
}

