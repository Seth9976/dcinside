package com.dcinside.app.rx;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d {
    @m
    private final Object a;
    @m
    private final Throwable b;

    public d() {
        this(null, null, 3, null);
    }

    public d(@m Object object0, @m Throwable throwable0) {
        this.a = object0;
        this.b = throwable0;
    }

    public d(Object object0, Throwable throwable0, int v, w w0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        this(object0, throwable0);
    }

    @m
    public final Object a() {
        return this.a;
    }

    @m
    public final Throwable b() {
        return this.b;
    }

    @l
    public final d c(@m Object object0, @m Throwable throwable0) {
        return new d(object0, throwable0);
    }

    public static d d(d d0, Object object0, Throwable throwable0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = d0.a;
        }
        if((v & 2) != 0) {
            throwable0 = d0.b;
        }
        return d0.c(object0, throwable0);
    }

    @m
    public final Throwable e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        return L.g(this.a, ((d)object0).a) ? L.g(this.b, ((d)object0).b) : false;
    }

    @m
    public final Object f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            v = throwable0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "Optional(value=" + this.a + ", err=" + this.b + ")";
    }
}

