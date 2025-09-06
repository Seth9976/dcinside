package androidx.work.impl.utils;

import A3.a;
import android.content.Context;
import androidx.work.ForegroundInfo;
import java.util.UUID;

public final class q implements a {
    public final WorkForegroundUpdater a;
    public final UUID b;
    public final ForegroundInfo c;
    public final Context d;

    public q(WorkForegroundUpdater workForegroundUpdater0, UUID uUID0, ForegroundInfo foregroundInfo0, Context context0) {
        this.a = workForegroundUpdater0;
        this.b = uUID0;
        this.c = foregroundInfo0;
        this.d = context0;
    }

    @Override  // A3.a
    public final Object invoke() {
        return this.a.c(this.b, this.c, this.d);
    }
}

