package com.dcinside.app.rx.bus;

import com.dcinside.app.response.j;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class a0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final int a;
    private final int b;
    @l
    private final j c;
    private final boolean d;
    @l
    public static final a e = null;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;

    static {
        a0.e = new a(null);
    }

    public a0(int v, int v1, @l j j0, boolean z) {
        L.p(j0, "replyItem");
        super();
        this.a = v;
        this.b = v1;
        this.c = j0;
        this.d = z;
    }

    public a0(int v, int v1, j j0, boolean z, int v2, w w0) {
        if((v2 & 8) != 0) {
            z = true;
        }
        this(v, v1, j0, z);
    }

    public final int a() {
        return this.b;
    }

    @l
    public final j b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }
}

