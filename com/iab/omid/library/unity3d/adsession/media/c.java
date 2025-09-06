package com.iab.omid.library.unity3d.adsession.media;

public enum c {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    private final String a;

    private c(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

