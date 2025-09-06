package io.reactivex.internal.observers;

import f3.n;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.r;

public abstract class v extends x implements I, r {
    protected final I F;
    protected final n G;
    protected volatile boolean H;
    protected volatile boolean I;
    protected Throwable J;

    public v(I i0, n n0) {
        this.F = i0;
        this.G = n0;
    }

    @Override  // io.reactivex.internal.util.r
    public final boolean c() {
        return this.I;
    }

    @Override  // io.reactivex.internal.util.r
    public final Throwable d() {
        return this.J;
    }

    public final boolean e() {
        return this.p.get() == 0 && this.p.compareAndSet(0, 1);
    }

    @Override  // io.reactivex.internal.util.r
    public final int f(int v) {
        return this.p.addAndGet(v);
    }

    protected final void g(Object object0, boolean z, c c0) {
        I i0 = this.F;
        n n0 = this.G;
        if(this.p.get() != 0 || !this.p.compareAndSet(0, 1)) {
            n0.offer(object0);
            if(!this.h()) {
                return;
            }
        }
        else {
            this.j(i0, object0);
            if(this.f(-1) == 0) {
                return;
            }
        }
        io.reactivex.internal.util.v.d(n0, i0, z, c0, this);
    }

    @Override  // io.reactivex.internal.util.r
    public final boolean h() {
        return this.p.getAndIncrement() == 0;
    }

    @Override  // io.reactivex.internal.util.r
    public final boolean i() {
        return this.H;
    }

    @Override  // io.reactivex.internal.util.r
    public void j(I i0, Object object0) {
    }

    protected final void k(Object object0, boolean z, c c0) {
        I i0 = this.F;
        n n0 = this.G;
        if(this.p.get() != 0 || !this.p.compareAndSet(0, 1)) {
            n0.offer(object0);
            if(!this.h()) {
                return;
            }
        }
        else if(n0.isEmpty()) {
            this.j(i0, object0);
            if(this.f(-1) == 0) {
                return;
            }
        }
        else {
            n0.offer(object0);
        }
        io.reactivex.internal.util.v.d(n0, i0, z, c0, this);
    }
}

