package com.google.common.util.concurrent;

import J1.b;
import com.google.common.base.H;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@b
@N
public abstract class b0 extends a0 implements t0 {
    public static abstract class a extends b0 {
        private final t0 a;

        protected a(t0 t00) {
            this.a = (t0)H.E(t00);
        }

        @Override  // com.google.common.util.concurrent.b0
        protected Object K() {
            return this.N();
        }

        @Override  // com.google.common.util.concurrent.b0
        protected Future M() {
            return this.N();
        }

        @Override  // com.google.common.util.concurrent.b0
        protected final t0 N() {
            return this.a;
        }
    }

    @Override  // com.google.common.util.concurrent.a0
    protected Object K() {
        return this.N();
    }

    @Override  // com.google.common.util.concurrent.a0
    protected Future M() {
        return this.N();
    }

    protected abstract t0 N();

    @Override  // com.google.common.util.concurrent.t0
    public void addListener(Runnable runnable0, Executor executor0) {
        this.N().addListener(runnable0, executor0);
    }
}

