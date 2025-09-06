package androidx.room;

public final class f implements Runnable {
    public final MultiInstanceInvalidationClient a;
    public final String[] b;

    public f(MultiInstanceInvalidationClient multiInstanceInvalidationClient0, String[] arr_s) {
        this.a = multiInstanceInvalidationClient0;
        this.b = arr_s;
    }

    @Override
    public final void run() {
        androidx.room.MultiInstanceInvalidationClient.callback.1.k1(this.a, this.b);
    }
}

