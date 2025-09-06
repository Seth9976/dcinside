package androidx.work;

import A3.o;
import android.content.Context;
import com.google.common.util.concurrent.t0;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import y4.l;
import y4.m;

public abstract class CoroutineWorker extends ListenableWorker {
    static final class DeprecatedDispatcher extends K {
        @l
        public static final DeprecatedDispatcher b;
        @l
        private static final K c;

        static {
            DeprecatedDispatcher.b = new DeprecatedDispatcher();
            DeprecatedDispatcher.c = h0.a();
        }

        @Override  // kotlinx.coroutines.K
        public void b1(@l g g0, @l Runnable runnable0) {
            L.p(g0, "context");
            L.p(runnable0, "block");
            DeprecatedDispatcher.c.b1(g0, runnable0);
        }

        @Override  // kotlinx.coroutines.K
        public boolean i1(@l g g0) {
            L.p(g0, "context");
            return DeprecatedDispatcher.c.i1(g0);
        }

        @l
        public final K u1() {
            return DeprecatedDispatcher.c;
        }
    }

    @l
    private final K coroutineContext;
    @l
    private final WorkerParameters params;

    public CoroutineWorker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "appContext");
        L.p(workerParameters0, "params");
        super(context0, workerParameters0);
        this.params = workerParameters0;
        this.coroutineContext = DeprecatedDispatcher.b;
    }

    @m
    public abstract Object doWork(@l d arg1);

    @l
    public K getCoroutineContext() {
        return this.coroutineContext;
    }

    @k(message = "use withContext(...) inside doWork() instead.")
    public static void getCoroutineContext$annotations() {
    }

    @m
    public Object getForegroundInfo(@l d d0) {
        return CoroutineWorker.getForegroundInfo$suspendImpl(this, d0);
    }

    static Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker0, d d0) {
        throw new IllegalStateException("Not implemented");
    }

    @Override  // androidx.work.ListenableWorker
    @l
    public final t0 getForegroundInfoAsync() {
        return ListenableFutureKt.k(this.getCoroutineContext().plus(O0.c(null, 1, null)), null, new o(null) {
            int k;
            final CoroutineWorker l;

            {
                this.l = coroutineWorker0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.CoroutineWorker.getForegroundInfoAsync.1(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.CoroutineWorker.getForegroundInfoAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = this.l.getForegroundInfo(this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 2, null);
    }

    @Override  // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    @m
    public final Object setForeground(@l ForegroundInfo foregroundInfo0, @l d d0) {
        t0 t00 = this.setForegroundAsync(foregroundInfo0);
        L.o(t00, "setForegroundAsync(foregroundInfo)");
        Object object0 = androidx.concurrent.futures.ListenableFutureKt.a(t00, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public final Object setProgress(@l Data data0, @l d d0) {
        t0 t00 = this.setProgressAsync(data0);
        L.o(t00, "setProgressAsync(data)");
        Object object0 = androidx.concurrent.futures.ListenableFutureKt.a(t00, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // androidx.work.ListenableWorker
    @l
    public final t0 startWork() {
        g g0 = L.g(this.getCoroutineContext(), DeprecatedDispatcher.b) ? this.params.n() : this.getCoroutineContext();
        L.o(g0, "if (coroutineContext != …rkerContext\n            }");
        return ListenableFutureKt.k(g0.plus(O0.c(null, 1, null)), null, new o(null) {
            int k;
            final CoroutineWorker l;

            {
                this.l = coroutineWorker0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.CoroutineWorker.startWork.1(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.CoroutineWorker.startWork.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = this.l.doWork(this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 2, null);
    }
}

