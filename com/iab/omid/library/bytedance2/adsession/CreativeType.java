package com.iab.omid.library.bytedance2.adsession;

public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private final String creativeType;

    private CreativeType(String s1) {
        this.creativeType = s1;
    }

    @Override
    public String toString() {
        return this.creativeType;
    }
}

