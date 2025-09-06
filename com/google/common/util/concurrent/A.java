package com.google.common.util.concurrent;

import J1.b;
import O1.g;
import com.google.common.base.H;
import com.google.common.base.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@b
@N
abstract class a extends com.google.common.util.concurrent.U.a implements Runnable {
    static final class com.google.common.util.concurrent.a.a extends a {
        com.google.common.util.concurrent.a.a(t0 t00, Class class0, w w0) {
            super(t00, class0, w0);
        }

        @Override  // com.google.common.util.concurrent.a
        Object P(Object object0, Throwable throwable0) throws Exception {
            return this.R(((w)object0), throwable0);
        }

        @Override  // com.google.common.util.concurrent.a
        void Q(Object object0) {
            this.S(((t0)object0));
        }

        t0 R(w w0, Throwable throwable0) throws Exception {
            t0 t00 = w0.apply(throwable0);
            H.V(t00, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w0);
            return t00;
        }

        void S(t0 t00) {
            this.D(t00);
        }
    }

    static final class com.google.common.util.concurrent.a.b extends a {
        com.google.common.util.concurrent.a.b(t0 t00, Class class0, t t0) {
            super(t00, class0, t0);
        }

        @Override  // com.google.common.util.concurrent.a
        @F0
        Object P(Object object0, Throwable throwable0) throws Exception {
            return this.R(((t)object0), throwable0);
        }

        @Override  // com.google.common.util.concurrent.a
        void Q(@F0 Object object0) {
            this.B(object0);
        }

        @F0
        Object R(t t0, Throwable throwable0) throws Exception {
            return t0.apply(throwable0);
        }
    }

    @o3.a
    t0 i;
    @o3.a
    Class j;
    @o3.a
    Object k;

    a(t0 t00, Class class0, Object object0) {
        this.i = (t0)H.E(t00);
        this.j = (Class)H.E(class0);
        this.k = H.E(object0);
    }

    static t0 N(t0 t00, Class class0, t t0, Executor executor0) {
        t0 t01 = new com.google.common.util.concurrent.a.b(t00, class0, t0);
        t00.addListener(((Runnable)t01), C0.p(executor0, ((f)t01)));
        return t01;
    }

    static t0 O(t0 t00, Class class0, w w0, Executor executor0) {
        t0 t01 = new com.google.common.util.concurrent.a.a(t00, class0, w0);
        t00.addListener(((Runnable)t01), C0.p(executor0, ((f)t01)));
        return t01;
    }

    @g
    @F0
    abstract Object P(Object arg1, Throwable arg2) throws Exception;

    @g
    abstract void Q(@F0 Object arg1);

    @Override  // com.google.common.util.concurrent.f
    protected final void m() {
        this.x(this.i);
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override
    public final void run() {
        Object object2;
        Throwable throwable1;
        Object object1;
        t0 t00 = this.i;
        Class class0 = this.j;
        Object object0 = this.k;
        if(((object0 == null ? 1 : 0) | ((t00 == null ? 1 : 0) | (class0 == null ? 1 : 0))) == 0 && !this.isCancelled()) {
            try {
                this.i = null;
                throwable0 = t00 instanceof com.google.common.util.concurrent.internal.a ? com.google.common.util.concurrent.internal.b.a(((com.google.common.util.concurrent.internal.a)t00)) : null;
                if(throwable0 == null) {
                    object1 = h0.j(t00);
                    goto label_17;
                label_12:
                    throwable1 = executionException0.getCause();
                    if(throwable1 == null) {
                        goto label_14;
                    }
                    goto label_15;
                }
                else {
                    goto label_16;
                }
                goto label_17;
            }
            catch(ExecutionException executionException0) {
                goto label_12;
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
        label_14:
            throwable1 = new NullPointerException("Future type " + t00.getClass() + " threw " + executionException0.getClass() + " without a cause");
        label_15:
            throwable0 = throwable1;
        label_16:
            object1 = null;
        label_17:
            if(throwable0 == null) {
                this.B(object1);
                return;
            }
            if(!H0.a(throwable0, class0)) {
                this.D(t00);
                return;
            }
            try {
                object2 = this.P(object0, throwable0);
            }
            catch(Throwable throwable2) {
                try {
                    H0.b(throwable2);
                    this.C(throwable2);
                    this.j = null;
                    this.k = null;
                    return;
                }
                catch(Throwable throwable3) {
                    this.j = null;
                    this.k = null;
                    throw throwable3;
                }
            }
            this.j = null;
            this.k = null;
            this.Q(object2);
        }
    }

    @Override  // com.google.common.util.concurrent.f
    @o3.a
    protected String y() {
        t0 t00 = this.i;
        Class class0 = this.j;
        Object object0 = this.k;
        String s = super.y();
        String s1 = t00 == null ? "" : "inputFuture=[" + t00 + "], ";
        if(class0 != null && object0 != null) {
            return s1 + "exceptionType=[" + class0 + "], fallback=[" + object0 + "]";
        }
        return s == null ? null : s1 + s;
    }
}

