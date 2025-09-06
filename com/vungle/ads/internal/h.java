package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.K;
import com.vungle.ads.Y0;
import com.vungle.ads.b1;
import com.vungle.ads.d1;
import com.vungle.ads.d;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.c;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.r;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class h extends K {
    @l
    private final c adPlayCallback;
    @l
    private final b1 adSize;

    public h(@l Context context0, @l String s, @l b1 b10, @l d d0) {
        public static final class a implements b {
            a(h h0) {
                h.this = h0;
                super();
            }

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdClick(@m String s) {
                com.vungle.ads.internal.b b0 = () -> {
                    L.p(h.this, "this$0");
                    com.vungle.ads.L l0 = h.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdClicked(h.this);
                    }
                };
                v.INSTANCE.runOnUiThread(b0);
                h.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, h.this.getDisplayToClickMetric$vungle_ads_release(), h.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdClick$lambda-3(h h0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@m String s) {
                com.vungle.ads.internal.d d0 = () -> {
                    L.p(h.this, "this$0");
                    com.vungle.ads.L l0 = h.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdEnd(h.this);
                    }
                };
                v.INSTANCE.runOnUiThread(d0);
                h.this.getShowToCloseMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, h.this.getShowToCloseMetric$vungle_ads_release(), h.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdEnd$lambda-2(h h0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@m String s) {
                e e0 = () -> {
                    L.p(h.this, "this$0");
                    com.vungle.ads.L l0 = h.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdImpression(h.this);
                    }
                };
                v.INSTANCE.runOnUiThread(e0);
                h.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, h.this.getPresentToDisplayMetric$vungle_ads_release(), h.this.getLogEntry$vungle_ads_release(), null, 4, null);
                h.this.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            // 检测为 Lambda 实现
            private static final void onAdImpression$lambda-1(h h0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@m String s) {
                com.vungle.ads.internal.c c0 = () -> {
                    L.p(h.this, "this$0");
                    com.vungle.ads.L l0 = h.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdLeftApplication(h.this);
                    }
                };
                v.INSTANCE.runOnUiThread(c0);
                r.logMetric$vungle_ads_release$default(r.INSTANCE, h.this.getLeaveApplicationMetric$vungle_ads_release(), h.this.getLogEntry$vungle_ads_release(), null, 4, null);
            }

            // 检测为 Lambda 实现
            private static final void onAdLeftApplication$lambda-4(h h0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@m String s) {
            }

            @Override  // com.vungle.ads.internal.presenter.b
            public void onAdStart(@m String s) {
                h.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                h.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                Y0 y00 = h.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, h.this.getLogEntry$vungle_ads_release(), null, 4, null);
                h.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
                g g0 = () -> {
                    L.p(h.this, "this$0");
                    com.vungle.ads.L l0 = h.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdStart(h.this);
                    }
                };
                v.INSTANCE.runOnUiThread(g0);
            }

            // 检测为 Lambda 实现
            private static final void onAdStart$lambda-0(h h0) [...]

            @Override  // com.vungle.ads.internal.presenter.b
            public void onFailure(@l d1 d10) {
                L.p(d10, "error");
                f f0 = () -> {
                    L.p(h.this, "this$0");
                    L.p(d10, "$error");
                    com.vungle.ads.L l0 = h.this.getAdListener();
                    if(l0 != null) {
                        l0.onAdFailedToPlay(h.this, d10);
                    }
                };
                v.INSTANCE.runOnUiThread(f0);
                h.this.getShowToFailMetric$vungle_ads_release().markEnd();
                r.INSTANCE.logMetric$vungle_ads_release(h.this.getShowToFailMetric$vungle_ads_release(), h.this.getLogEntry$vungle_ads_release(), String.valueOf(d10.getCode()));
            }

            // 检测为 Lambda 实现
            private static final void onFailure$lambda-5(h h0, d1 d10) [...]
        }

        L.p(context0, "context");
        L.p(s, "placementId");
        L.p(b10, "adSize");
        L.p(d0, "adConfig");
        super(context0, s, d0);
        this.adSize = b10;
        com.vungle.ads.internal.a a0 = this.getAdInternal$vungle_ads_release();
        L.n(a0, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((i)a0).wrapCallback$vungle_ads_release(new a(this));
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

    @l
    public final c getAdPlayCallback$vungle_ads_release() {
        return this.adPlayCallback;
    }

    @l
    public final b1 getAdViewSize() {
        com.vungle.ads.internal.a a0 = this.getAdInternal$vungle_ads_release();
        L.n(a0, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        b1 b10 = ((i)a0).getUpdatedAdSize$vungle_ads_release();
        return b10 == null ? this.adSize : b10;
    }
}

