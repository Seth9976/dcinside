package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

@RequiresApi(23)
@RestrictTo({Scope.b})
public class SystemJobScheduler implements Scheduler {
    private final Context a;
    private final JobScheduler b;
    private final SystemJobInfoConverter c;
    private final WorkDatabase d;
    private final Configuration e;
    private static final String f;

    static {
        SystemJobScheduler.f = "WM-SystemJobScheduler";
    }

    public SystemJobScheduler(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, @NonNull Configuration configuration0) {
        this(context0, workDatabase0, configuration0, JobSchedulerExtKt.c(context0), new SystemJobInfoConverter(context0, configuration0.a(), configuration0.s()));
    }

    @VisibleForTesting
    public SystemJobScheduler(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, @NonNull Configuration configuration0, @NonNull JobScheduler jobScheduler0, @NonNull SystemJobInfoConverter systemJobInfoConverter0) {
        this.a = context0;
        this.b = jobScheduler0;
        this.c = systemJobInfoConverter0;
        this.d = workDatabase0;
        this.e = configuration0;
    }

    @Override  // androidx.work.impl.Scheduler
    public boolean a() {
        return true;
    }

    @Override  // androidx.work.impl.Scheduler
    public void b(@NonNull String s) {
        List list0 = SystemJobScheduler.f(this.a, this.b, s);
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                SystemJobScheduler.e(this.b, ((int)(((Integer)object0))));
            }
            this.d.W().g(s);
        }
    }

    @Override  // androidx.work.impl.Scheduler
    public void c(@NonNull WorkSpec[] arr_workSpec) {
        IdGenerator idGenerator0 = new IdGenerator(this.d);
        for(int v = 0; v < arr_workSpec.length; ++v) {
            WorkSpec workSpec0 = arr_workSpec[v];
            this.d.e();
            try {
                WorkSpec workSpec1 = this.d.Z().G(workSpec0.a);
                if(workSpec1 == null) {
                    Logger.e().l("WM-SystemJobScheduler", "Skipping scheduling " + workSpec0.a + " because it\'s no longer in the DB");
                }
                else if(workSpec1.b == State.a) {
                    WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(workSpec0);
                    SystemIdInfo systemIdInfo0 = this.d.W().d(workGenerationalId0);
                    int v2 = systemIdInfo0 == null ? idGenerator0.e(this.e.i(), this.e.g()) : systemIdInfo0.c;
                    if(systemIdInfo0 == null) {
                        SystemIdInfo systemIdInfo1 = SystemIdInfoKt.a(workGenerationalId0, v2);
                        this.d.W().c(systemIdInfo1);
                    }
                    this.j(workSpec0, v2);
                    if(Build.VERSION.SDK_INT == 23) {
                        List list0 = SystemJobScheduler.f(this.a, this.b, workSpec0.a);
                        if(list0 != null) {
                            int v3 = list0.indexOf(v2);
                            if(v3 >= 0) {
                                list0.remove(v3);
                            }
                            this.j(workSpec0, (list0.isEmpty() ? idGenerator0.e(this.e.i(), this.e.g()) : ((int)(((Integer)list0.get(0))))));
                        }
                    }
                }
                else {
                    Logger.e().l("WM-SystemJobScheduler", "Skipping scheduling " + workSpec0.a + " because it is no longer enqueued");
                }
                this.d.Q();
            }
            finally {
                this.d.k();
            }
        }
    }

    public static void d(@NonNull Context context0) {
        if(Build.VERSION.SDK_INT >= 34) {
            JobSchedulerExtKt.c(context0).cancelAll();
        }
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        List list0 = SystemJobScheduler.g(context0, jobScheduler0);
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                SystemJobScheduler.e(jobScheduler0, ((JobInfo)object0).getId());
            }
        }
    }

    private static void e(@NonNull JobScheduler jobScheduler0, int v) {
        try {
            jobScheduler0.cancel(v);
        }
        catch(Throwable throwable0) {
            Logger.e().d("WM-SystemJobScheduler", String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", v), throwable0);
        }
    }

    @Nullable
    private static List f(@NonNull Context context0, @NonNull JobScheduler jobScheduler0, @NonNull String s) {
        List list0 = SystemJobScheduler.g(context0, jobScheduler0);
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList(2);
        for(Object object0: list0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            WorkGenerationalId workGenerationalId0 = SystemJobScheduler.h(jobInfo0);
            if(workGenerationalId0 != null && s.equals(workGenerationalId0.f())) {
                list1.add(jobInfo0.getId());
            }
        }
        return list1;
    }

    @Nullable
    static List g(@NonNull Context context0, @NonNull JobScheduler jobScheduler0) {
        List list0 = JobSchedulerExtKt.b(jobScheduler0);
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList(list0.size());
        ComponentName componentName0 = new ComponentName(context0, SystemJobService.class);
        for(Object object0: list0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            if(componentName0.equals(jobInfo0.getService())) {
                list1.add(jobInfo0);
            }
        }
        return list1;
    }

    @Nullable
    private static WorkGenerationalId h(@NonNull JobInfo jobInfo0) {
        PersistableBundle persistableBundle0 = jobInfo0.getExtras();
        if(persistableBundle0 != null) {
            try {
                if(persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                    int v = persistableBundle0.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                    return new WorkGenerationalId(persistableBundle0.getString("EXTRA_WORK_SPEC_ID"), v);
                }
                return null;
            }
            catch(NullPointerException unused_ex) {
            }
        }
        return null;
    }

    public static boolean i(@NonNull Context context0, @NonNull WorkDatabase workDatabase0) {
        JobScheduler jobScheduler0 = JobSchedulerExtKt.c(context0);
        List list0 = SystemJobScheduler.g(context0, jobScheduler0);
        List list1 = workDatabase0.W().e();
        boolean z = false;
        HashSet hashSet0 = new HashSet((list0 == null ? 0 : list0.size()));
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                JobInfo jobInfo0 = (JobInfo)object0;
                WorkGenerationalId workGenerationalId0 = SystemJobScheduler.h(jobInfo0);
                if(workGenerationalId0 == null) {
                    SystemJobScheduler.e(jobScheduler0, jobInfo0.getId());
                }
                else {
                    hashSet0.add(workGenerationalId0.f());
                }
            }
        }
        for(Object object1: list1) {
            if(!hashSet0.contains(((String)object1))) {
                Logger.e().a("WM-SystemJobScheduler", "Reconciling jobs");
                z = true;
                break;
            }
            if(false) {
                break;
            }
        }
        if(z) {
            workDatabase0.e();
            try {
                WorkSpecDao workSpecDao0 = workDatabase0.Z();
                for(Object object2: list1) {
                    workSpecDao0.J(((String)object2), -1L);
                }
                workDatabase0.Q();
                return true;
            }
            finally {
                workDatabase0.k();
            }
        }
        return false;
    }

    @VisibleForTesting
    public void j(@NonNull WorkSpec workSpec0, int v) {
        JobInfo jobInfo0 = this.c.a(workSpec0, v);
        Logger.e().a("WM-SystemJobScheduler", "Scheduling work ID " + workSpec0.a + "Job ID " + v);
        try {
            if(this.b.schedule(jobInfo0) == 0) {
                Logger.e().l("WM-SystemJobScheduler", "Unable to schedule work ID " + workSpec0.a);
                if(workSpec0.q && workSpec0.r == OutOfQuotaPolicy.a) {
                    workSpec0.q = false;
                    Logger.e().a("WM-SystemJobScheduler", String.format("Scheduling a non-expedited job (work ID %s)", workSpec0.a));
                    this.j(workSpec0, v);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            String s = JobSchedulerExtKt.a(this.a, this.d, this.e);
            Logger.e().c("WM-SystemJobScheduler", s);
            IllegalStateException illegalStateException1 = new IllegalStateException(s, illegalStateException0);
            Consumer consumer0 = this.e.l();
            if(consumer0 == null) {
                throw illegalStateException1;
            }
            consumer0.accept(illegalStateException1);
        }
        catch(Throwable throwable0) {
            Logger.e().d("WM-SystemJobScheduler", "Unable to schedule " + workSpec0, throwable0);
        }
    }
}

