package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.ser.std.d;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Set;

public class b extends d {
    protected final d n;
    private static final long o = 1L;

    public b(d d0) {
        super(d0, null);
        this.n = d0;
    }

    protected b(d d0, i i0, Object object0) {
        super(d0, i0, object0);
        this.n = d0;
    }

    protected b(d d0, Set set0) {
        this(d0, set0, null);
    }

    protected b(d d0, Set set0, Set set1) {
        super(d0, set0, set1);
        this.n = d0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d U() {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d Z(Set set0, Set set1) {
        return this.i0(set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public d a0(Object object0) {
        return new b(this, this.j, object0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public d e0(i i0) {
        return this.n.e0(i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d f0(com.fasterxml.jackson.databind.ser.d[] arr_d, com.fasterxml.jackson.databind.ser.d[] arr_d1) {
        return this;
    }

    private boolean g0(I i0) {
        return (this.f == null || i0.n() == null ? this.e : this.f).length == 1;
    }

    protected final void h0(Object object0, k k0, I i0) throws IOException {
        com.fasterxml.jackson.databind.ser.d[] arr_d = this.f == null || i0.n() == null ? this.e : this.f;
        int v = 0;
        while(v < arr_d.length) {
            try {
                com.fasterxml.jackson.databind.ser.d d0 = arr_d[v];
                if(d0 == null) {
                    k0.y3();
                }
                else {
                    d0.n(object0, k0, i0);
                }
                goto label_17;
            }
            catch(Exception exception0) {
            }
            catch(StackOverflowError stackOverflowError0) {
                goto label_14;
            }
            this.O(i0, exception0, object0, arr_d[v].getName());
            return;
        label_14:
            o o0 = o.m(k0, "Infinite recursion (StackOverflowError)", stackOverflowError0);
            o0.g(object0, arr_d[v].getName());
            throw o0;
        label_17:
            ++v;
        }
    }

    protected b i0(Set set0, Set set1) {
        return new b(this, set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean j() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public final void m(Object object0, k k0, I i0) throws IOException {
        if(i0.D0(H.w) && this.g0(i0)) {
            this.h0(object0, k0, i0);
            return;
        }
        k0.B4(object0);
        this.h0(object0, k0, i0);
        k0.n3();
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        if(this.j != null) {
            this.R(object0, k0, i0, j0);
            return;
        }
        c c0 = this.T(j0, object0, r.m);
        j0.o(k0, c0);
        k0.u1(object0);
        this.h0(object0, k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public com.fasterxml.jackson.databind.r o(x x0) {
        return this.n.o(x0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public com.fasterxml.jackson.databind.r q(Object object0) {
        return this.a0(object0);
    }

    @Override
    public String toString() {
        return "BeanAsArraySerializer for " + this.g().getName();
    }
}

