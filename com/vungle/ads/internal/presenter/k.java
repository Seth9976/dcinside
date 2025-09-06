package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.J0;
import com.vungle.ads.Q0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.W0;
import com.vungle.ads.Z0;
import com.vungle.ads.d0;
import com.vungle.ads.d1;
import com.vungle.ads.e0;
import com.vungle.ads.f1;
import com.vungle.ads.g1;
import com.vungle.ads.h1;
import com.vungle.ads.internal.j;
import com.vungle.ads.internal.model.e;
import com.vungle.ads.internal.platform.d;
import com.vungle.ads.internal.ui.h;
import com.vungle.ads.internal.ui.view.c.a;
import com.vungle.ads.internal.ui.view.c.b;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.r;
import com.vungle.ads.s0;
import com.vungle.ads.u0;
import com.vungle.ads.v0;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.reflect.s;
import kotlinx.serialization.json.y;
import kotlinx.serialization.z;
import y4.l;
import y4.m;

public final class k implements a, b {
    public static final class com.vungle.ads.internal.presenter.k.a {
        private com.vungle.ads.internal.presenter.k.a() {
        }

        public com.vungle.ads.internal.presenter.k.a(w w0) {
        }

        @VisibleForTesting
        public static void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getCLOSE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getERROR$vungle_ads_release$annotations() {
        }

        @l
        public final Map getEventMap$vungle_ads_release() {
            return k.eventMap;
        }

        @VisibleForTesting
        public static void getEventMap$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getOPEN$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getPING_URL$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getTPAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getVIDEO_VIEWED$vungle_ads_release$annotations() {
        }
    }

    @l
    private static final String ACTION = "action";
    @l
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    @l
    public static final String CLOSE = "close";
    @l
    public static final String CONSENT_ACTION = "consentAction";
    @l
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    @l
    public static final com.vungle.ads.internal.presenter.k.a Companion = null;
    @l
    public static final String ERROR = "error";
    @l
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0;
    @l
    public static final String OPEN = "open";
    @l
    private static final String OPEN_NON_MRAID = "openNonMraid";
    @l
    public static final String OPEN_PRIVACY = "openPrivacy";
    @l
    public static final String PING_URL = "pingUrl";
    @l
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    @l
    public static final String SUCCESSFUL_VIEW = "successfulView";
    @l
    private static final String TAG = "MRAIDPresenter";
    @l
    public static final String TPAT = "tpat";
    @l
    public static final String UPDATE_SIGNALS = "updateSignals";
    @l
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    @l
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    @l
    public static final String VIDEO_LENGTH = "videoLength";
    @l
    public static final String VIDEO_VIEWED = "videoViewed";
    @m
    private Long adStartTime;
    private boolean adViewed;
    @l
    private final com.vungle.ads.internal.ui.view.b adWidget;
    @l
    private final com.vungle.ads.internal.model.b advertisement;
    private boolean backEnabled;
    @m
    private final e bidPayload;
    @m
    private com.vungle.ads.internal.presenter.a bus;
    @l
    private final D clickCoordinateTracker$delegate;
    @l
    private static final Map eventMap;
    @l
    private Executor executor;
    @l
    private final D executors$delegate;
    private boolean heartbeatEnabled;
    @l
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;
    @l
    private final D logEntry$delegate;
    @l
    private final com.vungle.ads.internal.omsdk.e omTracker;
    @l
    private final D pathProvider$delegate;
    @l
    private final com.vungle.ads.internal.model.m placement;
    @l
    private final d platform;
    @m
    private p presenterDelegate;
    @l
    private final D scheduler$delegate;
    @l
    private final AtomicBoolean sendReportIncentivized;
    @l
    private final D signalManager$delegate;
    @l
    private final D suspendableTimer$delegate;
    @m
    private String userId;
    private long videoLength;
    @l
    private final D vungleApiClient$delegate;
    @l
    private final h vungleWebClient;

    static {
        k.Companion = new com.vungle.ads.internal.presenter.k.a(null);
        k.eventMap = Y.W(new V[]{r0.a("checkpoint.0", com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_START_EVENT), r0.a("clickUrl", com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_CLICK_EVENT)});
    }

    public k(@l com.vungle.ads.internal.ui.view.b b0, @l com.vungle.ads.internal.model.b b1, @l com.vungle.ads.internal.model.m m0, @l h h0, @l Executor executor0, @l com.vungle.ads.internal.omsdk.e e0, @m e e1, @l d d0) {
        static final class com.vungle.ads.internal.presenter.k.b extends N implements A3.a {
            com.vungle.ads.internal.presenter.k.b(k k0) {
                k.this = k0;
                super(0);
            }

            @l
            public final j invoke() {
                Context context0 = k.this.adWidget.getContext();
                L.o(context0, "adWidget.context");
                return new j(context0, k.this.advertisement, k.this.executor);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        static final class c extends N implements A3.a {
            c(k k0) {
                k.this = k0;
                super(0);
            }

            @m
            public final o invoke() {
                return k.this.advertisement.getLogEntry$vungle_ads_release();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        static final class f extends N implements A3.a {
            public static final f INSTANCE;

            static {
                f.INSTANCE = new f();
            }

            f() {
                super(0);
            }

            @l
            public final i invoke() {
                return new i();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
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
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


        public static final class com.vungle.ads.internal.presenter.k.h extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.presenter.k.h(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }


        public static final class com.vungle.ads.internal.presenter.k.i extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.presenter.k.i(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
            }
        }


        public static final class com.vungle.ads.internal.presenter.k.j extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.presenter.k.j(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.c.class);
            }
        }


        static final class com.vungle.ads.internal.presenter.k.k extends N implements A3.a {
            com.vungle.ads.internal.presenter.k.k(k k0) {
                k.this = k0;
                super(0);
            }

            @l
            public final u invoke() {
                static final class com.vungle.ads.internal.presenter.k.k.a extends N implements A3.a {
                    com.vungle.ads.internal.presenter.k.k.a(k k0) {
                        k.this = k0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        d1 d10 = new d0().setLogEntry$vungle_ads_release(k.this.getLogEntry()).logError$vungle_ads_release();
                        k.this.reportErrorAndCloseAd(d10);
                    }
                }

                return new u(6.0, true, null, new com.vungle.ads.internal.presenter.k.k.a(k.this), 4, null);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        L.p(b0, "adWidget");
        L.p(b1, "advertisement");
        L.p(m0, "placement");
        L.p(h0, "vungleWebClient");
        L.p(executor0, "executor");
        L.p(e0, "omTracker");
        L.p(d0, "platform");
        super();
        this.adWidget = b0;
        this.advertisement = b1;
        this.placement = m0;
        this.vungleWebClient = h0;
        this.executor = executor0;
        this.omTracker = e0;
        this.bidPayload = e1;
        this.platform = d0;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        Context context0 = b0.getContext();
        L.o(context0, "adWidget.context");
        g k$g0 = new g(context0);
        this.vungleApiClient$delegate = E.c(H.a, k$g0);
        Context context1 = b0.getContext();
        L.o(context1, "adWidget.context");
        com.vungle.ads.internal.presenter.k.h k$h0 = new com.vungle.ads.internal.presenter.k.h(context1);
        this.executors$delegate = E.c(H.a, k$h0);
        Context context2 = b0.getContext();
        L.o(context2, "adWidget.context");
        com.vungle.ads.internal.presenter.k.i k$i0 = new com.vungle.ads.internal.presenter.k.i(context2);
        this.pathProvider$delegate = E.c(H.a, k$i0);
        Context context3 = b0.getContext();
        L.o(context3, "adWidget.context");
        com.vungle.ads.internal.presenter.k.j k$j0 = new com.vungle.ads.internal.presenter.k.j(context3);
        this.signalManager$delegate = E.c(H.a, k$j0);
        this.scheduler$delegate = E.a(f.INSTANCE);
        this.logEntry$delegate = E.a(new c(this));
        this.suspendableTimer$delegate = E.a(new com.vungle.ads.internal.presenter.k.k(this));
        this.clickCoordinateTracker$delegate = E.a(new com.vungle.ads.internal.presenter.k.b(this));
    }

    private final void closeView() {
        Long long0 = this.adStartTime;
        if(long0 != null) {
            com.vungle.ads.internal.network.j j0 = new com.vungle.ads.internal.network.j(this.getVungleApiClient$vungle_ads_release(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
            String s = String.valueOf(this.platform.getVolumeLevel());
            List list0 = this.advertisement.getTpatUrls("ad.close", String.valueOf(System.currentTimeMillis() - long0.longValue()), s);
            if(list0 != null) {
                j0.sendTpats(list0, this.executor);
            }
        }
        com.vungle.ads.internal.presenter.d d0 = () -> {
            L.p(this, "this$0");
            this.adWidget.close();
        };
        v.INSTANCE.runOnUiThread(d0);
    }

    // 检测为 Lambda 实现
    private static final void closeView$lambda-3(k k0) [...]

    public final void detach(@com.vungle.ads.internal.ui.view.b.a int v) {
        com.vungle.ads.internal.util.p.Companion.d("MRAIDPresenter", "detach()");
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if((v & 1) == 0 && (v & 2) != 0 && !this.isDestroying.getAndSet(true)) {
            com.vungle.ads.internal.presenter.a a0 = this.bus;
            if(a0 != null) {
                a0.onNext("end", null, this.placement.getReferenceId());
            }
        }
        long v1 = this.omTracker.stop();
        this.adWidget.destroyWebView(v1);
        if(this.heartbeatEnabled) {
            this.getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    @m
    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    @VisibleForTesting
    public static void getAdStartTime$vungle_ads_release$annotations() {
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    @VisibleForTesting
    public static void getBackEnabled$vungle_ads_release$annotations() {
    }

    @m
    public final com.vungle.ads.internal.presenter.a getBus() {
        return this.bus;
    }

    @VisibleForTesting
    public static void getBus$annotations() {
    }

    @l
    public final j getClickCoordinateTracker$vungle_ads_release() {
        return (j)this.clickCoordinateTracker$delegate.getValue();
    }

    @VisibleForTesting
    public static void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a)this.executors$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    @VisibleForTesting
    public static void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    public final long getLastUserInteractionTimestamp$vungle_ads_release() {
        return this.lastUserInteractionTimestamp;
    }

    @VisibleForTesting
    public static void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    private final o getLogEntry() {
        return (o)this.logEntry$delegate.getValue();
    }

    private final q getPathProvider() {
        return (q)this.pathProvider$delegate.getValue();
    }

    private final i getScheduler() {
        return (i)this.scheduler$delegate.getValue();
    }

    private final com.vungle.ads.internal.signals.c getSignalManager() {
        return (com.vungle.ads.internal.signals.c)this.signalManager$delegate.getValue();
    }

    @l
    public final u getSuspendableTimer$vungle_ads_release() {
        return (u)this.suspendableTimer$delegate.getValue();
    }

    @VisibleForTesting
    public static void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    @m
    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @VisibleForTesting
    public static void getUserId$vungle_ads_release$annotations() {
    }

    public final long getVideoLength$vungle_ads_release() {
        return this.videoLength;
    }

    @VisibleForTesting
    public static void getVideoLength$vungle_ads_release$annotations() {
    }

    @l
    public final com.vungle.ads.internal.network.l getVungleApiClient$vungle_ads_release() {
        return (com.vungle.ads.internal.network.l)this.vungleApiClient$delegate.getValue();
    }

    @VisibleForTesting
    public static void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public final void handleExit() {
        if(this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    private final void handleWebViewException(d1 d10, boolean z, String s) {
        com.vungle.ads.internal.util.p.Companion.e("MRAIDPresenter", "handleWebViewException: " + d10.getLocalizedMessage() + ", fatal: " + z + ", errorMsg: " + s);
        if(z) {
            this.makeBusError(d10);
            this.closeView();
        }
    }

    static void handleWebViewException$default(k k0, d1 d10, boolean z, String s, int v, Object object0) {
        if((v & 4) != 0) {
            s = null;
        }
        k0.handleWebViewException(d10, z, s);
    }

    @l
    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    @VisibleForTesting
    public static void isDestroying$vungle_ads_release$annotations() {
    }

    private final boolean loadMraidAd(File file0) {
        File file1 = new File(file0.getPath(), "index.html");
        if(!file1.exists()) {
            new e0(com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_HTML_FAILED_TO_LOAD, "Fail to load html " + file1.getPath()).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            return false;
        }
        this.adWidget.showWebsite("file://" + file1.getPath());
        return true;
    }

    private final void makeBusError(d1 d10) {
        com.vungle.ads.internal.presenter.a a0 = this.bus;
        if(a0 != null) {
            a0.onError(d10, this.placement.getReferenceId());
        }
    }

    @Override  // com.vungle.ads.internal.ui.view.c$b
    public void onReceivedError(@l String s, boolean z) {
        L.p(s, "errorDesc");
        if(z) {
            this.reportErrorAndCloseAd(new f1(s).setLogEntry$vungle_ads_release(this.getLogEntry()).logError$vungle_ads_release());
        }
    }

    @Override  // com.vungle.ads.internal.ui.view.c$b
    public void onRenderProcessUnresponsive(@m WebView webView0, @m WebViewRenderProcess webViewRenderProcess0) {
        k.handleWebViewException$default(this, new g1("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(@m MotionEvent motionEvent0) {
        if(motionEvent0 != null) {
            com.vungle.ads.internal.util.p.Companion.d("MRAIDPresenter", "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            this.getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent0);
        }
    }

    @Override  // com.vungle.ads.internal.ui.view.c$b
    public boolean onWebRenderingProcessGone(@m WebView webView0, @m Boolean boolean0) {
        boolean z = boolean0 == null ? true : boolean0.booleanValue();
        k.handleWebViewException$default(this, new h1("didCrash=" + z), z, null, 4, null);
        return true;
    }

    public final void prepare() {
        String s3;
        String s2;
        String s1;
        String s;
        int v1;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        com.vungle.ads.d d0 = this.advertisement.getAdConfig();
        if(d0 != null) {
            int v = d0.getSettings();
            if(v > 0) {
                this.backEnabled = (v & 2) == 2;
            }
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        com.vungle.ads.d d1 = this.advertisement.getAdConfig();
        Integer integer0 = d1 == null ? null : d1.getAdOrientation();
        if(integer0 == null || ((int)integer0) != 0) {
            v1 = integer0 == null || ((int)integer0) != 1 ? 4 : 6;
        }
        else {
            v1 = 7;
        }
        this.adWidget.setOrientation(v1);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File file0 = this.advertisement.getAssetDirectory();
        if(file0 != null && file0.exists()) {
            if(!this.loadMraidAd(file0)) {
                this.reportErrorAndCloseAd(new com.vungle.ads.i("ad index html not exists.").setLogEntry$vungle_ads_release(this.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            this.adStartTime = System.currentTimeMillis();
            this.userId = this.presenterDelegate == null ? null : this.presenterDelegate.getUserId();
            p p0 = this.presenterDelegate;
            if(p0 == null) {
                s = "";
            }
            else {
                s = p0.getAlertTitleText();
                if(s == null) {
                    s = "";
                }
            }
            p p1 = this.presenterDelegate;
            if(p1 == null) {
                s1 = "";
            }
            else {
                s1 = p1.getAlertBodyText();
                if(s1 == null) {
                    s1 = "";
                }
            }
            p p2 = this.presenterDelegate;
            if(p2 == null) {
                s2 = "";
            }
            else {
                s2 = p2.getAlertContinueButtonText();
                if(s2 == null) {
                    s2 = "";
                }
            }
            p p3 = this.presenterDelegate;
            if(p3 == null) {
                s3 = "";
            }
            else {
                s3 = p3.getAlertCloseButtonText();
                if(s3 == null) {
                    s3 = "";
                }
            }
            this.advertisement.setIncentivizedText(s, s1, s2, s3);
            String s4 = com.vungle.ads.internal.k.INSTANCE.getGDPRConsentTitle();
            String s5 = com.vungle.ads.internal.k.INSTANCE.getGDPRConsentMessage();
            String s6 = com.vungle.ads.internal.k.INSTANCE.getGDPRButtonAccept();
            String s7 = com.vungle.ads.internal.k.INSTANCE.getGDPRButtonDeny();
            this.vungleWebClient.setConsentStatus(false, s4, s5, s6, s7);
            Boolean boolean0 = Boolean.valueOf(this.placement.isRewardedVideo());
            int v2 = this.advertisement.getShowCloseDelay(boolean0);
            if(v2 > 0) {
                this.getScheduler().schedule(() -> {
                    L.p(this, "this$0");
                    this.backEnabled = true;
                }, ((long)v2));
            }
            else {
                this.backEnabled = true;
            }
            com.vungle.ads.internal.presenter.a a0 = this.bus;
            if(a0 != null) {
                a0.onNext("start", null, this.placement.getReferenceId());
            }
            if(this.heartbeatEnabled) {
                this.getSuspendableTimer$vungle_ads_release().start();
            }
            if(this.advertisement.adLoadOptimizationEnabled()) {
                this.recordPlayAssetMetric();
            }
            return;
        }
        this.reportErrorAndCloseAd(new com.vungle.ads.i("adv dir not exists.").setLogEntry$vungle_ads_release(this.getLogEntry()).logError$vungle_ads_release());
    }

    // 检测为 Lambda 实现
    private static final void prepare$lambda-16(k k0) [...]

    @Override  // com.vungle.ads.internal.ui.view.c$a
    public boolean processCommand(@l String s, @l y y0) {
        public static final class com.vungle.ads.internal.presenter.k.e implements com.vungle.ads.internal.ui.b {
            final String $deeplinkUrl;

            com.vungle.ads.internal.presenter.k.e(String s, k k0) {
                this.$deeplinkUrl = s;
                k.this = k0;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.b
            public void onDeeplinkClick(boolean z) {
                if(!z) {
                    new s0(com.vungle.ads.internal.protos.Sdk.SDKError.b.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(k.this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                List list0 = com.vungle.ads.internal.model.b.getTpatUrls$default(k.this.advertisement, "deeplink.click", String.valueOf(z), null, 4, null);
                com.vungle.ads.internal.network.j j0 = new com.vungle.ads.internal.network.j(k.this.getVungleApiClient$vungle_ads_release(), k.this.getLogEntry(), k.this.getExecutors().getIoExecutor(), k.this.getPathProvider(), k.this.getSignalManager());
                if(list0 != null) {
                    k k0 = k.this;
                    for(Object object0: list0) {
                        j0.sendTpat(((String)object0), k0.executor);
                    }
                }
            }
        }

        List list1;
        String s6;
        float f;
        Long long0;
        Class class0 = String.class;
        L.p(s, "command");
        L.p(y0, "arguments");
        Handler handler0 = new Handler(Looper.getMainLooper());
        long v = 0L;
        String s1 = null;
        switch(s) {
            case "action": {
                return true;
            }
            case "actionWithValue": {
                String s2 = n.INSTANCE.getContentStringValue(y0, "event");
                String s3 = n.INSTANCE.getContentStringValue(y0, "value");
                if(kotlin.text.v.O1("videoLength", s2, true)) {
                    try {
                        long0 = s3 == null ? null : Long.parseLong(s3);
                    }
                    catch(Throwable throwable0) {
                        long0 = kotlin.e0.b(f0.a(throwable0));
                    }
                    if(kotlin.e0.i(long0)) {
                        long0 = null;
                    }
                    if(long0 != null) {
                        v = (long)long0;
                    }
                    this.videoLength = v;
                }
                if(kotlin.text.v.O1("videoViewed", s2, true)) {
                    if(s3 == null) {
                        f = 0.0f;
                    }
                    else {
                        try {
                            f = Float.parseFloat(s3);
                        }
                        catch(NumberFormatException unused_ex) {
                            com.vungle.ads.internal.util.p.Companion.e("MRAIDPresenter", "value for videoViewed is null !");
                            f = 0.0f;
                        }
                    }
                    com.vungle.ads.internal.presenter.a a1 = this.bus;
                    if(a1 != null && f > 0.0f && !this.adViewed) {
                        this.adViewed = true;
                        if(a1 != null) {
                            a1.onNext("adViewed", null, this.placement.getReferenceId());
                        }
                        e e0 = this.bidPayload;
                        if(e0 != null) {
                            com.vungle.ads.internal.network.j j0 = new com.vungle.ads.internal.network.j(this.getVungleApiClient$vungle_ads_release(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
                            List list0 = e0.getImpression();
                            if(list0 != null) {
                                for(Object object0: list0) {
                                    j0.sendTpat(((String)object0), this.executor);
                                }
                            }
                        }
                    }
                }
                handler0.post(() -> {
                    L.p(this, "this$0");
                    this.adWidget.setVisibility(0);
                });
                return true;
            }
            case "close": {
                this.closeView();
                return true;
            }
            case "consentAction": {
                String s4 = L.g(n.INSTANCE.getContentStringValue(y0, "event"), "opted_out") ? "opted_out" : "opted_in";
                V2.c.INSTANCE.updateGdprConsent(s4, "vungle_modal", null);
                return true;
            }
            case "creativeHeartbeat": {
                if(this.heartbeatEnabled) {
                    handler0.post(() -> {
                        L.p(this, "this$0");
                        this.getSuspendableTimer$vungle_ads_release().reset();
                    });
                }
                return true;
            }
            case "error": {
                String s17 = n.INSTANCE.getContentStringValue(y0, "code");
                boolean z2 = Boolean.parseBoolean(n.INSTANCE.getContentStringValue(y0, "fatal"));
                String s18 = s17 + " : " + n.INSTANCE.getContentStringValue(y0, "errorMessage");
                com.vungle.ads.internal.presenter.g g0 = () -> {
                    L.p(this, "this$0");
                    L.p(new v0((z2 ? com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_CLOSED_TEMPLATE_ERROR : com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_ERROR), s18).setLogEntry$vungle_ads_release(this.getLogEntry()).logError$vungle_ads_release(), "$exception");
                    L.p(s18, "$message");
                    this.handleWebViewException(new v0((z2 ? com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_CLOSED_TEMPLATE_ERROR : com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_ERROR), s18).setLogEntry$vungle_ads_release(this.getLogEntry()).logError$vungle_ads_release(), z2, s18);
                };
                v.INSTANCE.runOnUiThread(g0);
                return true;
            }
            case "getAvailableDiskSpace": {
                try {
                    File file0 = this.adWidget.getContext().getNoBackupFilesDir();
                    q q0 = this.getPathProvider();
                    String s22 = file0.getPath();
                    L.o(s22, "dir.path");
                    handler0.post(() -> {
                        L.p(this, "this$0");
                        this.vungleWebClient.notifyDiskAvailableSize(q0.getAvailableBytes(s22));
                    });
                }
                catch(Exception unused_ex) {
                    com.vungle.ads.internal.util.p.Companion.e("MRAIDPresenter", "Failed to get available disk space");
                }
                return true;
            }
            case "open": 
            case "openNonMraid": {
                com.vungle.ads.internal.model.b.c b$c0 = this.advertisement.adUnit();
                if(b$c0 != null) {
                    s1 = b$c0.getDeeplinkUrl();
                }
                String s13 = n.INSTANCE.getContentStringValue(y0, "url");
                if(this.shouldBlockAutoRedirect$vungle_ads_release()) {
                    this.lastUserInteractionTimestamp = 0L;
                    W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BANNER_AUTO_REDIRECT);
                    o o0 = this.getLogEntry();
                    r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, o0, null, 4, null);
                    return true;
                }
                this.lastUserInteractionTimestamp = 0L;
                Context context1 = this.adWidget.getContext();
                L.o(context1, "adWidget.context");
                boolean z1 = com.vungle.ads.internal.util.e.launch(s1, s13, context1, this.getLogEntry(), new com.vungle.ads.internal.presenter.k.e(s1, this));
                com.vungle.ads.internal.presenter.a a3 = this.bus;
                if(a3 != null) {
                    a3.onNext("open", "adClick", this.placement.getReferenceId());
                }
                if(z1) {
                    com.vungle.ads.internal.presenter.a a4 = this.bus;
                    if(a4 != null) {
                        a4.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                    }
                }
                return true;
            }
            case "openPrivacy": {
                String s12 = n.INSTANCE.getContentStringValue(y0, "url");
                if(s12 != null && s12.length() != 0 && com.vungle.ads.internal.util.h.INSTANCE.isValidUrl(s12)) {
                    Context context0 = this.adWidget.getContext();
                    L.o(context0, "adWidget.context");
                    if(com.vungle.ads.internal.util.e.launch$default(null, s12, context0, this.getLogEntry(), null, 16, null)) {
                        com.vungle.ads.internal.presenter.a a2 = this.bus;
                        if(a2 != null) {
                            a2.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                            return true;
                        }
                    }
                    else {
                        new Q0(s12).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    return true;
                }
                if(s12 == null) {
                    s12 = "nonePrivacyUrl";
                }
                new Q0(s12).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return true;
            }
            case "pingUrl": {
                n n0 = n.INSTANCE;
                String s5 = n0.getContentStringValue(y0, "requestType");
                if(s5 == null) {
                    s6 = null;
                }
                else {
                    s6 = s5.toUpperCase(Locale.ROOT);
                    L.o(s6, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                if(!kotlin.collections.u.W1(kotlin.collections.u.O(new String[]{"GET", "POST"}), s6)) {
                    new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR, "Invalid request type: " + s6 + ". Only \'GET\' and \'POST\' are supported").setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return true;
                }
                String s7 = n0.getContentStringValue(y0, "url");
                String s8 = n0.getContentStringValue(y0, "requestData");
                boolean z = Boolean.parseBoolean(n0.getContentStringValue(y0, "retry"));
                String s9 = n0.getContentStringValue(y0, "headers");
                if(s9 != null) {
                    try {
                        kotlinx.serialization.modules.f f1 = kotlinx.serialization.json.b.d.a();
                        s s10 = m0.A(class0);
                        kotlin.reflect.u u0 = kotlin.reflect.u.c.e(s10);
                        s s11 = m0.A(class0);
                        kotlin.reflect.u u1 = kotlin.reflect.u.c.e(s11);
                        kotlinx.serialization.i i0 = z.k(f1, m0.C(Map.class, u0, u1));
                        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                        s1 = (Map)kotlinx.serialization.json.b.d.d(i0, s9);
                    }
                    catch(Exception unused_ex) {
                        new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR, "Failed to decode header: " + s9).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return true;
                    }
                }
                if(!x.INSTANCE.isUrlValid(s7)) {
                    new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return true;
                }
                if(s7 != null) {
                    new com.vungle.ads.internal.network.j(this.getVungleApiClient$vungle_ads_release(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager()).sendGenericTpat(s7, new com.vungle.ads.internal.network.c((L.g(s6, "GET") ? com.vungle.ads.internal.network.d.GET : com.vungle.ads.internal.network.d.POST), ((Map)s1), s8, 0, 8, null), z, this.executor);
                }
                return true;
            }
            case "setOrientationProperties": {
                String s19 = n.INSTANCE.getContentStringValue(y0, "forceOrientation");
                if(s19 != null && s19.length() != 0) {
                    Locale locale0 = Locale.ENGLISH;
                    L.o(locale0, "ENGLISH");
                    String s20 = s19.toLowerCase(locale0);
                    L.o(s20, "this as java.lang.String).toLowerCase(locale)");
                    if(L.g(s20, "landscape")) {
                        this.adWidget.setOrientation(6);
                        return true;
                    }
                    if(L.g(s20, "portrait")) {
                        this.adWidget.setOrientation(7);
                    }
                }
                return true;
            }
            case "successfulView": {
                com.vungle.ads.internal.presenter.a a0 = this.bus;
                if(a0 != null) {
                    a0.onNext("successfulView", null, this.placement.getReferenceId());
                }
                if(this.placement.isRewardedVideo() && false && !this.sendReportIncentivized.getAndSet(true)) {
                    this.executor.execute(() -> {
                        public static final class com.vungle.ads.internal.presenter.k.d implements com.vungle.ads.internal.network.b {
                            com.vungle.ads.internal.presenter.k.d(k k0) {
                                k.this = k0;
                                super();
                            }

                            @Override  // com.vungle.ads.internal.network.b
                            public void onFailure(@m com.vungle.ads.internal.network.a a0, @m Throwable throwable0) {
                                com.vungle.ads.internal.util.p.Companion.d("MRAIDPresenter", "send RI Failure");
                                new J0("Error RI API calls: " + (throwable0 == null ? null : throwable0.getLocalizedMessage())).setLogEntry$vungle_ads_release(k.this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                            }

                            @Override  // com.vungle.ads.internal.network.b
                            public void onResponse(@m com.vungle.ads.internal.network.a a0, @m com.vungle.ads.internal.network.f f0) {
                                com.vungle.ads.internal.util.p.Companion.d("MRAIDPresenter", "send RI success");
                            }
                        }

                        L.p(this, "this$0");
                        String s = this.advertisement.advAppId();
                        com.vungle.ads.internal.model.f.i f$i0 = new com.vungle.ads.internal.model.f.i(null, null, this.adStartTime, s, this.placement.getReferenceId(), this.userId, 3, null);
                        com.vungle.ads.internal.network.a a0 = this.getVungleApiClient$vungle_ads_release().ri(f$i0);
                        if(a0 == null) {
                            com.vungle.ads.internal.util.p.Companion.e("MRAIDPresenter", "Invalid ri call.");
                            new J0("Error RI API for placement: " + this.placement.getReferenceId()).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                            return;
                        }
                        a0.enqueue(new com.vungle.ads.internal.presenter.k.d(this));
                    });
                }
                return true;
            }
            case "tpat": {
                String s14 = n.INSTANCE.getContentStringValue(y0, "event");
                if(s14 != null && s14.length() != 0) {
                    this.triggerEventMetricForTpat(s14);
                    com.vungle.ads.internal.network.j j1 = new com.vungle.ads.internal.network.j(this.getVungleApiClient$vungle_ads_release(), this.getLogEntry(), this.getExecutors().getIoExecutor(), this.getPathProvider(), this.getSignalManager());
                    if(L.g(s14, "checkpoint.0")) {
                        String s15 = this.platform.getCarrierName();
                        String s16 = String.valueOf(this.platform.getVolumeLevel());
                        list1 = this.advertisement.getTpatUrls(s14, s15, s16);
                    }
                    else {
                        list1 = L.g(s14, "{{{vlen}}}") ? com.vungle.ads.internal.model.b.getTpatUrls$default(this.advertisement, s14, String.valueOf(this.videoLength), null, 4, null) : com.vungle.ads.internal.model.b.getTpatUrls$default(this.advertisement, s14, null, null, 6, null);
                    }
                    if(list1 != null) {
                        j1.sendTpats(list1, this.executor);
                    }
                    return true;
                }
                new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return true;
            }
            case "updateSignals": {
                String s21 = n.INSTANCE.getContentStringValue(y0, "signals");
                if(s21 != null && s21.length() != 0) {
                    this.getSignalManager().updateTemplateSignals(s21);
                }
                return true;
            }
            case "useCustomClose": {
                return true;
            }
            case "useCustomPrivacy": {
                return true;
            }
            default: {
                new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + s).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.p.Companion.w("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + s);
                return true;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void processCommand$lambda-11(k k0) [...]

    // 检测为 Lambda 实现
    private static final void processCommand$lambda-12(k k0, d1 d10, boolean z, String s) [...]

    // 检测为 Lambda 实现
    private static final void processCommand$lambda-13(k k0) [...]

    // 检测为 Lambda 实现
    private static final void processCommand$lambda-14(k k0, long v) [...]

    // 检测为 Lambda 实现
    private static final void processCommand$lambda-7(k k0) [...]

    private final void recordPlayAssetMetric() {
        W0 w00 = new W0((this.advertisement.getAssetsFullyDownloaded() ? com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LOCAL_ASSETS_USED : com.vungle.ads.internal.protos.Sdk.SDKMetric.b.REMOTE_ASSETS_USED));
        o o0 = this.getLogEntry();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, o0, null, 4, null);
    }

    private final void reportErrorAndCloseAd(d1 d10) {
        this.makeBusError(d10);
        this.closeView();
    }

    public final void setAdStartTime$vungle_ads_release(@m Long long0) {
        this.adStartTime = long0;
    }

    public final void setAdVisibility(boolean z) {
        this.vungleWebClient.setAdVisibility(z);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z) {
        this.backEnabled = z;
    }

    public final void setBus(@m com.vungle.ads.internal.presenter.a a0) {
        this.bus = a0;
    }

    public final void setEventListener(@m com.vungle.ads.internal.presenter.a a0) {
        this.bus = a0;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z) {
        this.heartbeatEnabled = z;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long v) {
        this.lastUserInteractionTimestamp = v;
    }

    public final void setPresenterDelegate$vungle_ads_release(@m p p0) {
        this.presenterDelegate = p0;
    }

    public final void setUserId$vungle_ads_release(@m String s) {
        this.userId = s;
    }

    public final void setVideoLength$vungle_ads_release(long v) {
        this.videoLength = v;
    }

    // 去混淆评级： 低(30)
    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        if(this.placement.isBanner() || this.placement.isMREC() || this.placement.isInline()) {
            return this.lastUserInteractionTimestamp == 0L ? true : System.currentTimeMillis() - this.lastUserInteractionTimestamp > 0x7FFFFFFFFFFFFFFFL;
        }
        return false;
    }

    public final void start() {
        com.vungle.ads.internal.util.p.Companion.d("MRAIDPresenter", "start()");
        this.adWidget.resumeWeb();
        this.setAdVisibility(true);
    }

    public final void stop() {
        com.vungle.ads.internal.util.p.Companion.d("MRAIDPresenter", "stop()");
        this.adWidget.pauseWeb();
        this.setAdVisibility(false);
    }

    private final void triggerEventMetricForTpat(String s) {
        com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0 = (com.vungle.ads.internal.protos.Sdk.SDKMetric.b)k.eventMap.get(s);
        if(sdk$SDKMetric$b0 != null) {
            W0 w00 = new W0(sdk$SDKMetric$b0);
            o o0 = this.getLogEntry();
            r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, o0, null, 4, null);
        }
    }
}

