package androidx.work.impl;

import androidx.work.WorkerParameters.RuntimeExtras;

public final class j implements Runnable {
    public final WorkLauncherImpl a;
    public final StartStopToken b;
    public final RuntimeExtras c;

    public j(WorkLauncherImpl workLauncherImpl0, StartStopToken startStopToken0, RuntimeExtras workerParameters$RuntimeExtras0) {
        this.a = workLauncherImpl0;
        this.b = startStopToken0;
        this.c = workerParameters$RuntimeExtras0;
    }

    @Override
    public final void run() {
        WorkLauncherImpl.i(this.a, this.b, this.c);
    }
}

