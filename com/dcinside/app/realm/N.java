package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.j2;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class n extends d1 implements j2 {
    @s0({"SMAP\nFcmMsg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FcmMsg.kt\ncom/dcinside/app/realm/FcmMsg$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n112#2,3:65\n129#2,15:69\n116#2:84\n129#2,15:85\n112#2,3:100\n129#2,15:104\n116#2:119\n129#2,15:120\n1#3:68\n1#3:103\n*S KotlinDebug\n*F\n+ 1 FcmMsg.kt\ncom/dcinside/app/realm/FcmMsg$Companion\n*L\n49#1:65,3\n49#1:69,15\n49#1:84\n49#1:85,15\n55#1:100,3\n55#1:104,15\n55#1:119\n55#1:120,15\n49#1:68\n55#1:103\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a() {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = n.class;
            if(z) {
                f00.C4(class0).p0().L0();
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_20;
            try {
            label_8:
                f00.C4(class0).p0().L0();
                f00.p();
                goto label_20;
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
        label_20:
            c.a(f00, null);
        }

        public final void b(int v) {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = n.class;
            if(z) {
                f00.C4(class0).i0("pushType", String.valueOf(v)).p0().L0();
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_20;
            try {
            label_8:
                f00.C4(class0).i0("pushType", String.valueOf(v)).p0().L0();
                f00.p();
                goto label_20;
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
        label_20:
            c.a(f00, null);
        }
    }

    @e
    private long d;
    @m
    private String e;
    private int f;
    private int g;
    @h3.c
    private long h;
    @m
    private String i;
    @l
    public static final a j;

    static {
        n.j = new a(null);
    }

    public n() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.j2
    public String K2() {
        return this.i;
    }

    @Override  // io.realm.j2
    public void K4(int v) {
        this.g = v;
    }

    @Override  // io.realm.j2
    public long P() {
        return this.d;
    }

    public int Q5() {
        return this.g2();
    }

    @m
    public String R5() {
        return this.a();
    }

    public long S5() {
        return this.P();
    }

    public int T5() {
        return this.g();
    }

    @m
    public String U5() {
        return this.K2();
    }

    public long V5() {
        return this.d();
    }

    public void W5(int v) {
        this.K4(v);
    }

    public void X5(@m String s) {
        this.b(s);
    }

    public void Y5(long v) {
        this.Z(v);
    }

    @Override  // io.realm.j2
    public void Z(long v) {
        this.d = v;
    }

    public void Z5(int v) {
        this.o(v);
    }

    @Override  // io.realm.j2
    public String a() {
        return this.e;
    }

    public void a6(@m String s) {
        this.d5(s);
    }

    @Override  // io.realm.j2
    public void b(String s) {
        this.e = s;
    }

    public void b6(long v) {
        this.c(v);
    }

    @Override  // io.realm.j2
    public void c(long v) {
        this.h = v;
    }

    @Override  // io.realm.j2
    public long d() {
        return this.h;
    }

    @Override  // io.realm.j2
    public void d5(String s) {
        this.i = s;
    }

    @Override  // io.realm.j2
    public int g() {
        return this.f;
    }

    @Override  // io.realm.j2
    public int g2() {
        return this.g;
    }

    @Override  // io.realm.j2
    public void o(int v) {
        this.f = v;
    }
}

