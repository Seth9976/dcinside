package com.google.common.util.concurrent;

import J1.b;
import com.google.common.base.H;
import com.google.common.collect.p2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@b
@N
public abstract class a0 extends p2 implements Future {
    public static abstract class a extends a0 {
        private final Future a;

        protected a(Future future0) {
            this.a = (Future)H.E(future0);
        }

        @Override  // com.google.common.util.concurrent.a0
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.util.concurrent.a0
        protected final Future M() {
            return this.a;
        }
    }

    @Override  // com.google.common.collect.p2
    protected Object K() {
        return this.M();
    }

    protected abstract Future M();

    @Override
    @O1.a
    public boolean cancel(boolean z) {
        return this.M().cancel(z);
    }

    @Override
    @O1.a
    @F0
    public Object get() throws InterruptedException, ExecutionException {
        return this.M().get();
    }

    @Override
    @O1.a
    @F0
    public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.M().get(v, timeUnit0);
    }

    @Override
    public boolean isCancelled() {
        return this.M().isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.M().isDone();
    }
}

