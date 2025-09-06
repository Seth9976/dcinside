package com.igaworks.ssp;

public enum j {
    DEFAULT(0),
    CUSTOM_SIZE(1);

    private int a;

    private j(int v1) {
        this.a = v1;
    }

    private static j[] a() [...] // Inlined contents

    public int b() {
        return this.a;
    }
}

