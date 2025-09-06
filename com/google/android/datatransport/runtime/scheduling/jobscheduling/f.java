package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

public final class f implements Runnable {
    public final JobInfoSchedulerService a;
    public final JobParameters b;

    public f(JobInfoSchedulerService jobInfoSchedulerService0, JobParameters jobParameters0) {
        this.a = jobInfoSchedulerService0;
        this.b = jobParameters0;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

