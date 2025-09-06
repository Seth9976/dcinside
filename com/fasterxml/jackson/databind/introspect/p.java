package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public abstract class p extends k {
    protected final s[] d;
    private static final long e = 1L;

    protected p(K k0, s s0, s[] arr_s) {
        super(k0, s0);
        this.d = arr_s;
    }

    protected p(p p0, s[] arr_s) {
        super(p0);
        this.d = arr_s;
    }

    @Deprecated
    public abstract Type A(int arg1);

    public final o B(int v) {
        m m0 = this.E(v);
        s s0 = this.C(v);
        return new o(this, m0, this.a, s0, v);
    }

    public final s C(int v) {
        return this.d == null || v < 0 || v >= this.d.length ? null : this.d[v];
    }

    public abstract int D();

    public abstract m E(int arg1);

    public abstract Class F(int arg1);

    protected o G(int v, s s0) {
        this.d[v] = s0;
        return this.B(v);
    }

    public final void u(int v, Annotation annotation0) {
        s s0 = this.d[v];
        if(s0 == null) {
            s0 = new s();
            this.d[v] = s0;
        }
        s0.e(annotation0);
    }

    public abstract Object w() throws Exception;

    public abstract Object x(Object[] arg1) throws Exception;

    public abstract Object y(Object arg1) throws Exception;

    public final int z() {
        return this.b.size();
    }
}

