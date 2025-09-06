package com.iab.omid.library.bytedance2.adsession.media;

public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    private final String position;

    private Position(String s1) {
        this.position = s1;
    }

    @Override
    public String toString() {
        return this.position;
    }
}

