package androidx.work.impl;

import A3.o;
import A3.s;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.R.bool;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.j;
import y4.l;
import z3.i;

public final class WorkManagerImplExtKt {
    public static final void b(@l WorkManagerImpl workManagerImpl0) {
        L.p(workManagerImpl0, "<this>");
        j.b(null, new o(workManagerImpl0, null) {
            int k;
            final WorkManagerImpl l;

            {
                this.l = workManagerImpl0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.impl.WorkManagerImplExtKt.close.1(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.impl.WorkManagerImplExtKt.close.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        kotlin.coroutines.g.b g$b0 = this.l.W().getCoroutineContext().get(I0.B8);
                        L.m(g$b0);
                        this.k = 1;
                        return M0.l(((I0)g$b0), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 1, null);
        workManagerImpl0.U().g();
    }

    private static final List c(Context context0, Configuration configuration0, TaskExecutor taskExecutor0, WorkDatabase workDatabase0, Trackers trackers0, Processor processor0) {
        Scheduler scheduler0 = Schedulers.c(context0, workDatabase0, configuration0);
        L.o(scheduler0, "createBestAvailableBackg…kDatabase, configuration)");
        return u.O(new Scheduler[]{scheduler0, new GreedyScheduler(context0, configuration0, trackers0, processor0, new WorkLauncherImpl(processor0, taskExecutor0), taskExecutor0)});
    }

    @l
    @i(name = "createTestWorkManager")
    public static final WorkManagerImpl d(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "workTaskExecutor");
        SerialExecutor serialExecutor0 = taskExecutor0.d();
        L.o(serialExecutor0, "workTaskExecutor.serialTaskExecutor");
        return WorkManagerImplExtKt.k(context0, configuration0, taskExecutor0, WorkDatabase.q.b(context0, serialExecutor0, configuration0.a(), true), null, null, null, 0x70, null);
    }

    @l
    @i(name = "createWorkManager")
    @z3.j
    public static final WorkManagerImpl e(@l Context context0, @l Configuration configuration0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        return WorkManagerImplExtKt.k(context0, configuration0, null, null, null, null, null, 0x7C, null);
    }

    @l
    @i(name = "createWorkManager")
    @z3.j
    public static final WorkManagerImpl f(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "workTaskExecutor");
        return WorkManagerImplExtKt.k(context0, configuration0, taskExecutor0, null, null, null, null, 120, null);
    }

    @l
    @i(name = "createWorkManager")
    @z3.j
    public static final WorkManagerImpl g(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0, @l WorkDatabase workDatabase0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "workTaskExecutor");
        L.p(workDatabase0, "workDatabase");
        return WorkManagerImplExtKt.k(context0, configuration0, taskExecutor0, workDatabase0, null, null, null, 0x70, null);
    }

    @l
    @i(name = "createWorkManager")
    @z3.j
    public static final WorkManagerImpl h(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0, @l WorkDatabase workDatabase0, @l Trackers trackers0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "workTaskExecutor");
        L.p(workDatabase0, "workDatabase");
        L.p(trackers0, "trackers");
        return WorkManagerImplExtKt.k(context0, configuration0, taskExecutor0, workDatabase0, trackers0, null, null, 0x60, null);
    }

    @l
    @i(name = "createWorkManager")
    @z3.j
    public static final WorkManagerImpl i(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0, @l WorkDatabase workDatabase0, @l Trackers trackers0, @l Processor processor0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "workTaskExecutor");
        L.p(workDatabase0, "workDatabase");
        L.p(trackers0, "trackers");
        L.p(processor0, "processor");
        return WorkManagerImplExtKt.k(context0, configuration0, taskExecutor0, workDatabase0, trackers0, processor0, null, 0x40, null);
    }

    @l
    @i(name = "createWorkManager")
    @z3.j
    public static final WorkManagerImpl j(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0, @l WorkDatabase workDatabase0, @l Trackers trackers0, @l Processor processor0, @l s s0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "workTaskExecutor");
        L.p(workDatabase0, "workDatabase");
        L.p(trackers0, "trackers");
        L.p(processor0, "processor");
        L.p(s0, "schedulersCreator");
        Object object0 = s0.invoke(context0, configuration0, taskExecutor0, workDatabase0, trackers0, processor0);
        return new WorkManagerImpl(context0.getApplicationContext(), configuration0, taskExecutor0, workDatabase0, ((List)object0), processor0, trackers0);
    }

    public static WorkManagerImpl k(Context context0, Configuration configuration0, TaskExecutor taskExecutor0, WorkDatabase workDatabase0, Trackers trackers0, Processor processor0, s s0, int v, Object object0) {
        Trackers trackers1;
        WorkDatabase workDatabase1;
        TaskExecutor taskExecutor1 = (v & 4) == 0 ? taskExecutor0 : new WorkManagerTaskExecutor(configuration0.m());
        if((v & 8) == 0) {
            workDatabase1 = workDatabase0;
        }
        else {
            Context context1 = context0.getApplicationContext();
            L.o(context1, "context.applicationContext");
            SerialExecutor serialExecutor0 = taskExecutor1.d();
            L.o(serialExecutor0, "workTaskExecutor.serialTaskExecutor");
            boolean z = context0.getResources().getBoolean(bool.workmanager_test_configuration);
            workDatabase1 = WorkDatabase.q.b(context1, serialExecutor0, configuration0.a(), z);
        }
        if((v & 16) == 0) {
            trackers1 = trackers0;
        }
        else {
            Context context2 = context0.getApplicationContext();
            L.o(context2, "context.applicationContext");
            trackers1 = new Trackers(context2, taskExecutor1, null, null, null, null, 60, null);
        }
        Processor processor1 = (v & 0x20) == 0 ? processor0 : new Processor(context0.getApplicationContext(), configuration0, taskExecutor1, workDatabase1);
        return (v & 0x40) == 0 ? WorkManagerImplExtKt.j(context0, configuration0, taskExecutor1, workDatabase1, trackers1, processor1, s0) : WorkManagerImplExtKt.j(context0, configuration0, taskExecutor1, workDatabase1, trackers1, processor1, androidx.work.impl.WorkManagerImplExtKt.WorkManagerImpl.1.a);

        final class androidx.work.impl.WorkManagerImplExtKt.WorkManagerImpl.1 extends H implements s {
            public static final androidx.work.impl.WorkManagerImplExtKt.WorkManagerImpl.1 a;

            static {
                androidx.work.impl.WorkManagerImplExtKt.WorkManagerImpl.1.a = new androidx.work.impl.WorkManagerImplExtKt.WorkManagerImpl.1();
            }

            androidx.work.impl.WorkManagerImplExtKt.WorkManagerImpl.1() {
                super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
            }

            public final List a(Context context0, Configuration configuration0, TaskExecutor taskExecutor0, WorkDatabase workDatabase0, Trackers trackers0, Processor processor0) {
                L.p(context0, "p0");
                L.p(configuration0, "p1");
                L.p(taskExecutor0, "p2");
                L.p(workDatabase0, "p3");
                L.p(trackers0, "p4");
                L.p(processor0, "p5");
                return WorkManagerImplExtKt.c(context0, configuration0, taskExecutor0, workDatabase0, trackers0, processor0);
            }

            @Override  // A3.s
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
                return this.a(((Context)object0), ((Configuration)object1), ((TaskExecutor)object2), ((WorkDatabase)object3), ((Trackers)object4), ((Processor)object5));
            }
        }

    }

    @l
    @i(name = "createWorkManagerScope")
    public static final O l(@l TaskExecutor taskExecutor0) {
        L.p(taskExecutor0, "taskExecutor");
        K k0 = taskExecutor0.a();
        L.o(k0, "taskExecutor.taskCoroutineDispatcher");
        return P.a(k0);
    }

    @l
    public static final s m(@l Scheduler[] arr_scheduler) {
        L.p(arr_scheduler, "schedulers");
        return new s(arr_scheduler) {
            final Scheduler[] e;

            {
                this.e = arr_scheduler;
                super(6);
            }

            public final List a(Context context0, Configuration configuration0, TaskExecutor taskExecutor0, WorkDatabase workDatabase0, Trackers trackers0, Processor processor0) {
                L.p(context0, "<anonymous parameter 0>");
                L.p(configuration0, "<anonymous parameter 1>");
                L.p(taskExecutor0, "<anonymous parameter 2>");
                L.p(workDatabase0, "<anonymous parameter 3>");
                L.p(trackers0, "<anonymous parameter 4>");
                L.p(processor0, "<anonymous parameter 5>");
                return kotlin.collections.l.Ky(this.e);
            }

            @Override  // A3.s
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
                return this.a(((Context)object0), ((Configuration)object1), ((TaskExecutor)object2), ((WorkDatabase)object3), ((Trackers)object4), ((Processor)object5));
            }
        };
    }
}

