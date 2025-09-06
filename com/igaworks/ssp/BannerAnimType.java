package com.igaworks.ssp;

public enum BannerAnimType {
    NONE(0),
    FADE_IN(1),
    SLIDE_LEFT(2),
    SLIDE_RIGHT(3),
    TOP_SLIDE(4),
    BOTTOM_SLIDE(5),
    CIRCLE(6);

    private int a;

    private BannerAnimType(int v1) {
        this.a = v1;
    }

    private static BannerAnimType[] a() [...] // Inlined contents

    public int getValue() {
        return this.a;
    }
}

