package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.W;
import io.realm.b3;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class v0 extends d1 implements b3 {
    @s0({"SMAP\nReplyHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyHistory.kt\ncom/dcinside/app/realm/ReplyHistory$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n112#2,3:55\n129#2,15:59\n116#2:74\n129#2,15:75\n1#3:58\n*S KotlinDebug\n*F\n+ 1 ReplyHistory.kt\ncom/dcinside/app/realm/ReplyHistory$Companion\n*L\n43#1:55,3\n43#1:59,15\n43#1:74\n43#1:75,15\n43#1:58\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final String a(@m String s, int v, int v1) {
            if(s == null) {
                s = "";
            }
            return s + "_" + v + "_" + v1;
        }

        public static String b(a v0$a0, String s, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                s = "";
            }
            return v0$a0.a(s, v, v1);
        }

        @n
        public final void c(@l String s, int v, int v1) {
            L.p(s, "id");
            if(v > 0 && v1 > 0) {
                String s1 = this.a(s, v, v1);
                F0 f00 = F0.g4();
                L.m(f00);
                if(f00.E0()) {
                    v0 v00 = new v0();
                    v00.X5(s1);
                    v00.W5(s);
                    v00.Y5(v);
                    v00.V5(v1);
                    v0 v01 = (v0)f00.t2(v00, new W[0]);
                }
                else {
                    f00.beginTransaction();
                    goto label_14;
                }
                goto label_31;
                try {
                label_14:
                    v0 v02 = new v0();
                    v02.X5(s1);
                    v02.W5(s);
                    v02.Y5(v);
                    v02.V5(v1);
                    v0 v03 = (v0)f00.t2(v02, new W[0]);
                    f00.p();
                    goto label_31;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    c.a(f00, throwable0);
                    throw throwable2;
                }
            label_31:
                c.a(f00, null);
            }
        }
    }

    @e
    @m
    private String d;
    @m
    private String e;
    private int f;
    private int g;
    @l
    public static final a h;

    static {
        v0.h = new a(null);
    }

    public v0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.b3
    public void C1(int v) {
        this.g = v;
    }

    public int Q5() {
        return this.j1();
    }

    @m
    public String R5() {
        return this.a();
    }

    @m
    public String S5() {
        return this.i();
    }

    public int T5() {
        return this.g();
    }

    @l
    @n
    public static final String U5(@m String s, int v, int v1) {
        return v0.h.a(s, v, v1);
    }

    public void V5(int v) {
        this.C1(v);
    }

    public void W5(@m String s) {
        this.b(s);
    }

    public void X5(@m String s) {
        this.n(s);
    }

    public void Y5(int v) {
        this.o(v);
    }

    @n
    public static final void Z5(@l String s, int v, int v1) {
        v0.h.c(s, v, v1);
    }

    @Override  // io.realm.b3
    public String a() {
        return this.e;
    }

    @Override  // io.realm.b3
    public void b(String s) {
        this.e = s;
    }

    @Override  // io.realm.b3
    public int g() {
        return this.f;
    }

    @Override  // io.realm.b3
    public String i() {
        return this.d;
    }

    @Override  // io.realm.b3
    public int j1() {
        return this.g;
    }

    @Override  // io.realm.b3
    public void n(String s) {
        this.d = s;
    }

    @Override  // io.realm.b3
    public void o(int v) {
        this.f = v;
    }
}

