package com.dcinside.app.realm;

import com.dcinside.app.util.Bk;
import h3.e;
import io.realm.F0;
import io.realm.J2;
import io.realm.d1;
import io.realm.internal.s;
import java.util.Date;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class d0 extends d1 implements J2 {
    @s0({"SMAP\nPostArchive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostArchive.kt\ncom/dcinside/app/realm/PostArchive$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n120#2,3:95\n124#2:99\n1#3:98\n*S KotlinDebug\n*F\n+ 1 PostArchive.kt\ncom/dcinside/app/realm/PostArchive$Companion\n*L\n70#1:95,3\n70#1:99\n70#1:98\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        @n
        public final h0 a(@l String s, int v) {
            L.p(s, "findId");
            d0 d00 = this.b(s);
            if(d00 == null) {
                return null;
            }
            h0 h00 = new h0();
            h00.b6(System.currentTimeMillis() + ((long)v));
            h00.X5(d00.U5());
            h00.Y5(d00.V5());
            String s1 = d00.S5();
            if(s1 == null) {
                s1 = "";
            }
            Date date0 = Bk.h(s1);
            h00.d6((date0 == null ? 0L : date0.getTime()));
            h00.c6(d00.Y5());
            h00.Z5(d00.a6());
            h00.a6(String.valueOf(d00.X5()));
            return h00;
        }

        @m
        @n
        public final d0 b(@m String s) {
            d0 d00;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                d00 = (d0)f00.C4(d0.class).i0("key", s).r0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return d00;
        }

        @l
        @n
        public final String c(@m String s, int v) {
            if(s == null) {
                s = "";
            }
            return s + "_" + v;
        }

        public static String d(a d0$a0, String s, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = "";
            }
            return d0$a0.c(s, v);
        }
    }

    @e
    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    private int g;
    @m
    private String h;
    @m
    private String i;
    @m
    private String j;
    @m
    private com.dcinside.app.realm.c k;
    @h3.c
    private long l;
    @l
    public static final a m;

    static {
        d0.m = new a(null);
    }

    public d0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.J2
    public String I() {
        return this.j;
    }

    @Override  // io.realm.J2
    public void Q(String s) {
        this.j = s;
    }

    @m
    @n
    public static final h0 Q5(@l String s, int v) {
        return d0.m.a(s, v);
    }

    @m
    @n
    public static final d0 R5(@m String s) {
        return d0.m.b(s);
    }

    @m
    public String S5() {
        return this.p();
    }

    @m
    public com.dcinside.app.realm.c T5() {
        return this.c0();
    }

    @m
    public String U5() {
        return this.a();
    }

    @m
    public String V5() {
        return this.j();
    }

    @m
    public String W5() {
        return this.i();
    }

    public int X5() {
        return this.g();
    }

    @Override  // io.realm.J2
    public void Y(com.dcinside.app.realm.c c0) {
        this.k = c0;
    }

    @m
    public String Y5() {
        return this.k();
    }

    public long Z5() {
        return this.d();
    }

    @Override  // io.realm.J2
    public String a() {
        return this.e;
    }

    @m
    public String a6() {
        return this.I();
    }

    @Override  // io.realm.J2
    public void b(String s) {
        this.e = s;
    }

    @l
    @n
    public static final String b6(@m String s, int v) {
        return d0.m.c(s, v);
    }

    @Override  // io.realm.J2
    public void c(long v) {
        this.l = v;
    }

    @Override  // io.realm.J2
    public com.dcinside.app.realm.c c0() {
        return this.k;
    }

    public void c6(@m String s) {
        this.r(s);
    }

    @Override  // io.realm.J2
    public long d() {
        return this.l;
    }

    public void d6(@m com.dcinside.app.realm.c c0) {
        this.Y(c0);
    }

    public void e6(@m String s) {
        this.b(s);
    }

    public void f6(@m String s) {
        this.h(s);
    }

    @Override  // io.realm.J2
    public int g() {
        return this.g;
    }

    public void g6(@m String s) {
        this.n(s);
    }

    @Override  // io.realm.J2
    public void h(String s) {
        this.f = s;
    }

    public void h6(int v) {
        this.o(v);
    }

    @Override  // io.realm.J2
    public String i() {
        return this.d;
    }

    public void i6(@m String s) {
        this.l(s);
    }

    @Override  // io.realm.J2
    public String j() {
        return this.f;
    }

    public void j6(long v) {
        this.c(v);
    }

    @Override  // io.realm.J2
    public String k() {
        return this.h;
    }

    public void k6(@m String s) {
        this.Q(s);
    }

    @Override  // io.realm.J2
    public void l(String s) {
        this.h = s;
    }

    @Override  // io.realm.J2
    public void n(String s) {
        this.d = s;
    }

    @Override  // io.realm.J2
    public void o(int v) {
        this.g = v;
    }

    @Override  // io.realm.J2
    public String p() {
        return this.i;
    }

    @Override  // io.realm.J2
    public void r(String s) {
        this.i = s;
    }
}

