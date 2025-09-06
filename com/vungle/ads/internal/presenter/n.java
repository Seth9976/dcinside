package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.Q0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.W0;
import com.vungle.ads.Z0;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.model.b;
import com.vungle.ads.internal.network.j;
import com.vungle.ads.internal.platform.d;
import com.vungle.ads.internal.signals.c;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.r;
import com.vungle.ads.s0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;

public final class n {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final Map getEventMap$vungle_ads_release() {
            return n.eventMap;
        }

        @VisibleForTesting
        public static void getEventMap$vungle_ads_release$annotations() {
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String DOWNLOAD = "download";
    @l
    public static final String OPEN_PRIVACY = "openPrivacy";
    @l
    private static final String TAG = "NativeAdPresenter";
    @l
    public static final String TPAT = "tpat";
    @l
    public static final String VIDEO_VIEWED = "videoViewed";
    @m
    private Long adStartTime;
    private boolean adViewed;
    @m
    private final b advertisement;
    @m
    private com.vungle.ads.internal.presenter.a bus;
    @l
    private final Context context;
    @m
    private Dialog currentDialog;
    @l
    private final o delegate;
    @l
    private static final Map eventMap;
    @l
    private Executor executor;
    @l
    private final D executors$delegate;
    @l
    private final D logEntry$delegate;
    @m
    private com.vungle.ads.internal.omsdk.a omTracker;
    @l
    private final D pathProvider$delegate;
    @l
    private final d platform;
    @l
    private final D signalManager$delegate;
    @l
    private final D vungleApiClient$delegate;

    static {
        n.Companion = new a(null);
        n.eventMap = Y.W(new V[]{r0.a("checkpoint.0", com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_START_EVENT), r0.a("clickUrl", com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_CLICK_EVENT)});
    }

    public n(@l Context context0, @l o o0, @m b b0, @l Executor executor0, @l d d0) {
        static final class com.vungle.ads.internal.presenter.n.b extends N implements A3.a {
            com.vungle.ads.internal.presenter.n.b(n n0) {
                n.this = n0;
                super(0);
            }

            @m
            public final com.vungle.ads.internal.util.o invoke() {
                b b0 = n.this.advertisement;
                return b0 == null ? null : b0.getLogEntry$vungle_ads_release();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        public static final class com.vungle.ads.internal.presenter.n.d extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.presenter.n.d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


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
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
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
                return ServiceLocator.Companion.getInstance(this.$context).getService(c.class);
            }
        }

        L.p(context0, "context");
        L.p(o0, "delegate");
        L.p(executor0, "executor");
        L.p(d0, "platform");
        super();
        this.context = context0;
        this.delegate = o0;
        this.advertisement = b0;
        this.executor = executor0;
        this.platform = d0;
        com.vungle.ads.internal.presenter.n.d n$d0 = new com.vungle.ads.internal.presenter.n.d(context0);
        this.vungleApiClient$delegate = E.c(H.a, n$d0);
        e n$e0 = new e(context0);
        this.executors$delegate = E.c(H.a, n$e0);
        f n$f0 = new f(context0);
        this.pathProvider$delegate = E.c(H.a, n$f0);
        g n$g0 = new g(context0);
        this.signalManager$delegate = E.c(H.a, n$g0);
        this.logEntry$delegate = E.a(new com.vungle.ads.internal.presenter.n.b(this));
    }

    public final void detach() {
        com.vungle.ads.internal.omsdk.a a0 = this.omTracker;
        if(a0 != null) {
            a0.stop();
        }
        Dialog dialog0 = this.currentDialog;
        if(dialog0 != null && dialog0.isShowing()) {
            dialog0.dismiss();
        }
        Long long0 = this.adStartTime;
        if(long0 != null) {
            long v = long0.longValue();
            long v1 = System.currentTimeMillis();
            j j0 = new j(this.getVungleApiClient(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
            b b0 = this.advertisement;
            if(b0 != null) {
                List list0 = b0.getTpatUrls("ad.close", String.valueOf(v1 - v), String.valueOf(this.platform.getVolumeLevel()));
                if(list0 != null) {
                    j0.sendTpats(list0, this.executor);
                }
            }
        }
        com.vungle.ads.internal.presenter.a a1 = this.bus;
        if(a1 != null) {
            a1.onNext("end", null, this.delegate.getPlacementRefId());
        }
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a)this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.o getLogEntry() {
        return (com.vungle.ads.internal.util.o)this.logEntry$delegate.getValue();
    }

    private final q getPathProvider() {
        return (q)this.pathProvider$delegate.getValue();
    }

    private final c getSignalManager() {
        return (c)this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.network.l getVungleApiClient() {
        return (com.vungle.ads.internal.network.l)this.vungleApiClient$delegate.getValue();
    }

    public final void initOMTracker(@l String s) {
        L.p(s, "omSdkData");
        boolean z = this.advertisement == null ? false : this.advertisement.omEnabled();
        if(s.length() > 0 && false && z) {
            this.omTracker = new com.vungle.ads.internal.omsdk.a(s);
        }
    }

    // 去混淆评级： 中等(60)
    private final boolean needShowGdpr() {
        return false;
    }

    private final void onDownload(String s) {
        public static final class com.vungle.ads.internal.presenter.n.c implements com.vungle.ads.internal.ui.b {
            final String $deeplinkUrl;
            final j $tpatSender;

            com.vungle.ads.internal.presenter.n.c(String s, n n0, j j0) {
                this.$deeplinkUrl = s;
                n.this = n0;
                this.$tpatSender = j0;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.b
            public void onDeeplinkClick(boolean z) {
                if(!z) {
                    new s0(com.vungle.ads.internal.protos.Sdk.SDKError.b.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(n.this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                b b0 = n.this.advertisement;
                List list0 = b0 == null ? null : b.getTpatUrls$default(b0, "deeplink.click", String.valueOf(z), null, 4, null);
                if(list0 != null) {
                    j j0 = this.$tpatSender;
                    n n0 = n.this;
                    for(Object object0: list0) {
                        j0.sendTpat(((String)object0), n0.executor);
                    }
                }
            }
        }

        String s1 = null;
        List list0 = this.advertisement == null ? null : b.getTpatUrls$default(this.advertisement, "clickUrl", null, null, 6, null);
        j j0 = new j(this.getVungleApiClient(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
        if(list0 == null || list0.isEmpty()) {
            new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR, "Empty tpat key: clickUrl").setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        else {
            for(Object object0: list0) {
                j0.sendTpat(((String)object0), this.executor);
            }
        }
        if(s != null) {
            j0.sendTpat(s, this.executor);
        }
        b b0 = this.advertisement;
        if(b0 != null) {
            com.vungle.ads.internal.model.b.c b$c0 = b0.adUnit();
            if(b$c0 != null) {
                s1 = b$c0.getDeeplinkUrl();
            }
        }
        com.vungle.ads.internal.util.o o0 = this.getLogEntry();
        com.vungle.ads.internal.presenter.n.c n$c0 = new com.vungle.ads.internal.presenter.n.c(s1, this, j0);
        boolean z = com.vungle.ads.internal.util.e.launch(s1, s, this.context, o0, n$c0);
        com.vungle.ads.internal.presenter.a a0 = this.bus;
        if(a0 != null) {
            a0.onNext("open", "adClick", this.delegate.getPlacementRefId());
        }
        if(z) {
            com.vungle.ads.internal.presenter.a a1 = this.bus;
            if(a1 != null) {
                a1.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public final void onImpression() {
        com.vungle.ads.internal.omsdk.a a0 = this.omTracker;
        if(a0 != null) {
            a0.impressionOccurred();
        }
    }

    private final void onPrivacy(String s) {
        if(s != null) {
            if(!h.INSTANCE.isValidUrl(s)) {
                new Q0(s).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            com.vungle.ads.internal.util.o o0 = this.getLogEntry();
            if(com.vungle.ads.internal.util.e.launch$default(null, s, this.context, o0, null, 16, null)) {
                com.vungle.ads.internal.presenter.a a0 = this.bus;
                if(a0 != null) {
                    a0.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
                }
            }
            else {
                new Q0(s).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    public final void prepare() {
        this.start();
        com.vungle.ads.internal.presenter.a a0 = this.bus;
        if(a0 != null) {
            a0.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = System.currentTimeMillis();
    }

    public final void processCommand(@l String s, @m String s1) {
        L.p(s, "action");
        List list0 = null;
        switch(s) {
            case "download": {
                this.onDownload(s1);
                return;
            }
            case "openPrivacy": {
                this.onPrivacy(s1);
                return;
            }
            case "tpat": {
                if(s1 != null && s1.length() != 0) {
                    this.triggerEventMetricForTpat(s1);
                    if(L.g(s1, "checkpoint.0")) {
                        b b0 = this.advertisement;
                        if(b0 != null) {
                            list0 = b0.getTpatUrls(s1, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel()));
                        }
                    }
                    else {
                        b b1 = this.advertisement;
                        if(b1 != null) {
                            list0 = b.getTpatUrls$default(b1, s1, null, null, 6, null);
                        }
                    }
                    if(list0 != null && !list0.isEmpty()) {
                        j j0 = new j(this.getVungleApiClient(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
                        for(Object object0: list0) {
                            j0.sendTpat(((String)object0), this.executor);
                        }
                        return;
                    }
                    new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_TPAT_KEY, "Empty urls for tpat: " + s1).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            case "videoViewed": {
                com.vungle.ads.internal.presenter.a a0 = this.bus;
                if(a0 != null && !this.adViewed) {
                    this.adViewed = true;
                    if(a0 != null) {
                        a0.onNext("adViewed", null, this.delegate.getPlacementRefId());
                    }
                    j j1 = new j(this.getVungleApiClient(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
                    List list1 = this.delegate.getImpressionUrls();
                    if(list1 != null) {
                        for(Object object1: list1) {
                            j1.sendTpat(((String)object1), this.executor);
                        }
                    }
                }
                return;
            }
            default: {
                p.Companion.w("NativeAdPresenter", "Unknown native ad action: " + s);
            }
        }
    }

    public static void processCommand$default(n n0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        n0.processCommand(s, s1);
    }

    public final void setEventListener(@m com.vungle.ads.internal.presenter.a a0) {
        this.bus = a0;
    }

    private final void showGdpr() {
        V2.c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if(!(this.context instanceof Activity)) {
            p.Companion.w("NativeAdPresenter", "We can not show GDPR dialog with application context.");
            return;
        }
        com.vungle.ads.internal.presenter.l l0 = (DialogInterface dialogInterface0, int v) -> {
            String s;
            L.p(this, "this$0");
            switch(v) {
                case -2: {
                    s = "opted_out";
                    break;
                }
                case -1: {
                    s = "opted_in";
                    break;
                }
                default: {
                    s = "opted_out_by_timeout";
                }
            }
            V2.c.INSTANCE.updateGdprConsent(s, "vungle_modal", null);
            this.start();
        };
        String s = k.INSTANCE.getGDPRConsentTitle();
        String s1 = k.INSTANCE.getGDPRConsentMessage();
        String s2 = k.INSTANCE.getGDPRButtonAccept();
        String s3 = k.INSTANCE.getGDPRButtonDeny();
        ApplicationInfo applicationInfo0 = ((Activity)this.context).getApplicationInfo();
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(this.context, applicationInfo0.theme));
        if(s != null && s.length() != 0) {
            alertDialog$Builder0.setTitle(s);
        }
        if(s1 != null && s1.length() != 0) {
            alertDialog$Builder0.setMessage(s1);
        }
        alertDialog$Builder0.setPositiveButton(s2, l0);
        alertDialog$Builder0.setNegativeButton(s3, l0);
        alertDialog$Builder0.setCancelable(false);
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        alertDialog0.setOnDismissListener((DialogInterface dialogInterface0) -> {
            L.p(this, "this$0");
            this.currentDialog = null;
        });
        this.currentDialog = alertDialog0;
        alertDialog0.show();
    }

    // 检测为 Lambda 实现
    private static final void showGdpr$lambda-8(n n0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private static final void showGdpr$lambda-9(n n0, DialogInterface dialogInterface0) [...]

    private final void start() {
        if(this.needShowGdpr()) {
            this.showGdpr();
        }
    }

    public final void startTracking(@l View view0) {
        L.p(view0, "rootView");
        com.vungle.ads.internal.omsdk.a a0 = this.omTracker;
        if(a0 != null) {
            a0.start(view0);
        }
    }

    private final void triggerEventMetricForTpat(String s) {
        com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0 = (com.vungle.ads.internal.protos.Sdk.SDKMetric.b)n.eventMap.get(s);
        if(sdk$SDKMetric$b0 != null) {
            W0 w00 = new W0(sdk$SDKMetric$b0);
            com.vungle.ads.internal.util.o o0 = this.getLogEntry();
            r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, o0, null, 4, null);
        }
    }
}

