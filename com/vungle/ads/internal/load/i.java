package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.I0;
import com.vungle.ads.J0;
import com.vungle.ads.W0;
import com.vungle.ads.b1;
import com.vungle.ads.d1;
import com.vungle.ads.internal.downloader.e;
import com.vungle.ads.internal.executor.a;
import com.vungle.ads.internal.model.m;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.omsdk.c;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.k;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.L;
import y4.l;

public final class i extends d {
    public i(@l Context context0, @l com.vungle.ads.internal.network.l l0, @l a a0, @l c c0, @l e e0, @l q q0, @l b b0) {
        L.p(context0, "context");
        L.p(l0, "vungleApiClient");
        L.p(a0, "sdkExecutors");
        L.p(c0, "omInjector");
        L.p(e0, "downloader");
        L.p(q0, "pathProvider");
        L.p(b0, "adRequest");
        super(context0, l0, a0, c0, e0, q0, b0);
    }

    private final void fetchAdMetadata(b1 b10, m m0) {
        public static final class com.vungle.ads.internal.load.i.a implements com.vungle.ads.internal.network.b {
            final m $placement;

            com.vungle.ads.internal.load.i.a(i i0, m m0) {
                i.this = i0;
                this.$placement = m0;
                super();
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onFailure(@y4.m com.vungle.ads.internal.network.a a0, @y4.m Throwable throwable0) {
                i.this.getSdkExecutors().getBackgroundExecutor().execute(() -> {
                    L.p(i.this, "this$0");
                    i.this.onAdLoadFailed(i.this.retrofitToVungleError(throwable0).setLogEntry$vungle_ads_release(i.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                });
            }

            // 检测为 Lambda 实现
            private static final void onFailure$lambda-1(i i0, Throwable throwable0) [...]

            @Override  // com.vungle.ads.internal.network.b
            public void onResponse(@y4.m com.vungle.ads.internal.network.a a0, @y4.m f f0) {
                i.this.getSdkExecutors().getBackgroundExecutor().execute(() -> {
                    com.vungle.ads.internal.model.b.c b$c0 = null;
                    L.p(i.this, "this$0");
                    L.p(this.$placement, "$placement");
                    if(i.this.getVungleApiClient().getRetryAfterHeaderValue(this.$placement.getReferenceId()) > 0L) {
                        i.this.onAdLoadFailed(new com.vungle.ads.m().setLogEntry$vungle_ads_release(i.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                        return;
                    }
                    if(f0 != null && !f0.isSuccessful()) {
                        i.this.onAdLoadFailed(new com.vungle.ads.a("ads API: " + f0.code()).setLogEntry$vungle_ads_release(i.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                        return;
                    }
                    com.vungle.ads.internal.model.b b0 = f0 == null ? null : ((com.vungle.ads.internal.model.b)f0.body());
                    if(b0 != null) {
                        b$c0 = b0.adUnit();
                    }
                    if(b$c0 == null) {
                        i.this.onAdLoadFailed(new k("Ad response is empty").setLogEntry$vungle_ads_release(i.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                        return;
                    }
                    i.this.handleAdMetaData$vungle_ads_release(b0, new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CONFIG_LOADED_FROM_AD_LOAD));
                });
            }

            // 检测为 Lambda 实现
            private static final void onResponse$lambda-0(i i0, m m0, f f0) [...]
        }

        if(this.getVungleApiClient().checkIsRetryAfterActive(m0.getReferenceId())) {
            this.onAdLoadFailed(new com.vungle.ads.l().setLogEntry$vungle_ads_release(this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.a a0 = this.getVungleApiClient().requestAd(m0.getReferenceId(), b10);
        if(a0 == null) {
            this.onAdLoadFailed(new J0("adsCall is null").setLogEntry$vungle_ads_release(this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        a0.enqueue(new com.vungle.ads.internal.load.i.a(this, m0));
    }

    @Override  // com.vungle.ads.internal.load.d
    public void onAdLoadReady() {
    }

    @Override  // com.vungle.ads.internal.load.d
    protected void requestAd() {
        this.fetchAdMetadata(this.getAdRequest().getRequestAdSize(), this.getAdRequest().getPlacement());
    }

    private final d1 retrofitToVungleError(Throwable throwable0) {
        return throwable0 instanceof SocketTimeoutException ? new I0() : new J0("ads request fail: " + (throwable0 == null ? null : throwable0.getMessage()));
    }
}

