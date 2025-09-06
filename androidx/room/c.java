package androidx.room;

public final class c implements Runnable {
    public final InvalidationTracker a;

    public c(InvalidationTracker invalidationTracker0) {
        this.a = invalidationTracker0;
    }

    @Override
    public final void run() {
        this.a.q();
    }
}

