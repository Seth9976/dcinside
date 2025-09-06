package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(21)
final class JobScheduler21 {
    @l
    public static final JobScheduler21 a;

    static {
        JobScheduler21.a = new JobScheduler21();
    }

    @l
    public final List a(@l JobScheduler jobScheduler0) {
        L.p(jobScheduler0, "jobScheduler");
        List list0 = jobScheduler0.getAllPendingJobs();
        L.o(list0, "jobScheduler.allPendingJobs");
        return list0;
    }
}

