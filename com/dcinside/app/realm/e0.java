package com.dcinside.app.realm;

import g0.f.b;
import h3.e;
import io.realm.F0;
import io.realm.L2;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class e0 extends d1 implements L2 {
    @s0({"SMAP\nPostArticle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostArticle.kt\ncom/dcinside/app/realm/PostArticle$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n121#2,2:133\n124#2:136\n112#2,3:137\n129#2,15:141\n116#2:156\n129#2,15:157\n112#2,3:172\n129#2,15:176\n116#2:191\n129#2,15:192\n120#2,3:207\n124#2:211\n120#2,3:212\n124#2:216\n112#2,3:217\n129#2,3:221\n132#2,12:228\n116#2:240\n129#2,15:241\n112#2,3:256\n129#2,3:260\n132#2,12:267\n116#2:279\n129#2,15:280\n1#3:135\n1#3:140\n1#3:175\n1#3:210\n1#3:215\n1#3:220\n1#3:259\n1557#4:224\n1628#4,3:225\n11102#5:263\n11437#5,3:264\n*S KotlinDebug\n*F\n+ 1 PostArticle.kt\ncom/dcinside/app/realm/PostArticle$Companion\n*L\n51#1:133,2\n51#1:136\n58#1:137,3\n58#1:141,15\n58#1:156\n58#1:157,15\n70#1:172,3\n70#1:176,15\n70#1:191\n70#1:192,15\n79#1:207,3\n79#1:211\n88#1:212,3\n88#1:216\n98#1:217,3\n98#1:221,3\n98#1:228,12\n98#1:240\n98#1:241,15\n115#1:256,3\n115#1:260,3\n115#1:267,12\n115#1:279\n115#1:280,15\n51#1:135\n58#1:140\n70#1:175\n79#1:210\n88#1:215\n98#1:220\n115#1:259\n100#1:224\n100#1:225,3\n117#1:263\n117#1:264,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l String s, @l String s1) {
            L.p(s, "galleryId");
            L.p(s1, "postNo");
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                e0 e00 = new e0();
                e00.Y5(s + "_" + s1);
                e00.X5(a.f(e0.i, null, 1, null));
                e00.W5(s);
                e00.Z5(s1);
                e0 e01 = (e0)f00.t2(e00, new W[0]);
            }
            else {
                f00.beginTransaction();
                goto label_13;
            }
            goto label_30;
            try {
            label_13:
                e0 e02 = new e0();
                e02.Y5(s + "_" + s1);
                e02.X5(a.f(e0.i, null, 1, null));
                e02.W5(s);
                e02.Z5(s1);
                e0 e03 = (e0)f00.t2(e02, new W[0]);
                f00.p();
                goto label_30;
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
        label_30:
            c.a(f00, null);
        }

        private final String b(String s, String s1) [...] // Inlined contents

        @m
        public final e0 c(@l String s, @l String s1) {
            e0 e00;
            L.p(s, "galleryId");
            L.p(s1, "postNo");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                e00 = (e0)f00.C4(e0.class).i0("key", s + "_" + s1).r0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return e00;
        }

        @m
        public final e0 d() {
            e0 e00;
            Class class0 = e0.class;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                Number number0 = f00.C4(class0).J1("index");
                if(number0 == null) {
                    e00 = null;
                }
                else {
                    L.m(number0);
                    e00 = (e0)f00.C4(class0).f0("index", number0.intValue()).r0();
                }
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return e00;
        }

        private final int e(F0 f00) {
            int v = 0;
            Class class0 = e0.class;
            if(f00 != null && !f00.isClosed()) {
                Number number0 = f00.C4(class0).G1("index");
                if(number0 != null) {
                    v = number0.intValue();
                }
                return v + 1;
            }
            F0 f01 = F0.g4();
            try {
                L.m(f01);
                Number number1 = f01.C4(class0).G1("index");
                if(number1 != null) {
                    v = number1.intValue();
                }
            }
            catch(Throwable throwable0) {
                c.a(f01, throwable0);
                throw throwable0;
            }
            c.a(f01, null);
            return v + 1;
        }

        static int f(a e0$a0, F0 f00, int v, Object object0) {
            if((v & 1) != 0) {
                f00 = null;
            }
            return e0$a0.e(f00);
        }

        public final void g(@l String s, @l String s1) {
            Class class0;
            L.p(s, "galleryId");
            L.p(s1, "postNo");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = e0.class;
            if(z) {
                e0 e00 = (e0)f00.C4(class0).i0("key", s + "_" + s1).r0();
                if(e00 != null) {
                    e00.z5();
                }
            }
            else {
                f00.beginTransaction();
                goto label_12;
            }
            goto label_26;
            try {
            label_12:
                e0 e01 = (e0)f00.C4(class0).i0("key", s + "_" + s1).r0();
                if(e01 != null) {
                    e01.z5();
                }
                f00.p();
                goto label_26;
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
        label_26:
            c.a(f00, null);
        }

        public final void h(@l List list0) {
            Class class0;
            L.p(list0, "list");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = e0.class;
            if(z) {
                goto label_32;
            }
            else {
                f00.beginTransaction();
                goto label_7;
            }
            goto label_58;
            try {
            label_7:
                f00.C4(class0).p0().L0();
                ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
                for(Object object0: list0) {
                    String s = ((b)object0).d();
                    if(s == null) {
                        s = "";
                    }
                    String s1 = ((b)object0).h();
                    if(s1 == null) {
                        s1 = "";
                    }
                    e0 e00 = new e0();
                    e00.Y5(s + "_" + s1);
                    Integer integer0 = ((b)object0).a();
                    e00.X5((integer0 == null ? e0.i.e(f00) : ((int)integer0)));
                    e00.W5(s);
                    e00.Z5(s1);
                    arrayList0.add(((e0)f00.t2(e00, new W[0])));
                }
                f00.p();
                goto label_58;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_32:
                f00.C4(class0).p0().L0();
                ArrayList arrayList1 = new ArrayList(u.b0(list0, 10));
                Iterator iterator1 = list0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        goto label_58;
                    }
                    Object object1 = iterator1.next();
                    String s2 = ((b)object1).d();
                    if(s2 == null) {
                        s2 = "";
                    }
                    String s3 = ((b)object1).h();
                    if(s3 == null) {
                        s3 = "";
                    }
                    e0 e01 = new e0();
                    e01.Y5(s2 + "_" + s3);
                    Integer integer1 = ((b)object1).a();
                    e01.X5((integer1 == null ? e0.i.e(f00) : ((int)integer1)));
                    e01.W5(s2);
                    e01.Z5(s3);
                    arrayList1.add(((e0)f00.t2(e01, new W[0])));
                }
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
        label_58:
            c.a(f00, null);
        }

        public final void i(@l V.b[] arr_b) {
            Class class0;
            L.p(arr_b, "list");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = e0.class;
            if(z) {
                goto label_31;
            }
            else {
                f00.beginTransaction();
                goto label_7;
            }
            goto label_56;
            try {
            label_7:
                f00.C4(class0).p0().L0();
                ArrayList arrayList0 = new ArrayList(arr_b.length);
                for(int v = 0; v < arr_b.length; ++v) {
                    V.b b0 = arr_b[v];
                    String s = b0.b();
                    if(s == null) {
                        s = "";
                    }
                    String s1 = b0.f() == null ? "" : b0.f();
                    e0 e00 = new e0();
                    e00.Y5(s + "_" + s1);
                    Integer integer0 = b0.d();
                    e00.X5((integer0 == null ? e0.i.e(f00) : ((int)integer0)));
                    e00.W5(s);
                    e00.Z5(s1);
                    arrayList0.add(((e0)f00.t2(e00, new W[0])));
                }
                f00.p();
                goto label_56;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_31:
                f00.C4(class0).p0().L0();
                ArrayList arrayList1 = new ArrayList(arr_b.length);
                int v1 = 0;
                while(true) {
                    if(v1 >= arr_b.length) {
                        goto label_56;
                    }
                    V.b b1 = arr_b[v1];
                    String s2 = b1.b();
                    if(s2 == null) {
                        s2 = "";
                    }
                    String s3 = b1.f() == null ? "" : b1.f();
                    e0 e01 = new e0();
                    e01.Y5(s2 + "_" + s3);
                    Integer integer1 = b1.d();
                    e01.X5((integer1 == null ? e0.i.e(f00) : ((int)integer1)));
                    e01.W5(s2);
                    e01.Z5(s3);
                    arrayList1.add(((e0)f00.t2(e01, new W[0])));
                    ++v1;
                }
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
        label_56:
            c.a(f00, null);
        }
    }

    @e
    @m
    private String d;
    private int e;
    @h3.c
    private int f;
    @m
    private String g;
    @m
    private String h;
    @l
    public static final a i;

    static {
        e0.i = new a(null);
    }

    public e0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.L2
    public int K() {
        return this.f;
    }

    @Override  // io.realm.L2
    public void N3(int v) {
        this.e = v;
    }

    public final int Q5() {
        return this.r1();
    }

    @Override  // io.realm.L2
    public void R(int v) {
        this.f = v;
    }

    @m
    public final String R5() {
        return this.a();
    }

    public final int S5() {
        return this.K();
    }

    @m
    public final String T5() {
        return this.i();
    }

    @m
    public final String U5() {
        return this.g();
    }

    public final void V5(int v) {
        this.N3(v);
    }

    public final void W5(@m String s) {
        this.b(s);
    }

    public final void X5(int v) {
        this.R(v);
    }

    public final void Y5(@m String s) {
        this.n(s);
    }

    public final void Z5(@m String s) {
        this.a0(s);
    }

    @Override  // io.realm.L2
    public String a() {
        return this.g;
    }

    @Override  // io.realm.L2
    public void a0(String s) {
        this.h = s;
    }

    @Override  // io.realm.L2
    public void b(String s) {
        this.g = s;
    }

    @Override  // io.realm.L2
    public String g() {
        return this.h;
    }

    @Override  // io.realm.L2
    public String i() {
        return this.d;
    }

    @Override  // io.realm.L2
    public void n(String s) {
        this.d = s;
    }

    @Override  // io.realm.L2
    public int r1() {
        return this.e;
    }
}

