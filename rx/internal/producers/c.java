package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.d;
import rx.h;
import rx.i;
import rx.internal.operators.a;
import rx.internal.util.unsafe.G;
import rx.n;

public final class c extends AtomicLong implements h, i {
    final n a;
    final Queue b;
    final AtomicInteger c;
    Throwable d;
    volatile boolean e;
    private static final long f = 7277121710709137047L;
    static final Object g;

    static {
        c.g = new Object();
    }

    public c(n n0) {
        this(n0, new G());
    }

    public c(n n0, Queue queue0) {
        this.a = n0;
        this.b = queue0;
        this.c = new AtomicInteger();
    }

    private boolean b(boolean z, boolean z1) {
        if(this.a.j()) {
            return true;
        }
        if(z) {
            Throwable throwable0 = this.d;
            if(throwable0 != null) {
                this.b.clear();
                this.a.onError(throwable0);
                return true;
            }
            if(z1) {
                this.a.d();
                return true;
            }
        }
        return false;
    }

    @Override  // rx.h
    public void d() {
        this.e = true;
        this.f();
    }

    private void f() {
        if(this.c.getAndIncrement() == 0) {
            n n0 = this.a;
            Queue queue0 = this.b;
            while(true) {
                if(this.b(this.e, queue0.isEmpty())) {
                    return;
                }
                this.c.lazySet(1);
                long v = this.get();
                long v1 = 0L;
                while(v != 0L) {
                    boolean z = this.e;
                    Object object0 = queue0.poll();
                    if(this.b(z, object0 == null)) {
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    try {
                        if(object0 == c.g) {
                            n0.onNext(null);
                        }
                        else {
                            n0.onNext(object0);
                            goto label_24;
                        label_20:
                            if(object0 == c.g) {
                                goto label_21;
                            }
                            goto label_22;
                        }
                        goto label_24;
                    }
                    catch(Throwable throwable0) {
                        goto label_20;
                    }
                label_21:
                    object0 = null;
                label_22:
                    rx.exceptions.c.g(throwable0, n0, object0);
                    return;
                label_24:
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

    public boolean g(Object object0) {
        if(object0 == null) {
            if(!this.b.offer(c.g)) {
                return false;
            }
        }
        else if(!this.b.offer(object0)) {
            return false;
        }
        this.f();
        return true;
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.d = throwable0;
        this.e = true;
        this.f();
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        if(!this.g(object0)) {
            this.onError(new d());
        }
    }

    @Override  // rx.i
    public void request(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if(v1 > 0) {
            a.b(this, v);
            this.f();
        }
    }
}

