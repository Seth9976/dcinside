package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public abstract class TaskExecutor {
    public abstract void a(@NonNull Runnable arg1);

    public void b(@NonNull Runnable runnable0) {
        if(this.c()) {
            runnable0.run();
            return;
        }
        this.d(runnable0);
    }

    public abstract boolean c();

    public abstract void d(@NonNull Runnable arg1);
}

