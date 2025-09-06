package com.dcinside.app.realm;

import io.realm.F0;
import io.realm.X0;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.t2;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class t extends d1 implements t2 {
    @s0({"SMAP\nGuestUserInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuestUserInfo.kt\ncom/dcinside/app/realm/GuestUserInfo$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,74:1\n120#2,3:75\n124#2:79\n112#2,3:80\n129#2,3:84\n132#2,12:88\n116#2:100\n129#2,15:101\n112#2,3:116\n129#2,3:120\n132#2,12:125\n116#2:137\n129#2,15:138\n1#3:78\n1#3:83\n1#3:119\n1#3:124\n62#4:87\n62#4:123\n*S KotlinDebug\n*F\n+ 1 GuestUserInfo.kt\ncom/dcinside/app/realm/GuestUserInfo$Companion\n*L\n41#1:75,3\n41#1:79\n52#1:80,3\n52#1:84,3\n52#1:88,12\n52#1:100\n52#1:101,15\n65#1:116,3\n65#1:120,3\n65#1:125,12\n65#1:137\n65#1:138,15\n41#1:78\n52#1:83\n65#1:119\n54#1:87\n67#1:123\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final t a() {
            t t1;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                t t0 = (t)f00.C4(t.class).r0();
                t1 = t0 == null ? new t() : ((t)f00.d2(t0));
                goto label_13;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(f00, throwable0);
                throw throwable1;
            }
        label_13:
            c.a(f00, null);
            L.m(t1);
            return t1;
        }

        @n
        public final void b(boolean z, @m String s, @m String s1) {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z1 = f00.E0();
            class0 = t.class;
            if(z1) {
                goto label_23;
            }
            else {
                f00.beginTransaction();
                goto label_6;
            }
            goto label_42;
            try {
            label_6:
                t t0 = (t)f00.C4(class0).r0();
                if(t0 == null) {
                    X0 x00 = f00.i3(class0);
                    L.o(x00, "this.createObject(T::class.java)");
                    t0 = (t)x00;
                }
                L.m(t0);
                t0.Y5(z);
                t0.Z5(s);
                t0.a6(s1);
                t0.b6("");
                t0.c6("");
                f00.p();
                goto label_42;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_23:
                t t1 = (t)f00.C4(class0).r0();
                if(t1 == null) {
                    X0 x01 = f00.i3(class0);
                    L.o(x01, "this.createObject(T::class.java)");
                    t1 = (t)x01;
                }
                L.m(t1);
                t1.Y5(z);
                t1.Z5(s);
                t1.a6(s1);
                t1.b6("");
                t1.c6("");
                goto label_42;
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
        label_42:
            c.a(f00, null);
        }

        @n
        public final void c(@m String s, @m String s1) {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = t.class;
            if(z) {
                goto label_21;
            }
            else {
                f00.beginTransaction();
                goto label_6;
            }
            goto label_38;
            try {
            label_6:
                t t0 = (t)f00.C4(class0).r0();
                if(t0 == null) {
                    X0 x00 = f00.i3(class0);
                    L.o(x00, "this.createObject(T::class.java)");
                    t0 = (t)x00;
                }
                L.m(t0);
                if(s != null) {
                    t0.b6(s);
                }
                t0.c6(s1);
                f00.p();
                goto label_38;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_21:
                t t1 = (t)f00.C4(class0).r0();
                if(t1 == null) {
                    X0 x01 = f00.i3(class0);
                    L.o(x01, "this.createObject(T::class.java)");
                    t1 = (t)x01;
                }
                L.m(t1);
                if(s != null) {
                    t1.b6(s);
                }
                t1.c6(s1);
                goto label_38;
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
        label_38:
            c.a(f00, null);
        }
    }

    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    @m
    private String g;
    private boolean h;
    @l
    public static final a i;

    static {
        t.i = new a(null);
    }

    public t() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.t2
    public boolean H2() {
        return this.h;
    }

    @Override  // io.realm.t2
    public void I2(boolean z) {
        this.h = z;
    }

    @Override  // io.realm.t2
    public void L4(String s) {
        this.e = s;
    }

    @l
    @n
    public static final t Q5() {
        return t.i.a();
    }

    public boolean R5() {
        return this.H2();
    }

    @m
    public String S5() {
        return this.f();
    }

    @m
    public String T5() {
        return this.k2();
    }

    @m
    public String U5() {
        return this.p0();
    }

    @m
    public String V5() {
        return this.v4();
    }

    @n
    public static final void W5(boolean z, @m String s, @m String s1) {
        t.i.b(z, s, s1);
    }

    @n
    public static final void X5(@m String s, @m String s1) {
        t.i.c(s, s1);
    }

    public void Y5(boolean z) {
        this.I2(z);
    }

    public void Z5(@m String s) {
        this.e(s);
    }

    public void a6(@m String s) {
        this.L4(s);
    }

    public void b6(@m String s) {
        this.g5(s);
    }

    public void c6(@m String s) {
        this.w3(s);
    }

    @Override  // io.realm.t2
    public void e(String s) {
        this.d = s;
    }

    @Override  // io.realm.t2
    public String f() {
        return this.d;
    }

    @Override  // io.realm.t2
    public void g5(String s) {
        this.f = s;
    }

    @Override  // io.realm.t2
    public String k2() {
        return this.e;
    }

    @Override  // io.realm.t2
    public String p0() {
        return this.f;
    }

    @Override  // io.realm.t2
    public String v4() {
        return this.g;
    }

    @Override  // io.realm.t2
    public void w3(String s) {
        this.g = s;
    }
}

