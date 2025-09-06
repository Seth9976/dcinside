package com.dcinside.app.realm;

import com.dcinside.app.util.Bk;
import h3.e;
import io.realm.F0;
import io.realm.H2;
import io.realm.RealmQuery;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class c0 extends d1 implements H2 {
    @s0({"SMAP\nPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Policy.kt\ncom/dcinside/app/realm/Policy$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,80:1\n120#2,3:81\n124#2:86\n120#2,3:87\n124#2:91\n120#2,3:92\n124#2:96\n112#2,3:97\n129#2,15:101\n116#2:116\n129#2,15:117\n112#2,3:132\n129#2,15:136\n116#2:151\n129#2,15:152\n112#2,3:167\n129#2,15:171\n116#2:186\n129#2,15:187\n1#3:84\n1#3:90\n1#3:95\n1#3:100\n1#3:135\n1#3:170\n37#4:85\n*S KotlinDebug\n*F\n+ 1 Policy.kt\ncom/dcinside/app/realm/Policy$Companion\n*L\n27#1:81,3\n27#1:86\n36#1:87,3\n36#1:91\n41#1:92,3\n41#1:96\n45#1:97,3\n45#1:101,15\n45#1:116\n45#1:117,15\n54#1:132,3\n54#1:136,15\n54#1:151\n54#1:152,15\n72#1:167,3\n72#1:171,15\n72#1:186\n72#1:187,15\n27#1:84\n36#1:90\n41#1:95\n45#1:100\n54#1:135\n72#1:170\n28#1:85\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final long a(@m String s) {
            long v;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                c0 c00 = c0.h.b(s);
                v = c00 == null ? 0L : c00.Q5();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return v;
        }

        @m
        public final c0 b(@m String s) {
            c0 c00;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(c0.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                c00 = (c0)realmQuery0.i0("id", s).r0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return c00;
        }

        @n
        public final boolean c(@m String s) {
            boolean z;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                c0 c00 = c0.h.b(s);
                z = c00 == null ? false : c00.U5();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return z;
        }

        @n
        public final boolean d(@m String s, @m String s1) {
            c0 c00 = this.b(s);
            if((c00 == null ? null : c00.R5()) != null) {
                String s2 = c00.R5();
                if(s1 == null) {
                    s1 = Bk.G(System.currentTimeMillis());
                }
                return !L.g(s2, s1);
            }
            return true;
        }

        @n
        public final void e(@m String s, @m String s1) {
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                goto label_15;
            }
            else {
                f00.beginTransaction();
                goto label_4;
            }
            goto label_28;
            try {
            label_4:
                c0 c00 = c0.h.b(s);
                if(c00 != null) {
                    if(s1 == null) {
                        s1 = Bk.G(System.currentTimeMillis());
                    }
                    c00.Y5(s1);
                }
                f00.p();
                goto label_28;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_15:
                c0 c01 = c0.h.b(s);
                if(c01 != null) {
                    if(s1 == null) {
                        s1 = Bk.G(System.currentTimeMillis());
                    }
                    c01.Y5(s1);
                }
                goto label_28;
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable3) {
                c.a(f00, throwable0);
                throw throwable3;
            }
        label_28:
            c.a(f00, null);
        }

        public final void f(@m String s, long v) {
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                c0 c00 = c0.h.b(s);
                if(c00 != null) {
                    c00.X5(v);
                }
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_22;
            try {
            label_8:
                c0 c01 = c0.h.b(s);
                if(c01 != null) {
                    c01.X5(v);
                }
                f00.p();
                goto label_22;
            }
            catch(Throwable throwable1) {
            }
            try {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                c.a(f00, throwable0);
                throw throwable2;
            }
        label_22:
            c.a(f00, null);
        }

        @n
        public final void g(@m String s) {
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                c0 c00 = c0.h.b(s);
                if(c00 != null) {
                    c00.a6(true);
                }
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_22;
            try {
            label_8:
                c0 c01 = c0.h.b(s);
                if(c01 != null) {
                    c01.a6(true);
                }
                f00.p();
                goto label_22;
            }
            catch(Throwable throwable1) {
            }
            try {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                c.a(f00, throwable0);
                throw throwable2;
            }
        label_22:
            c.a(f00, null);
        }
    }

    @e
    @m
    private String d;
    private long e;
    private boolean f;
    @m
    private String g;
    @l
    public static final a h;

    static {
        c0.h = new a(null);
    }

    public c0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.H2
    public void H4(String s) {
        this.g = s;
    }

    @Override  // io.realm.H2
    public String O2() {
        return this.g;
    }

    public long Q5() {
        return this.y4();
    }

    @m
    public String R5() {
        return this.O2();
    }

    @Override  // io.realm.H2
    public void S4(boolean z) {
        this.f = z;
    }

    @m
    public String S5() {
        return this.m();
    }

    @n
    public static final long T5(@m String s) {
        return c0.h.a(s);
    }

    public boolean U5() {
        return this.V1();
    }

    @Override  // io.realm.H2
    public boolean V1() {
        return this.f;
    }

    @n
    public static final boolean V5(@m String s) {
        return c0.h.c(s);
    }

    @n
    public static final boolean W5(@m String s, @m String s1) {
        return c0.h.d(s, s1);
    }

    public void X5(long v) {
        this.n1(v);
    }

    public void Y5(@m String s) {
        this.H4(s);
    }

    public void Z5(@m String s) {
        this.q(s);
    }

    public void a6(boolean z) {
        this.S4(z);
    }

    @n
    public static final void b6(@m String s, @m String s1) {
        c0.h.e(s, s1);
    }

    @n
    public static final void c6(@m String s) {
        c0.h.g(s);
    }

    @Override  // io.realm.H2
    public String m() {
        return this.d;
    }

    @Override  // io.realm.H2
    public void n1(long v) {
        this.e = v;
    }

    @Override  // io.realm.H2
    public void q(String s) {
        this.d = s;
    }

    @Override  // io.realm.H2
    public long y4() {
        return this.e;
    }
}

