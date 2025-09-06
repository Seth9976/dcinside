package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import java.util.concurrent.Executor;

public final class x implements Runnable {
    public final GnssMeasurementsTransport a;
    public final Executor b;
    public final GnssMeasurementsEvent c;

    public x(GnssMeasurementsTransport locationManagerCompat$GnssMeasurementsTransport0, Executor executor0, GnssMeasurementsEvent gnssMeasurementsEvent0) {
        this.a = locationManagerCompat$GnssMeasurementsTransport0;
        this.b = executor0;
        this.c = gnssMeasurementsEvent0;
    }

    @Override
    public final void run() {
        this.a.c(this.b, this.c);
    }
}

