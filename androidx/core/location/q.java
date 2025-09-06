package androidx.core.location;

import android.os.CancellationSignal.OnCancelListener;

public final class q implements CancellationSignal.OnCancelListener {
    public final CancellableLocationListener a;

    public q(CancellableLocationListener locationManagerCompat$CancellableLocationListener0) {
        this.a = locationManagerCompat$CancellableLocationListener0;
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        this.a.c();
    }
}

