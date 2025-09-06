package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import java.io.IOException;
import java.util.Iterator;

@b
public class g extends com.fasterxml.jackson.databind.ser.std.b {
    public g(m m0, boolean z, j j0) {
        super(Iterator.class, m0, z, j0, null);
    }

    public g(g g0, d d0, j j0, r r0, Boolean boolean0) {
        super(g0, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public com.fasterxml.jackson.databind.ser.j P(j j0) {
        return new g(this, this.e, j0, this.i, this.g);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.b0(((Iterator)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void X(Object object0, k k0, I i0) throws IOException {
        this.f0(((Iterator)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public com.fasterxml.jackson.databind.ser.std.b Z(d d0, j j0, r r0, Boolean boolean0) {
        return this.g0(d0, j0, r0, boolean0);
    }

    protected void a0(Iterator iterator0, k k0, I i0) throws IOException {
        j j0 = this.h;
        com.fasterxml.jackson.databind.ser.impl.k k1 = this.j;
        do {
            Object object0 = iterator0.next();
            if(object0 == null) {
                i0.X(k0);
            }
            else {
                Class class0 = object0.getClass();
                r r0 = k1.m(class0);
                if(r0 == null) {
                    r0 = this.d.i() ? this.V(k1, i0.k(this.d, class0), i0) : this.W(k1, class0, i0);
                    k1 = this.j;
                }
                if(j0 == null) {
                    r0.m(object0, k0, i0);
                }
                else {
                    r0.n(object0, k0, i0, j0);
                }
            }
        }
        while(iterator0.hasNext());
    }

    public boolean b0(Iterator iterator0) {
        return false;
    }

    public boolean c0(I i0, Iterator iterator0) {
        return !iterator0.hasNext();
    }

    public final void e0(Iterator iterator0, k k0, I i0) throws IOException {
        k0.B4(iterator0);
        this.f0(iterator0, k0, i0);
        k0.n3();
    }

    public void f0(Iterator iterator0, k k0, I i0) throws IOException {
        if(!iterator0.hasNext()) {
            return;
        }
        r r0 = this.i;
        if(r0 == null) {
            this.a0(iterator0, k0, i0);
            return;
        }
        j j0 = this.h;
        do {
            Object object0 = iterator0.next();
            if(object0 == null) {
                i0.X(k0);
            }
            else if(j0 == null) {
                r0.m(object0, k0, i0);
            }
            else {
                r0.n(object0, k0, i0, j0);
            }
        }
        while(iterator0.hasNext());
    }

    public g g0(d d0, j j0, r r0, Boolean boolean0) {
        return new g(this, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.c0(i0, ((Iterator)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void m(Object object0, k k0, I i0) throws IOException {
        this.e0(((Iterator)object0), k0, i0);
    }
}

