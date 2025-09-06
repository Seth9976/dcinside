package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;

public final class j implements Serializable {
    public static enum a {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE;

    }

    protected final a a;
    protected final boolean b;
    protected final boolean c;
    private static final long d = 1L;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;

    static {
        j.e = new j(a.c);
        j.f = new j(a.b);
        j.g = new j(a.a);
        j.h = new j(a.d);
    }

    protected j(a j$a0) {
        this(j$a0, false, false);
    }

    protected j(a j$a0, boolean z, boolean z1) {
        this.a = j$a0;
        this.b = z;
        this.c = z1;
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    // 去混淆评级： 中等(50)
    public boolean c(Class class0) {
        return this.b ? false : this.c || !h.a0(class0) || Throwable.class.isAssignableFrom(class0);
    }

    public boolean d() {
        return this.a == a.a;
    }

    public boolean e() {
        return this.a == a.b;
    }

    public a f() {
        return this.a;
    }

    public j g(boolean z) {
        return new j(this.a, this.b, z);
    }

    public j h(boolean z) {
        return new j(this.a, z, this.c);
    }

    public j i(a j$a0) {
        return new j(j$a0, this.b, this.c);
    }
}

