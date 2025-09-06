package com.kakao.adfit.common.inappbrowser.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Insets;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.fragment.app.FragmentActivity;
import com.kakao.adfit.ads.R.anim;
import com.kakao.adfit.ads.R.id;
import com.kakao.adfit.ads.R.layout;
import com.kakao.adfit.common.inappbrowser.widget.IABLayout.d;
import com.kakao.adfit.common.inappbrowser.widget.IABLayout;
import com.kakao.adfit.m.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;

@s0({"SMAP\nIABActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IABActivity.kt\ncom/kakao/adfit/common/inappbrowser/activity/IABActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
public final class IABActivity extends FragmentActivity {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public static Intent a(a iABActivity$a0, Context context0, String s, String s1, int v, Object object0) {
            if((v & 4) != 0) {
                s1 = null;
            }
            return iABActivity$a0.a(context0, s, s1);
        }

        public final Intent a(Context context0, String s) {
            L.p(context0, "context");
            L.p(s, "url");
            return a.a(this, context0, s, null, 4, null);
        }

        public final Intent a(Context context0, String s, String s1) {
            L.p(context0, "context");
            L.p(s, "url");
            Intent intent0 = new Intent(context0, IABActivity.class);
            intent0.addFlags(0x34000000);
            intent0.putExtra("inAppBrowserUrl", s);
            if(s1 != null && !v.x3(s1) == 1) {
                intent0.putExtra("inAppBrowserEtxId", s1);
            }
            return intent0;
        }
    }

    private View a;
    private IABLayout b;
    private long c;
    private String d;
    public static final a e;

    static {
        IABActivity.e = new a(null);
    }

    public static final Intent a(Context context0, String s) {
        return IABActivity.e.a(context0, s);
    }

    // 检测为 Lambda 实现
    private static final WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    private final void a(Window window0) {
        this.a(window0, false);
    }

    private final void a(Window window0, boolean z) {
        window0.clearFlags(0x4000000);
        window0.clearFlags(0x8000000);
        window0.addFlags(0x80000000);
        if(z) {
            window0.setStatusBarColor(-1);
            window0.setNavigationBarColor(-1);
            View view0 = window0.getDecorView();
            view0.setSystemUiVisibility(view0.getSystemUiVisibility() | 0x2000);
            if(Build.VERSION.SDK_INT >= 30) {
                View view1 = this.a;
                if(view1 != null) {
                    view1.setBackgroundColor(-1);
                }
                WindowInsetsController windowInsetsController0 = this.getWindow().getInsetsController();
                if(windowInsetsController0 != null) {
                    windowInsetsController0.setSystemBarsAppearance(24, 24);
                }
            }
        }
        else {
            window0.setStatusBarColor(0xFF000000);
            window0.setNavigationBarColor(0xFF000000);
            View view2 = window0.getDecorView();
            view2.setSystemUiVisibility(view2.getSystemUiVisibility() & 0xFFFFDFFF);
            if(Build.VERSION.SDK_INT >= 30) {
                View view3 = this.a;
                if(view3 != null) {
                    view3.setBackgroundColor(0xFF000000);
                }
                WindowInsetsController windowInsetsController1 = this.getWindow().getInsetsController();
                if(windowInsetsController1 != null) {
                    windowInsetsController1.setSystemBarsAppearance(0, 24);
                }
            }
        }
    }

    private final boolean a(Intent intent0) {
        String s = intent0.getStringExtra("inAppBrowserUrl");
        return s != null && !v.x3(s) && (!L.g(s, this.d) || SystemClock.elapsedRealtime() - this.c > 1000L);
    }

    private final void b(Intent intent0) {
        String s = intent0.getStringExtra("inAppBrowserUrl");
        String s1 = intent0.getStringExtra("inAppBrowserEtxId");
        IABLayout iABLayout0 = null;
        if(s1 == null || v.x3(s1)) {
            s1 = null;
        }
        this.c = SystemClock.elapsedRealtime();
        this.d = s;
        IABLayout iABLayout1 = this.b;
        if(iABLayout1 == null) {
            L.S("webLayout");
        }
        else {
            iABLayout0 = iABLayout1;
        }
        iABLayout0.a(s, s1);
    }

    private final void b(Window window0) {
        this.a(window0, true);
    }

    @Override  // android.app.Activity
    public void finish() {
        super.finish();
        this.overridePendingTransition(anim.adfit_activity_hold, anim.adfit_activity_slide_out_to_bottom);
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        IABLayout iABLayout0 = this.b;
        if(iABLayout0 == null) {
            L.S("webLayout");
            iABLayout0 = null;
        }
        if(iABLayout0.d()) {
            return;
        }
        super.onBackPressed();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onCreate(Bundle bundle0) {
        public static final class b implements d {
            final IABActivity a;

            b(IABActivity iABActivity0) {
                this.a = iABActivity0;
                super();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABLayout$d
            public void a() {
                this.a.finish();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABLayout$d
            public void b() {
                if(Build.VERSION.SDK_INT >= 23) {
                    Window window0 = this.a.getWindow();
                    if(window0 != null) {
                        this.a.b(window0);
                    }
                }
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABLayout$d
            public void c() {
                if(Build.VERSION.SDK_INT >= 23) {
                    Window window0 = this.a.getWindow();
                    if(window0 != null) {
                        this.a.a(window0);
                    }
                }
            }
        }

        super.onCreate(bundle0);
        this.overridePendingTransition(anim.adfit_activity_slide_in_from_bottom, anim.adfit_activity_hold);
        int v = Build.VERSION.SDK_INT;
        if(v >= 23) {
            Window window0 = this.getWindow();
            L.o(window0, "window");
            this.b(window0);
        }
        this.setContentView(layout.adfit_inapp_browser);
        View view0 = this.findViewById(id.webview_content);
        L.o(view0, "findViewById(R.id.webview_content)");
        IABLayout iABLayout0 = (IABLayout)view0;
        this.b = iABLayout0;
        View view1 = null;
        if(iABLayout0 == null) {
            L.S("webLayout");
            iABLayout0 = null;
        }
        iABLayout0.setOnEventListener(new b(this));
        if(v >= 30) {
            IABLayout iABLayout1 = this.b;
            if(iABLayout1 == null) {
                L.S("webLayout");
                iABLayout1 = null;
            }
            ViewParent viewParent0 = iABLayout1.getParent();
            View view2 = viewParent0 instanceof View ? ((View)viewParent0) : null;
            if(view2 != null) {
                view2.setBackgroundColor(-1);
                view2.setOnApplyWindowInsetsListener((View view0, WindowInsets windowInsets0) -> {
                    L.p(view0, "v");
                    L.p(windowInsets0, "insets");
                    Insets insets0 = windowInsets0.getInsets(com.kakao.adfit.common.inappbrowser.activity.a.a());
                    L.o(insets0, "insets.getInsets(Type.systemBars())");
                    view0.setPadding(insets0.left, insets0.top, insets0.right, insets0.bottom);
                    return WindowInsets.CONSUMED;
                });
                view1 = view2;
            }
            this.a = view1;
            WindowInsetsController windowInsetsController0 = this.getWindow().getInsetsController();
            if(windowInsetsController0 != null) {
                windowInsetsController0.setSystemBarsAppearance(24, 24);
            }
        }
        Intent intent0 = this.getIntent();
        L.o(intent0, "intent");
        if(this.a(intent0) && bundle0 == null) {
            Intent intent1 = this.getIntent();
            L.o(intent1, "intent");
            this.b(intent1);
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onDestroy() {
        IABLayout iABLayout0 = this.b;
        if(iABLayout0 == null) {
            L.S("webLayout");
            iABLayout0 = null;
        }
        iABLayout0.e();
        super.onDestroy();
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onNewIntent(Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        if(this.a(intent0)) {
            f.d("Reload InAppBrowser");
            IABLayout iABLayout0 = this.b;
            if(iABLayout0 == null) {
                L.S("webLayout");
                iABLayout0 = null;
            }
            iABLayout0.a();
            this.setIntent(intent0);
            this.b(intent0);
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        IABLayout iABLayout0 = this.b;
        if(iABLayout0 == null) {
            L.S("webLayout");
            iABLayout0 = null;
        }
        iABLayout0.f();
        super.onPause();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onResume() {
        IABLayout iABLayout0 = this.b;
        if(iABLayout0 == null) {
            L.S("webLayout");
            iABLayout0 = null;
        }
        iABLayout0.g();
        super.onResume();
    }
}

