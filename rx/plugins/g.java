package rx.plugins;

import java.util.concurrent.ThreadFactory;
import rx.internal.schedulers.a;
import rx.internal.schedulers.b;
import rx.internal.util.n;
import rx.j;

public class g {
    private static final g a;

    static {
        g.a = new g();
    }

    public static j a() {
        return g.b(new n("RxComputationScheduler-"));
    }

    public static j b(ThreadFactory threadFactory0) {
        if(threadFactory0 == null) {
            throw new NullPointerException("threadFactory == null");
        }
        return new b(threadFactory0);
    }

    public static j c() {
        return g.d(new n("RxIoScheduler-"));
    }

    public static j d(ThreadFactory threadFactory0) {
        if(threadFactory0 == null) {
            throw new NullPointerException("threadFactory == null");
        }
        return new a(threadFactory0);
    }

    public static j e() {
        return g.f(new n("RxNewThreadScheduler-"));
    }

    public static j f(ThreadFactory threadFactory0) {
        if(threadFactory0 == null) {
            throw new NullPointerException("threadFactory == null");
        }
        return new rx.internal.schedulers.g(threadFactory0);
    }

    public j g() [...] // Inlined contents

    public static g h() {
        return g.a;
    }

    public j i() [...] // Inlined contents

    public j j() [...] // Inlined contents

    @Deprecated
    public rx.functions.a k(rx.functions.a a0) {
        return a0;
    }
}

