package com.iab.omid.library.bytedance2.adsession;

public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String typeString;

    private AdSessionContextType(String s1) {
        this.typeString = s1;
    }

    @Override
    public String toString() {
        return this.typeString;
    }
}

