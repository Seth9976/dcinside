package com.google.common.util.concurrent;

import J1.b;
import O1.g;
import com.google.common.base.H;
import com.google.common.base.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@b
@N
abstract class q extends a implements Runnable {
    static final class com.google.common.util.concurrent.q.a extends q {
        com.google.common.util.concurrent.q.a(t0 t00, w w0) {
            super(t00, w0);
        }

        @Override  // com.google.common.util.concurrent.q
        Object P(Object object0, @F0 Object object1) throws Exception {
            return this.R(((w)object0), object1);
        }

        @Override  // com.google.common.util.concurrent.q
        void Q(Object object0) {
            this.S(((t0)object0));
        }

        t0 R(w w0, @F0 Object object0) throws Exception {
            t0 t00 = w0.apply(object0);
            H.V(t00, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w0);
            return t00;
        }

        void S(t0 t00) {
            this.D(t00);
        }
    }

    static final class com.google.common.util.concurrent.q.b extends q {
        com.google.common.util.concurrent.q.b(t0 t00, t t0) {
            super(t00, t0);
        }

        @Override  // com.google.common.util.concurrent.q
        @F0
        Object P(Object object0, @F0 Object object1) throws Exception {
            return this.R(((t)object0), object1);
        }

        @Override  // com.google.common.util.concurrent.q
        void Q(@F0 Object object0) {
            this.B(object0);
        }

        @F0
        Object R(t t0, @F0 Object object0) {
            return t0.apply(object0);
        }
    }

    @o3.a
    t0 i;
    @o3.a
    Object j;

    q(t0 t00, Object object0) {
        this.i = (t0)H.E(t00);
        this.j = H.E(object0);
    }

    static t0 N(t0 t00, t t0, Executor executor0) {
        H.E(t0);
        t0 t01 = new com.google.common.util.concurrent.q.b(t00, t0);
        t00.addListener(((Runnable)t01), C0.p(executor0, ((f)t01)));
        return t01;
    }

    static t0 O(t0 t00, w w0, Executor executor0) {
        H.E(executor0);
        t0 t01 = new com.google.common.util.concurrent.q.a(t00, w0);
        t00.addListener(((Runnable)t01), C0.p(executor0, ((f)t01)));
        return t01;
    }

    @g
    @F0
    abstract Object P(Object arg1, @F0 Object arg2) throws Exception;

    @g
    abstract void Q(@F0 Object arg1);

    @Override  // com.google.common.util.concurrent.f
    protected final void m() {
        this.x(this.i);
        this.i = null;
        this.j = null;
    }

    @Override
    public final void run() {
        Object object2;
        Object object1;
        t0 t00 = this.i;
        Object object0 = this.j;
        if((this.isCancelled() | t00 == null | (object0 == null ? 1 : 0)) != 0) {
            return;
        }
        this.i = null;
        if(t00.isCancelled()) {
            this.D(t00);
            return;
        }
        try {
            object1 = h0.j(t00);
        }
        catch(CancellationException unused_ex) {
            this.cancel(false);
            return;
        }
        catch(ExecutionException executionException0) {
            this.C(executionException0.getCause());
            return;
        }
        catch(Exception exception0) {
            this.C(exception0);
            return;
        }
        catch(Error error0) {
            this.C(error0);
            return;
        }
        try {
            object2 = this.P(object0, object1);
        }
        catch(Throwable throwable0) {
            try {
                H0.b(throwable0);
                this.C(throwable0);
                this.j = null;
                return;
            }
            catch(Throwable throwable1) {
                this.j = null;
                throw throwable1;
            }
        }
        this.j = null;
        this.Q(object2);
    }

    @Override  // com.google.common.util.concurrent.f
    @o3.a
    protected String y() {
        t0 t00 = this.i;
        Object object0 = this.j;
        String s = super.y();
        String s1 = t00 == null ? "" : "inputFuture=[" + t00 + "], ";
        if(object0 != null) {
            return s1 + "function=[" + object0 + "]";
        }
        return s == null ? null : s1 + s;
    }
}

