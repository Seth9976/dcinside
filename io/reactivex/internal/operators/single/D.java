package io.reactivex.internal.operators.single;

import e3.f;
import io.reactivex.K;
import io.reactivex.M;
import io.reactivex.N;
import io.reactivex.O;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.b;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends K {
    static final class a extends AtomicReference implements M, c {
        final N a;
        private static final long b = 0xDDC22E67DCC87E5CL;

        a(N n0) {
            this.a = n0;
        }

        @Override  // io.reactivex.M, io.reactivex.disposables.c
        public boolean a() {
            return io.reactivex.internal.disposables.d.c(((c)this.get()));
        }

        @Override  // io.reactivex.M
        public boolean b(Throwable throwable0) {
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object object0 = this.get();
            io.reactivex.internal.disposables.d d0 = io.reactivex.internal.disposables.d.a;
            if(object0 != d0) {
                c c0 = (c)this.getAndSet(d0);
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

        @Override  // io.reactivex.M
        public void c(f f0) {
            this.d(new b(f0));
        }

        @Override  // io.reactivex.M
        public void d(c c0) {
            io.reactivex.internal.disposables.d.f(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override  // io.reactivex.M
        public void onError(Throwable throwable0) {
            if(!this.b(throwable0)) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.M
        public void onSuccess(Object object0) {
            Object object1 = this.get();
            io.reactivex.internal.disposables.d d0 = io.reactivex.internal.disposables.d.a;
            if(object1 != d0) {
                c c0 = (c)this.getAndSet(d0);
                if(c0 != d0) {
                    try {
                        if(object0 == null) {
                            NullPointerException nullPointerException0 = new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
                            this.a.onError(nullPointerException0);
                        }
                        else {
                            this.a.onSuccess(object0);
                            goto label_15;
                        label_12:
                            if(c0 == null) {
                                throw throwable0;
                            }
                            goto label_13;
                        }
                        goto label_15;
                    }
                    catch(Throwable throwable0) {
                        goto label_12;
                    }
                label_13:
                    c0.dispose();
                    throw throwable0;
                label_15:
                    if(c0 != null) {
                        c0.dispose();
                    }
                }
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return String.format("%s{%s}", "d$a", super.toString());
        }
    }

    final O a;

    public d(O o0) {
        this.a = o0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a d$a0 = new a(n0);
        n0.b(d$a0);
        try {
            this.a.a(d$a0);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            d$a0.onError(throwable0);
        }
    }
}

