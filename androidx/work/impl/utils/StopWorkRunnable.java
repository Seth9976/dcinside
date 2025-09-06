package androidx.work.impl.utils;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.b})
public final class StopWorkRunnable implements Runnable {
    @l
    private final Processor a;
    @l
    private final StartStopToken b;
    private final boolean c;
    private final int d;

    public StopWorkRunnable(@l Processor processor0, @l StartStopToken startStopToken0, boolean z) {
        L.p(processor0, "processor");
        L.p(startStopToken0, "token");
        this(processor0, startStopToken0, z, 0xFFFFFE00);
    }

    public StopWorkRunnable(@l Processor processor0, @l StartStopToken startStopToken0, boolean z, int v) {
        L.p(processor0, "processor");
        L.p(startStopToken0, "token");
        super();
        this.a = processor0;
        this.b = startStopToken0;
        this.c = z;
        this.d = v;
    }

    @Override
    public void run() {
        boolean z = this.c ? this.a.w(this.b, this.d) : this.a.x(this.b, this.d);
        Logger.e().a("WM-StopWorkRunnable", "StopWorkRunnable for " + this.b.a().f() + "; Processor.stopWork = " + z);
    }
}

