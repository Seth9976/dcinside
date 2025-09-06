package io.reactivex.processors;

import d3.f;
import d3.g;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class h extends c {
    final class a extends io.reactivex.internal.subscriptions.c {
        final h b;
        private static final long c = 0xBC0B3640F713CD72L;

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(h.this.h) {
                return;
            }
            h.this.h = true;
            h.this.Z8();
            h.this.g.lazySet(null);
            if(h.this.j.getAndIncrement() == 0) {
                h.this.g.lazySet(null);
                h h0 = h.this;
                if(!h0.l) {
                    h0.b.clear();
                }
            }
        }

        @Override  // f3.o
        public void clear() {
            h.this.b.clear();
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 2) != 0) {
                h.this.l = true;
                return 2;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return h.this.b.isEmpty();
        }

        @Override  // f3.o
        @g
        public Object poll() {
            return h.this.b.poll();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                d.a(h.this.k, v);
                h.this.a9();
            }
        }
    }

    final io.reactivex.internal.queue.c b;
    final AtomicReference c;
    final boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicReference g;
    volatile boolean h;
    final AtomicBoolean i;
    final io.reactivex.internal.subscriptions.c j;
    final AtomicLong k;
    boolean l;

    h(int v) {
        this(v, null, true);
    }

    h(int v, Runnable runnable0) {
        this(v, runnable0, true);
    }

    h(int v, Runnable runnable0, boolean z) {
        this.b = new io.reactivex.internal.queue.c(b.h(v, "capacityHint"));
        this.c = new AtomicReference(runnable0);
        this.d = z;
        this.g = new AtomicReference();
        this.i = new AtomicBoolean();
        this.j = new a(this);
        this.k = new AtomicLong();
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.processors.c
    @g
    public Throwable O8() {
        return this.e ? this.f : null;
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return this.e && this.f == null;
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return this.g.get() != null;
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return this.e && this.f != null;
    }

    boolean T8(boolean z, boolean z1, boolean z2, org.reactivestreams.d d0, io.reactivex.internal.queue.c c0) {
        if(this.h) {
            c0.clear();
            this.g.lazySet(null);
            return true;
        }
        if(z1) {
            if(z && this.f != null) {
                c0.clear();
                this.g.lazySet(null);
                d0.onError(this.f);
                return true;
            }
            if(z2) {
                Throwable throwable0 = this.f;
                this.g.lazySet(null);
                if(throwable0 != null) {
                    d0.onError(throwable0);
                    return true;
                }
                d0.onComplete();
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @d3.d
    @f
    public static h U8() {
        return new h(0x80);
    }

    @d3.d
    @f
    public static h V8(int v) {
        return new h(v);
    }

    @d3.d
    @f
    public static h W8(int v, Runnable runnable0) {
        b.g(runnable0, "onTerminate");
        return new h(v, runnable0);
    }

    @d3.d
    @f
    public static h X8(int v, Runnable runnable0, boolean z) {
        b.g(runnable0, "onTerminate");
        return new h(v, runnable0, z);
    }

    // 去混淆评级： 低(20)
    @d3.d
    @f
    public static h Y8(boolean z) {
        return new h(0x80, null, z);
    }

    void Z8() {
        Runnable runnable0 = (Runnable)this.c.getAndSet(null);
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    void a9() {
        if(this.j.getAndIncrement() != 0) {
            return;
        }
        org.reactivestreams.d d0 = (org.reactivestreams.d)this.g.get();
        int v = 1;
        while(true) {
            if(d0 != null) {
                if(this.l) {
                    this.b9(d0);
                    return;
                }
                this.c9(d0);
                return;
            }
            v = this.j.addAndGet(-v);
            if(v == 0) {
                return;
            }
            d0 = (org.reactivestreams.d)this.g.get();
        }
    }

    void b9(org.reactivestreams.d d0) {
        io.reactivex.internal.queue.c c0 = this.b;
        boolean z = this.d;
        int v = 1;
        do {
            if(this.h) {
                this.g.lazySet(null);
                return;
            }
            boolean z1 = this.e;
            if(!z && z1 && this.f != null) {
                c0.clear();
                this.g.lazySet(null);
                d0.onError(this.f);
                return;
            }
            d0.onNext(null);
            if(z1) {
                this.g.lazySet(null);
                Throwable throwable0 = this.f;
                if(throwable0 != null) {
                    d0.onError(throwable0);
                    return;
                }
                d0.onComplete();
                return;
            }
            v = this.j.addAndGet(-v);
        }
        while(v != 0);
    }

    void c9(org.reactivestreams.d d0) {
        long v5;
        io.reactivex.internal.queue.c c0 = this.b;
        int v = !this.d;
        int v1 = 1;
        do {
            long v2 = this.k.get();
            long v3 = 0L;
            while(true) {
                int v4 = Long.compare(v2, v3);
                if(v4 != 0) {
                    boolean z = this.e;
                    Object object0 = c0.poll();
                    v5 = v3;
                    if(this.T8(((boolean)v), z, object0 == null, d0, c0)) {
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    else {
                        d0.onNext(object0);
                        v3 = v5 + 1L;
                        continue;
                    }
                }
                v5 = v3;
                break;
            }
            if(v4 == 0 && this.T8(((boolean)v), this.e, c0.isEmpty(), d0, c0)) {
                return;
            }
            if(v5 != 0L && v2 != 0x7FFFFFFFFFFFFFFFL) {
                this.k.addAndGet(-v5);
            }
            v1 = this.j.addAndGet(-v1);
        }
        while(v1 != 0);
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(e e0) {
        if(!this.e && !this.h) {
            e0.request(0x7FFFFFFFFFFFFFFFL);
            return;
        }
        e0.cancel();
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        if(!this.i.get() && this.i.compareAndSet(false, true)) {
            d0.g(this.j);
            this.g.set(d0);
            if(this.h) {
                this.g.lazySet(null);
                return;
            }
            this.a9();
            return;
        }
        io.reactivex.internal.subscriptions.g.b(new IllegalStateException("This processor allows only a single Subscriber"), d0);
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(!this.e && !this.h) {
            this.e = true;
            this.Z8();
            this.a9();
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.e && !this.h) {
            this.f = throwable0;
            this.e = true;
            this.Z8();
            this.a9();
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.e && !this.h) {
            this.b.offer(object0);
            this.a9();
        }
    }
}

