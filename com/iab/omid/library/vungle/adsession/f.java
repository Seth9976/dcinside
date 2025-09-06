package com.iab.omid.library.vungle.adsession;

public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private final String a;

    private f(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

