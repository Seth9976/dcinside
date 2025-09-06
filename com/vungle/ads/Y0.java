package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.o;
import com.vungle.ads.internal.presenter.n;
import com.vungle.ads.internal.q;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class y0 extends K {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    @l
    public static final b Companion = null;
    @l
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    @m
    private MediaView adContentView;
    @m
    private ImageView adIconView;
    private int adOptionsPosition;
    @m
    private NativeAdOptionsView adOptionsView;
    @l
    private final c adPlayCallback;
    @m
    private FrameLayout adRootView;
    private float aspectRatio;
    @m
    private Collection clickableViews;
    @l
    private final D executors$delegate;
    @l
    private final D imageLoader$delegate;
    @l
    private final D impressionTracker$delegate;
    @l
    private final AtomicBoolean isInvisibleLogged;
    @m
    private Map nativeAdAssetMap;
    @m
    private n presenter;

    static {
        y0.Companion = new b(null);
    }

    public y0(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "placementId");
        this(context0, s, new d());
    }

    private y0(Context context0, String s, d d0) {
        public static final class c implements com.vungle.ads.internal.presenter.b {
            c(y0 y00) {
                y0.this = y00;
                super();
            }

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdClick(@m String s) {
                E0 e00 = () -> {
                    L.p(y0.this, "this$0");
                    com.vungle.ads.L l0 = y0.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdClicked(y0.this);
                    }
                };
                v.INSTANCE.runOnUiThread(e00);
                y0.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y0.this.getDisplayToClickMetric$vungle_ads_release(), y0.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdClick$lambda-3(y0 y00) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@m String s) {
                y0.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.a.FINISHED);
                A0 a00 = () -> {
                    L.p(y0.this, "this$0");
                    com.vungle.ads.L l0 = y0.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdEnd(y0.this);
                    }
                };
                v.INSTANCE.runOnUiThread(a00);
                y0.this.getShowToCloseMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y0.this.getShowToCloseMetric$vungle_ads_release(), y0.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdEnd$lambda-2(y0 y00) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@m String s) {
                z0 z00 = () -> {
                    L.p(y0.this, "this$0");
                    com.vungle.ads.L l0 = y0.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdImpression(y0.this);
                    }
                };
                v.INSTANCE.runOnUiThread(z00);
                y0.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y0.this.getPresentToDisplayMetric$vungle_ads_release(), y0.this.getLogEntry$vungle_ads_release(), null, 4, null);
                y0.this.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            // 检测为 Lambda 实现
            private static final void onAdImpression$lambda-1(y0 y00) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@m String s) {
                D0 d00 = () -> {
                    L.p(y0.this, "this$0");
                    com.vungle.ads.L l0 = y0.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdLeftApplication(y0.this);
                    }
                };
                v.INSTANCE.runOnUiThread(d00);
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y0.this.getLeaveApplicationMetric$vungle_ads_release(), y0.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdLeftApplication$lambda-4(y0 y00) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@m String s) {
            }

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdStart(@m String s) {
                y0.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.a.PLAYING);
                y0.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                y0.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                Y0 y00 = y0.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, y0.this.getLogEntry$vungle_ads_release(), null, 4, null);
                y0.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
                C0 c00 = () -> {
                    L.p(y0.this, "this$0");
                    com.vungle.ads.L l0 = y0.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdStart(y0.this);
                    }
                };
                v.INSTANCE.runOnUiThread(c00);
            }

            // 检测为 Lambda 实现
            private static final void onAdStart$lambda-0(y0 y00) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onFailure(@l d1 d10) {
                L.p(d10, "error");
                y0.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.a.ERROR);
                B0 b00 = () -> {
                    L.p(y0.this, "this$0");
                    L.p(d10, "$error");
                    com.vungle.ads.L l0 = y0.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdFailedToPlay(y0.this, d10);
                    }
                };
                v.INSTANCE.runOnUiThread(b00);
                y0.this.getShowToFailMetric$vungle_ads_release().markEnd();
                r.INSTANCE.logMetric$vungle_ads_release(y0.this.getShowToFailMetric$vungle_ads_release(), y0.this.getLogEntry$vungle_ads_release(), String.valueOf(d10.getCode()));
            }

            // 检测为 Lambda 实现
            private static final void onFailure$lambda-5(y0 y00, d1 d10) [...]
        }


        static final class f extends N implements A3.a {
            f(y0 y00) {
                y0.this = y00;
                super(0);
            }

            @l
            public final com.vungle.ads.internal.util.l invoke() {
                com.vungle.ads.internal.util.l l0 = com.vungle.ads.internal.util.l.Companion.getInstance();
                l0.init(y0.this.getExecutors().getIoExecutor());
                return l0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        static final class g extends N implements A3.a {
            final Context $context;

            g(Context context0) {
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


        public static final class j extends N implements A3.a {
            final Context $context;

            public j(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }

        super(context0, s, d0);
        this.imageLoader$delegate = E.a(new f(this));
        j y0$j0 = new j(context0);
        this.executors$delegate = E.c(H.a, y0$j0);
        this.impressionTracker$delegate = E.a(new g(context0));
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.adOptionsPosition = 1;
        this.adOptionsView = new NativeAdOptionsView(context0);
        this.adPlayCallback = new c(this);
    }

    @Override  // com.vungle.ads.K
    public com.vungle.ads.internal.a constructAdInternal$vungle_ads_release(Context context0) {
        return this.constructAdInternal$vungle_ads_release(context0);
    }

    @l
    public q constructAdInternal$vungle_ads_release(@l Context context0) {
        L.p(context0, "context");
        return new q(context0);
    }

    private final void createMediaAspectRatio() {
        static final class com.vungle.ads.y0.d extends N implements A3.o {
            com.vungle.ads.y0.d(y0 y00) {
                y0.this = y00;
                super(2);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Number)object0).intValue(), ((Number)object1).intValue());
                return S0.a;
            }

            public final void invoke(int v, int v1) {
                y0.this.aspectRatio = ((float)v) / ((float)v1);
            }
        }

        this.getImageLoader().getImageSize(this.getMainImagePath(), new com.vungle.ads.y0.d(this));
    }

    private final void displayImage(String s, ImageView imageView0) {
        static final class e extends N implements Function1 {
            final ImageView $imageView;

            e(ImageView imageView0) {
                this.$imageView = imageView0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Bitmap)object0));
                return S0.a;
            }

            public final void invoke(@l Bitmap bitmap0) {
                L.p(bitmap0, "it");
                ImageView imageView0 = this.$imageView;
                if(imageView0 != null) {
                    F0 f00 = () -> {
                        L.p(bitmap0, "$it");
                        imageView0.setImageBitmap(bitmap0);
                    };
                    v.INSTANCE.runOnUiThread(f00);
                }
            }

            // 检测为 Lambda 实现
            private static final void invoke$lambda-0(ImageView imageView0, Bitmap bitmap0) [...]
        }

        this.getImageLoader().displayImage(s, new e(imageView0));
    }

    @l
    public final String getAdBodyText() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("APP_DESCRIPTION");
            return s == null ? "" : s;
        }
        return "";
    }

    @l
    public final String getAdCallToActionText() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("CTA_BUTTON_TEXT");
            return s == null ? "" : s;
        }
        return "";
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    @a
    public static void getAdOptionsPosition$annotations() {
    }

    @l
    public final String getAdSponsoredText() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("SPONSORED_BY");
            return s == null ? "" : s;
        }
        return "";
    }

    @m
    public final Double getAdStarRating() {
        String s;
        Map map0 = this.nativeAdAssetMap;
        if(map0 == null) {
            s = "";
        }
        else {
            s = (String)map0.get("APP_RATING_VALUE");
            if(s == null) {
                s = "";
            }
        }
        if(!TextUtils.isEmpty(s)) {
            try {
                return Double.valueOf(s);
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    @l
    public final String getAdTitle() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("APP_NAME");
            return s == null ? "" : s;
        }
        return "";
    }

    @l
    public final String getAppIcon() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("APP_ICON");
            return s == null ? "" : s;
        }
        return "";
    }

    @l
    public final String getCtaUrl$vungle_ads_release() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("CTA_BUTTON_URL");
            return s == null ? "" : s;
        }
        return "";
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a)this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.l getImageLoader() {
        return (com.vungle.ads.internal.util.l)this.imageLoader$delegate.getValue();
    }

    private final o getImpressionTracker() {
        return (o)this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("MAIN_IMAGE");
            return s == null ? "" : s;
        }
        return "";
    }

    public final float getMediaAspectRatio() {
        return this.aspectRatio;
    }

    @l
    public final String getPrivacyIconUrl$vungle_ads_release() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("VUNGLE_PRIVACY_ICON_URL");
            return s == null ? "" : s;
        }
        return "";
    }

    @l
    public final String getPrivacyUrl$vungle_ads_release() {
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            String s = (String)map0.get("VUNGLE_PRIVACY_URL");
            return s == null ? "" : s;
        }
        return "";
    }

    public final boolean hasCallToAction() {
        return this.getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override  // com.vungle.ads.K
    public void onAdLoaded$vungle_ads_release(@l com.vungle.ads.internal.model.b b0) {
        L.p(b0, "advertisement");
        super.onAdLoaded$vungle_ads_release(b0);
        this.nativeAdAssetMap = b0.getMRAIDArgsInMap();
        this.createMediaAspectRatio();
    }

    public final void performCTA() {
        n n0 = this.presenter;
        if(n0 != null) {
            n0.processCommand("download", this.getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(@l FrameLayout frameLayout0, @l MediaView mediaView0, @m ImageView imageView0, @m Collection collection0) {
        public static final class h extends N implements A3.a {
            final Context $context;

            public h(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.d.class);
            }
        }


        public static final class i implements com.vungle.ads.internal.o.b {
            i(y0 y00) {
                y0.this = y00;
                super();
            }

            @Override  // com.vungle.ads.internal.o$b
            public void onImpression(@m View view0) {
                p.Companion.d("NativeAd", "ImpressionTracker checked the native ad view become visible.");
                n n0 = y0.this.presenter;
                if(n0 != null) {
                    n.processCommand$default(n0, "videoViewed", null, 2, null);
                }
                n n1 = y0.this.presenter;
                if(n1 != null) {
                    n1.processCommand("tpat", "checkpoint.0");
                }
                n n2 = y0.this.presenter;
                if(n2 != null) {
                    n2.onImpression();
                }
            }

            @Override  // com.vungle.ads.internal.o$b
            public void onViewInvisible(@m View view0) {
                if(!y0.this.isInvisibleLogged.getAndSet(true)) {
                    p.Companion.d("NativeAd", "ImpressionTracker checked the native ad view invisible on play.");
                    W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.VIEW_NOT_VISIBLE_ON_PLAY);
                    r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, y0.this.getLogEntry$vungle_ads_release(), null, 4, null);
                }
            }
        }

        String s;
        L.p(frameLayout0, "rootView");
        L.p(mediaView0, "mediaView");
        W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.PLAY_AD_API);
        r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, this.getLogEntry$vungle_ads_release(), null, 4, null);
        this.getResponseToShowMetric$vungle_ads_release().markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.getResponseToShowMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), null, 4, null);
        this.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        this.getShowToFailMetric$vungle_ads_release().markStart();
        this.getShowToCloseMetric$vungle_ads_release().markStart();
        d1 d10 = this.getAdInternal$vungle_ads_release().canPlayAd(true);
        if(d10 != null) {
            if(this.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(d10.getCode())) {
                this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.a.ERROR);
                Map map0 = this.nativeAdAssetMap;
                if(map0 != null) {
                    map0.clear();
                }
            }
            com.vungle.ads.L l0 = this.getAdListener();
            if(l0 != null) {
                l0.onAdFailedToPlay(this, d10);
            }
            return;
        }
        this.adRootView = frameLayout0;
        this.adContentView = mediaView0;
        this.adIconView = imageView0;
        this.clickableViews = collection0;
        h y0$h0 = new h(this.getContext());
        D d0 = E.c(H.a, y0$h0);
        com.vungle.ads.internal.a a0 = this.getAdInternal$vungle_ads_release();
        L.n(a0, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new n(this.getContext(), ((com.vungle.ads.internal.presenter.o)a0), this.getAdInternal$vungle_ads_release().getAdvertisement(), this.getExecutors().getJobExecutor(), y0.registerViewForInteraction$lambda-1(d0));
        Map map1 = this.nativeAdAssetMap;
        if(map1 == null) {
            s = "";
        }
        else {
            s = (String)map1.get("OM_SDK_DATA");
            if(s == null) {
                s = "";
            }
        }
        n n0 = this.presenter;
        if(n0 != null) {
            n0.initOMTracker(s);
        }
        n n1 = this.presenter;
        if(n1 != null) {
            n1.startTracking(frameLayout0);
        }
        n n2 = this.presenter;
        if(n2 != null) {
            com.vungle.ads.internal.model.m m0 = this.getAdInternal$vungle_ads_release().getPlacement();
            n2.setEventListener(new com.vungle.ads.internal.presenter.a(this.adPlayCallback, m0));
        }
        NativeAdOptionsView nativeAdOptionsView0 = this.adOptionsView;
        if(nativeAdOptionsView0 != null) {
            nativeAdOptionsView0.setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                n n0 = this.presenter;
                if(n0 != null) {
                    n0.processCommand("openPrivacy", this.getPrivacyUrl$vungle_ads_release());
                }
            });
        }
        if(collection0 == null) {
            collection0 = u.k(mediaView0);
        }
        for(Object object0: collection0) {
            ((View)object0).setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                n n0 = this.presenter;
                if(n0 != null) {
                    n0.processCommand("download", this.getCtaUrl$vungle_ads_release());
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView1 = this.adOptionsView;
        if(nativeAdOptionsView1 != null) {
            nativeAdOptionsView1.renderTo(frameLayout0, this.adOptionsPosition);
        }
        this.getImpressionTracker().addView(frameLayout0, new i(this));
        this.displayImage(this.getMainImagePath(), mediaView0.getMainImage$vungle_ads_release());
        this.displayImage(this.getAppIcon(), imageView0);
        this.displayImage(this.getPrivacyIconUrl$vungle_ads_release(), (this.adOptionsView == null ? null : this.adOptionsView.getPrivacyIcon$vungle_ads_release()));
        String s1 = this.getAdConfig().getWatermark$vungle_ads_release();
        if(s1 != null) {
            Context context0 = frameLayout0.getContext();
            L.o(context0, "rootView.context");
            com.vungle.ads.internal.ui.i i0 = new com.vungle.ads.internal.ui.i(context0, s1);
            frameLayout0.addView(i0);
            i0.bringToFront();
        }
        this.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        Y0 y00 = this.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, this.getLogEntry$vungle_ads_release(), null, 4, null);
        this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        n n3 = this.presenter;
        if(n3 != null) {
            n3.prepare();
        }
    }

    private static final com.vungle.ads.internal.platform.d registerViewForInteraction$lambda-1(D d0) {
        return (com.vungle.ads.internal.platform.d)d0.getValue();
    }

    // 检测为 Lambda 实现
    private static final void registerViewForInteraction$lambda-2(y0 y00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void registerViewForInteraction$lambda-4$lambda-3(y0 y00, View view0) [...]

    public final void setAdOptionsPosition(int v) {
        this.adOptionsPosition = v;
    }

    public final void unregisterView() {
        if(this.getAdInternal$vungle_ads_release().getAdState() == com.vungle.ads.internal.a.a.FINISHED) {
            return;
        }
        Collection collection0 = this.clickableViews;
        if(collection0 != null) {
            for(Object object0: collection0) {
                ((View)object0).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        Map map0 = this.nativeAdAssetMap;
        if(map0 != null) {
            map0.clear();
        }
        this.getImpressionTracker().destroy();
        MediaView mediaView0 = this.adContentView;
        if(mediaView0 != null) {
            mediaView0.destroy();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView0 = this.adOptionsView;
        if(nativeAdOptionsView0 != null) {
            nativeAdOptionsView0.destroy();
        }
        try {
            this.adOptionsView = null;
            Drawable drawable0 = this.adIconView == null ? null : this.adIconView.getDrawable();
            if(drawable0 instanceof BitmapDrawable) {
                Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                if(!bitmap0.isRecycled()) {
                    bitmap0.recycle();
                }
            }
        }
        catch(Exception exception0) {
            p.Companion.w("NativeAd", "error msg: " + exception0.getLocalizedMessage());
        }
        ImageView imageView0 = this.adIconView;
        if(imageView0 != null) {
            imageView0.setImageDrawable(null);
        }
        this.adIconView = null;
        n n0 = this.presenter;
        if(n0 != null) {
            n0.detach();
        }
    }
}

