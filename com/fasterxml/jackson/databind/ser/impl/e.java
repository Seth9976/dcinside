package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import java.io.IOException;
import java.util.List;

@b
public final class e extends com.fasterxml.jackson.databind.ser.std.b {
    private static final long k = 1L;

    public e(m m0, boolean z, j j0, r r0) {
        super(List.class, m0, z, j0, r0);
    }

    public e(e e0, d d0, j j0, r r0, Boolean boolean0) {
        super(e0, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public com.fasterxml.jackson.databind.ser.j P(j j0) {
        return new e(this, this.e, j0, this.i, this.g);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.a0(((List)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void X(Object object0, k k0, I i0) throws IOException {
        this.e0(((List)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public com.fasterxml.jackson.databind.ser.std.b Z(d d0, j j0, r r0, Boolean boolean0) {
        return this.h0(d0, j0, r0, boolean0);
    }

    public boolean a0(List list0) {
        return list0.size() == 1;
    }

    public boolean b0(I i0, List list0) {
        return list0.isEmpty();
    }

    public final void c0(List list0, k k0, I i0) throws IOException {
        int v = list0.size();
        if(v == 1 && (this.g == null && i0.D0(H.w) || this.g == Boolean.TRUE)) {
            this.e0(list0, k0, i0);
            return;
        }
        k0.C4(list0, v);
        this.e0(list0, k0, i0);
        k0.n3();
    }

    public void e0(List list0, k k0, I i0) throws IOException {
        int v1;
        r r0 = this.i;
        if(r0 != null) {
            this.f0(list0, k0, i0, r0);
            return;
        }
        if(this.h != null) {
            this.g0(list0, k0, i0);
            return;
        }
        int v = list0.size();
        if(v == 0) {
            return;
        }
        try {
            v1 = 0;
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.j;
            while(true) {
                if(v1 >= v) {
                    return;
                }
                Object object0 = list0.get(v1);
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
                    r1.m(object0, k0, i0);
                }
                ++v1;
            }
        }
        catch(Exception exception0) {
        }
        this.N(i0, exception0, list0, v1);
    }

    public void f0(List list0, k k0, I i0, r r0) throws IOException {
        int v = list0.size();
        if(v == 0) {
            return;
        }
        j j0 = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
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
                this.N(i0, exception0, list0, v1);
            }
        }
    }

    public void g0(List list0, k k0, I i0) throws IOException {
        int v1;
        int v = list0.size();
        if(v == 0) {
            return;
        }
        try {
            v1 = 0;
            j j0 = this.h;
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.j;
            while(true) {
                if(v1 >= v) {
                    return;
                }
                Object object0 = list0.get(v1);
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
                    r0.n(object0, k0, i0, j0);
                }
                ++v1;
            }
        }
        catch(Exception exception0) {
        }
        this.N(i0, exception0, list0, v1);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.b0(i0, ((List)object0));
    }

    public e h0(d d0, j j0, r r0, Boolean boolean0) {
        return new e(this, d0, j0, r0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.b
    public void m(Object object0, k k0, I i0) throws IOException {
        this.c0(((List)object0), k0, i0);
    }
}

