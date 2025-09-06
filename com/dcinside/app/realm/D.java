package com.dcinside.app.realm;

import A3.o;
import android.annotation.SuppressLint;
import h3.e;
import io.realm.F0;
import io.realm.R1;
import io.realm.T0;
import io.realm.W;
import io.realm.X0;
import io.realm.d1;
import io.realm.g1;
import io.realm.internal.s;
import io.realm.r1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class d extends d1 implements R1 {
    @s0({"SMAP\nArchiveFolderParent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveFolderParent.kt\ncom/dcinside/app/realm/ArchiveFolderParent$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,150:1\n131#1:181\n133#1,12:185\n146#1:209\n131#1:210\n133#1,12:214\n146#1:238\n129#2,15:151\n129#2,15:166\n129#2,3:182\n132#2,12:197\n129#2,3:211\n132#2,12:226\n129#2,15:239\n*S KotlinDebug\n*F\n+ 1 ArchiveFolderParent.kt\ncom/dcinside/app/realm/ArchiveFolderParent$Companion\n*L\n113#1:181\n113#1:185,12\n113#1:209\n118#1:210\n118#1:214,12\n118#1:238\n56#1:151,15\n96#1:166,15\n113#1:182,3\n113#1:197,12\n118#1:211,3\n118#1:226,12\n131#1:239,15\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final c a(@l F0 f00, int v, @m String s) {
            L.p(f00, "realm");
            d d0 = this.c(f00, v);
            if(s == null) {
                s = "기본";
                L.o("기본", "getString(...)");
            }
            c c0 = (c)d0.S5().x4().i0("name", s).r0();
            if(c0 == null) {
                if(f00.E0()) {
                    c c1 = new c();
                    c1.T5(d.f.e());
                    c1.U5(s);
                    X0 x00 = f00.o2(c1, new W[0]);
                    L.o(x00, "copyToRealm(...)");
                    d0.S5().add(((c)x00));
                    return (c)x00;
                }
                f00.beginTransaction();
                try {
                    c c2 = new c();
                    c2.T5(d.f.e());
                    c2.U5(s);
                    X0 x01 = f00.o2(c2, new W[0]);
                    L.o(x01, "copyToRealm(...)");
                    d0.S5().add(((c)x01));
                    f00.p();
                    return (c)x01;
                }
                catch(Throwable throwable0) {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                }
            }
            return c0;
        }

        @m
        @n
        public final c b(@l F0 f00, long v) {
            L.p(f00, "realm");
            return (c)f00.C4(c.class).g0("key", v).r0();
        }

        @l
        @n
        public final d c(@l F0 f00, int v) {
            L.p(f00, "realm");
            d d0 = (d)f00.C4(d.class).f0("type", v).r0();
            if(d0 == null) {
                if(f00.E0()) {
                    d d1 = new d();
                    d1.d6(v);
                    X0 x00 = f00.t2(d1, new W[0]);
                    L.o(x00, "copyToRealmOrUpdate(...)");
                    c c0 = new c();
                    c0.T5(d.f.e());
                    c0.U5("기본");
                    X0 x01 = f00.o2(c0, new W[0]);
                    L.o(x01, "copyToRealm(...)");
                    ((d)x00).S5().add(((c)x01));
                    return (d)x00;
                }
                f00.beginTransaction();
                try {
                    d d2 = new d();
                    d2.d6(v);
                    X0 x02 = f00.t2(d2, new W[0]);
                    L.o(x02, "copyToRealmOrUpdate(...)");
                    c c1 = new c();
                    c1.T5(d.f.e());
                    c1.U5("기본");
                    X0 x03 = f00.o2(c1, new W[0]);
                    L.o(x03, "copyToRealm(...)");
                    ((d)x02).S5().add(((c)x03));
                    f00.p();
                    return (d)x02;
                }
                catch(Throwable throwable0) {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                }
            }
            return d0;
        }

        @l
        @n
        public final g1 d(@l F0 f00, int v, long v1) {
            L.p(f00, "realm");
            g1 g10 = this.c(f00, v).S5().x4().g2("recentTime", r1.c).F1(v1).p0();
            L.o(g10, "findAll(...)");
            return g10;
        }

        // 去混淆评级： 低(40)
        @n
        public final long e() {
            d.g = System.currentTimeMillis();
            return 0L;
        }

        @n
        public final boolean f(@l F0 f00, int v, @l String s) {
            L.p(f00, "realm");
            L.p(s, "name");
            return this.c(f00, v).S5().x4().i0("name", s).r0() != null;
        }

        @n
        public final boolean g(@l F0 f00, long v) {
            L.p(f00, "realm");
            return f00.C4(c.class).g0("key", v).r0() != null;
        }

        public final void h(F0 f00, long v, long v1, o o0) {
            L.p(f00, "realm");
            L.p(o0, "replacer");
            if(this.g(f00, v)) {
                boolean z = f00.E0();
                Class class0 = d1.class;
                if(!z) {
                    goto label_23;
                }
                L.y(4, "T");
                g1 g10 = f00.C4(class0).g0("folder.key", v).p0();
                if(v1 > 0L) {
                    c c0 = d.f.b(f00, v1);
                    if(c0 != null) {
                        for(Object object0: g10) {
                            L.m(((d1)object0));
                            o0.invoke(((d1)object0), c0);
                        }
                    }
                }
                else {
                    g10.L0();
                }
                c c1 = d.f.b(f00, v);
                if(c1 != null) {
                    c1.z5();
                    return;
                label_23:
                    f00.beginTransaction();
                    try {
                        L.y(4, "T");
                        g1 g11 = f00.C4(class0).g0("folder.key", v).p0();
                        if(v1 <= 0L) {
                            g11.L0();
                        }
                        else {
                            c c2 = d.f.b(f00, v1);
                            if(c2 != null) {
                                for(Object object1: g11) {
                                    L.m(((d1)object1));
                                    o0.invoke(((d1)object1), c2);
                                }
                            }
                        }
                        c c3 = d.f.b(f00, v);
                        if(c3 != null) {
                            c3.z5();
                        }
                        f00.p();
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                }
            }
        }

        @SuppressLint({"SwitchIntDef"})
        @n
        public final void i(@l F0 f00, int v, long v1, long v2) {
            L.p(f00, "realm");
            switch(v) {
                case 0: {
                    if(this.g(f00, v1)) {
                        boolean z = f00.E0();
                        Class class0 = d0.class;
                        if(!z) {
                            goto label_23;
                        }
                        g1 g10 = f00.C4(class0).g0("folder.key", v1).p0();
                        if(v2 > 0L) {
                            c c0 = d.f.b(f00, v2);
                            if(c0 != null) {
                                for(Object object0: g10) {
                                    L.m(((d1)object0));
                                    ((d0)(((d1)object0))).d6(c0);
                                }
                            }
                        }
                        else {
                            g10.L0();
                        }
                        c c1 = d.f.b(f00, v1);
                        if(c1 != null) {
                            c1.z5();
                            return;
                        label_23:
                            f00.beginTransaction();
                            try {
                                g1 g11 = f00.C4(class0).g0("folder.key", v1).p0();
                                if(v2 <= 0L) {
                                    g11.L0();
                                }
                                else {
                                    c c2 = d.f.b(f00, v2);
                                    if(c2 != null) {
                                        for(Object object1: g11) {
                                            L.m(((d1)object1));
                                            ((d0)(((d1)object1))).d6(c2);
                                        }
                                    }
                                }
                                c c3 = d.f.b(f00, v1);
                                if(c3 != null) {
                                    c3.z5();
                                }
                                f00.p();
                                return;
                            }
                            catch(Throwable throwable0) {
                            }
                            if(f00.E0()) {
                                f00.e();
                            }
                            throw throwable0;
                        }
                    }
                    break;
                }
                case 1: {
                    if(this.g(f00, v1)) {
                        boolean z1 = f00.E0();
                        Class class1 = A0.class;
                        if(!z1) {
                            goto label_66;
                        }
                        g1 g12 = f00.C4(class1).g0("folder.key", v1).p0();
                        if(v2 > 0L) {
                            c c4 = d.f.b(f00, v2);
                            if(c4 != null) {
                                for(Object object2: g12) {
                                    L.m(((d1)object2));
                                    ((A0)(((d1)object2))).b6(c4);
                                }
                            }
                        }
                        else {
                            g12.L0();
                        }
                        c c5 = d.f.b(f00, v1);
                        if(c5 != null) {
                            c5.z5();
                            return;
                        label_66:
                            f00.beginTransaction();
                            try {
                                g1 g13 = f00.C4(class1).g0("folder.key", v1).p0();
                                if(v2 <= 0L) {
                                    g13.L0();
                                }
                                else {
                                    c c6 = d.f.b(f00, v2);
                                    if(c6 != null) {
                                        for(Object object3: g13) {
                                            L.m(((d1)object3));
                                            ((A0)(((d1)object3))).b6(c6);
                                        }
                                    }
                                }
                                c c7 = d.f.b(f00, v1);
                                if(c7 != null) {
                                    c7.z5();
                                }
                                f00.p();
                                return;
                            }
                            catch(Throwable throwable1) {
                            }
                            if(f00.E0()) {
                                f00.e();
                            }
                            throw throwable1;
                        }
                    }
                    break;
                }
            }
        }
    }

    @e
    private int d;
    @l
    private T0 e;
    @l
    public static final a f = null;
    private static long g = 0L;
    public static final int h = 0;
    public static final int i = 1;

    static {
        d.f = new a(null);
    }

    public d() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.s0(new T0());
    }

    public static final long Q5() [...] // 潜在的解密器

    @l
    public T0 S5() {
        return this.o4();
    }

    @l
    @n
    public static final c T5(@l F0 f00, int v, @m String s) {
        return d.f.a(f00, v, s);
    }

    @m
    @n
    public static final c U5(@l F0 f00, long v) {
        return d.f.b(f00, v);
    }

    @l
    @n
    public static final d V5(@l F0 f00, int v) {
        return d.f.c(f00, v);
    }

    @l
    @n
    public static final g1 W5(@l F0 f00, int v, long v1) {
        return d.f.d(f00, v, v1);
    }

    @n
    public static final long X5() {
        return d.f.e();
    }

    public int Y5() {
        return this.v();
    }

    @n
    public static final boolean Z5(@l F0 f00, int v, @l String s) {
        return d.f.f(f00, v, s);
    }

    @n
    public static final boolean a6(@l F0 f00, long v) {
        return d.f.g(f00, v);
    }

    @SuppressLint({"SwitchIntDef"})
    @n
    public static final void b6(@l F0 f00, int v, long v1, long v2) {
        d.f.i(f00, v, v1, v2);
    }

    public void c6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.s0(t00);
    }

    public void d6(int v) {
        this.z(v);
    }

    @Override  // io.realm.R1
    public T0 o4() {
        return this.e;
    }

    @Override  // io.realm.R1
    public void s0(T0 t00) {
        this.e = t00;
    }

    @Override  // io.realm.R1
    public int v() {
        return this.d;
    }

    @Override  // io.realm.R1
    public void z(int v) {
        this.d = v;
    }
}

