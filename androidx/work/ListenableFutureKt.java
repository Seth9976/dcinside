package androidx.work;

import A3.a;
import A3.o;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.k;
import y4.l;

public final class ListenableFutureKt {
    @l
    public static final t0 f(@l Executor executor0, @l String s, @l a a0) {
        L.p(executor0, "<this>");
        L.p(s, "debugTag");
        L.p(a0, "block");
        t0 t00 = CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            L.p(callbackToFutureAdapter$Completer0, "completer");
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            callbackToFutureAdapter$Completer0.a(() -> atomicBoolean0.set(true), DirectExecutor.a);
            executor0.execute(() -> {
                if(atomicBoolean0.get()) {
                    return;
                }
                try {
                    callbackToFutureAdapter$Completer0.c(a0.invoke());
                }
                catch(Throwable throwable0) {
                    callbackToFutureAdapter$Completer0.f(throwable0);
                }
            });
            return s;
        });
        L.o(t00, "getFuture { completer ->… }\n        debugTag\n    }");
        return t00;
    }

    // 检测为 Lambda 实现
    private static final Object g(Executor executor0, String s, a a0, Completer callbackToFutureAdapter$Completer0) [...]

    // 检测为 Lambda 实现
    private static final void h(AtomicBoolean atomicBoolean0) [...]

    // 检测为 Lambda 实现
    private static final void i(AtomicBoolean atomicBoolean0, Completer callbackToFutureAdapter$Completer0, a a0) [...]

    @l
    public static final t0 j(@l g g0, @l Q q0, @l o o0) {
        L.p(g0, "context");
        L.p(q0, "start");
        L.p(o0, "block");
        t0 t00 = CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            L.p(callbackToFutureAdapter$Completer0, "completer");
            callbackToFutureAdapter$Completer0.a(() -> if(((I0)g0.get(I0.B8)) != null) {
                kotlinx.coroutines.I0.a.b(((I0)g0.get(I0.B8)), null, 1, null);
            }, DirectExecutor.a);
            return k.f(P.a(g0), null, q0, new androidx.work.ListenableFutureKt.launchFuture.1.2(o0, callbackToFutureAdapter$Completer0, null), 1, null);
        });
        L.o(t00, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return t00;

        @f(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        final class androidx.work.ListenableFutureKt.launchFuture.1.2 extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            private Object l;
            final o m;
            final Completer n;

            androidx.work.ListenableFutureKt.launchFuture.1.2(o o0, Completer callbackToFutureAdapter$Completer0, d d0) {
                this.m = o0;
                this.n = callbackToFutureAdapter$Completer0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new androidx.work.ListenableFutureKt.launchFuture.1.2(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.ListenableFutureKt.launchFuture.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        try {
                            this.k = 1;
                            object0 = this.m.invoke(o0, this);
                            if(object0 == object1) {
                                return object1;
                            label_9:
                                f0.n(object0);
                            }
                            this.n.c(object0);
                            return S0.a;
                        }
                        catch(CancellationException unused_ex) {
                            break;
                        }
                        catch(Throwable throwable0) {
                            this.n.f(throwable0);
                            return S0.a;
                        }
                    }
                    case 1: {
                        goto label_9;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.n.d();
                return S0.a;
            }
        }

    }

    public static t0 k(g g0, Q q0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = i.a;
        }
        if((v & 2) != 0) {
            q0 = Q.a;
        }
        return ListenableFutureKt.j(g0, q0, o0);
    }

    // 检测为 Lambda 实现
    private static final Object l(g g0, Q q0, o o0, Completer callbackToFutureAdapter$Completer0) [...]

    // 检测为 Lambda 实现
    private static final void m(I0 i00) [...]
}

