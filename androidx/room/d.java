package androidx.room;

public final class d implements Runnable {
    public final MultiInstanceInvalidationClient a;

    public d(MultiInstanceInvalidationClient multiInstanceInvalidationClient0) {
        this.a = multiInstanceInvalidationClient0;
    }

    @Override
    public final void run() {
        MultiInstanceInvalidationClient.r(this.a);
    }
}

