package com.dcinside.app.type;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum p {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final p a(int v) {
            p p0 = p.d;
            if(v != p0.d()) {
                p0 = p.e;
                if(v != p0.d()) {
                    p p1 = p.f;
                    if(v == p1.d()) {
                        return p1;
                    }
                    return v == p.g.d() ? p.g : p0;
                }
            }
            return p0;
        }
    }

    ALL(0, null),
    BEST(1, "best"),
    LITE(2, "light"),
    RANKING(3, null);

    private final int a;
    @m
    private final String b;
    @l
    public static final a c;
    private static final p[] h;
    private static final kotlin.enums.a i;

    static {
        p.h = arr_p;
        L.p(arr_p, "entries");
        p.i = new d(arr_p);
        p.c = new a(null);
    }

    private p(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    private static final p[] a() [...] // Inlined contents

    @m
    public final String b() {
        return this.b;
    }

    @l
    public static kotlin.enums.a c() {
        return p.i;
    }

    public final int d() {
        return this.a;
    }
}

