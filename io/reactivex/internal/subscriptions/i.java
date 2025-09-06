package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public class i extends AtomicInteger implements e {
    e a;
    long b;
    final AtomicReference c;
    final AtomicLong d;
    final AtomicLong e;
    final boolean f;
    volatile boolean g;
    protected boolean h;
    private static final long i = 0xE19D4040B4A4ED02L;

    public i(boolean z) {
        this.f = z;
        this.c = new AtomicReference();
        this.d = new AtomicLong();
        this.e = new AtomicLong();
    }

    final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        this.b();
    }

    final void b() {
        int v = 1;
        long v1 = 0L;
        e e0 = null;
        do {
            e e1 = (e)this.c.get();
            if(e1 != null) {
                e1 = (e)this.c.getAndSet(null);
            }
            long v2 = this.d.get();
            if(v2 != 0L) {
                v2 = this.d.getAndSet(0L);
            }
            long v3 = this.e.get();
            if(v3 != 0L) {
                v3 = this.e.getAndSet(0L);
            }
            e e2 = this.a;
            if(this.g) {
                if(e2 != null) {
                    e2.cancel();
                    this.a = null;
                }
                if(e1 != null) {
                    e1.cancel();
                }
            }
            else {
                long v4 = this.b;
                if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                    v4 = d.c(v4, v2);
                    if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                        v4 -= v3;
                        if(v4 < 0L) {
                            j.e(v4);
                            v4 = 0L;
                        }
                    }
                    this.b = v4;
                }
                if(e1 != null) {
                    if(e2 != null && this.f) {
                        e2.cancel();
                    }
                    this.a = e1;
                    if(v4 != 0L) {
                        v1 = d.c(v1, v4);
                        e0 = e1;
                    }
                }
                else if(e2 != null && v2 != 0L) {
                    v1 = d.c(v1, v2);
                    e0 = e2;
                }
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
        if(v1 != 0L) {
            e0.request(v1);
        }
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        if(!this.g) {
            this.g = true;
            this.a();
        }
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean f() {
        return this.h;
    }

    public final void h(long v) {
        if(this.h) {
            return;
        }
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            long v1 = this.b;
            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                long v2 = v1 - v;
                if(v2 < 0L) {
                    j.e(v2);
                    v2 = 0L;
                }
                this.b = v2;
            }
            if(this.decrementAndGet() == 0) {
                return;
            }
            this.b();
            return;
        }
        d.a(this.e, v);
        this.a();
    }

    public final void i(e e0) {
        if(this.g) {
            e0.cancel();
            return;
        }
        b.g(e0, "s is null");
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            e e1 = this.a;
            if(e1 != null && this.f) {
                e1.cancel();
            }
            this.a = e0;
            long v = this.b;
            if(this.decrementAndGet() != 0) {
                this.b();
            }
            if(v != 0L) {
                e0.request(v);
            }
            return;
        }
        e e2 = (e)this.c.getAndSet(e0);
        if(e2 != null && this.f) {
            e2.cancel();
        }
        this.a();
    }

    @Override  // org.reactivestreams.e
    public final void request(long v) {
        if(!j.j(v) || this.h) {
            return;
        }
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            long v1 = this.b;
            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                long v2 = d.c(v1, v);
                this.b = v2;
                if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                    this.h = true;
                }
            }
            e e0 = this.a;
            if(this.decrementAndGet() != 0) {
                this.b();
            }
            if(e0 != null) {
                e0.request(v);
            }
            return;
        }
        d.a(this.d, v);
        this.a();
    }
}

