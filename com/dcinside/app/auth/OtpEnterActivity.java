package com.dcinside.app.auth;

import A3.p;
import Y.Q;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.otp.b;
import com.dcinside.app.util.otp.c;
import com.dcinside.app.util.otp.e;
import com.dcinside.app.util.otp.h;
import com.dcinside.app.util.otp.i;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class OtpEnterActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private String A;
    private boolean B;
    @l
    public static final a C = null;
    @l
    public static final String D = "com.dcinside.app.auth.OtpEnterActivity.EXTRA_URL";
    @l
    public static final String E = "com.dcinside.app.auth.OtpEnterActivity.EXTRA_CLOSEABLE";
    private static final int F = 10;
    private Q w;
    private b x;
    private e y;
    @m
    private String z;

    static {
        OtpEnterActivity.C = new a(null);
    }

    private final String L1() {
        Q q0 = this.w;
        if(q0 == null) {
            L.S("binding");
            q0 = null;
        }
        Editable editable0 = q0.b.getText();
        if(editable0 != null) {
            String s = editable0.toString();
            if(s != null) {
                String s1 = v.k2(s, '1', 'I', false, 4, null);
                return s1 == null ? null : v.k2(s1, '0', 'O', false, 4, null);
            }
        }
        return null;
    }

    private final void M1(boolean z) {
        String s4;
        b b1;
        Q q0 = this.w;
        String s = null;
        if(q0 == null) {
            L.S("binding");
            q0 = null;
        }
        Editable editable0 = q0.d.getText();
        String s1 = editable0 == null ? null : editable0.toString();
        if(s1 != null && s1.length() != 0) {
            String s2 = this.L1();
            try {
                if(c.a.a(s2).length < 10) {
                    Dl.D(this, 0x7F150745);  // string:otp_enter_key_is_short "키 값이 너무 짧습니다."
                    return;
                }
                b b0 = this.x;
                if(b0 == null) {
                    L.S("accountDb");
                    b1 = null;
                }
                else {
                    b1 = b0;
                }
                com.dcinside.app.util.otp.b.e b$e0 = com.dcinside.app.util.otp.b.e.b;
                Integer integer0 = b.b;
                String s3 = this.A;
                if(s3 == null) {
                    B b2 = B.E.V(this.F1());
                    if(b2 != null) {
                        s = b2.r6();
                    }
                    s4 = s;
                }
                else {
                    s4 = s3;
                }
                b1.a(s1, s2, b$e0, integer0, null, s4);
                OtpCodeActivity.z.a(this, this.B, z);
                this.finish();
            }
            catch(Exception unused_ex) {
                Dl.D(this, 0x7F150743);  // string:otp_enter_invalid_key "키 값에 잘못된 문자가 있습니다."
            }
            return;
        }
        Dl.D(this, 0x7F150747);  // string:otp_enter_name_is_empty "계정의 이름을 입력하세요."
    }

    private final void N1() {
        this.x = new b(this);
        b b0 = this.x;
        if(b0 == null) {
            L.S("accountDb");
            b0 = null;
        }
        this.y = new e(b0, new i(this, new h()));
        Intent intent0 = this.getIntent();
        this.z = intent0.getStringExtra("com.dcinside.app.auth.OtpEnterActivity.EXTRA_URL");
        this.B = intent0.getBooleanExtra("com.dcinside.app.auth.OtpEnterActivity.EXTRA_CLOSEABLE", false);
    }

    private final void O1() {
        String s4;
        String s = this.z;
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            Q q0 = null;
            String s1 = uri0 == null ? null : uri0.getQueryParameter("secret");
            String s2 = uri0 == null ? null : uri0.getQueryParameter("issuer");
            if(s1 != null && s2 != null) {
                String s3 = uri0.getPath();
                if(s3 == null) {
                    s4 = null;
                }
                else {
                    L.m(s3);
                    s4 = v.l2(s3, "/", "", false, 4, null);
                }
                this.A = s4;
                Q q1 = this.w;
                if(q1 == null) {
                    L.S("binding");
                    q1 = null;
                }
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s1);
                q1.b.setText(spannableStringBuilder0);
                Q q2 = this.w;
                if(q2 == null) {
                    L.S("binding");
                }
                else {
                    q0 = q2;
                }
                SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(s2);
                q0.d.setText(spannableStringBuilder1);
                this.B = true;
                this.M1(true);
                return;
            }
            OtpCodeActivity.z.a(this, true, true);
            this.finish();
        }
    }

    private final void P1() {
        @f(c = "com.dcinside.app.auth.OtpEnterActivity$setupListener$1", f = "OtpEnterActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.OtpEnterActivity.b extends o implements p {
            int k;
            final OtpEnterActivity l;

            com.dcinside.app.auth.OtpEnterActivity.b(OtpEnterActivity otpEnterActivity0, d d0) {
                this.l = otpEnterActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.auth.OtpEnterActivity.b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M1(false);
                return S0.a;
            }
        }

        Q q0 = this.w;
        if(q0 == null) {
            L.S("binding");
            q0 = null;
        }
        L.o(q0.c, "otpEnterConfirm");
        com.dcinside.app.auth.OtpEnterActivity.b otpEnterActivity$b0 = new com.dcinside.app.auth.OtpEnterActivity.b(this, null);
        r.M(q0.c, null, otpEnterActivity$b0, 1, null);
    }

    private final void Q1() {
        Q q0 = this.w;
        if(q0 == null) {
            L.S("binding");
            q0 = null;
        }
        this.S0(q0.e);
        kr.bhbfhfb.designcompat.a.d(this);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        Q q0 = Q.c(this.getLayoutInflater());
        L.o(q0, "inflate(...)");
        this.w = q0;
        if(q0 == null) {
            L.S("binding");
            q0 = null;
        }
        this.setContentView(q0.b());
        this.Q1();
        this.N1();
        this.O1();
        this.P1();
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

