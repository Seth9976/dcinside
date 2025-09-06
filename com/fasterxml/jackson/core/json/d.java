package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.e;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.q;

public final class d extends q {
    protected final d g;
    protected b h;
    protected d i;
    protected String j;
    protected Object k;
    protected int l;
    protected int m;

    public d(d d0, int v, b b0, int v1, int v2, int v3) {
        this.g = d0;
        this.h = b0;
        this.a = v1;
        this.l = v2;
        this.m = v3;
        this.b = -1;
        this.c = v;
    }

    @Deprecated
    public d(d d0, b b0, int v, int v1, int v2) {
        this.g = d0;
        this.h = b0;
        this.a = v;
        this.l = v1;
        this.m = v2;
        this.b = -1;
        this.c = d0 == null ? 0 : d0.c + 1;
    }

    public b A() {
        return this.h;
    }

    public d B() {
        return this.g;
    }

    public void C(int v, int v1, int v2) {
        this.a = v;
        this.b = -1;
        this.l = v1;
        this.m = v2;
        this.j = null;
        this.k = null;
        b b0 = this.h;
        if(b0 != null) {
            b0.e();
        }
    }

    public void D(String s) throws p {
        this.j = s;
        b b0 = this.h;
        if(b0 != null) {
            this.t(b0, s);
        }
    }

    public d E(b b0) {
        this.h = b0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.q
    public String b() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.core.q
    public Object c() {
        return this.k;
    }

    @Override  // com.fasterxml.jackson.core.q
    public q f() {
        return this.B();
    }

    @Override  // com.fasterxml.jackson.core.q
    @Deprecated
    public l g(Object object0) {
        return this.r(e.r(object0));
    }

    @Override  // com.fasterxml.jackson.core.q
    public boolean j() {
        return this.j != null;
    }

    @Override  // com.fasterxml.jackson.core.q
    public void q(Object object0) {
        this.k = object0;
    }

    @Override  // com.fasterxml.jackson.core.q
    public l r(e e0) {
        return new l(e0, -1L, this.l, this.m);
    }

    private void t(b b0, String s) throws p {
        if(b0.d(s)) {
            Object object0 = b0.c();
            throw new m((object0 instanceof n ? ((n)object0) : null), "Duplicate field \'" + s + "\'");
        }
    }

    public d u() {
        this.k = null;
        return this.g;
    }

    public d v(int v, int v1) {
        d d0 = this.i;
        if(d0 == null) {
            d0 = new d(this, this.c + 1, (this.h == null ? null : this.h.a()), 1, v, v1);
            this.i = d0;
            return d0;
        }
        d0.C(1, v, v1);
        return d0;
    }

    public d w(int v, int v1) {
        d d0 = this.i;
        if(d0 == null) {
            d d1 = new d(this, this.c + 1, (this.h == null ? null : this.h.a()), 2, v, v1);
            this.i = d1;
            return d1;
        }
        d0.C(2, v, v1);
        return d0;
    }

    public static d x(int v, int v1, b b0) {
        return new d(null, 0, b0, 0, v, v1);
    }

    public static d y(b b0) {
        return new d(null, 0, b0, 0, 1, 0);
    }

    public boolean z() {
        int v = this.b + 1;
        this.b = v;
        return this.a != 0 && v > 0;
    }
}

