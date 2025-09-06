package androidx.activity;

public final class q implements Runnable {
    public final FullyDrawnReporter a;

    public q(FullyDrawnReporter fullyDrawnReporter0) {
        this.a = fullyDrawnReporter0;
    }

    @Override
    public final void run() {
        FullyDrawnReporter.i(this.a);
    }
}

