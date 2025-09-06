package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.f;
import io.reactivex.internal.disposables.b;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends c {
    static final class a extends AtomicReference implements io.reactivex.disposables.c, e {
        final f a;
        private static final long b = 0xDDC22E67DCC87E5CL;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.e, io.reactivex.disposables.c
        public boolean a() {
            return d.c(((io.reactivex.disposables.c)this.get()));
        }

        @Override  // io.reactivex.e
        public boolean b(Throwable throwable0) {
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object object0 = this.get();
            d d0 = d.a;
            if(object0 != d0) {
                io.reactivex.disposables.c c0 = (io.reactivex.disposables.c)this.getAndSet(d0);
                if(c0 != d0) {
                    try {
                        this.a.onError(throwable0);
                    }
                    catch(Throwable throwable1) {
                        if(c0 != null) {
                            c0.dispose();
                        }
                        throw throwable1;
                    }
                    if(c0 != null) {
                        c0.dispose();
                    }
                    return true;
                }
            }
            return false;
        }

        @Override  // io.reactivex.e
        public void c(e3.f f0) {
            this.d(new b(f0));
        }

        @Override  // io.reactivex.e
        public void d(io.reactivex.disposables.c c0) {
            d.f(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.e
        public void onComplete() {
            Object object0 = this.get();
            d d0 = d.a;
            if(object0 != d0) {
                io.reactivex.disposables.c c0 = (io.reactivex.disposables.c)this.getAndSet(d0);
                if(c0 != d0) {
                    try {
                        this.a.onComplete();
                    }
                    catch(Throwable throwable0) {
                        if(c0 != null) {
                            c0.dispose();
                        }
                        throw throwable0;
                    }
                    if(c0 != null) {
                        c0.dispose();
                    }
                }
            }
        }

        @Override  // io.reactivex.e
        public void onError(Throwable throwable0) {
            if(!this.b(throwable0)) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return String.format("%s{%s}", "g$a", super.toString());
        }
    }

    final io.reactivex.g a;

    public g(io.reactivex.g g0) {
        this.a = g0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a g$a0 = new a(f0);
        f0.b(g$a0);
        try {
            this.a.a(g$a0);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            g$a0.onError(throwable0);
        }
    }
}

