package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import y4.l;

public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "parameters");
        super(context0, workerParameters0);
    }

    @Override  // androidx.work.Worker
    @l
    public Result doWork() {
        WorkManagerImpl workManagerImpl0 = WorkManagerImpl.O(this.getApplicationContext());
        L.o(workManagerImpl0, "getInstance(applicationContext)");
        WorkDatabase workDatabase0 = workManagerImpl0.U();
        L.o(workDatabase0, "workManager.workDatabase");
        WorkSpecDao workSpecDao0 = workDatabase0.Z();
        WorkNameDao workNameDao0 = workDatabase0.X();
        WorkTagDao workTagDao0 = workDatabase0.a0();
        SystemIdInfoDao systemIdInfoDao0 = workDatabase0.W();
        List list0 = workSpecDao0.D(workManagerImpl0.o().a().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List list1 = workSpecDao0.O();
        List list2 = workSpecDao0.o(200);
        if(!list0.isEmpty()) {
            Logger.e().f("WM-DiagnosticsWrkr", "Recently completed work:\n\n");
            Logger.e().f("WM-DiagnosticsWrkr", DiagnosticsWorkerKt.d(workNameDao0, workTagDao0, systemIdInfoDao0, list0));
        }
        if(!list1.isEmpty()) {
            Logger.e().f("WM-DiagnosticsWrkr", "Running work:\n\n");
            Logger.e().f("WM-DiagnosticsWrkr", DiagnosticsWorkerKt.d(workNameDao0, workTagDao0, systemIdInfoDao0, list1));
        }
        if(!list2.isEmpty()) {
            Logger.e().f("WM-DiagnosticsWrkr", "Enqueued work:\n\n");
            Logger.e().f("WM-DiagnosticsWrkr", DiagnosticsWorkerKt.d(workNameDao0, workTagDao0, systemIdInfoDao0, list2));
        }
        Result listenableWorker$Result0 = Result.e();
        L.o(listenableWorker$Result0, "success()");
        return listenableWorker$Result0;
    }
}

