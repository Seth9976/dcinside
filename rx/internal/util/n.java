package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class n extends AtomicLong implements ThreadFactory {
    static final class a implements ThreadFactory {
        @Override
        public Thread newThread(Runnable runnable0) {
            throw new AssertionError("No threads allowed.");
        }
    }

    final String a;
    private static final long b = 0x854E1B6E133E9B61L;
    public static final ThreadFactory c;

    static {
        n.c = new a();
    }

    public n(String s) {
        this.a = s;
    }

    @Override
    public Thread newThread(Runnable runnable0) {
        Thread thread0 = new Thread(runnable0, this.a + this.incrementAndGet());
        thread0.setDaemon(true);
        return thread0;
    }
}

