package com.dcinside.app.gallery;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.w;
import y4.m;

public final class b {
    @c("category_no")
    private final int a;
    @c("category_name")
    @h3.c
    @m
    private final String b;

    public b() {
        this(0, null, 3, null);
    }

    public b(int v, @m String s) {
        this.a = v;
        this.b = s;
    }

    public b(int v, String s, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        this(v, s);
    }

    public final int a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }
}

