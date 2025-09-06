package com.dcinside.app.auth;

import A3.p;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.core.content.IntentCompat;
import com.dcinside.app.base.g;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.http.c;
import com.dcinside.app.http.h;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.b0;
import com.dcinside.app.realm.c0;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.xk;
import com.dcinside.app.view.tool.e;
import com.hjq.toast.s;
import io.realm.F0;
import io.realm.RealmQuery;
import java.net.URLEncoder;
import java.util.Arrays;
import kotlin.S0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nAuthenticatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticatorActivity.kt\ncom/dcinside/app/auth/AuthenticatorActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,380:1\n108#2:381\n80#2,22:382\n257#3,2:404\n257#3,2:406\n*S KotlinDebug\n*F\n+ 1 AuthenticatorActivity.kt\ncom/dcinside/app/auth/AuthenticatorActivity\n*L\n167#1:381\n167#1:382,22\n186#1:404,2\n211#1:406,2\n*E\n"})
public final class AuthenticatorActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private AccountAuthenticatorResponse A;
    @m
    private Bundle B;
    @m
    private ActivityResultLauncher C;
    @l
    public static final a D = null;
    @l
    private static final String E = "new_device";
    @m
    private AccountManager w;
    private Y.g x;
    @m
    private o y;
    @m
    private e z;

    static {
        AuthenticatorActivity.D = new a(null);
    }

    private final o Y1(String s, String s1, String s2, String s3) {
        static final class b extends N implements Function1 {
            final AuthenticatorActivity e;
            final String f;
            final String g;

            b(AuthenticatorActivity authenticatorActivity0, String s, String s1) {
                this.e = authenticatorActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(@l B b0) {
                L.p(b0, "login");
                this.e.c2(b0, this.f, this.g, true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((B)object0));
                return S0.a;
            }
        }

        e e0 = this.z;
        if(e0 != null) {
            e0.g();
        }
        e e1 = this.z;
        if(e1 != null) {
            e1.k();
        }
        com.dcinside.app.realm.B.b b$b0 = B.E;
        String s4 = b$b0.R(this.F1(), s);
        if(s4 == null) {
            s4 = b0.g.m(this.F1(), s);
        }
        String s5 = b$b0.Q(this.F1(), s);
        if(s5 == null) {
            s5 = b0.g.l(this.F1(), s);
        }
        o o0 = uk.HF(s, s1, s3, s2, null, s4, s5).y5((Object object0) -> {
            L.p(new b(this, s, s1), "$tmp0");
            new b(this, s, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(s, "$id");
            L.p(s1, "$pw");
            L.p(throwable0, "error");
            o o0 = this.y;
            if(o0 != null) {
                o0.l();
            }
            Y.g g0 = this.x;
            Y.g g1 = null;
            if(g0 == null) {
                L.S("binding");
                g0 = null;
            }
            L.o(g0.p, "loginProgress");
            g0.p.setVisibility(8);
            String s2 = throwable0.getMessage();
            if(throwable0 instanceof c) {
                e e0 = this.z;
                if(e0 != null) {
                    e0.f();
                }
            }
            else if(throwable0 instanceof h) {
                AuthSecondActivity.y.b(this, s, s1);
                return;
            }
            if(xk.e(s2)) {
                Y.g g2 = this.x;
                if(g2 == null) {
                    L.S("binding");
                }
                else {
                    g1 = g2;
                }
                g1.c.setText(0x7F1502F6);  // string:fail_login "식별 코드 또는 비밀번호가 정확하지 않습니다. 비밀번호 10회 이상 오류 시 로그인이 제한됩니다."
                return;
            }
            Y.g g3 = this.x;
            if(g3 == null) {
                L.S("binding");
            }
            else {
                g1 = g3;
            }
            g1.c.setText(s2);
        });
        L.o(o0, "subscribe(...)");
        return o0;
    }

    // 检测为 Lambda 实现
    private static final void Z1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void a2(AuthenticatorActivity authenticatorActivity0, String s, String s1, Throwable throwable0) [...]

    private final void b2(B b0) {
        String s = b0.r6();
        boolean z = L.g("new_device", b0.l6());
        int v = b0.q6();
        if(z) {
            com.dcinside.app.realm.c0.a c0$a0 = c0.h;
            if(c0$a0.c(s)) {
                goto label_11;
            }
            else {
                c0$a0.g(s);
                ActivityResultLauncher activityResultLauncher0 = this.C;
                if(activityResultLauncher0 != null) {
                    activityResultLauncher0.b(new Intent(this, LoginNotificationActivity.class));
                }
            }
        }
        else {
        label_11:
            if(this.d2(s, v)) {
                Intent intent0 = new Intent(this, CampaignActivity.class);
                intent0.putExtra("com.dcinside.app.auth.CampaignActivity.EXTRA_ID", s);
                intent0.putExtra("com.dcinside.app.auth.CampaignActivity.EXTRA_CAMPAIGN", v);
                ActivityResultLauncher activityResultLauncher1 = this.C;
                if(activityResultLauncher1 != null) {
                    activityResultLauncher1.b(intent0);
                }
            }
            else {
                this.finish();
            }
        }
    }

    private final void c2(B b0, String s, String s1, boolean z) {
        static final class com.dcinside.app.auth.AuthenticatorActivity.c extends N implements Function1 {
            final AuthenticatorActivity e;

            com.dcinside.app.auth.AuthenticatorActivity.c(AuthenticatorActivity authenticatorActivity0) {
                this.e = authenticatorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                AuthenticatorActivity authenticatorActivity0 = this.e;
                String s = throwable0 == null ? null : throwable0.getLocalizedMessage();
                if(s == null) {
                    return;
                }
                Dl.G(authenticatorActivity0, s);
            }
        }


        static final class d extends N implements Function1 {
            final B e;
            final AuthenticatorActivity f;
            final boolean g;
            final boolean h;

            d(B b0, AuthenticatorActivity authenticatorActivity0, boolean z, boolean z1) {
                this.e = b0;
                this.f = authenticatorActivity0;
                this.g = z;
                this.h = z1;
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
                    ll.h0(this.g);
                    ll.x0(this.h);
                    if(this.h) {
                        dl dl0 = dl.a;
                        if(!dl0.f2()) {
                            dl0.L4(true);
                        }
                    }
                    this.f.b2(this.e);
                    return;
                }
                Dl.G(this.f, throwable0.getMessage());
            }
        }

        if(!this.o2(s, s1)) {
            this.b2(b0);
            return;
        }
        Y.g g0 = this.x;
        if(g0 == null) {
            L.S("binding");
            g0 = null;
        }
        boolean z1 = g0.b.isChecked();
        Y.g g1 = this.x;
        if(g1 == null) {
            L.S("binding");
            g1 = null;
        }
        boolean z2 = g1.r.isChecked();
        String s2 = b0.A6();
        String s3 = b0.n6();
        boolean z3 = m0.a.a.k(s3);
        if(!L.g("1", s2) && !Boolean.parseBoolean(s2) && !z3) {
            com.dcinside.app.auth.AuthenticatorActivity.c authenticatorActivity$c0 = new com.dcinside.app.auth.AuthenticatorActivity.c(this);
            b0.g.h(s, authenticatorActivity$c0);
            b0.Z6(null);
        }
        else if(z) {
            if(!z3) {
                s3 = B.E.R(this.F1(), s);
            }
            if(s3 == null) {
                s3 = b0.g.m(this.F1(), s);
            }
            b0.Z6(s3);
        }
        d authenticatorActivity$d0 = new d(b0, this, z1, z2);
        B.E.M(b0, z1, z2, authenticatorActivity$d0);
    }

    private final boolean d2(String s, int v) {
        return v == 1 || v == 2 && c0.h.a(s) < System.currentTimeMillis();
    }

    private final void e2() {
        static final class com.dcinside.app.auth.AuthenticatorActivity.e extends N implements Function1 {
            final AuthenticatorActivity e;
            final String f;

            com.dcinside.app.auth.AuthenticatorActivity.e(AuthenticatorActivity authenticatorActivity0, String s) {
                this.e = authenticatorActivity0;
                this.f = s;
                super(1);
            }

            public final void b(String s) {
                String s1 = "app_id=" + URLEncoder.encode(s, "UTF-8");
                L.o(s1, "let(...)");
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.e);
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                    if(awesomeWebView$Builder1 != null) {
                        Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.K6(2);
                        if(awesomeWebView$Builder2 != null) {
                            Builder awesomeWebView$Builder3 = awesomeWebView$Builder2.j2(com.dcinside.app.wv.h.a(this.e));
                            if(awesomeWebView$Builder3 != null) {
                                awesomeWebView$Builder3.z5(this.f, s1);
                            }
                        }
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Y.g g0 = this.x;
        if(g0 == null) {
            L.S("binding");
            g0 = null;
        }
        Object object0 = g0.n.getTag();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        uk.Lj().y5((Object object0) -> {
            L.p(new com.dcinside.app.auth.AuthenticatorActivity.e(this, ((String)object0)), "$tmp0");
            new com.dcinside.app.auth.AuthenticatorActivity.e(this, ((String)object0)).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1504F7);  // string:important_data_changed "앱을 종료 후 다시 실행해주세요."
        });
    }

    // 检测为 Lambda 实现
    private static final void f2(Function1 function10, Object object0) [...]

    @Override  // android.app.Activity
    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = this.A;
        if(accountAuthenticatorResponse0 != null) {
            Bundle bundle0 = this.B;
            if(bundle0 == null) {
                accountAuthenticatorResponse0.onError(4, "canceled");
            }
            else {
                accountAuthenticatorResponse0.onResult(bundle0);
            }
            this.A = null;
        }
        super.finish();
    }

    // 检测为 Lambda 实现
    private static final void g2(AuthenticatorActivity authenticatorActivity0, Throwable throwable0) [...]

    private final void h2(CharSequence charSequence0) {
        Y.g g0 = this.x;
        if(g0 == null) {
            L.S("binding");
            g0 = null;
        }
        int v = m0.a.a.h(charSequence0) ? 8 : 0;
        g0.c.setVisibility(v);
    }

    private final void i2(View view0) {
        view0.setVisibility(4);
        dl.a.q4(3);
    }

    private final void j2() {
        String s5;
        String s4;
        long v;
        if(!kl.a(new o[]{this.y})) {
            return;
        }
        Y.g g0 = this.x;
        Y.g g1 = null;
        if(g0 == null) {
            L.S("binding");
            g0 = null;
        }
        if(g0.r.isChecked()) {
            F0 f00 = this.F1();
            if(f00 == null) {
                v = 0L;
            }
            else {
                RealmQuery realmQuery0 = f00.C4(B.class);
                if(realmQuery0 == null) {
                    v = 0L;
                }
                else {
                    RealmQuery realmQuery1 = realmQuery0.b0("flagSimple", Boolean.TRUE);
                    v = realmQuery1 == null ? 0L : realmQuery1.N();
                }
            }
            if(v >= 5L) {
                Y.g g2 = this.x;
                if(g2 == null) {
                    L.S("binding");
                }
                else {
                    g1 = g2;
                }
                String s = this.getString(0x7F150307, new Object[]{5});  // string:failed_account_over "간편 로그인은 %1$d개까지 가능합니다."
                g1.c.setText(s);
                return;
            }
        }
        Y.g g3 = this.x;
        if(g3 == null) {
            L.S("binding");
            g3 = null;
        }
        String s1 = String.valueOf(g3.m.getText());
        int v1 = s1.length() - 1;
        int v2 = 0;
        boolean z = false;
        while(v2 <= v1) {
            boolean z1 = L.t(s1.charAt((z ? v1 : v2)), 0x20) <= 0;
            if(z) {
                if(!z1) {
                    break;
                }
                --v1;
            }
            else if(z1) {
                ++v2;
            }
            else {
                z = true;
            }
        }
        String s2 = s1.subSequence(v2, v1 + 1).toString();
        Y.g g4 = this.x;
        if(g4 == null) {
            L.S("binding");
            g4 = null;
        }
        String s3 = String.valueOf(g4.q.getText());
        if(!m0.a.a.h(s2) && !m0.a.a.h(s3)) {
            Y.g g5 = this.x;
            if(g5 == null) {
                L.S("binding");
                g5 = null;
            }
            g5.c.setText(null);
            e e0 = this.z;
            if(e0 == null || !e0.l()) {
                s5 = null;
                s4 = null;
            }
            else {
                s4 = e0.j();
                s5 = e0.i();
            }
            Y.g g6 = this.x;
            if(g6 == null) {
                L.S("binding");
            }
            else {
                g1 = g6;
            }
            L.o(g1.p, "loginProgress");
            g1.p.setVisibility(0);
            this.y = this.Y1(s2, s3, s5, s4);
            return;
        }
        Y.g g7 = this.x;
        if(g7 == null) {
            L.S("binding");
        }
        else {
            g1 = g7;
        }
        g1.c.setText(0x7F1502F6);  // string:fail_login "식별 코드 또는 비밀번호가 정확하지 않습니다. 비밀번호 10회 이상 오류 시 로그인이 제한됩니다."
    }

    // 检测为 Lambda 实现
    private static final void k2(AuthenticatorActivity authenticatorActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void l2(AuthenticatorActivity authenticatorActivity0, ActivityResult activityResult0) [...]

    private final void m2(View view0) {
        Object object0 = view0.getTag();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        com.dcinside.app.main.a.j(this, ((String)object0));
    }

    // 检测为 Lambda 实现
    private static final void n2(AuthenticatorActivity authenticatorActivity0) [...]

    private final boolean o2(String s, String s1) {
        AccountManager accountManager0 = this.w;
        if(accountManager0 == null) {
            return false;
        }
        Account account0 = new Account(s, "com.dcinside.app.android");
        if(accountManager0.addAccountExplicitly(account0, s1, null)) {
            Intent intent0 = new Intent();
            intent0.putExtra("authAccount", s);
            intent0.putExtra("accountType", "com.dcinside.app.android");
            this.p2(intent0.getExtras());
            this.setResult(-1, intent0);
            return true;
        }
        String s2 = accountManager0.getPassword(account0);
        if(m0.a.a.i(s2)) {
            Dl.D(this, 0x7F150312);  // string:failed_create_account "계정 정보 저장을 실패했습니다.\n잠시 후 다시 시도해주세요."
            this.setResult(0);
            return false;
        }
        accountManager0.setPassword(account0, s1);
        return true;
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0x40C && v1 == -1 && intent0 != null) {
            String s = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_LOGIN");
            B b0 = (B)uk.a.r(s, B.class);
            String s1 = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID");
            String s2 = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW");
            if(s1 != null && s1.length() != 0 && s2 != null && s2.length() != 0) {
                L.m(b0);
                this.c2(b0, s1, s2, false);
                return;
            }
            s.A(0x7F150509);  // string:intro_msg1 "로그인 실패"
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class f implements TextWatcher {
            final AuthenticatorActivity a;

            f(AuthenticatorActivity authenticatorActivity0) {
                this.a = authenticatorActivity0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@m Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                this.a.h2(charSequence0);
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.auth.AuthenticatorActivity$onCreate$3", f = "AuthenticatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.AuthenticatorActivity.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AuthenticatorActivity l;

            com.dcinside.app.auth.AuthenticatorActivity.g(AuthenticatorActivity authenticatorActivity0, kotlin.coroutines.d d0) {
                this.l = authenticatorActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.auth.AuthenticatorActivity.g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.j2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.auth.AuthenticatorActivity$onCreate$4", f = "AuthenticatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.AuthenticatorActivity.h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AuthenticatorActivity m;

            com.dcinside.app.auth.AuthenticatorActivity.h(AuthenticatorActivity authenticatorActivity0, kotlin.coroutines.d d0) {
                this.m = authenticatorActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.auth.AuthenticatorActivity.h authenticatorActivity$h0 = new com.dcinside.app.auth.AuthenticatorActivity.h(this.m, d0);
                authenticatorActivity$h0.l = view0;
                return authenticatorActivity$h0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.i2(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.auth.AuthenticatorActivity$onCreate$5", f = "AuthenticatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AuthenticatorActivity m;

            i(AuthenticatorActivity authenticatorActivity0, kotlin.coroutines.d d0) {
                this.m = authenticatorActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                i authenticatorActivity$i0 = new i(this.m, d0);
                authenticatorActivity$i0.l = view0;
                return authenticatorActivity$i0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.m2(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.auth.AuthenticatorActivity$onCreate$6", f = "AuthenticatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AuthenticatorActivity m;

            j(AuthenticatorActivity authenticatorActivity0, kotlin.coroutines.d d0) {
                this.m = authenticatorActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                j authenticatorActivity$j0 = new j(this.m, d0);
                authenticatorActivity$j0.l = view0;
                return authenticatorActivity$j0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.m2(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.auth.AuthenticatorActivity$onCreate$7", f = "AuthenticatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AuthenticatorActivity l;

            k(AuthenticatorActivity authenticatorActivity0, kotlin.coroutines.d d0) {
                this.l = authenticatorActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.e2();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)IntentCompat.d(this.getIntent(), "accountAuthenticatorResponse", AccountAuthenticatorResponse.class);
        this.A = accountAuthenticatorResponse0;
        if(accountAuthenticatorResponse0 != null) {
            accountAuthenticatorResponse0.onRequestContinued();
        }
        this.w = AccountManager.get(this);
        Y.g g0 = Y.g.c(this.getLayoutInflater());
        L.o(g0, "inflate(...)");
        this.x = g0;
        if(g0 == null) {
            L.S("binding");
            g0 = null;
        }
        this.setContentView(g0.b());
        Y.g g1 = this.x;
        if(g1 == null) {
            L.S("binding");
            g1 = null;
        }
        this.S0(g1.s);
        kr.bhbfhfb.designcompat.a.d(this);
        View view0 = this.findViewById(0x1020002);
        L.o(view0, "findViewById(...)");
        e e0 = new e(view0, 0x7F0B0738, 0x7F0B073A, 0x7F0B0739, 0, 0x7F0B073B);  // id:login_code
        this.z = e0;
        e0.k();
        Y.g g2 = this.x;
        if(g2 == null) {
            L.S("binding");
            g2 = null;
        }
        g2.i.setVisibility(0);
        Y.g g3 = this.x;
        if(g3 == null) {
            L.S("binding");
            g3 = null;
        }
        boolean z = ll.J();
        g3.b.setChecked(z);
        Y.g g4 = this.x;
        if(g4 == null) {
            L.S("binding");
            g4 = null;
        }
        boolean z1 = ll.P();
        g4.r.setChecked(z1);
        Y.g g5 = this.x;
        if(g5 == null) {
            L.S("binding");
            g5 = null;
        }
        vk.h(0x7F0400E1, new View[]{g5.c});  // attr:caution
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(this, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
        L.o(s, "format(...)");
        Y.g g6 = this.x;
        if(g6 == null) {
            L.S("binding");
            g6 = null;
        }
        Spanned spanned0 = Dl.c(this.getString(0x7F150543, new Object[]{s}));  // string:login_second_auth_settings "<font color=#BDBDBD>2단계 인증으로 보안을 강화하세요.</font> 
                                                                               // <font color=%s><u>보안 센터 ></u></font>"
        g6.o.setText(spanned0);
        Y.g g7 = this.x;
        if(g7 == null) {
            L.S("binding");
            g7 = null;
        }
        com.dcinside.app.auth.f f0 = (View view0) -> {
            L.p(this, "this$0");
            L.p(view0, "v");
            com.dcinside.app.auth.k.a.a();
            Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this);
            if(awesomeWebView$Builder0 != null) {
                Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                if(awesomeWebView$Builder1 != null) {
                    Object object0 = view0.getTag();
                    L.n(object0, "null cannot be cast to non-null type kotlin.String");
                    awesomeWebView$Builder1.y5(((String)object0));
                }
            }
        };
        g7.o.setOnClickListener(f0);
        dl dl0 = dl.a;
        int v = dl0.x0();
        if(v < 3) {
            Y.g g8 = this.x;
            if(g8 == null) {
                L.S("binding");
                g8 = null;
            }
            g8.l.setVisibility(0);
            dl0.q4(v + 1);
        }
        Y.g g9 = this.x;
        if(g9 == null) {
            L.S("binding");
            g9 = null;
        }
        f authenticatorActivity$f0 = new f(this);
        g9.c.addTextChangedListener(authenticatorActivity$f0);
        Y.g g10 = this.x;
        if(g10 == null) {
            L.S("binding");
            g10 = null;
        }
        L.o(g10.h, "loginConfirm");
        com.dcinside.app.auth.AuthenticatorActivity.g authenticatorActivity$g0 = new com.dcinside.app.auth.AuthenticatorActivity.g(this, null);
        r.M(g10.h, null, authenticatorActivity$g0, 1, null);
        Y.g g11 = this.x;
        if(g11 == null) {
            L.S("binding");
            g11 = null;
        }
        L.o(g11.l, "loginIdChangeGuide");
        com.dcinside.app.auth.AuthenticatorActivity.h authenticatorActivity$h0 = new com.dcinside.app.auth.AuthenticatorActivity.h(this, null);
        r.M(g11.l, null, authenticatorActivity$h0, 1, null);
        Y.g g12 = this.x;
        if(g12 == null) {
            L.S("binding");
            g12 = null;
        }
        L.o(g12.j, "loginFindId");
        i authenticatorActivity$i0 = new i(this, null);
        r.M(g12.j, null, authenticatorActivity$i0, 1, null);
        Y.g g13 = this.x;
        if(g13 == null) {
            L.S("binding");
            g13 = null;
        }
        L.o(g13.k, "loginFindPw");
        j authenticatorActivity$j0 = new j(this, null);
        r.M(g13.k, null, authenticatorActivity$j0, 1, null);
        Y.g g14 = this.x;
        if(g14 == null) {
            L.S("binding");
            g14 = null;
        }
        L.o(g14.n, "loginJoin");
        k authenticatorActivity$k0 = new k(this, null);
        r.M(g14.n, null, authenticatorActivity$k0, 1, null);
        this.C = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "it");
            this.setResult(-1);
            this.finish();
        });
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        ActivityResultLauncher activityResultLauncher0 = this.C;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.d();
        }
        this.C = null;
        kl.b(new o[]{this.y});
        e e0 = this.z;
        if(e0 != null) {
            e0.p();
        }
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        super.onPause();
        Y.g g0 = this.x;
        if(g0 == null) {
            L.S("binding");
            g0 = null;
        }
        com.dcinside.app.auth.h h0 = () -> {
            L.p(this, "this$0");
            Nk.a.a(this);
        };
        g0.s.post(h0);
    }

    private final void p2(Bundle bundle0) {
        this.B = bundle0;
    }
}

