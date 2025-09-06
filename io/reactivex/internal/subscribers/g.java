package io.reactivex.internal.subscribers;

import e3.a;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class g extends AtomicReference implements c, io.reactivex.observers.g, q, e {
    final e3.g a;
    final e3.g b;
    final a c;
    final e3.g d;
    final int e;
    int f;
    final int g;
    private static final long h = 0x9B5ED57B794EA334L;

    public g(e3.g g0, e3.g g1, a a0, e3.g g2, int v) {
        this.a = g0;
        this.b = g1;
        this.c = a0;
        this.d = g2;
        this.e = v;
        this.g = v - (v >> 2);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == j.a;
    }

    @Override  // io.reactivex.observers.g
    public boolean c() {
        return this.b != io.reactivex.internal.functions.a.f;
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        j.a(this);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.cancel();
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.h(this, e0)) {
            try {
                this.d.accept(this);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                e0.cancel();
                this.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        Object object0 = this.get();
        j j0 = j.a;
        if(object0 != j0) {
            this.lazySet(j0);
            try {
                this.c.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        Object object0 = this.get();
        j j0 = j.a;
        if(object0 != j0) {
            this.lazySet(j0);
            try {
                this.b.accept(throwable0);
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
            }
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(!this.a()) {
            try {
                this.a.accept(object0);
                int v = this.f + 1;
                if(v == this.g) {
                    this.f = 0;
                    ((e)this.get()).request(((long)this.g));
                    return;
                }
                this.f = v;
                return;
            }
            catch(Throwable throwable0) {
            }
            b.b(throwable0);
            ((e)this.get()).cancel();
            this.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        ((e)this.get()).request(v);
    }
}

