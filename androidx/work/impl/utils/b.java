package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

public final class b implements Runnable {
    public final WorkDatabase a;
    public final WorkManagerImpl b;

    public b(WorkDatabase workDatabase0, WorkManagerImpl workManagerImpl0) {
        this.a = workDatabase0;
        this.b = workManagerImpl0;
    }

    @Override
    public final void run() {
        androidx.work.impl.utils.CancelWorkRunnable.forAll.1.b(this.a, this.b);
    }
}

