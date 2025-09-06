package com.iab.omid.library.unity3d.adsession;

public enum l {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String a;

    private l(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

