package com.facebook.imagepipeline.animated.base;

import java.util.List;
import k1.n.a;
import k1.n;

@n(a.a)
public class h {
    private final e a;
    @o3.h
    private com.facebook.common.references.a b;
    @o3.h
    private List c;
    private int d;
    @o3.h
    private h1.a e;
    @o3.h
    private String f;

    h(e e0) {
        this.a = e0;
    }

    public g a() {
        try {
            return new g(this);
        }
        finally {
            com.facebook.common.references.a.j(this.b);
            this.b = null;
            com.facebook.common.references.a.k(this.c);
            this.c = null;
        }
    }

    @o3.h
    public h1.a b() {
        return this.e;
    }

    @o3.h
    public List c() {
        return com.facebook.common.references.a.f(this.c);
    }

    public int d() {
        return this.d;
    }

    public e e() {
        return this.a;
    }

    @o3.h
    public com.facebook.common.references.a f() {
        return com.facebook.common.references.a.e(this.b);
    }

    @o3.h
    public String g() {
        return this.f;
    }

    public h h(@o3.h h1.a a0) {
        this.e = a0;
        return this;
    }

    public h i(@o3.h List list0) {
        this.c = com.facebook.common.references.a.f(list0);
        return this;
    }

    public h j(int v) {
        this.d = v;
        return this;
    }

    public h k(@o3.h com.facebook.common.references.a a0) {
        this.b = com.facebook.common.references.a.e(a0);
        return this;
    }

    public h l(@o3.h String s) {
        this.f = s;
        return this;
    }
}

