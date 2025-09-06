package com.kakao.adfit.a;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public abstract class v {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final b a(Exception exception0) {
            L.p(exception0, "e");
            return new b(exception0);
        }

        public final c a(Object object0) {
            return new c(object0);
        }
    }

    public static class b extends v {
        private final Exception b;

        public b(Exception exception0) {
            L.p(exception0, "e");
            super(null);
            this.b = exception0;
        }

        public final Exception a() {
            return this.b;
        }
    }

    public static class c extends v {
        private final Object b;

        public c(Object object0) {
            super(null);
            this.b = object0;
        }

        public final Object a() {
            return this.b;
        }
    }

    public static final a a;

    static {
        v.a = new a(null);
    }

    private v() {
    }

    public v(w w0) {
    }
}

