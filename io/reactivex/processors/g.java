package io.reactivex.processors;

import io.reactivex.internal.util.a;
import io.reactivex.internal.util.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

final class g extends c {
    final c b;
    boolean c;
    a d;
    volatile boolean e;

    g(c c0) {
        this.b = c0;
    }

    @Override  // io.reactivex.processors.c
    @d3.g
    public Throwable O8() {
        return this.b.O8();
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return this.b.P8();
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return this.b.Q8();
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return this.b.R8();
    }

    void T8() {
        a a0;
        while(true) {
            synchronized(this) {
                a0 = this.d;
                if(a0 == null) {
                    break;
                }
                this.d = null;
            }
            a0.b(this.b);
        }
        this.c = false;
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(e e0) {
        boolean z = true;
        if(!this.e) {
            synchronized(this) {
                if(!this.e) {
                    if(this.c) {
                        a a0 = this.d;
                        if(a0 == null) {
                            a0 = new a(4);
                            this.d = a0;
                        }
                        a0.c(q.s(e0));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if(z) {
            e0.cancel();
            return;
        }
        this.b.g(e0);
        this.T8();
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        this.b.e(d0);
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.e) {
            return;
        }
        synchronized(this) {
            if(this.e) {
                return;
            }
            this.e = true;
            if(this.c) {
                a a0 = this.d;
                if(a0 == null) {
                    a0 = new a(4);
                    this.d = a0;
                }
                a0.c(q.e());
                return;
            }
            this.c = true;
        }
        this.b.onComplete();
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.e) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.e) {
                this.e = true;
                if(this.c) {
                    a a0 = this.d;
                    if(a0 == null) {
                        a0 = new a(4);
                        this.d = a0;
                    }
                    a0.f(q.g(throwable0));
                    return;
                }
                this.c = true;
                z = false;
            }
        }
        if(z) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.e) {
            return;
        }
        synchronized(this) {
            if(this.e) {
                return;
            }
            if(this.c) {
                a a0 = this.d;
                if(a0 == null) {
                    a0 = new a(4);
                    this.d = a0;
                }
                a0.c(object0);
                return;
            }
            this.c = true;
        }
        this.b.onNext(object0);
        this.T8();
    }
}

