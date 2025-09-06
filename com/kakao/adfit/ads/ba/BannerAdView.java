package com.kakao.adfit.ads.ba;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kakao.adfit.a.d.d;
import com.kakao.adfit.a.q;
import com.kakao.adfit.ads.AdError;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.ads.R.id;
import com.kakao.adfit.m.A;
import com.kakao.adfit.m.H;
import com.kakao.adfit.m.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nBannerAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerAdView.kt\ncom/kakao/adfit/ads/ba/BannerAdView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,458:1\n1#2:459\n13309#3,2:460\n13309#3,2:462\n*S KotlinDebug\n*F\n+ 1 BannerAdView.kt\ncom/kakao/adfit/ads/ba/BannerAdView\n*L\n254#1:460,2\n259#1:462,2\n*E\n"})
public final class BannerAdView extends RelativeLayout {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(View view0, int v) {
            L.p(view0, "<this>");
            view0.setBackgroundColor(v);
        }

        public final void a(TextView textView0, int v) {
            L.p(textView0, "<this>");
            textView0.setTextColor(v);
        }
    }

    @l
    public static final a Companion;
    private String a;
    private com.kakao.adfit.ads.ba.a b;
    private boolean c;
    private d d;
    private d e;
    private com.kakao.adfit.ads.ba.d f;
    private final e g;
    private boolean h;

    static {
        BannerAdView.Companion = new a(null);
    }

    @j
    public BannerAdView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public BannerAdView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public BannerAdView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        public static final class b implements com.kakao.adfit.b.b {
            private final String a;
            final BannerAdView b;
            final Context c;

            b(BannerAdView bannerAdView0, Context context0) {
                this.b = bannerAdView0;
                this.c = context0;
                super();
                this.a = bannerAdView0.a;
            }

            @Override  // com.kakao.adfit.b.b
            public H a(com.kakao.adfit.ads.ba.d d0, A3.a a0, A3.a a1) {
                L.p(d0, "bannerAd");
                L.p(a0, "onExposed");
                L.p(a1, "onViewable");
                com.kakao.adfit.m.H.a h$a0 = new com.kakao.adfit.m.H.a(this.getName(), this.b);
                Context context0 = this.c;
                com.kakao.adfit.ads.ba.b.d b$d0 = d0.f();
                if(b$d0 instanceof c) {
                    h$a0.b(com.kakao.adfit.m.l.a(context0, ((c)b$d0).b()));
                    h$a0.a(kotlin.math.b.L0(com.kakao.adfit.m.l.a(context0, ((float)(((c)b$d0).b() * ((c)b$d0).a())) / ((float)((c)b$d0).c()))));
                }
                else if(b$d0 instanceof com.kakao.adfit.ads.ba.b.b) {
                    h$a0.b(com.kakao.adfit.m.l.a(context0, ((com.kakao.adfit.ads.ba.b.b)b$d0).b()));
                    h$a0.a(com.kakao.adfit.m.l.a(context0, ((com.kakao.adfit.ads.ba.b.b)b$d0).a()));
                }
                h$a0.a(d0.g());
                h$a0.a(a0);
                h$a0.b(a1);
                return h$a0.a();
            }

            @Override  // com.kakao.adfit.b.b
            public void a(com.kakao.adfit.ads.ba.d d0) {
                L.p(d0, "bannerAd");
                this.b.f = d0;
                this.b.a(d0);
            }

            @Override  // com.kakao.adfit.a.o
            public boolean a() {
                return this.b.hasWindowFocus();
            }

            // 去混淆评级： 低(20)
            @Override  // com.kakao.adfit.a.o
            public boolean b() {
                return this.b.c && this.b.isAttachedToWindow();
            }

            @Override  // com.kakao.adfit.a.o
            public int c() {
                return this.b.getMeasuredWidth();
            }

            @Override  // com.kakao.adfit.a.o
            public int d() {
                return this.b.getMeasuredHeight();
            }

            @Override  // com.kakao.adfit.a.o
            public boolean e() {
                return this.b.getVisibility() == 0;
            }

            @Override  // com.kakao.adfit.a.o
            public boolean f() {
                return this.b.getWindowVisibility() == 0;
            }

            @Override  // com.kakao.adfit.a.o
            public com.kakao.adfit.a.d.a g() {
                d d$d0 = this.b.d;
                d d$d1 = this.b.e;
                return com.kakao.adfit.a.d.a.h.a(this.b, this.b, d$d0, d$d1);
            }

            @Override  // com.kakao.adfit.a.o
            public Context getContext() {
                return this.c;
            }

            @Override  // com.kakao.adfit.a.o
            public String getName() {
                return this.a;
            }

            @Override  // com.kakao.adfit.b.b
            public void h() {
                this.b.b.a();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = "BannerAdView@" + this.hashCode();
        this.b = new com.kakao.adfit.ads.ba.a(this);
        this.g = new e(new b(this, context0), null, 2, null);
        this.h = true;
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setHorizontalScrollBarEnabled(false);
        this.setVerticalScrollBarEnabled(false);
        this.setBackground(null);
        this.setPadding(0, 0, 0, 0);
        if(this.isInEditMode()) {
            TextView textView0 = new TextView(this.getContext());
            textView0.setText("AdFit Ad Area");
            textView0.setTextSize(com.kakao.adfit.m.l.a(context0, 25.0f));
            BannerAdView.Companion.a(textView0, -1);
            textView0.setGravity(17);
            int v1 = Color.argb(0xFF, 0, 0x99, 204);
            BannerAdView.Companion.a(textView0, v1);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
            relativeLayout$LayoutParams0.addRule(13);
            textView0.setLayoutParams(relativeLayout$LayoutParams0);
            this.addView(textView0);
            return;
        }
        if(!(context0 instanceof Activity)) {
            throw new IllegalArgumentException("Context must be Activity context!");
        }
        A.a.b(context0);
        if(attributeSet0 != null) {
            String s = attributeSet0.getAttributeValue(null, "clientId");
            if(s != null && !v.x3(s) == 1) {
                this.setClientId(s);
            }
        }
        f.a("initialize");
    }

    public BannerAdView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void a(q q0, BannerAdView bannerAdView0, com.kakao.adfit.ads.ba.d d0) [...]

    // 检测为 Lambda 实现
    private static final void a(q q0, BannerAdView bannerAdView0, com.kakao.adfit.ads.ba.d d0, String s) [...]

    private final void a(com.kakao.adfit.ads.ba.d d0) {
        q q0;
        if(this.b.c()) {
            return;
        }
        try {
            q0 = this.b.a(this.getContext());
        }
        catch(Throwable throwable0) {
            this.g.a(d0, AdError.FAIL_TO_DRAW, "Failed to create a WebView: " + throwable0);
            return;
        }
        com.kakao.adfit.ads.ba.b.d b$d0 = d0.f();
        int v = -1;
        if(b$d0 instanceof c) {
            q0.a(((c)b$d0).c(), ((c)b$d0).a());
            Context context0 = this.getContext();
            L.o(context0, "context");
            q0.setMinimumWidth(com.kakao.adfit.m.l.a(context0, ((c)b$d0).b()));
            Context context1 = this.getContext();
            L.o(context1, "context");
            q0.setMinimumHeight(kotlin.math.b.L0(com.kakao.adfit.m.l.a(context1, ((float)(((c)b$d0).b() * ((c)b$d0).a())) / ((float)((c)b$d0).c()))));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
            relativeLayout$LayoutParams0.addRule(13);
            q0.setLayoutParams(relativeLayout$LayoutParams0);
        }
        else if(b$d0 instanceof com.kakao.adfit.ads.ba.b.b) {
            if(((com.kakao.adfit.ads.ba.b.b)b$d0).b() != 320) {
                Context context2 = this.getContext();
                L.o(context2, "context");
                v = com.kakao.adfit.m.l.a(context2, ((com.kakao.adfit.ads.ba.b.b)b$d0).b());
            }
            Context context3 = this.getContext();
            L.o(context3, "context");
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v, com.kakao.adfit.m.l.a(context3, ((com.kakao.adfit.ads.ba.b.b)b$d0).a()));
            relativeLayout$LayoutParams1.addRule(13);
            q0.setLayoutParams(relativeLayout$LayoutParams1);
        }
        this.getTag(id.adfit_private);
        Object object0 = this.getTag(id.adfit_dev_arg1);
        if(object0 instanceof String && !v.x3(((CharSequence)object0))) {
            q0.setTag(0x7F0B008B, object0);  // id:adfit_dev_arg1
        }
        q0.setOnPageLoadListener((String s) -> {
            L.p(this, "this$0");
            L.p(d0, "$bannerAd");
            if(q0.a()) {
                return;
            }
            this.b.a(q0);
            this.g.d(d0);
        });
        q0.setOnPageErrorListener((String s) -> {
            L.p(this, "this$0");
            L.p(d0, "$bannerAd");
            if(q0.a()) {
                return;
            }
            this.g.a(d0, AdError.FAIL_TO_DRAW, "Page Load Error");
        });
        q0.setOnNewPageOpenListener((String s) -> {
            L.p(this, "this$0");
            L.p(d0, "$bannerAd");
            if(q0.a()) {
                return;
            }
            this.g.a(d0);
        });
        q0.setOnRenderProcessGoneListener(() -> {
            L.p(this, "this$0");
            L.p(d0, "$bannerAd");
            if(q0.a()) {
                return;
            }
            this.b.a();
            this.b = new com.kakao.adfit.ads.ba.a(this);
            if(L.g(this.f, d0)) {
                this.a(d0);
            }
        });
        q0.a(d0.b());
    }

    // 检测为 Lambda 实现
    private static final void b(q q0, BannerAdView bannerAdView0, com.kakao.adfit.ads.ba.d d0, String s) [...]

    // 检测为 Lambda 实现
    private static final void c(q q0, BannerAdView bannerAdView0, com.kakao.adfit.ads.ba.d d0, String s) [...]

    public final void destroy() {
        this.g.t();
        f.c("Terminated AdFit Ad");
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "ev");
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.d = new d(motionEvent0.getX(), motionEvent0.getY(), 0L, 4, null);
                this.e = null;
                return super.dispatchTouchEvent(motionEvent0);
            }
            case 1: {
                this.e = new d(motionEvent0.getX(), motionEvent0.getY(), 0L, 4, null);
                return super.dispatchTouchEvent(motionEvent0);
            }
            case 3: {
                this.d = null;
                this.e = null;
                return super.dispatchTouchEvent(motionEvent0);
            }
            default: {
                return super.dispatchTouchEvent(motionEvent0);
            }
        }
    }

    @m
    public final Bundle getExtras() {
        return this.g.d();
    }

    public final void loadAd() {
        this.g.a();
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        f.d("onAttachedToWindow()");
        super.onAttachedToWindow();
        if(!this.h) {
            return;
        }
        this.c = true;
        this.g.k();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        f.d("onDetachedFromWindow()");
        super.onDetachedFromWindow();
        if(!this.h) {
            return;
        }
        this.c = false;
        this.g.k();
    }

    @Override  // android.widget.RelativeLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(!this.h) {
            return;
        }
        this.g.l();
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        L.p(view0, "changedView");
        f.d(("onVisibilityChanged(): " + v));
        super.onVisibilityChanged(view0, v);
        if(!this.h) {
            return;
        }
        this.g.n();
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        f.d(("onWindowFocusChanged(): " + z));
        super.onWindowFocusChanged(z);
        if(!this.h) {
            return;
        }
        this.g.o();
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        f.d(("onWindowVisibilityChanged(): " + v));
        super.onWindowVisibilityChanged(v);
        if(!this.h) {
            return;
        }
        this.g.n();
    }

    public final void pause() {
        this.g.p();
        q[] arr_q = this.b.b();
        L.o(arr_q, "webViewHolder.views");
        for(int v = 0; v < arr_q.length; ++v) {
            q q0 = arr_q[v];
            if(q0 != null) {
                q0.onPause();
            }
        }
    }

    public final void putExtra(@m String s, @m String s1) {
        this.g.a(s, s1);
    }

    public final void resume() {
        this.g.r();
        q[] arr_q = this.b.b();
        L.o(arr_q, "webViewHolder.views");
        for(int v = 0; v < arr_q.length; ++v) {
            q q0 = arr_q[v];
            if(q0 != null) {
                q0.onResume();
            }
        }
    }

    public final void setAdListener(@m AdListener adListener0) {
        this.g.a(adListener0);
    }

    @k(message = "Not working")
    public final void setAdUnitSize(@m String s) {
        f.e("BannerAdView#setAdUnitSize() is deprecated");
    }

    public final void setClientId(@m String s) {
        if(!L.g(this.g.b(), s)) {
            this.a = "BannerAdView(\"" + (s == null ? "unknown" : s) + "\")@" + this.hashCode();
            this.g.b(s);
        }
    }

    @k(message = "Not working")
    public final void setRequestInterval(int v) {
        f.e("BannerAdView#setRequestInterval() is deprecated");
    }

    @Override  // android.view.View
    public void setTag(int v, @m Object object0) {
        super.setTag(v, object0);
    }

    @Override  // android.view.View
    public void setTag(@m Object object0) {
        super.setTag(object0);
    }

    public final void setTestMode(boolean z) {
        this.g.b(z);
    }

    public final void setTimeout(int v) {
        this.g.b(v);
    }
}

