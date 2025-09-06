package com.github.mikephil.charting.utils;

import java.util.List;

public class f extends a {
    public double c;
    public double d;
    private static h e;

    static {
        h h0 = h.a(0x40, new f(0.0, 0.0));
        f.e = h0;
        h0.l(0.5f);
    }

    private f(double f, double f1) {
        this.c = f;
        this.d = f1;
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected a a() {
        return new f(0.0, 0.0);
    }

    public static f b(double f, double f1) {
        f f2 = (f)f.e.b();
        f2.c = f;
        f2.d = f1;
        return f2;
    }

    public static void c(f f0) {
        f.e.g(f0);
    }

    public static void d(List list0) {
        f.e.h(list0);
    }

    @Override
    public String toString() {
        return "MPPointD, x: " + this.c + ", y: " + this.d;
    }
}

