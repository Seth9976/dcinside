package androidx.work;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.b})
public enum DirectExecutor implements Executor {
    INSTANCE;

    private static final DirectExecutor[] a() [...] // Inlined contents

    @Override
    public void execute(@l Runnable runnable0) {
        L.p(runnable0, "command");
        runnable0.run();
    }

    @Override
    @l
    public String toString() {
        return "DirectExecutor";
    }
}

