package com.bumptech.glide;

public enum h {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);

    private final float a;

    private h(float f) {
        this.a = f;
    }

    private static h[] a() [...] // Inlined contents

    public float b() {
        return this.a;
    }
}

