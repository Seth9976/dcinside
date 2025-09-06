package androidx.work.impl.utils;

import A3.a;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.List;
import java.util.UUID;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "CancelWorkRunnable")
public final class CancelWorkRunnable {
    private static final void d(WorkManagerImpl workManagerImpl0, String s) {
        WorkDatabase workDatabase0 = workManagerImpl0.U();
        L.o(workDatabase0, "workManagerImpl.workDatabase");
        CancelWorkRunnable.k(workDatabase0, s);
        Processor processor0 = workManagerImpl0.Q();
        L.o(processor0, "workManagerImpl.processor");
        processor0.u(s, 1);
        for(Object object0: workManagerImpl0.S()) {
            ((Scheduler)object0).b(s);
        }
    }

    @l
    public static final Operation e(@l WorkManagerImpl workManagerImpl0) {
        L.p(workManagerImpl0, "workManagerImpl");
        SerialExecutor serialExecutor0 = workManagerImpl0.X().d();
        L.o(serialExecutor0, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.e(workManagerImpl0.o().n(), "CancelAllWork", serialExecutor0, new a(workManagerImpl0) {
            final WorkManagerImpl e;

            {
                this.e = workManagerImpl0;
                super(0);
            }

            // 检测为 Lambda 实现
            private static final void b(WorkDatabase workDatabase0, WorkManagerImpl workManagerImpl0) [...]

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                WorkDatabase workDatabase0 = this.e.U();
                L.o(workDatabase0, "workManagerImpl.workDatabase");
                workDatabase0.O(() -> {
                    for(Object object0: workDatabase0.Z().v()) {
                        CancelWorkRunnable.d(this.e, ((String)object0));
                    }
                    new PreferenceUtils(workDatabase0).h(this.e.o().a().currentTimeMillis());
                });
            }
        });
    }

    @l
    public static final Operation f(@l UUID uUID0, @l WorkManagerImpl workManagerImpl0) {
        L.p(uUID0, "id");
        L.p(workManagerImpl0, "workManagerImpl");
        SerialExecutor serialExecutor0 = workManagerImpl0.X().d();
        L.o(serialExecutor0, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.e(workManagerImpl0.o().n(), "CancelWorkById", serialExecutor0, new a(workManagerImpl0, uUID0) {
            final WorkManagerImpl e;
            final UUID f;

            {
                this.e = workManagerImpl0;
                this.f = uUID0;
                super(0);
            }

            // 检测为 Lambda 实现
            private static final void b(WorkManagerImpl workManagerImpl0, UUID uUID0) [...]

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                WorkDatabase workDatabase0 = this.e.U();
                L.o(workDatabase0, "workManagerImpl.workDatabase");
                workDatabase0.O(() -> {
                    String s = this.f.toString();
                    L.o(s, "id.toString()");
                    CancelWorkRunnable.d(this.e, s);
                });
                CancelWorkRunnable.l(this.e);
            }
        });
    }

    @l
    public static final Operation g(@l String s, @l WorkManagerImpl workManagerImpl0) {
        L.p(s, "name");
        L.p(workManagerImpl0, "workManagerImpl");
        SerialExecutor serialExecutor0 = workManagerImpl0.X().d();
        L.o(serialExecutor0, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.e(workManagerImpl0.o().n(), "CancelWorkByName_" + s, serialExecutor0, new a(s, workManagerImpl0) {
            final String e;
            final WorkManagerImpl f;

            {
                this.e = s;
                this.f = workManagerImpl0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                CancelWorkRunnable.h(this.e, this.f);
                CancelWorkRunnable.l(this.f);
            }
        });
    }

    public static final void h(@l String s, @l WorkManagerImpl workManagerImpl0) {
        L.p(s, "name");
        L.p(workManagerImpl0, "workManagerImpl");
        WorkDatabase workDatabase0 = workManagerImpl0.U();
        L.o(workDatabase0, "workManagerImpl.workDatabase");
        workDatabase0.O(() -> for(Object object0: workDatabase0.Z().h(s)) {
            CancelWorkRunnable.d(workManagerImpl0, ((String)object0));
        });
    }

    // 检测为 Lambda 实现
    private static final void i(WorkDatabase workDatabase0, String s, WorkManagerImpl workManagerImpl0) [...]

    @l
    public static final Operation j(@l String s, @l WorkManagerImpl workManagerImpl0) {
        L.p(s, "tag");
        L.p(workManagerImpl0, "workManagerImpl");
        SerialExecutor serialExecutor0 = workManagerImpl0.X().d();
        L.o(serialExecutor0, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.e(workManagerImpl0.o().n(), "CancelWorkByTag_" + s, serialExecutor0, new a(workManagerImpl0, s) {
            final WorkManagerImpl e;
            final String f;

            {
                this.e = workManagerImpl0;
                this.f = s;
                super(0);
            }

            // 检测为 Lambda 实现
            private static final void b(WorkDatabase workDatabase0, String s, WorkManagerImpl workManagerImpl0) [...]

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                WorkDatabase workDatabase0 = this.e.U();
                L.o(workDatabase0, "workManagerImpl.workDatabase");
                workDatabase0.O(() -> for(Object object0: workDatabase0.Z().l(this.f)) {
                    CancelWorkRunnable.d(this.e, ((String)object0));
                });
                CancelWorkRunnable.l(this.e);
            }
        });
    }

    private static final void k(WorkDatabase workDatabase0, String s) {
        WorkSpecDao workSpecDao0 = workDatabase0.Z();
        DependencyDao dependencyDao0 = workDatabase0.T();
        List list0 = u.S(new String[]{s});
        while(!list0.isEmpty()) {
            String s1 = (String)u.O0(list0);
            State workInfo$State0 = workSpecDao0.j(s1);
            if(workInfo$State0 != State.c && workInfo$State0 != State.d) {
                workSpecDao0.k(s1);
            }
            list0.addAll(dependencyDao0.b(s1));
        }
    }

    private static final void l(WorkManagerImpl workManagerImpl0) {
        Schedulers.h(workManagerImpl0.o(), workManagerImpl0.U(), workManagerImpl0.S());
    }
}

