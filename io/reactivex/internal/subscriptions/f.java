package io.reactivex.internal.subscriptions;

import d3.g;
import org.reactivestreams.d;

public class f extends c {
    protected final d b;
    protected Object c;
    private static final long d = 0xE2251E4EC8E822BFL;
    static final int e = 0;
    static final int f = 1;
    static final int g = 2;
    static final int h = 3;
    static final int i = 4;
    static final int j = 8;
    static final int k = 16;
    static final int l = 0x20;

    public f(d d0) {
        this.b = d0;
    }

    public final void a(Object object0) {
        int v = this.get();
        do {
            if(v == 8) {
                this.c = object0;
                this.lazySet(16);
                d d0 = this.b;
                d0.onNext(object0);
                if(this.get() != 4) {
                    d0.onComplete();
                }
                return;
            }
            if((v & -3) != 0) {
                return;
            }
            if(v == 2) {
                this.lazySet(3);
                d d1 = this.b;
                d1.onNext(object0);
                if(this.get() != 4) {
                    d1.onComplete();
                }
                return;
            }
            this.c = object0;
            if(this.compareAndSet(0, 1)) {
                return;
            }
            v = this.get();
        }
        while(v != 4);
        this.c = null;
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.set(4);
        this.c = null;
    }

    @Override  // f3.o
    public final void clear() {
        this.lazySet(0x20);
        this.c = null;
    }

    public final boolean f() {
        return this.get() == 4;
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

    public final boolean n() {
        return this.getAndSet(4) != 4;
    }

    @Override  // f3.o
    @g
    public final Object poll() {
        if(this.get() == 16) {
            this.lazySet(0x20);
            Object object0 = this.c;
            this.c = null;
            return object0;
        }
        return null;
    }

    @Override  // org.reactivestreams.e
    public final void request(long v) {
        if(j.j(v)) {
            while(true) {
                int v1 = this.get();
                if((v1 & -2) != 0) {
                    return;
                }
                if(v1 == 1) {
                    if(this.compareAndSet(1, 3)) {
                        Object object0 = this.c;
                        if(object0 != null) {
                            this.c = null;
                            d d0 = this.b;
                            d0.onNext(object0);
                            if(this.get() != 4) {
                                d0.onComplete();
                            }
                        }
                    }
                    return;
                }
                if(this.compareAndSet(0, 2)) {
                    break;
                }
            }
        }
    }
}

