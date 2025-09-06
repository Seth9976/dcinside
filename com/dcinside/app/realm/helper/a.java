package com.dcinside.app.realm.helper;

import com.dcinside.app.model.Q;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.d0;
import com.dcinside.app.realm.j;
import com.dcinside.app.realm.s;
import com.dcinside.app.realm.u0;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.type.m;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import com.google.gson.Gson;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.X0;
import io.realm.g1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;

@s0({"SMAP\nCacheHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,247:1\n1#2:248\n1#2:252\n1#2:291\n1#2:297\n112#3,3:249\n129#3,15:253\n116#3:268\n129#3,15:269\n120#3,3:288\n124#3:293\n112#3,3:294\n129#3,3:298\n132#3,12:303\n116#3:315\n129#3,15:316\n37#4:284\n81#4:285\n37#4:286\n81#4:287\n37#4:292\n37#4:301\n81#4:302\n37#4:331\n37#4:332\n37#4:333\n*S KotlinDebug\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper\n*L\n67#1:252\n151#1:291\n186#1:297\n67#1:249,3\n67#1:253,15\n67#1:268\n67#1:269,15\n151#1:288,3\n151#1:293\n186#1:294,3\n186#1:298,3\n186#1:303,12\n186#1:315\n186#1:316,15\n94#1:284\n95#1:285\n143#1:286\n145#1:287\n152#1:292\n188#1:301\n189#1:302\n201#1:331\n232#1:332\n241#1:333\n*E\n"})
public final class a {
    public final class com.dcinside.app.realm.helper.a.a {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.realm.helper.a.a.a = arr_v;
        }
    }

    @l
    public static final a a;
    private static long b;
    @l
    private static String c;

    static {
        a.a = new a();
        a.c = "";
    }

    public static final long a() [...] // 潜在的解密器

    public final void f() {
        a.c = "";
    }

    @l
    public final I0 g() {
        @f(c = "com.dcinside.app.realm.helper.CacheHelper$deleteOldHistories$1", f = "CacheHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nCacheHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$deleteOldHistories$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,247:1\n120#2,3:248\n124#2:254\n1#3:251\n37#4:252\n37#4:253\n*S KotlinDebug\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$deleteOldHistories$1\n*L\n216#1:248,3\n216#1:254\n216#1:251\n217#1:252\n218#1:253\n*E\n"})
        static final class b extends o implements A3.o {
            int k;

            b(d d0) {
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new b(d0);
            }

            // 检测为 Lambda 实现
            private static final void f(g1 g10, g1 g11, F0 f00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                long v = System.currentTimeMillis();
                if(Math.abs(v) < TimeUnit.HOURS.toMillis(1L)) {
                    return S0.a;
                }
                a.b = v;
                long v1 = jl.a.v0();
                if(v1 <= 0L) {
                    return S0.a;
                }
                TimeUnit timeUnit0 = TimeUnit.DAYS;
                long v2 = timeUnit0.toMillis(v1);
                long v3 = timeUnit0.toMillis(14L);
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.f0.class);
                    L.o(realmQuery0, "this.where(T::class.java)");
                    g1 g10 = realmQuery0.m1("time", v - v2).p0();
                    RealmQuery realmQuery1 = f00.C4(j.class);
                    L.o(realmQuery1, "this.where(T::class.java)");
                    f00.Y3((F0 f00) -> {
                        g10.L0();
                        realmQuery1.m1("reportTime", v - v3).p0().L0();
                    });
                }
                catch(Throwable throwable0) {
                    c.a(f00, throwable0);
                    throw throwable0;
                }
                c.a(f00, null);
                return S0.a;
            }
        }

        b a$b0 = new b(null);
        return k.f(() -> i.a, null, null, a$b0, 3, null);
    }

    @y4.m
    public final d0 h(@l F0 f00, @l String s, int v) {
        L.p(f00, "realm");
        L.p(s, "galleryId");
        RealmQuery realmQuery0 = f00.C4(d0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        return (d0)realmQuery0.i0("key", d0.m.c(s, v)).r0();
    }

    @y4.m
    public final A0 i(@l F0 f00, @l String s) {
        L.p(f00, "realm");
        L.p(s, "source");
        RealmQuery realmQuery0 = f00.C4(A0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        return (A0)realmQuery0.i0("source", s).r0();
    }

    @y4.m
    public final Object j(@l String s, int v, @l Function1 function10) {
        Object object0;
        L.p(s, "galleryId");
        L.p(function10, "check");
        F0 f00 = F0.g4();
        try {
            String s1 = com.dcinside.app.realm.f0.t.d(s, v);
            L.m(f00);
            RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.f0.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            com.dcinside.app.realm.f0 f01 = (com.dcinside.app.realm.f0)realmQuery0.i0("key", s1).r0();
            if(f01 != null) {
                L.m(f01);
                object0 = function10.invoke(f01);
                goto label_15;
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
            c.a(f00, throwable0);
            throw throwable0;
        }
    label_15:
        c.a(f00, null);
        return object0;
    label_17:
        c.a(f00, null);
        return null;
    }

    @y4.m
    public final V k(@l String s) {
        V v0;
        L.p(s, "galleryId");
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            RealmQuery realmQuery0 = f00.C4(s.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            s s1 = (s)realmQuery0.i0("galleryId", s).r0();
            if(s1 == null) {
                v0 = null;
            }
            else {
                L.m(s1);
                byte[] arr_b = s1.I3();
                if(arr_b == null) {
                    v0 = null;
                }
                else {
                    L.m(arr_b);
                    String s2 = com.dcinside.app.internal.l.e(arr_b);
                    if(s2 == null) {
                        v0 = null;
                    }
                    else {
                        c0.b b0 = new c0.b(PostHead.class);
                        List list0 = (List)uk.a.s(s2, b0);
                        v0 = r0.a(s1.H3(), list0);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            c.a(f00, throwable0);
            throw throwable0;
        }
        c.a(f00, null);
        return v0;
    }

    @y4.m
    public final I0 l(@y4.m Q q0) {
        @f(c = "com.dcinside.app.realm.helper.CacheHelper$store$2", f = "CacheHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nCacheHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$store$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,247:1\n1#2:248\n1#2:252\n112#3,3:249\n129#3,15:253\n116#3:268\n129#3,15:269\n*S KotlinDebug\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$store$2\n*L\n81#1:252\n81#1:249,3\n81#1:253,15\n81#1:268\n81#1:269,15\n*E\n"})
        static final class com.dcinside.app.realm.helper.a.c extends o implements A3.o {
            int k;
            final Q l;

            com.dcinside.app.realm.helper.a.c(Q q0, d d0) {
                this.l = q0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new com.dcinside.app.realm.helper.a.c(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.dcinside.app.realm.helper.a.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                String s = this.l.G0();
                if(s.length() <= 0) {
                    s = null;
                }
                if(s == null) {
                    return S0.a;
                }
                String s1 = this.l.H0();
                if(s1 != null) {
                    if(s1.length() <= 0) {
                        s1 = null;
                    }
                    if(s1 != null) {
                        Q q0 = this.l;
                        F0 f00 = F0.g4();
                        L.m(f00);
                        if(f00.E0()) {
                            a.a.o(f00, q0);
                            a.a.p(f00, s, s1);
                            a.a.n(f00, s, q0.M0());
                        }
                        else {
                            f00.beginTransaction();
                            goto label_21;
                        }
                        goto label_35;
                        try {
                        label_21:
                            a.a.o(f00, q0);
                            a.a.p(f00, s, s1);
                            a.a.n(f00, s, q0.M0());
                            f00.p();
                            goto label_35;
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
                    label_35:
                        c.a(f00, null);
                        return S0.a;
                    }
                }
                return S0.a;
            }
        }

        if(q0 == null) {
            return null;
        }
        com.dcinside.app.realm.helper.a.c a$c0 = new com.dcinside.app.realm.helper.a.c(q0, null);
        return k.f(() -> i.a, null, null, a$c0, 3, null);
    }

    public final void m(@l GalleryInfo galleryInfo0) {
        L.p(galleryInfo0, "galleryInfo");
        String s = galleryInfo0.r();
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                String s1 = galleryInfo0.s();
                if(s1 != null) {
                    if(s1.length() <= 0) {
                        s1 = null;
                    }
                    if(s1 != null) {
                        F0 f00 = F0.g4();
                        L.m(f00);
                        if(f00.E0()) {
                            a.a.p(f00, s, s1);
                            a.a.n(f00, s, galleryInfo0.w());
                        }
                        else {
                            f00.beginTransaction();
                            goto label_18;
                        }
                        goto label_31;
                        try {
                        label_18:
                            a.a.p(f00, s, s1);
                            a.a.n(f00, s, galleryInfo0.w());
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
        }
    }

    private final void n(F0 f00, String s, List list0) {
        Gson gson0 = uk.a;
        if(list0 == null) {
            list0 = u.H();
        }
        String s1 = gson0.D(list0);
        L.o(s1, "toJson(...)");
        byte[] arr_b = com.dcinside.app.internal.l.i(s1);
        Class class0 = s.class;
        RealmQuery realmQuery0 = f00.C4(class0);
        L.o(realmQuery0, "this.where(T::class.java)");
        s s2 = (s)realmQuery0.i0("galleryId", s).r0();
        if(s2 == null) {
            X0 x00 = f00.n3(class0, s);
            L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
            s2 = (s)x00;
        }
        L.m(s2);
        s2.v2(System.currentTimeMillis());
        s2.v1(arr_b);
    }

    private final void o(F0 f00, Q q0) {
        String s = com.dcinside.app.realm.f0.t.d(q0.G0(), q0.c1());
        Class class0 = com.dcinside.app.realm.f0.class;
        RealmQuery realmQuery0 = f00.C4(class0);
        L.o(realmQuery0, "this.where(T::class.java)");
        com.dcinside.app.realm.f0 f01 = (com.dcinside.app.realm.f0)realmQuery0.i0("key", s).r0();
        if(f01 == null) {
            X0 x00 = f00.n3(class0, s);
            L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
            f01 = (com.dcinside.app.realm.f0)x00;
            f01.n6(q0.G0());
            f01.u6(q0.c1());
        }
        L.m(f01);
        f01.v6(true);
        f01.p6(((boolean)(true ^ dl.a.g1())));
        f01.o6(q0.H0());
        f01.x6(q0.k1());
        f01.k6(q0.D0());
        f01.t6(q0.X0());
        f01.y6(System.currentTimeMillis());
    }

    private final void p(F0 f00, String s, String s1) {
        if(L.g(s, "")) {
            return;
        }
        try {
            a.c = s;
            com.dcinside.app.realm.s0 s00 = com.dcinside.app.realm.s0.j.m(f00, s);
            if(s00 == null) {
                com.dcinside.app.realm.s0 s01 = new com.dcinside.app.realm.s0();
                s01.Y5(s);
                s01.Z5(s1);
                s01.c6(System.currentTimeMillis());
                m m0 = m.d.b(s);
                switch(m0) {
                    case 1: 
                    case 2: {
                        s01.a6(m.g.c());
                        break;
                    }
                    case 3: 
                    case 4: {
                        s01.a6(m0.c());
                    }
                }
                f00.t2(s01, new W[0]);
                return;
            }
            s00.c6(System.currentTimeMillis());
            s00.Z5(s1);
            return;
        }
        catch(Exception exception0) {
        }
        timber.log.b.a.y(exception0);
    }

    @y4.m
    public final I0 q(int v, @y4.m String s) {
        @f(c = "com.dcinside.app.realm.helper.CacheHelper$storeRecentSearch$1", f = "CacheHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nCacheHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$storeRecentSearch$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n112#2,3:248\n129#2,15:252\n116#2:267\n129#2,15:268\n1#3:251\n*S KotlinDebug\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$storeRecentSearch$1\n*L\n43#1:248,3\n43#1:252,15\n43#1:267\n43#1:268,15\n43#1:251\n*E\n"})
        static final class com.dcinside.app.realm.helper.a.d extends o implements A3.o {
            int k;
            final int l;
            final String m;

            com.dcinside.app.realm.helper.a.d(int v, String s, d d0) {
                this.l = v;
                this.m = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new com.dcinside.app.realm.helper.a.d(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.dcinside.app.realm.helper.a.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Class class0;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                int v = this.l;
                String s = this.m;
                F0 f00 = F0.g4();
                L.m(f00);
                boolean z = f00.E0();
                class0 = u0.class;
                if(z) {
                    goto label_24;
                }
                else {
                    f00.beginTransaction();
                    goto label_10;
                }
                goto label_40;
                try {
                label_10:
                    com.dcinside.app.realm.u0.a u0$a0 = u0.i;
                    String s1 = u0$a0.c(v, s);
                    u0 u00 = (u0)f00.C4(class0).i0("key", s1).f0("type", kotlin.coroutines.jvm.internal.b.f(v)).r0();
                    if(u00 == null) {
                        f00.t2(u0$a0.a(v, s), new W[0]);
                    }
                    else {
                        u00.Z5(u00.S5() + 1);
                        u00.b6(System.currentTimeMillis());
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
                label_24:
                    com.dcinside.app.realm.u0.a u0$a1 = u0.i;
                    String s2 = u0$a1.c(v, s);
                    u0 u01 = (u0)f00.C4(class0).i0("key", s2).f0("type", kotlin.coroutines.jvm.internal.b.f(v)).r0();
                    if(u01 == null) {
                        f00.t2(u0$a1.a(v, s), new W[0]);
                    }
                    else {
                        u01.Z5(u01.S5() + 1);
                        u01.b6(System.currentTimeMillis());
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
                return S0.a;
            }
        }

        if(s == null) {
            return null;
        }
        com.dcinside.app.realm.helper.a.d a$d0 = new com.dcinside.app.realm.helper.a.d(v, s, null);
        return k.f(() -> i.a, null, null, a$d0, 3, null);
    }

    @l
    public final I0 r(@l Q q0, @y4.m Function1 function10) {
        @f(c = "com.dcinside.app.realm.helper.CacheHelper$writeHistory$1", f = "CacheHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nCacheHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$writeHistory$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,247:1\n112#2,3:248\n129#2,3:252\n132#2,12:257\n116#2:269\n129#2,15:270\n1#3:251\n37#4:255\n81#4:256\n*S KotlinDebug\n*F\n+ 1 CacheHelper.kt\ncom/dcinside/app/realm/helper/CacheHelper$writeHistory$1\n*L\n167#1:248,3\n167#1:252,3\n167#1:257,12\n167#1:269\n167#1:270,15\n167#1:251\n169#1:255\n170#1:256\n*E\n"})
        static final class e extends o implements A3.o {
            int k;
            final Q l;
            final Function1 m;

            e(Q q0, Function1 function10, d d0) {
                this.l = q0;
                this.m = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new e(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Class class0;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Q q0 = this.l;
                Function1 function10 = this.m;
                F0 f00 = F0.g4();
                L.m(f00);
                boolean z = f00.E0();
                class0 = com.dcinside.app.realm.f0.class;
                if(z) {
                    goto label_36;
                }
                else {
                    f00.beginTransaction();
                    goto label_10;
                }
                goto label_64;
                try {
                label_10:
                    String s = com.dcinside.app.realm.f0.t.d(q0.G0(), q0.c1());
                    RealmQuery realmQuery0 = f00.C4(class0);
                    L.o(realmQuery0, "this.where(T::class.java)");
                    com.dcinside.app.realm.f0 f01 = (com.dcinside.app.realm.f0)realmQuery0.i0("key", s).r0();
                    if(f01 == null) {
                        X0 x00 = f00.n3(class0, s);
                        L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
                        ((com.dcinside.app.realm.f0)x00).n6(q0.G0());
                        ((com.dcinside.app.realm.f0)x00).u6(q0.c1());
                        f01 = (com.dcinside.app.realm.f0)x00;
                    }
                    L.m(f01);
                    f01.v6(true);
                    f01.p6(!dl.a.g1());
                    f01.o6(q0.H0());
                    f01.x6(q0.k1());
                    f01.k6(q0.D0());
                    f01.t6(q0.X0());
                    f01.y6(System.currentTimeMillis());
                    if(function10 != null) {
                        function10.invoke(f01);
                    }
                    f00.p();
                    goto label_64;
                }
                catch(Throwable throwable1) {
                }
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
                try {
                label_36:
                    String s1 = com.dcinside.app.realm.f0.t.d(q0.G0(), q0.c1());
                    RealmQuery realmQuery1 = f00.C4(class0);
                    L.o(realmQuery1, "this.where(T::class.java)");
                    com.dcinside.app.realm.f0 f02 = (com.dcinside.app.realm.f0)realmQuery1.i0("key", s1).r0();
                    if(f02 == null) {
                        X0 x01 = f00.n3(class0, s1);
                        L.o(x01, "this.createObject(T::class.java, primaryKeyValue)");
                        ((com.dcinside.app.realm.f0)x01).n6(q0.G0());
                        ((com.dcinside.app.realm.f0)x01).u6(q0.c1());
                        f02 = (com.dcinside.app.realm.f0)x01;
                    }
                    L.m(f02);
                    f02.v6(true);
                    f02.p6(!dl.a.g1());
                    f02.o6(q0.H0());
                    f02.x6(q0.k1());
                    f02.k6(q0.D0());
                    f02.t6(q0.X0());
                    f02.y6(System.currentTimeMillis());
                    if(function10 != null) {
                        function10.invoke(f02);
                    }
                    goto label_64;
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
            label_64:
                c.a(f00, null);
                return S0.a;
            }
        }

        L.p(q0, "info");
        e a$e0 = new e(q0, function10, null);
        return k.f(() -> i.a, null, null, a$e0, 3, null);
    }

    public final void s(@l String s, int v, @l Function1 function10) {
        Class class0;
        L.p(s, "galleryId");
        L.p(function10, "fixIt");
        F0 f00 = F0.g4();
        L.m(f00);
        boolean z = f00.E0();
        class0 = com.dcinside.app.realm.f0.class;
        if(z) {
            goto label_27;
        }
        else {
            f00.beginTransaction();
            goto label_8;
        }
        goto label_48;
        try {
        label_8:
            String s1 = com.dcinside.app.realm.f0.t.d(s, v);
            RealmQuery realmQuery0 = f00.C4(class0);
            L.o(realmQuery0, "this.where(T::class.java)");
            com.dcinside.app.realm.f0 f01 = (com.dcinside.app.realm.f0)realmQuery0.i0("key", s1).r0();
            if(f01 == null) {
                X0 x00 = f00.n3(class0, s1);
                L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
                ((com.dcinside.app.realm.f0)x00).n6(s);
                ((com.dcinside.app.realm.f0)x00).u6(v);
                f01 = (com.dcinside.app.realm.f0)x00;
            }
            L.m(f01);
            f01.y6(System.currentTimeMillis());
            function10.invoke(f01);
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
        label_27:
            String s2 = com.dcinside.app.realm.f0.t.d(s, v);
            RealmQuery realmQuery1 = f00.C4(class0);
            L.o(realmQuery1, "this.where(T::class.java)");
            com.dcinside.app.realm.f0 f02 = (com.dcinside.app.realm.f0)realmQuery1.i0("key", s2).r0();
            if(f02 == null) {
                X0 x01 = f00.n3(class0, s2);
                L.o(x01, "this.createObject(T::class.java, primaryKeyValue)");
                ((com.dcinside.app.realm.f0)x01).n6(s);
                ((com.dcinside.app.realm.f0)x01).u6(v);
                f02 = (com.dcinside.app.realm.f0)x01;
            }
            L.m(f02);
            f02.y6(System.currentTimeMillis());
            function10.invoke(f02);
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

    public static I0 t(a a0, Q q0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = null;
        }
        return a0.r(q0, function10);
    }
}

