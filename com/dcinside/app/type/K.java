package com.dcinside.app.type;

import android.content.Context;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

public enum k {
    @s0({"SMAP\nFixPointSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixPointSize.kt\ncom/dcinside/app/type/FixPointSize$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n1310#2,2:47\n*S KotlinDebug\n*F\n+ 1 FixPointSize.kt\ncom/dcinside/app/type/FixPointSize$Companion\n*L\n42#1:47,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final k a(int v) {
            k[] arr_k = k.values();
            for(int v1 = 0; v1 < arr_k.length; ++v1) {
                k k0 = arr_k[v1];
                if(v == k0.c()) {
                    return k0 == null ? k.g : k0;
                }
            }
            return k.g;
        }
    }

    SMALLEST(10, 0x7F150860),  // string:read_text_size_0 "아주 작게"
    SMALLER(12, 0x7F150861),  // string:read_text_size_1 "더 작게"
    SMALL(14, 0x7F150862),  // string:read_text_size_2 "작게"
    NORMAL(16, 0x7F150863),  // string:read_text_size_3 "보통"
    BIG(18, 0x7F150864),  // string:read_text_size_4 "크게"
    BIGGER(20, 0x7F150865),  // string:read_text_size_5 "더 크게"
    BIGGEST(22, 0x7F150866);  // string:read_text_size_6 "아주 크게"

    private final int a;
    private final int b;
    @l
    public static final a c;
    private static final k[] k;
    private static final kotlin.enums.a l;

    static {
        k.k = arr_k;
        L.p(arr_k, "entries");
        k.l = new d(arr_k);
        k.c = new a(null);
    }

    private k(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final k[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return k.l;
    }

    public final int c() {
        return this.a;
    }

    @l
    public final String d(@l Context context0) {
        L.p(context0, "context");
        String s = context0.getString(this.b);
        L.o(s, "getString(...)");
        return s;
    }

    @l
    @n
    public static final k e(int v) {
        return k.c.a(v);
    }
}

