package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.jsonFormatVisitors.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.lang.reflect.Type;

@b
public class f extends M {
    private static final long d = 1L;

    public f() {
        super(byte[].class);
    }

    public boolean P(I i0, byte[] arr_b) {
        return arr_b.length == 0;
    }

    public void Q(byte[] arr_b, k k0, I i0) throws IOException {
        k0.L2(i0.r0().p(), arr_b, 0, arr_b.length);
    }

    public void R(byte[] arr_b, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(arr_b, r.p));
        k0.L2(i0.r0().p(), arr_b, 0, arr_b.length);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public p a(I i0, Type type0) {
        return this.x("array", true).t3("items", this.w("byte"));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        com.fasterxml.jackson.databind.jsonFormatVisitors.b b0 = g0.r(m0);
        if(b0 != null) {
            b0.d(d.c);
        }
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.P(i0, ((byte[])object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.Q(((byte[])object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.R(((byte[])object0), k0, i0, j0);
    }
}

