package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.a;
import com.fasterxml.jackson.databind.deser.C;
import com.fasterxml.jackson.databind.deser.h;
import com.fasterxml.jackson.databind.deser.s;
import com.fasterxml.jackson.databind.deser.std.G;
import com.fasterxml.jackson.databind.deser.t;
import com.fasterxml.jackson.databind.util.c;
import com.fasterxml.jackson.databind.util.d;
import java.io.Serializable;

public class o implements Serializable {
    protected final s[] a;
    protected final t[] b;
    protected final h[] c;
    protected final a[] d;
    protected final C[] e;
    private static final long f = 1L;
    protected static final s[] g;
    protected static final h[] h;
    protected static final a[] i;
    protected static final C[] j;
    protected static final t[] k;

    static {
        o.g = new s[0];
        o.h = new h[0];
        o.i = new a[0];
        o.j = new C[0];
        o.k = new t[]{new G()};
    }

    public o() {
        this(null, null, null, null, null);
    }

    protected o(s[] arr_s, t[] arr_t, h[] arr_h, a[] arr_a, C[] arr_c) {
        if(arr_s == null) {
            arr_s = o.g;
        }
        this.a = arr_s;
        if(arr_t == null) {
            arr_t = o.k;
        }
        this.b = arr_t;
        if(arr_h == null) {
            arr_h = o.h;
        }
        this.c = arr_h;
        if(arr_a == null) {
            arr_a = o.i;
        }
        this.d = arr_a;
        if(arr_c == null) {
            arr_c = o.j;
        }
        this.e = arr_c;
    }

    public Iterable a() {
        return new d(this.d);
    }

    public Iterable b() {
        return new d(this.c);
    }

    public Iterable c() {
        return new d(this.a);
    }

    public boolean d() {
        return this.d.length > 0;
    }

    public boolean e() {
        return this.c.length > 0;
    }

    public boolean f() {
        return this.a.length > 0;
    }

    public boolean g() {
        return this.b.length > 0;
    }

    public boolean h() {
        return this.e.length > 0;
    }

    public Iterable i() {
        return new d(this.b);
    }

    public Iterable j() {
        return new d(this.e);
    }

    public o k(a a0) {
        if(a0 == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        Object[] arr_object = c.j(this.d, a0);
        return new o(this.a, this.b, this.c, ((a[])arr_object), this.e);
    }

    public o l(s s0) {
        if(s0 == null) {
            throw new IllegalArgumentException("Cannot pass null Deserializers");
        }
        return new o(((s[])c.j(this.a, s0)), this.b, this.c, this.d, this.e);
    }

    public o m(t t0) {
        if(t0 == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        Object[] arr_object = c.j(this.b, t0);
        return new o(this.a, ((t[])arr_object), this.c, this.d, this.e);
    }

    public o n(h h0) {
        if(h0 == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        Object[] arr_object = c.j(this.c, h0);
        return new o(this.a, this.b, ((h[])arr_object), this.d, this.e);
    }

    public o o(C c0) {
        if(c0 == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        Object[] arr_object = c.j(this.e, c0);
        return new o(this.a, this.b, this.c, this.d, ((C[])arr_object));
    }
}

