package com.facebook.imagepipeline.image;

import androidx.annotation.NonNull;
import java.util.Map;
import k1.n.a;
import k1.n;

@n(a.a)
public class p implements o {
    private final int a;
    private final int b;
    private final int c;
    private final r d;
    private final Map e;

    public p(int v, int v1, int v2, r r0, Map map0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = r0;
        this.e = map0;
    }

    @Override  // com.facebook.imagepipeline.image.o
    public r I() {
        return this.d;
    }

    @Override  // com.facebook.imagepipeline.image.m
    @NonNull
    public Map getExtras() {
        return this.e;
    }

    @Override  // com.facebook.imagepipeline.image.o
    public int getHeight() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.image.o
    public int getWidth() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.image.o
    public int z() {
        return this.c;
    }
}

