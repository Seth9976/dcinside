package com.iab.omid.library.vungle.adsession;

public enum m {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String a;

    private m(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

