package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class k extends AtomicLong implements ThreadFactory {
    static final class a extends Thread implements j {
        a(Runnable runnable0, String s) {
            super(runnable0, s);
        }
    }

    final String a;
    final int b;
    final boolean c;
    private static final long d = -7789753024099756196L;

    public k(String s) {
        this(s, 5, false);
    }

    public k(String s, int v) {
        this(s, v, false);
    }

    public k(String s, int v, boolean z) {
        this.a = s;
        this.b = v;
        this.c = z;
    }

    @Override
    public Thread newThread(Runnable runnable0) {
        String s = this.a + '-' + this.incrementAndGet();
        Thread thread0 = this.c ? new a(runnable0, s) : new Thread(runnable0, s);
        thread0.setPriority(this.b);
        thread0.setDaemon(true);
        return thread0;
    }

    @Override
    public String toString() {
        return "RxThreadFactory[" + this.a + "]";
    }
}

