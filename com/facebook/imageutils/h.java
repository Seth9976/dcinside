package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class h {
    static final class a {
        private boolean a;
        private int b;
        private int c;

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final boolean c() {
            return this.a;
        }

        public final void d(int v) {
            this.b = v;
        }

        public final void e(int v) {
            this.c = v;
        }

        public final void f(boolean z) {
            this.a = z;
        }
    }

    @l
    public static final h a = null;
    @l
    private static final Class b = null;
    public static final int c = 0x4D4D002A;
    public static final int d = 0x49492A00;
    public static final int e = 274;
    public static final int f = 3;

    static {
        h.a = new h();
        h.b = h.class;
    }

    @n
    public static final int a(int v) {
        switch(v) {
            case 3: {
                return 180;
            }
            case 6: {
                return 90;
            }
            case 8: {
                return 270;
            }
            default: {
                return 0;
            }
        }
    }

    private final int b(InputStream inputStream0, int v, boolean z) throws IOException {
        if(v < 10) {
            return 0;
        }
        if(g.a(inputStream0, 2, z) != 3) {
            return 0;
        }
        return g.a(inputStream0, 4, z) == 1 ? g.a(inputStream0, 2, z) : 0;
    }

    private final int c(InputStream inputStream0, int v, boolean z, int v1) throws IOException {
        if(v < 14) {
            return 0;
        }
        int v2 = g.a(inputStream0, 2, z);
        int v3 = v - 2;
        while(v2 > 0 && v3 >= 12) {
            if(g.a(inputStream0, 2, z) == v1) {
                return v3 - 2;
            }
            inputStream0.skip(10L);
            v3 -= 12;
            --v2;
        }
        return 0;
    }

    @n
    public static final int d(@l InputStream inputStream0, int v) throws IOException {
        L.p(inputStream0, "stream");
        a h$a0 = new a();
        h h0 = h.a;
        int v1 = h0.e(inputStream0, v, h$a0);
        int v2 = h$a0.b();
        if(v1 != 0 && v2 - 8 <= v1) {
            inputStream0.skip(((long)(v2 - 8)));
            return h0.b(inputStream0, h0.c(inputStream0, v1 - (v2 - 8), h$a0.c(), 274), h$a0.c());
        }
        return 0;
    }

    private final int e(InputStream inputStream0, int v, a h$a0) throws IOException {
        if(v <= 8) {
            return 0;
        }
        h$a0.d(g.a(inputStream0, 4, false));
        if(h$a0.a() != 0x49492A00 && h$a0.a() != 0x4D4D002A) {
            x0.a.q(h.b, "Invalid TIFF header");
            return 0;
        }
        h$a0.f(h$a0.a() == 0x49492A00);
        h$a0.e(g.a(inputStream0, 4, h$a0.c()));
        if(h$a0.b() >= 8 && h$a0.b() - 8 <= v - 8) {
            return v - 8;
        }
        x0.a.q(h.b, "Invalid offset");
        return 0;
    }
}

