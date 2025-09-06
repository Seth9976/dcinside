package androidx.work.impl.utils;

import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data.Builder;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nEnqueueUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Data_.kt\nandroidx/work/Data\n*L\n1#1,168:1\n1774#2,4:169\n1747#2,3:177\n1#3:173\n229#4:174\n229#4:175\n229#4:176\n*S KotlinDebug\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n*L\n45#1:169,4\n140#1:177,3\n71#1:174\n72#1:175\n73#1:176\n*E\n"})
public final class EnqueueUtilsKt {
    @l
    public static final String a = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    @l
    public static final String b = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    @l
    public static final String c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
    @l
    public static final String d = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";

    public static final void a(@l WorkDatabase workDatabase0, @l Configuration configuration0, @l WorkContinuationImpl workContinuationImpl0) {
        int v1;
        L.p(workDatabase0, "workDatabase");
        L.p(configuration0, "configuration");
        L.p(workContinuationImpl0, "continuation");
        if(Build.VERSION.SDK_INT < 24) {
            return;
        }
        List list0 = u.S(new WorkContinuationImpl[]{workContinuationImpl0});
        int v = 0;
        while(!list0.isEmpty()) {
            WorkContinuationImpl workContinuationImpl1 = (WorkContinuationImpl)u.O0(list0);
            List list1 = workContinuationImpl1.n();
            L.o(list1, "current.work");
            Iterable iterable0 = list1;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                v1 = 0;
                for(Object object0: iterable0) {
                    if(((WorkRequest)object0).d().j.g()) {
                        ++v1;
                        if(v1 < 0) {
                            u.Y();
                        }
                    }
                }
            }
            else {
                v1 = 0;
            }
            v += v1;
            List list2 = workContinuationImpl1.m();
            if(list2 != null) {
                list0.addAll(list2);
            }
        }
        if(v == 0) {
            return;
        }
        int v2 = workDatabase0.Z().z();
        int v3 = configuration0.b();
        if(v2 + v > v3) {
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + v3 + ";\nalready enqueued count: " + v2 + ";\ncurrent enqueue operation count: " + v + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        }
    }

    @l
    public static final WorkSpec b(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        Constraints constraints0 = workSpec0.j;
        String s = workSpec0.c;
        Class class0 = ConstraintTrackingWorker.class;
        if(!L.g(s, "androidx.work.impl.workers.ConstraintTrackingWorker") && (constraints0.h() || constraints0.k())) {
            Data data0 = new Builder().c(workSpec0.e).r("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", s).a();
            String s1 = class0.getName();
            L.o(s1, "name");
            return WorkSpec.C(workSpec0, null, null, s1, null, data0, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 0xFFFFEB, null);
        }
        return workSpec0;
    }

    @VisibleForTesting
    @l
    public static final WorkSpec c(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        if(!workSpec0.e.u("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class) && workSpec0.e.u("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class) && workSpec0.e.u("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class)) {
            String s = workSpec0.c;
            return WorkSpec.C(workSpec0, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new Builder().c(workSpec0.e).r("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", s).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 0xFFFFEB, null);
        }
        return workSpec0;
    }

    private static final boolean d(List list0, String s) {
        try {
            Class class0 = Class.forName(s);
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    if(!class0.isAssignableFrom(((Scheduler)object0).getClass())) {
                        continue;
                    }
                    return true;
                }
            }
        }
        catch(ClassNotFoundException unused_ex) {
        }
        return false;
    }

    @l
    public static final WorkSpec e(@l List list0, @l WorkSpec workSpec0) {
        L.p(list0, "schedulers");
        L.p(workSpec0, "workSpec");
        WorkSpec workSpec1 = EnqueueUtilsKt.c(workSpec0);
        int v = Build.VERSION.SDK_INT;
        if(23 <= v && v < 26) {
            return EnqueueUtilsKt.b(workSpec1);
        }
        return v > 22 || !EnqueueUtilsKt.d(list0, "androidx.work.impl.background.gcm.GcmScheduler") ? workSpec1 : EnqueueUtilsKt.b(workSpec1);
    }
}

