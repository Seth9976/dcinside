package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import java.util.concurrent.Executor;

public final class d implements ExecutionListener {
    public final Executor a;
    public final List b;
    public final Configuration c;
    public final WorkDatabase d;

    public d(Executor executor0, List list0, Configuration configuration0, WorkDatabase workDatabase0) {
        this.a = executor0;
        this.b = list0;
        this.c = configuration0;
        this.d = workDatabase0;
    }

    @Override  // androidx.work.impl.ExecutionListener
    public final void d(WorkGenerationalId workGenerationalId0, boolean z) {
        Schedulers.e(this.a, this.b, this.c, this.d, workGenerationalId0, z);
    }
}

