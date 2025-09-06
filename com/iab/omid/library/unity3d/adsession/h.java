package com.iab.omid.library.unity3d.adsession;

public enum h {
    GENERIC("generic"),
    VIDEO("video");

    private final String a;

    private h(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

