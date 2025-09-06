package com.iab.omid.library.vungle.adsession;

public enum j {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String a;

    private j(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

