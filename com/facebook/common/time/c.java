package com.facebook.common.time;

import com.facebook.common.internal.f;
import java.util.concurrent.TimeUnit;

public final class c {
    @f
    public static long a(d d0) {
        return TimeUnit.NANOSECONDS.toMillis(d0.nowNanos());
    }

    public static d b(a a0) {
        return new com.facebook.common.time.d.a(a0, null);
    }
}

