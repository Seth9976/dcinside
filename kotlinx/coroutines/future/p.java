package kotlinx.coroutines.future;

import A3.o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import kotlin.S0;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.J;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.X;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import y4.l;
import y4.m;

@s0({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,193:1\n1#2:194\n318#3,11:195\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n168#1:195,11\n*E\n"})
public final class p {
    @l
    public static final CompletableFuture c(@l X x0) {
        static final class a extends N implements Function1 {
            final CompletableFuture e;
            final X f;

            a(CompletableFuture completableFuture0, X x0) {
                this.e = completableFuture0;
                this.f = x0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                try {
                    Object object0 = this.f.j();
                    this.e.complete(object0);
                }
                catch(Throwable throwable1) {
                    this.e.completeExceptionally(throwable1);
                }
            }
        }

        CompletableFuture completableFuture0 = kotlinx.coroutines.future.m.a();
        p.j(x0, completableFuture0);
        x0.w(new a(completableFuture0, x0));
        return completableFuture0;
    }

    @l
    public static final CompletableFuture d(@l I0 i00) {
        static final class b extends N implements Function1 {
            final CompletableFuture e;

            b(CompletableFuture completableFuture0) {
                this.e = completableFuture0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 == null) {
                    this.e.complete(S0.a);
                    return;
                }
                this.e.completeExceptionally(throwable0);
            }
        }

        CompletableFuture completableFuture0 = kotlinx.coroutines.future.m.a();
        p.j(i00, completableFuture0);
        i00.w(new b(completableFuture0));
        return completableFuture0;
    }

    @l
    public static final X e(@l CompletionStage completionStage0) {
        static final class c extends N implements o {
            final x e;

            c(x x0) {
                this.e = x0;
                super(2);
            }

            public final Object a(Object object0, Throwable throwable0) {
                try {
                    if(throwable0 == null) {
                        return Boolean.valueOf(this.e.Q(object0));
                    }
                    x x0 = this.e;
                    CompletionException completionException0 = d.a(throwable0) ? ((CompletionException)throwable0) : null;
                    if(completionException0 != null) {
                        Throwable throwable2 = completionException0.getCause();
                        if(throwable2 != null) {
                            throwable0 = throwable2;
                        }
                    }
                    return Boolean.valueOf(x0.f(throwable0));
                }
                catch(Throwable throwable1) {
                }
                L.b(i.a, throwable1);
                return S0.a;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((Throwable)object1));
            }
        }

        CompletableFuture completableFuture0 = completionStage0.toCompletableFuture();
        if(completableFuture0.isDone()) {
            try {
                return z.a(completableFuture0.get());
            }
            catch(Throwable throwable0) {
                ExecutionException executionException0 = throwable0 instanceof ExecutionException ? ((ExecutionException)throwable0) : null;
                if(executionException0 != null) {
                    Throwable throwable1 = executionException0.getCause();
                    if(throwable1 != null) {
                        throwable0 = throwable1;
                    }
                }
                x x0 = z.c(null, 1, null);
                x0.f(throwable0);
                return x0;
            }
        }
        X x1 = z.c(null, 1, null);
        completionStage0.handle((Object object0, Throwable throwable0) -> new c(((x)x1)).invoke(object0, throwable0));
        M0.x(x1, completableFuture0);
        return x1;
    }

    // 检测为 Lambda 实现
    private static final Object f(o o0, Object object0, Throwable throwable0) [...]

    @m
    public static final Object g(@l CompletionStage completionStage0, @l kotlin.coroutines.d d0) {
        static final class kotlinx.coroutines.future.p.d extends N implements Function1 {
            final CompletableFuture e;
            final g f;

            kotlinx.coroutines.future.p.d(CompletableFuture completableFuture0, g g0) {
                this.e = completableFuture0;
                this.f = g0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.cancel(false);
                this.f.cont = null;
            }
        }

        CompletableFuture completableFuture0 = completionStage0.toCompletableFuture();
        if(completableFuture0.isDone()) {
            try {
                return completableFuture0.get();
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(throwable0 != null) {
                    executionException0 = throwable0;
                }
                throw executionException0;
            }
        }
        kotlinx.coroutines.p p0 = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        g g0 = new g(p0);
        completionStage0.handle(g0);
        p0.K(new kotlinx.coroutines.future.p.d(completableFuture0, g0));
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @l
    public static final CompletableFuture h(@l O o0, @l kotlin.coroutines.g g0, @l Q q0, @l o o1) {
        kotlin.coroutines.g g1 = J.e(o0, g0);
        CompletableFuture completableFuture0 = kotlinx.coroutines.future.m.a();
        kotlinx.coroutines.future.c c0 = new kotlinx.coroutines.future.c(g1, completableFuture0);
        completableFuture0.handle(c0);
        c0.P1(q0, c0, o1);
        return completableFuture0;
    }

    public static CompletableFuture i(O o0, kotlin.coroutines.g g0, Q q0, o o1, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = i.a;
        }
        if((v & 2) != 0) {
            q0 = Q.a;
        }
        return p.h(o0, g0, q0, o1);
    }

    private static final void j(I0 i00, CompletableFuture completableFuture0) {
        completableFuture0.handle((Object object0, Throwable throwable0) -> {
            CancellationException cancellationException0 = null;
            if(throwable0 != null) {
                if(throwable0 instanceof CancellationException) {
                    cancellationException0 = (CancellationException)throwable0;
                }
                if(cancellationException0 == null) {
                    cancellationException0 = t0.a("CompletableFuture was completed exceptionally", throwable0);
                }
            }
            i00.e(cancellationException0);
            return S0.a;
        });
    }

    // 检测为 Lambda 实现
    private static final S0 k(I0 i00, Object object0, Throwable throwable0) [...]
}

