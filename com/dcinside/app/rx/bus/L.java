package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final long a;
    @y4.l
    private final String b;
    private final boolean c;
    private final int d;
    @y4.l
    public static final a e = null;
    public static final int f = 0;
    public static final int g = 1;

    static {
        l.e = new a(null);
    }

    public l(long v, @y4.l String s, boolean z, int v1) {
        L.p(s, "url");
        super();
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = v1;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    @y4.l
    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }
}

