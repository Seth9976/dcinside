package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import java.util.List;
import java.util.Set;

public final class n implements Runnable {
    public final WorkDatabase a;
    public final WorkSpec b;
    public final WorkSpec c;
    public final List d;
    public final String e;
    public final Set f;
    public final boolean g;

    public n(WorkDatabase workDatabase0, WorkSpec workSpec0, WorkSpec workSpec1, List list0, String s, Set set0, boolean z) {
        this.a = workDatabase0;
        this.b = workSpec0;
        this.c = workSpec1;
        this.d = list0;
        this.e = s;
        this.f = set0;
        this.g = z;
    }

    @Override
    public final void run() {
        WorkerUpdater.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}

