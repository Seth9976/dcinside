package com.google.common.util.concurrent;

import J1.b;
import com.google.common.base.H;
import com.google.common.collect.K2;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@b
@N
final class K extends t {
    final class a extends c {
        private final v f;
        final K g;

        a(v v0, Executor executor0) {
            super(executor0);
            this.f = (v)H.E(v0);
        }

        @Override  // com.google.common.util.concurrent.p0
        Object e() throws Exception {
            return this.j();
        }

        @Override  // com.google.common.util.concurrent.p0
        String f() {
            return this.f.toString();
        }

        @Override  // com.google.common.util.concurrent.K$c
        void i(Object object0) {
            this.k(((t0)object0));
        }

        t0 j() throws Exception {
            return (t0)H.V(this.f.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f);
        }

        void k(t0 t00) {
            K.this.D(t00);
        }
    }

    final class com.google.common.util.concurrent.K.b extends c {
        private final Callable f;
        final K g;

        com.google.common.util.concurrent.K.b(Callable callable0, Executor executor0) {
            super(executor0);
            this.f = (Callable)H.E(callable0);
        }

        @Override  // com.google.common.util.concurrent.p0
        @F0
        Object e() throws Exception {
            return this.f.call();
        }

        @Override  // com.google.common.util.concurrent.p0
        String f() {
            return this.f.toString();
        }

        @Override  // com.google.common.util.concurrent.K$c
        void i(@F0 Object object0) {
            K.this.B(object0);
        }
    }

    abstract class c extends p0 {
        private final Executor d;
        final K e;

        c(Executor executor0) {
            this.d = (Executor)H.E(executor0);
        }

        @Override  // com.google.common.util.concurrent.p0
        final void a(Throwable throwable0) {
            K.this.q = null;
            if(throwable0 instanceof ExecutionException) {
                K.this.C(((ExecutionException)throwable0).getCause());
                return;
            }
            if(throwable0 instanceof CancellationException) {
                K.this.cancel(false);
                return;
            }
            K.this.C(throwable0);
        }

        @Override  // com.google.common.util.concurrent.p0
        final void b(@F0 Object object0) {
            K.this.q = null;
            this.i(object0);
        }

        @Override  // com.google.common.util.concurrent.p0
        final boolean d() {
            return K.this.isDone();
        }

        final void h() {
            try {
                this.d.execute(this);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                K.this.C(rejectedExecutionException0);
            }
        }

        abstract void i(@F0 Object arg1);
    }

    @o3.a
    private c q;

    K(K2 k20, boolean z, Executor executor0, v v0) {
        super(k20, z, false);
        this.q = new a(this, v0, executor0);
        this.U();
    }

    K(K2 k20, boolean z, Executor executor0, Callable callable0) {
        super(k20, z, false);
        this.q = new com.google.common.util.concurrent.K.b(this, callable0, executor0);
        this.U();
    }

    @Override  // com.google.common.util.concurrent.t
    void P(int v, @o3.a Object object0) {
    }

    @Override  // com.google.common.util.concurrent.t
    void S() {
        c k$c0 = this.q;
        if(k$c0 != null) {
            k$c0.h();
        }
    }

    @Override  // com.google.common.util.concurrent.t
    void Z(com.google.common.util.concurrent.t.a t$a0) {
        super.Z(t$a0);
        if(t$a0 == com.google.common.util.concurrent.t.a.a) {
            this.q = null;
        }
    }

    @Override  // com.google.common.util.concurrent.f
    protected void w() {
        c k$c0 = this.q;
        if(k$c0 != null) {
            k$c0.c();
        }
    }
}

