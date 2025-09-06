package androidx.room;

public final class a implements Runnable {
    public final AutoCloser a;

    public a(AutoCloser autoCloser0) {
        this.a = autoCloser0;
    }

    @Override
    public final void run() {
        AutoCloser.f(this.a);
    }
}

