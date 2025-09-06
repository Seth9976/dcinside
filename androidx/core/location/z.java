package androidx.core.location;

import java.util.concurrent.Executor;

public final class z implements Runnable {
    public final GpsStatusTransport a;
    public final Executor b;

    public z(GpsStatusTransport locationManagerCompat$GpsStatusTransport0, Executor executor0) {
        this.a = locationManagerCompat$GpsStatusTransport0;
        this.b = executor0;
    }

    @Override
    public final void run() {
    }
}

