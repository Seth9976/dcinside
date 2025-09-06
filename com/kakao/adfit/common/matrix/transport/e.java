package com.kakao.adfit.common.matrix.transport;

import kotlin.jvm.internal.w;

public abstract class e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public static e a(a e$a0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            return e$a0.a(v);
        }

        public final e a(int v) {
            return new b(v);
        }

        public final e b(int v) {
            return v == 200 ? c.d : new d(v);
        }
    }

    private final boolean a;
    private final int b;
    public static final a c;

    static {
        e.c = new a(null);
    }

    private e(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    public e(boolean z, int v, w w0) {
        this(z, v);
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }
}

