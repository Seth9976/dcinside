package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({Scope.b})
enum DirectExecutor implements Executor {
    INSTANCE;

    private static DirectExecutor[] a() [...] // Inlined contents

    @Override
    public void execute(Runnable runnable0) {
        runnable0.run();
    }

    @Override
    public String toString() {
        return "DirectExecutor";
    }
}

