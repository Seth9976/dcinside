package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class j extends b {
    private static final long k = 1L;

    @Deprecated
    public j(m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, d d0, r r0) {
        this(m0, z, j0, r0);
    }

    public j(m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0) {
        super(Collection.class, m0, z, j0, r0);
    }

    public j(j j0, d d0, com.fasterxml.jackson.databind.jsontype.j j1, r r0, Boolean boolean0) {
        super(j0, d0, j1, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public com.fasterxml.jackson.databind.ser.j P(com.fasterxml.jackson.databind.jsontype.j j0) {
        return new j(this, this.e, j0, this.i, this.g);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.a0(((Collection)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void X(Object object0, k k0, I i0) throws IOException {
        this.e0(((Collection)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public b Z(d d0, com.fasterxml.jackson.databind.jsontype.j j0, r r0, Boolean boolean0) {
        return this.g0(d0, j0, r0, boolean0);
    }

    public boolean a0(Collection collection0) {
        return collection0.size() == 1;
    }

    public boolean b0(I i0, Collection collection0) {
        return collection0.isEmpty();
    }

    public final void c0(Collection collection0, k k0, I i0) throws IOException {
        int v = collection0.size();
        if(v == 1 && (this.g == null && i0.D0(H.w) || this.g == Boolean.TRUE)) {
            this.e0(collection0, k0, i0);
            return;
        }
        k0.C4(collection0, v);
        this.e0(collection0, k0, i0);
        k0.n3();
    }

    public void e0(Collection collection0, k k0, I i0) throws IOException {
        k0.u1(collection0);
        r r0 = this.i;
        if(r0 != null) {
            this.f0(collection0, k0, i0, r0);
            return;
        }
        Iterator iterator0 = collection0.iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        com.fasterxml.jackson.databind.ser.impl.k k1 = this.j;
        com.fasterxml.jackson.databind.jsontype.j j0 = this.h;
        int v = 0;
        try {
            do {
                Object object0 = iterator0.next();
                if(object0 == null) {
                    i0.X(k0);
                }
                else {
                    Class class0 = object0.getClass();
                    r r1 = k1.m(class0);
                    if(r1 == null) {
                        r1 = this.d.i() ? this.V(k1, i0.k(this.d, class0), i0) : this.W(k1, class0, i0);
                        k1 = this.j;
                    }
                    if(j0 == null) {
                        r1.m(object0, k0, i0);
                    }
                    else {
                        r1.n(object0, k0, i0, j0);
                    }
                }
                ++v;
            }
            while(iterator0.hasNext());
        }
        catch(Exception exception0) {
            this.N(i0, exception0, collection0, v);
        }
    }

    public void f0(Collection collection0, k k0, I i0, r r0) throws IOException {
        Iterator iterator0 = collection0.iterator();
        if(iterator0.hasNext()) {
            com.fasterxml.jackson.databind.jsontype.j j0 = this.h;
            int v = 0;
            while(true) {
                Object object0 = iterator0.next();
                try {
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
                catch(Exception exception0) {
                    this.N(i0, exception0, collection0, v);
                    goto label_17;
                }
                ++v;
            label_17:
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
    }

    public j g0(d d0, com.fasterxml.jackson.databind.jsontype.j j0, r r0, Boolean boolean0) {
        return new j(this, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.b0(i0, ((Collection)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void m(Object object0, k k0, I i0) throws IOException {
        this.c0(((Collection)object0), k0, i0);
    }
}

