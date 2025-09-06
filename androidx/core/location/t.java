package androidx.core.location;

public final class t implements Runnable {
    public final CancellableLocationListener a;

    public t(CancellableLocationListener locationManagerCompat$CancellableLocationListener0) {
        this.a = locationManagerCompat$CancellableLocationListener0;
    }

    @Override
    public final void run() {
        this.a.f();
    }
}

