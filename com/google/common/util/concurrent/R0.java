package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@c
@d
@N
public final class r0 {
    static class a extends a0 implements t0 {
        private final Executor a;
        private final P b;
        private final AtomicBoolean c;
        private final Future d;
        private static final ThreadFactory e;
        private static final Executor f;

        static {
            ThreadFactory threadFactory0 = new a1().e(true).f("ListenableFutureAdapter-thread-%d").b();
            a.e = threadFactory0;
            a.f = Executors.newCachedThreadPool(threadFactory0);
        }

        a(Future future0) {
            this(future0, a.f);
        }

        a(Future future0, Executor executor0) {
            this.b = new P();
            this.c = new AtomicBoolean(false);
            this.d = (Future)H.E(future0);
            this.a = (Executor)H.E(executor0);
        }

        @Override  // com.google.common.util.concurrent.a0
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.util.concurrent.a0
        protected Future M() {
            return this.d;
        }

        // 检测为 Lambda 实现
        private void O() [...]

        @Override  // com.google.common.util.concurrent.t0
        public void addListener(Runnable runnable0, Executor executor0) {
            this.b.a(runnable0, executor0);
            if(this.c.compareAndSet(false, true)) {
                if(this.d.isDone()) {
                    this.b.b();
                    return;
                }
                q0 q00 = () -> {
                    try {
                        h1.f(this.d);
                    }
                    catch(Throwable unused_ex) {
                    }
                    this.b.b();
                };
                this.a.execute(q00);
            }
        }
    }

    public static t0 a(Future future0) {
        return future0 instanceof t0 ? ((t0)future0) : new a(future0);
    }

    public static t0 b(Future future0, Executor executor0) {
        H.E(executor0);
        return future0 instanceof t0 ? ((t0)future0) : new a(future0, executor0);
    }
}

