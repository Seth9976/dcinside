package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import java.io.IOException;
import java.util.EnumSet;

public class n extends b {
    public n(m m0) {
        super(EnumSet.class, m0, true, null, null);
    }

    public n(n n0, d d0, j j0, r r0, Boolean boolean0) {
        super(n0, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public com.fasterxml.jackson.databind.ser.j P(j j0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.b0(((EnumSet)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void X(Object object0, k k0, I i0) throws IOException {
        this.f0(((EnumSet)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public b Z(d d0, j j0, r r0, Boolean boolean0) {
        return this.g0(d0, j0, r0, boolean0);
    }

    public n a0(j j0) [...] // Inlined contents

    public boolean b0(EnumSet enumSet0) {
        return enumSet0.size() == 1;
    }

    public boolean c0(I i0, EnumSet enumSet0) {
        return enumSet0.isEmpty();
    }

    public final void e0(EnumSet enumSet0, k k0, I i0) throws IOException {
        int v = enumSet0.size();
        if(v == 1 && (this.g == null && i0.D0(H.w) || this.g == Boolean.TRUE)) {
            this.f0(enumSet0, k0, i0);
            return;
        }
        k0.C4(enumSet0, v);
        this.f0(enumSet0, k0, i0);
        k0.n3();
    }

    public void f0(EnumSet enumSet0, k k0, I i0) throws IOException {
        r r0 = this.i;
        for(Object object0: enumSet0) {
            Enum enum0 = (Enum)object0;
            if(r0 == null) {
                r0 = i0.a0(enum0.getDeclaringClass(), this.e);
            }
            r0.m(enum0, k0, i0);
        }
    }

    public n g0(d d0, j j0, r r0, Boolean boolean0) {
        return new n(this, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.c0(i0, ((EnumSet)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void m(Object object0, k k0, I i0) throws IOException {
        this.e0(((EnumSet)object0), k0, i0);
    }
}

