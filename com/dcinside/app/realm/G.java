package com.dcinside.app.realm;

import h3.c;
import h3.e;
import io.realm.T1;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class g extends d1 implements T1 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final g a(@l String s) {
            L.p(s, "url");
            g g0 = new g();
            g0.T5(s);
            g0.S5(System.currentTimeMillis());
            return g0;
        }
    }

    @e
    @m
    private String d;
    @c
    private long e;
    @l
    public static final a f;

    static {
        g.f = new a(null);
    }

    public g() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.X("");
    }

    @Override  // io.realm.T1
    public String E() [...] // 潜在的解密器

    public long Q5() {
        return this.u();
    }

    // 去混淆评级： 低(20)
    @m
    public String R5() [...] // 潜在的解密器

    public void S5(long v) {
        this.y(v);
    }

    public void T5(@m String s) {
        this.X(s);
    }

    @Override  // io.realm.T1
    public void X(String s) {
        this.d = s;
    }

    @Override  // io.realm.T1
    public long u() {
        return this.e;
    }

    @Override  // io.realm.T1
    public void y(long v) {
        this.e = v;
    }
}

