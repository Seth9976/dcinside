package androidx.core.location;

import java.util.concurrent.Executor;

public final class y implements Runnable {
    public final GnssMeasurementsTransport a;
    public final Executor b;
    public final int c;

    public y(GnssMeasurementsTransport locationManagerCompat$GnssMeasurementsTransport0, Executor executor0, int v) {
        this.a = locationManagerCompat$GnssMeasurementsTransport0;
        this.b = executor0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.d(this.b, this.c);
    }
}

