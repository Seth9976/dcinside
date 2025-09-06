package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

public final class i {
    private static final double a;

    static {
        i.a = 0.000001;
    }

    public static double a(long v) {
        return ((double)(i.b() - v)) * i.a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}

