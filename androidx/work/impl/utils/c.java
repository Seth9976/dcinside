package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;
import java.util.UUID;

public final class c implements Runnable {
    public final WorkManagerImpl a;
    public final UUID b;

    public c(WorkManagerImpl workManagerImpl0, UUID uUID0) {
        this.a = workManagerImpl0;
        this.b = uUID0;
    }

    @Override
    public final void run() {
        androidx.work.impl.utils.CancelWorkRunnable.forId.1.b(this.a, this.b);
    }
}

