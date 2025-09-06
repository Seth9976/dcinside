package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo.Builder;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.h;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class g {
    public static class a {
        private com.google.android.datatransport.runtime.time.a a;
        private Map b;

        public a() {
            this.b = new HashMap();
        }

        public a a(h h0, b g$b0) {
            this.b.put(h0, g$b0);
            return this;
        }

        public g b() {
            if(this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if(this.b.keySet().size() < h.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map0 = this.b;
            this.b = new HashMap();
            return g.d(this.a, map0);
        }

        public a c(com.google.android.datatransport.runtime.time.a a0) {
            this.a = a0;
            return this;
        }
    }

    @AutoValue
    public static abstract class b {
        @AutoValue.Builder
        public static abstract class com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a {
            public abstract b a();

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a b(long arg1);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a c(Set arg1);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a d(long arg1);
        }

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a a() {
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.d.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public static enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING;

    }

    private static final long a = 86400000L;
    private static final long b = 30000L;
    private static final long c = 1000L;
    private static final long d = 10000L;

    private long a(int v, long v1) {
        return v1 <= 1L ? ((long)(Math.pow(3.0, v - 1) * ((double)v1) * Math.max(1.0, 9.21034 / Math.log(2L * ((long)(v - 1)))))) : ((long)(Math.pow(3.0, v - 1) * ((double)v1) * Math.max(1.0, 9.21034 / Math.log(v1 * ((long)(v - 1))))));
    }

    public static a b() {
        return new a();
    }

    @RequiresApi(api = 21)
    public JobInfo.Builder c(JobInfo.Builder jobInfo$Builder0, h h0, long v, int v1) {
        jobInfo$Builder0.setMinimumLatency(this.h(h0, v, v1));
        this.k(jobInfo$Builder0, ((b)this.i().get(h0)).c());
        return jobInfo$Builder0;
    }

    static g d(com.google.android.datatransport.runtime.time.a a0, Map map0) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(a0, map0);
    }

    abstract com.google.android.datatransport.runtime.time.a e();

    public static g f(com.google.android.datatransport.runtime.time.a a0) {
        a g$a0 = g.b();
        b g$b0 = b.a().b(30000L).d(86400000L).a();
        a g$a1 = g$a0.a(h.a, g$b0);
        b g$b1 = b.a().b(1000L).d(86400000L).a();
        a g$a2 = g$a1.a(h.c, g$b1);
        b g$b2 = b.a().b(86400000L).d(86400000L).c(g.j(new c[]{c.b})).a();
        return g$a2.a(h.b, g$b2).c(a0).b();
    }

    public Set g(h h0) {
        return ((b)this.i().get(h0)).c();
    }

    public long h(h h0, long v, int v1) {
        long v2 = this.e().J();
        b g$b0 = (b)this.i().get(h0);
        return Math.min(Math.max(this.a(v1, g$b0.b()), v - v2), g$b0.d());
    }

    abstract Map i();

    private static Set j(Object[] arr_object) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(arr_object)));
    }

    @RequiresApi(api = 21)
    private void k(JobInfo.Builder jobInfo$Builder0, Set set0) {
        if(set0.contains(c.a)) {
            jobInfo$Builder0.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder0.setRequiredNetworkType(1);
        }
        if(set0.contains(c.c)) {
            jobInfo$Builder0.setRequiresCharging(true);
        }
        if(set0.contains(c.b)) {
            jobInfo$Builder0.setRequiresDeviceIdle(true);
        }
    }
}

