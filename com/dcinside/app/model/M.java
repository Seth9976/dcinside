package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public final class m {
    public static enum a {
        REPLY_WRITE;

        private static final a[] b;
        private static final kotlin.enums.a c;

        static {
            a.b = arr_m$a;
            L.p(arr_m$a, "entries");
            a.c = new d(arr_m$a);
        }

        private static final a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return a.c;
        }
    }

    @c("message")
    @y4.m
    private final String a;
    @c("button")
    @y4.m
    private final String b;
    @c("detail")
    @y4.m
    private final String c;
    @c("link")
    @y4.m
    private final String d;

    public m(@y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @y4.m
    public final String a() {
        return this.b;
    }

    @y4.m
    public final String b() {
        return this.c;
    }

    @y4.m
    public final String c() {
        return this.d;
    }

    @y4.m
    public final String d() {
        return this.a;
    }
}

