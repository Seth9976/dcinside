package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.T0;
import io.realm.V1;
import io.realm.W;
import io.realm.X0;
import io.realm.d1;
import io.realm.g1;
import io.realm.internal.s;
import java.util.ArrayList;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class f extends d1 implements V1 {
    @s0({"SMAP\nBlockDCCon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDCCon.kt\ncom/dcinside/app/realm/BlockDCCon$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n120#2,3:124\n124#2:128\n112#2,3:129\n129#2,3:133\n132#2,12:140\n116#2:152\n129#2,15:153\n112#2,3:168\n129#2,15:172\n116#2:187\n129#2,15:188\n120#2,3:203\n124#2:207\n112#2,3:208\n129#2,15:212\n116#2:227\n129#2,15:228\n1#3:127\n1#3:132\n1#3:171\n1#3:206\n1#3:211\n11102#4:136\n11437#4,3:137\n*S KotlinDebug\n*F\n+ 1 BlockDCCon.kt\ncom/dcinside/app/realm/BlockDCCon$Companion\n*L\n61#1:124,3\n61#1:128\n72#1:129,3\n72#1:133,3\n72#1:140,12\n72#1:152\n72#1:153,15\n88#1:168,3\n88#1:172,15\n88#1:187\n88#1:188,15\n98#1:203,3\n98#1:207\n106#1:208,3\n106#1:212,15\n106#1:227\n106#1:228,15\n61#1:127\n72#1:132\n88#1:171\n98#1:206\n106#1:211\n76#1:136\n76#1:137,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(long v, @l String s, @l String s1, int v1, @l String[] arr_s) {
            Class class0;
            int v2;
            L.p(s, "groupName");
            L.p(s1, "groupUrl");
            L.p(arr_s, "items");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            v2 = 0;
            class0 = f.class;
            if(z) {
                goto label_30;
            }
            else {
                f00.beginTransaction();
                goto label_10;
            }
            goto label_52;
            try {
            label_10:
                f f0 = (f)f00.C4(class0).g0("groupIndex", v).r0();
                if(f0 == null) {
                    f0 = f.i.b(f00, v, s, s1);
                }
                L.m(f0);
                ArrayList arrayList0 = new ArrayList(arr_s.length);
                while(v2 < arr_s.length) {
                    arrayList0.add(g.f.a(arr_s[v2]));
                    ++v2;
                }
                if(arr_s.length > 1) {
                    f0.Q5().L0();
                }
                if(v1 > 0) {
                    f0.Z5(v1);
                }
                f0.Q5().addAll(arrayList0);
                f00.p();
                goto label_52;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_30:
                f f1 = (f)f00.C4(class0).g0("groupIndex", v).r0();
                if(f1 == null) {
                    f1 = f.i.b(f00, v, s, s1);
                }
                L.m(f1);
                ArrayList arrayList1 = new ArrayList(arr_s.length);
                while(v2 < arr_s.length) {
                    arrayList1.add(g.f.a(arr_s[v2]));
                    ++v2;
                }
                if(arr_s.length > 1) {
                    f1.Q5().L0();
                }
                if(v1 > 0) {
                    f1.Z5(v1);
                }
                f1.Q5().addAll(arrayList1);
                goto label_52;
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
        label_52:
            c.a(f00, null);
        }

        private final f b(F0 f00, long v, String s, String s1) {
            f f0 = new f();
            f0.X5(v);
            f0.Y5(s);
            f0.W5(s1);
            X0 x00 = f00.o2(f0, new W[0]);
            L.o(x00, "copyToRealm(...)");
            return (f)x00;
        }

        @m
        public final f c(@l F0 f00, long v) {
            L.p(f00, "realm");
            return (f)f00.C4(f.class).g0("groupIndex", v).r0();
        }

        @l
        public final g1 d(@l F0 f00) {
            L.p(f00, "realm");
            g1 g10 = f00.C4(f.class).e1("dcConList").p0();
            L.o(g10, "findAll(...)");
            return g10;
        }

        public final boolean e(long v) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                f f0 = (f)f00.C4(f.class).g0("groupIndex", v).r0();
                if(f0 == null || f0.U5() == 0) {
                    goto label_10;
                }
                else {
                    goto label_8;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_8:
            boolean z = true;
            goto label_11;
        label_10:
            z = false;
        label_11:
            c.a(f00, null);
            return z;
        }

        public final boolean f(@l String s) {
            L.p(s, "dcconUrl");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                if(f00.C4(g.class).i0("imageUrl", s).r0() == null) {
                    goto label_10;
                }
                else {
                    goto label_8;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_8:
            boolean z = true;
            goto label_11;
        label_10:
            z = false;
        label_11:
            c.a(f00, null);
            return z;
        }

        public final void g(@l String s, long v) {
            Class class1;
            Class class0;
            L.p(s, "dcconUrl");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = f.class;
            class1 = g.class;
            if(z) {
                goto label_22;
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_38;
            try {
            label_8:
                g g0 = (g)f00.C4(class1).i0("imageUrl", s).r0();
                if(g0 != null) {
                    g0.z5();
                }
                f f0 = (f)f00.C4(class0).g0("groupIndex", v).r0();
                if(f0 != null) {
                    T0 t00 = f0.Q5();
                    if(t00 != null && t00.isEmpty()) {
                        f0.z5();
                    }
                }
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
            label_22:
                g g1 = (g)f00.C4(class1).i0("imageUrl", s).r0();
                if(g1 != null) {
                    g1.z5();
                }
                f f1 = (f)f00.C4(class0).g0("groupIndex", v).r0();
                if(f1 != null) {
                    T0 t01 = f1.Q5();
                    if(t01 != null && t01.isEmpty()) {
                        f1.z5();
                    }
                }
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

        public final void h(long v) {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = f.class;
            if(z) {
                goto label_19;
            }
            else {
                f00.beginTransaction();
                goto label_6;
            }
            goto label_34;
            try {
            label_6:
                f f0 = (f)f00.C4(class0).g0("groupIndex", v).r0();
                if(f0 != null) {
                    T0 t00 = f0.Q5();
                    if(t00 != null) {
                        t00.L0();
                    }
                }
                if(f0 != null) {
                    f0.z5();
                }
                f00.p();
                goto label_34;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_19:
                f f1 = (f)f00.C4(class0).g0("groupIndex", v).r0();
                if(f1 != null) {
                    T0 t01 = f1.Q5();
                    if(t01 != null) {
                        t01.L0();
                    }
                }
                if(f1 != null) {
                    f1.z5();
                }
                goto label_34;
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
        label_34:
            c.a(f00, null);
        }
    }

    @e
    private long d;
    @m
    private String e;
    @m
    private String f;
    @l
    private T0 g;
    private int h;
    @l
    public static final a i;

    static {
        f.i = new a(null);
    }

    public f() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.D4("");
        this.J0("");
        this.x2(new T0());
    }

    @Override  // io.realm.V1
    public int C0() {
        return this.h;
    }

    @Override  // io.realm.V1
    public String C4() [...] // 潜在的解密器

    @Override  // io.realm.V1
    public void D4(String s) {
        this.e = s;
    }

    @Override  // io.realm.V1
    public void J0(String s) {
        this.f = s;
    }

    @Override  // io.realm.V1
    public void Q4(int v) {
        this.h = v;
    }

    @l
    public T0 Q5() {
        return this.a4();
    }

    @Override  // io.realm.V1
    public long R2() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    @m
    public String R5() [...] // 潜在的解密器

    public long S5() {
        return this.R2();
    }

    // 去混淆评级： 低(20)
    @m
    public String T5() [...] // 潜在的解密器

    public int U5() {
        return this.C0();
    }

    public void V5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.x2(t00);
    }

    @Override  // io.realm.V1
    public void W1(long v) {
        this.d = v;
    }

    public void W5(@m String s) {
        this.J0(s);
    }

    public void X5(long v) {
        this.W1(v);
    }

    public void Y5(@m String s) {
        this.D4(s);
    }

    public void Z5(int v) {
        this.Q4(v);
    }

    @Override  // io.realm.V1
    public T0 a4() {
        return this.g;
    }

    @Override  // io.realm.V1
    public String t4() [...] // 潜在的解密器

    @Override  // io.realm.V1
    public void x2(T0 t00) {
        this.g = t00;
    }
}

