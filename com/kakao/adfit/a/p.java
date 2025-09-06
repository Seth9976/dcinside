package com.kakao.adfit.a;

import kotlin.jvm.internal.w;

public final class p {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final p a(t t0) {
            if(t0 != null) {
                return (t0.f() != null || t0.e() != null ? t0 : null) == null ? null : new p(t0.f(), t0.e());
            }
            return null;
        }
    }

    private final Long a;
    private final Float b;
    public static final a c;

    static {
        p.c = new a(null);
    }

    public p(Long long0, Float float0) {
        this.a = long0;
        this.b = float0;
    }

    public final Float a() {
        return this.b;
    }

    public final Long b() {
        return this.a;
    }
}

