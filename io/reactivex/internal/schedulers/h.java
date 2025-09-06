package io.reactivex.internal.schedulers;

import d3.f;
import io.reactivex.J.c;
import io.reactivex.J;
import java.util.concurrent.ThreadFactory;

public final class h extends J {
    final ThreadFactory b;
    private static final String c = "RxNewThreadScheduler";
    private static final k d = null;
    private static final String e = "rx2.newthread-priority";

    static {
        h.d = new k("RxNewThreadScheduler", 5);
    }

    public h() {
        this(h.d);
    }

    public h(ThreadFactory threadFactory0) {
        this.b = threadFactory0;
    }

    @Override  // io.reactivex.J
    @f
    public c d() {
        return new i(this.b);
    }
}

