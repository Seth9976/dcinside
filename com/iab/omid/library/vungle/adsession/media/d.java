package com.iab.omid.library.vungle.adsession.media;

public enum d {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    private final String a;

    private d(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

