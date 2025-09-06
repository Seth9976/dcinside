package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.Z2;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class u0 extends d1 implements Z2 {
    @s0({"SMAP\nRecentSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentSearch.kt\ncom/dcinside/app/realm/RecentSearch$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n120#2,3:92\n124#2:96\n1#3:95\n*S KotlinDebug\n*F\n+ 1 RecentSearch.kt\ncom/dcinside/app/realm/RecentSearch$Companion\n*L\n79#1:92,3\n79#1:96\n79#1:95\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final u0 a(int v, @l String s) {
            L.p(s, "text");
            u0 u00 = new u0();
            u00.Y5(this.c(v, s));
            u00.a6(s);
            u00.b6(System.currentTimeMillis());
            u00.c6(v);
            u00.Z5(1);
            return u00;
        }

        @n
        public final boolean b(@l String s) {
            boolean z;
            L.p(s, "text");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                z = false;
                String s1 = u0.i.c(0, s);
                u0 u00 = (u0)f00.C4(u0.class).i0("key", s1).f0("type", 0).r0();
                if(u00 != null) {
                    L.m(u00);
                    if(u00.S5() >= 3) {
                        z = true;
                    }
                }
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return z;
        }

        @l
        @n
        public final String c(int v, @l String s) {
            L.p(s, "text");
            return v + "_" + s;
        }
    }

    @e
    @m
    private String d;
    @m
    private String e;
    @h3.c
    private long f;
    @h3.c
    private int g;
    private int h;
    @l
    public static final a i = null;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;

    static {
        u0.i = new a(null);
    }

    public u0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.Z2
    public String D() {
        return this.e;
    }

    @Override  // io.realm.Z2
    public int O0() {
        return this.h;
    }

    @l
    @n
    public static final u0 Q5(int v, @l String s) {
        return u0.i.a(v, s);
    }

    @m
    public String R5() {
        return this.i();
    }

    public int S5() {
        return this.O0();
    }

    @m
    public String T5() {
        return this.D();
    }

    public long U5() {
        return this.d();
    }

    public int V5() {
        return this.v();
    }

    @Override  // io.realm.Z2
    public void W(String s) {
        this.e = s;
    }

    @n
    public static final boolean W5(@l String s) {
        return u0.i.b(s);
    }

    @l
    @n
    public static final String X5(int v, @l String s) {
        return u0.i.c(v, s);
    }

    public void Y5(@m String s) {
        this.n(s);
    }

    public void Z5(int v) {
        this.t2(v);
    }

    public void a6(@m String s) {
        this.W(s);
    }

    public void b6(long v) {
        this.c(v);
    }

    @Override  // io.realm.Z2
    public void c(long v) {
        this.f = v;
    }

    public void c6(int v) {
        this.z(v);
    }

    @Override  // io.realm.Z2
    public long d() {
        return this.f;
    }

    @Override  // io.realm.Z2
    public String i() {
        return this.d;
    }

    @Override  // io.realm.Z2
    public void n(String s) {
        this.d = s;
    }

    @Override  // io.realm.Z2
    public void t2(int v) {
        this.h = v;
    }

    @Override  // io.realm.Z2
    public int v() {
        return this.g;
    }

    @Override  // io.realm.Z2
    public void z(int v) {
        this.g = v;
    }
}

