package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

public final class u implements Runnable {
    public final Consumer a;
    public final Location b;

    public u(Consumer consumer0, Location location0) {
        this.a = consumer0;
        this.b = location0;
    }

    @Override
    public final void run() {
        CancellableLocationListener.b(this.a, this.b);
    }
}

