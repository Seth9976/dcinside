package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.L;
import y4.l;

public final class i {
    @l
    private final Handler handler;

    public i() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final long calculateTime(long v) {
        return SystemClock.uptimeMillis() + v;
    }

    public final void cancel(@l String s) {
        L.p(s, "tag");
        this.handler.removeCallbacksAndMessages(s);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(@l Runnable runnable0, long v) {
        L.p(runnable0, "runnable");
        long v1 = this.calculateTime(v);
        this.handler.postAtTime(runnable0, v1);
    }

    public final void schedule(@l Runnable runnable0, @l String s, long v) {
        L.p(runnable0, "runnable");
        L.p(s, "tag");
        long v1 = this.calculateTime(v);
        this.handler.postAtTime(runnable0, s, v1);
    }
}

