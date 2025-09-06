package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.ser.std.a;
import com.fasterxml.jackson.databind.type.q;
import j..util.Objects;
import java.io.IOException;
import java.lang.reflect.Type;

@b
public class p extends a implements k {
    protected final r f;
    private static final m g;
    public static final p h;

    static {
        p.g = q.j0().u0(String.class);
        p.h = new p();
    }

    protected p() {
        super(String[].class);
        this.f = null;
    }

    public p(p p0, d d0, r r0, Boolean boolean0) {
        super(p0, d0, boolean0);
        this.f = r0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public j P(com.fasterxml.jackson.databind.jsontype.j j0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public r Q() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public m R() {
        return p.g;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.Y(((String[])object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a
    public r W(d d0, Boolean boolean0) {
        return new p(this, d0, this.f, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a
    public void X(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.b0(((String[])object0), k0, i0);
    }

    public boolean Y(String[] arr_s) {
        return arr_s.length == 1;
    }

    public boolean Z(I i0, String[] arr_s) {
        return arr_s.length == 0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public com.fasterxml.jackson.databind.p a(I i0, Type type0) {
        return this.x("array", true).t3("items", this.w("string"));
    }

    public final void a0(String[] arr_s, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(arr_s.length == 1 && (this.e == null && i0.D0(H.w) || this.e == Boolean.TRUE)) {
            this.b0(arr_s, k0, i0);
            return;
        }
        k0.C4(arr_s, arr_s.length);
        this.b0(arr_s, k0, i0);
        k0.n3();
    }

    public void b0(String[] arr_s, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(arr_s.length == 0) {
            return;
        }
        r r0 = this.f;
        if(r0 != null) {
            this.c0(arr_s, k0, i0, r0);
            return;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s == null) {
                k0.y3();
            }
            else {
                k0.d(s);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a, com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        r r1;
        r r0 = null;
        if(d0 == null) {
            r1 = null;
        }
        else {
            com.fasterxml.jackson.databind.b b0 = i0.o();
            com.fasterxml.jackson.databind.introspect.k k0 = d0.h();
            if(k0 == null) {
                r1 = null;
            }
            else {
                Object object0 = b0.j(k0);
                r1 = object0 == null ? null : i0.N0(k0, object0);
            }
        }
        Boolean boolean0 = this.B(i0, d0, String[].class, com.fasterxml.jackson.annotation.n.a.i);
        if(r1 == null) {
            r1 = this.f;
        }
        r r2 = this.z(i0, d0, r1);
        if(r2 == null) {
            r2 = i0.a0(String.class, d0);
        }
        if(!this.F(r2)) {
            r0 = r2;
        }
        return r0 != this.f || !Objects.equals(boolean0, this.e) ? new p(this, d0, r0, boolean0) : this;
    }

    private void c0(String[] arr_s, com.fasterxml.jackson.core.k k0, I i0, r r0) throws IOException {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s == null) {
                i0.X(k0);
            }
            else {
                r0.m(s, k0, i0);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        this.H(g0, m0, com.fasterxml.jackson.databind.jsonFormatVisitors.d.a);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.Z(i0, ((String[])object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.a
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.a0(((String[])object0), k0, i0);
    }
}

