package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.f;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;

@f
@n(a.a)
public class RealtimeSinceBootClock implements d {
    private static final RealtimeSinceBootClock a;

    static {
        RealtimeSinceBootClock.a = new RealtimeSinceBootClock();
    }

    @f
    public static RealtimeSinceBootClock get() {
        return RealtimeSinceBootClock.a;
    }

    @Override  // com.facebook.common.time.d
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override  // com.facebook.common.time.d
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(this.now());
    }
}

