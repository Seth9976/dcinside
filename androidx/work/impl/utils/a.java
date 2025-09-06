package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

public final class a implements Runnable {
    public final WorkDatabase a;
    public final String b;
    public final WorkManagerImpl c;

    public a(WorkDatabase workDatabase0, String s, WorkManagerImpl workManagerImpl0) {
        this.a = workDatabase0;
        this.b = s;
        this.c = workManagerImpl0;
    }

    @Override
    public final void run() {
        CancelWorkRunnable.i(this.a, this.b, this.c);
    }
}

