package androidx.work.impl.background.greedy;

import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

@s0({"SMAP\nTimeLimiter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeLimiter.kt\nandroidx/work/impl/background/greedy/TimeLimiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class TimeLimiter {
    @l
    private final RunnableScheduler a;
    @l
    private final WorkLauncher b;
    private final long c;
    @l
    private final Object d;
    @l
    private final Map e;

    @j
    public TimeLimiter(@l RunnableScheduler runnableScheduler0, @l WorkLauncher workLauncher0) {
        L.p(runnableScheduler0, "runnableScheduler");
        L.p(workLauncher0, "launcher");
        this(runnableScheduler0, workLauncher0, 0L, 4, null);
    }

    @j
    public TimeLimiter(@l RunnableScheduler runnableScheduler0, @l WorkLauncher workLauncher0, long v) {
        L.p(runnableScheduler0, "runnableScheduler");
        L.p(workLauncher0, "launcher");
        super();
        this.a = runnableScheduler0;
        this.b = workLauncher0;
        this.c = v;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public TimeLimiter(RunnableScheduler runnableScheduler0, WorkLauncher workLauncher0, long v, int v1, w w0) {
        if((v1 & 4) != 0) {
            v = TimeUnit.MINUTES.toMillis(90L);
        }
        this(runnableScheduler0, workLauncher0, v);
    }

    public final void b(@l StartStopToken startStopToken0) {
        Runnable runnable0;
        L.p(startStopToken0, "token");
        synchronized(this.d) {
            runnable0 = (Runnable)this.e.remove(startStopToken0);
        }
        if(runnable0 != null) {
            this.a.a(runnable0);
        }
    }

    public final void c(@l StartStopToken startStopToken0) {
        L.p(startStopToken0, "token");
        a a0 = () -> this.b.d(startStopToken0, 3);
        synchronized(this.d) {
            Runnable runnable0 = (Runnable)this.e.put(startStopToken0, a0);
        }
        this.a.b(this.c, a0);
    }

    // 检测为 Lambda 实现
    private static final void d(TimeLimiter timeLimiter0, StartStopToken startStopToken0) [...]
}

