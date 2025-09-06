package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;

public final class e implements Runnable {
    public final List a;
    public final WorkGenerationalId b;
    public final Configuration c;
    public final WorkDatabase d;

    public e(List list0, WorkGenerationalId workGenerationalId0, Configuration configuration0, WorkDatabase workDatabase0) {
        this.a = list0;
        this.b = workGenerationalId0;
        this.c = configuration0;
        this.d = workDatabase0;
    }

    @Override
    public final void run() {
        Schedulers.d(this.a, this.b, this.c, this.d);
    }
}

