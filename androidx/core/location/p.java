package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

public final class p implements Runnable {
    public final Consumer a;
    public final Location b;

    public p(Consumer consumer0, Location location0) {
        this.a = consumer0;
        this.b = location0;
    }

    @Override
    public final void run() {
        this.a.accept(this.b);
    }
}

