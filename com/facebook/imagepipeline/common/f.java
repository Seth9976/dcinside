package com.facebook.imagepipeline.common;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

public enum f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final f a(@l f f0, @l f f1) {
            L.p(f0, "priority1");
            L.p(f1, "priority2");
            return f0.ordinal() > f1.ordinal() ? f0 : f1;
        }
    }

    LOW,
    MEDIUM,
    HIGH;

    @l
    public static final a a;
    private static final f[] e;
    private static final kotlin.enums.a f;

    static {
        f.e = arr_f;
        L.p(arr_f, "entries");
        f.f = new d(arr_f);
        f.a = new a(null);
    }

    private static final f[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return f.f;
    }

    @l
    @n
    public static final f c(@l f f0, @l f f1) {
        return f.a.a(f0, f1);
    }
}

