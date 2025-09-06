package com.google.common.util.concurrent;

import J1.b;
import com.google.common.base.H;
import com.google.common.base.t;
import com.google.common.base.z;
import com.google.common.collect.O2;
import com.google.common.util.concurrent.internal.a;
import j..util.Objects;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

@b(emulated = true)
@N
public final class h0 extends n0 {
    static final class com.google.common.util.concurrent.h0.b implements Runnable {
        final Future a;
        final e0 b;

        com.google.common.util.concurrent.h0.b(Future future0, e0 e00) {
            this.a = future0;
            this.b = e00;
        }

        @Override
        public void run() {
            Object object0;
            Future future0 = this.a;
            if(future0 instanceof a) {
                Throwable throwable0 = com.google.common.util.concurrent.internal.b.a(((a)future0));
                if(throwable0 != null) {
                    this.b.onFailure(throwable0);
                    return;
                }
            }
            try {
                object0 = h0.j(this.a);
            }
            catch(ExecutionException executionException0) {
                this.b.onFailure(executionException0.getCause());
                return;
            }
            catch(Throwable throwable1) {
                this.b.onFailure(throwable1);
                return;
            }
            this.b.onSuccess(object0);
        }

        @Override
        public String toString() {
            return z.c(this).s(this.b).toString();
        }
    }

    @b
    public static final class c {
        private final boolean a;
        private final O2 b;

        private c(boolean z, O2 o20) {
            this.a = z;
            this.b = o20;
        }

        c(boolean z, O2 o20, com.google.common.util.concurrent.h0.a h0$a0) {
            this(z, o20);
        }

        public t0 a(Callable callable0, Executor executor0) {
            return new K(this.b, this.a, executor0, callable0);
        }

        public t0 b(v v0, Executor executor0) {
            return new K(this.b, this.a, executor0, v0);
        }

        public t0 c(Runnable runnable0, Executor executor0) {
            class com.google.common.util.concurrent.h0.c.a implements Callable {
                final Runnable a;

                com.google.common.util.concurrent.h0.c.a(Runnable runnable0) {
                    this.a = runnable0;
                    super();
                }

                @o3.a
                public Void a() throws Exception {
                    this.a.run();
                    return null;
                }

                @Override
                @o3.a
                public Object call() throws Exception {
                    return this.a();
                }
            }

            return this.a(new com.google.common.util.concurrent.h0.c.a(this, runnable0), executor0);
        }
    }

    static final class d extends f {
        @o3.a
        private e i;

        private d(e h0$e0) {
            this.i = h0$e0;
        }

        d(e h0$e0, com.google.common.util.concurrent.h0.a h0$a0) {
            this(h0$e0);
        }

        @Override  // com.google.common.util.concurrent.f
        public boolean cancel(boolean z) {
            e h0$e0 = this.i;
            if(super.cancel(z)) {
                Objects.requireNonNull(h0$e0);
                h0$e0.g(z);
                return true;
            }
            return false;
        }

        @Override  // com.google.common.util.concurrent.f
        protected void m() {
            this.i = null;
        }

        @Override  // com.google.common.util.concurrent.f
        @o3.a
        protected String y() {
            return this.i == null ? null : "inputCount=[" + this.i.d.length + "], remaining=[" + this.i.c.get() + "]";
        }
    }

    static final class e {
        private boolean a;
        private boolean b;
        private final AtomicInteger c;
        private final t0[] d;
        private volatile int e;

        private e(t0[] arr_t0) {
            this.a = false;
            this.b = true;
            this.e = 0;
            this.d = arr_t0;
            this.c = new AtomicInteger(arr_t0.length);
        }

        e(t0[] arr_t0, com.google.common.util.concurrent.h0.a h0$a0) {
            this(arr_t0);
        }

        private void e() {
            if(this.c.decrementAndGet() == 0 && this.a) {
                t0[] arr_t0 = this.d;
                for(int v = 0; v < arr_t0.length; ++v) {
                    t0 t00 = arr_t0[v];
                    if(t00 != null) {
                        t00.cancel(this.b);
                    }
                }
            }
        }

        private void f(O2 o20, int v) {
            t0 t00 = this.d[v];
            Objects.requireNonNull(t00);
            this.d[v] = null;
            for(int v1 = this.e; v1 < o20.size(); ++v1) {
                if(((f)o20.get(v1)).D(t00)) {
                    this.e();
                    this.e = v1 + 1;
                    return;
                }
            }
            this.e = o20.size();
        }

        private void g(boolean z) {
            this.a = true;
            if(!z) {
                this.b = false;
            }
            this.e();
        }
    }

    static final class com.google.common.util.concurrent.h0.f extends j implements Runnable {
        @o3.a
        private t0 i;

        com.google.common.util.concurrent.h0.f(t0 t00) {
            this.i = t00;
        }

        @Override  // com.google.common.util.concurrent.f
        protected void m() {
            this.i = null;
        }

        @Override
        public void run() {
            t0 t00 = this.i;
            if(t00 != null) {
                this.D(t00);
            }
        }

        @Override  // com.google.common.util.concurrent.f
        @o3.a
        protected String y() {
            return this.i == null ? null : "delegate=[" + this.i + "]";
        }
    }

    @SafeVarargs
    public static t0 A(t0[] arr_t0) {
        return new com.google.common.util.concurrent.J.a(O2.x(arr_t0), false);
    }

    public static t0 B(t0 t00, t t0, Executor executor0) {
        return q.N(t00, t0, executor0);
    }

    public static t0 C(t0 t00, w w0, Executor executor0) {
        return q.O(t00, w0, executor0);
    }

    public static c D(Iterable iterable0) {
        return new c(false, O2.q(iterable0), null);
    }

    @SafeVarargs
    public static c E(t0[] arr_t0) {
        return new c(false, O2.x(arr_t0), null);
    }

    public static c F(Iterable iterable0) {
        return new c(true, O2.q(iterable0), null);
    }

    @SafeVarargs
    public static c G(t0[] arr_t0) {
        return new c(true, O2.x(arr_t0), null);
    }

    // 去混淆评级： 低(20)
    @J1.c
    @J1.d
    public static t0 H(t0 t00, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        return t00.isDone() ? t00 : c1.Q(t00, v, timeUnit0, scheduledExecutorService0);
    }

    private static void I(Throwable throwable0) {
        if(!(throwable0 instanceof Error)) {
            throw new f1(throwable0);
        }
        throw new O(((Error)throwable0));
    }

    public static void c(t0 t00, e0 e00, Executor executor0) {
        H.E(e00);
        t00.addListener(new com.google.common.util.concurrent.h0.b(t00, e00), executor0);
    }

    public static t0 d(Iterable iterable0) {
        return new com.google.common.util.concurrent.J.a(O2.q(iterable0), true);
    }

    @SafeVarargs
    public static t0 e(t0[] arr_t0) {
        return new com.google.common.util.concurrent.J.a(O2.x(arr_t0), true);
    }

    @J1.d
    @com.google.common.util.concurrent.G0.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static t0 f(t0 t00, Class class0, t t0, Executor executor0) {
        return com.google.common.util.concurrent.a.N(t00, class0, t0, executor0);
    }

    @J1.d
    @com.google.common.util.concurrent.G0.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static t0 g(t0 t00, Class class0, w w0, Executor executor0) {
        return com.google.common.util.concurrent.a.O(t00, class0, w0, executor0);
    }

    @J1.c
    @J1.d
    @O1.a
    @F0
    public static Object h(Future future0, Class class0) throws Exception {
        return l0.g(future0, class0);
    }

    @J1.c
    @J1.d
    @O1.a
    @F0
    public static Object i(Future future0, Class class0, long v, TimeUnit timeUnit0) throws Exception {
        return l0.h(future0, class0, v, timeUnit0);
    }

    @O1.a
    @F0
    public static Object j(Future future0) throws ExecutionException {
        H.x0(future0.isDone(), "Future was expected to be done: %s", future0);
        return h1.f(future0);
    }

    @O1.a
    @F0
    public static Object k(Future future0) {
        H.E(future0);
        try {
            return h1.f(future0);
        }
        catch(ExecutionException executionException0) {
            h0.I(executionException0.getCause());
            throw new AssertionError();
        }
    }

    // 去混淆评级： 低(20)
    private static t0[] l(Iterable iterable0) {
        return iterable0 instanceof Collection ? ((t0[])((Collection)iterable0).toArray(new t0[0])) : ((t0[])O2.q(iterable0).toArray(new t0[0]));
    }

    public static t0 m() {
        t0 t00 = com.google.common.util.concurrent.o0.a.i;
        return t00 != null ? t00 : new com.google.common.util.concurrent.o0.a();
    }

    public static t0 n(Throwable throwable0) {
        H.E(throwable0);
        return new com.google.common.util.concurrent.o0.b(throwable0);
    }

    public static t0 o(@F0 Object object0) {
        return object0 == null ? o0.b : new o0(object0);
    }

    public static t0 p() {
        return o0.b;
    }

    public static O2 q(Iterable iterable0) {
        t0[] arr_t0 = h0.l(iterable0);
        e h0$e0 = new e(arr_t0, null);
        com.google.common.collect.O2.a o2$a0 = O2.o(arr_t0.length);
        for(int v1 = 0; v1 < arr_t0.length; ++v1) {
            o2$a0.j(new d(h0$e0, null));
        }
        O2 o20 = o2$a0.n();
        for(int v = 0; v < arr_t0.length; ++v) {
            arr_t0[v].addListener(new f0(h0$e0, o20, v), C0.c());
        }
        return o20;
    }

    // 检测为 Lambda 实现
    private static void s(Future future0) [...]

    @J1.c
    @J1.d
    public static Future t(Future future0, t t0) {
        class com.google.common.util.concurrent.h0.a implements Future {
            final Future a;
            final t b;

            com.google.common.util.concurrent.h0.a(Future future0, t t0) {
                this.b = t0;
                super();
            }

            private Object a(Object object0) throws ExecutionException {
                try {
                    return this.b.apply(object0);
                }
                catch(Throwable throwable0) {
                    throw new ExecutionException(throwable0);
                }
            }

            @Override
            public boolean cancel(boolean z) {
                return this.a.cancel(z);
            }

            @Override
            public Object get() throws InterruptedException, ExecutionException {
                return this.a(this.a.get());
            }

            @Override
            public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
                return this.a(this.a.get(v, timeUnit0));
            }

            @Override
            public boolean isCancelled() {
                return this.a.isCancelled();
            }

            @Override
            public boolean isDone() {
                return this.a.isDone();
            }
        }

        H.E(future0);
        H.E(t0);
        return new com.google.common.util.concurrent.h0.a(future0, t0);
    }

    public static t0 u(t0 t00) {
        if(t00.isDone()) {
            return t00;
        }
        t0 t01 = new com.google.common.util.concurrent.h0.f(t00);
        t00.addListener(((Runnable)t01), C0.c());
        return t01;
    }

    @J1.c
    @J1.d
    public static t0 v(v v0, long v1, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        t0 t00 = d1.N(v0);
        ((com.google.common.util.concurrent.U.a)t00).addListener(() -> scheduledExecutorService0.schedule(((Runnable)t00), v1, timeUnit0).cancel(false), C0.c());
        return t00;
    }

    public static t0 w(Runnable runnable0, Executor executor0) {
        t0 t00 = d1.O(runnable0, null);
        executor0.execute(((Runnable)t00));
        return t00;
    }

    public static t0 x(Callable callable0, Executor executor0) {
        t0 t00 = d1.P(callable0);
        executor0.execute(((Runnable)t00));
        return t00;
    }

    public static t0 y(v v0, Executor executor0) {
        t0 t00 = d1.N(v0);
        executor0.execute(((Runnable)t00));
        return t00;
    }

    public static t0 z(Iterable iterable0) {
        return new com.google.common.util.concurrent.J.a(O2.q(iterable0), false);
    }
}

