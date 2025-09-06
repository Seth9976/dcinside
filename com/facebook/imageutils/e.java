package com.facebook.imageutils;

import android.graphics.ColorSpace;
import kotlin.V;
import y4.m;

public final class e {
    @m
    private final ColorSpace a;
    @m
    private final V b;

    public e(int v, int v1, @m ColorSpace colorSpace0) {
        this.a = colorSpace0;
        this.b = v == -1 || v1 == -1 ? null : new V(v, v1);
    }

    @m
    public final ColorSpace a() {
        return this.a;
    }

    @m
    public final V b() {
        return this.b;
    }
}

