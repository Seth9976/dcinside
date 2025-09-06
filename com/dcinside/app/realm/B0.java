package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.F2;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class b0 extends d1 implements F2 {
    @s0({"SMAP\nMatchOtp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchOtp.kt\ncom/dcinside/app/realm/MatchOtp$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n113#2,2:82\n129#2,15:85\n116#2:100\n129#2,15:101\n1#3:84\n*S KotlinDebug\n*F\n+ 1 MatchOtp.kt\ncom/dcinside/app/realm/MatchOtp$Companion\n*L\n75#1:82,2\n75#1:85,15\n75#1:100\n75#1:101,15\n75#1:84\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void g(@m F0 f00, @m String s) {
            if(f00 == null) {
                return;
            }
            b0 b00 = (b0)f00.C4(b0.class).i0("id", s).r0();
            if(b00 == null) {
                return;
            }
            if(f00.isClosed()) {
                F0 f01 = F0.g4();
                L.m(f01);
                if(f01.E0()) {
                    b00.z5();
                }
                else {
                    f01.beginTransaction();
                    goto label_12;
                }
                goto label_24;
                try {
                label_12:
                    b00.z5();
                    f01.p();
                    goto label_24;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f01.E0()) {
                            f01.e();
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
                    c.a(f01, throwable0);
                    throw throwable2;
                }
            label_24:
                c.a(f01, null);
                return;
            }
            if(f00.E0()) {
                b00.z5();
                return;
            }
            f00.beginTransaction();
            try {
                b00.z5();
                f00.p();
            }
            catch(Throwable throwable3) {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable3;
            }
        }

        @n
        public final void h(@l String s, @l Function1 function10) {
            L.p(s, "id");
            L.p(function10, "onCompletion");
            F0 f00 = F0.g4();
            try {
                f00.c4((F0 f00) -> {
                    L.p(s, "$id");
                    b0 b00 = (b0)f00.C4(b0.class).i0("id", s).r0();
                    if(b00 == null) {
                        return;
                    }
                    b00.z5();
                }, () -> {
                    L.p(function10, "$onCompletion");
                    function10.invoke(null);
                }, (Throwable throwable0) -> {
                    L.p(function10, "$onCompletion");
                    function10.invoke(throwable0);
                });
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
        }

        // 检测为 Lambda 实现
        private static final void i(String s, F0 f00) [...]

        // 检测为 Lambda 实现
        private static final void j(Function1 function10) [...]

        // 检测为 Lambda 实现
        private static final void k(Function1 function10, Throwable throwable0) [...]

        @m
        @n
        public final String l(@m F0 f00, @m String s) {
            if(f00 != null) {
                RealmQuery realmQuery0 = f00.C4(b0.class);
                if(realmQuery0 != null) {
                    RealmQuery realmQuery1 = realmQuery0.i0("id", s);
                    if(realmQuery1 != null) {
                        b0 b00 = (b0)realmQuery1.r0();
                        return b00 == null ? null : b00.S5();
                    }
                }
            }
            return null;
        }

        @m
        @n
        public final String m(@m F0 f00, @m String s) {
            if(f00 != null) {
                RealmQuery realmQuery0 = f00.C4(b0.class);
                if(realmQuery0 != null) {
                    RealmQuery realmQuery1 = realmQuery0.i0("id", s);
                    if(realmQuery1 != null) {
                        b0 b00 = (b0)realmQuery1.r0();
                        return b00 == null ? null : b00.U5();
                    }
                }
            }
            return null;
        }

        @n
        public final void n(@l b0 b00, @l Function1 function10) {
            L.p(b00, "matchOtp");
            L.p(function10, "onCompletion");
            F0 f00 = F0.g4();
            try {
                f00.c4((F0 f00) -> {
                    L.p(b00, "$matchOtp");
                    f00.t2(b00, new W[0]);
                }, () -> {
                    L.p(function10, "$onCompletion");
                    function10.invoke(null);
                }, (Throwable throwable0) -> {
                    L.p(function10, "$onCompletion");
                    function10.invoke(throwable0);
                });
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
        }

        // 检测为 Lambda 实现
        private static final void o(b0 b00, F0 f00) [...]

        // 检测为 Lambda 实现
        private static final void p(Function1 function10) [...]

        // 检测为 Lambda 实现
        private static final void q(Function1 function10, Throwable throwable0) [...]
    }

    @e
    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    @l
    public static final a g;

    static {
        b0.g = new a(null);
    }

    public b0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.F2
    public void J(String s) {
        this.f = s;
    }

    @n
    public static final void Q5(@m F0 f00, @m String s) {
        b0.g.g(f00, s);
    }

    @n
    public static final void R5(@l String s, @l Function1 function10) {
        b0.g.h(s, function10);
    }

    @m
    public String S5() {
        return this.f0();
    }

    @Override  // io.realm.F2
    public String T() {
        return this.e;
    }

    @m
    public String T5() {
        return this.m();
    }

    @m
    public String U5() {
        return this.T();
    }

    @m
    @n
    public static final String V5(@m F0 f00, @m String s) {
        return b0.g.l(f00, s);
    }

    @m
    @n
    public static final String W5(@m F0 f00, @m String s) {
        return b0.g.m(f00, s);
    }

    @n
    public static final void X5(@l b0 b00, @l Function1 function10) {
        b0.g.n(b00, function10);
    }

    public void Y5(@m String s) {
        this.J(s);
    }

    public void Z5(@m String s) {
        this.q(s);
    }

    public void a6(@m String s) {
        this.g0(s);
    }

    @Override  // io.realm.F2
    public String f0() {
        return this.f;
    }

    @Override  // io.realm.F2
    public void g0(String s) {
        this.e = s;
    }

    @Override  // io.realm.F2
    public String m() {
        return this.d;
    }

    @Override  // io.realm.F2
    public void q(String s) {
        this.d = s;
    }
}

