package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class p1 implements ThreadFactory {
    public final int a;
    public final String b;
    public final AtomicInteger c;

    public p1(int v, String s, AtomicInteger atomicInteger0) {
        this.a = v;
        this.b = s;
        this.c = atomicInteger0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return q1.c(this.a, this.b, this.c, runnable0);
    }
}

