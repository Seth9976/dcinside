package androidx.core.os;

import A3.a;
import A3.o;
import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;
import z3.i;

@i(name = "Profiling")
public final class Profiling {
    @l
    private static final String a = "KEY_DURATION_MS";
    @l
    private static final String b = "KEY_SAMPLING_INTERVAL_BYTES";
    @l
    private static final String c = "KEY_TRACK_JAVA_ALLOCATIONS";
    @l
    private static final String d = "KEY_FREQUENCY_HZ";
    @l
    private static final String e = "KEY_SIZE_KB";
    @l
    private static final String f = "KEY_BUFFER_FILL_POLICY";
    private static final int g = 1;
    private static final int h = 2;

    @RequiresApi(api = 35)
    @l
    public static final kotlinx.coroutines.flow.i a(@l Context context0) {
        L.p(context0, "context");
        return k.s(new o(context0, null) {
            int k;
            private Object l;
            final Context m;

            {
                this.m = context0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new androidx.core.os.Profiling.registerForAllProfilingResults.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void g(D d0, ProfilingResult profilingResult0) [...]

            // 检测为 Lambda 实现
            private static final void h(Runnable runnable0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            public final Object invoke(D d0, d d1) {
                return ((androidx.core.os.Profiling.registerForAllProfilingResults.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        n n0 = (ProfilingResult profilingResult0) -> {
                            L.o(profilingResult0, "result");
                            d0.l(profilingResult0);
                        };
                        ProfilingManager profilingManager0 = j.a(this.m.getSystemService(ProfilingManager.class));
                        profilingManager0.registerForAllProfilingResults((Runnable runnable0) -> runnable0.run(), n0);
                        androidx.core.os.Profiling.registerForAllProfilingResults.1.2 profiling$registerForAllProfilingResults$1$20 = new a(n0) {
                            final ProfilingManager e;
                            final Consumer f;

                            {
                                this.e = profilingManager0;
                                this.f = consumer0;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                this.e.unregisterForAllProfilingResults(this.f);
                            }
                        };
                        this.k = 1;
                        return B.a(d0, profiling$registerForAllProfilingResults$1$20, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
    }

    @RequiresApi(api = 35)
    public static final void b(@l Context context0, @l Executor executor0, @l Consumer consumer0) {
        L.p(context0, "context");
        L.p(executor0, "executor");
        L.p(consumer0, "listener");
        j.a(context0.getSystemService(ProfilingManager.class)).registerForAllProfilingResults(executor0, consumer0);
    }

    @RequiresApi(api = 35)
    public static final void c(@l Context context0, @l ProfilingRequest profilingRequest0, @m Executor executor0, @m Consumer consumer0) {
        L.p(context0, "context");
        L.p(profilingRequest0, "profilingRequest");
        j.a(context0.getSystemService(ProfilingManager.class)).requestProfiling(profilingRequest0.c(), profilingRequest0.b(), profilingRequest0.d(), profilingRequest0.a(), executor0, consumer0);
    }

    @RequiresApi(api = 35)
    public static final void d(@l Context context0, @l Consumer consumer0) {
        L.p(context0, "context");
        L.p(consumer0, "listener");
        j.a(context0.getSystemService(ProfilingManager.class)).unregisterForAllProfilingResults(consumer0);
    }
}

