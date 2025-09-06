package com.dcinside.app.settings;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentTransaction;
import com.dcinside.app.base.g;
import com.dcinside.app.rx.bus.J;
import com.dcinside.app.rx.bus.c;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingActivity.kt\ncom/dcinside/app/settings/SettingActivity\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n60#2:53\n1#3:54\n*S KotlinDebug\n*F\n+ 1 SettingActivity.kt\ncom/dcinside/app/settings/SettingActivity\n*L\n30#1:53\n*E\n"})
public final class SettingActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private b w;
    @l
    public static final a x = null;
    @l
    public static final String y = "com.dcinside.app.settings.SettingActivity.EXTRA_OTP_URL";
    @l
    public static final String z = "autoBackupNotificationAction";

    static {
        SettingActivity.x = new a(null);
    }

    private final void M1(J j0) {
        this.finish();
    }

    // 检测为 Lambda 实现
    private static final void N1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.settings.SettingActivity.b extends N implements Function1 {
            final SettingActivity e;

            com.dcinside.app.settings.SettingActivity.b(SettingActivity settingActivity0) {
                this.e = settingActivity0;
                super(1);
            }

            public final void a(J j0) {
                L.m(j0);
                this.e.M1(j0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((J)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        this.setContentView(0x7F0E0073);  // layout:activity_settings
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
        j0 j00 = new j0();
        j00.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.settings.SettingsFragment.KEY_OTP_URL", this.getIntent().getStringExtra("com.dcinside.app.settings.SettingActivity.EXTRA_OTP_URL"))}));
        fragmentTransaction0.C(0x7F0B0EE9, j00).q();  // id:settings_fragment_container
        b b0 = this.w;
        if(b0 != null) {
            b0.l();
        }
        this.w = new b();
        o o0 = c.c(this, J.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.SettingActivity.b(this), "$tmp0");
            new com.dcinside.app.settings.SettingActivity.b(this).invoke(object0);
        });
        b b1 = this.w;
        if(b1 != null) {
            b1.a(o0);
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        b b0 = this.w;
        if(b0 != null) {
            b0.l();
        }
        this.w = null;
    }
}

