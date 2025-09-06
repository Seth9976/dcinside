package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.lang.reflect.Type;

public class A extends M {
    public A(Class class0) {
        super(class0, false);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public p a(I i0, Type type0) {
        return this.x("string", true);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        this.L(g0, m0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        k0.w4(object0.toString());
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(object0, r.p));
        this.m(object0, k0, i0);
        j0.v(k0, c0);
    }
}

