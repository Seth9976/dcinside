package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.work.Configuration.Provider;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger.LogcatLogger;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.TracerKt;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.RawWorkInfoDaoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDaoKt;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.PruneWorkRunnableKt;
import androidx.work.impl.utils.RawQueries;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.S0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;

@RestrictTo({Scope.b})
public class WorkManagerImpl extends WorkManager {
    @RequiresApi(24)
    static class Api24Impl {
        static boolean a(Context context0) {
            return context0.isDeviceProtectedStorage();
        }
    }

    private Context b;
    private Configuration c;
    private WorkDatabase d;
    private TaskExecutor e;
    private List f;
    private Processor g;
    private PreferenceUtils h;
    private boolean i;
    private BroadcastReceiver.PendingResult j;
    private volatile RemoteWorkManager k;
    private final Trackers l;
    private final O m;
    private static final String n = null;
    public static final int o = 22;
    public static final int p = 23;
    public static final int q = 24;
    public static final String r = "androidx.work.multiprocess.RemoteWorkManagerClient";
    private static WorkManagerImpl s;
    private static WorkManagerImpl t;
    private static final Object u;

    static {
        WorkManagerImpl.n = "WM-WorkManagerImpl";
        WorkManagerImpl.s = null;
        WorkManagerImpl.t = null;
        WorkManagerImpl.u = new Object();
    }

    @RestrictTo({Scope.b})
    public WorkManagerImpl(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull TaskExecutor taskExecutor0, @NonNull WorkDatabase workDatabase0, @NonNull List list0, @NonNull Processor processor0, @NonNull Trackers trackers0) {
        this.i = false;
        Context context1 = context0.getApplicationContext();
        if(Build.VERSION.SDK_INT >= 24 && Api24Impl.a(context1)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        Logger.h(new LogcatLogger(configuration0.j()));
        this.b = context1;
        this.e = taskExecutor0;
        this.d = workDatabase0;
        this.g = processor0;
        this.l = trackers0;
        this.c = configuration0;
        this.f = list0;
        O o0 = WorkManagerImplExtKt.l(taskExecutor0);
        this.m = o0;
        this.h = new PreferenceUtils(this.d);
        Schedulers.g(list0, this.g, taskExecutor0.d(), this.d, configuration0);
        this.e.b(new ForceStopRunnable(context1, this));
        UnfinishedWorkListenerKt.c(o0, this.b, configuration0, workDatabase0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public i A(@NonNull WorkQuery workQuery0) {
        return RawWorkInfoDaoKt.a(this.d.V(), this.e.a(), RawQueries.b(workQuery0));
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public t0 B(@NonNull String s) {
        return StatusRunnable.d(this.d, this.e, s);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public i C(@NonNull String s) {
        return WorkSpecDaoKt.c(this.d.Z(), this.e.a(), s);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData D(@NonNull String s) {
        return LiveDataUtils.a(this.d.Z().s(s), WorkSpec.B, this.e);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData E(@NonNull WorkQuery workQuery0) {
        return LiveDataUtils.a(this.d.V().b(RawQueries.b(workQuery0)), WorkSpec.B, this.e);
    }

    @Override  // androidx.work.WorkManager
    @RestrictTo({Scope.b})
    public static void F(@NonNull Context context0, @NonNull Configuration configuration0) {
        synchronized(WorkManagerImpl.u) {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.s;
            if(workManagerImpl0 != null && WorkManagerImpl.t != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if(workManagerImpl0 == null) {
                Context context1 = context0.getApplicationContext();
                if(WorkManagerImpl.t == null) {
                    WorkManagerImpl.t = WorkManagerImplExtKt.e(context1, configuration0);
                }
                WorkManagerImpl.s = WorkManagerImpl.t;
            }
        }
    }

    @Override  // androidx.work.WorkManager
    @RestrictTo({Scope.b})
    public static boolean G() {
        return WorkManagerImpl.N() != null;
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation H() {
        return PruneWorkRunnableKt.a(this.d, this.c, this.e);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public t0 I(@NonNull WorkRequest workRequest0) {
        return WorkerUpdater.e(this, workRequest0);
    }

    public void K() {
        WorkManagerImplExtKt.b(this);
    }

    @NonNull
    public WorkContinuationImpl L(@NonNull String s, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy0, @NonNull PeriodicWorkRequest periodicWorkRequest0) {
        return existingPeriodicWorkPolicy0 == ExistingPeriodicWorkPolicy.b ? new WorkContinuationImpl(this, s, ExistingWorkPolicy.b, Collections.singletonList(periodicWorkRequest0)) : new WorkContinuationImpl(this, s, ExistingWorkPolicy.a, Collections.singletonList(periodicWorkRequest0));
    }

    @NonNull
    @RestrictTo({Scope.b})
    public Context M() {
        return this.b;
    }

    @Nullable
    @RestrictTo({Scope.b})
    @Deprecated
    public static WorkManagerImpl N() {
        synchronized(WorkManagerImpl.u) {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.s;
            if(workManagerImpl0 != null) {
                return workManagerImpl0;
            }
        }
        return WorkManagerImpl.t;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public static WorkManagerImpl O(@NonNull Context context0) {
        synchronized(WorkManagerImpl.u) {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.N();
            if(workManagerImpl0 == null) {
                Context context1 = context0.getApplicationContext();
                if(!(context1 instanceof Provider)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                WorkManagerImpl.F(context1, ((Provider)context1).a());
                return WorkManagerImpl.O(context1);
            }
            return workManagerImpl0;
        }
    }

    @NonNull
    @RestrictTo({Scope.b})
    public PreferenceUtils P() {
        return this.h;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public Processor Q() {
        return this.g;
    }

    @Nullable
    @RestrictTo({Scope.b})
    public RemoteWorkManager R() {
        if(this.k == null) {
            Object object0 = WorkManagerImpl.u;
            synchronized(object0) {
                if(this.k == null) {
                    this.e0();
                    if(this.k == null && !TextUtils.isEmpty(this.c.c())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.k;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public List S() {
        return this.f;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public Trackers T() {
        return this.l;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public WorkDatabase U() {
        return this.d;
    }

    LiveData V(@NonNull List list0) {
        return LiveDataUtils.a(this.d.Z().y(list0), WorkSpec.B, this.e);
    }

    @NonNull
    O W() {
        return this.m;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public TaskExecutor X() {
        return this.e;
    }

    // 检测为 Lambda 实现
    private S0 Y() [...]

    @RestrictTo({Scope.b})
    public void Z() {
        synchronized(WorkManagerImpl.u) {
            this.i = true;
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.j;
            if(broadcastReceiver$PendingResult0 != null) {
                broadcastReceiver$PendingResult0.finish();
                this.j = null;
            }
        }
    }

    public void a0() {
        TracerKt.a(this.o().n(), "ReschedulingWork", () -> {
            if(Build.VERSION.SDK_INT >= 23) {
                SystemJobScheduler.d(this.M());
            }
            this.U().Z().I();
            Schedulers.h(this.o(), this.U(), this.S());
            return S0.a;
        });
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public WorkContinuation b(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0) {
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, s, existingWorkPolicy0, list0);
    }

    @RestrictTo({Scope.b})
    public static void b0(@Nullable WorkManagerImpl workManagerImpl0) {
        synchronized(WorkManagerImpl.u) {
            WorkManagerImpl.s = workManagerImpl0;
        }
    }

    @RestrictTo({Scope.b})
    public void c0(@NonNull BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        synchronized(WorkManagerImpl.u) {
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult1 = this.j;
            if(broadcastReceiver$PendingResult1 != null) {
                broadcastReceiver$PendingResult1.finish();
            }
            this.j = broadcastReceiver$PendingResult0;
            if(this.i) {
                broadcastReceiver$PendingResult0.finish();
                this.j = null;
            }
        }
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public WorkContinuation d(@NonNull List list0) {
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, list0);
    }

    @RestrictTo({Scope.b})
    public void d0(@NonNull WorkGenerationalId workGenerationalId0, int v) {
        this.e.b(new StopWorkRunnable(this.g, new StartStopToken(workGenerationalId0), true, v));
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation e() {
        return CancelWorkRunnable.e(this);
    }

    private void e0() {
        try {
            this.k = (RemoteWorkManager)Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, WorkManagerImpl.class).newInstance(this.b, this);
        }
        catch(Throwable throwable0) {
            Logger.e().b("WM-WorkManagerImpl", "Unable to initialize multi-process support", throwable0);
        }
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation f(@NonNull String s) {
        return CancelWorkRunnable.j(s, this);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation g(@NonNull String s) {
        return CancelWorkRunnable.g(s, this);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation h(@NonNull UUID uUID0) {
        return CancelWorkRunnable.f(uUID0, this);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public PendingIntent i(@NonNull UUID uUID0) {
        Intent intent0 = SystemForegroundDispatcher.c(this.b, uUID0.toString());
        return Build.VERSION.SDK_INT < 0x1F ? PendingIntent.getService(this.b, 0, intent0, 0x8000000) : PendingIntent.getService(this.b, 0, intent0, 0xA000000);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation k(@NonNull List list0) {
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new WorkContinuationImpl(this, list0).c();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation l(@NonNull String s, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy0, @NonNull PeriodicWorkRequest periodicWorkRequest0) {
        return existingPeriodicWorkPolicy0 == ExistingPeriodicWorkPolicy.c ? WorkerUpdater.c(this, s, periodicWorkRequest0) : this.L(s, existingPeriodicWorkPolicy0, periodicWorkRequest0).c();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation n(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0) {
        return new WorkContinuationImpl(this, s, existingWorkPolicy0, list0).c();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Configuration o() {
        return this.c;
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public t0 r() {
        PreferenceUtils preferenceUtils0 = this.h;
        SerialExecutor serialExecutor0 = this.e.d();
        Objects.requireNonNull(preferenceUtils0);
        return ListenableFutureKt.f(serialExecutor0, "getLastCancelAllTimeMillis", new k(preferenceUtils0));
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData s() {
        return this.h.c();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public t0 t(@NonNull UUID uUID0) {
        return StatusRunnable.c(this.d, this.e, uUID0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public i u(@NonNull UUID uUID0) {
        return WorkSpecDaoKt.b(this.U().Z(), uUID0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData v(@NonNull UUID uUID0) {
        return LiveDataUtils.a(this.d.Z().y(Collections.singletonList(uUID0.toString())), new Function() {
            final WorkManagerImpl a;

            public WorkInfo a(List list0) {
                return list0 == null || list0.size() <= 0 ? null : ((WorkInfoPojo)list0.get(0)).S();
            }

            @Override  // androidx.arch.core.util.Function
            public Object apply(Object object0) {
                return this.a(((List)object0));
            }
        }, this.e);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public t0 w(@NonNull WorkQuery workQuery0) {
        return StatusRunnable.e(this.d, this.e, workQuery0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public t0 x(@NonNull String s) {
        return StatusRunnable.b(this.d, this.e, s);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public i y(@NonNull String s) {
        return WorkSpecDaoKt.d(this.d.Z(), this.e.a(), s);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData z(@NonNull String s) {
        return LiveDataUtils.a(this.d.Z().u(s), WorkSpec.B, this.e);
    }
}

