package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.a;
import io.reactivex.q;
import org.reactivestreams.d;

public final class e implements q, org.reactivestreams.e {
    final d a;
    final boolean b;
    org.reactivestreams.e c;
    boolean d;
    a e;
    volatile boolean f;
    static final int g = 4;

    public e(d d0) {
        this(d0, false);
    }

    public e(d d0, boolean z) {
        this.a = d0;
        this.b = z;
    }

    void a() {
        do {
            synchronized(this) {
                a a0 = this.e;
                if(a0 == null) {
                    this.d = false;
                    return;
                }
                this.e = null;
            }
        }
        while(!a0.b(this.a));
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.c.cancel();
    }

    @Override  // io.reactivex.q
    public void g(org.reactivestreams.e e0) {
        if(j.k(this.c, e0)) {
            this.c = e0;
            this.a.g(this);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.f) {
            return;
        }
        synchronized(this) {
            if(this.f) {
                return;
            }
            if(this.d) {
                a a0 = this.e;
                if(a0 == null) {
                    a0 = new a(4);
                    this.e = a0;
                }
                a0.c(io.reactivex.internal.util.q.e());
                return;
            }
            this.f = true;
            this.d = true;
        }
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.f) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.f) {
                if(this.d) {
                    this.f = true;
                    a a0 = this.e;
                    if(a0 == null) {
                        a0 = new a(4);
                        this.e = a0;
                    }
                    Object object0 = io.reactivex.internal.util.q.g(throwable0);
                    if(this.b) {
                        a0.c(object0);
                    }
                    else {
                        a0.f(object0);
                    }
                    return;
                }
                this.f = true;
                this.d = true;
                z = false;
            }
        }
        if(z) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.f) {
            return;
        }
        if(object0 == null) {
            this.c.cancel();
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized(this) {
            if(this.f) {
                return;
            }
            if(this.d) {
                a a0 = this.e;
                if(a0 == null) {
                    a0 = new a(4);
                    this.e = a0;
                }
                a0.c(object0);
                return;
            }
            this.d = true;
        }
        this.a.onNext(object0);
        this.a();
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        this.c.request(v);
    }
}

