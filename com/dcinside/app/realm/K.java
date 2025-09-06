package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.W;
import io.realm.d1;
import io.realm.d2;
import io.realm.g1;
import io.realm.internal.s;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;

public class k extends d1 implements d2 {
    @s0({"SMAP\nDcconGuestHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconGuestHistory.kt\ncom/dcinside/app/realm/DcconGuestHistory$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n120#2,3:68\n124#2:76\n112#2,3:77\n129#2,15:81\n116#2:96\n129#2,15:97\n1#3:71\n1#3:80\n1557#4:72\n1628#4,3:73\n*S KotlinDebug\n*F\n+ 1 DcconGuestHistory.kt\ncom/dcinside/app/realm/DcconGuestHistory$Companion\n*L\n35#1:68,3\n35#1:76\n48#1:77,3\n48#1:81,15\n48#1:96\n48#1:97,15\n35#1:71\n48#1:80\n39#1:72\n39#1:73,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final List a() {
            List list0;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                g1 g10 = f00.C4(k.class).g2("date", r1.c).p0();
                L.m(g10);
                list0 = new ArrayList(u.b0(g10, 10));
                for(Object object0: g10) {
                    list0.add(r0.a(((k)object0).S5(), ((k)object0).R5()));
                }
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return list0;
        }

        public final void b(int v, int v1) {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = k.class;
            if(z) {
                goto label_26;
            }
            else {
                f00.beginTransaction();
                goto label_6;
            }
            goto label_48;
            try {
            label_6:
                g1 g10 = f00.C4(class0).p0();
                k k0 = (k)f00.C4(class0).f0("detailIdx", v1).r0();
                if(k0 == null) {
                    L.m(g10);
                    if(g10.size() >= 20) {
                        k k1 = (k)f00.C4(class0).g2("date", r1.b).r0();
                        if(k1 != null) {
                            k1.z5();
                        }
                    }
                    k k2 = new k();
                    k2.U5(v1);
                    k2.V5(v);
                    f00.o2(k2, new W[0]);
                }
                else {
                    k0.T5(new Date());
                }
                f00.p();
                goto label_48;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_26:
                g1 g11 = f00.C4(class0).p0();
                k k3 = (k)f00.C4(class0).f0("detailIdx", v1).r0();
                if(k3 == null) {
                    L.m(g11);
                    if(g11.size() >= 20) {
                        k k4 = (k)f00.C4(class0).g2("date", r1.b).r0();
                        if(k4 != null) {
                            k4.z5();
                        }
                    }
                    k k5 = new k();
                    k5.U5(v1);
                    k5.V5(v);
                    f00.o2(k5, new W[0]);
                }
                else {
                    k3.T5(new Date());
                }
                goto label_48;
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
        label_48:
            c.a(f00, null);
        }
    }

    private int d;
    @e
    private int e;
    @h3.c
    @l
    private Date f;
    @l
    public static final a g;

    static {
        k.g = new a(null);
    }

    public k() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.O(new Date());
    }

    @Override  // io.realm.d2
    public int A() {
        return this.e;
    }

    @Override  // io.realm.d2
    public int B() {
        return this.d;
    }

    @Override  // io.realm.d2
    public void O(Date date0) {
        this.f = date0;
    }

    @l
    public Date Q5() {
        return this.p();
    }

    public int R5() {
        return this.A();
    }

    public int S5() {
        return this.B();
    }

    public void T5(@l Date date0) {
        L.p(date0, "<set-?>");
        this.O(date0);
    }

    public void U5(int v) {
        this.x(v);
    }

    public void V5(int v) {
        this.t(v);
    }

    @Override  // io.realm.d2
    public Date p() {
        return this.f;
    }

    @Override  // io.realm.d2
    public void t(int v) {
        this.d = v;
    }

    @Override  // io.realm.d2
    public void x(int v) {
        this.e = v;
    }
}

