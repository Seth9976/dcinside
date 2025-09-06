package com.dcinside.app.settings.spoiler;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final c a(int v) {
            c c0 = c.e;
            if(v != c0.c()) {
                c0 = c.f;
                if(v != c0.c()) {
                    return v == c.g.c() ? c.g : c.h;
                }
            }
            return c0;
        }
    }

    ALL(0, true, true),
    TITLE(1, true, false),
    READ(2, false, true),
    NONE(3, false, false);

    private final int a;
    private final boolean b;
    private final boolean c;
    @l
    public static final a d;
    private static final c[] i;
    private static final kotlin.enums.a j;

    static {
        c.i = arr_c;
        L.p(arr_c, "entries");
        c.j = new d(arr_c);
        c.d = new a(null);
    }

    private c(int v1, boolean z, boolean z1) {
        this.a = v1;
        this.b = z;
        this.c = z1;
    }

    private static final c[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return c.j;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }
}

