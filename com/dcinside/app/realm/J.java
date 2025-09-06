package com.dcinside.app.realm;

import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.model.Q;
import com.dcinside.app.perform.e;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.rx.bus.U;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.util.dl;
import io.realm.F0;
import io.realm.W;
import io.realm.b2;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class j extends d1 implements b2 {
    @s0({"SMAP\nBlockReportedPost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockReportedPost.kt\ncom/dcinside/app/realm/BlockReportedPost$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n120#2,3:128\n129#2,15:132\n124#2:147\n129#2,15:148\n120#2,3:163\n124#2:167\n1#3:131\n1#3:166\n*S KotlinDebug\n*F\n+ 1 BlockReportedPost.kt\ncom/dcinside/app/realm/BlockReportedPost$Companion\n*L\n88#1:128,3\n104#1:132,15\n88#1:147\n104#1:148,15\n118#1:163,3\n118#1:167\n88#1:131\n118#1:166\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void b(@l Q q0, @l AppCompatActivity appCompatActivity0) {
            static final class com.dcinside.app.realm.j.a.a extends N implements Function1 {
                final int e;

                com.dcinside.app.realm.j.a.a(int v) {
                    this.e = v;
                    super(1);
                }

                @m
                public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                    L.p(p$a0, "it");
                    return p$a0.m(this.e);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((com.dcinside.app.perform.p.a)object0));
                }
            }


            static final class b extends N implements Function1 {
                final Q e;
                final AppCompatActivity f;

                b(Q q0, AppCompatActivity appCompatActivity0) {
                    this.e = q0;
                    this.f = appCompatActivity0;
                    super(1);
                }

                public final void a(Boolean boolean0) {
                    L.m(boolean0);
                    if(boolean0.booleanValue()) {
                        j.k.d(this.e, this.f);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Boolean)object0));
                    return S0.a;
                }
            }

            int v;
            L.p(q0, "info");
            L.p(appCompatActivity0, "activity");
            dl dl0 = dl.a;
            if(dl0.Y()) {
                this.d(q0, appCompatActivity0);
                return;
            }
            if(dl0.X1()) {
                v = 0x7F150182;  // string:block_report_post_message "신고글을 차단하시겠습니까?"
            }
            else {
                dl0.J5(true);
                v = 0x7F150183;  // string:block_report_post_message_first "신고글을 차단하시겠습니까?(차단한 신고글은 \'차단 설정 > 신고글 차단\'에서 
                                 // 확인 가능)"
            }
            e.e.a(appCompatActivity0).n(new com.dcinside.app.realm.j.a.a(v)).z(0x104000A).x(0x7F1501C1).b().x5((Object object0) -> {
                L.p(new b(q0, appCompatActivity0), "$tmp0");
                new b(q0, appCompatActivity0).invoke(object0);
            });
        }

        // 检测为 Lambda 实现
        private static final void c(Function1 function10, Object object0) [...]

        @n
        public final void d(@l Q q0, @l AppCompatActivity appCompatActivity0) {
            j j0;
            L.p(q0, "postInfo");
            L.p(appCompatActivity0, "activity");
            String s = q0.G0();
            int v = q0.c1();
            F0 f00 = F0.g4();
            L.m(f00);
            if(((j)f00.C4(j.class).i0("galleryId", s).f0("postNumber", v).r0()) == null) {
                j0 = new j();
                j0.e6(System.currentTimeMillis());
                j0.a6(s);
                j0.d6(v);
                j0.b6(q0.H0());
                j0.f6(q0.k1());
                j0.Z5(q0.D0());
                j0.c6(q0.X0());
                if(f00.E0()) {
                    j j1 = (j)f00.o2(j0, new W[0]);
                }
                else {
                    f00.beginTransaction();
                    goto label_19;
                }
            }
            goto label_26;
            try {
            label_19:
                j j2 = (j)f00.o2(j0, new W[0]);
                f00.p();
                goto label_26;
            }
            catch(Throwable throwable1) {
                try {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable1;
                label_26:
                    c.a(appCompatActivity0, new U(s, v));
                    goto label_33;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable2;
            }
        label_33:
            kotlin.io.c.a(f00, null);
        }

        @n
        public final boolean e(@l PostItem postItem0, @m String s) {
            L.p(postItem0, "item");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                if(f00.C4(j.class).i0("galleryId", s).f0("postNumber", postItem0.C()).r0() == null) {
                    goto label_10;
                }
                else {
                    goto label_8;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable0;
            }
        label_8:
            boolean z = true;
            goto label_11;
        label_10:
            z = false;
        label_11:
            kotlin.io.c.a(f00, null);
            return z;
        }
    }

    @h3.e
    private long d;
    @h3.c
    @m
    private String e;
    @m
    private String f;
    private int g;
    @m
    private String h;
    @m
    private String i;
    @m
    private String j;
    @l
    public static final a k;

    static {
        j.k = new a(null);
    }

    public j() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @n
    public static final void Q5(@l Q q0, @l AppCompatActivity appCompatActivity0) {
        j.k.d(q0, appCompatActivity0);
    }

    @m
    public String R5() {
        return this.p();
    }

    @m
    public String S5() {
        return this.a();
    }

    @m
    public String T5() {
        return this.j();
    }

    @m
    public String U5() {
        return this.f();
    }

    public int V5() {
        return this.g();
    }

    public long W5() {
        return this.i5();
    }

    @m
    public String X5() {
        return this.k();
    }

    @n
    public static final boolean Y5(@l PostItem postItem0, @m String s) {
        return j.k.e(postItem0, s);
    }

    public void Z5(@m String s) {
        this.r(s);
    }

    @Override  // io.realm.b2
    public String a() {
        return this.e;
    }

    public void a6(@m String s) {
        this.b(s);
    }

    @Override  // io.realm.b2
    public void b(String s) {
        this.e = s;
    }

    public void b6(@m String s) {
        this.h(s);
    }

    public void c6(@m String s) {
        this.e(s);
    }

    public void d6(int v) {
        this.o(v);
    }

    @Override  // io.realm.b2
    public void e(String s) {
        this.j = s;
    }

    public void e6(long v) {
        this.w4(v);
    }

    @Override  // io.realm.b2
    public String f() {
        return this.j;
    }

    public void f6(@m String s) {
        this.l(s);
    }

    @Override  // io.realm.b2
    public int g() {
        return this.g;
    }

    @Override  // io.realm.b2
    public void h(String s) {
        this.f = s;
    }

    @Override  // io.realm.b2
    public long i5() {
        return this.d;
    }

    @Override  // io.realm.b2
    public String j() {
        return this.f;
    }

    @Override  // io.realm.b2
    public String k() {
        return this.h;
    }

    @Override  // io.realm.b2
    public void l(String s) {
        this.h = s;
    }

    @Override  // io.realm.b2
    public void o(int v) {
        this.g = v;
    }

    @Override  // io.realm.b2
    public String p() {
        return this.i;
    }

    @Override  // io.realm.b2
    public void r(String s) {
        this.i = s;
    }

    @Override  // io.realm.b2
    public void w4(long v) {
        this.d = v;
    }
}

