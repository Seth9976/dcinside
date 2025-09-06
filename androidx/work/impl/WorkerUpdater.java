package androidx.work.impl;

import A3.a;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableFutureKt;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.WorkInfo.State;
import androidx.work.WorkManager.UpdateResult;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nWorkerUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n*L\n56#1:166,2\n*E\n"})
@i(name = "WorkerUpdater")
public final class WorkerUpdater {
    @RestrictTo({Scope.b})
    @l
    public static final Operation c(@l WorkManagerImpl workManagerImpl0, @l String s, @l WorkRequest workRequest0) {
        L.p(workManagerImpl0, "<this>");
        L.p(s, "name");
        L.p(workRequest0, "workRequest");
        SerialExecutor serialExecutor0 = workManagerImpl0.X().d();
        L.o(serialExecutor0, "workTaskExecutor.serialTaskExecutor");
        return OperationKt.e(workManagerImpl0.o().n(), "enqueueUniquePeriodic_" + s, serialExecutor0, new a(workManagerImpl0, s, workRequest0) {
            final WorkManagerImpl e;
            final String f;
            final WorkRequest g;

            {
                this.e = workManagerImpl0;
                this.f = s;
                this.g = workRequest0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                androidx.work.impl.WorkerUpdater.enqueueUniquelyNamedPeriodic.1.enqueueNew.1 workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$10 = new a(this.e, this.f) {
                    final WorkRequest e;
                    final WorkManagerImpl f;
                    final String g;

                    {
                        this.e = workRequest0;
                        this.f = workManagerImpl0;
                        this.g = s;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        List list0 = u.k(this.e);
                        EnqueueRunnable.b(new WorkContinuationImpl(this.f, this.g, ExistingWorkPolicy.b, list0));
                    }
                };
                WorkSpecDao workSpecDao0 = this.e.U().Z();
                List list0 = workSpecDao0.K(this.f);
                if(list0.size() > 1) {
                    throw new UnsupportedOperationException("Can\'t apply UPDATE policy to the chains of work.");
                }
                IdAndState workSpec$IdAndState0 = (IdAndState)u.G2(list0);
                if(workSpec$IdAndState0 == null) {
                    workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$10.invoke();
                    return;
                }
                WorkSpec workSpec0 = workSpecDao0.G(workSpec$IdAndState0.a);
                if(workSpec0 == null) {
                    throw new IllegalStateException("WorkSpec with " + workSpec$IdAndState0.a + ", that matches a name \"" + this.f + "\", wasn\'t found");
                }
                if(!workSpec0.L()) {
                    throw new UnsupportedOperationException("Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type.");
                }
                if(workSpec$IdAndState0.b == State.f) {
                    workSpecDao0.b(workSpec$IdAndState0.a);
                    workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$10.invoke();
                    return;
                }
                WorkSpec workSpec1 = WorkSpec.C(this.g.d(), workSpec$IdAndState0.a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 0xFFFFFE, null);
                Processor processor0 = this.e.Q();
                L.o(processor0, "processor");
                WorkDatabase workDatabase0 = this.e.U();
                L.o(workDatabase0, "workDatabase");
                Configuration configuration0 = this.e.o();
                L.o(configuration0, "configuration");
                List list1 = this.e.S();
                L.o(list1, "schedulers");
                WorkerUpdater.d(processor0, workDatabase0, configuration0, list1, workSpec1, this.g.c());
            }
        });
    }

    private static final UpdateResult d(Processor processor0, WorkDatabase workDatabase0, Configuration configuration0, List list0, WorkSpec workSpec0, Set set0) {
        String s = workSpec0.a;
        WorkSpec workSpec1 = workDatabase0.Z().G(s);
        if(workSpec1 == null) {
            throw new IllegalArgumentException("Worker with " + s + " doesn\'t exist");
        }
        if((workSpec1.L() ^ workSpec0.L()) != 0) {
            throw new UnsupportedOperationException("Can\'t update " + ((String)androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1.e.invoke(workSpec1)) + " Worker to " + ((String)androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1.e.invoke(workSpec0)) + " Worker. Update operation must preserve worker\'s type.");
        }
        boolean z = processor0.l(s);
        if(!z) {
            for(Object object0: list0) {
                ((Scheduler)object0).b(s);
            }
        }
        workDatabase0.O(() -> {
            WorkSpecDao workSpecDao0 = workDatabase0.Z();
            WorkTagDao workTagDao0 = workDatabase0.a0();
            WorkSpec workSpec2 = WorkSpec.C(workSpec0, null, workSpec1.b, null, null, null, null, 0L, 0L, 0L, null, workSpec1.k, null, 0L, workSpec1.n, 0L, 0L, false, null, workSpec1.G(), workSpec1.D() + 1, workSpec1.E(), workSpec1.F(), 0, null, 0xC3DBFD, null);
            if(workSpec0.F() == 1) {
                workSpec2.N(workSpec0.E());
                workSpec2.O(workSpec2.F() + 1);
            }
            workSpecDao0.c(EnqueueUtilsKt.e(list0, workSpec2));
            workTagDao0.a(s);
            workTagDao0.b(s, set0);
            if(!z) {
                workSpecDao0.J(s, -1L);
                workDatabase0.Y().b(s);
            }
        });
        if(!z) {
            Schedulers.h(configuration0, workDatabase0, list0);
        }
        return z ? UpdateResult.c : UpdateResult.b;

        final class androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1 extends N implements Function1 {
            public static final androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1 e;

            static {
                androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1.e = new androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1();
            }

            androidx.work.impl.WorkerUpdater.updateWorkImpl.type.1() {
                super(1);
            }

            public final String a(WorkSpec workSpec0) {
                L.p(workSpec0, "spec");
                return workSpec0.L() ? "Periodic" : "OneTime";
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((WorkSpec)object0));
            }
        }

    }

    @l
    public static final t0 e(@l WorkManagerImpl workManagerImpl0, @l WorkRequest workRequest0) {
        L.p(workManagerImpl0, "<this>");
        L.p(workRequest0, "workRequest");
        SerialExecutor serialExecutor0 = workManagerImpl0.X().d();
        L.o(serialExecutor0, "workTaskExecutor.serialTaskExecutor");
        return ListenableFutureKt.f(serialExecutor0, "updateWorkImpl", new a(workManagerImpl0, workRequest0) {
            final WorkManagerImpl e;
            final WorkRequest f;

            {
                this.e = workManagerImpl0;
                this.f = workRequest0;
                super(0);
            }

            public final UpdateResult b() {
                Processor processor0 = this.e.Q();
                L.o(processor0, "processor");
                WorkDatabase workDatabase0 = this.e.U();
                L.o(workDatabase0, "workDatabase");
                Configuration configuration0 = this.e.o();
                L.o(configuration0, "configuration");
                List list0 = this.e.S();
                L.o(list0, "schedulers");
                return WorkerUpdater.d(processor0, workDatabase0, configuration0, list0, this.f.d(), this.f.c());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void f(WorkDatabase workDatabase0, WorkSpec workSpec0, WorkSpec workSpec1, List list0, String s, Set set0, boolean z) [...]
}

