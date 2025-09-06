package com.dcinside.app.realm;

import com.dcinside.app.util.Bk;
import h3.e;
import io.realm.F0;
import io.realm.N2;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.r1;
import java.util.Date;
import java.util.List;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class f0 extends d1 implements N2 {
    @s0({"SMAP\nPostHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistory.kt\ncom/dcinside/app/realm/PostHistory$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n120#2,3:140\n124#2:144\n120#2,3:145\n124#2:149\n1#3:143\n1#3:148\n*S KotlinDebug\n*F\n+ 1 PostHistory.kt\ncom/dcinside/app/realm/PostHistory$Companion\n*L\n107#1:140,3\n107#1:144\n116#1:145,3\n116#1:149\n107#1:143\n116#1:148\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        @n
        public final h0 a(@l String s, int v) {
            L.p(s, "findId");
            f0 f00 = this.c(s);
            if(f00 == null) {
                return null;
            }
            h0 h00 = new h0();
            h00.b6(System.currentTimeMillis() + ((long)v));
            h00.X5(f00.W5());
            h00.Y5(f00.X5());
            String s1 = f00.T5();
            if(s1 == null) {
                s1 = "";
            }
            Date date0 = Bk.h(s1);
            h00.d6((date0 == null ? 0L : date0.getTime()));
            h00.c6(f00.g6());
            h00.Z5(f00.c6());
            h00.a6(String.valueOf(f00.d6()));
            return h00;
        }

        @m
        @n
        public final List b(@l String s) {
            List list0;
            L.p(s, "galleryId");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                list0 = f00.C4(f0.class).i0("galleryId", s).g2("date", r1.c).p0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return list0;
        }

        @m
        @n
        public final f0 c(@m String s) {
            f0 f01;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                f01 = (f0)f00.C4(f0.class).i0("key", s).r0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return f01;
        }

        @l
        @n
        public final String d(@m String s, int v) {
            if(s == null) {
                s = "";
            }
            return s + "_" + v;
        }

        public static String e(a f0$a0, String s, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = "";
            }
            return f0$a0.d(s, v);
        }
    }

    @e
    @m
    private String d;
    @h3.c
    @m
    private String e;
    @m
    private String f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    @m
    private String p;
    @m
    private String q;
    @m
    private String r;
    @h3.c
    private long s;
    @l
    public static final a t;

    static {
        f0.t = new a(null);
    }

    public f0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.N2
    public void E0(boolean z) {
        this.k = z;
    }

    @Override  // io.realm.N2
    public boolean F3() {
        return this.i;
    }

    @Override  // io.realm.N2
    public void J1(boolean z) {
        this.l = z;
    }

    @Override  // io.realm.N2
    public boolean J4() {
        return this.j;
    }

    @m
    @n
    public static final h0 Q5(@l String s, int v) {
        return f0.t.a(s, v);
    }

    @m
    @n
    public static final List R5(@l String s) {
        return f0.t.b(s);
    }

    @m
    @n
    public static final f0 S5(@m String s) {
        return f0.t.c(s);
    }

    @m
    public String T5() {
        return this.p();
    }

    public boolean U5() {
        return this.y1();
    }

    public boolean V5() {
        return this.r3();
    }

    @m
    public String W5() {
        return this.a();
    }

    @m
    public String X5() {
        return this.j();
    }

    @Override  // io.realm.N2
    public void Y0(boolean z) {
        this.o = z;
    }

    public boolean Y5() {
        return this.f5();
    }

    public boolean Z5() {
        return this.k0();
    }

    @Override  // io.realm.N2
    public String a() {
        return this.e;
    }

    @m
    public String a6() {
        return this.i();
    }

    @Override  // io.realm.N2
    public void b(String s) {
        this.e = s;
    }

    public boolean b6() {
        return this.e1();
    }

    @Override  // io.realm.N2
    public void c(long v) {
        this.s = v;
    }

    @m
    public String c6() {
        return this.f();
    }

    @Override  // io.realm.N2
    public long d() {
        return this.s;
    }

    public int d6() {
        return this.g();
    }

    @Override  // io.realm.N2
    public void e(String s) {
        this.r = s;
    }

    @Override  // io.realm.N2
    public boolean e1() {
        return this.k;
    }

    public boolean e6() {
        return this.u2();
    }

    @Override  // io.realm.N2
    public String f() {
        return this.r;
    }

    @Override  // io.realm.N2
    public boolean f5() {
        return this.o;
    }

    public boolean f6() {
        return this.J4();
    }

    @Override  // io.realm.N2
    public int g() {
        return this.g;
    }

    @m
    public String g6() {
        return this.k();
    }

    @Override  // io.realm.N2
    public void h(String s) {
        this.f = s;
    }

    public long h6() {
        return this.d();
    }

    @Override  // io.realm.N2
    public String i() {
        return this.d;
    }

    @Override  // io.realm.N2
    public void i1(boolean z) {
        this.j = z;
    }

    public boolean i6() {
        return this.F3();
    }

    @Override  // io.realm.N2
    public String j() {
        return this.f;
    }

    @l
    @n
    public static final String j6(@m String s, int v) {
        return f0.t.d(s, v);
    }

    @Override  // io.realm.N2
    public String k() {
        return this.p;
    }

    @Override  // io.realm.N2
    public boolean k0() {
        return this.m;
    }

    public void k6(@m String s) {
        this.r(s);
    }

    @Override  // io.realm.N2
    public void l(String s) {
        this.p = s;
    }

    public void l6(boolean z) {
        this.n0(z);
    }

    @Override  // io.realm.N2
    public void m1(boolean z) {
        this.h = z;
    }

    public void m6(boolean z) {
        this.J1(z);
    }

    @Override  // io.realm.N2
    public void n(String s) {
        this.d = s;
    }

    @Override  // io.realm.N2
    public void n0(boolean z) {
        this.n = z;
    }

    public void n6(@m String s) {
        this.b(s);
    }

    @Override  // io.realm.N2
    public void o(int v) {
        this.g = v;
    }

    public void o6(@m String s) {
        this.h(s);
    }

    @Override  // io.realm.N2
    public String p() {
        return this.q;
    }

    public void p6(boolean z) {
        this.Y0(z);
    }

    public void q6(boolean z) {
        this.z0(z);
    }

    @Override  // io.realm.N2
    public void r(String s) {
        this.q = s;
    }

    @Override  // io.realm.N2
    public boolean r3() {
        return this.l;
    }

    public void r6(@m String s) {
        this.n(s);
    }

    public void s6(boolean z) {
        this.E0(z);
    }

    public void t6(@m String s) {
        this.e(s);
    }

    @Override  // io.realm.N2
    public boolean u2() {
        return this.h;
    }

    @Override  // io.realm.N2
    public void u3(boolean z) {
        this.i = z;
    }

    public void u6(int v) {
        this.o(v);
    }

    public void v6(boolean z) {
        this.m1(z);
    }

    public void w6(boolean z) {
        this.i1(z);
    }

    public void x6(@m String s) {
        this.l(s);
    }

    @Override  // io.realm.N2
    public boolean y1() {
        return this.n;
    }

    public void y6(long v) {
        this.c(v);
    }

    @Override  // io.realm.N2
    public void z0(boolean z) {
        this.m = z;
    }

    public void z6(boolean z) {
        this.u3(z);
    }
}

