package androidx.arch.core.executor;

import java.util.concurrent.Executor;

public final class b implements Executor {
    @Override
    public final void execute(Runnable runnable0) {
        ArchTaskExecutor.k(runnable0);
    }
}

