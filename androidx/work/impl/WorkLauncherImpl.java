package androidx.work.impl;

import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class WorkLauncherImpl implements WorkLauncher {
    @l
    private final Processor a;
    @l
    private final TaskExecutor b;

    public WorkLauncherImpl(@l Processor processor0, @l TaskExecutor taskExecutor0) {
        L.p(processor0, "processor");
        L.p(taskExecutor0, "workTaskExecutor");
        super();
        this.a = processor0;
        this.b = taskExecutor0;
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void a(StartStopToken startStopToken0, int v) {
        i.c(this, startStopToken0, v);
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void b(StartStopToken startStopToken0) {
        i.a(this, startStopToken0);
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void c(@l StartStopToken startStopToken0, @m RuntimeExtras workerParameters$RuntimeExtras0) {
        L.p(startStopToken0, "workSpecId");
        j j0 = () -> this.a.t(startStopToken0, workerParameters$RuntimeExtras0);
        this.b.b(j0);
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void d(@l StartStopToken startStopToken0, int v) {
        L.p(startStopToken0, "workSpecId");
        StopWorkRunnable stopWorkRunnable0 = new StopWorkRunnable(this.a, startStopToken0, false, v);
        this.b.b(stopWorkRunnable0);
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void e(StartStopToken startStopToken0) {
        i.b(this, startStopToken0);
    }

    @l
    public final Processor g() {
        return this.a;
    }

    @l
    public final TaskExecutor h() {
        return this.b;
    }

    // 检测为 Lambda 实现
    private static final void i(WorkLauncherImpl workLauncherImpl0, StartStopToken startStopToken0, RuntimeExtras workerParameters$RuntimeExtras0) [...]
}

