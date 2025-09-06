package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import java.io.IOException;
import java.util.Iterator;

@b
public class r extends com.fasterxml.jackson.databind.ser.std.b {
    public r(m m0, boolean z, j j0) {
        super(Iterable.class, m0, z, j0, null);
    }

    public r(r r0, d d0, j j0, com.fasterxml.jackson.databind.r r1, Boolean boolean0) {
        super(r0, d0, j0, r1, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public com.fasterxml.jackson.databind.ser.j P(j j0) {
        return new r(this, this.e, j0, this.i, this.g);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.a0(((Iterable)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void X(Object object0, k k0, I i0) throws IOException {
        this.e0(((Iterable)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public com.fasterxml.jackson.databind.ser.std.b Z(d d0, j j0, com.fasterxml.jackson.databind.r r0, Boolean boolean0) {
        return this.f0(d0, j0, r0, boolean0);
    }

    public boolean a0(Iterable iterable0) {
        if(iterable0 != null) {
            Iterator iterator0 = iterable0.iterator();
            if(iterator0.hasNext()) {
                iterator0.next();
                return !iterator0.hasNext();
            }
        }
        return false;
    }

    public boolean b0(I i0, Iterable iterable0) {
        return !iterable0.iterator().hasNext();
    }

    public final void c0(Iterable iterable0, k k0, I i0) throws IOException {
        if((this.g == null && i0.D0(H.w) || this.g == Boolean.TRUE) && this.a0(iterable0)) {
            this.e0(iterable0, k0, i0);
            return;
        }
        k0.B4(iterable0);
        this.e0(iterable0, k0, i0);
        k0.n3();
    }

    public void e0(Iterable iterable0, k k0, I i0) throws IOException {
        com.fasterxml.jackson.databind.r r2;
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            j j0 = this.h;
            Class class0 = null;
            com.fasterxml.jackson.databind.r r0 = null;
            while(true) {
                Object object0 = iterator0.next();
                if(object0 == null) {
                    i0.X(k0);
                }
                else {
                    com.fasterxml.jackson.databind.r r1 = this.i;
                    if(r1 == null) {
                        Class class1 = object0.getClass();
                        if(class1 != class0) {
                            r0 = i0.q0(class1, this.e);
                            class0 = class1;
                        }
                        r2 = r0;
                    }
                    else {
                        r2 = r0;
                        r0 = r1;
                    }
                    if(j0 == null) {
                        r0.m(object0, k0, i0);
                    }
                    else {
                        r0.n(object0, k0, i0, j0);
                    }
                    r0 = r2;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
    }

    public r f0(d d0, j j0, com.fasterxml.jackson.databind.r r0, Boolean boolean0) {
        return new r(this, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.b0(i0, ((Iterable)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void m(Object object0, k k0, I i0) throws IOException {
        this.c0(((Iterable)object0), k0, i0);
    }
}

