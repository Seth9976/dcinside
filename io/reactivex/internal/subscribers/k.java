package io.reactivex.internal.subscribers;

import f3.o;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.v;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class k extends AtomicReference implements q, e {
    final l a;
    final int b;
    final int c;
    volatile o d;
    volatile boolean e;
    long f;
    int g;
    private static final long h = 22876611072430776L;

    public k(l l0, int v) {
        this.a = l0;
        this.b = v;
        this.c = v - (v >> 2);
    }

    public boolean a() {
        return this.e;
    }

    public o b() {
        return this.d;
    }

    public void c() {
        if(this.g != 1) {
            long v = this.f + 1L;
            if(v == ((long)this.c)) {
                this.f = 0L;
                ((e)this.get()).request(v);
                return;
            }
            this.f = v;
        }
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        j.a(this);
    }

    public void d() {
        this.e = true;
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.h(this, e0)) {
            if(e0 instanceof f3.l) {
                int v = ((f3.l)e0).i(3);
                if(v == 1) {
                    this.g = 1;
                    this.d = (f3.l)e0;
                    this.e = true;
                    this.a.a(this);
                    return;
                }
                if(v == 2) {
                    this.g = 2;
                    this.d = (f3.l)e0;
                    v.j(e0, this.b);
                    return;
                }
            }
            this.d = v.c(this.b);
            v.j(e0, this.b);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        this.a.a(this);
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        this.a.b(this, throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.g == 0) {
            this.a.c(this, object0);
            return;
        }
        this.a.d();
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        if(this.g != 1) {
            long v1 = this.f + v;
            if(v1 >= ((long)this.c)) {
                this.f = 0L;
                ((e)this.get()).request(v1);
                return;
            }
            this.f = v1;
        }
    }
}

