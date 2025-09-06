package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import kotlinx.coroutines.K;
import kotlinx.coroutines.w0;

@RestrictTo({Scope.b})
public class WorkManagerTaskExecutor implements TaskExecutor {
    private final SerialExecutorImpl a;
    private final K b;
    final Handler c;
    private final Executor d;

    public WorkManagerTaskExecutor(@NonNull Executor executor0) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new Executor() {
            final WorkManagerTaskExecutor a;

            @Override
            public void execute(@NonNull Runnable runnable0) {
                WorkManagerTaskExecutor.this.c.post(runnable0);
            }
        };
        SerialExecutorImpl serialExecutorImpl0 = new SerialExecutorImpl(executor0);
        this.a = serialExecutorImpl0;
        this.b = w0.c(serialExecutorImpl0);
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public K a() {
        return this.b;
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void b(Runnable runnable0) {
        a.a(this, runnable0);
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public Executor c() {
        return this.d;
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public SerialExecutor d() {
        return this.e();
    }

    @NonNull
    public SerialExecutorImpl e() {
        return this.a;
    }
}

