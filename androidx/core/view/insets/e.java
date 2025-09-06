package androidx.core.view.insets;

public final class e implements Runnable {
    public final SystemBarStateMonitor a;

    public e(SystemBarStateMonitor systemBarStateMonitor0) {
        this.a = systemBarStateMonitor0;
    }

    @Override
    public final void run() {
        this.a.l();
    }
}

