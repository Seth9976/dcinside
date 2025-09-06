package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.S0;
import kotlin.coroutines.d;
import y4.l;

final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    @l
    private final d a;

    public ContinuationRunnable(@l d d0) {
        super(false);
        this.a = d0;
    }

    @Override
    public void run() {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(S0.a);
        }
    }

    @Override
    @l
    public String toString() {
        return "ContinuationRunnable(ran = " + this.get() + ')';
    }
}

