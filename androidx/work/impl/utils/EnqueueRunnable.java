package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.WorkRequest;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo({Scope.b})
public class EnqueueRunnable {
    private static final String a;

    static {
        EnqueueRunnable.a = "WM-EnqueueRunnable";
    }

    @VisibleForTesting
    public static boolean a(@NonNull WorkContinuationImpl workContinuationImpl0) {
        WorkManagerImpl workManagerImpl0 = workContinuationImpl0.o();
        WorkDatabase workDatabase0 = workManagerImpl0.U();
        workDatabase0.e();
        try {
            EnqueueUtilsKt.a(workDatabase0, workManagerImpl0.o(), workContinuationImpl0);
            boolean z = EnqueueRunnable.e(workContinuationImpl0);
            workDatabase0.Q();
            return z;
        }
        finally {
            workDatabase0.k();
        }
    }

    public static void b(@NonNull WorkContinuationImpl workContinuationImpl0) {
        if(workContinuationImpl0.p()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + workContinuationImpl0 + ")");
        }
        if(EnqueueRunnable.a(workContinuationImpl0)) {
            EnqueueRunnable.f(workContinuationImpl0);
        }
    }

    private static boolean c(@NonNull WorkContinuationImpl workContinuationImpl0) {
        boolean z = EnqueueRunnable.d(workContinuationImpl0.o(), workContinuationImpl0.n(), ((String[])WorkContinuationImpl.u(workContinuationImpl0).toArray(new String[0])), workContinuationImpl0.l(), workContinuationImpl0.j());
        workContinuationImpl0.t();
        return z;
    }

    private static boolean d(WorkManagerImpl workManagerImpl0, @NonNull List list0, String[] arr_s, String s, ExistingWorkPolicy existingWorkPolicy0) {
        DependencyDao dependencyDao1;
        boolean z4;
        boolean z2;
        boolean z1;
        int v3;
        long v = workManagerImpl0.o().a().currentTimeMillis();
        WorkDatabase workDatabase0 = workManagerImpl0.U();
        boolean z = arr_s != null && arr_s.length > 0;
        if(z) {
            int v1 = arr_s.length;
            v3 = 1;
            z1 = false;
            z2 = false;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s1 = arr_s[v2];
                WorkSpec workSpec0 = workDatabase0.Z().G(s1);
                if(workSpec0 == null) {
                    Logger.e().c("WM-EnqueueRunnable", "Prerequisite " + s1 + " doesn\'t exist; not enqueuing");
                    return false;
                }
                State workInfo$State0 = workSpec0.b;
                v3 &= (workInfo$State0 == State.c ? 1 : 0);
                if(workInfo$State0 == State.d) {
                    z2 = true;
                }
                else if(workInfo$State0 == State.f) {
                    z1 = true;
                }
            }
        }
        else {
            v3 = 1;
            z1 = false;
            z2 = false;
        }
        boolean z3 = TextUtils.isEmpty(s);
        if(z3 || z) {
            z4 = false;
        }
        else {
            List list1 = workDatabase0.Z().K(s);
            if(list1.isEmpty()) {
                z4 = false;
            }
            else if(existingWorkPolicy0 != ExistingWorkPolicy.c && existingWorkPolicy0 != ExistingWorkPolicy.d) {
                if(existingWorkPolicy0 == ExistingWorkPolicy.b) {
                    for(Object object0: list1) {
                        State workInfo$State1 = ((IdAndState)object0).b;
                        if(workInfo$State1 == State.a || workInfo$State1 == State.b) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                CancelWorkRunnable.h(s, workManagerImpl0);
                WorkSpecDao workSpecDao0 = workDatabase0.Z();
                for(Object object1: list1) {
                    workSpecDao0.b(((IdAndState)object1).a);
                }
                z4 = true;
            }
            else {
                DependencyDao dependencyDao0 = workDatabase0.T();
                List list2 = new ArrayList();
                for(Object object2: list1) {
                    IdAndState workSpec$IdAndState0 = (IdAndState)object2;
                    if(dependencyDao0.e(workSpec$IdAndState0.a)) {
                        dependencyDao1 = dependencyDao0;
                    }
                    else {
                        State workInfo$State2 = workSpec$IdAndState0.b;
                        dependencyDao1 = dependencyDao0;
                        int v4 = workInfo$State2 == State.c ? 1 : 0;
                        if(workInfo$State2 == State.d) {
                            z2 = true;
                        }
                        else if(workInfo$State2 == State.f) {
                            z1 = true;
                        }
                        list2.add(workSpec$IdAndState0.a);
                        v3 &= v4;
                    }
                    dependencyDao0 = dependencyDao1;
                }
                if(existingWorkPolicy0 == ExistingWorkPolicy.d && (z1 || z2)) {
                    WorkSpecDao workSpecDao1 = workDatabase0.Z();
                    for(Object object3: workSpecDao1.K(s)) {
                        workSpecDao1.b(((IdAndState)object3).a);
                    }
                    list2 = Collections.emptyList();
                    z1 = false;
                    z2 = false;
                }
                arr_s = (String[])list2.toArray(arr_s);
                z = arr_s.length > 0;
                z4 = false;
            }
        }
        for(Object object4: list0) {
            WorkRequest workRequest0 = (WorkRequest)object4;
            WorkSpec workSpec1 = workRequest0.d();
            if(!z || v3 != 0) {
                workSpec1.n = v;
            }
            else if(z2) {
                workSpec1.b = State.d;
            }
            else if(z1) {
                workSpec1.b = State.f;
            }
            else {
                workSpec1.b = State.e;
            }
            if(workSpec1.b == State.a) {
                z4 = true;
            }
            workDatabase0.Z().f(EnqueueUtilsKt.e(workManagerImpl0.S(), workSpec1));
            if(z) {
                for(int v5 = 0; v5 < arr_s.length; ++v5) {
                    String s2 = arr_s[v5];
                    Dependency dependency0 = new Dependency(workRequest0.b(), s2);
                    workDatabase0.T().a(dependency0);
                }
            }
            workDatabase0.a0().b(workRequest0.b(), workRequest0.c());
            if(!z3) {
                workDatabase0.X().a(new WorkName(s, workRequest0.b()));
            }
        }
        return z4;
    }

    private static boolean e(@NonNull WorkContinuationImpl workContinuationImpl0) {
        List list0 = workContinuationImpl0.m();
        boolean z = false;
        if(list0 != null) {
            for(Object object0: list0) {
                WorkContinuationImpl workContinuationImpl1 = (WorkContinuationImpl)object0;
                if(workContinuationImpl1.r()) {
                    Logger.e().l("WM-EnqueueRunnable", "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl1.k()) + ")");
                }
                else {
                    z |= EnqueueRunnable.e(workContinuationImpl1);
                }
            }
        }
        return EnqueueRunnable.c(workContinuationImpl0) | z;
    }

    @VisibleForTesting
    public static void f(@NonNull WorkContinuationImpl workContinuationImpl0) {
        WorkManagerImpl workManagerImpl0 = workContinuationImpl0.o();
        Schedulers.h(workManagerImpl0.o(), workManagerImpl0.U(), workManagerImpl0.S());
    }
}

