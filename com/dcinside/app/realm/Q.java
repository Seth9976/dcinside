package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.T0;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.n2;
import java.util.List;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class q extends d1 implements n2 {
    @s0({"SMAP\nGalleryParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryParams.kt\ncom/dcinside/app/realm/GalleryParams$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n129#2,15:151\n120#2,3:166\n124#2:170\n112#2,3:171\n129#2,15:175\n116#2:190\n129#2,15:191\n120#2,3:206\n124#2:210\n112#2,3:211\n129#2,15:215\n116#2:230\n129#2,15:231\n112#2,3:246\n129#2,15:250\n116#2:265\n129#2,15:266\n120#2,3:281\n124#2:285\n112#2,3:286\n129#2,15:290\n116#2:305\n129#2,15:306\n1#3:169\n1#3:174\n1#3:209\n1#3:214\n1#3:249\n1#3:284\n1#3:289\n*S KotlinDebug\n*F\n+ 1 GalleryParams.kt\ncom/dcinside/app/realm/GalleryParams$Companion\n*L\n71#1:151,15\n91#1:166,3\n91#1:170\n98#1:171,3\n98#1:175,15\n98#1:190\n98#1:191,15\n107#1:206,3\n107#1:210\n114#1:211,3\n114#1:215,15\n114#1:230\n114#1:231,15\n123#1:246,3\n123#1:250,15\n123#1:265\n123#1:266,15\n132#1:281,3\n132#1:285\n140#1:286,3\n140#1:290,15\n140#1:305\n140#1:306,15\n91#1:169\n98#1:174\n107#1:209\n114#1:214\n123#1:249\n132#1:284\n140#1:289\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final q b(@l F0 f00, @m String s) {
            L.p(f00, "realm");
            try {
                q q0 = (q)f00.C4(q.class).i0("galleryId", s).r0();
                if(q0 != null) {
                    return q0;
                }
                if(f00.E0()) {
                    q q1 = new q();
                    q1.e6(s);
                    return (q)f00.t2(q1, new W[0]);
                }
                f00.beginTransaction();
                try {
                    q q2 = new q();
                    q2.e6(s);
                    q q3 = (q)f00.t2(q2, new W[0]);
                    f00.p();
                    return q3;
                }
                catch(Throwable throwable0) {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                }
            }
            catch(Exception unused_ex) {
                return null;
            }
        }

        @l
        public final List c(@m String s) {
            List list0;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                q q0 = (q)f00.C4(q.class).i0("galleryId", s).r0();
                if(q0 == null) {
                    list0 = u.H();
                }
                else {
                    T0 t00 = q0.U5();
                    if(t00 == null) {
                        list0 = u.H();
                    }
                    else {
                        list0 = u.V5(t00);
                        if(list0 == null) {
                            list0 = u.H();
                        }
                    }
                }
                goto label_19;
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
        label_19:
            c.a(f00, null);
            return list0;
        }

        public final long d(@l String s) {
            long v;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                q q0 = q.o.b(f00, s);
                v = q0 == null ? 0L : q0.Z5();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return v;
        }

        public final long e(@l String s) {
            long v;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                q q0 = q.o.b(f00, s);
                v = q0 == null ? 0L : q0.a6();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return v;
        }

        public final void f(@l F0 f00, @m String s, boolean z, long v) {
            L.p(f00, "realm");
            f00.Y3((F0 f00) -> {
                L.m(f00);
                q q0 = q.o.b(f00, s);
                if(q0 != null) {
                    q0.b6(z);
                }
                if(q0 != null) {
                    q0.c6(v);
                }
            });
        }

        // 检测为 Lambda 实现
        private static final void g(String s, boolean z, long v, F0 f00) [...]

        public final void h(@l String s, boolean z) {
            Class class0;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z1 = f00.E0();
            class0 = q.class;
            if(z1) {
                q q0 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q0 != null) {
                    q0.d6(z);
                }
            }
            else {
                f00.beginTransaction();
                goto label_11;
            }
            goto label_25;
            try {
            label_11:
                q q1 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q1 != null) {
                    q1.d6(z);
                }
                f00.p();
                goto label_25;
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
        label_25:
            c.a(f00, null);
        }

        public final void i(@l String s) {
            Class class0;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = q.class;
            if(z) {
                q q0 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q0 != null) {
                    q0.h6(System.currentTimeMillis());
                }
            }
            else {
                f00.beginTransaction();
                goto label_11;
            }
            goto label_25;
            try {
            label_11:
                q q1 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q1 != null) {
                    q1.h6(System.currentTimeMillis());
                }
                f00.p();
                goto label_25;
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
        label_25:
            c.a(f00, null);
        }

        public final void j(@l String s) {
            Class class0;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = q.class;
            if(z) {
                q q0 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q0 != null) {
                    q0.k6(System.currentTimeMillis());
                }
            }
            else {
                f00.beginTransaction();
                goto label_11;
            }
            goto label_25;
            try {
            label_11:
                q q1 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q1 != null) {
                    q1.k6(System.currentTimeMillis());
                }
                f00.p();
                goto label_25;
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
        label_25:
            c.a(f00, null);
        }

        public final void k(@l String s) {
            Class class0;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = q.class;
            if(z) {
                q q0 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q0 != null) {
                    q0.l6(System.currentTimeMillis());
                }
            }
            else {
                f00.beginTransaction();
                goto label_11;
            }
            goto label_25;
            try {
            label_11:
                q q1 = (q)f00.C4(class0).i0("galleryId", s).r0();
                if(q1 != null) {
                    q1.l6(System.currentTimeMillis());
                }
                f00.p();
                goto label_25;
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
        label_25:
            c.a(f00, null);
        }
    }

    @e
    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    @m
    private String g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    @l
    private T0 n;
    @l
    public static final a o;

    static {
        q.o = new a(null);
    }

    public q() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.c4(10L);
        this.h0(new T0());
    }

    @Override  // io.realm.n2
    public void B2(long v) {
        this.l = v;
    }

    @Override  // io.realm.n2
    public void C3(boolean z) {
        this.i = z;
    }

    @Override  // io.realm.n2
    public long D2() {
        return this.m;
    }

    @Override  // io.realm.n2
    public String I1() {
        return this.g;
    }

    @Override  // io.realm.n2
    public long J2() {
        return this.h;
    }

    @Override  // io.realm.n2
    public String K3() {
        return this.f;
    }

    public boolean Q5() {
        return this.w1();
    }

    @Override  // io.realm.n2
    public void R0(long v) {
        this.m = v;
    }

    public long R5() {
        return this.J2();
    }

    @Override  // io.realm.n2
    public T0 S1() {
        return this.n;
    }

    public boolean S5() {
        return this.j2();
    }

    @Override  // io.realm.n2
    public void T0(String s) {
        this.f = s;
    }

    @Override  // io.realm.n2
    public void T2(String s) {
        this.g = s;
    }

    @m
    public String T5() {
        return this.a();
    }

    @l
    public T0 U5() {
        return this.S1();
    }

    @m
    public String V5() {
        return this.K3();
    }

    public long W5() {
        return this.D2();
    }

    @m
    public String X5() {
        return this.I1();
    }

    @m
    public String Y5() {
        return this.m5();
    }

    public long Z5() {
        return this.l1();
    }

    @Override  // io.realm.n2
    public String a() {
        return this.d;
    }

    public long a6() {
        return this.p2();
    }

    @Override  // io.realm.n2
    public void b(String s) {
        this.d = s;
    }

    public void b6(boolean z) {
        this.C3(z);
    }

    @Override  // io.realm.n2
    public void c4(long v) {
        this.h = v;
    }

    public void c6(long v) {
        this.c4(v);
    }

    public void d6(boolean z) {
        this.t1(z);
    }

    public void e6(@m String s) {
        this.b(s);
    }

    public void f6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.h0(t00);
    }

    public void g6(@m String s) {
        this.T0(s);
    }

    @Override  // io.realm.n2
    public void h0(T0 t00) {
        this.n = t00;
    }

    public void h6(long v) {
        this.R0(v);
    }

    public void i6(@m String s) {
        this.T2(s);
    }

    @Override  // io.realm.n2
    public boolean j2() {
        return this.j;
    }

    public void j6(@m String s) {
        this.z3(s);
    }

    public void k6(long v) {
        this.m3(v);
    }

    @Override  // io.realm.n2
    public long l1() {
        return this.k;
    }

    public void l6(long v) {
        this.B2(v);
    }

    @Override  // io.realm.n2
    public void m3(long v) {
        this.k = v;
    }

    @Override  // io.realm.n2
    public String m5() {
        return this.e;
    }

    @Override  // io.realm.n2
    public long p2() {
        return this.l;
    }

    @Override  // io.realm.n2
    public void t1(boolean z) {
        this.j = z;
    }

    @Override  // io.realm.n2
    public boolean w1() {
        return this.i;
    }

    @Override  // io.realm.n2
    public void z3(String s) {
        this.e = s;
    }
}

