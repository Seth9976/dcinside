package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.g;

public class m {
    private final String a;
    private final String b;

    private m(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static m a(String s, String s1) {
        g.f(s, "Name is null or empty");
        g.f(s1, "Version is null or empty");
        return new m(s, s1);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}

