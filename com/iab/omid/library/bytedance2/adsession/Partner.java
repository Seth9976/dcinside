package com.iab.omid.library.bytedance2.adsession;

import com.iab.omid.library.bytedance2.utils.g;

public class Partner {
    private final String name;
    private final String version;

    private Partner(String s, String s1) {
        this.name = s;
        this.version = s1;
    }

    public static Partner createPartner(String s, String s1) {
        g.a(s, "Name is null or empty");
        g.a(s1, "Version is null or empty");
        return new Partner(s, s1);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}

