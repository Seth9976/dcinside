package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

public final class d implements Runnable {
    public final WorkDatabase a;
    public final String b;
    public final WorkManagerImpl c;

    public d(WorkDatabase workDatabase0, String s, WorkManagerImpl workManagerImpl0) {
        this.a = workDatabase0;
        this.b = s;
        this.c = workManagerImpl0;
    }

    @Override
    public final void run() {
        androidx.work.impl.utils.CancelWorkRunnable.forTag.1.b(this.a, this.b, this.c);
    }
}

