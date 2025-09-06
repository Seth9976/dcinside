package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.i;
import com.vungle.ads.internal.model.e;
import com.vungle.ads.internal.presenter.c;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.v;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@k(message = "Use VungleBannerView instead")
public final class y extends K {
    public final class a {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[G.values().length];
            arr_v[G.BANNER.ordinal()] = 1;
            arr_v[G.BANNER_SHORT.ordinal()] = 2;
            arr_v[G.BANNER_LEADERBOARD.ordinal()] = 3;
            arr_v[G.VUNGLE_MREC.ordinal()] = 4;
            a.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    private final c adPlayCallback;
    @l
    private final b1 adSize;
    @m
    private H bannerView;

    @k(message = "Use VungleAdSize instead")
    public y(@l Context context0, @l String s, @l G g0) {
        L.p(context0, "context");
        b1 b10;
        L.p(s, "placementId");
        L.p(g0, "adSize");
        switch(g0) {
            case 1: {
                b10 = b1.BANNER;
                break;
            }
            case 2: {
                b10 = b1.BANNER_SHORT;
                break;
            }
            case 3: {
                b10 = b1.BANNER_LEADERBOARD;
                break;
            }
            case 4: {
                b10 = b1.MREC;
                break;
            }
            default: {
                throw new J();
            }
        }
        this(context0, s, b10, new d());
    }

    public y(@l Context context0, @l String s, @l b1 b10) {
        L.p(context0, "context");
        L.p(s, "placementId");
        L.p(b10, "adSize");
        this(context0, s, b10, new d());
    }

    private y(Context context0, String s, b1 b10, d d0) {
        public static final class b implements com.vungle.ads.internal.presenter.b {
            b(y y0) {
                y.this = y0;
                super();
            }

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdClick(@m String s) {
                C c0 = () -> {
                    L.p(y.this, "this$0");
                    com.vungle.ads.L l0 = y.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdClicked(y.this);
                    }
                };
                v.INSTANCE.runOnUiThread(c0);
                y.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y.this.getDisplayToClickMetric$vungle_ads_release(), y.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdClick$lambda-3(y y0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@m String s) {
                D d0 = () -> {
                    L.p(y.this, "this$0");
                    com.vungle.ads.L l0 = y.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdEnd(y.this);
                    }
                };
                v.INSTANCE.runOnUiThread(d0);
            }

            // 检测为 Lambda 实现
            private static final void onAdEnd$lambda-2(y y0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@m String s) {
                E e0 = () -> {
                    L.p(y.this, "this$0");
                    com.vungle.ads.L l0 = y.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdImpression(y.this);
                    }
                };
                v.INSTANCE.runOnUiThread(e0);
                y.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y.this.getPresentToDisplayMetric$vungle_ads_release(), y.this.getLogEntry$vungle_ads_release(), null, 4, null);
                y.this.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            // 检测为 Lambda 实现
            private static final void onAdImpression$lambda-1(y y0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@m String s) {
                B b0 = () -> {
                    L.p(y.this, "this$0");
                    com.vungle.ads.L l0 = y.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdLeftApplication(y.this);
                    }
                };
                v.INSTANCE.runOnUiThread(b0);
            }

            // 检测为 Lambda 实现
            private static final void onAdLeftApplication$lambda-4(y y0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@m String s) {
            }

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdStart(@m String s) {
                y.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                y.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                Y0 y00 = y.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, y.this.getLogEntry$vungle_ads_release(), null, 4, null);
                y.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
                z z0 = () -> {
                    L.p(y.this, "this$0");
                    com.vungle.ads.L l0 = y.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdStart(y.this);
                    }
                };
                v.INSTANCE.runOnUiThread(z0);
            }

            // 检测为 Lambda 实现
            private static final void onAdStart$lambda-0(y y0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onFailure(@l d1 d10) {
                L.p(d10, "error");
                y.this.getShowToFailMetric$vungle_ads_release().markEnd();
                r.INSTANCE.logMetric$vungle_ads_release(y.this.getShowToFailMetric$vungle_ads_release(), y.this.getLogEntry$vungle_ads_release(), String.valueOf(d10.getCode()));
                A a0 = () -> {
                    L.p(y.this, "this$0");
                    L.p(d10, "$error");
                    com.vungle.ads.L l0 = y.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdFailedToPlay(y.this, d10);
                    }
                };
                v.INSTANCE.runOnUiThread(a0);
            }

            // 检测为 Lambda 实现
            private static final void onFailure$lambda-5(y y0, d1 d10) [...]
        }

        super(context0, s, d0);
        this.adSize = b10;
        com.vungle.ads.internal.a a0 = this.getAdInternal$vungle_ads_release();
        L.n(a0, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((i)a0).wrapCallback$vungle_ads_release(new b(this));
    }

    @Override  // com.vungle.ads.K
    public com.vungle.ads.internal.a constructAdInternal$vungle_ads_release(Context context0) {
        return this.constructAdInternal$vungle_ads_release(context0);
    }

    @l
    public i constructAdInternal$vungle_ads_release(@l Context context0) {
        L.p(context0, "context");
        return new i(context0, this.adSize);
    }

    public final void finishAd() {
        H h0 = this.bannerView;
        if(h0 != null) {
            h0.finishAdInternal(true);
        }
    }

    @l
    public final b1 getAdViewSize() {
        com.vungle.ads.internal.a a0 = this.getAdInternal$vungle_ads_release();
        L.n(a0, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        b1 b10 = ((i)a0).getUpdatedAdSize$vungle_ads_release();
        return b10 == null ? this.adSize : b10;
    }

    @m
    public final H getBannerView() {
        r r0 = r.INSTANCE;
        r.logMetric$vungle_ads_release$default(r0, new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.PLAY_AD_API), this.getLogEntry$vungle_ads_release(), null, 4, null);
        H h0 = this.bannerView;
        if(h0 != null) {
            return h0;
        }
        this.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        d1 d10 = this.getAdInternal$vungle_ads_release().canPlayAd(true);
        if(d10 != null) {
            if(this.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(d10.getCode())) {
                this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.a.ERROR);
            }
            x x0 = () -> {
                L.p(this, "this$0");
                com.vungle.ads.L l0 = this.getAdListener();
                if(l0 != null) {
                    l0.onAdFailedToPlay(this, d10);
                }
            };
            v.INSTANCE.runOnUiThread(x0);
            return null;
        }
        com.vungle.ads.internal.model.b b0 = this.getAdInternal$vungle_ads_release().getAdvertisement();
        if(b0 == null) {
            return null;
        }
        com.vungle.ads.internal.model.m m0 = this.getAdInternal$vungle_ads_release().getPlacement();
        if(m0 == null) {
            return null;
        }
        this.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        b1 b10 = this.getAdViewSize();
        try {
            try {
                e e0 = this.getAdInternal$vungle_ads_release().getBidPayload();
                this.bannerView = new H(this.getContext(), m0, b0, b10, this.getAdConfig(), this.adPlayCallback, e0);
                goto label_33;
            }
            catch(InstantiationException instantiationException0) {
            }
            p.Companion.e("BannerAd", "Can not create banner view: " + instantiationException0.getMessage(), instantiationException0);
        }
        catch(Throwable throwable0) {
            this.getResponseToShowMetric$vungle_ads_release().markEnd();
            r.logMetric$vungle_ads_release$default(r.INSTANCE, this.getResponseToShowMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), null, 4, null);
            throw throwable0;
        }
        this.getResponseToShowMetric$vungle_ads_release().markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.getResponseToShowMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), null, 4, null);
        return null;
    label_33:
        this.getResponseToShowMetric$vungle_ads_release().markEnd();
        r.logMetric$vungle_ads_release$default(r0, this.getResponseToShowMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), null, 4, null);
        this.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        r.logMetric$vungle_ads_release$default(r0, this.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), null, 4, null);
        this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        return this.bannerView;
    }

    // 检测为 Lambda 实现
    private static final void getBannerView$lambda-1(y y0, d1 d10) [...]
}

