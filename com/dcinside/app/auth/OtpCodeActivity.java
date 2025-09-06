package com.dcinside.app.auth;

import Y.P;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.barcode.BarcodeCaptureActivity;
import com.dcinside.app.barcode.i;
import com.dcinside.app.base.g;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.otp.b.d;
import com.dcinside.app.util.otp.b;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.O0;
import com.leinardi.android.speeddial.SpeedDialActionItem;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class OtpCodeActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, boolean z, boolean z1) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, OtpCodeActivity.class);
            if(!z1) {
                intent0.addFlags(0x4000000);
            }
            intent0.putExtra("EXTRA_CLOSEABLE", z);
            context0.startActivity(intent0);
        }

        public static void b(a otpCodeActivity$a0, Context context0, boolean z, boolean z1, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            if((v & 4) != 0) {
                z1 = false;
            }
            otpCodeActivity$a0.a(context0, z, z1);
        }
    }

    @l
    private static final String A = "EXTRA_CLOSEABLE";
    private P w;
    private b x;
    private boolean y;
    @l
    public static final a z;

    static {
        OtpCodeActivity.z = new a(null);
    }

    private final void R1() {
        i i0 = i.a;
        if(!i0.b(this)) {
            Dl.D(this, 0x7F15072F);  // string:otp_code_camera_not_found_on_device "바코드를 스캔할 수 있는 카메라가 필요합니다."
            return;
        }
        if(!i0.c(this)) {
            Dl.D(this, 0x7F150740);  // string:otp_code_update_google_play_services "바코드 스캐너를 사용하려면 Google Play 서비스를 업데이트하세요."
            return;
        }
        if(!i0.a(this)) {
            if(i0.d(this)) {
                Dl.D(this, 0x7F150739);  // string:otp_code_low_storage_error "기기에 저장 공간이 충분하지 않습니다."
                return;
            }
            Dl.D(this, 0x7F15072E);  // string:otp_code_barcode_scanner_not_available "현재 바코드 스캐너를 사용할 수 없습니다."
            return;
        }
        this.startActivityForResult(new Intent(this, BarcodeCaptureActivity.class), 0x40D);
    }

    private final SpeedDialActionItem S1(int v, int v1, String s) {
        SpeedDialActionItem speedDialActionItem0 = new com.leinardi.android.speeddial.SpeedDialActionItem.b(v, v1).t(vk.b(this, 0x7F04048D)).u(vk.b(this, 0x7F040490)).y(s).B(ContextCompat.getColor(this, 0x7F0605B8)).z(ContextCompat.getColor(this, 0x7F0605A2)).q();  // attr:otpCodeBackgroundColor
        L.o(speedDialActionItem0, "create(...)");
        return speedDialActionItem0;
    }

    private final void T1(int v) {
        static final class com.dcinside.app.auth.OtpCodeActivity.b extends N implements Function1 {
            final OtpCodeActivity e;
            final d f;

            com.dcinside.app.auth.OtpCodeActivity.b(OtpCodeActivity otpCodeActivity0, d b$d0) {
                this.e = otpCodeActivity0;
                this.f = b$d0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                p$a0.K(this.e.getString(0x7F150734, new Object[]{this.f.getName()}));  // string:otp_code_delete_title "%1$s을(를) 삭제하시겠습니까?"
                return p$a0.m(0x7F150732);  // string:otp_code_delete_content "계정을 삭제하면 코드를 생성할 수 없게 됩니다. 하지만 2단계 인증도 사용 중지되는 것은 
                                            // 아닙니다. 이로 인해 계정에 로그인하지 못할 수도 있습니다.\n\n삭제하기 전에 다음 작업 중 하나를 완료하세요.\n\n- 계정에서 2단계 인증을 
                                            // 사용 중지합니다.\n\n- 코드를 생성할 수 있는 다른 수단을 마련합니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class com.dcinside.app.auth.OtpCodeActivity.d extends N implements Function1 {
            final OtpCodeActivity e;
            final d f;

            com.dcinside.app.auth.OtpCodeActivity.d(OtpCodeActivity otpCodeActivity0, d b$d0) {
                this.e = otpCodeActivity0;
                this.f = b$d0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                b b0 = this.e.x;
                if(b0 == null) {
                    L.S("accountDb");
                    b0 = null;
                }
                b0.g(this.f);
                this.e.d2();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        b b0 = this.x;
        if(b0 == null) {
            L.S("accountDb");
            b0 = null;
        }
        d b$d0 = (d)b0.n().get(v);
        if(b$d0 == null) {
            return;
        }
        e.e.a(this).n(new com.dcinside.app.auth.OtpCodeActivity.b(this, b$d0)).z(0x7F150733).x(0x7F150731).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.auth.OtpCodeActivity.d(this, b$d0), "$tmp0");
            new com.dcinside.app.auth.OtpCodeActivity.d(this, b$d0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean U1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V1(Function1 function10, Object object0) [...]

    private final void W1() {
        this.startActivity(new Intent(this, OtpEnterActivity.class));
    }

    private final boolean X1(SpeedDialActionItem speedDialActionItem0) {
        switch(speedDialActionItem0.D()) {
            case 0x7F0B0453: {  // id:enter_key
                this.W1();
                return false;
            }
            case 0x7F0B0DA0: {  // id:scan_barcode
                this.R1();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    private final void Y1(String s) {
        k.a.a();
        Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this);
        if(awesomeWebView$Builder0 != null) {
            Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.R5(this, 0x40E);
            if(awesomeWebView$Builder1 != null) {
                Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.J6(true);
                if(awesomeWebView$Builder2 != null) {
                    awesomeWebView$Builder2.y5(s);
                }
            }
        }
    }

    private final void Z1() {
        this.x = new b(this);
        this.y = this.getIntent().getBooleanExtra("EXTRA_CLOSEABLE", false);
    }

    private final void a2() {
        static final class com.dcinside.app.auth.OtpCodeActivity.e extends N implements Function1 {
            final OtpCodeActivity e;

            com.dcinside.app.auth.OtpCodeActivity.e(OtpCodeActivity otpCodeActivity0) {
                this.e = otpCodeActivity0;
                super(1);
            }

            public final void a(int v) {
                this.e.T1(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }


        static final class f extends N implements Function1 {
            final OtpCodeActivity e;

            f(OtpCodeActivity otpCodeActivity0) {
                this.e = otpCodeActivity0;
                super(1);
            }

            public final void b(@l String s) {
                L.p(s, "it");
                this.e.Y1(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        P p0 = this.w;
        P p1 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        O0 o00 = new O0(0);
        p0.c.addItemDecoration(o00);
        P p2 = this.w;
        if(p2 == null) {
            L.S("binding");
            p2 = null;
        }
        v v0 = new v(this, new com.dcinside.app.auth.OtpCodeActivity.e(this), new f(this));
        p2.c.setAdapter(v0);
        P p3 = this.w;
        if(p3 == null) {
            L.S("binding");
        }
        else {
            p1 = p3;
        }
        L.o("설정 키 입력", "getString(...)");
        SpeedDialActionItem speedDialActionItem0 = this.S1(0x7F0B0453, 0x7F08032E, "설정 키 입력");  // id:enter_key
        p1.b.d(speedDialActionItem0);
        L.o("QR 코드 스캔", "getString(...)");
        SpeedDialActionItem speedDialActionItem1 = this.S1(0x7F0B0DA0, 0x7F080339, "QR 코드 스캔");  // id:scan_barcode
        p1.b.d(speedDialActionItem1);
        s s0 = (SpeedDialActionItem speedDialActionItem0) -> {
            L.p(this, "this$0");
            L.m(speedDialActionItem0);
            return this.X1(speedDialActionItem0);
        };
        p1.b.setOnActionSelectedListener(s0);
    }

    // 检测为 Lambda 实现
    private static final boolean b2(OtpCodeActivity otpCodeActivity0, SpeedDialActionItem speedDialActionItem0) [...]

    private final void c2() {
        P p0 = this.w;
        P p1 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        this.S0(p0.d);
        kr.bhbfhfb.designcompat.a.d(this);
        if(this.y) {
            P p2 = this.w;
            if(p2 == null) {
                L.S("binding");
            }
            else {
                p1 = p2;
            }
            p1.d.setNavigationIcon(0x7F08012F);  // drawable:btn_close
        }
    }

    private final void d2() {
        P p0 = this.w;
        v v0 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        Adapter recyclerView$Adapter0 = p0.c.getAdapter();
        if(recyclerView$Adapter0 instanceof v) {
            v0 = (v)recyclerView$Adapter0;
        }
        if(v0 != null) {
            v0.x();
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        b b1;
        String s4;
        super.onActivityResult(v, v1, intent0);
        if(v == 0x40D && v1 == -1) {
            String s = intent0 == null ? null : intent0.getStringExtra("EXTRA_BARCODE_VALUE");
            Uri uri0 = s == null ? null : Uri.parse(s);
            String s1 = uri0 == null ? null : uri0.getQueryParameter("secret");
            String s2 = uri0 == null ? null : uri0.getQueryParameter("issuer");
            if(uri0 == null) {
                s4 = null;
            }
            else {
                String s3 = uri0.getPath();
                s4 = s3 == null ? null : kotlin.text.v.l2(s3, "/", "", false, 4, null);
            }
            try {
                b b0 = this.x;
                if(b0 == null) {
                    L.S("accountDb");
                    b1 = null;
                }
                else {
                    b1 = b0;
                }
                b1.a(s2, s1, com.dcinside.app.util.otp.b.e.b, b.b, null, s4);
                this.d2();
            }
            catch(Exception unused_ex) {
                Dl.D(this, 0x7F15073E);  // string:otp_code_registration_failure "OTP 등록을 실패했습니다."
            }
            return;
        }
        if(v == 0x40E) {
            this.d2();
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        P p0 = this.w;
        P p1 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        if(p0.b.s()) {
            P p2 = this.w;
            if(p2 == null) {
                L.S("binding");
            }
            else {
                p1 = p2;
            }
            p1.b.i();
            return;
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.getWindow().setFlags(0x2000, 0x2000);
        P p0 = P.c(this.getLayoutInflater());
        L.o(p0, "inflate(...)");
        this.w = p0;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        this.setContentView(p0.b());
        this.Z1();
        this.c2();
        this.a2();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        P p0 = this.w;
        v v0 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        Adapter recyclerView$Adapter0 = p0.c.getAdapter();
        if(recyclerView$Adapter0 instanceof v) {
            v0 = (v)recyclerView$Adapter0;
        }
        if(v0 != null) {
            v0.release();
        }
        super.onDestroy();
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onNewIntent(@l Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        this.d2();
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

