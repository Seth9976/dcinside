package com.dcinside.app.rx.bus;

import com.dcinside.app.realm.u0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class c0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final int a;
    @m
    private final u0 b;
    @l
    public static final a c = null;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;

    static {
        c0.c = new a(null);
    }

    public c0(int v, @m u0 u00) {
        this.a = v;
        this.b = u00;
    }

    public c0(int v, u0 u00, int v1, w w0) {
        if((v1 & 2) != 0) {
            u00 = null;
        }
        this(v, u00);
    }

    @m
    public final u0 a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}

