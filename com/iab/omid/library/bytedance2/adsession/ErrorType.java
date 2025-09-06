package com.iab.omid.library.bytedance2.adsession;

public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video");

    private final String errorType;

    private ErrorType(String s1) {
        this.errorType = s1;
    }

    @Override
    public String toString() {
        return this.errorType;
    }
}

