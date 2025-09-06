package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.utils.g;

public class n {
    private final String a;
    private final String b;

    private n(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static n a(String s, String s1) {
        g.f(s, "Name is null or empty");
        g.f(s1, "Version is null or empty");
        return new n(s, s1);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}

