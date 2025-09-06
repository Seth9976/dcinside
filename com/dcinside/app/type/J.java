package com.dcinside.app.type;

import android.content.Context;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

public enum j {
    @s0({"SMAP\nFixAdjustSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixAdjustSize.kt\ncom/dcinside/app/type/FixAdjustSize$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1310#2,2:50\n*S KotlinDebug\n*F\n+ 1 FixAdjustSize.kt\ncom/dcinside/app/type/FixAdjustSize$Companion\n*L\n45#1:50,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final j a(int v) {
            j[] arr_j = j.values();
            for(int v1 = 0; v1 < arr_j.length; ++v1) {
                j j0 = arr_j[v1];
                if(v == j0.d()) {
                    return j0 == null ? j.h : j0;
                }
            }
            return j.h;
        }
    }

    SMALLEST(3, -3, 0x7F150860),  // string:read_text_size_0 "아주 작게"
    SMALLER(4, -2, 0x7F150861),  // string:read_text_size_1 "더 작게"
    SMALL(0, -1, 0x7F150862),  // string:read_text_size_2 "작게"
    NORMAL(1, 0, 0x7F150863),  // string:read_text_size_3 "보통"
    BIG(2, 1, 0x7F150864),  // string:read_text_size_4 "크게"
    BIGGER(5, 2, 0x7F150865),  // string:read_text_size_5 "더 크게"
    BIGGEST(6, 3, 0x7F150866);  // string:read_text_size_6 "아주 크게"

    private final int a;
    private final int b;
    private final int c;
    @l
    public static final a d;
    private static final j[] l;
    private static final kotlin.enums.a m;

    static {
        j.l = arr_j;
        L.p(arr_j, "entries");
        j.m = new d(arr_j);
        j.d = new a(null);
    }

    private j(int v1, int v2, int v3) {
        this.a = v1;
        this.b = v2;
        this.c = v3;
    }

    private static final j[] a() [...] // Inlined contents

    public final int b() {
        return this.b;
    }

    @l
    public static kotlin.enums.a c() {
        return j.m;
    }

    public final int d() {
        return this.a;
    }

    @l
    public final String e(@l Context context0) {
        L.p(context0, "context");
        String s = context0.getString(this.c);
        L.o(s, "getString(...)");
        return s;
    }

    @l
    @n
    public static final j f(int v) {
        return j.d.a(v);
    }
}

