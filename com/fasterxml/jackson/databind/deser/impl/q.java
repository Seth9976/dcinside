package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.u;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.util.a;
import java.io.Serializable;

public class q implements v, Serializable {
    protected final Object a;
    protected final a b;
    private static final long c = 1L;
    private static final q d;
    private static final q e;

    static {
        q.d = new q(null);
        q.e = new q(null);
    }

    protected q(Object object0) {
        this.a = object0;
        this.b = object0 == null ? a.a : a.b;
    }

    public static q a(Object object0) {
        return object0 == null ? q.e : new q(object0);
    }

    public static boolean b(v v0) {
        return v0 == q.e;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object c(h h0) {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public a d() {
        return this.b;
    }

    public static boolean e(v v0) {
        return v0 == q.d;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object f(h h0) {
        return u.a(this, h0);
    }

    public static q g() {
        return q.e;
    }

    public static q h() {
        return q.d;
    }
}

