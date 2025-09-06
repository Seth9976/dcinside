package androidx.work;

import androidx.tracing.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.w0;

public final class ConfigurationKt {
    public static final int a = 8;

    private static final Executor d(g g0) {
        e e0 = g0 == null ? null : ((e)g0.get(e.z8));
        K k0 = e0 instanceof K ? ((K)e0) : null;
        return k0 == null ? null : w0.b(k0);
    }

    private static final Executor e(boolean z) {
        Executor executor0 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() {
            private final AtomicInteger a;

            {
                boolean z = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = new AtomicInteger(0);
            }

            @Override
            public Thread newThread(Runnable runnable0) {
                L.p(runnable0, "runnable");
                return z ? new Thread(runnable0, "WM.task-" + this.a.incrementAndGet()) : new Thread(runnable0, "androidx.work-" + this.a.incrementAndGet());
            }
        });
        L.o(executor0, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executor0;
    }

    private static final Tracer f() {
        return new Tracer() {
            @Override  // androidx.work.Tracer
            public void a(String s) {
                L.p(s, "label");
                Trace.c(s);
            }

            @Override  // androidx.work.Tracer
            public void b() {
                Trace.f();
            }

            @Override  // androidx.work.Tracer
            public void c(String s, int v) {
                L.p(s, "methodName");
                Trace.d(s, v);
            }

            @Override  // androidx.work.Tracer
            public void d(String s, int v) {
                L.p(s, "methodName");
                Trace.a(s, v);
            }

            @Override  // androidx.work.Tracer
            public boolean isEnabled() {
                return Trace.i();
            }
        };
    }
}

