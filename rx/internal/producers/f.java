package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.c;
import rx.i;
import rx.n;

public final class f extends AtomicBoolean implements i {
    final n a;
    final Object b;
    private static final long c = 0xD175AC47992501D4L;

    public f(n n0, Object object0) {
        this.a = n0;
        this.b = object0;
    }

    @Override  // rx.i
    public void request(long v) {
        Object object0;
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if(v1 == 0) {
            return;
        }
        if(this.compareAndSet(false, true)) {
            n n0 = this.a;
            if(n0.j()) {
                return;
            }
            try {
                object0 = this.b;
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
    }
}

