package com.dcinside.app.type;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum q {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final q a(int v) {
            q q0 = q.e;
            if(v != q0.d()) {
                q q1 = q.f;
                if(v == q1.d()) {
                    return q1;
                }
                return v == q.g.d() ? q.g : q0;
            }
            return q0;
        }
    }

    COUNT(0, null, 0x7F150568),  // string:main_new_dcbest_unit_count "조회"
    RECOMMEND(1, "best", 0x7F150569),  // string:main_new_dcbest_unit_recommend "추천"
    REPLY(2, "light", 0x7F15056A);  // string:main_new_dcbest_unit_reply "댓글"

    private final int a;
    @m
    private final String b;
    private final int c;
    @l
    public static final a d;
    private static final q[] h;
    private static final kotlin.enums.a i;

    static {
        q.h = arr_q;
        L.p(arr_q, "entries");
        q.i = new d(arr_q);
        q.d = new a(null);
    }

    private q(int v1, String s1, int v2) {
        this.a = v1;
        this.b = s1;
        this.c = v2;
    }

    private static final q[] a() [...] // Inlined contents

    @m
    public final String b() {
        return this.b;
    }

    @l
    public static kotlin.enums.a c() {
        return q.i;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.c;
    }
}

