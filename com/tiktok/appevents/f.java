package com.tiktok.appevents;

import com.tiktok.b.i;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f implements Runnable {
    public final i a;
    public final AtomicBoolean b;

    public f(i b$i0, AtomicBoolean atomicBoolean0) {
        this.a = b$i0;
        this.b = atomicBoolean0;
    }

    @Override
    public final void run() {
        p.B(this.a, this.b);
    }
}

