package androidx.room;

public final class b implements Runnable {
    public final AutoCloser a;

    public b(AutoCloser autoCloser0) {
        this.a = autoCloser0;
    }

    @Override
    public final void run() {
        AutoCloser.c(this.a);
    }
}

