package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmScheduler;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({Scope.b})
public class Schedulers {
    public static final String a = "androidx.work.impl.background.gcm.GcmScheduler";
    private static final String b;

    static {
        Schedulers.b = "WM-Schedulers";
    }

    @NonNull
    static Scheduler c(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, Configuration configuration0) {
        Scheduler scheduler0;
        if(Build.VERSION.SDK_INT >= 23) {
            scheduler0 = new SystemJobScheduler(context0, workDatabase0, configuration0);
            PackageManagerHelper.e(context0, SystemJobService.class, true);
            Logger.e().a("WM-Schedulers", "Created SystemJobScheduler and enabled SystemJobService");
            return scheduler0;
        }
        scheduler0 = Schedulers.i(context0, configuration0.a());
        if(scheduler0 == null) {
            scheduler0 = new SystemAlarmScheduler(context0);
            PackageManagerHelper.e(context0, SystemAlarmService.class, true);
            Logger.e().a("WM-Schedulers", "Created SystemAlarmScheduler");
        }
        return scheduler0;
    }

    // 检测为 Lambda 实现
    private static void d(List list0, WorkGenerationalId workGenerationalId0, Configuration configuration0, WorkDatabase workDatabase0) [...]

    // 检测为 Lambda 实现
    private static void e(Executor executor0, List list0, Configuration configuration0, WorkDatabase workDatabase0, WorkGenerationalId workGenerationalId0, boolean z) [...]

    private static void f(WorkSpecDao workSpecDao0, Clock clock0, List list0) {
        if(list0.size() > 0) {
            long v = clock0.currentTimeMillis();
            for(Object object0: list0) {
                workSpecDao0.J(((WorkSpec)object0).a, v);
            }
        }
    }

    public static void g(@NonNull List list0, @NonNull Processor processor0, @NonNull Executor executor0, @NonNull WorkDatabase workDatabase0, @NonNull Configuration configuration0) {
        processor0.e((WorkGenerationalId workGenerationalId0, boolean z) -> executor0.execute(() -> {
            for(Object object0: list0) {
                ((Scheduler)object0).b(workGenerationalId0.f());
            }
            Schedulers.h(configuration0, workDatabase0, list0);
        }));
    }

    public static void h(@NonNull Configuration configuration0, @NonNull WorkDatabase workDatabase0, @Nullable List list0) {
        List list3;
        List list2;
        List list1;
        if(list0 != null && list0.size() != 0) {
            WorkSpecDao workSpecDao0 = workDatabase0.Z();
            workDatabase0.e();
            try {
                if(Build.VERSION.SDK_INT >= 24) {
                    list1 = workSpecDao0.w();
                    Schedulers.f(workSpecDao0, configuration0.a(), list1);
                }
                else {
                    list1 = null;
                }
                list2 = workSpecDao0.M(configuration0.h());
                Schedulers.f(workSpecDao0, configuration0.a(), list2);
                if(list1 != null) {
                    list2.addAll(list1);
                }
                list3 = workSpecDao0.o(200);
                workDatabase0.Q();
            }
            finally {
                workDatabase0.k();
            }
            if(list2.size() > 0) {
                WorkSpec[] arr_workSpec = (WorkSpec[])list2.toArray(new WorkSpec[list2.size()]);
                for(Object object0: list0) {
                    Scheduler scheduler0 = (Scheduler)object0;
                    if(scheduler0.a()) {
                        scheduler0.c(arr_workSpec);
                    }
                }
            }
            if(list3.size() > 0) {
                WorkSpec[] arr_workSpec1 = (WorkSpec[])list3.toArray(new WorkSpec[list3.size()]);
                for(Object object1: list0) {
                    Scheduler scheduler1 = (Scheduler)object1;
                    if(!scheduler1.a()) {
                        scheduler1.c(arr_workSpec1);
                    }
                }
            }
        }
    }

    @Nullable
    private static Scheduler i(@NonNull Context context0, Clock clock0) {
        try {
            Scheduler scheduler0 = (Scheduler)Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class, Clock.class).newInstance(context0, clock0);
            Logger.e().a("WM-Schedulers", "Created androidx.work.impl.background.gcm.GcmScheduler");
            return scheduler0;
        }
        catch(Throwable throwable0) {
            Logger.e().b("WM-Schedulers", "Unable to create GCM Scheduler", throwable0);
            return null;
        }
    }
}

