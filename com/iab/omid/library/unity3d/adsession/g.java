package com.iab.omid.library.unity3d.adsession;

public enum g {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    private final String a;

    private g(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

