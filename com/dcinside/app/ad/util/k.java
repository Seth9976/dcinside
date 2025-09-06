package com.dcinside.app.ad.util;

import Q.c;
import S.b;
import S.d;
import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions.Builder;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class k extends a {
    @l
    private final String c;
    @l
    private final c d;
    private final int e;
    @l
    private WeakReference f;
    @l
    private WeakReference g;
    private boolean h;
    @m
    private b i;
    private boolean j;
    private long k;

    public k(@l Context context0, @l String s, @l Function1 function10, @l c c0, int v) {
        L.p(context0, "context");
        L.p(s, "id");
        L.p(function10, "adLoaded");
        L.p(c0, "adHost");
        super();
        this.c = s;
        this.d = c0;
        this.e = v;
        this.f = new WeakReference(context0);
        this.g = new WeakReference(function10);
    }

    public k(Context context0, String s, Function1 function10, c c0, int v, int v1, w w0) {
        this(context0, s, function10, c0, ((v1 & 16) == 0 ? v : 2));
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.h;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        b b0 = this.i;
        if(b0 != null) {
            b0.destroy();
        }
        this.i = null;
        this.f.clear();
        this.g.clear();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        public static final class com.dcinside.app.ad.util.k.a extends AdListener {
            final k c;

            com.dcinside.app.ad.util.k.a(k k0) {
                this.c = k0;
                super();
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(@l LoadAdError loadAdError0) {
                L.p(loadAdError0, "p0");
                this.c.j = false;
                if(this.c.a()) {
                    return;
                }
                int v = loadAdError0.getCode();
                this.c.c("AdMob ads failed: " + v);
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                this.c.j = false;
                this.c.k = System.currentTimeMillis();
            }
        }

        if(this.a()) {
            return;
        }
        if(this.j) {
            return;
        }
        if(Math.abs(System.currentTimeMillis() - this.k) < 2000L) {
            return;
        }
        this.j = true;
        Context context0 = (Context)this.f.get();
        if(context0 == null) {
            return;
        }
        NativeAdOptions nativeAdOptions0 = new Builder().setMediaAspectRatio(this.e).build();
        L.o(nativeAdOptions0, "build(...)");
        com.google.android.gms.ads.AdLoader.Builder adLoader$Builder0 = new com.google.android.gms.ads.AdLoader.Builder(context0, this.c).withNativeAdOptions(nativeAdOptions0);
        L.o(adLoader$Builder0, "withNativeAdOptions(...)");
        adLoader$Builder0.forNativeAd((NativeAd nativeAd0) -> {
            L.p(this, "this$0");
            L.p(nativeAd0, "it");
            this.m(d.a(nativeAd0));
        });
        adLoader$Builder0.withAdListener(new com.dcinside.app.ad.util.k.a(this));
        adLoader$Builder0.build().loadAd(this.d.d());
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.h = z;
    }

    private final void m(b b0) {
        if(b0 == null) {
            if(this.a()) {
                return;
            }
            this.c("unknown native ad");
            return;
        }
        if(this.a()) {
            b0.destroy();
            return;
        }
        b b1 = this.i;
        if(b1 != null) {
            b1.destroy();
        }
        this.i = b0;
        Function1 function10 = (Function1)this.g.get();
        if(function10 != null) {
            function10.invoke(b0);
        }
    }

    // 检测为 Lambda 实现
    private static final void n(k k0, NativeAd nativeAd0) [...]
}

