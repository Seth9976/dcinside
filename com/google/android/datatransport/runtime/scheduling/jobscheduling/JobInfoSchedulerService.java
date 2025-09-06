package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.r.a;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.w;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    // 检测为 Lambda 实现
    private void b(JobParameters jobParameters0) [...]

    @Override  // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters0) {
        String s = jobParameters0.getExtras().getString("backendName");
        String s1 = jobParameters0.getExtras().getString("extras");
        int v = jobParameters0.getExtras().getInt("priority");
        int v1 = jobParameters0.getExtras().getInt("attemptNumber");
        w.f(this.getApplicationContext());
        a r$a0 = r.a().b(s).d(C1.a.b(v));
        if(s1 != null) {
            r$a0.c(Base64.decode(s1, 0));
        }
        w.c().e().v(r$a0.a(), v1, () -> this.jobFinished(jobParameters0, false));
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters0) {
        return true;
    }
}

