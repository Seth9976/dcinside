package com.iab.omid.library.bytedance2.adsession;

public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    private Owner(String s1) {
        this.owner = s1;
    }

    @Override
    public String toString() {
        return this.owner;
    }
}

