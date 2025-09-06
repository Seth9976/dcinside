package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
final class q1 {
    @c0
    @l
    public static final u0 b(int v, @l String s) {
        if(v < 1) {
            throw new IllegalArgumentException(("Expected at least one thread, but " + v + " specified").toString());
        }
        return w0.d(Executors.newScheduledThreadPool(v, (Runnable runnable0) -> {
            if(v != 1) {
                s = s + '-' + new AtomicInteger().incrementAndGet();
            }
            Thread thread0 = new Thread(runnable0, s);
            thread0.setDaemon(true);
            return thread0;
        }));
    }

    // 检测为 Lambda 实现
    private static final Thread c(int v, String s, AtomicInteger atomicInteger0, Runnable runnable0) [...]
}

