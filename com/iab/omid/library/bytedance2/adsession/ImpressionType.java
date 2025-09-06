package com.iab.omid.library.bytedance2.adsession;

public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String impressionType;

    private ImpressionType(String s1) {
        this.impressionType = s1;
    }

    @Override
    public String toString() {
        return this.impressionType;
    }
}

