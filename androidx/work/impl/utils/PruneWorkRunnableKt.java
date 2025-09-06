package androidx.work.impl.utils;

import A3.a;
import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;

public final class PruneWorkRunnableKt {
    @l
    public static final Operation a(@l WorkDatabase workDatabase0, @l Configuration configuration0, @l TaskExecutor taskExecutor0) {
        L.p(workDatabase0, "<this>");
        L.p(configuration0, "configuration");
        L.p(taskExecutor0, "executor");
        SerialExecutor serialExecutor0 = taskExecutor0.d();
        L.o(serialExecutor0, "executor.serialTaskExecutor");
        return OperationKt.e(configuration0.n(), "PruneWork", serialExecutor0, new a(workDatabase0) {
            final WorkDatabase e;

            {
                this.e = workDatabase0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.Z().d();
            }
        });
    }
}

