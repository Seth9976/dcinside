package com.dcinside.app.main.login;

import A3.a;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.auth.AuthSecondActivity;
import com.dcinside.app.http.h;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.b0;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.xk;
import io.realm.F0;
import java.io.File;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nLoginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginUtils.kt\ncom/dcinside/app/main/login/LoginUtils\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n177#2,9:289\n120#2,3:306\n124#2:310\n257#3,2:298\n257#3,2:300\n257#3,2:302\n257#3,2:304\n1#4:309\n*S KotlinDebug\n*F\n+ 1 LoginUtils.kt\ncom/dcinside/app/main/login/LoginUtils\n*L\n125#1:289,9\n172#1:306,3\n172#1:310\n153#1:298,2\n154#1:300,2\n157#1:302,2\n158#1:304,2\n172#1:309\n*E\n"})
public final class g {
    @l
    public static final g a;
    @m
    private static o b;

    static {
        g.a = new g();
    }

    public final void g(@l TextView textView0, @l B b0) {
        String s1;
        L.p(textView0, "view");
        L.p(b0, "login");
        String s = b0.m6();
        if(s == null) {
            s1 = "";
        }
        else {
            s1 = v.Z8(s, 2);
            if(s1 == null) {
                s1 = "";
            }
        }
        textView0.setText(s1);
        if(b0.g6()) {
            r.n0(textView0, 0x7F0605B8);  // color:white
            int v = b0.p6();
            int v1 = 0x7F08069F;  // drawable:simple_login_oval0
            if(v != 0) {
                switch(v) {
                    case 1: {
                        v1 = 0x7F0806A0;  // drawable:simple_login_oval1
                        break;
                    }
                    case 2: {
                        v1 = 0x7F0806A1;  // drawable:simple_login_oval2
                        break;
                    }
                    case 3: {
                        v1 = 0x7F0806A2;  // drawable:simple_login_oval3
                        break;
                    }
                    case 4: {
                        v1 = 0x7F0806A3;  // drawable:simple_login_oval4
                    }
                }
            }
            textView0.setBackgroundResource(v1);
            return;
        }
        r.n0(textView0, 0x7F06014F);  // color:login_profile_normal_border
        textView0.setBackgroundResource(0x7F080487);  // drawable:oval_login_profile_normal
    }

    public final void h(@l AppCompatActivity appCompatActivity0, @l B b0, @m F0 f00, boolean z, @m a a0) {
        static final class com.dcinside.app.main.login.g.a extends N implements a {
            final String e;
            final String f;
            final String g;
            final String h;
            final AppCompatActivity i;
            final F0 j;
            final B k;
            final a l;

            com.dcinside.app.main.login.g.a(String s, String s1, String s2, String s3, AppCompatActivity appCompatActivity0, F0 f00, B b0, a a0) {
                this.e = s;
                this.f = s1;
                this.g = s2;
                this.h = s3;
                this.i = appCompatActivity0;
                this.j = f00;
                this.k = b0;
                this.l = a0;
                super(0);
            }

            @l
            public final o c() {
                static final class com.dcinside.app.main.login.g.a.a extends N implements Function1 {
                    final AppCompatActivity e;
                    final F0 f;

                    com.dcinside.app.main.login.g.a.a(AppCompatActivity appCompatActivity0, F0 f00) {
                        this.e = appCompatActivity0;
                        this.f = f00;
                        super(1);
                    }

                    public final void a(@l B b0) {
                        L.p(b0, "newLogin");
                        g.a.r(this.e, b0, true, this.f);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((B)object0));
                        return S0.a;
                    }
                }

                o o0 = uk.IF(this.e, this.f, null, null, null, this.g, this.h).y5((Object object0) -> {
                    L.p(new com.dcinside.app.main.login.g.a.a(this.i, this.j), "$tmp0");
                    new com.dcinside.app.main.login.g.a.a(this.i, this.j).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.i, "$activity");
                    L.p(this.k, "$selectedLogin");
                    L.p(throwable0, "error");
                    L.m(this.f);
                    g.a.q(this.i, throwable0, this.e, this.f, this.k);
                    if(this.l != null) {
                        this.l.invoke();
                    }
                });
                L.o(o0, "subscribe(...)");
                return o0;
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(AppCompatActivity appCompatActivity0, String s, String s1, B b0, a a0, Throwable throwable0) [...]

            @Override  // A3.a
            public Object invoke() {
                return this.c();
            }
        }


        static final class b extends N implements Function1 {
            final AppCompatActivity e;
            final F0 f;

            b(AppCompatActivity appCompatActivity0, F0 f00) {
                this.e = appCompatActivity0;
                this.f = f00;
                super(1);
            }

            public final void a(@l B b0) {
                L.p(b0, "newLogin");
                g.a.r(this.e, b0, true, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((B)object0));
                return S0.a;
            }
        }

        L.p(appCompatActivity0, "activity");
        L.p(b0, "selectedLogin");
        if(!b0.s()) {
            return;
        }
        String s = b0.r6();
        if(s != null && s.length() != 0) {
            String s1 = AccountManager.get(appCompatActivity0).getPassword(new Account(s, "com.dcinside.app.android"));
            if(s1 != null && s1.length() != 0) {
                String s2 = b0.n6();
                String s3 = b0.Z5();
                g.b = z ? e.e.a(appCompatActivity0).m().A(new com.dcinside.app.main.login.g.a(s, s1, s2, s3, appCompatActivity0, f00, b0, a0)).b().t5() : uk.IF(s, s1, null, null, null, s2, s3).y5((Object object0) -> {
                    L.p(new b(appCompatActivity0, f00), "$tmp0");
                    new b(appCompatActivity0, f00).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(appCompatActivity0, "$activity");
                    L.p(b0, "$selectedLogin");
                    L.p(throwable0, "error");
                    L.m(s1);
                    g.a.q(appCompatActivity0, throwable0, s, s1, b0);
                    if(a0 != null) {
                        a0.invoke();
                    }
                });
                return;
            }
            this.t(appCompatActivity0, b0);
            return;
        }
        this.t(appCompatActivity0, b0);
    }

    // 检测为 Lambda 实现
    private static final void i(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j(AppCompatActivity appCompatActivity0, String s, String s1, B b0, a a0, Throwable throwable0) [...]

    @l
    public final File k(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "origin");
        File file0 = new File(context0.getFilesDir(), "profile_images");
        if(!file0.exists()) {
            file0.mkdirs();
        }
        File file1 = new File(file0, "1757089604103");
        kotlin.io.m.T(new File(s), file1, true, 0, 4, null);
        return file1;
    }

    public final void l(@l AppCompatActivity appCompatActivity0, @l B b0) {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F1500B3);  // string:alert_simple_account_delete "간편 로그인을 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class d extends N implements Function1 {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.main.login.g.e extends N implements Function1 {
            final B e;
            final AppCompatActivity f;

            com.dcinside.app.main.login.g.e(B b0, AppCompatActivity appCompatActivity0) {
                this.e = b0;
                this.f = appCompatActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                @s0({"SMAP\nLoginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginUtils.kt\ncom/dcinside/app/main/login/LoginUtils$deleteAccount$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
                static final class com.dcinside.app.main.login.g.e.a extends N implements Function1 {
                    final AppCompatActivity e;
                    final String f;

                    com.dcinside.app.main.login.g.e.a(AppCompatActivity appCompatActivity0, String s) {
                        this.e = appCompatActivity0;
                        this.f = s;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Boolean)object0).booleanValue());
                        return S0.a;
                    }

                    public final void invoke(boolean z) {
                        if(!z) {
                            Dl.D(this.e, 0x7F150322);  // string:failed_logout "로그아웃을 실패했습니다.\n잠시 후 다시 시도해주세요."
                        }
                        String s = this.f;
                        if(s != null) {
                            g.a.o(s);
                        }
                    }
                }

                String s = this.e.o6();
                com.dcinside.app.main.login.g.e.a g$e$a0 = new com.dcinside.app.main.login.g.e.a(this.f, s);
                B.E.Z(this.f, this.e, g$e$a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(appCompatActivity0, "activity");
        L.p(b0, "login");
        e.e.a(appCompatActivity0).n(c.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(d.e, "$tmp0");
            return (Boolean)d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.main.login.g.e(b0, appCompatActivity0), "$tmp0");
            new com.dcinside.app.main.login.g.e(b0, appCompatActivity0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean m(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void n(Function1 function10, Object object0) [...]

    public final void o(@l String s) {
        L.p(s, "imagePath");
        File file0 = new File(s);
        try {
            file0.delete();
        }
        catch(Exception unused_ex) {
        }
    }

    public final boolean p() {
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            if(f00.C4(B.class).b0("flagSimple", Boolean.TRUE).N() > 0L) {
                goto label_7;
            }
            else {
                goto label_9;
            }
            goto label_10;
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
    label_7:
        boolean z = true;
        goto label_10;
    label_9:
        z = false;
    label_10:
        kotlin.io.c.a(f00, null);
        return z;
    }

    private final void q(AppCompatActivity appCompatActivity0, Throwable throwable0, String s, String s1, B b0) {
        static final class f extends N implements Function1 {
            final AppCompatActivity e;

            f(AppCompatActivity appCompatActivity0) {
                this.e = appCompatActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    Dl.D(this.e, 0x7F150309);  // string:failed_account_pw_mismatch_select "식별 코드 또는 비밀번호가 잘못되어 선택한 간편 로그인을 사용할 수 
                                               // 없습니다.\n다시 로그인해주세요."
                    return;
                }
                Dl.D(this.e, 0x7F15032D);  // string:failed_refresh_login_info "계정 정보 갱신을 실패했습니다."
            }
        }

        e.e.a(appCompatActivity0).o();
        if(!(throwable0 instanceof h)) {
            if(xk.e(throwable0.getMessage())) {
                f g$f0 = new f(appCompatActivity0);
                B.E.Z(appCompatActivity0, b0, g$f0);
            }
            else {
                Dl.G(appCompatActivity0, throwable0.getMessage());
            }
        }
        else if(appCompatActivity0 instanceof com.dcinside.app.base.g) {
            ActivityResultLauncher activityResultLauncher0 = ((com.dcinside.app.base.g)appCompatActivity0).G1();
            if(activityResultLauncher0 != null) {
                AuthSecondActivity.y.a(appCompatActivity0, activityResultLauncher0, s, s1);
            }
        }
        else {
            AuthSecondActivity.y.b(appCompatActivity0, s, s1);
        }
        o o0 = g.b;
        if(o0 != null) {
            o0.l();
        }
    }

    public final void r(@l AppCompatActivity appCompatActivity0, @l B b0, boolean z, @m F0 f00) {
        static final class com.dcinside.app.main.login.g.g extends N implements Function1 {
            final AppCompatActivity e;

            com.dcinside.app.main.login.g.g(AppCompatActivity appCompatActivity0) {
                this.e = appCompatActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 != null) {
                    Dl.G(this.e, throwable0.getLocalizedMessage());
                }
            }
        }


        static final class com.dcinside.app.main.login.g.h extends N implements Function1 {
            final B e;
            final AppCompatActivity f;

            com.dcinside.app.main.login.g.h(B b0, AppCompatActivity appCompatActivity0) {
                this.e = b0;
                this.f = appCompatActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 == null) {
                    Integer integer0 = this.e.w6();
                    if(integer0 != null && ((int)integer0) == 1) {
                        Al.y(this.f);
                    }
                    String s = this.e.B6();
                    if(s != null && s.length() == 0) {
                        Al.E(this.f);
                    }
                }
                else {
                    Dl.G(this.f, throwable0.getLocalizedMessage());
                }
                com.dcinside.app.rx.bus.e e0 = new com.dcinside.app.rx.bus.e();
                com.dcinside.app.rx.bus.c.a(this.f, e0);
                o o0 = g.b;
                if(o0 != null) {
                    o0.l();
                }
            }
        }

        String s1;
        boolean z2;
        boolean z1;
        L.p(appCompatActivity0, "activity");
        L.p(b0, "login");
        String s = b0.r6();
        if(s == null) {
            return;
        }
        if(f00 == null) {
            return;
        }
        com.dcinside.app.realm.B.b b$b0 = B.E;
        B b1 = b$b0.U(f00, s);
        if(b1 == null) {
            z1 = false;
            s1 = null;
            z2 = false;
        }
        else {
            z1 = b1.e6();
            z2 = b1.g6();
            s1 = b1.n6();
        }
        String s2 = b0.A6();
        String s3 = b0.n6();
        if(!L.g("1", s2) && !Boolean.parseBoolean(s2) && !m0.a.a.k(s3)) {
            com.dcinside.app.main.login.g.g g$g0 = new com.dcinside.app.main.login.g.g(appCompatActivity0);
            b0.g.h(s, g$g0);
            b0.Z6(null);
        }
        else if(z) {
            if(m0.a.a.k(s3)) {
                b0.Z6(s3);
            }
            else {
                b0.Z6(s1);
            }
        }
        if(L.g("1", b0.y6()) || Boolean.parseBoolean(b0.y6())) {
            b0.N6(null);
            Dl.D(appCompatActivity0, 0x7F150289);  // string:dormancy_is_true_msg "휴면 해제되었습니다. 정상적인 서비스 이용이 가능합니다."
        }
        b$b0.M(b0, z1, z2, new com.dcinside.app.main.login.g.h(b0, appCompatActivity0));
    }

    public final void s() {
        o o0 = g.b;
        if(o0 != null) {
            o0.l();
        }
    }

    private final void t(AppCompatActivity appCompatActivity0, B b0) {
        static final class i extends N implements Function1 {
            final AppCompatActivity e;

            i(AppCompatActivity appCompatActivity0) {
                this.e = appCompatActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    Dl.D(this.e, 0x7F15030A);  // string:failed_account_select "계정 정보를 조회할 수 없어 선택한 식별 코드를 사용할 수 없습니다.\n다시 로그인해주세요."
                    return;
                }
                Dl.D(this.e, 0x7F15032D);  // string:failed_refresh_login_info "계정 정보 갱신을 실패했습니다."
            }
        }

        if(appCompatActivity0.isFinishing()) {
            return;
        }
        i g$i0 = new i(appCompatActivity0);
        B.E.Z(appCompatActivity0, b0, g$i0);
    }

    public final void u(@l TextView textView0, @l ImageView imageView0, @l B b0) {
        L.p(textView0, "nameView");
        L.p(imageView0, "iconView");
        L.p(b0, "login");
        String s = b0.o6();
        if(s != null && s.length() != 0) {
            textView0.setVisibility(8);
            imageView0.setVisibility(0);
            imageView0.clearColorFilter();
            com.dcinside.app.glide.a.l(imageView0).g0().v2(b0.o6()).U1().q1(imageView0);
            return;
        }
        textView0.setVisibility(0);
        imageView0.setVisibility(8);
        this.g(textView0, b0);
    }
}

