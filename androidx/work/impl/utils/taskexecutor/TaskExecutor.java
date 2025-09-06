package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.K;

@RestrictTo({Scope.b})
public interface TaskExecutor {
    @NonNull
    K a();

    void b(@NonNull Runnable arg1);

    @NonNull
    Executor c();

    @NonNull
    SerialExecutor d();
}

