package io.reactivex.internal.operators.maybe;

import e3.f;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.s;
import io.reactivex.u;
import io.reactivex.v;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends s {
    static final class a extends AtomicReference implements c, u {
        final v a;
        private static final long b = 0xDDC22E67DCC87E5CL;

        a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.u, io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.u
        public boolean b(Throwable throwable0) {
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object object0 = this.get();
            d d0 = d.a;
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

        @Override  // io.reactivex.u
        public void c(f f0) {
            this.d(new b(f0));
        }

        @Override  // io.reactivex.u
        public void d(c c0) {
            d.f(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.u
        public void onComplete() {
            Object object0 = this.get();
            d d0 = d.a;
            if(object0 != d0) {
                c c0 = (c)this.getAndSet(d0);
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

        @Override  // io.reactivex.u
        public void onError(Throwable throwable0) {
            if(!this.b(throwable0)) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.u
        public void onSuccess(Object object0) {
            Object object1 = this.get();
            d d0 = d.a;
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
            return String.format("%s{%s}", "j$a", super.toString());
        }
    }

    final w a;

    public j(w w0) {
        this.a = w0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a j$a0 = new a(v0);
        v0.b(j$a0);
        try {
            this.a.a(j$a0);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            j$a0.onError(throwable0);
        }
    }
}

