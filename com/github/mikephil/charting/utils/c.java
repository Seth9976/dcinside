package com.github.mikephil.charting.utils;

import java.util.List;

public final class c extends a {
    public float c;
    public float d;
    private static h e;

    static {
        h h0 = h.a(0x100, new c(0.0f, 0.0f));
        c.e = h0;
        h0.l(0.5f);
    }

    public c() {
    }

    public c(float f, float f1) {
        this.c = f;
        this.d = f1;
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected a a() {
        return new c(0.0f, 0.0f);
    }

    public static c b(float f, float f1) {
        c c0 = (c)c.e.b();
        c0.c = f;
        c0.d = f1;
        return c0;
    }

    public static void c(c c0) {
        c.e.g(c0);
    }

    public static void d(List list0) {
        c.e.h(list0);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return this == object0 ? true : object0 instanceof c && this.c == ((c)object0).c && this.d == ((c)object0).d;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.d);
    }

    @Override
    public String toString() {
        return this.c + "x" + this.d;
    }
}

