package androidx.media3.common.util;

public final class d implements Runnable {
    public final NetworkTypeObserver a;
    public final Listener b;

    public d(NetworkTypeObserver networkTypeObserver0, Listener networkTypeObserver$Listener0) {
        this.a = networkTypeObserver0;
        this.b = networkTypeObserver$Listener0;
    }

    @Override
    public final void run() {
        this.a.h(this.b);
    }
}

