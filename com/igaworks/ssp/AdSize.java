package com.igaworks.ssp;

public enum AdSize {
    BANNER_320x50(1),
    BANNER_300x250(2),
    BANNER_320x100(3),
    BANNER_ADAPTIVE_SIZE(4);

    private int a;

    private AdSize(int v1) {
        this.a = v1;
    }

    private static AdSize[] a() [...] // Inlined contents

    public int getValue() {
        return this.a;
    }
}

