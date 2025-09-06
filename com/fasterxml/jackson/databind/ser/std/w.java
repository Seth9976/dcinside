package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.lang.reflect.Type;

@b
public class w extends M {
    public static final w d;

    static {
        w.d = new w();
    }

    private w() {
        super(Object.class);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public p a(I i0, Type type0) throws o {
        return this.w("null");
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        g0.k(m0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        k0.y3();
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        k0.y3();
    }
}

