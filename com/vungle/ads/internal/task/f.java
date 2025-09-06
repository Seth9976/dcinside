package com.vungle.ads.internal.task;

import android.os.Process;
import com.vungle.ads.internal.util.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f extends i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion;
    private static final String TAG;
    @l
    private final d creator;
    @l
    private final g jobRunner;
    @l
    private final e jobinfo;
    @m
    private final k threadPriorityHelper;

    static {
        f.Companion = new a(null);
        f.TAG = "f";
    }

    public f(@l e e0, @l d d0, @l g g0, @m k k0) {
        L.p(e0, "jobinfo");
        L.p(d0, "creator");
        L.p(g0, "jobRunner");
        super();
        this.jobinfo = e0;
        this.creator = d0;
        this.jobRunner = g0;
        this.threadPriorityHelper = k0;
    }

    @Override  // com.vungle.ads.internal.task.i
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    public static void getPriority$annotations() {
    }

    @Override
    public void run() {
        k k0 = this.threadPriorityHelper;
        if(k0 != null) {
            try {
                int v = k0.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(v);
                L.o("f", "TAG");
                p.Companion.d("f", "Setting process thread prio = " + v + " for " + this.jobinfo.getJobTag());
            }
            catch(Throwable unused_ex) {
                L.o("f", "TAG");
                p.Companion.e("f", "Error on setting process thread priority");
            }
        }
        try {
            String s = this.jobinfo.getJobTag();
            com.vungle.ads.internal.util.p.a p$a0 = p.Companion;
            L.o("f", "TAG");
            p$a0.d("f", "Start job " + s + "Thread " + "jeb-dexdec-sb-st-11588");
            int v1 = this.creator.create(s).onRunJob(this.jobinfo.getExtras(), this.jobRunner);
            L.o("f", "TAG");
            p$a0.d("f", "On job finished " + s + " with result " + v1);
            if(v1 == 2) {
                long v2 = this.jobinfo.makeNextRescedule();
                if(v2 > 0L) {
                    this.jobinfo.setDelay(v2);
                    this.jobRunner.execute(this.jobinfo);
                    L.o("f", "TAG");
                    p$a0.d("f", "Rescheduling " + s + " in " + v2);
                }
            }
        }
        catch(Exception exception0) {
            L.o("f", "TAG");
            p.Companion.e("f", "Cannot create job" + exception0.getLocalizedMessage());
        }
    }
}

