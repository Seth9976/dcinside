package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.j.a;
import rx.j;

public final class g extends j {
    private final ThreadFactory a;

    public g(ThreadFactory threadFactory0) {
        this.a = threadFactory0;
    }

    @Override  // rx.j
    public a a() {
        return new h(this.a);
    }
}

