package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.lang.reflect.Type;

public class i extends L {
    public i() {
        super(Class.class, false);
    }

    public void P(Class class0, k k0, I i0) throws IOException {
        k0.d(class0.getName());
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    @Deprecated
    public p a(I i0, Type type0) {
        return this.x("string", true);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void e(g g0, m m0) throws o {
        this.L(g0, m0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.P(((Class)object0), k0, i0);
    }
}

