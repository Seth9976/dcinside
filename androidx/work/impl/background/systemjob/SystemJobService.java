package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.f;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(23)
@RestrictTo({Scope.b})
public class SystemJobService extends JobService implements ExecutionListener {
    @RequiresApi(24)
    static class Api24Impl {
        static String[] a(JobParameters jobParameters0) {
            return jobParameters0.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters0) {
            return jobParameters0.getTriggeredContentUris();
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static Network a(JobParameters jobParameters0) {
            return jobParameters0.getNetwork();
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static int a(JobParameters jobParameters0) {
            return SystemJobService.b(jobParameters0.getStopReason());
        }
    }

    private WorkManagerImpl a;
    private final Map b;
    private final StartStopTokens c;
    private WorkLauncher d;
    private static final String e;

    static {
        SystemJobService.e = "WM-SystemJobService";
    }

    public SystemJobService() {
        this.b = new HashMap();
        this.c = f.d(false);
    }

    private static void a(String s) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke " + s + " on a background thread");
        }
    }

    static int b(int v) {
        switch(v) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return v;
            }
            default: {
                return 0xFFFFFE00;
            }
        }
    }

    @Nullable
    private static WorkGenerationalId c(@NonNull JobParameters jobParameters0) {
        try {
            PersistableBundle persistableBundle0 = jobParameters0.getExtras();
            return persistableBundle0 == null || !persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID") ? null : new WorkGenerationalId(persistableBundle0.getString("EXTRA_WORK_SPEC_ID"), persistableBundle0.getInt("EXTRA_WORK_SPEC_GENERATION"));
        }
        catch(NullPointerException unused_ex) {
        }
        return null;
    }

    @Override  // androidx.work.impl.ExecutionListener
    @MainThread
    public void d(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        SystemJobService.a("onExecuted");
        Logger.e().a("WM-SystemJobService", workGenerationalId0.f() + " executed on JobScheduler");
        JobParameters jobParameters0 = (JobParameters)this.b.remove(workGenerationalId0);
        this.c.c(workGenerationalId0);
        if(jobParameters0 != null) {
            this.jobFinished(jobParameters0, z);
        }
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.O(this.getApplicationContext());
            this.a = workManagerImpl0;
            Processor processor0 = workManagerImpl0.Q();
            this.d = new WorkLauncherImpl(processor0, this.a.X());
            processor0.e(this);
        }
        catch(IllegalStateException illegalStateException0) {
            Class class0 = this.getApplication().getClass();
            if(!Application.class.equals(class0)) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException0);
            }
            Logger.e().l("WM-SystemJobService", "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl0 = this.a;
        if(workManagerImpl0 != null) {
            workManagerImpl0.Q().q(this);
        }
    }

    @Override  // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters0) {
        RuntimeExtras workerParameters$RuntimeExtras0;
        SystemJobService.a("onStartJob");
        if(this.a == null) {
            Logger.e().a("WM-SystemJobService", "WorkManager is not initialized; requesting retry.");
            this.jobFinished(jobParameters0, true);
            return false;
        }
        WorkGenerationalId workGenerationalId0 = SystemJobService.c(jobParameters0);
        if(workGenerationalId0 == null) {
            Logger.e().c("WM-SystemJobService", "WorkSpec id not found!");
            return false;
        }
        if(this.b.containsKey(workGenerationalId0)) {
            Logger.e().a("WM-SystemJobService", "Job is already being executed by SystemJobService: " + workGenerationalId0);
            return false;
        }
        Logger.e().a("WM-SystemJobService", "onStartJob for " + workGenerationalId0);
        this.b.put(workGenerationalId0, jobParameters0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 24) {
            workerParameters$RuntimeExtras0 = new RuntimeExtras();
            if(Api24Impl.b(jobParameters0) != null) {
                workerParameters$RuntimeExtras0.b = Arrays.asList(Api24Impl.b(jobParameters0));
            }
            if(Api24Impl.a(jobParameters0) != null) {
                workerParameters$RuntimeExtras0.a = Arrays.asList(Api24Impl.a(jobParameters0));
            }
            if(v >= 28) {
                workerParameters$RuntimeExtras0.c = Api28Impl.a(jobParameters0);
            }
        }
        else {
            workerParameters$RuntimeExtras0 = null;
        }
        this.d.c(this.c.e(workGenerationalId0), workerParameters$RuntimeExtras0);
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters0) {
        SystemJobService.a("onStopJob");
        if(this.a == null) {
            Logger.e().a("WM-SystemJobService", "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalId0 = SystemJobService.c(jobParameters0);
        if(workGenerationalId0 == null) {
            Logger.e().c("WM-SystemJobService", "WorkSpec id not found!");
            return false;
        }
        Logger.e().a("WM-SystemJobService", "onStopJob for " + workGenerationalId0);
        this.b.remove(workGenerationalId0);
        StartStopToken startStopToken0 = this.c.c(workGenerationalId0);
        if(startStopToken0 != null) {
            int v = Build.VERSION.SDK_INT < 0x1F ? 0xFFFFFE00 : Api31Impl.a(jobParameters0);
            this.d.a(startStopToken0, v);
        }
        return !this.a.Q().k(workGenerationalId0.f());
    }
}

