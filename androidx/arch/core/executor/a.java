package androidx.arch.core.executor;

import java.util.concurrent.Executor;

public final class a implements Executor {
    @Override
    public final void execute(Runnable runnable0) {
        ArchTaskExecutor.j(runnable0);
    }
}

