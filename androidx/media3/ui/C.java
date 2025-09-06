package androidx.media3.ui;

public final class c implements Runnable {
    public final DefaultTimeBar a;

    public c(DefaultTimeBar defaultTimeBar0) {
        this.a = defaultTimeBar0;
    }

    @Override
    public final void run() {
        this.a.l();
    }
}

