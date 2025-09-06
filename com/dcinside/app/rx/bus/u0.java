package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class u0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final String a;
    private final boolean b;
    private final int c;
    @l
    public static final a d = null;
    public static final int e = 0;
    public static final int f = 1;

    static {
        u0.d = new a(null);
    }

    public u0(@l String s, boolean z, int v) {
        L.p(s, "vr");
        super();
        this.a = s;
        this.b = z;
        this.c = v;
    }

    public final int a() {
        return this.c;
    }

    @l
    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }
}

