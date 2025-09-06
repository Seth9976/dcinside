package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e implements Cloneable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        public static final class com.vungle.ads.internal.task.e.b.a {
            static final com.vungle.ads.internal.task.e.b.a $$INSTANCE = null;
            public static final int ANY = 0;
            public static final int CONNECTED = 1;

            static {
                com.vungle.ads.internal.task.e.b.a.$$INSTANCE = new com.vungle.ads.internal.task.e.b.a();
            }
        }

        public static final int ANY = 0;
        public static final int CONNECTED = 1;
        @l
        public static final com.vungle.ads.internal.task.e.b.a Companion;

        static {
            b.Companion = com.vungle.ads.internal.task.e.b.a.$$INSTANCE;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @s3.e(s3.a.a)
    public @interface c {
        public static final class com.vungle.ads.internal.task.e.c.a {
            static final com.vungle.ads.internal.task.e.c.a $$INSTANCE = null;
            public static final int CRITICAL = 5;
            public static final int HIGH = 3;
            public static final int HIGHEST = 4;
            public static final int LOW = 1;
            public static final int LOWEST = 0;
            public static final int NORMAL = 2;

            static {
                com.vungle.ads.internal.task.e.c.a.$$INSTANCE = new com.vungle.ads.internal.task.e.c.a();
            }
        }

        public static final int CRITICAL = 5;
        @l
        public static final com.vungle.ads.internal.task.e.c.a Companion = null;
        public static final int HIGH = 3;
        public static final int HIGHEST = 4;
        public static final int LOW = 1;
        public static final int LOWEST = 0;
        public static final int NORMAL = 2;

        static {
            c.Companion = com.vungle.ads.internal.task.e.c.a.$$INSTANCE;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @s3.e(s3.a.a)
    public @interface d {
        public static final class com.vungle.ads.internal.task.e.d.a {
            static final com.vungle.ads.internal.task.e.d.a $$INSTANCE = null;
            public static final int EXPONENTIAL = 1;
            public static final int LINEAR;

            static {
                com.vungle.ads.internal.task.e.d.a.$$INSTANCE = new com.vungle.ads.internal.task.e.d.a();
            }
        }

        @l
        public static final com.vungle.ads.internal.task.e.d.a Companion = null;
        public static final int EXPONENTIAL = 1;
        public static final int LINEAR;

        static {
            d.Companion = com.vungle.ads.internal.task.e.d.a.$$INSTANCE;
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String TAG = "JobInfo";
    private long delay;
    @l
    private Bundle extras;
    @l
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    static {
        e.Companion = new a(null);
    }

    public e(@l String s) {
        L.p(s, "jobTag");
        super();
        this.jobTag = s;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    @Override
    @l
    public Object clone() {
        return super.clone();
    }

    @m
    public final e copy() {
        try {
            Object object0 = super.clone();
            L.n(object0, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (e)object0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            p.Companion.e("JobInfo", "Cannot copy JobInfo " + this, cloneNotSupportedException0);
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    @l
    public final Bundle getExtras() {
        return this.extras;
    }

    @l
    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public static void getPriority$annotations() {
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    @b
    public static void getRequiredNetworkType$annotations() {
    }

    private static void getReschedulePolicy$annotations() {
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long v = this.rescheduleTimeout;
        if(v == 0L) {
            return 0L;
        }
        long v1 = this.nextRescheduleTimeout;
        if(v1 == 0L) {
            this.nextRescheduleTimeout = v;
            return this.nextRescheduleTimeout;
        }
        if(this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = v1 * 2L;
        }
        return this.nextRescheduleTimeout;
    }

    @l
    public final e setDelay(long v) {
        this.delay = v;
        return this;
    }

    @l
    public final e setExtras(@l Bundle bundle0) {
        L.p(bundle0, "extras");
        this.extras = bundle0;
        return this;
    }

    @l
    public final e setPriority(int v) {
        this.priority = v;
        return this;
    }

    @l
    public final e setRequiredNetworkType(@b int v) {
        this.requiredNetworkType = v;
        return this;
    }

    @l
    public final e setReschedulePolicy(long v, int v1) {
        this.rescheduleTimeout = v;
        this.reschedulePolicy = v1;
        return this;
    }

    @l
    public final e setUpdateCurrent(boolean z) {
        this.updateCurrent = z;
        return this;
    }
}

