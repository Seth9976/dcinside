package androidx.media3.common.util;

import com.google.common.util.concurrent.O0;
import com.google.common.util.concurrent.t0;
import com.google.common.util.concurrent.w;

public final class z implements Runnable {
    public final t0 a;
    public final O0 b;
    public final w c;

    public z(t0 t00, O0 o00, w w0) {
        this.a = t00;
        this.b = o00;
        this.c = w0;
    }

    @Override
    public final void run() {
        Util.t1(this.a, this.b, this.c);
    }
}

