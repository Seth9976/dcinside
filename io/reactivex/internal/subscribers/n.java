package io.reactivex.internal.subscribers;

import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.u;
import io.reactivex.internal.util.v;
import io.reactivex.q;
import org.reactivestreams.d;

public abstract class n extends r implements u, q {
    protected final d N8;
    protected final f3.n O8;
    protected volatile boolean P8;
    protected volatile boolean Q8;
    protected Throwable R8;

    public n(d d0, f3.n n0) {
        this.N8 = d0;
        this.O8 = n0;
    }

    @Override  // io.reactivex.internal.util.u
    public final long b(long v) {
        return this.F.addAndGet(-v);
    }

    @Override  // io.reactivex.internal.util.u
    public final boolean c() {
        return this.Q8;
    }

    @Override  // io.reactivex.internal.util.u
    public final Throwable d() {
        return this.R8;
    }

    @Override  // io.reactivex.internal.util.u
    public final long e() {
        return this.F.get();
    }

    @Override  // io.reactivex.internal.util.u
    public final int f(int v) {
        return this.p.addAndGet(v);
    }

    @Override  // io.reactivex.internal.util.u
    public final boolean h() {
        return this.p.getAndIncrement() == 0;
    }

    @Override  // io.reactivex.internal.util.u
    public final boolean i() {
        return this.P8;
    }

    @Override  // io.reactivex.internal.util.u
    public boolean j(d d0, Object object0) {
        return false;
    }

    public final boolean k() {
        return this.p.get() == 0 && this.p.compareAndSet(0, 1);
    }

    protected final void l(Object object0, boolean z, c c0) {
        d d0 = this.N8;
        f3.n n0 = this.O8;
        if(this.k()) {
            long v = this.F.get();
            if(v == 0L) {
                c0.dispose();
                d0.onError(new io.reactivex.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            }
            if(this.j(d0, object0) && v != 0x7FFFFFFFFFFFFFFFL) {
                this.b(1L);
            }
            if(this.f(-1) == 0) {
                return;
            }
        }
        else {
            n0.offer(object0);
            if(!this.h()) {
                return;
            }
        }
        v.e(n0, d0, z, c0, this);
    }

    protected final void n(Object object0, boolean z, c c0) {
        d d0 = this.N8;
        f3.n n0 = this.O8;
        if(this.k()) {
            long v = this.F.get();
            if(v == 0L) {
                this.P8 = true;
                c0.dispose();
                d0.onError(new io.reactivex.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            }
            if(n0.isEmpty()) {
                if(this.j(d0, object0) && v != 0x7FFFFFFFFFFFFFFFL) {
                    this.b(1L);
                }
                if(this.f(-1) == 0) {
                    return;
                }
            }
            else {
                n0.offer(object0);
                v.e(n0, d0, z, c0, this);
                return;
            }
        }
        else {
            n0.offer(object0);
            if(!this.h()) {
                return;
            }
        }
        v.e(n0, d0, z, c0, this);
    }

    public final void o(long v) {
        if(j.j(v)) {
            io.reactivex.internal.util.d.a(this.F, v);
        }
    }
}

