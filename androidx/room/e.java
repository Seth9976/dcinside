package androidx.room;

public final class e implements Runnable {
    public final MultiInstanceInvalidationClient a;

    public e(MultiInstanceInvalidationClient multiInstanceInvalidationClient0) {
        this.a = multiInstanceInvalidationClient0;
    }

    @Override
    public final void run() {
        MultiInstanceInvalidationClient.n(this.a);
    }
}

