package io.reactivex.subjects;

import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.a.a;
import io.reactivex.internal.util.q;

final class g extends i implements a {
    final i a;
    boolean b;
    io.reactivex.internal.util.a c;
    volatile boolean d;

    g(i i0) {
        this.a = i0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        this.a.d(i0);
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        boolean z = true;
        if(!this.d) {
            synchronized(this) {
                if(!this.d) {
                    if(this.b) {
                        io.reactivex.internal.util.a a0 = this.c;
                        if(a0 == null) {
                            a0 = new io.reactivex.internal.util.a(4);
                            this.c = a0;
                        }
                        a0.c(q.f(c0));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if(z) {
            c0.dispose();
            return;
        }
        this.a.b(c0);
        this.n8();
    }

    @Override  // io.reactivex.subjects.i
    @d3.g
    public Throwable i8() {
        return this.a.i8();
    }

    @Override  // io.reactivex.subjects.i
    public boolean j8() {
        return this.a.j8();
    }

    @Override  // io.reactivex.subjects.i
    public boolean k8() {
        return this.a.k8();
    }

    @Override  // io.reactivex.subjects.i
    public boolean l8() {
        return this.a.l8();
    }

    void n8() {
        io.reactivex.internal.util.a a0;
        while(true) {
            synchronized(this) {
                a0 = this.c;
                if(a0 == null) {
                    break;
                }
                this.c = null;
            }
            a0.d(this);
        }
        this.b = false;
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(this.d) {
            return;
        }
        synchronized(this) {
            if(this.d) {
                return;
            }
            this.d = true;
            if(this.b) {
                io.reactivex.internal.util.a a0 = this.c;
                if(a0 == null) {
                    a0 = new io.reactivex.internal.util.a(4);
                    this.c = a0;
                }
                a0.c(q.e());
                return;
            }
            this.b = true;
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        if(this.d) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.d) {
                this.d = true;
                if(this.b) {
                    io.reactivex.internal.util.a a0 = this.c;
                    if(a0 == null) {
                        a0 = new io.reactivex.internal.util.a(4);
                        this.c = a0;
                    }
                    a0.f(q.g(throwable0));
                    return;
                }
                this.b = true;
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
    public void onNext(Object object0) {
        if(this.d) {
            return;
        }
        synchronized(this) {
            if(this.d) {
                return;
            }
            if(this.b) {
                io.reactivex.internal.util.a a0 = this.c;
                if(a0 == null) {
                    a0 = new io.reactivex.internal.util.a(4);
                    this.c = a0;
                }
                a0.c(object0);
                return;
            }
            this.b = true;
        }
        this.a.onNext(object0);
        this.n8();
    }

    @Override  // io.reactivex.internal.util.a$a
    public boolean test(Object object0) {
        return q.c(object0, this.a);
    }
}

