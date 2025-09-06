package com.dcinside.app.totalsearch.gallery;

import java.util.List;
import kotlin.jvm.internal.w;
import y4.m;

public final class y {
    private final int a;
    @m
    private final CharSequence b;
    private final int c;
    @m
    private final List d;
    private final boolean e;
    private final boolean f;

    public y(int v, @m CharSequence charSequence0, int v1, @m List list0, boolean z, boolean z1) {
        this.a = v;
        this.b = charSequence0;
        this.c = v1;
        this.d = list0;
        this.e = z;
        this.f = z1;
    }

    public y(int v, CharSequence charSequence0, int v1, List list0, boolean z, boolean z1, int v2, w w0) {
        this(v, charSequence0, v1, list0, ((v2 & 16) == 0 ? z : false), ((v2 & 0x20) == 0 ? z1 : false));
    }

    @m
    public final List a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    @m
    public final CharSequence d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final boolean f() {
        return this.f;
    }
}

