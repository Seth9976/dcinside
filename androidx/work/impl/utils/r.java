package androidx.work.impl.utils;

import A3.a;
import androidx.work.Data;
import java.util.UUID;

public final class r implements a {
    public final WorkProgressUpdater a;
    public final UUID b;
    public final Data c;

    public r(WorkProgressUpdater workProgressUpdater0, UUID uUID0, Data data0) {
        this.a = workProgressUpdater0;
        this.b = uUID0;
        this.c = data0;
    }

    @Override  // A3.a
    public final Object invoke() {
        return this.a.c(this.b, this.c);
    }
}

