package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.introspect.o;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.introspect.v;

public final class d {
    public static final class a {
        public final o a;
        public final v b;
        public final com.fasterxml.jackson.annotation.d.a c;

        public a(o o0, v v0, com.fasterxml.jackson.annotation.d.a d$a0) {
            this.a = o0;
            this.b = v0;
            this.c = d$a0;
        }

        public B a() {
            return this.b == null ? null : this.b.a();
        }

        public boolean b() {
            return this.b == null ? false : this.b.a().f();
        }
    }

    protected final b a;
    protected final p b;
    protected final int c;
    protected final a[] d;

    protected d(b b0, p p0, a[] arr_d$a, int v) {
        this.a = b0;
        this.b = p0;
        this.d = arr_d$a;
        this.c = v;
    }

    public static d a(b b0, p p0, v[] arr_v) {
        int v = p0.D();
        a[] arr_d$a = new a[v];
        for(int v1 = 0; v1 < v; ++v1) {
            o o0 = p0.B(v1);
            com.fasterxml.jackson.annotation.d.a d$a0 = b0.D(o0);
            arr_d$a[v1] = new a(o0, (arr_v == null ? null : arr_v[v1]), d$a0);
        }
        return new d(b0, p0, arr_d$a, v);
    }

    public p b() {
        return this.b;
    }

    public B c(int v) {
        v v1 = this.d[v].b;
        return v1 == null || !v1.N() ? null : v1.a();
    }

    public B d(int v) {
        String s = this.a.C(this.d[v].a);
        return s == null || s.isEmpty() ? null : B.a(s);
    }

    public int e() {
        int v1 = -1;
        for(int v = 0; v < this.c; ++v) {
            if(this.d[v].c == null) {
                if(v1 >= 0) {
                    return -1;
                }
                v1 = v;
            }
        }
        return v1;
    }

    public com.fasterxml.jackson.annotation.d.a f(int v) {
        return this.d[v].c;
    }

    public int g() {
        return this.c;
    }

    public B h(int v) {
        v v1 = this.d[v].b;
        return v1 == null ? null : v1.a();
    }

    public o i(int v) {
        return this.d[v].a;
    }

    public v j(int v) {
        return this.d[v].b;
    }

    @Override
    public String toString() {
        return this.b.toString();
    }
}

