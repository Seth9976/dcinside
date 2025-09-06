package org.jsoup;

import java.io.IOException;

public class e extends IOException {
    private final int a;
    private final String b;

    public e(String s, int v, String s1) {
        super(s + ". Status=" + v + ", URL=[" + s1 + "]");
        this.a = v;
        this.b = s1;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

