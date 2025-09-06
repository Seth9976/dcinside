package androidx.lifecycle;

public final class d implements Runnable {
    public final DispatchQueue a;
    public final Runnable b;

    public d(DispatchQueue dispatchQueue0, Runnable runnable0) {
        this.a = dispatchQueue0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        DispatchQueue.d(this.a, this.b);
    }
}

