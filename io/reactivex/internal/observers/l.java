package io.reactivex.internal.observers;

import d3.g;
import io.reactivex.I;
import io.reactivex.plugins.a;

public class l extends b {
    protected final I b;
    protected Object c;
    private static final long d = 0xB3A36F07F1262B8FL;
    static final int e = 2;
    static final int f = 4;
    static final int g = 8;
    static final int h = 16;
    static final int i = 0x20;

    public l(I i0) {
        this.b = i0;
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.get() == 4;
    }

    public final void c() {
        if((this.get() & 54) != 0) {
            return;
        }
        this.lazySet(2);
        this.b.onComplete();
    }

    @Override  // f3.o
    public final void clear() {
        this.lazySet(0x20);
        this.c = null;
    }

    public final void d(Object object0) {
        int v = this.get();
        if((v & 54) != 0) {
            return;
        }
        I i0 = this.b;
        if(v == 8) {
            this.c = object0;
            this.lazySet(16);
            i0.onNext(null);
        }
        else {
            this.lazySet(2);
            i0.onNext(object0);
        }
        if(this.get() != 4) {
            i0.onComplete();
        }
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.set(4);
        this.c = null;
    }

    public final void e(Throwable throwable0) {
        if((this.get() & 54) != 0) {
            a.Y(throwable0);
            return;
        }
        this.lazySet(2);
        this.b.onError(throwable0);
    }

    public final boolean f() {
        return this.getAndSet(4) != 4;
    }

    @Override  // f3.k
    public final int i(int v) {
        if((v & 2) != 0) {
            this.lazySet(8);
            return 2;
        }
        return 0;
    }

    @Override  // f3.o
    public final boolean isEmpty() {
        return this.get() != 16;
    }

    @Override  // f3.o
    @g
    public final Object poll() throws Exception {
        if(this.get() == 16) {
            Object object0 = this.c;
            this.c = null;
            this.lazySet(0x20);
            return object0;
        }
        return null;
    }
}

