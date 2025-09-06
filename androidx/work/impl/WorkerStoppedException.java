package androidx.work.impl;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;

@RestrictTo({Scope.b})
public final class WorkerStoppedException extends CancellationException {
    private final int a;

    public WorkerStoppedException(int v) {
        this.a = v;
    }

    public final int a() {
        return this.a;
    }
}

