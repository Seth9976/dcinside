package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.UUID;

@RestrictTo({Scope.b})
public class WorkProgressUpdater implements ProgressUpdater {
    final WorkDatabase a;
    final TaskExecutor b;
    static final String c;

    static {
        WorkProgressUpdater.c = "WM-WorkProgressUpdater";
    }

    public WorkProgressUpdater(@NonNull WorkDatabase workDatabase0, @NonNull TaskExecutor taskExecutor0) {
        this.a = workDatabase0;
        this.b = taskExecutor0;
    }

    @Override  // androidx.work.ProgressUpdater
    @NonNull
    public t0 a(@NonNull Context context0, @NonNull UUID uUID0, @NonNull Data data0) {
        return ListenableFutureKt.f(this.b.d(), "updateProgress", () -> {
            String s = uUID0.toString();
            Logger.e().a("WM-WorkProgressUpdater", "Updating progress for " + uUID0 + " (" + data0 + ")");
            this.a.e();
            try {
                WorkSpec workSpec0 = this.a.Z().G(s);
                if(workSpec0 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if(workSpec0.b == State.b) {
                    WorkProgress workProgress0 = new WorkProgress(s, data0);
                    this.a.Y().e(workProgress0);
                }
                else {
                    Logger.e().l("WM-WorkProgressUpdater", "Ignoring setProgressAsync(...). WorkSpec (" + s + ") is not in a RUNNING state.");
                }
                this.a.Q();
                goto label_19;
            }
            catch(Throwable throwable0) {
            }
            try {
                Logger.e().d("WM-WorkProgressUpdater", "Error updating Worker progress", throwable0);
                throw throwable0;
            }
            catch(Throwable throwable1) {
                this.a.k();
                throw throwable1;
            }
        label_19:
            this.a.k();
            return null;
        });
    }

    // 检测为 Lambda 实现
    private Void c(UUID uUID0, Data data0) [...]
}

