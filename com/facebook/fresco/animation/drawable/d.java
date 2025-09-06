package com.facebook.fresco.animation.drawable;

import M0.b;
import android.os.SystemClock;
import kotlin.jvm.internal.L;
import y4.l;

public final class d {
    @l
    private final b a;
    private boolean b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private int j;
    private int k;
    private int l;

    public d(@l b b0) {
        L.p(b0, "frameScheduler");
        super();
        this.a = b0;
        this.c = 8L;
        this.j = -1;
        this.k = -1;
    }

    public final int a() {
        long v = this.i();
        long v1 = this.b ? v - this.f + this.d : Math.max(this.h, 0L);
        int v2 = this.a.f(v1, this.h);
        this.h = v1;
        return v2;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final int d() {
        return this.j;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.a.g();
    }

    public final long g() {
        return this.a.c();
    }

    public final long h() {
        if(!this.b) {
            return -1L;
        }
        long v = this.i();
        long v1 = this.a.e(v - this.f);
        if(v1 != -1L) {
            long v2 = v1 + this.c;
            this.g = this.f + v2;
            return v2;
        }
        this.b = false;
        return -1L;
    }

    private final long i() {
        return SystemClock.uptimeMillis();
    }

    public final void j() {
        ++this.l;
    }

    public final void k(long v) {
        this.c = v;
    }

    public final void l(long v) {
        this.d = v;
    }

    public final void m(int v) {
        this.j = v;
    }

    public final void n(boolean z) {
        this.b = z;
    }

    public final boolean o() {
        return this.j != -1 && this.i() >= this.g;
    }

    public final void p() {
        if(!this.b) {
            long v = this.i();
            long v1 = v - this.e;
            this.f = v1;
            this.g = v1;
            this.h = v - this.i;
            this.j = this.k;
            this.b = true;
        }
    }

    public final void q() {
        if(this.b) {
            long v = this.i();
            this.e = v - this.f;
            this.i = v - this.h;
            this.f = 0L;
            this.g = 0L;
            this.h = -1L;
            this.j = -1;
            this.b = false;
        }
    }
}

