package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.exceptions.c;
import rx.i;
import rx.n;

public final class e extends AtomicInteger implements i {
    final n a;
    Object b;
    private static final long c = 0xD81F64205AE9A74EL;
    static final int d = 0;
    static final int e = 1;
    static final int f = 2;
    static final int g = 3;

    public e(n n0) {
        this.a = n0;
    }

    private static void a(n n0, Object object0) {
        if(n0.j()) {
            return;
        }
        try {
            n0.onNext(object0);
        }
        catch(Throwable throwable0) {
            c.g(throwable0, n0, object0);
            return;
        }
        if(n0.j()) {
            return;
        }
        n0.d();
    }

    public void b(Object object0) {
        while(true) {
            int v = this.get();
            if(v != 0) {
                if(v != 2 || !this.compareAndSet(2, 3)) {
                    break;
                }
                e.a(this.a, object0);
                break;
            }
            this.b = object0;
            if(this.compareAndSet(0, 1)) {
                break;
            }
        }
    }

    @Override  // rx.i
    public void request(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if(v1 == 0) {
            return;
        }
        while(true) {
            int v2 = this.get();
            if(v2 != 0) {
                if(v2 != 1 || !this.compareAndSet(1, 3)) {
                    break;
                }
                e.a(this.a, this.b);
                break;
            }
            if(this.compareAndSet(0, 2)) {
                break;
            }
        }
    }
}

