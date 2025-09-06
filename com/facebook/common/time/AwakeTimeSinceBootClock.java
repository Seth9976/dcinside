package com.facebook.common.time;

import com.facebook.common.internal.f;
import k1.n.a;
import k1.n;

@f
@n(a.a)
public class AwakeTimeSinceBootClock implements com.facebook.common.time.f {
    @f
    private static final AwakeTimeSinceBootClock INSTANCE;

    static {
        AwakeTimeSinceBootClock.INSTANCE = new AwakeTimeSinceBootClock();
    }

    @f
    public static AwakeTimeSinceBootClock get() {
        return AwakeTimeSinceBootClock.INSTANCE;
    }

    @Override  // com.facebook.common.time.d
    public long now() {
        return c.a(this);
    }

    @Override  // com.facebook.common.time.d
    @f
    public long nowNanos() {
        return System.nanoTime();
    }
}

