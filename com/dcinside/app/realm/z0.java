package com.dcinside.app.realm;

import V.o;
import V.v;
import g0.f.b;
import g0.f.d;
import h3.e;
import io.realm.F0;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.j3;
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

public class z0 extends d1 implements j3 {
    @s0({"SMAP\nUserNoticeInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserNoticeInfo.kt\ncom/dcinside/app/realm/UserNoticeInfo$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n121#2,2:132\n124#2:135\n112#2,3:136\n129#2,15:140\n116#2:155\n129#2,15:156\n112#2,3:171\n129#2,15:175\n116#2:190\n129#2,15:191\n120#2,3:206\n124#2:210\n112#2,3:211\n129#2,3:215\n132#2,7:226\n139#2,5:240\n116#2:245\n129#2,3:246\n132#2,7:256\n139#2,5:270\n112#2,3:275\n129#2,3:279\n132#2,7:290\n139#2,5:300\n116#2:305\n129#2,15:306\n1#3:134\n1#3:139\n1#3:174\n1#3:209\n1#3:214\n1#3:278\n1557#4:218\n1628#4,2:219\n1557#4:221\n1628#4,3:222\n1630#4:225\n1628#4,2:233\n1557#4:235\n1628#4,3:236\n1630#4:239\n1628#4,2:249\n1557#4:251\n1628#4,3:252\n1630#4:255\n1628#4,2:263\n1557#4:265\n1628#4,3:266\n1630#4:269\n1557#4:285\n1628#4,3:286\n11102#5:282\n11437#5,2:283\n11439#5:289\n11437#5,3:297\n*S KotlinDebug\n*F\n+ 1 UserNoticeInfo.kt\ncom/dcinside/app/realm/UserNoticeInfo$Companion\n*L\n51#1:132,2\n51#1:135\n58#1:136,3\n58#1:140,15\n58#1:155\n58#1:156,15\n71#1:171,3\n71#1:175,15\n71#1:190\n71#1:191,15\n80#1:206,3\n80#1:210\n89#1:211,3\n89#1:215,3\n89#1:226,7\n89#1:240,5\n89#1:245\n89#1:246,3\n89#1:256,7\n89#1:270,5\n110#1:275,3\n110#1:279,3\n110#1:290,7\n110#1:300,5\n110#1:305\n110#1:306,15\n51#1:134\n58#1:139\n71#1:174\n80#1:209\n89#1:214\n110#1:278\n91#1:218\n91#1:219,2\n93#1:221\n93#1:222,3\n91#1:225\n91#1:233,2\n93#1:235\n93#1:236,3\n91#1:239\n91#1:249,2\n93#1:251\n93#1:252,3\n91#1:255\n91#1:263,2\n93#1:265\n93#1:266,3\n91#1:269\n114#1:285\n114#1:286,3\n112#1:282\n112#1:283,2\n112#1:289\n112#1:297,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l String s, @l String s1, @l String s2) {
            L.p(s, "galleryId");
            L.p(s1, "userId");
            L.p(s2, "nickname");
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                z0 z00 = new z0();
                z00.X5(s + "_" + s1);
                z00.W5(a.e(z0.i, null, 1, null));
                z00.V5(s);
                z00.Z5(s1);
                z00.Y5(s2);
                z0 z01 = (z0)f00.t2(z00, new W[0]);
            }
            else {
                f00.beginTransaction();
                goto label_15;
            }
            goto label_33;
            try {
            label_15:
                z0 z02 = new z0();
                z02.X5(s + "_" + s1);
                z02.W5(a.e(z0.i, null, 1, null));
                z02.V5(s);
                z02.Z5(s1);
                z02.Y5(s2);
                z0 z03 = (z0)f00.t2(z02, new W[0]);
                f00.p();
                goto label_33;
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
        label_33:
            c.a(f00, null);
        }

        private final String b(String s, String s1) [...] // Inlined contents

        @m
        public final z0 c(@l String s, @l String s1) {
            z0 z00;
            L.p(s, "galleryId");
            L.p(s1, "userId");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                z00 = (z0)f00.C4(z0.class).i0("key", s + "_" + s1).r0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return z00;
        }

        private final int d(F0 f00) {
            int v = 0;
            Class class0 = z0.class;
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

        static int e(a z0$a0, F0 f00, int v, Object object0) {
            if((v & 1) != 0) {
                f00 = null;
            }
            return z0$a0.d(f00);
        }

        public final void f(@l String s, @l String s1) {
            Class class0;
            L.p(s, "galleryId");
            L.p(s1, "userId");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = z0.class;
            if(z) {
                z0 z00 = (z0)f00.C4(class0).i0("key", s + "_" + s1).r0();
                if(z00 != null) {
                    z00.z5();
                }
            }
            else {
                f00.beginTransaction();
                goto label_12;
            }
            goto label_26;
            try {
            label_12:
                z0 z01 = (z0)f00.C4(class0).i0("key", s + "_" + s1).r0();
                if(z01 != null) {
                    z01.z5();
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

        public final void g(@l List list0) {
            ArrayList arrayList3;
            ArrayList arrayList1;
            Class class0;
            L.p(list0, "list");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                boolean z = f00.E0();
                class0 = z0.class;
                if(z) {
                    goto label_46;
                }
                else {
                    f00.beginTransaction();
                    goto label_7;
                }
                goto label_84;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            try {
            label_7:
                f00.C4(class0).p0().L0();
                ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
                for(Object object0: list0) {
                    b f$b0 = (b)object0;
                    String s = f$b0.d();
                    if(s == null) {
                        s = "";
                    }
                    List list1 = f$b0.l();
                    if(list1 == null) {
                        arrayList1 = null;
                    }
                    else {
                        arrayList1 = new ArrayList(u.b0(list1, 10));
                        for(Object object1: list1) {
                            String s1 = ((d)object1).b();
                            if(s1 == null) {
                                s1 = "";
                            }
                            String s2 = ((d)object1).a();
                            z0 z00 = new z0();
                            z00.X5(s + "_" + s1);
                            Integer integer0 = f$b0.a();
                            z00.W5((integer0 == null ? z0.i.d(f00) : ((int)integer0)));
                            z00.V5(s);
                            z00.Z5(s1);
                            z00.Y5(s2);
                            arrayList1.add(((z0)f00.t2(z00, new W[0])));
                        }
                    }
                    arrayList0.add(arrayList1);
                }
                f00.p();
                goto label_84;
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
                c.a(f00, throwable0);
                throw throwable0;
            }
            try {
            label_46:
                f00.C4(class0).p0().L0();
                ArrayList arrayList2 = new ArrayList(u.b0(list0, 10));
                Iterator iterator2 = list0.iterator();
                while(true) {
                    if(!iterator2.hasNext()) {
                        goto label_84;
                    }
                    Object object2 = iterator2.next();
                    b f$b1 = (b)object2;
                    String s3 = f$b1.d();
                    if(s3 == null) {
                        s3 = "";
                    }
                    List list2 = f$b1.l();
                    if(list2 == null) {
                        arrayList3 = null;
                    }
                    else {
                        arrayList3 = new ArrayList(u.b0(list2, 10));
                        for(Object object3: list2) {
                            String s4 = ((d)object3).b();
                            if(s4 == null) {
                                s4 = "";
                            }
                            String s5 = ((d)object3).a();
                            z0 z01 = new z0();
                            z01.X5(s3 + "_" + s4);
                            Integer integer1 = f$b1.a();
                            z01.W5((integer1 == null ? z0.i.d(f00) : ((int)integer1)));
                            z01.V5(s3);
                            z01.Z5(s4);
                            z01.Y5(s5);
                            arrayList3.add(((z0)f00.t2(z01, new W[0])));
                        }
                    }
                    arrayList2.add(arrayList3);
                }
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_84:
            c.a(f00, null);
        }

        public final void h(@l o[] arr_o) {
            ArrayList arrayList3;
            ArrayList arrayList1;
            Class class0;
            L.p(arr_o, "list");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                boolean z = f00.E0();
                class0 = z0.class;
                if(z) {
                    goto label_45;
                }
                else {
                    f00.beginTransaction();
                    goto label_7;
                }
                goto label_81;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            try {
            label_7:
                f00.C4(class0).p0().L0();
                ArrayList arrayList0 = new ArrayList(arr_o.length);
                for(int v = 0; v < arr_o.length; ++v) {
                    o o0 = arr_o[v];
                    String s = o0.a();
                    if(s == null) {
                        s = "";
                    }
                    List list0 = o0.c();
                    if(list0 == null) {
                        arrayList1 = null;
                    }
                    else {
                        arrayList1 = new ArrayList(u.b0(list0, 10));
                        for(Object object0: list0) {
                            String s1 = ((v)object0).b();
                            if(s1 == null) {
                                s1 = "";
                            }
                            String s2 = ((v)object0).a();
                            z0 z00 = new z0();
                            z00.X5(s + "_" + s1);
                            z00.W5(z0.i.d(f00));
                            z00.V5(s);
                            z00.Z5(s1);
                            z00.Y5(s2);
                            arrayList1.add(((z0)f00.t2(z00, new W[0])));
                        }
                    }
                    arrayList0.add(arrayList1);
                }
                f00.p();
                goto label_81;
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
                c.a(f00, throwable0);
                throw throwable0;
            }
            try {
            label_45:
                f00.C4(class0).p0().L0();
                ArrayList arrayList2 = new ArrayList(arr_o.length);
                int v1 = 0;
                while(true) {
                    if(v1 >= arr_o.length) {
                        goto label_81;
                    }
                    o o1 = arr_o[v1];
                    String s3 = o1.a();
                    if(s3 == null) {
                        s3 = "";
                    }
                    List list1 = o1.c();
                    if(list1 == null) {
                        arrayList3 = null;
                    }
                    else {
                        arrayList3 = new ArrayList(u.b0(list1, 10));
                        for(Object object1: list1) {
                            String s4 = ((v)object1).b();
                            if(s4 == null) {
                                s4 = "";
                            }
                            String s5 = ((v)object1).a();
                            z0 z01 = new z0();
                            z01.X5(s3 + "_" + s4);
                            z01.W5(z0.i.d(f00));
                            z01.V5(s3);
                            z01.Z5(s4);
                            z01.Y5(s5);
                            arrayList3.add(((z0)f00.t2(z01, new W[0])));
                        }
                    }
                    arrayList2.add(arrayList3);
                    ++v1;
                }
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_81:
            c.a(f00, null);
        }
    }

    @e
    @m
    private String d;
    @h3.c
    private int e;
    @m
    private String f;
    @m
    private String g;
    @m
    private String h;
    @l
    public static final a i;

    static {
        z0.i = new a(null);
    }

    public z0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.j3
    public String C() {
        return this.g;
    }

    @Override  // io.realm.j3
    public int K() {
        return this.e;
    }

    @m
    public final String Q5() {
        return this.a();
    }

    @Override  // io.realm.j3
    public void R(int v) {
        this.e = v;
    }

    public final int R5() {
        return this.K();
    }

    @Override  // io.realm.j3
    public void S3(String s) {
        this.h = s;
    }

    @m
    public final String S5() {
        return this.i();
    }

    @Override  // io.realm.j3
    public String T4() {
        return this.h;
    }

    @m
    public final String T5() {
        return this.T4();
    }

    @Override  // io.realm.j3
    public void U(String s) {
        this.g = s;
    }

    @m
    public final String U5() {
        return this.C();
    }

    public final void V5(@m String s) {
        this.b(s);
    }

    public final void W5(int v) {
        this.R(v);
    }

    public final void X5(@m String s) {
        this.n(s);
    }

    public final void Y5(@m String s) {
        this.S3(s);
    }

    public final void Z5(@m String s) {
        this.U(s);
    }

    @Override  // io.realm.j3
    public String a() {
        return this.f;
    }

    @Override  // io.realm.j3
    public void b(String s) {
        this.f = s;
    }

    @Override  // io.realm.j3
    public String i() {
        return this.d;
    }

    @Override  // io.realm.j3
    public void n(String s) {
        this.d = s;
    }
}

