package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.F;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@b
public final class f extends F {
    private static final long e = 1L;
    public static final f f;

    static {
        f.f = new f();
    }

    protected f() {
        super(List.class);
    }

    public f(f f0, Boolean boolean0) {
        super(f0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    public r P(d d0, Boolean boolean0) {
        return new f(this, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    protected void Q(com.fasterxml.jackson.databind.jsonFormatVisitors.b b0) throws o {
        b0.d(com.fasterxml.jackson.databind.jsonFormatVisitors.d.a);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    protected p R() {
        return this.x("string", true);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    public void T(Collection collection0, k k0, I i0, j j0) throws IOException {
        this.W(((List)collection0), k0, i0, j0);
    }

    public void U(List list0, k k0, I i0) throws IOException {
        int v = list0.size();
        if(v == 1 && (this.d == null && i0.D0(H.w) || this.d == Boolean.TRUE)) {
            this.V(list0, k0, i0, 1);
            return;
        }
        k0.C4(list0, v);
        this.V(list0, k0, i0, v);
        k0.n3();
    }

    private final void V(List list0, k k0, I i0, int v) throws IOException {
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                String s = (String)list0.get(v1);
                if(s == null) {
                    i0.X(k0);
                }
                else {
                    k0.d(s);
                }
            }
            catch(Exception exception0) {
                this.N(i0, exception0, list0, v1);
                return;
            }
        }
    }

    public void W(List list0, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(list0, com.fasterxml.jackson.core.r.m));
        k0.u1(list0);
        this.V(list0, k0, i0, list0.size());
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.U(((List)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.W(((List)object0), k0, i0, j0);
    }
}

