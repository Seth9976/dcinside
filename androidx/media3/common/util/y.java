package androidx.media3.common.util;

import com.google.common.util.concurrent.O0;
import com.google.common.util.concurrent.t0;

public final class y implements Runnable {
    public final O0 a;
    public final t0 b;

    public y(O0 o00, t0 t00) {
        this.a = o00;
        this.b = t00;
    }

    @Override
    public final void run() {
        Util.s1(this.a, this.b);
    }
}

