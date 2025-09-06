package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import kotlinx.coroutines.K;
import kotlinx.coroutines.w0;

public final class a {
    public static void a(TaskExecutor taskExecutor0, @NonNull Runnable runnable0) {
        taskExecutor0.d().execute(runnable0);
    }

    @NonNull
    public static K b(TaskExecutor taskExecutor0) {
        return w0.c(taskExecutor0.d());
    }
}

