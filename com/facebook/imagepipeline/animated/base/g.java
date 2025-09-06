package com.facebook.imagepipeline.animated.base;

import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class g {
    private final e a;
    private final int b;
    @h
    private String c;
    @h
    private com.facebook.common.references.a d;
    @h
    private List e;
    @h
    private h1.a f;

    private g(e e0) {
        this.a = (e)com.facebook.common.internal.n.i(e0);
        this.b = 0;
    }

    g(com.facebook.imagepipeline.animated.base.h h0) {
        this.a = (e)com.facebook.common.internal.n.i(h0.e());
        this.b = h0.d();
        this.d = h0.f();
        this.e = h0.c();
        this.f = h0.b();
        this.c = h0.g();
    }

    public void a() {
        synchronized(this) {
            com.facebook.common.references.a.j(this.d);
            this.d = null;
            com.facebook.common.references.a.k(this.e);
            this.e = null;
        }
    }

    public static g b(e e0) {
        return new g(e0);
    }

    @h
    public h1.a c() {
        return this.f;
    }

    @h
    public com.facebook.common.references.a d(int v) {
        synchronized(this) {
            List list0 = this.e;
            return list0 != null ? com.facebook.common.references.a.e(((com.facebook.common.references.a)list0.get(v))) : null;
        }
    }

    public int e() {
        return this.b;
    }

    public e f() {
        return this.a;
    }

    @h
    public com.facebook.common.references.a g() {
        synchronized(this) {
            return com.facebook.common.references.a.e(this.d);
        }
    }

    @h
    public String h() {
        return this.c;
    }

    public boolean i(int v) {
        synchronized(this) {
            return this.e != null && this.e.get(v) != null;
        }
    }

    public static com.facebook.imagepipeline.animated.base.h j(e e0) {
        return new com.facebook.imagepipeline.animated.base.h(e0);
    }
}

