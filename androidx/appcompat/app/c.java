package androidx.appcompat.app;

public final class c implements Runnable {
    public final SerialExecutor a;
    public final Runnable b;

    public c(SerialExecutor appCompatDelegate$SerialExecutor0, Runnable runnable0) {
        this.a = appCompatDelegate$SerialExecutor0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

