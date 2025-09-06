package com.dcinside.app.realm.helper;

import com.dcinside.app.realm.f0;
import com.dcinside.app.util.Bk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import timber.log.b;
import y4.l;
import y4.m;

public final class d {
    public final void a(@l String s) {
        @f(c = "com.dcinside.app.realm.helper.TempHelper$createPostHistory$1", f = "TempHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nTempHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempHelper.kt\ncom/dcinside/app/realm/helper/TempHelper$createPostHistory$1\n+ 2 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,79:1\n37#2:80\n37#2:81\n*S KotlinDebug\n*F\n+ 1 TempHelper.kt\ncom/dcinside/app/realm/helper/TempHelper$createPostHistory$1\n*L\n22#1:80\n37#1:81\n*E\n"})
        static final class a extends o implements A3.o {
            int k;
            final String l;

            a(String s, kotlin.coroutines.d d0) {
                this.l = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new a(this.l, d0);
            }

            private static final void f(h l0$h0, F0 f00, long v, kotlin.jvm.internal.l0.f l0$f0) {
                if(((List)l0$h0.a).size() > 0) {
                    f00.Z3((F0 f00) -> {
                        f00.p2(((List)l0$h0.a), new W[0]);
                        L.m(f00);
                        RealmQuery realmQuery0 = f00.C4(f0.class);
                        L.o(realmQuery0, "this.where(T::class.java)");
                        Object[] arr_object = {((long)(System.nanoTime() - v)), realmQuery0.N(), l0$f0.a};
                        b.a.a("createPostHistory: completed, %s, %s / %s", arr_object);
                    });
                    l0$h0.a = new ArrayList();
                }
            }

            // 检测为 Lambda 实现
            private static final void g(List list0, long v, kotlin.jvm.internal.l0.f l0$f0, F0 f00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                F0 f00 = F0.g4();
                long v = System.nanoTime();
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(f0.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                Number number0 = realmQuery0.G1("postNumber");
                int v1 = number0 == null ? 0 : number0.intValue();
                long v2 = System.currentTimeMillis();
                long v3 = v2 - TimeUnit.DAYS.toMillis(5L);
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                h l0$h0 = new h();
                l0$h0.a = new ArrayList();
                while(v3 < v2) {
                    int v4 = l0$f0.a + 1;
                    l0$f0.a = v4;
                    int v5 = v4 + v1;
                    String s = f0.t.d(this.l, v5);
                    f0 f01 = new f0();
                    f01.r6(s);
                    f01.n6(this.l);
                    f01.o6(this.l);
                    f01.u6(v5);
                    f01.v6(true);
                    f01.p6(kotlin.random.f.a.c());
                    f01.z6(kotlin.random.f.a.c());
                    f01.w6(kotlin.random.f.a.c());
                    f01.s6(kotlin.random.f.a.c());
                    f01.m6(kotlin.random.f.a.c());
                    f01.q6(kotlin.random.f.a.c());
                    f01.x6(s);
                    f01.k6(Bk.H(v3));
                    f01.t6(String.valueOf(kotlin.random.f.a.l()));
                    f01.y6(v3);
                    v3 += 0x10E1L;
                    ((List)l0$h0.a).add(f01);
                    if(l0$f0.a % 1000 == 0) {
                        Object[] arr_object = {f01.T5()};
                        b.a.a("createPostHistory: in progress, %s", arr_object);
                    }
                    if(l0$f0.a % 10000 == 0) {
                        Object[] arr_object1 = {f01.T5()};
                        b.a.a("createPostHistory: in progress, %s", arr_object1);
                        a.f(l0$h0, f00, v, l0$f0);
                    }
                }
                a.f(l0$h0, f00, v, l0$f0);
                return S0.a;
            }
        }

        L.p(s, "galleryId");
        throw new RuntimeException("temp work is activated");
    }
}

