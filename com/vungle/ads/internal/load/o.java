package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.W0;
import com.vungle.ads.g;
import com.vungle.ads.internal.downloader.e;
import com.vungle.ads.internal.executor.a;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.network.j;
import com.vungle.ads.internal.omsdk.c;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.m0;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class o extends d {
    public o(@l Context context0, @l com.vungle.ads.internal.network.l l0, @l a a0, @l c c0, @l e e0, @l q q0, @l b b0) {
        L.p(context0, "context");
        L.p(l0, "vungleApiClient");
        L.p(a0, "sdkExecutors");
        L.p(c0, "omInjector");
        L.p(e0, "downloader");
        L.p(q0, "pathProvider");
        L.p(b0, "adRequest");
        super(context0, l0, a0, c0, e0, q0, b0);
    }

    @Override  // com.vungle.ads.internal.load.d
    public void onAdLoadReady() {
        com.vungle.ads.internal.model.b b0 = this.getAdvertisement$vungle_ads_release();
        this.sendWinNotification((b0 == null ? null : b0.getWinNotifications()));
    }

    @Override  // com.vungle.ads.internal.load.d
    protected void requestAd() {
        public static final class com.vungle.ads.internal.load.o.a extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.load.o.a(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }

        com.vungle.ads.internal.model.e e0 = this.getAdRequest().getAdMarkup();
        if(e0 == null) {
            this.onAdLoadFailed(new m0().setLogEntry$vungle_ads_release(this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if(k.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String s = e0.getDecodedAdsResponse();
                p.Companion.d("RTA_DEBUGGER", String.valueOf(s));
                com.vungle.ads.internal.load.o.a o$a0 = new com.vungle.ads.internal.load.o.a(this.getContext());
                D d0 = E.c(H.a, o$a0);
                if(s != null) {
                    new n(o.requestAd$lambda-0(d0)).reportAdMarkup(s);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        com.vungle.ads.internal.model.b b0 = e0.getAdPayload();
        Integer integer0 = e0.getVersion();
        if(integer0 != null && ((int)integer0) == 2 && b0 != null) {
            this.handleAdMetaData$vungle_ads_release(b0, new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CONFIG_LOADED_FROM_ADM_LOAD));
            return;
        }
        this.onAdLoadFailed(new g("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
    }

    private static final com.vungle.ads.internal.network.l requestAd$lambda-0(D d0) {
        return (com.vungle.ads.internal.network.l)d0.getValue();
    }

    private final void sendWinNotification(List list0) {
        public static final class com.vungle.ads.internal.load.o.b extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.load.o.b(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.c.class);
            }
        }

        if(list0 != null && list0.isEmpty()) {
            return;
        }
        com.vungle.ads.internal.load.o.b o$b0 = new com.vungle.ads.internal.load.o.b(this.getContext());
        D d0 = E.c(H.a, o$b0);
        j j0 = new j(this.getVungleApiClient(), this.getLogEntry$vungle_ads_release(), this.getSdkExecutors().getIoExecutor(), this.getPathProvider(), o.sendWinNotification$lambda-2(d0));
        if(list0 != null) {
            for(Object object0: list0) {
                j0.sendWinNotification(((String)object0), this.getSdkExecutors().getJobExecutor());
            }
        }
    }

    private static final com.vungle.ads.internal.signals.c sendWinNotification$lambda-2(D d0) {
        return (com.vungle.ads.internal.signals.c)d0.getValue();
    }
}

