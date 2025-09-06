package io.reactivex.observers;

import d3.f;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.a;
import io.reactivex.internal.util.q;

public final class m implements I, c {
    final I a;
    final boolean b;
    c c;
    boolean d;
    a e;
    volatile boolean f;
    static final int g = 4;

    public m(@f I i0) {
        this(i0, false);
    }

    public m(@f I i0, boolean z) {
        this.a = i0;
        this.b = z;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.c.a();
    }

    @Override  // io.reactivex.I
    public void b(@f c c0) {
        if(d.i(this.c, c0)) {
            this.c = c0;
            this.a.b(this);
        }
    }

    void c() {
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
        while(!a0.a(this.a));
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.c.dispose();
    }

    @Override  // io.reactivex.I
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
                a0.c(q.e());
                return;
            }
            this.f = true;
            this.d = true;
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.I
    public void onError(@f Throwable throwable0) {
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
                    Object object0 = q.g(throwable0);
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

    @Override  // io.reactivex.I
    public void onNext(@f Object object0) {
        if(this.f) {
            return;
        }
        if(object0 == null) {
            this.c.dispose();
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
        this.c();
    }
}

