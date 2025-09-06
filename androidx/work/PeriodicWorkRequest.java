package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.work.impl.utils.DurationApi26Impl;
import j..time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;
import y4.l;
import z3.b;

public final class PeriodicWorkRequest extends WorkRequest {
    @s0({"SMAP\nPeriodicWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n1#2:421\n*E\n"})
    public static final class Builder extends androidx.work.WorkRequest.Builder {
        public Builder(@l Class class0, long v, @l TimeUnit timeUnit0) {
            L.p(class0, "workerClass");
            L.p(timeUnit0, "repeatIntervalTimeUnit");
            super(class0);
            this.h().Q(timeUnit0.toMillis(v));
        }

        public Builder(@l Class class0, long v, @l TimeUnit timeUnit0, long v1, @l TimeUnit timeUnit1) {
            L.p(class0, "workerClass");
            L.p(timeUnit0, "repeatIntervalTimeUnit");
            L.p(timeUnit1, "flexIntervalTimeUnit");
            super(class0);
            this.h().R(timeUnit0.toMillis(v), timeUnit1.toMillis(v1));
        }

        @RequiresApi(26)
        public Builder(@l Class class0, @l Duration duration0) {
            L.p(class0, "workerClass");
            L.p(duration0, "repeatInterval");
            super(class0);
            this.h().Q(DurationApi26Impl.a(duration0));
        }

        @RequiresApi(26)
        public Builder(@l Class class0, @l Duration duration0, @l Duration duration1) {
            L.p(class0, "workerClass");
            L.p(duration0, "repeatInterval");
            L.p(duration1, "flexInterval");
            super(class0);
            this.h().R(DurationApi26Impl.a(duration0), DurationApi26Impl.a(duration1));
        }

        public Builder(@l d d0, long v, @l TimeUnit timeUnit0) {
            L.p(d0, "workerClass");
            L.p(timeUnit0, "repeatIntervalTimeUnit");
            super(b.e(d0));
            this.h().Q(timeUnit0.toMillis(v));
        }

        public Builder(@l d d0, long v, @l TimeUnit timeUnit0, long v1, @l TimeUnit timeUnit1) {
            L.p(d0, "workerClass");
            L.p(timeUnit0, "repeatIntervalTimeUnit");
            L.p(timeUnit1, "flexIntervalTimeUnit");
            super(b.e(d0));
            this.h().R(timeUnit0.toMillis(v), timeUnit1.toMillis(v1));
        }

        @RequiresApi(26)
        public Builder(@l d d0, @l Duration duration0) {
            L.p(d0, "workerClass");
            L.p(duration0, "repeatInterval");
            super(b.e(d0));
            this.h().Q(DurationApi26Impl.a(duration0));
        }

        @RequiresApi(26)
        public Builder(@l d d0, @l Duration duration0, @l Duration duration1) {
            L.p(d0, "workerClass");
            L.p(duration0, "repeatInterval");
            L.p(duration1, "flexInterval");
            super(b.e(d0));
            this.h().R(DurationApi26Impl.a(duration0), DurationApi26Impl.a(duration1));
        }

        @l
        public PeriodicWorkRequest B() {
            if(this.d() && Build.VERSION.SDK_INT >= 23 && this.h().j.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if(this.h().q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new PeriodicWorkRequest(this);
        }

        @l
        public final Builder C() {
            this.h().N(0x7FFFFFFFFFFFFFFFL);
            this.h().O(1);
            return this;
        }

        @l
        public Builder D() [...] // Inlined contents

        @l
        public final Builder E(long v) {
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            this.h().N(v);
            this.h().O(1);
            return this;
        }

        @Override  // androidx.work.WorkRequest$Builder
        public WorkRequest c() {
            return this.B();
        }

        @Override  // androidx.work.WorkRequest$Builder
        public androidx.work.WorkRequest.Builder g() {
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion i = null;
    @SuppressLint({"MinMaxConstant"})
    public static final long j = 900000L;
    @SuppressLint({"MinMaxConstant"})
    public static final long k = 300000L;

    static {
        PeriodicWorkRequest.i = new Companion(null);
    }

    public PeriodicWorkRequest(@l Builder periodicWorkRequest$Builder0) {
        L.p(periodicWorkRequest$Builder0, "builder");
        super(periodicWorkRequest$Builder0.e(), periodicWorkRequest$Builder0.h(), periodicWorkRequest$Builder0.f());
    }
}

