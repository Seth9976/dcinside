package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.util.e;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Map;

@b
public class h extends j implements k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.annotation.u.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.fasterxml.jackson.annotation.u.a.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.b.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.a.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final d d;
    protected final boolean e;
    protected final m f;
    protected final m g;
    protected final m h;
    protected r i;
    protected r j;
    protected final com.fasterxml.jackson.databind.jsontype.j k;
    protected com.fasterxml.jackson.databind.ser.impl.k l;
    protected final Object m;
    protected final boolean n;
    public static final Object o;

    static {
        h.o = com.fasterxml.jackson.annotation.u.a.d;
    }

    public h(m m0, m m1, m m2, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, d d0) {
        super(m0);
        this.f = m0;
        this.g = m1;
        this.h = m2;
        this.e = z;
        this.k = j0;
        this.d = d0;
        this.l = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.m = null;
        this.n = false;
    }

    @Deprecated
    protected h(h h0, d d0, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1) {
        this(h0, d0, j0, r0, r1, h0.m, h0.n);
    }

    protected h(h h0, d d0, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1, Object object0, boolean z) {
        super(Map.class, false);
        this.f = h0.f;
        this.g = h0.g;
        this.h = h0.h;
        this.e = h0.e;
        this.k = h0.k;
        this.i = r0;
        this.j = r1;
        this.l = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.d = h0.d;
        this.m = object0;
        this.n = z;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public j P(com.fasterxml.jackson.databind.jsontype.j j0) {
        return new h(this, this.d, j0, this.i, this.j, this.m, this.n);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public r Q() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public m R() {
        return this.h;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.X(((Map.Entry)object0));
    }

    protected final r V(com.fasterxml.jackson.databind.ser.impl.k k0, m m0, I i0) throws o {
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = k0.j(m0, i0, this.d);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.l = k1;
        }
        return k$d0.a;
    }

    protected final r W(com.fasterxml.jackson.databind.ser.impl.k k0, Class class0, I i0) throws o {
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = k0.k(class0, i0, this.d);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.l = k1;
        }
        return k$d0.a;
    }

    public boolean X(Map.Entry map$Entry0) {
        return true;
    }

    public boolean Y(I i0, Map.Entry map$Entry0) {
        Object object0 = map$Entry0.getValue();
        if(object0 == null) {
            return this.n;
        }
        if(this.m == null) {
            return false;
        }
        r r0 = this.j;
        if(r0 == null) {
            Class class0 = object0.getClass();
            r r1 = this.l.m(class0);
            if(r1 == null) {
                try {
                    r0 = this.W(this.l, class0, i0);
                    return this.m == h.o ? r0.h(i0, object0) : this.m.equals(object0);
                }
                catch(o unused_ex) {
                    return false;
                }
            }
            r0 = r1;
        }
        return this.m == h.o ? r0.h(i0, object0) : this.m.equals(object0);
    }

    public void Z(Map.Entry map$Entry0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        k0.E4(map$Entry0);
        this.a0(map$Entry0, k0, i0);
        k0.p3();
    }

    protected void a0(Map.Entry map$Entry0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        r r1;
        com.fasterxml.jackson.databind.jsontype.j j0 = this.k;
        Object object0 = map$Entry0.getKey();
        r r0 = object0 == null ? i0.e0(this.g, this.d) : this.i;
        Object object1 = map$Entry0.getValue();
        if(object1 == null) {
            if(this.n) {
                return;
            }
            r1 = i0.t0();
        }
        else {
            r1 = this.j;
            if(r1 == null) {
                Class class0 = object1.getClass();
                r r2 = this.l.m(class0);
                if(r2 != null) {
                    r1 = r2;
                }
                else if(this.h.i()) {
                    r1 = this.V(this.l, i0.k(this.h, class0), i0);
                }
                else {
                    r1 = this.W(this.l, class0, i0);
                }
            }
            Object object2 = this.m;
            if(object2 != null) {
                if(object2 == h.o && r1.h(i0, object1)) {
                    return;
                }
                if(this.m.equals(object1)) {
                    return;
                }
            }
        }
        r0.m(object0, k0, i0);
        try {
            if(j0 == null) {
                r1.m(object1, k0, i0);
                return;
            }
            r1.n(object1, k0, i0, j0);
            return;
        }
        catch(Exception exception0) {
        }
        this.O(i0, exception0, map$Entry0, "" + object0);
    }

    public void b0(Map.Entry map$Entry0, com.fasterxml.jackson.core.k k0, I i0, com.fasterxml.jackson.databind.jsontype.j j0) throws IOException {
        k0.u1(map$Entry0);
        c c0 = j0.o(k0, j0.f(map$Entry0, com.fasterxml.jackson.core.r.k));
        this.a0(map$Entry0, k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        Object object3;
        r r1;
        r r0;
        com.fasterxml.jackson.databind.b b0 = i0.o();
        com.fasterxml.jackson.databind.introspect.k k0 = d0 == null ? null : d0.h();
        if(k0 == null || b0 == null) {
            r1 = null;
            r0 = null;
        }
        else {
            Object object0 = b0.G(k0);
            r0 = object0 == null ? null : i0.N0(k0, object0);
            Object object1 = b0.j(k0);
            r1 = object1 == null ? null : i0.N0(k0, object1);
        }
        if(r1 == null) {
            r1 = this.j;
        }
        r r2 = this.z(i0, d0, r1);
        if(r2 == null && this.e && !this.h.Y()) {
            r2 = i0.Z(this.h, d0);
        }
        if(r0 == null) {
            r0 = this.i;
        }
        r r3 = r0 == null ? i0.b0(this.g, d0) : i0.z0(r0, d0);
        Object object2 = this.m;
        boolean z = this.n;
        if(d0 != null) {
            com.fasterxml.jackson.annotation.u.b u$b0 = d0.i(i0.r0(), null);
            if(u$b0 != null) {
                com.fasterxml.jackson.annotation.u.a u$a0 = u$b0.g();
                if(u$a0 != com.fasterxml.jackson.annotation.u.a.g) {
                    switch(u$a0) {
                        case 1: {
                            object3 = e.b(this.h);
                            return object3 == null || !object3.getClass().isArray() ? this.e0(d0, r3, r2, object3, true) : this.e0(d0, r3, r2, com.fasterxml.jackson.databind.util.c.b(object3), true);
                        }
                        case 2: {
                            return this.h.s() ? this.e0(d0, r3, r2, h.o, true) : this.e0(d0, r3, r2, null, true);
                        }
                        case 3: {
                            return this.e0(d0, r3, r2, h.o, true);
                        }
                        case 4: {
                            object3 = i0.B0(null, u$b0.f());
                            return object3 == null ? this.e0(d0, r3, r2, object3, true) : this.e0(d0, r3, r2, object3, i0.C0(object3));
                        }
                        case 5: {
                            return this.e0(d0, r3, r2, null, true);
                        }
                        default: {
                            return this.e0(d0, r3, r2, null, false);
                        }
                    }
                }
            }
        }
        return this.e0(d0, r3, r2, object2, z);
    }

    public h c0(Object object0, boolean z) {
        return this.m != object0 || this.n != z ? new h(this, this.d, this.k, this.i, this.j, object0, z) : this;
    }

    public h e0(d d0, r r0, r r1, Object object0, boolean z) {
        return new h(this, d0, this.k, r0, r1, object0, z);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.Y(i0, ((Map.Entry)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.Z(((Map.Entry)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, com.fasterxml.jackson.databind.jsontype.j j0) throws IOException {
        this.b0(((Map.Entry)object0), k0, i0, j0);
    }
}

