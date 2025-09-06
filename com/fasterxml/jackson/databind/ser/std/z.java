package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import j..util.Objects;
import java.io.IOException;

@b
public class z extends a implements k {
    protected final boolean f;
    protected final m g;
    protected final j h;
    protected r i;
    protected com.fasterxml.jackson.databind.ser.impl.k j;

    public z(m m0, boolean z, j j0, r r0) {
        super(Object[].class);
        this.g = m0;
        this.f = z;
        this.h = j0;
        this.j = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.i = r0;
    }

    public z(z z0, d d0, j j0, r r0, Boolean boolean0) {
        super(z0, d0, boolean0);
        this.g = z0.g;
        this.h = j0;
        this.f = z0.f;
        this.j = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.i = r0;
    }

    public z(z z0, j j0) {
        super(z0);
        this.g = z0.g;
        this.h = j0;
        this.f = z0.f;
        this.j = z0.j;
        this.i = z0.i;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public com.fasterxml.jackson.databind.ser.j P(j j0) {
        return new z(this.g, this.f, j0, this.i);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public r Q() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public m R() {
        return this.g;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.a0(((Object[])object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a
    public r W(d d0, Boolean boolean0) {
        return new z(this, d0, this.h, this.i, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a
    public void X(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.e0(((Object[])object0), k0, i0);
    }

    protected final r Y(com.fasterxml.jackson.databind.ser.impl.k k0, m m0, I i0) throws o {
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = k0.j(m0, i0, this.d);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.j = k1;
        }
        return k$d0.a;
    }

    protected final r Z(com.fasterxml.jackson.databind.ser.impl.k k0, Class class0, I i0) throws o {
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = k0.k(class0, i0, this.d);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.j = k1;
        }
        return k$d0.a;
    }

    public boolean a0(Object[] arr_object) {
        return arr_object.length == 1;
    }

    public boolean b0(I i0, Object[] arr_object) {
        return arr_object.length == 0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a, com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        r r0;
        j j0 = this.h == null ? this.h : this.h.b(d0);
        Boolean boolean0 = null;
        if(d0 == null) {
            r0 = null;
        }
        else {
            com.fasterxml.jackson.databind.introspect.k k0 = d0.h();
            com.fasterxml.jackson.databind.b b0 = i0.o();
            if(k0 == null) {
                r0 = null;
            }
            else {
                Object object0 = b0.j(k0);
                r0 = object0 == null ? null : i0.N0(k0, object0);
            }
        }
        com.fasterxml.jackson.annotation.n.d n$d0 = this.C(i0, d0, this.g());
        if(n$d0 != null) {
            boolean0 = n$d0.h(com.fasterxml.jackson.annotation.n.a.i);
        }
        if(r0 == null) {
            r0 = this.i;
        }
        r r1 = this.z(i0, d0, r0);
        if(r1 == null && (this.g != null && this.f && !this.g.Y())) {
            r1 = i0.Z(this.g, d0);
        }
        return this.h0(d0, j0, r1, boolean0);
    }

    public final void c0(Object[] arr_object, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(arr_object.length == 1 && (this.e == null && i0.D0(H.w) || this.e == Boolean.TRUE)) {
            this.e0(arr_object, k0, i0);
            return;
        }
        k0.C4(arr_object, arr_object.length);
        this.e0(arr_object, k0, i0);
        k0.n3();
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        com.fasterxml.jackson.databind.jsonFormatVisitors.b b0 = g0.r(m0);
        if(b0 != null) {
            b0.c((this.i == null ? g0.a().Z(this.g, this.d) : this.i), this.g);
        }
    }

    public void e0(Object[] arr_object, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        Object object0;
        int v;
        if(arr_object.length == 0) {
            return;
        }
        r r0 = this.i;
        if(r0 != null) {
            this.f0(arr_object, k0, i0, r0);
            return;
        }
        if(this.h != null) {
            this.g0(arr_object, k0, i0);
            return;
        }
        try {
            v = 0;
            object0 = null;
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.j;
            while(true) {
                if(v >= arr_object.length) {
                    return;
                }
                object0 = arr_object[v];
                if(object0 == null) {
                    i0.X(k0);
                }
                else {
                    Class class0 = object0.getClass();
                    r r1 = k1.m(class0);
                    if(r1 == null) {
                        r1 = this.g.i() ? this.Y(k1, i0.k(this.g, class0), i0) : this.Z(k1, class0, i0);
                    }
                    r1.m(object0, k0, i0);
                }
                ++v;
            }
        }
        catch(Exception exception0) {
        }
        this.N(i0, exception0, object0, v);
    }

    public void f0(Object[] arr_object, com.fasterxml.jackson.core.k k0, I i0, r r0) throws IOException {
        j j0 = this.h;
        Object object0 = null;
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                object0 = arr_object[v];
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
                this.N(i0, exception0, object0, v);
                return;
            }
        }
    }

    public void g0(Object[] arr_object, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        Object object0;
        int v;
        try {
            j j0 = this.h;
            v = 0;
            object0 = null;
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.j;
            while(true) {
                if(v >= arr_object.length) {
                    return;
                }
                object0 = arr_object[v];
                if(object0 == null) {
                    i0.X(k0);
                }
                else {
                    Class class0 = object0.getClass();
                    r r0 = k1.m(class0);
                    if(r0 == null) {
                        r0 = this.Z(k1, class0, i0);
                    }
                    r0.n(object0, k0, i0, j0);
                }
                ++v;
            }
        }
        catch(Exception exception0) {
        }
        this.N(i0, exception0, object0, v);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.b0(i0, ((Object[])object0));
    }

    public z h0(d d0, j j0, r r0, Boolean boolean0) {
        return this.d != d0 || r0 != this.i || this.h != j0 || !Objects.equals(this.e, boolean0) ? new z(this, d0, j0, r0, boolean0) : this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.c0(((Object[])object0), k0, i0);
    }
}

