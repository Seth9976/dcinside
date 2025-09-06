package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableFutureKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.UUID;

@RestrictTo({Scope.b})
public class WorkForegroundUpdater implements ForegroundUpdater {
    private final TaskExecutor a;
    final ForegroundProcessor b;
    final WorkSpecDao c;
    private static final String d;

    static {
        WorkForegroundUpdater.d = "WM-WMFgUpdater";
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundUpdater(@NonNull WorkDatabase workDatabase0, @NonNull ForegroundProcessor foregroundProcessor0, @NonNull TaskExecutor taskExecutor0) {
        this.b = foregroundProcessor0;
        this.a = taskExecutor0;
        this.c = workDatabase0.Z();
    }

    @Override  // androidx.work.ForegroundUpdater
    @NonNull
    public t0 a(@NonNull Context context0, @NonNull UUID uUID0, @NonNull ForegroundInfo foregroundInfo0) {
        return ListenableFutureKt.f(this.a.d(), "setForegroundAsync", () -> {
            String s = uUID0.toString();
            WorkSpec workSpec0 = this.c.G(s);
            if(workSpec0 == null) {
                throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            this.b.a(s, foregroundInfo0);
            context0.startService(SystemForegroundDispatcher.f(context0, WorkSpecKt.a(workSpec0), foregroundInfo0));
            return null;
        });
    }

    // 检测为 Lambda 实现
    private Void c(UUID uUID0, ForegroundInfo foregroundInfo0, Context context0) [...]
}

