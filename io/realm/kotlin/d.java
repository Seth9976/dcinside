package io.realm.kotlin;

import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.X0;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.i;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

public final class d {
    public static final X0 a(F0 f00, X0 x00, String s) {
        L.p(f00, "<this>");
        L.p(x00, "parentObject");
        L.p(s, "parentProperty");
        L.y(4, "T");
        X0 x01 = f00.R2(X0.class, x00, s);
        L.o(x01, "this.createEmbeddedObjec…ntObject, parentProperty)");
        return x01;
    }

    public static final X0 b(F0 f00) {
        L.p(f00, "<this>");
        L.y(4, "T");
        X0 x00 = f00.i3(X0.class);
        L.o(x00, "this.createObject(T::class.java)");
        return x00;
    }

    public static final X0 c(F0 f00, Object object0) {
        L.p(f00, "<this>");
        L.y(4, "T");
        X0 x00 = f00.n3(X0.class, object0);
        L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
        return x00;
    }

    public static final void d(F0 f00) {
        L.p(f00, "<this>");
        L.y(4, "T");
        f00.T3(X0.class);
    }

    @m
    public static final Object e(@l F0 f00, @l g g0, @l Function1 function10, @l kotlin.coroutines.d d0) {
        @f(c = "io.realm.kotlin.RealmExtensionsKt", f = "RealmExtensions.kt", i = {0}, l = {0x8E}, m = "executeTransactionAwait", n = {"$this$executeTransactionAwait"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            a(kotlin.coroutines.d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return d.e(null, null, null, this);
            }
        }


        @f(c = "io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2", f = "RealmExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            private Object l;
            final F0 m;
            final Function1 n;

            b(F0 f00, Function1 function10, kotlin.coroutines.d d0) {
                this.m = f00;
                this.n = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(Function1 function10, F0 f00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.l;
                F0 f00 = F0.k4(this.m.T());
                Function1 function10 = this.n;
                try {
                    if(P.k(o0)) {
                        f00.Y3((F0 f00) -> function10.invoke(f00));
                    }
                    goto label_13;
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
            label_13:
                c.a(f00, null);
                return S0.a;
            }
        }

        a d$a0;
        if(d0 instanceof a) {
            d$a0 = (a)d0;
            int v = d$a0.m;
            if((v & 0x80000000) == 0) {
                d$a0 = new a(d0);
            }
            else {
                d$a0.m = v ^ 0x80000000;
            }
        }
        else {
            d$a0 = new a(d0);
        }
        Object object0 = d$a0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(d$a0.m) {
            case 0: {
                f0.n(object0);
                b d$b0 = new b(f00, function10, null);
                d$a0.k = f00;
                d$a0.m = 1;
                if(i.h(g0, d$b0, d$a0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f00 = (F0)d$a0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f00.T0();
        return S0.a;
    }

    public static Object f(F0 f00, g g0, Function1 function10, kotlin.coroutines.d d0, int v, Object object0) {
        if((v & 1) != 0) {
            io.realm.internal.async.d d1 = F0.p;
            L.o(d1, "WRITE_EXECUTOR");
            g0 = w0.d(d1);
        }
        return d.e(f00, g0, function10, d0);
    }

    @l
    public static final kotlinx.coroutines.flow.i g(@l F0 f00) {
        L.p(f00, "<this>");
        kotlinx.coroutines.flow.i i0 = f00.T().h().f(f00);
        L.o(i0, "configuration.flowFactory.from(this)");
        return i0;
    }

    public static final RealmQuery h(F0 f00) {
        L.p(f00, "<this>");
        L.y(4, "T");
        RealmQuery realmQuery0 = f00.C4(X0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        return realmQuery0;
    }
}

