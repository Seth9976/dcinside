package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.o;
import com.vungle.ads.internal.presenter.k;
import com.vungle.ads.internal.ui.i;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class c1 extends RelativeLayout {
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    @l
    public static final b Companion = null;
    @l
    private static final String TAG = "VungleBannerView";
    @m
    private F adListener;
    @l
    private final b1 adSize;
    @l
    private final h adViewImpl;
    @m
    private com.vungle.ads.internal.ui.view.b adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    @l
    private final AtomicBoolean destroyed;
    @m
    private i imageView;
    @l
    private final D impressionTracker$delegate;
    @l
    private final AtomicBoolean isAdAttachedToWindow;
    @l
    private final AtomicBoolean isAdDownloaded;
    @l
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    @l
    private final String placementId;
    @m
    private k presenter;
    @l
    private final AtomicBoolean presenterStarted;
    @l
    private final s ringerModeReceiver;

    static {
        c1.Companion = new b(null);
    }

    public c1(@l Context context0, @l String s, @l b1 b10) {
        public static final class a implements F {
            a(c1 c10) {
                c1.this = c10;
                super();
            }

            @Override  // com.vungle.ads.L
            public void onAdClicked(@l K k0) {
                L.p(k0, "baseAd");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdClicked(k0);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(@l K k0) {
                L.p(k0, "baseAd");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdEnd(k0);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(@l K k0, @l d1 d10) {
                L.p(k0, "baseAd");
                L.p(d10, "adError");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdFailedToLoad(k0, d10);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(@l K k0, @l d1 d10) {
                L.p(k0, "baseAd");
                L.p(d10, "adError");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdFailedToPlay(k0, d10);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(@l K k0) {
                L.p(k0, "baseAd");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdImpression(k0);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(@l K k0) {
                L.p(k0, "baseAd");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdLeftApplication(k0);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(@l K k0) {
                L.p(k0, "baseAd");
                c1.this.onBannerAdLoaded(k0);
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(@l K k0) {
                L.p(k0, "baseAd");
                F f0 = c1.this.getAdListener();
                if(f0 != null) {
                    f0.onAdStart(k0);
                }
            }
        }


        static final class c extends N implements A3.a {
            final Context $context;

            c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @l
            public final o invoke() {
                return new o(this.$context);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        L.p(context0, "context");
        L.p(s, "placementId");
        L.p(b10, "adSize");
        super(context0);
        this.placementId = s;
        this.adSize = b10;
        this.ringerModeReceiver = new s();
        h h0 = new h(context0, s, b10, new d());
        this.adViewImpl = h0;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker$delegate = E.a(new c(context0));
        h0.setAdListener(new a(this));
    }

    private final void checkHardwareAcceleration() {
        p.Companion.w("VungleBannerView", "hardwareAccelerated = " + this.isHardwareAccelerated());
        if(!this.isHardwareAccelerated()) {
            r.logMetric$vungle_ads_release$default(r.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.b.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 10, null);
        }
    }

    public final void finishAd() {
        this.finishAdInternal(true);
    }

    private final void finishAdInternal(boolean z) {
        if(this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        k k0 = this.presenter;
        if(k0 != null) {
            k0.stop();
        }
        k k1 = this.presenter;
        if(k1 != null) {
            k1.detach((z ? 4 : 0) | 2);
        }
        this.getImpressionTracker().destroy();
        try {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this);
            }
            this.removeAllViews();
            return;
        }
        catch(Exception exception0) {
        }
        p.Companion.d("VungleBannerView", "Removing webView error: " + exception0);
    }

    @l
    public final d getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    @m
    public final F getAdListener() {
        return this.adListener;
    }

    @l
    public final b1 getAdSize() {
        return this.adSize;
    }

    @l
    public final b1 getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    @m
    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    @m
    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    private final o getImpressionTracker() {
        return (o)this.impressionTracker$delegate.getValue();
    }

    @l
    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(@m String s) {
        this.adViewImpl.load(s);
    }

    public static void load$default(c1 c10, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        c10.load(s);
    }

    private final void logViewInvisibleOnPlay() {
        if(!this.isInvisibleLogged.getAndSet(true)) {
            p.Companion.d("VungleBannerView", "ImpressionTracker checked the banner view invisible on play. " + this.hashCode());
            W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.VIEW_NOT_VISIBLE_ON_PLAY);
            r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 4, null);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.vungle.ads.internal.util.p.a p$a0 = p.Companion;
        p$a0.d("VungleBannerView", "onAttachedToWindow(): " + this.hashCode());
        this.isAdAttachedToWindow.set(true);
        if(this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null && !this.isReceiverRegistered) {
            try {
                IntentFilter intentFilter0 = new IntentFilter("android.media.RINGER_MODE_CHANGED");
                this.getContext().registerReceiver(this.ringerModeReceiver, intentFilter0);
                this.isReceiverRegistered = true;
                p$a0.d("VungleBannerView", "registerReceiver(): " + this.ringerModeReceiver.hashCode());
            }
            catch(Exception exception0) {
                p.Companion.e("VungleBannerView", "registerReceiver error: " + exception0.getLocalizedMessage());
            }
        }
        this.renderAd();
    }

    private final void onBannerAdLoaded(K k0) {
        r r0 = r.INSTANCE;
        r.logMetric$vungle_ads_release$default(r0, new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.PLAY_AD_API), this.adViewImpl.getLogEntry$vungle_ads_release(), null, 4, null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        d1 d10 = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if(d10 != null) {
            if(this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(d10.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.a.ERROR);
            }
            F f0 = this.adListener;
            if(f0 != null) {
                f0.onAdFailedToPlay(k0, d10);
            }
            return;
        }
        com.vungle.ads.internal.model.b b0 = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        com.vungle.ads.internal.model.m m0 = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if(b0 != null && m0 != null) {
            this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
            try {
                this.willPresentAdView(b0, m0, this.getAdViewSize());
            }
            catch(InstantiationException unused_ex) {
                return;
            }
            this.adViewImpl.getResponseToShowMetric$vungle_ads_release().markEnd();
            r.logMetric$vungle_ads_release$default(r0, this.adViewImpl.getResponseToShowMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), null, 4, null);
            this.adViewImpl.getShowToCloseMetric$vungle_ads_release().markStart();
            this.adViewImpl.getShowToFailMetric$vungle_ads_release().markStart();
            this.isAdDownloaded.set(true);
            F f1 = this.adListener;
            if(f1 != null) {
                f1.onAdLoaded(k0);
            }
            this.renderAd();
            return;
        }
        F f2 = this.adListener;
        if(f2 != null) {
            f2.onAdFailedToPlay(k0, new com.vungle.ads.i("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p.Companion.d("VungleBannerView", "onDetachedFromWindow(): " + this.hashCode());
        this.isAdAttachedToWindow.set(false);
        if(this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null && this.isReceiverRegistered) {
            try {
                this.getContext().unregisterReceiver(this.ringerModeReceiver);
                this.isReceiverRegistered = false;
            }
            catch(Exception exception0) {
                p.Companion.e("VungleBannerView", "unregisterReceiver error: " + exception0.getLocalizedMessage());
            }
        }
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.setAdVisibility(v == 0);
    }

    private final void renderAd() {
        public static final class com.vungle.ads.c1.d implements com.vungle.ads.internal.o.b {
            com.vungle.ads.c1.d(c1 c10) {
                c1.this = c10;
                super();
            }

            @Override  // com.vungle.ads.internal.o$b
            public void onImpression(@m View view0) {
                p.Companion.d("VungleBannerView", "ImpressionTracker checked the banner view become visible.");
                c1.this.isOnImpressionCalled = true;
                c1.this.checkHardwareAcceleration();
                k k0 = c1.this.presenter;
                if(k0 != null) {
                    k0.start();
                }
            }

            @Override  // com.vungle.ads.internal.o$b
            public void onViewInvisible(@m View view0) {
                c1.this.logViewInvisibleOnPlay();
            }
        }

        if(this.destroyed.get()) {
            p.Companion.w("VungleBannerView", "renderAd() - destroyed");
            return;
        }
        if(!this.isAdDownloaded.get()) {
            p.Companion.d("VungleBannerView", "renderAd() - not ready: not downloaded.");
            return;
        }
        if(!this.isAdAttachedToWindow.get()) {
            p.Companion.d("VungleBannerView", "renderAd() - not ready: not attached.");
            this.logViewInvisibleOnPlay();
            return;
        }
        if(!this.presenterStarted.getAndSet(true)) {
            this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
            Y0 y00 = this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release();
            r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 4, null);
            this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
            k k0 = this.presenter;
            if(k0 != null) {
                k0.prepare();
            }
            this.getImpressionTracker().addView(this, new com.vungle.ads.c1.d(this));
        }
        if(this.adWidget != null && !L.g(this.adWidget.getParent(), this)) {
            this.addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
            i i0 = this.imageView;
            if(i0 != null) {
                this.addView(i0, this.calculatedPixelWidth, this.calculatedPixelHeight);
                i i1 = this.imageView;
                if(i1 != null) {
                    i1.bringToFront();
                }
            }
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 != null) {
            viewGroup$LayoutParams0.height = this.calculatedPixelHeight;
            viewGroup$LayoutParams0.width = this.calculatedPixelWidth;
            this.requestLayout();
        }
    }

    public final void setAdListener(@m F f0) {
        this.adListener = f0;
    }

    private final void setAdVisibility(boolean z) {
        if(!this.isOnImpressionCalled) {
            return;
        }
        if(!this.destroyed.get()) {
            k k0 = this.presenter;
            if(k0 != null) {
                k0.setAdVisibility(z);
            }
        }
    }

    private final void willPresentAdView(com.vungle.ads.internal.model.b b0, com.vungle.ads.internal.model.m m0, b1 b10) throws InstantiationException {
        public static final class e extends N implements A3.a {
            final Context $context;

            public e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }


        public static final class f extends N implements A3.a {
            final Context $context;

            public f(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.e.b.class);
            }
        }


        public static final class g extends N implements A3.a {
            final Context $context;

            public g(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.d.class);
            }
        }


        public static final class com.vungle.ads.c1.h implements com.vungle.ads.internal.ui.view.b.c {
            com.vungle.ads.c1.h(c1 c10) {
                c1.this = c10;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.view.b$c
            public void close() {
                c1.this.finishAdInternal(false);
            }
        }


        public static final class com.vungle.ads.c1.i implements com.vungle.ads.internal.ui.view.b.f {
            com.vungle.ads.c1.i(c1 c10) {
                c1.this = c10;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.view.b$f
            public boolean onTouch(@m MotionEvent motionEvent0) {
                k k0 = c1.this.presenter;
                if(k0 != null) {
                    k0.onViewTouched(motionEvent0);
                }
                return false;
            }
        }


        public static final class j extends com.vungle.ads.internal.presenter.a {
            j(com.vungle.ads.internal.presenter.c c0, com.vungle.ads.internal.model.m m0) {
                super(c0, m0);
            }
        }

        com.vungle.ads.internal.ui.view.b b1;
        Context context0 = this.getContext();
        L.o(context0, "context");
        this.calculatedPixelHeight = y.INSTANCE.dpToPixels(context0, b10.getHeight());
        Context context1 = this.getContext();
        L.o(context1, "context");
        this.calculatedPixelWidth = y.INSTANCE.dpToPixels(context1, b10.getWidth());
        j c1$j0 = new j(this.adViewImpl.getAdPlayCallback$vungle_ads_release(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            Context context2 = this.getContext();
            L.o(context2, "context");
            b1 = new com.vungle.ads.internal.ui.view.b(context2);
        }
        catch(InstantiationException instantiationException0) {
            c1$j0.onError(new com.vungle.ads.c().setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementId);
            throw instantiationException0;
        }
        this.adWidget = b1;
        b1.setCloseDelegate(new com.vungle.ads.c1.h(this));
        b1.setOnViewTouchListener(new com.vungle.ads.c1.i(this));
        Context context3 = this.getContext();
        L.o(context3, "context");
        D d0 = E.c(H.a, new e(context3));
        Context context4 = this.getContext();
        L.o(context4, "context");
        com.vungle.ads.internal.omsdk.e e0 = c1.willPresentAdView$lambda-2(E.c(H.a, new f(context4))).make(com.vungle.ads.internal.k.INSTANCE.omEnabled() && b0.omEnabled());
        Context context5 = this.getContext();
        L.o(context5, "context");
        D d1 = E.c(H.a, new g(context5));
        com.vungle.ads.internal.ui.h h0 = new com.vungle.ads.internal.ui.h(b0, m0, c1.willPresentAdView$lambda-1(d0).getOffloadExecutor(), null, c1.willPresentAdView$lambda-3(d1), 8, null);
        this.ringerModeReceiver.setWebClient(h0);
        h0.setWebViewObserver(e0);
        k k0 = new k(b1, b0, m0, h0, c1.willPresentAdView$lambda-1(d0).getJobExecutor(), e0, this.adViewImpl.getAdInternal$vungle_ads_release().getBidPayload(), c1.willPresentAdView$lambda-3(d1));
        k0.setEventListener(c1$j0);
        this.presenter = k0;
        String s = this.getAdConfig().getWatermark$vungle_ads_release();
        if(s != null) {
            Context context6 = this.getContext();
            L.o(context6, "context");
            this.imageView = new i(context6, s);
        }
    }

    private static final com.vungle.ads.internal.executor.a willPresentAdView$lambda-1(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }

    private static final com.vungle.ads.internal.omsdk.e.b willPresentAdView$lambda-2(D d0) {
        return (com.vungle.ads.internal.omsdk.e.b)d0.getValue();
    }

    private static final com.vungle.ads.internal.platform.d willPresentAdView$lambda-3(D d0) {
        return (com.vungle.ads.internal.platform.d)d0.getValue();
    }
}

