package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(34)
final class JobScheduler34 {
    @l
    public static final JobScheduler34 a;

    static {
        JobScheduler34.a = new JobScheduler34();
    }

    @l
    public final JobScheduler a(@l JobScheduler jobScheduler0) {
        L.p(jobScheduler0, "jobScheduler");
        JobScheduler jobScheduler1 = jobScheduler0.forNamespace("androidx.work.systemjobscheduler");
        L.o(jobScheduler1, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobScheduler1;
    }
}

