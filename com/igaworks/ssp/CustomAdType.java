package com.igaworks.ssp;

public enum CustomAdType {
    BANNER_320x50(1),
    BANNER_300x250(2),
    BANNER_320x100(3),
    INTERSTITIAL(4),
    NATIVE_AD(5);

    private int a;

    private CustomAdType(int v1) {
        this.a = v1;
    }

    private static CustomAdType[] a() [...] // Inlined contents

    public int getValue() {
        return this.a;
    }
}

