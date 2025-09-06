package com.dcinside.app.post;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum k0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final k0 a(int v) {
            switch(v) {
                case 0: {
                    return k0.c;
                }
                case 1: {
                    return k0.d;
                }
                case 2: {
                    return k0.e;
                }
                default: {
                    return k0.c;
                }
            }
        }
    }

    ALL(0),
    READ(1),
    UNREAD(2);

    private final int a;
    @l
    public static final a b;
    private static final k0[] f;
    private static final kotlin.enums.a g;

    static {
        k0.f = arr_k0;
        L.p(arr_k0, "entries");
        k0.g = new d(arr_k0);
        k0.b = new a(null);
    }

    private k0(int v1) {
        this.a = v1;
    }

    private static final k0[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return k0.g;
    }

    public final int c() {
        return this.a;
    }
}

