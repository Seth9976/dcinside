package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.w;
import y4.m;

public final class f {
    @m
    private final String a;
    @m
    private final String b;
    private final int c;
    private final int d;

    public f(@m String s, @m String s1, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
    }

    public f(String s, String s1, int v, int v1, int v2, w w0) {
        if((v2 & 8) != 0) {
            v1 = -1;
        }
        this(s, s1, v, v1);
    }

    public final int a() {
        return this.d;
    }

    @m
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    @m
    public final String d() {
        return this.a;
    }
}

