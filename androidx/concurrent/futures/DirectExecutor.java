package androidx.concurrent.futures;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({Scope.b})
public enum DirectExecutor implements Executor {
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

