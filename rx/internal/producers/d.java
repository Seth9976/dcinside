package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.c;
import rx.i;
import rx.internal.operators.a;
import rx.internal.util.unsafe.G;
import rx.n;

public final class d extends AtomicLong implements i {
    final n a;
    final Queue b;
    final AtomicInteger c;
    private static final long d = 7277121710709137047L;
    static final Object e;

    static {
        d.e = new Object();
    }

    public d(n n0) {
        this(n0, new G());
    }

    public d(n n0, Queue queue0) {
        this.a = n0;
        this.b = queue0;
        this.c = new AtomicInteger();
    }

    private void a() {
        if(this.c.getAndIncrement() == 0) {
            n n0 = this.a;
            Queue queue0 = this.b;
            while(true) {
                if(n0.j()) {
                    return;
                }
                this.c.lazySet(1);
                long v = this.get();
                long v1 = 0L;
                while(v != 0L) {
                    Object object0 = queue0.poll();
                    if(object0 == null) {
                        break;
                    }
                    try {
                        if(object0 == d.e) {
                            n0.onNext(null);
                        }
                        else {
                            n0.onNext(object0);
                            goto label_21;
                        label_17:
                            if(object0 == d.e) {
                                goto label_18;
                            }
                            goto label_19;
                        }
                        goto label_21;
                    }
                    catch(Throwable throwable0) {
                        goto label_17;
                    }
                label_18:
                    object0 = null;
                label_19:
                    c.g(throwable0, n0, object0);
                    return;
                label_21:
                    if(n0.j()) {
                        return;
                    }
                    --v;
                    ++v1;
                }
                if(v1 != 0L && this.get() != 0x7FFFFFFFFFFFFFFFL) {
                    this.addAndGet(-v1);
                }
                if(this.c.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    public boolean b(Object object0) {
        if(object0 == null) {
            if(!this.b.offer(d.e)) {
                return false;
            }
        }
        else if(!this.b.offer(object0)) {
            return false;
        }
        this.a();
        return true;
    }

    @Override  // rx.i
    public void request(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if(v1 > 0) {
            a.b(this, v);
            this.a();
        }
    }
}

