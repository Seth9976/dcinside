package com.dcinside.app.dccon.setting.tag;

import com.dcinside.app.model.p;
import h3.e;
import io.realm.D1;
import io.realm.F0;
import io.realm.T0;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class a extends d1 implements D1 {
    @s0({"SMAP\nDcconTagGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagGroup.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagGroup$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n112#2,3:108\n129#2,15:112\n116#2:127\n129#2,15:128\n112#2,3:143\n129#2,15:147\n116#2:162\n129#2,15:163\n120#2,3:178\n124#2:182\n1#3:111\n1#3:146\n1#3:181\n*S KotlinDebug\n*F\n+ 1 DcconTagGroup.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagGroup$Companion\n*L\n41#1:108,3\n41#1:112,15\n41#1:127\n41#1:128,15\n59#1:143,3\n59#1:147,15\n59#1:162\n59#1:163,15\n71#1:178,3\n71#1:182\n41#1:111\n59#1:146\n71#1:181\n*E\n"})
    public static final class com.dcinside.app.dccon.setting.tag.a.a {
        private com.dcinside.app.dccon.setting.tag.a.a() {
        }

        public com.dcinside.app.dccon.setting.tag.a.a(w w0) {
        }

        private final void a(a a0, b b0) {
            b b1 = (b)a0.Q5().x4().f0("detailIdx", b0.S5()).r0();
            if(b1 != null) {
                a0.Q5().remove(b1);
                a0.Q5().add(b0);
                return;
            }
            a0.Q5().add(b0);
        }

        private final void b(F0 f00, int v, b b0) {
            a a0 = new a();
            a0.T5(v);
            a0.Q5().add(b0);
            f00.o2(a0, new W[0]);
        }

        public final void c(@l p p0, @l String s) {
            Class class0;
            L.p(p0, "icon");
            L.p(s, "customTag");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = a.class;
            if(z) {
                goto label_23;
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_40;
            try {
            label_8:
                b b0 = new b();
                b0.W5(p0.q());
                b0.X5(p0.s());
                b0.U5(s);
                a a0 = (a)f00.C4(class0).f0("packageIdx", p0.s()).r0();
                if(a0 == null) {
                    a.f.b(f00, p0.s(), b0);
                }
                else {
                    a.f.a(a0, b0);
                }
                f00.p();
                goto label_40;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_23:
                b b1 = new b();
                b1.W5(p0.q());
                b1.X5(p0.s());
                b1.U5(s);
                a a1 = (a)f00.C4(class0).f0("packageIdx", p0.s()).r0();
                if(a1 == null) {
                    a.f.b(f00, p0.s(), b1);
                }
                else {
                    a.f.a(a1, b1);
                }
                goto label_40;
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
        label_40:
            c.a(f00, null);
        }

        @m
        public final String d(int v, int v1) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                a a0 = (a)f00.C4(a.class).f0("packageIdx", v).r0();
                if(a0 != null) {
                    L.m(a0);
                    b b0 = (b)a0.Q5().x4().f0("detailIdx", v1).r0();
                    if(b0 != null) {
                        L.m(b0);
                        goto label_12;
                    }
                    goto label_14;
                }
                goto label_16;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_12:
            c.a(f00, null);
            return "";
        label_14:
            c.a(f00, null);
            return null;
        label_16:
            c.a(f00, null);
            return null;
        }

        @m
        public final a e(@l F0 f00, int v) {
            L.p(f00, "realm");
            return (a)f00.C4(a.class).f0("packageIdx", v).r0();
        }

        public final void f(@l p p0) {
            Class class0;
            L.p(p0, "icon");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = a.class;
            if(z) {
                a a0 = (a)f00.C4(class0).f0("packageIdx", p0.s()).r0();
                if(a0 != null) {
                    L.m(a0);
                    b b0 = (b)a0.Q5().x4().f0("detailIdx", p0.q()).r0();
                    if(b0 != null) {
                        L.m(b0);
                        a0.Q5().remove(b0);
                        b.h.c(f00, p0.q());
                        goto label_39;
                    }
                    c.a(f00, null);
                    return;
                }
            }
            else {
                goto label_19;
            }
            c.a(f00, null);
            return;
        label_19:
            f00.beginTransaction();
            try {
                a a1 = (a)f00.C4(class0).f0("packageIdx", p0.s()).r0();
                if(a1 != null) {
                    L.m(a1);
                    b b1 = (b)a1.Q5().x4().f0("detailIdx", p0.q()).r0();
                    if(b1 != null) {
                        L.m(b1);
                        a1.Q5().remove(b1);
                        b.h.c(f00, p0.q());
                        f00.p();
                        goto label_39;
                    }
                    goto label_41;
                }
                goto label_43;
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
        label_39:
            c.a(f00, null);
            return;
        label_41:
            c.a(f00, null);
            return;
        label_43:
            c.a(f00, null);
        }
    }

    @e
    private int d;
    @l
    private T0 e;
    @l
    public static final com.dcinside.app.dccon.setting.tag.a.a f;

    static {
        a.f = new com.dcinside.app.dccon.setting.tag.a.a(null);
    }

    public a() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.P0(new T0());
    }

    @Override  // io.realm.D1
    public int B() {
        return this.d;
    }

    @Override  // io.realm.D1
    public void P0(T0 t00) {
        this.e = t00;
    }

    @Override  // io.realm.D1
    public T0 P1() {
        return this.e;
    }

    @l
    public T0 Q5() {
        return this.P1();
    }

    public int R5() {
        return this.B();
    }

    public void S5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.P0(t00);
    }

    public void T5(int v) {
        this.t(v);
    }

    @Override  // io.realm.D1
    public void t(int v) {
        this.d = v;
    }
}

