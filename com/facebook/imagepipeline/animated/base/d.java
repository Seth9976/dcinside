package com.facebook.imagepipeline.animated.base;

import k1.n.a;
import k1.n;

@n(a.a)
public class d {
    private boolean a;
    private boolean b;
    private int c;
    private boolean d;

    public d() {
        this.b = true;
        this.c = -1;
    }

    public c a() {
        return new c(this);
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.a;
    }

    public int e() {
        return this.c;
    }

    public d f(boolean z) {
        this.b = z;
        return this;
    }

    public d g(boolean z) {
        this.d = z;
        return this;
    }

    public d h(boolean z) {
        this.a = z;
        return this;
    }

    public d i(int v) {
        this.c = v;
        return this;
    }
}

