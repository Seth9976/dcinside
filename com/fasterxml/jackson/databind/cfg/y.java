package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.t;
import com.fasterxml.jackson.databind.util.c;
import com.fasterxml.jackson.databind.util.d;
import java.io.Serializable;

public final class y implements Serializable {
    protected final t[] a;
    protected final t[] b;
    protected final i[] c;
    private static final long d = 1L;
    protected static final t[] e;
    protected static final i[] f;

    static {
        y.e = new t[0];
        y.f = new i[0];
    }

    public y() {
        this(null, null, null);
    }

    protected y(t[] arr_t, t[] arr_t1, i[] arr_i) {
        if(arr_t == null) {
            arr_t = y.e;
        }
        this.a = arr_t;
        if(arr_t1 == null) {
            arr_t1 = y.e;
        }
        this.b = arr_t1;
        if(arr_i == null) {
            arr_i = y.f;
        }
        this.c = arr_i;
    }

    public boolean a() {
        return this.b.length > 0;
    }

    public boolean b() {
        return this.c.length > 0;
    }

    public boolean c() {
        return this.a.length > 0;
    }

    public Iterable d() {
        return new d(this.b);
    }

    public Iterable e() {
        return new d(this.c);
    }

    public Iterable f() {
        return new d(this.a);
    }

    public y g(t t0) {
        if(t0 == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        t[] arr_t = (t[])c.j(this.b, t0);
        return new y(this.a, arr_t, this.c);
    }

    public y h(t t0) {
        if(t0 == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new y(((t[])c.j(this.a, t0)), this.b, this.c);
    }

    public y i(i i0) {
        if(i0 == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        i[] arr_i = (i[])c.j(this.c, i0);
        return new y(this.a, this.b, arr_i);
    }
}

