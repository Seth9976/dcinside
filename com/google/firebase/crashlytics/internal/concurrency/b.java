package com.google.firebase.crashlytics.internal.concurrency;

import androidx.media3.exoplayer.dash.offline.a;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {
    private static final Executor a;

    static {
        b.a = new a();
    }

    // 检测为 Lambda 实现
    private static Task b(TaskCompletionSource taskCompletionSource0, AtomicBoolean atomicBoolean0, CancellationTokenSource cancellationTokenSource0, Task task0) throws Exception [...]

    public static Task c(Task task0, Task task1) {
        CancellationTokenSource cancellationTokenSource0 = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource(cancellationTokenSource0.getToken());
        com.google.firebase.crashlytics.internal.concurrency.a a0 = (Task task0) -> {
            if(task0.isSuccessful()) {
                taskCompletionSource0.trySetResult(task0.getResult());
                return Tasks.forResult(null);
            }
            if(task0.getException() != null) {
                taskCompletionSource0.trySetException(task0.getException());
                return Tasks.forResult(null);
            }
            if(new AtomicBoolean(false).getAndSet(true)) {
                cancellationTokenSource0.cancel();
            }
            return Tasks.forResult(null);
        };
        task0.continueWithTask(b.a, a0);
        task1.continueWithTask(b.a, a0);
        return taskCompletionSource0.getTask();
    }
}

