package io.reactivex.internal.observers;

import f3.j;
import f3.o;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.v;
import java.util.concurrent.atomic.AtomicReference;

public final class s extends AtomicReference implements I, c {
    final t a;
    final int b;
    o c;
    volatile boolean d;
    int e;
    private static final long f = 0xB4D24C6F8C4D0573L;

    public s(t t0, int v) {
        this.a = t0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return d.c(((c)this.get()));
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        if(d.g(this, c0)) {
            if(c0 instanceof j) {
                int v = ((j)c0).i(3);
                if(v == 1) {
                    this.e = 1;
                    this.c = (j)c0;
                    this.d = true;
                    this.a.f(this);
                    return;
                }
                if(v == 2) {
                    this.e = 2;
                    this.c = (j)c0;
                    return;
                }
            }
            this.c = v.c(-this.b);
        }
    }

    public int c() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    public o e() {
        return this.c;
    }

    public void f() {
        this.d = true;
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        this.a.f(this);
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        this.a.e(this, throwable0);
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        if(this.e == 0) {
            this.a.g(this, object0);
            return;
        }
        this.a.d();
    }
}

