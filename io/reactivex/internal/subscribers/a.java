package io.reactivex.internal.subscribers;

import f3.l;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import org.reactivestreams.e;

public abstract class a implements f3.a, l {
    protected final f3.a a;
    protected e b;
    protected l c;
    protected boolean d;
    protected int e;

    public a(f3.a a0) {
        this.a = a0;
    }

    protected void a() {
    }

    protected boolean b() [...] // Inlined contents

    protected final void c(Throwable throwable0) {
        b.b(throwable0);
        this.b.cancel();
        this.onError(throwable0);
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.b.cancel();
    }

    @Override  // f3.o
    public void clear() {
        this.c.clear();
    }

    protected final int d(int v) {
        l l0 = this.c;
        if(l0 != null && (v & 4) == 0) {
            int v1 = l0.i(v);
            if(v1 != 0) {
                this.e = v1;
            }
            return v1;
        }
        return 0;
    }

    @Override  // io.reactivex.q
    public final void g(e e0) {
        if(j.k(this.b, e0)) {
            this.b = e0;
            if(e0 instanceof l) {
                this.c = (l)e0;
            }
            this.a.g(this);
        }
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override  // f3.o
    public final boolean j(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // f3.o
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.d) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.d = true;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        this.b.request(v);
    }
}

