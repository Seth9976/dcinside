package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.h;
import com.google.firebase.remoteconfig.c;
import com.google.firebase.remoteconfig.e;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.remoteconfig.v;
import com.google.firebase.remoteconfig.w;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.k;
import kotlinx.coroutines.P;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public final class d {
    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    @l
    public static final w a(@l p p0, @l String s) {
        L.p(p0, "<this>");
        L.p(s, "key");
        w w0 = p0.z(s);
        L.o(w0, "this.getValue(key)");
        return w0;
    }

    @l
    public static final i b(@l p p0) {
        @f(c = "com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {0x77}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            private Object l;
            final p m;

            a(p p0, kotlin.coroutines.d d0) {
                this.m = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new a(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m kotlin.coroutines.d d1) {
                return ((a)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class com.google.firebase.remoteconfig.ktx.d.a.a extends N implements A3.a {
                    final e e;

                    com.google.firebase.remoteconfig.ktx.d.a.a(e e0) {
                        this.e = e0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.remove();
                    }
                }


                public static final class b implements com.google.firebase.remoteconfig.d {
                    final p a;
                    final D b;

                    b(p p0, D d0) {
                        this.a = p0;
                        this.b = d0;
                        super();
                    }

                    @Override  // com.google.firebase.remoteconfig.d
                    public void a(@l c c0) {
                        L.p(c0, "configUpdate");
                        com.google.firebase.remoteconfig.ktx.e e0 = () -> {
                            L.p(this.b, "$$this$callbackFlow");
                            L.p(c0, "$configUpdate");
                            r.m0(this.b, c0);
                        };
                        this.a.L(e0);
                    }

                    @Override  // com.google.firebase.remoteconfig.d
                    public void b(@l com.google.firebase.remoteconfig.r r0) {
                        L.p(r0, "error");
                        P.c(this.b, "Error listening for config updates.", r0);
                    }

                    // 检测为 Lambda 实现
                    private static final void d(D d0, c c0) [...]
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        b d$a$b0 = new b(this.m, d0);
                        e e0 = this.m.k(d$a$b0);
                        L.o(e0, "FirebaseRemoteConfig.con…      }\n        }\n      )");
                        com.google.firebase.remoteconfig.ktx.d.a.a d$a$a0 = new com.google.firebase.remoteconfig.ktx.d.a.a(e0);
                        this.k = 1;
                        return B.a(d0, d$a$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(p0, "<this>");
        return kotlinx.coroutines.flow.k.s(new a(p0, null));
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    public static void c(p p0) {
    }

    @l
    public static final p d(@l n2.b b0) {
        L.p(b0, "<this>");
        p p0 = p.t();
        L.o(p0, "getInstance()");
        return p0;
    }

    @l
    public static final p e(@l n2.b b0, @l h h0) {
        L.p(b0, "<this>");
        L.p(h0, "app");
        p p0 = p.u(h0);
        L.o(p0, "getInstance(app)");
        return p0;
    }

    @l
    public static final v f(@l Function1 function10) {
        L.p(function10, "init");
        com.google.firebase.remoteconfig.v.b v$b0 = new com.google.firebase.remoteconfig.v.b();
        function10.invoke(v$b0);
        v v0 = v$b0.c();
        L.o(v0, "builder.build()");
        return v0;
    }
}

