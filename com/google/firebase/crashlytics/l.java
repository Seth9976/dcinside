package com.google.firebase.crashlytics;

import kotlin.jvm.internal.L;

public final class l {
    @y4.l
    private final j a;

    public l(@y4.l j j0) {
        L.p(j0, "crashlytics");
        super();
        this.a = j0;
    }

    public final void a(@y4.l String s, double f) {
        L.p(s, "key");
        this.a.n(s, f);
    }

    public final void b(@y4.l String s, float f) {
        L.p(s, "key");
        this.a.o(s, f);
    }

    public final void c(@y4.l String s, int v) {
        L.p(s, "key");
        this.a.p(s, v);
    }

    public final void d(@y4.l String s, long v) {
        L.p(s, "key");
        this.a.q(s, v);
    }

    public final void e(@y4.l String s, @y4.l String s1) {
        L.p(s, "key");
        L.p(s1, "value");
        this.a.r(s, s1);
    }

    public final void f(@y4.l String s, boolean z) {
        L.p(s, "key");
        this.a.s(s, z);
    }
}

