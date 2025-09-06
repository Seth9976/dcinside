package com.igaworks.ssp;

public enum k {
    DEFAULT(0),
    FAN(650),
    VUNGLE(651),
    TAPJOY(653),
    MINTEGRAL(654),
    PANGLE(0x28F);

    private int a;

    private k(int v1) {
        this.a = v1;
    }

    private static k[] a() [...] // Inlined contents

    public int b() {
        return this.a;
    }
}

