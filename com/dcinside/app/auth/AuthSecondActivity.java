package com.dcinside.app.auth;

import A3.p;
import Y.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.d;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.b0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.gl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.o;
import rx.schedulers.c;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nAuthSecondActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthSecondActivity.kt\ncom/dcinside/app/auth/AuthSecondActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,284:1\n257#2,2:285\n257#2,2:287\n1557#3:289\n1628#3,3:290\n774#3:293\n865#3,2:294\n192#4,7:296\n*S KotlinDebug\n*F\n+ 1 AuthSecondActivity.kt\ncom/dcinside/app/auth/AuthSecondActivity\n*L\n114#1:285,2\n115#1:287,2\n234#1:289\n234#1:290,3\n235#1:293\n235#1:294,2\n245#1:296,7\n*E\n"})
public final class AuthSecondActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l ActivityResultLauncher activityResultLauncher0, @l String s, @l String s1) {
            L.p(context0, "context");
            L.p(activityResultLauncher0, "launcher");
            L.p(s, "id");
            L.p(s1, "pw");
            Intent intent0 = new Intent(context0, AuthSecondActivity.class);
            intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID", s);
            intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW", s1);
            intent0.setAction("actionOtpMode");
            activityResultLauncher0.b(intent0);
        }

        @n
        public final void b(@l Context context0, @l String s, @l String s1) {
            L.p(context0, "context");
            L.p(s, "id");
            L.p(s1, "pw");
            Intent intent0 = new Intent(context0, AuthSecondActivity.class);
            intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID", s);
            intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW", s1);
            intent0.setAction("actionOtpMode");
            Activity activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
            if(activity0 != null) {
                activity0.startActivityForResult(intent0, 0x40C);
            }
        }
    }

    @l
    public static final String A = "com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_LOGIN";
    @l
    public static final String B = "com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID";
    @l
    public static final String C = "com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW";
    private h u;
    private String v;
    private String w;
    @m
    private o x;
    @l
    public static final a y = null;
    @l
    private static final String z = "actionOtpMode";

    static {
        AuthSecondActivity.y = new a(null);
    }

    private final void M1(String s) {
        static final class b extends N implements Function1 {
            final AuthSecondActivity e;
            final String f;
            final String g;

            b(AuthSecondActivity authSecondActivity0, String s, String s1) {
                this.e = authSecondActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(B b0) {
                gl.j(this.e);
                L.m(b0);
                AuthSecondActivity.R1(this.e, b0, this.f, this.g, false, 8, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((B)object0));
                return S0.a;
            }
        }

        String s1 = this.v;
        String s2 = null;
        if(s1 == null) {
            L.S("loginId");
            s1 = null;
        }
        String s3 = this.w;
        if(s3 == null) {
            L.S("loginPw");
        }
        else {
            s2 = s3;
        }
        gl.c(this);
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = uk.HF(s1, s2, null, null, s, null, "otp").A5(c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new b(this, s1, s2), "$tmp0");
            new b(this, s1, s2).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            gl.j(this);
            this.Y1((throwable0 instanceof com.dcinside.app.http.h ? "입력하신 코드가 정확하지 않습니다. 다시 입력해 주세요." : throwable0.getMessage()));
        });
    }

    // 检测为 Lambda 实现
    private static final void N1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O1(AuthSecondActivity authSecondActivity0, Throwable throwable0) [...]

    private final void P1() {
        h h0 = this.u;
        if(h0 == null) {
            L.S("binding");
            h0 = null;
        }
        String s = String.valueOf(h0.e.getText());
        if(s.length() == 0) {
            Dl.E(this, 0x7F15072A, 0);  // string:otp_auth_input_code "OTP 코드를 입력하세요."
            return;
        }
        this.M1(s);
    }

    private final void Q1(B b0, String s, String s1, boolean z) {
        static final class com.dcinside.app.auth.AuthSecondActivity.d extends N implements Function1 {
            final AuthSecondActivity e;
            final B f;
            final String g;
            final String h;

            com.dcinside.app.auth.AuthSecondActivity.d(AuthSecondActivity authSecondActivity0, B b0, String s, String s1) {
                this.e = authSecondActivity0;
                this.f = b0;
                this.g = s;
                this.h = s1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 == null) {
                    AuthSecondActivity.S1(this.e, this.f, this.g, this.h);
                    return;
                }
                Dl.G(this.e, throwable0.getLocalizedMessage());
            }
        }

        if(z) {
            h h0 = this.u;
            if(h0 == null) {
                L.S("binding");
                h0 = null;
            }
            if(h0.c.isChecked()) {
                b0 b00 = new b0();
                b00.Z5(s);
                b00.a6(b0.n6());
                b00.Y5("otp");
                com.dcinside.app.auth.AuthSecondActivity.d authSecondActivity$d0 = new com.dcinside.app.auth.AuthSecondActivity.d(this, b0, s, s1);
                b0.g.n(b00, authSecondActivity$d0);
                return;
            }
        }
        AuthSecondActivity.S1(this, b0, s, s1);
    }

    static void R1(AuthSecondActivity authSecondActivity0, B b0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = true;
        }
        authSecondActivity0.Q1(b0, s, s1, z);
    }

    private static final void S1(AuthSecondActivity authSecondActivity0, B b0, String s, String s1) {
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_LOGIN", uk.a.D(b0));
        intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID", s);
        intent0.putExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW", s1);
        intent0.putExtra("com.dcinside.app.EXTRA_LOGIN_URL_RESULT", B.E.k0());
        authSecondActivity0.setResult(-1, intent0);
        authSecondActivity0.finish();
    }

    @n
    public static final void T1(@l Context context0, @l String s, @l String s1) {
        AuthSecondActivity.y.b(context0, s, s1);
    }

    private final void U1() {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("otpauth://totp"));
        List list0 = this.getPackageManager().queryIntentActivities(intent0, 0);
        L.o(list0, "queryIntentActivities(...)");
        ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((ResolveInfo)object0).activityInfo.applicationInfo.packageName);
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            String s = (String)object1;
            if(s != null && s.length() > 0 && !L.g("com.dcinside.app.android", s)) {
                arrayList1.add(object1);
            }
        }
        if(arrayList1.isEmpty()) {
            h h0 = this.u;
            if(h0 == null) {
                L.S("binding");
                h0 = null;
            }
            L.o(h0.h, "authSecondOtpExternal");
            Snackbar.D0(h0.h, 0x7F15073A, -1).m0();  // string:otp_code_no_external_app "실행 가능한 앱이 없습니다."
            return;
        }
        V[] arr_v = {r0.a("KEY_PACKAGE_NAME_LIST", arrayList1)};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = com.dcinside.app.auth.m.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.auth.m");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.auth.ExternalOtpBottomSheetFragment");
        }
        ((com.dcinside.app.auth.m)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
        ((com.dcinside.app.auth.m)fragment0).show(fragmentManager0, "com.dcinside.app.auth.m");
    }

    private final void V1() {
        com.dcinside.app.auth.OtpCodeActivity.a.b(OtpCodeActivity.z, this, true, false, 4, null);
    }

    private final void W1() {
        String s = com.dcinside.app.internal.c.i(vk.b(this, 0x7F0402BF));  // attr:favorIconFilledBgColor
        String s1 = com.dcinside.app.internal.c.i(vk.b(this, 0x7F0401F8));  // attr:dcBodyLinkColor
        h h0 = this.u;
        h h1 = null;
        if(h0 == null) {
            L.S("binding");
            h0 = null;
        }
        L.o(h0.j, "authSecondProgress");
        h0.j.setVisibility(8);
        h h2 = this.u;
        if(h2 == null) {
            L.S("binding");
            h2 = null;
        }
        L.o(h2.b, "authSecondOtp");
        h2.b.setVisibility(0);
        h h3 = this.u;
        if(h3 == null) {
            L.S("binding");
            h3 = null;
        }
        Spanned spanned0 = Dl.c(this.getString(0x7F150116, new Object[]{s}));  // string:auth_second_verification_desc "<font color=%1$s>OTP</font> 확인 후 <b>인증 코드</b>를 
                                                                               // 입력하세요."
        h3.i.setText(spanned0);
        h h4 = this.u;
        if(h4 == null) {
            L.S("binding");
            h4 = null;
        }
        Spanned spanned1 = Dl.c(this.getString(0x7F15072C, new Object[]{s1}));  // string:otp_auth_settings "<font color=#BDBDBD>2단계 인증은 모바일 웹의 \'고정닉 정보 - 보안 센터\'에서 
                                                                                // 사용 등록/해지 할 수 있습니다.</font> <font color=%s><u>보안 센터 ></u></font>"
        h4.g.setText(spanned1);
        h h5 = this.u;
        if(h5 == null) {
            L.S("binding");
        }
        else {
            h1 = h5;
        }
        h1.c.setChecked(true);
    }

    private final void X1() {
        @f(c = "com.dcinside.app.auth.AuthSecondActivity$setupListener$1", f = "AuthSecondActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AuthSecondActivity l;

            e(AuthSecondActivity authSecondActivity0, kotlin.coroutines.d d0) {
                this.l = authSecondActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.P1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.AuthSecondActivity$setupListener$2", f = "AuthSecondActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.AuthSecondActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AuthSecondActivity m;

            com.dcinside.app.auth.AuthSecondActivity.f(AuthSecondActivity authSecondActivity0, kotlin.coroutines.d d0) {
                this.m = authSecondActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.auth.AuthSecondActivity.f authSecondActivity$f0 = new com.dcinside.app.auth.AuthSecondActivity.f(this.m, d0);
                authSecondActivity$f0.l = view0;
                return authSecondActivity$f0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                k.a.a();
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.m);
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                    if(awesomeWebView$Builder1 != null) {
                        Object object1 = view0.getTag();
                        L.n(object1, "null cannot be cast to non-null type kotlin.String");
                        awesomeWebView$Builder1.y5(((String)object1));
                    }
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.AuthSecondActivity$setupListener$3", f = "AuthSecondActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AuthSecondActivity l;

            g(AuthSecondActivity authSecondActivity0, kotlin.coroutines.d d0) {
                this.l = authSecondActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.V1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.AuthSecondActivity$setupListener$4", f = "AuthSecondActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.AuthSecondActivity.h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AuthSecondActivity l;

            com.dcinside.app.auth.AuthSecondActivity.h(AuthSecondActivity authSecondActivity0, kotlin.coroutines.d d0) {
                this.l = authSecondActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.auth.AuthSecondActivity.h(this.l, d0).invokeSuspend(S0.a);
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
                this.l.U1();
                return S0.a;
            }
        }

        h h0 = this.u;
        if(h0 == null) {
            L.S("binding");
            h0 = null;
        }
        L.o(h0.f, "authSecondOtpConfirm");
        e authSecondActivity$e0 = new e(this, null);
        r.M(h0.f, null, authSecondActivity$e0, 1, null);
        h h1 = this.u;
        if(h1 == null) {
            L.S("binding");
            h1 = null;
        }
        L.o(h1.g, "authSecondOtpDesc");
        com.dcinside.app.auth.AuthSecondActivity.f authSecondActivity$f0 = new com.dcinside.app.auth.AuthSecondActivity.f(this, null);
        r.M(h1.g, null, authSecondActivity$f0, 1, null);
        h h2 = this.u;
        if(h2 == null) {
            L.S("binding");
            h2 = null;
        }
        L.o(h2.d, "authSecondOtpCheck");
        g authSecondActivity$g0 = new g(this, null);
        r.M(h2.d, null, authSecondActivity$g0, 1, null);
        h h3 = this.u;
        if(h3 == null) {
            L.S("binding");
            h3 = null;
        }
        L.o(h3.h, "authSecondOtpExternal");
        com.dcinside.app.auth.AuthSecondActivity.h authSecondActivity$h0 = new com.dcinside.app.auth.AuthSecondActivity.h(this, null);
        r.M(h3.h, null, authSecondActivity$h0, 1, null);
    }

    private final void Y1(String s) {
        static final class i extends N implements Function1 {
            final String e;

            i(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new i(s)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0x40C && v1 == -1 && intent0 != null) {
            String s = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_LOGIN");
            B b0 = (B)uk.a.r(s, B.class);
            String s1 = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID");
            if(s1 == null) {
                return;
            }
            String s2 = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW");
            if(s2 == null) {
                return;
            }
            L.m(b0);
            this.Q1(b0, s1, s2, false);
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        this.setResult(0, new Intent());
        this.finish();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.auth.AuthSecondActivity.c extends N implements Function1 {
            final AuthSecondActivity e;

            com.dcinside.app.auth.AuthSecondActivity.c(AuthSecondActivity authSecondActivity0) {
                this.e = authSecondActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 == null) {
                    this.e.W1();
                    this.e.X1();
                    return;
                }
                Dl.G(this.e, throwable0.getLocalizedMessage());
                this.e.finish();
            }
        }

        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        String s = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_ID");
        String s1 = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_PW");
        if(s != null && s1 != null) {
            this.v = s;
            this.w = s1;
            h h0 = h.c(this.getLayoutInflater());
            L.o(h0, "inflate(...)");
            this.u = h0;
            h h1 = null;
            if(h0 == null) {
                L.S("binding");
                h0 = null;
            }
            this.setContentView(h0.b());
            h h2 = this.u;
            if(h2 == null) {
                L.S("binding");
            }
            else {
                h1 = h2;
            }
            this.S0(h1.k);
            kr.bhbfhfb.designcompat.a.d(this);
            com.dcinside.app.auth.AuthSecondActivity.c authSecondActivity$c0 = new com.dcinside.app.auth.AuthSecondActivity.c(this);
            b0.g.h(s, authSecondActivity$c0);
            return;
        }
        this.finish();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

