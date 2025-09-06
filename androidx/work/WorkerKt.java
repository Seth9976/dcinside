package androidx.work;

import A3.a;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.S0;
import kotlin.jvm.internal.L;

public final class WorkerKt {
    private static final t0 e(Executor executor0, a a0) {
        t0 t00 = CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            L.p(callbackToFutureAdapter$Completer0, "it");
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
            return S0.a;
        });
        L.o(t00, "getFuture {\n        val …        }\n        }\n    }");
        return t00;
    }

    // 检测为 Lambda 实现
    private static final S0 f(Executor executor0, a a0, Completer callbackToFutureAdapter$Completer0) [...]

    // 检测为 Lambda 实现
    private static final void g(AtomicBoolean atomicBoolean0) [...]

    // 检测为 Lambda 实现
    private static final void h(AtomicBoolean atomicBoolean0, Completer callbackToFutureAdapter$Completer0, a a0) [...]
}

