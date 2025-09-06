package androidx.media3.exoplayer.scheduler;

import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@RequiresApi(21)
@UnstableApi
public final class PlatformScheduler implements Scheduler {
    public static final class PlatformSchedulerService extends JobService {
        @Override  // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters0) {
            PersistableBundle persistableBundle0 = jobParameters0.getExtras();
            int v = new Requirements(persistableBundle0.getInt("requirements")).e(this);
            if(v == 0) {
                String s = (String)Assertions.g(persistableBundle0.getString("service_action"));
                String s1 = (String)Assertions.g(persistableBundle0.getString("service_package"));
                Util.p2(this, new Intent(s).setPackage(s1));
                return false;
            }
            Log.n("PlatformScheduler", "Requirements not met: " + v);
            this.jobFinished(jobParameters0, true);
            return false;
        }

        @Override  // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters0) {
            return false;
        }
    }

    private final int a;
    private final ComponentName b;
    private final JobScheduler c;
    private static final String d = "PlatformScheduler";
    private static final String e = "service_action";
    private static final String f = "service_package";
    private static final String g = "requirements";
    private static final int h;

    static {
        PlatformScheduler.h = (Util.a < 26 ? 0 : 16) | 15;
    }

    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context0, int v) {
        Context context1 = context0.getApplicationContext();
        this.a = v;
        this.b = new ComponentName(context1, PlatformSchedulerService.class);
        this.c = (JobScheduler)Assertions.g(((JobScheduler)context1.getSystemService("jobscheduler")));
    }

    @Override  // androidx.media3.exoplayer.scheduler.Scheduler
    public boolean a(Requirements requirements0, String s, String s1) {
        JobInfo jobInfo0 = PlatformScheduler.c(this.a, this.b, requirements0, s1, s);
        return this.c.schedule(jobInfo0) == 1;
    }

    @Override  // androidx.media3.exoplayer.scheduler.Scheduler
    public Requirements b(Requirements requirements0) {
        return requirements0.c(PlatformScheduler.h);
    }

    private static JobInfo c(int v, ComponentName componentName0, Requirements requirements0, String s, String s1) {
        Requirements requirements1 = requirements0.c(PlatformScheduler.h);
        if(!requirements1.equals(requirements0)) {
            Log.n("PlatformScheduler", "Ignoring unsupported requirements: " + (requirements1.f() ^ requirements0.f()));
        }
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v, componentName0);
        if(requirements0.s()) {
            jobInfo$Builder0.setRequiredNetworkType(2);
        }
        else if(requirements0.o()) {
            jobInfo$Builder0.setRequiredNetworkType(1);
        }
        jobInfo$Builder0.setRequiresDeviceIdle(requirements0.l());
        jobInfo$Builder0.setRequiresCharging(requirements0.g());
        if(Util.a >= 26 && requirements0.r()) {
            jobInfo$Builder0.setRequiresStorageNotLow(true);
        }
        jobInfo$Builder0.setPersisted(true);
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("service_action", s);
        persistableBundle0.putString("service_package", s1);
        persistableBundle0.putInt("requirements", requirements0.f());
        jobInfo$Builder0.setExtras(persistableBundle0);
        return jobInfo$Builder0.build();
    }

    @Override  // androidx.media3.exoplayer.scheduler.Scheduler
    public boolean cancel() {
        this.c.cancel(this.a);
        return true;
    }
}

