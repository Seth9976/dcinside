package com.vungle.ads.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.J0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.W0;
import com.vungle.ads.Y0;
import com.vungle.ads.internal.model.h.g;
import com.vungle.ads.internal.model.h.h.c;
import com.vungle.ads.internal.model.h.j;
import com.vungle.ads.internal.model.h;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.n0;
import com.vungle.ads.r;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.text.v;
import kotlinx.serialization.i;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import y4.l;
import y4.m;

public final class k {
    static final class e extends N implements Function1 {
        public static final e INSTANCE;

        static {
            e.INSTANCE = new e();
        }

        e() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.invoke(((f)object0));
            return S0.a;
        }

        public final void invoke(@l f f0) {
            L.p(f0, "$this$Json");
            f0.w(true);
            f0.u(true);
            f0.v(false);
        }
    }

    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1L;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    @l
    public static final k INSTANCE = null;
    @l
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    @m
    private static h config;
    @m
    private static String configExt;
    @m
    private static com.vungle.ads.internal.model.h.f endpoints;
    @l
    private static final b json;
    @m
    private static List placements;

    static {
        k.INSTANCE = new k();
        k.json = s.b(null, e.INSTANCE, 1, null);
    }

    public final long afterClickDuration() [...] // 潜在的解密器

    public final boolean allowAutoRedirects() [...] // 潜在的解密器

    @VisibleForTesting
    public final int checkConfigPayload$vungle_ads_release(@m h h0) {
        if(h0 != null && h0.getConfigLastValidatedTimestamp() != null) {
            Long long0 = h0.getConfigLastValidatedTimestamp();
            if(long0 == null || ((long)long0) != -1L) {
                return h0.getEndpoints() == null ? 1 : 2;
            }
        }
        return 0;
    }

    @VisibleForTesting
    public final void clearConfig$vungle_ads_release() {
        k.endpoints = null;
        k.placements = null;
        k.config = null;
    }

    public final long configLastValidatedTimestamp() [...] // 潜在的解密器

    private static final com.vungle.ads.internal.network.l fetchConfigAsync$lambda-0(D d0) {
        return (com.vungle.ads.internal.network.l)d0.getValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(@l Context context0, @l Function1 function10) {
        public static final class a extends N implements A3.a {
            final Context $context;

            public a(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


        public static final class com.vungle.ads.internal.k.b implements com.vungle.ads.internal.network.b {
            final Context $context;
            final Y0 $initRequestToResponseMetric;
            final Function1 $onComplete;

            com.vungle.ads.internal.k.b(Y0 y00, Context context0, Function1 function10) {
                this.$initRequestToResponseMetric = y00;
                this.$context = context0;
                this.$onComplete = function10;
                super();
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onFailure(@m com.vungle.ads.internal.network.a a0, @m Throwable throwable0) {
                this.$initRequestToResponseMetric.markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, this.$initRequestToResponseMetric, null, "https://config.ads.vungle.com/", 2, null);
                new J0("Error while fetching config: " + (throwable0 == null ? null : throwable0.getMessage())).logErrorNoReturnValue$vungle_ads_release();
                this.$onComplete.invoke(Boolean.FALSE);
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onResponse(@m com.vungle.ads.internal.network.a a0, @m com.vungle.ads.internal.network.f f0) {
                this.$initRequestToResponseMetric.markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, this.$initRequestToResponseMetric, null, "https://config.ads.vungle.com/", 2, null);
                if(f0 != null && f0.isSuccessful() && f0.body() != null) {
                    W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CONFIG_LOADED_FROM_INIT);
                    k.INSTANCE.initWithConfig$vungle_ads_release(this.$context, ((h)f0.body()), false, w00);
                    this.$onComplete.invoke(Boolean.TRUE);
                    return;
                }
                new com.vungle.ads.a("config API: " + (f0 == null ? null : f0.code())).logErrorNoReturnValue$vungle_ads_release();
            }
        }

        L.p(context0, "context");
        L.p(function10, "onComplete");
        a k$a0 = new a(context0);
        D d0 = E.c(H.a, k$a0);
        try {
            Y0 y00 = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.INIT_REQUEST_TO_RESPONSE_DURATION_MS);
            y00.markStart();
            com.vungle.ads.internal.network.a a0 = k.fetchConfigAsync$lambda-0(d0).config();
            if(a0 != null) {
                a0.enqueue(new com.vungle.ads.internal.k.b(y00, context0, function10));
            }
        }
        catch(Throwable throwable0) {
            if((throwable0 instanceof UnknownHostException ? true : throwable0 instanceof SecurityException)) {
                new J0("Config unknown: " + throwable0.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            else {
                new J0("Config: " + throwable0.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            function10.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() [...] // 潜在的解密器

    @l
    public final String getAdsEndpoint() [...] // 潜在的解密器

    @m
    public final h getCachedConfig(@l com.vungle.ads.internal.persistence.b b0, @l String s) {
        long v1;
        L.p(b0, "filePreferences");
        L.p(s, "appId");
        try {
            String s1 = b0.getString("config_app_id");
            if(s1 != null && s1.length() != 0 && v.O1(s1, s, true)) {
                String s2 = b0.getString("config_response");
                if(s2 != null) {
                    long v = b0.getLong("config_update_time", 0L);
                    i i0 = z.k(k.json.a(), m0.A(h.class));
                    L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    h h0 = (h)k.json.d(i0, s2);
                    com.vungle.ads.internal.model.h.e h$e0 = h0.getConfigSettings();
                    if(h$e0 == null) {
                        v1 = -1L;
                    }
                    else {
                        Long long0 = h$e0.getRefreshTime();
                        v1 = long0 == null ? -1L : ((long)long0);
                    }
                    if(v1 + v < System.currentTimeMillis()) {
                        p.Companion.w("ConfigManager", "cache config expired. re-config");
                        return null;
                    }
                    p.Companion.w("ConfigManager", "use cache config.");
                    return h0;
                }
                return null;
            }
            p.Companion.w("ConfigManager", "app id mismatch, re-config");
            return null;
        }
        catch(Exception exception0) {
        }
        p.Companion.e("ConfigManager", "Error while parsing cached config: " + exception0.getMessage());
        return null;
    }

    public final int getCleverCacheDiskPercentage() [...] // 潜在的解密器

    public final long getCleverCacheDiskSize() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @l
    public final String getConfigExtension() [...] // 潜在的解密器

    @l
    public final String getErrorLoggingEndpoint() [...] // 潜在的解密器

    @m
    public final String getGDPRButtonAccept() {
        h h0 = k.config;
        if(h0 != null) {
            j h$j0 = h0.getUserPrivacy();
            if(h$j0 != null) {
                g h$g0 = h$j0.getGdpr();
                return h$g0 == null ? null : h$g0.getButtonAccept();
            }
        }
        return null;
    }

    @m
    public final String getGDPRButtonDeny() {
        h h0 = k.config;
        if(h0 != null) {
            j h$j0 = h0.getUserPrivacy();
            if(h$j0 != null) {
                g h$g0 = h$j0.getGdpr();
                return h$g0 == null ? null : h$g0.getButtonDeny();
            }
        }
        return null;
    }

    @m
    public final String getGDPRConsentMessage() {
        h h0 = k.config;
        if(h0 != null) {
            j h$j0 = h0.getUserPrivacy();
            if(h$j0 != null) {
                g h$g0 = h$j0.getGdpr();
                return h$g0 == null ? null : h$g0.getConsentMessage();
            }
        }
        return null;
    }

    @l
    public final String getGDPRConsentMessageVersion() {
        h h0 = k.config;
        if(h0 != null) {
            j h$j0 = h0.getUserPrivacy();
            if(h$j0 != null) {
                g h$g0 = h$j0.getGdpr();
                if(h$g0 != null) {
                    String s = h$g0.getConsentMessageVersion();
                    return s == null ? "" : s;
                }
            }
        }
        return "";
    }

    @m
    public final String getGDPRConsentTitle() {
        h h0 = k.config;
        if(h0 != null) {
            j h$j0 = h0.getUserPrivacy();
            if(h$j0 != null) {
                g h$g0 = h$j0.getGdpr();
                return h$g0 == null ? null : h$g0.getConsentTitle();
            }
        }
        return null;
    }

    public final boolean getGDPRIsCountryDataProtected() [...] // 潜在的解密器

    public final int getLogLevel() [...] // 潜在的解密器

    public final boolean getMetricsEnabled() [...] // 潜在的解密器

    @l
    public final String getMetricsEndpoint() [...] // 潜在的解密器

    @m
    public final String getMraidEndpoint() {
        return k.endpoints == null ? null : k.endpoints.getMraidEndpoint();
    }

    @l
    public final String getMraidJsVersion() [...] // 潜在的解密器

    @m
    public final com.vungle.ads.internal.model.m getPlacement(@m String s) {
        List list0 = k.placements;
        if(list0 != null) {
            for(Object object0: list0) {
                if(L.g(((com.vungle.ads.internal.model.m)object0).getReferenceId(), s)) {
                    return object0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @m
    public final String getRiEndpoint() {
        return k.endpoints == null ? null : k.endpoints.getRiEndpoint();
    }

    public final long getSessionTimeout() {
        h h0 = k.config;
        if(h0 != null) {
            Integer integer0 = h0.getSessionTimeout();
            return integer0 == null ? 900000L : ((long)(((int)integer0))) * 1000L;
        }
        return 900000L;
    }

    public final long getSignalsSessionTimeout() {
        h h0 = k.config;
        if(h0 != null) {
            Integer integer0 = h0.getSignalSessionTimeout();
            return integer0 == null ? 1800000L : ((long)(((int)integer0))) * 1000L;
        }
        return 1800000L;
    }

    @m
    public final c getTcfStatus() {
        com.vungle.ads.internal.model.h.h.c.a h$h$c$a0 = c.Companion;
        h h0 = k.config;
        if(h0 != null) {
            j h$j0 = h0.getUserPrivacy();
            if(h$j0 != null) {
                com.vungle.ads.internal.model.h.h h$h0 = h$j0.getIab();
                return h$h0 == null ? h$h$c$a0.fromRawValue(null) : h$h$c$a0.fromRawValue(h$h0.getTcfStatus());
            }
        }
        return h$h$c$a0.fromRawValue(null);
    }

    private static final com.vungle.ads.internal.persistence.b initWithConfig$lambda-2(D d0) {
        return (com.vungle.ads.internal.persistence.b)d0.getValue();
    }

    private static final com.vungle.ads.internal.omsdk.c initWithConfig$lambda-5(D d0) {
        return (com.vungle.ads.internal.omsdk.c)d0.getValue();
    }

    public final void initWithConfig$vungle_ads_release(@l Context context0, @m h h0, boolean z, @m W0 w00) {
        public static final class com.vungle.ads.internal.k.c extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.k.c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
            }
        }


        public static final class d extends N implements A3.a {
            final Context $context;

            public d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.c.class);
            }
        }

        D d0;
        synchronized(this) {
            L.p(context0, "context");
            try {
                d0 = E.c(H.a, new com.vungle.ads.internal.k.c(context0));
                switch(this.checkConfigPayload$vungle_ads_release(h0)) {
                    case 0: {
                        p.Companion.e("ConfigManager", "Config is not available.");
                        break;
                    }
                    case 1: {
                        goto label_28;
                    }
                    default: {
                        k.config = h0;
                        List list0 = null;
                        k.endpoints = h0 == null ? null : h0.getEndpoints();
                        if(h0 != null) {
                            list0 = h0.getPlacements();
                        }
                        k.placements = list0;
                        r r0 = r.INSTANCE;
                        r0.updateErrorLevelAndMetricEnabled$vungle_ads_release(1, false);
                        if(!z && h0 != null) {
                            this.updateCachedConfig(h0, k.initWithConfig$lambda-2(d0));
                            String s = h0.getConfigExtension();
                            if(s != null) {
                                k.INSTANCE.updateConfigExtension$vungle_ads_release(context0, s);
                            }
                        }
                        if(w00 != null) {
                            r.logMetric$vungle_ads_release$default(r0, w00, null, null, 6, null);
                        }
                        V2.c.INSTANCE.updateDisableAdId(true);
                        return;
                    }
                }
            }
            catch(Exception exception0) {
                p.Companion.e("ConfigManager", "Error while validating config: " + exception0.getMessage());
                return;
            }
            return;
        label_28:
            if(z || h0 == null) {
                return;
            }
            else {
                try {
                    Long long0 = h0.getConfigLastValidatedTimestamp();
                    long v1 = long0 == null ? -1L : ((long)long0);
                    h h1 = k.config;
                    if(h1 != null) {
                        h1.setConfigLastValidatedTimestamp(v1);
                    }
                    h h2 = k.config;
                    if(h2 != null) {
                        com.vungle.ads.internal.persistence.b b0 = k.initWithConfig$lambda-2(d0);
                        k.INSTANCE.updateCachedConfig(h2, b0);
                    }
                    return;
                }
                catch(Exception exception0) {
                }
            }
            p.Companion.e("ConfigManager", "Error while validating config: " + exception0.getMessage());
        }
    }

    public static void initWithConfig$vungle_ads_release$default(k k0, Context context0, h h0, boolean z, W0 w00, int v, Object object0) {
        if((v & 8) != 0) {
            w00 = null;
        }
        k0.initWithConfig$vungle_ads_release(context0, h0, z, w00);
    }

    public final boolean isCacheableAssetsRequired() [...] // 潜在的解密器

    public final boolean isCleverCacheEnabled() [...] // 潜在的解密器

    public final boolean isReportIncentivizedEnabled() [...] // 潜在的解密器

    public final boolean omEnabled() [...] // 潜在的解密器

    @m
    public final List placements() {
        return k.placements;
    }

    public final boolean rtaDebuggingEnabled() {
        h h0 = k.config;
        if(h0 != null) {
            Boolean boolean0 = h0.getRtaDebugging();
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    public final void setAppId$vungle_ads_release(@l String s) {
        L.p(s, "applicationId");
        k.applicationId = s;
    }

    public final boolean shouldDisableAdId() [...] // 潜在的解密器

    public final boolean signalsDisabled() [...] // 潜在的解密器

    public final void updateCachedConfig(@l h h0, @l com.vungle.ads.internal.persistence.b b0) {
        L.p(h0, "config");
        L.p(b0, "filePreferences");
        try {
            String s = k.applicationId;
            if(s == null) {
                L.S("applicationId");
                s = null;
            }
            b0.put("config_app_id", s);
            b0.put("config_update_time", System.currentTimeMillis());
            i i0 = z.k(k.json.a(), m0.A(h.class));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            b0.put("config_response", k.json.c(i0, h0));
            b0.apply();
            return;
        }
        catch(Exception exception0) {
        }
        p.Companion.e("ConfigManager", "Exception: " + exception0.getMessage() + " for updating cached config");
    }

    private static final com.vungle.ads.internal.persistence.b updateConfigExtension$lambda-1(D d0) {
        return (com.vungle.ads.internal.persistence.b)d0.getValue();
    }

    @VisibleForTesting
    public final void updateConfigExtension$vungle_ads_release(@l Context context0, @l String s) {
        public static final class com.vungle.ads.internal.k.f extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.k.f(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
            }
        }

        L.p(context0, "context");
        L.p(s, "ext");
        k.configExt = s;
        com.vungle.ads.internal.k.f k$f0 = new com.vungle.ads.internal.k.f(context0);
        k.updateConfigExtension$lambda-1(E.c(H.a, k$f0)).put("config_extension", s).apply();
    }

    @VisibleForTesting
    public final boolean validateConfig$vungle_ads_release(@m h h0) {
        return (h0 == null ? null : h0.getEndpoints()) != null && this.validateEndpoints$vungle_ads_release(h0.getEndpoints()) && h0.getPlacements() != null;
    }

    @VisibleForTesting
    public final boolean validateEndpoints$vungle_ads_release(@m com.vungle.ads.internal.model.h.f h$f0) {
        boolean z1;
        String s = null;
        String s1 = h$f0 == null ? null : h$f0.getAdsEndpoint();
        boolean z = false;
        if(s1 == null || s1.length() == 0) {
            new n0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z1 = false;
        }
        else {
            z1 = true;
        }
        String s2 = h$f0 == null ? null : h$f0.getRiEndpoint();
        if(s2 == null || s2.length() == 0) {
            new n0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String s3 = h$f0 == null ? null : h$f0.getMraidEndpoint();
        if(s3 == null || s3.length() == 0) {
            new n0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_DOWNLOAD_JS_ERROR, "The mraid endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        else {
            z = z1;
        }
        String s4 = h$f0 == null ? null : h$f0.getMetricsEndpoint();
        if(s4 == null || s4.length() == 0) {
            new n0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        if(h$f0 != null) {
            s = h$f0.getErrorLogsEndpoint();
        }
        if(s == null || s.length() == 0) {
            p.Companion.e("ConfigManager", "The error logging endpoint was not provided in the config.");
        }
        return z;
    }

    public static boolean validateEndpoints$vungle_ads_release$default(k k0, com.vungle.ads.internal.model.h.f h$f0, int v, Object object0) {
        if((v & 1) != 0) {
            h$f0 = k.endpoints;
        }
        return k0.validateEndpoints$vungle_ads_release(h$f0);
    }
}

