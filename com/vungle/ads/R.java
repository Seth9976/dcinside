package com.vungle.ads;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.protos.Sdk.SDKError;
import com.vungle.ads.internal.protos.Sdk.SDKMetric;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class r {
    public static enum a {
        public static final class com.vungle.ads.r.a.a {
            private com.vungle.ads.r.a.a() {
            }

            public com.vungle.ads.r.a.a(w w0) {
            }

            @l
            public final a fromValue(int v) {
                a r$a0 = a.ERROR_LOG_LEVEL_DEBUG;
                if(v == r$a0.getLevel()) {
                    return r$a0;
                }
                a r$a1 = a.ERROR_LOG_LEVEL_ERROR;
                if(v == r$a1.getLevel()) {
                    return r$a1;
                }
                return v == a.ERROR_LOG_LEVEL_OFF.getLevel() ? a.ERROR_LOG_LEVEL_OFF : r$a1;
            }
        }

        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);

        @l
        public static final com.vungle.ads.r.a.a Companion;
        private final int level;

        private static final a[] $values() [...] // Inlined contents

        static {
            a.Companion = new com.vungle.ads.r.a.a(null);
        }

        private a(int v1) {
            this.level = v1;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    public interface b {
        void onFailure();

        void onSuccess();
    }

    @l
    public static final r INSTANCE = null;
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000L;
    @l
    private static final String TAG = "AnalyticsClient";
    @l
    private static final BlockingQueue errors;
    @m
    private static i executor;
    @l
    private static a logLevel;
    @l
    private static final BlockingQueue metrics;
    private static boolean metricsEnabled;
    @l
    private static final BlockingQueue pendingErrors;
    @l
    private static final BlockingQueue pendingMetrics;
    private static boolean refreshEnabled;
    @m
    private static com.vungle.ads.internal.network.l vungleApiClient;

    static {
        r.INSTANCE = new r();
        r.errors = new LinkedBlockingQueue();
        r.metrics = new LinkedBlockingQueue();
        r.pendingErrors = new LinkedBlockingQueue();
        r.pendingMetrics = new LinkedBlockingQueue();
        r.logLevel = a.ERROR_LOG_LEVEL_ERROR;
        r.refreshEnabled = true;
    }

    @WorkerThread
    private final void flushErrors() {
        public static final class c implements b {
            final BlockingQueue $currentSendingErrors;

            c(BlockingQueue blockingQueue0) {
                this.$currentSendingErrors = blockingQueue0;
                super();
            }

            @Override  // com.vungle.ads.r$b
            public void onFailure() {
                p.Companion.d("AnalyticsClient", "Failed to send " + this.$currentSendingErrors.size() + " errors");
                r.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
            }

            @Override  // com.vungle.ads.r$b
            public void onSuccess() {
                p.Companion.d("AnalyticsClient", "Sent " + this.$currentSendingErrors.size() + " errors");
            }
        }

        p.Companion.d("AnalyticsClient", "Sending " + r.errors.size() + " errors");
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        r.errors.drainTo(linkedBlockingQueue0);
        if(linkedBlockingQueue0.isEmpty()) {
            return;
        }
        com.vungle.ads.internal.network.l l0 = r.vungleApiClient;
        if(l0 != null) {
            l0.reportErrors(linkedBlockingQueue0, new c(linkedBlockingQueue0));
        }
    }

    @WorkerThread
    private final void flushMetrics() {
        public static final class d implements b {
            final BlockingQueue $currentSendingMetrics;

            d(BlockingQueue blockingQueue0) {
                this.$currentSendingMetrics = blockingQueue0;
                super();
            }

            @Override  // com.vungle.ads.r$b
            public void onFailure() {
                p.Companion.d("AnalyticsClient", "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
                r.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
            }

            @Override  // com.vungle.ads.r$b
            public void onSuccess() {
                p.Companion.d("AnalyticsClient", "Sent " + this.$currentSendingMetrics.size() + " metrics");
            }
        }

        p.Companion.d("AnalyticsClient", "Sending " + r.metrics.size() + " metrics");
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        r.metrics.drainTo(linkedBlockingQueue0);
        if(linkedBlockingQueue0.isEmpty()) {
            return;
        }
        com.vungle.ads.internal.network.l l0 = r.vungleApiClient;
        if(l0 != null) {
            l0.reportMetrics(linkedBlockingQueue0, new d(linkedBlockingQueue0));
        }
    }

    private final com.vungle.ads.internal.protos.Sdk.SDKMetric.a genMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, o o0, String s) {
        String s5;
        String s4;
        String s3;
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0 = SDKMetric.newBuilder().setType(sdk$SDKMetric$b0).setValue(v);
        String s1 = Build.MANUFACTURER;
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a1 = sdk$SDKMetric$a0.setMake(s1).setModel(Build.MODEL).setOs((L.g("Amazon", s1) ? "amazon" : "android")).setOsVersion("33");
        String s2 = "";
        if(o0 == null) {
            s3 = "";
        }
        else {
            s3 = o0.getPlacementRefId$vungle_ads_release();
            if(s3 == null) {
                s3 = "";
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a2 = sdk$SDKMetric$a1.setPlacementReferenceId(s3);
        if(o0 == null) {
            s4 = "";
        }
        else {
            s4 = o0.getCreativeId$vungle_ads_release();
            if(s4 == null) {
                s4 = "";
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a3 = sdk$SDKMetric$a2.setCreativeId(s4);
        if(o0 == null) {
            s5 = "";
        }
        else {
            s5 = o0.getEventId$vungle_ads_release();
            if(s5 == null) {
                s5 = "";
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a4 = sdk$SDKMetric$a3.setEventId(s5);
        if(s == null) {
            s = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a5 = sdk$SDKMetric$a4.setMeta(s);
        if(o0 != null) {
            String s6 = o0.getAdSource$vungle_ads_release();
            if(s6 != null) {
                s2 = s6;
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a6 = sdk$SDKMetric$a5.setAdSource(s2);
        L.o(sdk$SDKMetric$a6, "newBuilder()\n           …logEntry?.adSource ?: \"\")");
        return sdk$SDKMetric$a6;
    }

    static com.vungle.ads.internal.protos.Sdk.SDKMetric.a genMetric$default(r r0, com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, o o0, String s, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        o o1 = (v1 & 4) == 0 ? o0 : null;
        return (v1 & 8) == 0 ? r0.genMetric(sdk$SDKMetric$b0, v, o1, s) : r0.genMetric(sdk$SDKMetric$b0, v, o1, null);
    }

    private final com.vungle.ads.internal.protos.Sdk.SDKError.a genSDKError(com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, String s, o o0) {
        String s5;
        String s4;
        String s3;
        com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0 = SDKError.newBuilder();
        String s1 = Build.MANUFACTURER;
        com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a1 = sdk$SDKError$a0.setOs((L.g("Amazon", s1) ? "amazon" : "android")).setOsVersion("33").setMake(s1).setModel(Build.MODEL).setReason(sdk$SDKError$b0).setMessage(s).setAt(System.currentTimeMillis());
        String s2 = "";
        if(o0 == null) {
            s3 = "";
        }
        else {
            s3 = o0.getPlacementRefId$vungle_ads_release();
            if(s3 == null) {
                s3 = "";
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a2 = sdk$SDKError$a1.setPlacementReferenceId(s3);
        if(o0 == null) {
            s4 = "";
        }
        else {
            s4 = o0.getCreativeId$vungle_ads_release();
            if(s4 == null) {
                s4 = "";
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a3 = sdk$SDKError$a2.setCreativeId(s4);
        if(o0 == null) {
            s5 = "";
        }
        else {
            s5 = o0.getEventId$vungle_ads_release();
            if(s5 == null) {
                s5 = "";
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a4 = sdk$SDKError$a3.setEventId(s5);
        if(o0 != null) {
            String s6 = o0.getAdSource$vungle_ads_release();
            if(s6 != null) {
                s2 = s6;
            }
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a5 = sdk$SDKError$a4.setAdSource(s2);
        L.o(sdk$SDKError$a5, "newBuilder()\n           …ce(entry?.adSource ?: \"\")");
        return sdk$SDKError$a5;
    }

    static com.vungle.ads.internal.protos.Sdk.SDKError.a genSDKError$default(r r0, com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, String s, o o0, int v, Object object0) {
        if((v & 4) != 0) {
            o0 = null;
        }
        return r0.genSDKError(sdk$SDKError$b0, s, o0);
    }

    @l
    public final BlockingQueue getErrors$vungle_ads_release() {
        return r.errors;
    }

    @VisibleForTesting
    public static void getErrors$vungle_ads_release$annotations() {
    }

    @m
    public final i getExecutor$vungle_ads_release() {
        return r.executor;
    }

    @VisibleForTesting
    public static void getExecutor$vungle_ads_release$annotations() {
    }

    @l
    public final BlockingQueue getMetrics$vungle_ads_release() {
        return r.metrics;
    }

    @VisibleForTesting
    public static void getMetrics$vungle_ads_release$annotations() {
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return r.metricsEnabled;
    }

    @VisibleForTesting
    public static void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    @l
    public final BlockingQueue getPendingErrors$vungle_ads_release() {
        return r.pendingErrors;
    }

    @VisibleForTesting
    public static void getPendingErrors$vungle_ads_release$annotations() {
    }

    @l
    public final BlockingQueue getPendingMetrics$vungle_ads_release() {
        return r.pendingMetrics;
    }

    @VisibleForTesting
    public static void getPendingMetrics$vungle_ads_release$annotations() {
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return r.refreshEnabled;
    }

    @VisibleForTesting
    public static void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    @m
    public final com.vungle.ads.internal.network.l getVungleApiClient$vungle_ads_release() {
        return r.vungleApiClient;
    }

    @VisibleForTesting
    public static void getVungleApiClient$vungle_ads_release$annotations() {
    }

    // 检测为 Lambda 实现
    private static final void init$lambda-1(i i0) [...]

    // 检测为 Lambda 实现
    private static final void init$lambda-1$lambda-0() [...]

    public final void init$vungle_ads_release(@l com.vungle.ads.internal.network.l l0, @l i i0, int v, boolean z) {
        L.p(l0, "vungleApiClient");
        L.p(i0, "executor");
        r.executor = i0;
        r.vungleApiClient = l0;
        try {
            BlockingQueue blockingQueue0 = r.pendingErrors;
            if(!blockingQueue0.isEmpty()) {
                blockingQueue0.drainTo(r.errors);
            }
        }
        catch(Exception exception0) {
            p.Companion.e("AnalyticsClient", "Failed to add pendingErrors to errors queue.", exception0);
        }
        try {
            BlockingQueue blockingQueue1 = r.pendingMetrics;
            if(!blockingQueue1.isEmpty()) {
                blockingQueue1.drainTo(r.metrics);
            }
        }
        catch(Exception exception1) {
            p.Companion.e("AnalyticsClient", "Failed to add pendingMetrics to metrics queue.", exception1);
        }
        if(r.refreshEnabled) {
            Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(() -> {
                L.p(i0, "$executor");
                i0.execute(() -> r.INSTANCE.report());
            }, 0L, 5000L, TimeUnit.MILLISECONDS);
        }
        this.updateErrorLevelAndMetricEnabled$vungle_ads_release(v, z);
        if(v == a.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            p.Companion.enable(true);
            return;
        }
        if(v == a.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            p.Companion.enable(false);
            return;
        }
        if(v == a.ERROR_LOG_LEVEL_OFF.getLevel()) {
            p.Companion.enable(false);
        }
    }

    // 检测为 Lambda 实现
    private static final void logError$lambda-2(com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, String s, o o0) [...]

    public final void logError$vungle_ads_release(@l com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, @l String s, @m o o0) {
        i i0;
        synchronized(this) {
            L.p(sdk$SDKError$b0, "reason");
            L.p(s, "message");
            try {
                i0 = r.executor;
                if(i0 == null) {
                    com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0 = this.genSDKError(sdk$SDKError$b0, s, o0);
                    r.pendingErrors.put(sdk$SDKError$a0);
                    return;
                }
            }
            catch(Exception exception0) {
                p.Companion.e("AnalyticsClient", "Cannot logError " + sdk$SDKError$b0 + ", " + s + ", " + o0, exception0);
                return;
            }
            if(i0 != null) {
                try {
                    i0.execute(() -> {
                        L.p(sdk$SDKError$b0, "$reason");
                        L.p(s, "$message");
                        r.INSTANCE.logErrorInSameThread(sdk$SDKError$b0, s, o0);
                    });
                }
                catch(Exception exception0) {
                    p.Companion.e("AnalyticsClient", "Cannot logError " + sdk$SDKError$b0 + ", " + s + ", " + o0, exception0);
                }
            }
        }
    }

    public static void logError$vungle_ads_release$default(r r0, com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, String s, o o0, int v, Object object0) {
        if((v & 4) != 0) {
            o0 = null;
        }
        r0.logError$vungle_ads_release(sdk$SDKError$b0, s, o0);
    }

    private final void logErrorInSameThread(com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, String s, o o0) {
        synchronized(this) {
            if(r.logLevel == a.ERROR_LOG_LEVEL_OFF) {
                return;
            }
            try {
                com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0 = this.genSDKError(sdk$SDKError$b0, s, o0);
                r.errors.put(sdk$SDKError$a0);
                p.Companion.w("AnalyticsClient", "Logging error: " + sdk$SDKError$b0 + " with message: " + s);
                if(r.errors.size() >= 20) {
                    this.report();
                }
            }
            catch(Exception exception0) {
                p.Companion.e("AnalyticsClient", "Cannot logError", exception0);
            }
        }
    }

    static void logErrorInSameThread$default(r r0, com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0, String s, o o0, int v, Object object0) {
        if((v & 4) != 0) {
            o0 = null;
        }
        r0.logErrorInSameThread(sdk$SDKError$b0, s, o0);
    }

    // 检测为 Lambda 实现
    private static final void logMetric$lambda-3(com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, o o0, String s) [...]

    public final void logMetric$vungle_ads_release(@l M0 m00, @m o o0, @m String s) {
        synchronized(this) {
            L.p(m00, "oneShotTimeIntervalMetric");
            if(!m00.isLogged()) {
                this.logMetric$vungle_ads_release(m00, o0, s);
                m00.markLogged();
            }
        }
    }

    public final void logMetric$vungle_ads_release(@l W0 w00, @m o o0, @m String s) {
        synchronized(this) {
            L.p(w00, "singleValueMetric");
            this.logMetric$vungle_ads_release(w00.getMetricType(), w00.getValue(), o0, s);
        }
    }

    public final void logMetric$vungle_ads_release(@l Y0 y00, @m o o0, @m String s) {
        synchronized(this) {
            L.p(y00, "timeIntervalMetric");
            this.logMetric$vungle_ads_release(y00.getMetricType(), y00.getValue(), o0, s);
        }
    }

    public final void logMetric$vungle_ads_release(@l com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, @m o o0, @m String s) {
        i i0;
        synchronized(this) {
            L.p(sdk$SDKMetric$b0, "metricType");
            try {
                i0 = r.executor;
                if(i0 == null) {
                    com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0 = this.genMetric(sdk$SDKMetric$b0, v, o0, s);
                    r.pendingMetrics.put(sdk$SDKMetric$a0);
                    return;
                }
            }
            catch(Exception exception0) {
                p.Companion.e("AnalyticsClient", "Cannot logMetric " + sdk$SDKMetric$b0 + ", " + v + ", " + o0 + ", " + s, exception0);
                return;
            }
            if(i0 != null) {
                try {
                    i0.execute(() -> {
                        L.p(sdk$SDKMetric$b0, "$metricType");
                        r.INSTANCE.logMetricInSameThread(sdk$SDKMetric$b0, v, o0, s);
                    });
                }
                catch(Exception exception0) {
                    p.Companion.e("AnalyticsClient", "Cannot logMetric " + sdk$SDKMetric$b0 + ", " + v + ", " + o0 + ", " + s, exception0);
                }
            }
        }
    }

    public static void logMetric$vungle_ads_release$default(r r0, M0 m00, o o0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            s = m00.getMeta();
        }
        r0.logMetric$vungle_ads_release(m00, o0, s);
    }

    public static void logMetric$vungle_ads_release$default(r r0, W0 w00, o o0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            s = w00.getMeta();
        }
        r0.logMetric$vungle_ads_release(w00, o0, s);
    }

    public static void logMetric$vungle_ads_release$default(r r0, Y0 y00, o o0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            s = y00.getMeta();
        }
        r0.logMetric$vungle_ads_release(y00, o0, s);
    }

    public static void logMetric$vungle_ads_release$default(r r0, com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, o o0, String s, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        r0.logMetric$vungle_ads_release(sdk$SDKMetric$b0, v, ((v1 & 4) == 0 ? o0 : null), ((v1 & 8) == 0 ? s : null));
    }

    private final void logMetricInSameThread(com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, o o0, String s) {
        synchronized(this) {
            if(!r.metricsEnabled) {
                return;
            }
            try {
                com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0 = this.genMetric(sdk$SDKMetric$b0, v, o0, s);
                r.metrics.put(sdk$SDKMetric$a0);
                p.Companion.d("AnalyticsClient", "Logging Metric " + sdk$SDKMetric$b0 + " with value " + v + " for placement " + (o0 == null ? null : o0.getPlacementRefId$vungle_ads_release()));
                if(r.metrics.size() >= 20) {
                    this.report();
                }
            }
            catch(Exception exception0) {
                p.Companion.e("AnalyticsClient", "Cannot logMetrics", exception0);
            }
        }
    }

    static void logMetricInSameThread$default(r r0, com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0, long v, o o0, String s, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        r0.logMetricInSameThread(sdk$SDKMetric$b0, v, ((v1 & 4) == 0 ? o0 : null), ((v1 & 8) == 0 ? s : null));
    }

    private final void report() {
        synchronized(this) {
            if(r.logLevel != a.ERROR_LOG_LEVEL_OFF && r.errors.size() > 0) {
                this.flushErrors();
            }
            if(r.metricsEnabled && r.metrics.size() > 0) {
                this.flushMetrics();
            }
        }
    }

    public final void setExecutor$vungle_ads_release(@m i i0) {
        r.executor = i0;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z) {
        r.metricsEnabled = z;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z) {
        r.refreshEnabled = z;
    }

    public final void setVungleApiClient$vungle_ads_release(@m com.vungle.ads.internal.network.l l0) {
        r.vungleApiClient = l0;
    }

    public final void updateErrorLevelAndMetricEnabled$vungle_ads_release(int v, boolean z) {
        synchronized(this) {
            r.logLevel = a.Companion.fromValue(v);
            r.metricsEnabled = z;
        }
    }
}

