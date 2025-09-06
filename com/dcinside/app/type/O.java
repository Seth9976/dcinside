package com.dcinside.app.type;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public enum o {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        @n
        public final o a(int v) {
            switch(v) {
                case 0: {
                    return o.b;
                }
                case 1: {
                    return o.c;
                }
                case 2: {
                    return o.d;
                }
                default: {
                    return null;
                }
            }
        }
    }

    BASIC,
    SPLIT,
    READ_ONLY;

    @l
    public static final a a;
    private static final o[] e;
    private static final kotlin.enums.a f;

    static {
        o.e = arr_o;
        L.p(arr_o, "entries");
        o.f = new d(arr_o);
        o.a = new a(null);
    }

    private static final o[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return o.f;
    }

    @m
    @n
    public static final o c(int v) {
        return o.a.a(v);
    }
}

