package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.O0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.U0;
import com.vungle.ads.VungleAds;
import com.vungle.ads.W0;
import com.vungle.ads.X;
import com.vungle.ads.Y0;
import com.vungle.ads.b1;
import com.vungle.ads.d1;
import com.vungle.ads.i0;
import com.vungle.ads.i;
import com.vungle.ads.internal.task.g;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.l0;
import com.vungle.ads.q0;
import com.vungle.ads.r;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.J;
import kotlin.K;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import y4.l;
import y4.m;

public abstract class a implements com.vungle.ads.internal.load.a {
    public static abstract enum com.vungle.ads.internal.a.a {
        static final class com.vungle.ads.internal.a.a.a extends com.vungle.ads.internal.a.a {
            com.vungle.ads.internal.a.a.a(String s, int v) {
                super(null);
            }

            @Override  // com.vungle.ads.internal.a$a
            public boolean canTransitionTo(@l com.vungle.ads.internal.a.a a$a0) {
                L.p(a$a0, "adState");
                return a$a0 == com.vungle.ads.internal.a.a.FINISHED;
            }
        }

        static final class b extends com.vungle.ads.internal.a.a {
            b(String s, int v) {
                super(null);
            }

            @Override  // com.vungle.ads.internal.a$a
            public boolean canTransitionTo(@l com.vungle.ads.internal.a.a a$a0) {
                L.p(a$a0, "adState");
                return false;
            }
        }

        static final class c extends com.vungle.ads.internal.a.a {
            c(String s, int v) {
                super(null);
            }

            @Override  // com.vungle.ads.internal.a$a
            public boolean canTransitionTo(@l com.vungle.ads.internal.a.a a$a0) {
                L.p(a$a0, "adState");
                return a$a0 == com.vungle.ads.internal.a.a.READY || a$a0 == com.vungle.ads.internal.a.a.ERROR;
            }
        }

        static final class d extends com.vungle.ads.internal.a.a {
            d(String s, int v) {
                super(null);
            }

            @Override  // com.vungle.ads.internal.a$a
            public boolean canTransitionTo(@l com.vungle.ads.internal.a.a a$a0) {
                L.p(a$a0, "adState");
                return a$a0 == com.vungle.ads.internal.a.a.LOADING || a$a0 == com.vungle.ads.internal.a.a.READY || a$a0 == com.vungle.ads.internal.a.a.ERROR;
            }
        }

        static final class e extends com.vungle.ads.internal.a.a {
            e(String s, int v) {
                super(null);
            }

            @Override  // com.vungle.ads.internal.a$a
            public boolean canTransitionTo(@l com.vungle.ads.internal.a.a a$a0) {
                L.p(a$a0, "adState");
                return a$a0 == com.vungle.ads.internal.a.a.FINISHED || a$a0 == com.vungle.ads.internal.a.a.ERROR;
            }
        }

        static final class f extends com.vungle.ads.internal.a.a {
            f(String s, int v) {
                super(null);
            }

            @Override  // com.vungle.ads.internal.a$a
            public boolean canTransitionTo(@l com.vungle.ads.internal.a.a a$a0) {
                L.p(a$a0, "adState");
                return a$a0 == com.vungle.ads.internal.a.a.PLAYING || a$a0 == com.vungle.ads.internal.a.a.FINISHED || a$a0 == com.vungle.ads.internal.a.a.ERROR;
            }
        }

        NEW /* 警告！未生成枚举子类：com.vungle.ads.internal.a$a$d */,
        LOADING /* 警告！未生成枚举子类：com.vungle.ads.internal.a$a$c */,
        READY /* 警告！未生成枚举子类：com.vungle.ads.internal.a$a$f */,
        PLAYING /* 警告！未生成枚举子类：com.vungle.ads.internal.a$a$e */,
        FINISHED /* 警告！未生成枚举子类：com.vungle.ads.internal.a$a$b */,
        ERROR /* 警告！未生成枚举子类：com.vungle.ads.internal.a$a$a */;

        private static final com.vungle.ads.internal.a.a[] $values() [...] // Inlined contents

        private com.vungle.ads.internal.a.a() {
        }

        public com.vungle.ads.internal.a.a(w w0) {
            this();
        }

        public abstract boolean canTransitionTo(@l com.vungle.ads.internal.a.a arg1);

        public final boolean isTerminalState() {
            return u.O(new com.vungle.ads.internal.a.a[]{com.vungle.ads.internal.a.a.FINISHED, com.vungle.ads.internal.a.a.ERROR}).contains(this);
        }

        @l
        public final com.vungle.ads.internal.a.a transitionTo(@l com.vungle.ads.internal.a.a a$a0) {
            L.p(a$a0, "adState");
            if(this != a$a0 && !this.canTransitionTo(a$a0)) {
                String s = "Cannot transition from " + this.name() + " to " + a$a0.name();
                if(a.THROW_ON_ILLEGAL_TRANSITION) {
                    throw new IllegalStateException(s);
                }
                IllegalStateException illegalStateException0 = new IllegalStateException(s);
                p.Companion.e("AdInternal", "Illegal state transition", illegalStateException0);
                return a$a0;
            }
            return a$a0;
        }
    }

    static final class com.vungle.ads.internal.a.b extends N implements Function1 {
        public static final com.vungle.ads.internal.a.b INSTANCE;

        static {
            com.vungle.ads.internal.a.b.INSTANCE = new com.vungle.ads.internal.a.b();
        }

        com.vungle.ads.internal.a.b() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.invoke(((kotlinx.serialization.json.f)object0));
            return S0.a;
        }

        public final void invoke(@l kotlinx.serialization.json.f f0) {
            L.p(f0, "$this$Json");
            f0.w(true);
            f0.u(true);
            f0.v(false);
        }
    }

    public static final class com.vungle.ads.internal.a.c {
        private com.vungle.ads.internal.a.c() {
        }

        public com.vungle.ads.internal.a.c(w w0) {
        }

        private static void getJson$annotations() {
        }
    }

    public final class com.vungle.ads.internal.a.d {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[com.vungle.ads.internal.a.a.values().length];
            arr_v[com.vungle.ads.internal.a.a.NEW.ordinal()] = 1;
            arr_v[com.vungle.ads.internal.a.a.LOADING.ordinal()] = 2;
            arr_v[com.vungle.ads.internal.a.a.READY.ordinal()] = 3;
            arr_v[com.vungle.ads.internal.a.a.PLAYING.ordinal()] = 4;
            arr_v[com.vungle.ads.internal.a.a.FINISHED.ordinal()] = 5;
            arr_v[com.vungle.ads.internal.a.a.ERROR.ordinal()] = 6;
            com.vungle.ads.internal.a.d.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    public static final com.vungle.ads.internal.a.c Companion = null;
    @l
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION;
    @m
    private com.vungle.ads.internal.load.a adLoaderCallback;
    @l
    private com.vungle.ads.internal.a.a adState;
    @m
    private com.vungle.ads.internal.model.b advertisement;
    @m
    private com.vungle.ads.internal.load.d baseAdLoader;
    @m
    private com.vungle.ads.internal.model.e bidPayload;
    @l
    private final Context context;
    @l
    private static final kotlinx.serialization.json.b json;
    @m
    private Y0 loadMetric;
    @m
    private o logEntry;
    @m
    private com.vungle.ads.internal.model.m placement;
    @m
    private WeakReference playContext;
    @m
    private Y0 requestMetric;
    @l
    private final Y0 showToValidationMetric;
    @l
    private final D signalManager$delegate;
    @l
    private final Y0 validationToPresentMetric;
    @l
    private final D vungleApiClient$delegate;

    static {
        a.Companion = new com.vungle.ads.internal.a.c(null);
        a.json = s.b(null, com.vungle.ads.internal.a.b.INSTANCE, 1, null);
    }

    public a(@l Context context0) {
        public static final class n extends N implements A3.a {
            final Context $context;

            public n(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


        public static final class com.vungle.ads.internal.a.o extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.a.o(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.c.class);
            }
        }

        L.p(context0, "context");
        super();
        this.context = context0;
        this.adState = com.vungle.ads.internal.a.a.NEW;
        n a$n0 = new n(context0);
        this.vungleApiClient$delegate = E.c(H.a, a$n0);
        this.showToValidationMetric = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        com.vungle.ads.internal.a.o a$o0 = new com.vungle.ads.internal.a.o(context0);
        this.signalManager$delegate = E.c(H.a, a$o0);
    }

    private static final g _set_adState_$lambda-1$lambda-0(D d0) {
        return (g)d0.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(@l com.vungle.ads.internal.model.b b0) {
        L.p(b0, "advertisement");
    }

    @m
    public final d1 canPlayAd(boolean z) {
        d1 d10;
        com.vungle.ads.internal.model.b b0 = this.advertisement;
        if(b0 == null) {
            d10 = new i("adv is null on onPlay=" + z);
        }
        else {
            if(b0 != null && b0.hasExpired()) {
                if(z) {
                    d10 = new com.vungle.ads.f();
                    goto label_16;
                }
                d10 = new com.vungle.ads.e("adv has expired on canPlayAd()");
                goto label_16;
            }
            com.vungle.ads.internal.a.a a$a0 = this.adState;
            if(a$a0 == com.vungle.ads.internal.a.a.PLAYING) {
                d10 = new X();
            }
            else if(a$a0 != com.vungle.ads.internal.a.a.READY) {
                d10 = new i0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_PLAY_PARAMETER, this.adState + " is not READY");
            }
            else {
                return null;
            }
        }
    label_16:
        if(z) {
            d10.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return d10;
    }

    public static d1 canPlayAd$default(a a0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if((v & 1) != 0) {
            z = false;
        }
        return a0.canPlayAd(z);
    }

    public final void cancelDownload$vungle_ads_release() {
        com.vungle.ads.internal.load.d d0 = this.baseAdLoader;
        if(d0 != null) {
            d0.cancel();
        }
    }

    @m
    public abstract b1 getAdSizeForAdRequest();

    @l
    public final com.vungle.ads.internal.a.a getAdState() {
        return this.adState;
    }

    @m
    public final com.vungle.ads.internal.model.b getAdvertisement() {
        return this.advertisement;
    }

    @m
    public final com.vungle.ads.internal.model.e getBidPayload() {
        return this.bidPayload;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @m
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @m
    public final com.vungle.ads.internal.model.m getPlacement() {
        return this.placement;
    }

    @l
    public final Y0 getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    private final com.vungle.ads.internal.signals.c getSignalManager() {
        return (com.vungle.ads.internal.signals.c)this.signalManager$delegate.getValue();
    }

    @l
    public final Y0 getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    private final com.vungle.ads.internal.network.l getVungleApiClient() {
        return (com.vungle.ads.internal.network.l)this.vungleApiClient$delegate.getValue();
    }

    public final boolean isErrorTerminal$vungle_ads_release(int v) {
        return this.adState == com.vungle.ads.internal.a.a.READY && v == 304;
    }

    public abstract boolean isValidAdSize(@m b1 arg1);

    public abstract boolean isValidAdTypeForPlacement(@l com.vungle.ads.internal.model.m arg1);

    public final void loadAd(@l String s, @m String s1, @l com.vungle.ads.internal.load.a a0) {
        public static final class com.vungle.ads.internal.a.f extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.a.f(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.c.class);
            }
        }


        public static final class com.vungle.ads.internal.a.g extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.a.g(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
            }
        }


        public static final class h extends N implements A3.a {
            final Context $context;

            public h(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
            }
        }


        public static final class com.vungle.ads.internal.a.i extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.a.i(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.downloader.e.class);
            }
        }

        com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0;
        L.p(s, "placementId");
        L.p(a0, "adLoaderCallback");
        r.logMetric$vungle_ads_release$default(r.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        Y0 y00 = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = y00;
        y00.markStart();
        this.adLoaderCallback = a0;
        if(!VungleAds.Companion.isInitialized()) {
            a0.onFailure(new U0("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.model.m m0 = k.INSTANCE.getPlacement(s);
        if(m0 == null) {
            com.vungle.ads.internal.model.m m1 = new com.vungle.ads.internal.model.m(s, false, null, 6, null);
            this.placement = m1;
            m0 = m1;
        }
        else {
            this.placement = m0;
            if(!this.isValidAdTypeForPlacement(m0)) {
                a0.onFailure(new O0(m0.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            if(m0.getHeaderBidding() && (s1 == null || s1.length() == 0) || !m0.getHeaderBidding() && s1 != null && s1.length() != 0) {
                a0.onFailure(new q0(s).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        b1 b10 = this.getAdSizeForAdRequest();
        String s2 = null;
        if(!this.isValidAdSize(b10)) {
            if(b10 != null) {
                s2 = b10.toString();
            }
            a0.onFailure(new l0(s2).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.a.a a$a0 = this.adState;
        if(a$a0 != com.vungle.ads.internal.a.a.NEW) {
            switch(a$a0) {
                case 1: {
                    throw new K(null, 1, null);
                }
                case 2: {
                    sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_IS_LOADING;
                    break;
                }
                case 3: {
                    sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_ALREADY_LOADED;
                    break;
                }
                case 4: {
                    sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_IS_PLAYING;
                    break;
                }
                case 5: {
                    sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_CONSUMED;
                    break;
                }
                case 6: {
                    sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_ALREADY_FAILED;
                    break;
                }
                default: {
                    throw new J();
                }
            }
            a0.onFailure(new i0(sdk$SDKError$b0, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        Y0 y01 = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = y01;
        y01.markStart();
        if(s1 != null && s1.length() != 0) {
            try {
                kotlinx.serialization.i i0 = z.k(a.json.a(), m0.A(com.vungle.ads.internal.model.e.class));
                L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (com.vungle.ads.internal.model.e)a.json.d(i0, s1);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a0.onFailure(new com.vungle.ads.g("Unable to decode payload into BidPayload object. Error: " + illegalArgumentException0.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            catch(Throwable throwable0) {
                a0.onFailure(new com.vungle.ads.h(throwable0.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        this.setAdState(com.vungle.ads.internal.a.a.LOADING);
        com.vungle.ads.internal.a.f a$f0 = new com.vungle.ads.internal.a.f(this.context);
        D d0 = E.c(H.a, a$f0);
        com.vungle.ads.internal.a.g a$g0 = new com.vungle.ads.internal.a.g(this.context);
        D d1 = E.c(H.a, a$g0);
        h a$h0 = new h(this.context);
        D d2 = E.c(H.a, a$h0);
        com.vungle.ads.internal.a.i a$i0 = new com.vungle.ads.internal.a.i(this.context);
        D d3 = E.c(H.a, a$i0);
        if(s1 == null || s1.length() == 0) {
            com.vungle.ads.internal.load.b b1 = new com.vungle.ads.internal.load.b(m0, null, b10);
            com.vungle.ads.internal.network.l l1 = this.getVungleApiClient();
            com.vungle.ads.internal.executor.d d5 = a.loadAd$lambda-3(d1);
            com.vungle.ads.internal.omsdk.c c1 = a.loadAd$lambda-2(d0);
            com.vungle.ads.internal.downloader.e e1 = a.loadAd$lambda-5(d3);
            q q1 = a.loadAd$lambda-4(d2);
            this.baseAdLoader = new com.vungle.ads.internal.load.i(this.context, l1, d5, c1, e1, q1, b1);
        }
        else {
            com.vungle.ads.internal.load.b b0 = new com.vungle.ads.internal.load.b(m0, this.bidPayload, b10);
            com.vungle.ads.internal.network.l l0 = this.getVungleApiClient();
            com.vungle.ads.internal.executor.d d4 = a.loadAd$lambda-3(d1);
            com.vungle.ads.internal.omsdk.c c0 = a.loadAd$lambda-2(d0);
            com.vungle.ads.internal.downloader.e e0 = a.loadAd$lambda-5(d3);
            q q0 = a.loadAd$lambda-4(d2);
            this.baseAdLoader = new com.vungle.ads.internal.load.o(this.context, l0, d4, c0, e0, q0, b0);
        }
        com.vungle.ads.internal.load.d d6 = this.baseAdLoader;
        if(d6 != null) {
            d6.setLogEntry$vungle_ads_release(this.logEntry);
        }
        com.vungle.ads.internal.load.d d7 = this.baseAdLoader;
        if(d7 != null) {
            d7.loadAd(this);
        }
    }

    private static final com.vungle.ads.internal.omsdk.c loadAd$lambda-2(D d0) {
        return (com.vungle.ads.internal.omsdk.c)d0.getValue();
    }

    private static final com.vungle.ads.internal.executor.d loadAd$lambda-3(D d0) {
        return (com.vungle.ads.internal.executor.d)d0.getValue();
    }

    private static final q loadAd$lambda-4(D d0) {
        return (q)d0.getValue();
    }

    private static final com.vungle.ads.internal.downloader.e loadAd$lambda-5(D d0) {
        return (com.vungle.ads.internal.downloader.e)d0.getValue();
    }

    @Override  // com.vungle.ads.internal.load.a
    public void onFailure(@l d1 d10) {
        L.p(d10, "error");
        this.setAdState(com.vungle.ads.internal.a.a.ERROR);
        Y0 y00 = this.loadMetric;
        if(y00 != null) {
            y00.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            y00.markEnd();
            r.INSTANCE.logMetric$vungle_ads_release(y00, this.logEntry, String.valueOf(d10.getCode()));
        }
        com.vungle.ads.internal.load.a a0 = this.adLoaderCallback;
        if(a0 != null) {
            a0.onFailure(d10);
        }
    }

    @Override  // com.vungle.ads.internal.load.a
    public void onSuccess(@l com.vungle.ads.internal.model.b b0) {
        public static final class j extends N implements A3.a {
            final Context $context;

            public j(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
            }
        }


        public static final class com.vungle.ads.internal.a.k extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.a.k(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
            }
        }

        L.p(b0, "advertisement");
        this.advertisement = b0;
        this.setAdState(com.vungle.ads.internal.a.a.READY);
        this.adLoadedAndUpdateConfigure$vungle_ads_release(b0);
        com.vungle.ads.internal.load.a a0 = this.adLoaderCallback;
        if(a0 != null) {
            a0.onSuccess(b0);
        }
        Y0 y00 = this.loadMetric;
        if(y00 != null) {
            if(!b0.adLoadOptimizationEnabled()) {
                y00.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            y00.markEnd();
            r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, this.logEntry, null, 4, null);
        }
        Y0 y01 = this.requestMetric;
        if(y01 != null) {
            if(!b0.adLoadOptimizationEnabled()) {
                y01.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            y01.markEnd();
            r.logMetric$vungle_ads_release$default(r.INSTANCE, y01, this.logEntry, null, 4, null);
            j a$j0 = new j(this.context);
            D d0 = E.c(H.a, a$j0);
            com.vungle.ads.internal.a.k a$k0 = new com.vungle.ads.internal.a.k(this.context);
            D d1 = E.c(H.a, a$k0);
            List list0 = com.vungle.ads.internal.model.b.getTpatUrls$default(b0, "ad.loadDuration", String.valueOf(y01.getValue()), null, 4, null);
            if(list0 != null) {
                new com.vungle.ads.internal.network.j(this.getVungleApiClient(), this.logEntry, a.onSuccess$lambda-10$lambda-7(d0).getIoExecutor(), a.onSuccess$lambda-10$lambda-8(d1), this.getSignalManager()).sendTpats(list0, a.onSuccess$lambda-10$lambda-7(d0).getJobExecutor());
            }
        }
    }

    private static final com.vungle.ads.internal.executor.d onSuccess$lambda-10$lambda-7(D d0) {
        return (com.vungle.ads.internal.executor.d)d0.getValue();
    }

    private static final q onSuccess$lambda-10$lambda-8(D d0) {
        return (q)d0.getValue();
    }

    public final void play(@m Context context0, @l com.vungle.ads.internal.presenter.b b0) {
        public static final class com.vungle.ads.internal.a.l extends com.vungle.ads.internal.presenter.c {
            com.vungle.ads.internal.a.l(com.vungle.ads.internal.presenter.b b0, a a0) {
                a.this = a0;
                super(b0);
            }

            @Override  // com.vungle.ads.internal.presenter.c
            public void onAdEnd(@m String s) {
                a.this.setAdState(com.vungle.ads.internal.a.a.FINISHED);
                super.onAdEnd(s);
            }

            @Override  // com.vungle.ads.internal.presenter.c
            public void onAdStart(@m String s) {
                a.this.setAdState(com.vungle.ads.internal.a.a.PLAYING);
                a.this.getValidationToPresentMetric$vungle_ads_release().markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, a.this.getValidationToPresentMetric$vungle_ads_release(), a.this.getLogEntry$vungle_ads_release(), null, 4, null);
                super.onAdStart(s);
            }

            @Override  // com.vungle.ads.internal.presenter.c
            public void onFailure(@l d1 d10) {
                L.p(d10, "error");
                a.this.setAdState(com.vungle.ads.internal.a.a.ERROR);
                super.onFailure(d10);
            }
        }

        L.p(b0, "adPlayCallback");
        this.showToValidationMetric.markStart();
        this.playContext = context0 == null ? null : new WeakReference(context0);
        d1 d10 = this.canPlayAd(true);
        if(d10 != null) {
            b0.onFailure(d10);
            if(this.isErrorTerminal$vungle_ads_release(d10.getCode())) {
                this.setAdState(com.vungle.ads.internal.a.a.ERROR);
            }
            return;
        }
        com.vungle.ads.internal.model.b b1 = this.advertisement;
        if(b1 == null) {
            return;
        }
        com.vungle.ads.internal.a.l a$l0 = new com.vungle.ads.internal.a.l(b0, this);
        this.cancelDownload$vungle_ads_release();
        this.renderAd$vungle_ads_release(a$l0, b1);
    }

    public void renderAd$vungle_ads_release(@m com.vungle.ads.internal.presenter.b b0, @l com.vungle.ads.internal.model.b b1) {
        public static final class com.vungle.ads.internal.a.m extends com.vungle.ads.internal.presenter.a {
            com.vungle.ads.internal.a.m(com.vungle.ads.internal.presenter.b b0, com.vungle.ads.internal.model.m m0) {
                super(b0, m0);
            }
        }

        Context context0;
        L.p(b1, "advertisement");
        com.vungle.ads.internal.ui.a.a a$a0 = com.vungle.ads.internal.ui.a.Companion;
        a$a0.setEventListener$vungle_ads_release(new com.vungle.ads.internal.a.m(b0, this.placement));
        a$a0.setAdvertisement$vungle_ads_release(b1);
        a$a0.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference weakReference0 = this.playContext;
        if(weakReference0 == null) {
            context0 = this.context;
        }
        else {
            context0 = (Context)weakReference0.get();
            if(context0 == null) {
                context0 = this.context;
            }
        }
        L.o(context0, "playContext?.get() ?: context");
        com.vungle.ads.internal.model.m m0 = this.placement;
        if(m0 == null) {
            return;
        }
        Intent intent0 = a$a0.createIntent(context0, m0.getReferenceId(), b1.eventId());
        com.vungle.ads.internal.util.b.a b$a0 = com.vungle.ads.internal.util.b.Companion;
        if(!b$a0.isForeground()) {
            p.Companion.d("AdInternal", "The ad activity is in background on play.");
            W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.VIEW_NOT_VISIBLE_ON_PLAY);
            r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, this.logEntry, null, 4, null);
        }
        this.showToValidationMetric.markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.showToValidationMetric, this.logEntry, null, 4, null);
        this.validationToPresentMetric.markStart();
        b$a0.startWhenForeground(context0, null, intent0, null);
    }

    public final void setAdState(@l com.vungle.ads.internal.a.a a$a0) {
        public static final class com.vungle.ads.internal.a.e extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.a.e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(g.class);
            }
        }

        L.p(a$a0, "value");
        if(a$a0.isTerminalState()) {
            com.vungle.ads.internal.model.b b0 = this.advertisement;
            if(b0 != null) {
                String s = b0.eventId();
                if(s != null) {
                    com.vungle.ads.internal.a.e a$e0 = new com.vungle.ads.internal.a.e(this.context);
                    D d0 = E.c(H.a, a$e0);
                    com.vungle.ads.internal.task.e e0 = com.vungle.ads.internal.task.a.Companion.makeJobInfo(s);
                    a._set_adState_$lambda-1$lambda-0(d0).execute(e0);
                }
            }
        }
        this.adState = this.adState.transitionTo(a$a0);
    }

    public final void setAdvertisement(@m com.vungle.ads.internal.model.b b0) {
        this.advertisement = b0;
    }

    public final void setBidPayload(@m com.vungle.ads.internal.model.e e0) {
        this.bidPayload = e0;
    }

    public final void setLogEntry$vungle_ads_release(@m o o0) {
        this.logEntry = o0;
    }

    public final void setPlacement(@m com.vungle.ads.internal.model.m m0) {
        this.placement = m0;
    }
}

