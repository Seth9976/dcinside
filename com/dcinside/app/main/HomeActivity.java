package com.dcinside.app.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.Application;
import com.dcinside.app.backup.process.g;
import com.dcinside.app.best.e;
import com.dcinside.app.internal.t;
import com.dcinside.app.post.view.DrawerLayout;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.j;
import com.dcinside.app.rx.bus.k;
import com.dcinside.app.util.Ak;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.pl.c;
import com.dcinside.app.util.pl.d;
import com.dcinside.app.util.zk;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.igaworks.ssp.AdPopcornSSP;
import io.realm.exceptions.RealmError;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import rx.o;
import y4.l;
import y4.m;

public final class HomeActivity extends u0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @s0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/dcinside/app/main/HomeActivity$HomeHandler\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,378:1\n147#2:379\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/dcinside/app/main/HomeActivity$HomeHandler\n*L\n372#1:379\n*E\n"})
    static final class b extends Handler {
        @l
        private final t a;

        public b(@l HomeActivity homeActivity0) {
            L.p(homeActivity0, "activity");
            super(Looper.getMainLooper());
            this.a = new t(homeActivity0);
        }

        @Override  // android.os.Handler
        public void handleMessage(@l Message message0) {
            L.p(message0, "msg");
            HomeActivity homeActivity0 = (HomeActivity)this.a.a();
            if(homeActivity0 != null) {
                homeActivity0.v3(message0.what);
            }
        }
    }

    @m
    private c[] B;
    private boolean C;
    @m
    private Intent D;
    @m
    private com.dcinside.app.main.b E;
    @m
    private L0 F;
    @m
    private o G;
    @m
    private rx.subscriptions.b H;
    @m
    private e I;
    @l
    private final b J;
    @l
    public static final a K = null;
    @l
    public static final String L = "com.dcinside.app.action.OPEN_READ_WHEN_RESTART";
    @l
    public static final String M = "com.dcinside.app.action.ACTION_OPEN_GALLERY_WHEN_RESTART";
    @l
    public static final String N = "com.dcinside.app.extra.GALLERY_ID";
    @l
    public static final String O = "com.dcinside.app.extra.POST_NUMBER";
    @l
    public static final String P = "com.dcinside.app.extra.SETTING_CHANGE";
    private static final int Q;

    static {
        HomeActivity.K = new a(null);
    }

    public HomeActivity() {
        this.J = new b(this);
    }

    private static final void A3(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final void B3(Function1 function10, Object object0) [...]

    private static final void C3(Throwable throwable0) {
    }

    public final void D3() {
        Intent intent0 = this.D;
        if(intent0 != null) {
            com.dcinside.app.main.a.h(this, intent0);
            this.D = null;
        }
        this.runOnUiThread(() -> {
            L.p(this, "this$0");
            this.getSupportFragmentManager().u().C(0x7F0B075A, new H0()).r();  // id:main_fragment
            DrawerLayout drawerLayout0 = this.l2();
            if(drawerLayout0 != null) {
                drawerLayout0.setDrawerLockMode(0);
            }
            com.dcinside.app.main.b b0 = com.dcinside.app.main.b.d.a(this);
            this.E = b0;
            if(b0 == null) {
                this.s3();
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void E3(HomeActivity homeActivity0) [...]

    private final void F3() {
        try {
            Application.e.f().k(this.F1());
        }
        catch(Throwable throwable0) {
            timber.log.b.a.y(throwable0);
            String s = throwable0.getMessage();
            if(!(throwable0 instanceof RealmError)) {
                zk.a(throwable0);
                Dl.G(this, s);
            }
            else if(s == null) {
                zk.a(throwable0);
                Dl.G(this, "Unknown db exception.");
            }
            else if(v.W2(s, "No space left", false, 2, null)) {
                Dl.D(this, 0x7F1502AE);  // string:error_no_space_left "저장 공간이 부족합니다. 저장 공간을 확보해주세요."
            }
            else if(v.W2(s, "Out of memory", false, 2, null)) {
                Dl.D(this, 0x7F1502B1);  // string:error_out_of_memory "메모리가 부족하여 앱을 실행할 수 없습니다. 확인 후 다시 실행해주세요."
            }
            else {
                zk.a(throwable0);
                Dl.G(this, s);
            }
            this.finish();
            return;
        }
        android.app.Application application0 = this.getApplication();
        L.n(application0, "null cannot be cast to non-null type com.dcinside.app.Application");
        ((Application)application0).m();
    }

    private final void G3(k k0) {
        e e0 = this.I;
        if(e0 != null) {
            e0.dismissAllowingStateLoss();
        }
        this.I = new e();
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_GO_NICK", k0.b());
        bundle0.putBoolean("com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_ENABLE_GALLER_CON", k0.a());
        e e1 = this.I;
        if(e1 != null) {
            e1.setArguments(bundle0);
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        e e2 = this.I;
        if(e2 != null) {
            e2.show(fragmentManager0, "com.dcinside.app.best.e");
        }
    }

    private final void H3() {
        this.G = B.E.h0(this.F1(), this);
    }

    public static void e3(Throwable throwable0) {
    }

    public static void f3() {
    }

    public static void i3(Throwable throwable0) {
    }

    public static void j3(Throwable throwable0) {
    }

    @Override  // com.dcinside.app.main.u0
    @m
    protected c[] m2() {
        if(this.B == null) {
            this.B = new c[]{new d(this.findViewById(0x7F0B075A))};  // id:main_fragment
        }
        return this.B;
    }

    @Override  // com.dcinside.app.main.u0
    protected boolean o2() [...] // Inlined contents

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0x3FF || v == 0x40C) {
            FragmentManager fragmentManager0 = this.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            Fragment fragment0 = fragmentManager0.r0(0x7F0B075A);  // id:main_fragment
            if(fragment0 instanceof Q) {
                ((Q)fragment0).onActivityResult(v, v1, intent0);
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(this.k2()) {
            return;
        }
        if(this.E != null && this.E.d()) {
            return;
        }
        if(this.F != null && this.F.g()) {
            return;
        }
        this.u3();
    }

    @Override  // com.dcinside.app.main.u0
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        if(Al.w(this)) {
            return;
        }
        this.q3();
        this.w3();
        g.a.e(this);
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.r0(0x7F0B075A);  // id:main_fragment
        if(fragment0 instanceof Q) {
            this.D = this.getIntent();
            return;
        }
        if(fragment0 instanceof H0) {
            com.dcinside.app.main.a.h(this, this.getIntent());
            this.s3();
            return;
        }
        this.D = this.getIntent();
        this.F3();
        this.getSupportFragmentManager().u().C(0x7F0B075A, new Q()).r();  // id:main_fragment
        DrawerLayout drawerLayout0 = this.l2();
        if(drawerLayout0 != null) {
            drawerLayout0.setDrawerLockMode(1);
        }
    }

    @Override  // com.dcinside.app.main.u0
    protected void onDestroy() {
        e e0 = this.I;
        if(e0 != null) {
            e0.dismissAllowingStateLoss();
        }
        this.I = null;
        com.dcinside.app.main.b b0 = this.E;
        if(b0 != null) {
            b0.release();
        }
        this.E = null;
        L0 l00 = this.F;
        if(l00 != null) {
            l00.release();
        }
        this.F = null;
        this.J.removeCallbacksAndMessages(null);
        rx.subscriptions.b b1 = this.H;
        if(b1 != null) {
            b1.l();
        }
        this.H = null;
        kl.b(new o[]{this.G});
        this.G = null;
        super.onDestroy();
        AdPopcornSSP.destroy();
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onNewIntent(@l Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.r0(0x7F0B075A);  // id:main_fragment
        if(fragment0 instanceof Q) {
            this.D = intent0;
        }
        else if(fragment0 instanceof H0) {
            com.dcinside.app.main.a.h(this, intent0);
        }
        else {
            this.D = intent0;
        }
        DrawerLayout drawerLayout0 = this.l2();
        if(drawerLayout0 != null && drawerLayout0.E(0x800003)) {
            drawerLayout0.e(0x800003, this.C);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onStart() {
        super.onStart();
        Application.e.f().f();
        this.C = true;
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onStop() {
        super.onStop();
        this.C = false;
    }

    private final void q3() {
        @f(c = "com.dcinside.app.main.HomeActivity$adInitialize$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.HomeActivity.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final HomeActivity l;

            com.dcinside.app.main.HomeActivity.c(HomeActivity homeActivity0, kotlin.coroutines.d d0) {
                this.l = homeActivity0;
                super(2, d0);
            }

            public static void a(InitializationStatus initializationStatus0) {
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.HomeActivity.c(this.l, d0);
            }

            private static final void f(InitializationStatus initializationStatus0) {
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.main.HomeActivity.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ArrayList arrayList0 = new ArrayList();
                MobileAds.setRequestConfiguration(MobileAds.getRequestConfiguration().toBuilder().setTagForChildDirectedTreatment(0).setTestDeviceIds(arrayList0).build());
                com.dcinside.app.main.k k0 = new com.dcinside.app.main.k();
                MobileAds.initialize(this.l, k0);
                MobileAds.setAppVolume(0.0f);
                MobileAds.setAppMuted(true);
                return S0.a;
            }
        }

        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.main.HomeActivity.c(this, null), 2, null);
        if(!AdPopcornSSP.isInitialized(this)) {
            AdPopcornSSP.init(this, new com.dcinside.app.main.d());
        }
        AdPieSDK adPieSDK0 = AdPieSDK.getInstance();
        if(!adPieSDK0.isInitialized()) {
            adPieSDK0.initialize(this, "670e21ed8c8d1d3e550874e6");
        }
    }

    private static final void r3() {
    }

    private final void s3() {
        if(dl.a.p2()) {
            return;
        }
        this.F = L0.l.a(this);
    }

    private final void t3() {
        this.finish();
        Ak.a.d();
    }

    private final void u3() {
        if(this.J.hasMessages(0)) {
            Dl.L();
            this.t3();
            return;
        }
        this.J.sendEmptyMessageDelayed(0, 2500L);
        Dl.F(this, 0x7F150722, 0, 81, 0, 0);  // string:one_more_back_to_finish "\'뒤로\' 버튼을 한 번 더 누르면 종료됩니다."
    }

    private final void v3(int v) {
        if(v == 0) {
            Dl.L();
        }
    }

    private final void w3() {
        static final class com.dcinside.app.main.HomeActivity.d extends N implements Function1 {
            final HomeActivity e;

            com.dcinside.app.main.HomeActivity.d(HomeActivity homeActivity0) {
                this.e = homeActivity0;
                super(1);
            }

            public final void a(@l k k0) {
                L.p(k0, "event");
                this.e.G3(k0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((k)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.main.HomeActivity.e extends N implements Function1 {
            final HomeActivity e;

            com.dcinside.app.main.HomeActivity.e(HomeActivity homeActivity0) {
                this.e = homeActivity0;
                super(1);
            }

            public final void a(@m com.dcinside.app.rx.bus.t t0) {
                this.e.s3();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.t)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.main.HomeActivity.f extends N implements Function1 {
            final HomeActivity e;

            com.dcinside.app.main.HomeActivity.f(HomeActivity homeActivity0) {
                this.e = homeActivity0;
                super(1);
            }

            public final void a(@m j j0) {
                this.e.H3();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j)object0));
                return S0.a;
            }
        }

        rx.subscriptions.b b0 = this.H;
        if(b0 != null) {
            b0.l();
        }
        rx.subscriptions.b b1 = new rx.subscriptions.b();
        o o0 = com.dcinside.app.rx.bus.c.c(this, k.class).y5((Object object0) -> {
            L.p(new com.dcinside.app.main.HomeActivity.d(this), "$tmp0");
            new com.dcinside.app.main.HomeActivity.d(this).invoke(object0);
        }, new com.dcinside.app.main.f());
        o o1 = com.dcinside.app.rx.bus.c.c(this, j.class).y5((Object object0) -> {
            L.p(new com.dcinside.app.main.HomeActivity.f(this), "$tmp0");
            new com.dcinside.app.main.HomeActivity.f(this).invoke(object0);
        }, new h());
        o o2 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.t.class).y5((Object object0) -> {
            L.p(new com.dcinside.app.main.HomeActivity.e(this), "$tmp0");
            new com.dcinside.app.main.HomeActivity.e(this).invoke(object0);
        }, new com.dcinside.app.main.j());
        b1.a(o0);
        b1.a(o1);
        b1.a(o2);
        this.H = b1;
    }

    // 检测为 Lambda 实现
    private static final void x3(Function1 function10, Object object0) [...]

    private static final void y3(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final void z3(Function1 function10, Object object0) [...]
}

