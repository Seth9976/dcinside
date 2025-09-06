package com.google.common.util.concurrent;

import J1.b;
import com.google.common.base.H;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

@b
@N
class d1 extends a implements RunnableFuture {
    final class com.google.common.util.concurrent.d1.a extends p0 {
        private final v d;
        final d1 e;

        com.google.common.util.concurrent.d1.a(v v0) {
            this.d = (v)H.E(v0);
        }

        @Override  // com.google.common.util.concurrent.p0
        void a(Throwable throwable0) {
            d1.this.C(throwable0);
        }

        @Override  // com.google.common.util.concurrent.p0
        void b(Object object0) {
            this.h(((t0)object0));
        }

        @Override  // com.google.common.util.concurrent.p0
        final boolean d() {
            return d1.this.isDone();
        }

        @Override  // com.google.common.util.concurrent.p0
        Object e() throws Exception {
            return this.i();
        }

        @Override  // com.google.common.util.concurrent.p0
        String f() {
            return this.d.toString();
        }

        void h(t0 t00) {
            d1.this.D(t00);
        }

        t0 i() throws Exception {
            return (t0)H.V(this.d.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.d);
        }
    }

    final class com.google.common.util.concurrent.d1.b extends p0 {
        private final Callable d;
        final d1 e;

        com.google.common.util.concurrent.d1.b(Callable callable0) {
            this.d = (Callable)H.E(callable0);
        }

        @Override  // com.google.common.util.concurrent.p0
        void a(Throwable throwable0) {
            d1.this.C(throwable0);
        }

        @Override  // com.google.common.util.concurrent.p0
        void b(@F0 Object object0) {
            d1.this.B(object0);
        }

        @Override  // com.google.common.util.concurrent.p0
        final boolean d() {
            return d1.this.isDone();
        }

        @Override  // com.google.common.util.concurrent.p0
        @F0
        Object e() throws Exception {
            return this.d.call();
        }

        @Override  // com.google.common.util.concurrent.p0
        String f() {
            return this.d.toString();
        }
    }

    @o3.a
    private volatile p0 i;

    d1(v v0) {
        this.i = new com.google.common.util.concurrent.d1.a(this, v0);
    }

    d1(Callable callable0) {
        this.i = new com.google.common.util.concurrent.d1.b(this, callable0);
    }

    static d1 N(v v0) {
        return new d1(v0);
    }

    static d1 O(Runnable runnable0, @F0 Object object0) {
        return new d1(Executors.callable(runnable0, object0));
    }

    static d1 P(Callable callable0) {
        return new d1(callable0);
    }

    @Override  // com.google.common.util.concurrent.f
    protected void m() {
        super.m();
        if(this.E()) {
            p0 p00 = this.i;
            if(p00 != null) {
                p00.c();
            }
        }
        this.i = null;
    }

    @Override
    public void run() {
        p0 p00 = this.i;
        if(p00 != null) {
            p00.run();
        }
        this.i = null;
    }

    @Override  // com.google.common.util.concurrent.f
    @o3.a
    protected String y() {
        p0 p00 = this.i;
        return p00 == null ? super.y() : "task=[" + p00 + "]";
    }
}

