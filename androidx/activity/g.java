package androidx.activity;

public final class g implements Runnable {
    public final ReportFullyDrawnExecutorImpl a;

    public g(ReportFullyDrawnExecutorImpl componentActivity$ReportFullyDrawnExecutorImpl0) {
        this.a = componentActivity$ReportFullyDrawnExecutorImpl0;
    }

    @Override
    public final void run() {
        ReportFullyDrawnExecutorImpl.b(this.a);
    }
}

