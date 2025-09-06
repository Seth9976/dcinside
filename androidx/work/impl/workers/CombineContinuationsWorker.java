package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.L;
import y4.l;

public final class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "workerParams");
        super(context0, workerParameters0);
    }

    @Override  // androidx.work.Worker
    @l
    public Result doWork() {
        Result listenableWorker$Result0 = Result.f(this.getInputData());
        L.o(listenableWorker$Result0, "success(inputData)");
        return listenableWorker$Result0;
    }
}

