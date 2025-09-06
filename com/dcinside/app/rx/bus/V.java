package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class v {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private final String a;
    @m
    private final String b;
    private final int c;
    @l
    public static final a d = null;
    @l
    public static final String e = "write";
    @l
    public static final String f = "open";

    static {
        v.d = new a(null);
    }

    public v(@m String s, @m String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    public v(String s, String s1, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            v = -1;
        }
        this(s, s1, v);
    }

    public final int a() {
        return this.c;
    }

    @m
    public final String b() {
        return this.a;
    }

    @m
    public final String c() {
        return this.b;
    }
}

