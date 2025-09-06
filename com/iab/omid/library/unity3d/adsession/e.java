package com.iab.omid.library.unity3d.adsession;

public enum e {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String a;

    private e(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

