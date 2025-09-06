package K0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    @l
    public static final b a;
    @l
    private static final ThreadFactory b;
    private static final ExecutorService c;

    static {
        b.a = new b();
        a a0 = (Runnable runnable0) -> {
            Thread thread0 = new Thread(runnable0);
            thread0.setPriority(1);
            return thread0;
        };
        b.b = a0;
        b.c = Executors.newCachedThreadPool(a0);
    }

    public final void b(@l Runnable runnable0) {
        L.p(runnable0, "task");
        b.c.execute(runnable0);
    }

    // 检测为 Lambda 实现
    private static final Thread c(Runnable runnable0) [...]
}

