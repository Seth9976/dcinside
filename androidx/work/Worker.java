package androidx.work;

import A3.a;
import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class Worker extends ListenableWorker {
    public Worker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "workerParams");
        super(context0, workerParameters0);
    }

    @WorkerThread
    @l
    public abstract Result doWork();

    @WorkerThread
    @l
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override  // androidx.work.ListenableWorker
    @l
    public t0 getForegroundInfoAsync() {
        Executor executor0 = this.getBackgroundExecutor();
        L.o(executor0, "backgroundExecutor");
        return WorkerKt.e(executor0, new a() {
            final Worker e;

            {
                this.e = worker0;
                super(0);
            }

            public final ForegroundInfo b() {
                return this.e.getForegroundInfo();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    @Override  // androidx.work.ListenableWorker
    @l
    public final t0 startWork() {
        Executor executor0 = this.getBackgroundExecutor();
        L.o(executor0, "backgroundExecutor");
        return WorkerKt.e(executor0, new a() {
            final Worker e;

            {
                this.e = worker0;
                super(0);
            }

            public final Result b() {
                return this.e.doWork();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }
}

