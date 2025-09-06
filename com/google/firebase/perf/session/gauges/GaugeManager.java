package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.C;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.h;
import com.google.firebase.perf.v1.m.b;
import com.google.firebase.perf.v1.m;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
public class GaugeManager {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[g.values().length];
            a.a = arr_v;
            try {
                arr_v[g.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[g.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20L;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1L;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20L;
    private g applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final C cpuGaugeCollector;
    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C gaugeManagerExecutor;
    @Nullable
    private i gaugeMetadataManager;
    private static final GaugeManager instance;
    private static final com.google.firebase.perf.logging.a logger;
    private final C memoryGaugeCollector;
    @Nullable
    private String sessionId;
    private final k transportManager;

    static {
        GaugeManager.logger = com.google.firebase.perf.logging.a.e();
        GaugeManager.instance = new GaugeManager();
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C(new f()), k.l(), com.google.firebase.perf.config.a.h(), null, new C(() -> new c()), new C(() -> new l()));
    }

    @VisibleForTesting
    GaugeManager(C c0, k k0, com.google.firebase.perf.config.a a0, i i0, C c1, C c2) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = g.b;
        this.gaugeManagerExecutor = c0;
        this.transportManager = k0;
        this.configResolver = a0;
        this.gaugeMetadataManager = i0;
        this.cpuGaugeCollector = c1;
        this.memoryGaugeCollector = c2;
    }

    private static void collectGaugeMetricOnce(c c0, l l0, Timer timer0) {
        c0.c(timer0);
        l0.c(timer0);
    }

    public void collectGaugeMetricOnce(Timer timer0) {
        GaugeManager.collectGaugeMetricOnce(((c)this.cpuGaugeCollector.get()), ((l)this.memoryGaugeCollector.get()), timer0);
    }

    private long getCpuGaugeCollectionFrequencyMs(g g0) {
        long v;
        switch(g0) {
            case 1: {
                v = this.configResolver.A();
                return c.f(v) ? -1L : v;
            }
            case 2: {
                v = this.configResolver.B();
                return c.f(v) ? -1L : v;
            }
            default: {
                return -1L;
            }
        }
    }

    private com.google.firebase.perf.v1.k getGaugeMetadata() {
        return (com.google.firebase.perf.v1.k)com.google.firebase.perf.v1.k.wb().Cb(this.gaugeMetadataManager.a()).Db(this.gaugeMetadataManager.b()).Eb(this.gaugeMetadataManager.c()).build();
    }

    public static GaugeManager getInstance() {
        synchronized(GaugeManager.class) {
        }
        return GaugeManager.instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(g g0) {
        long v;
        switch(a.a[g0.ordinal()]) {
            case 1: {
                v = this.configResolver.D();
                return l.e(v) ? -1L : v;
            }
            case 2: {
                v = this.configResolver.E();
                return l.e(v) ? -1L : v;
            }
            default: {
                return -1L;
            }
        }
    }

    public void initializeGaugeMetadataManager(Context context0) {
        this.gaugeMetadataManager = new i(context0);
    }

    // 检测为 Lambda 实现
    private static c lambda$new$0() [...]

    // 检测为 Lambda 实现
    private static l lambda$new$1() [...]

    // 检测为 Lambda 实现
    private void lambda$startCollectingGauges$2(String s, g g0) [...]

    // 检测为 Lambda 实现
    private void lambda$stopCollectingGauges$3(String s, g g0) [...]

    public boolean logGaugeMetadata(String s, g g0) {
        if(this.gaugeMetadataManager != null) {
            m m0 = (m)m.Lb().Rb(s).Qb(this.getGaugeMetadata()).build();
            this.transportManager.E(m0, g0);
            return true;
        }
        return false;
    }

    private boolean startCollectingCpuMetrics(long v, Timer timer0) {
        if(v == -1L) {
            GaugeManager.logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((c)this.cpuGaugeCollector.get()).k(v, timer0);
        return true;
    }

    private long startCollectingGauges(g g0, Timer timer0) {
        long v = this.getCpuGaugeCollectionFrequencyMs(g0);
        if(!this.startCollectingCpuMetrics(v, timer0)) {
            v = -1L;
        }
        long v1 = this.getMemoryGaugeCollectionFrequencyMs(g0);
        if(this.startCollectingMemoryMetrics(v1, timer0)) {
            return v == -1L ? v1 : Math.min(v, v1);
        }
        return v;
    }

    public void startCollectingGauges(PerfSession perfSession0, g g0) {
        if(this.sessionId != null) {
            this.stopCollectingGauges();
        }
        long v = this.startCollectingGauges(g0, perfSession0.e());
        if(v == -1L) {
            GaugeManager.logger.l("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        try {
            String s = perfSession0.l();
            this.sessionId = s;
            this.applicationProcessState = g0;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService)this.gaugeManagerExecutor.get()).scheduleAtFixedRate(() -> this.syncFlush(s, g0), v * 20L, v * 20L, TimeUnit.MILLISECONDS);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            GaugeManager.logger.l("Unable to start collecting Gauges: " + rejectedExecutionException0.getMessage());
        }
    }

    private boolean startCollectingMemoryMetrics(long v, Timer timer0) {
        if(v == -1L) {
            GaugeManager.logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((l)this.memoryGaugeCollector.get()).j(v, timer0);
        return true;
    }

    public void stopCollectingGauges() {
        String s = this.sessionId;
        if(s == null) {
            return;
        }
        g g0 = this.applicationProcessState;
        ((c)this.cpuGaugeCollector.get()).l();
        ((l)this.memoryGaugeCollector.get()).k();
        ScheduledFuture scheduledFuture0 = this.gaugeManagerDataCollectionJob;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        ((ScheduledExecutorService)this.gaugeManagerExecutor.get()).schedule(() -> this.syncFlush(s, g0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = g.b;
    }

    private void syncFlush(String s, g g0) {
        b m$b0 = m.Lb();
        while(!((c)this.cpuGaugeCollector.get()).a.isEmpty()) {
            m$b0.Db(((h)((c)this.cpuGaugeCollector.get()).a.poll()));
        }
        while(!((l)this.memoryGaugeCollector.get()).b.isEmpty()) {
            m$b0.zb(((com.google.firebase.perf.v1.c)((l)this.memoryGaugeCollector.get()).b.poll()));
        }
        m$b0.Rb(s);
        m m0 = (m)m$b0.build();
        this.transportManager.E(m0, g0);
    }
}

