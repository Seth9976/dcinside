package androidx.media3.exoplayer.offline;

public final class o implements Runnable {
    public final ForegroundNotificationUpdater a;

    public o(ForegroundNotificationUpdater downloadService$ForegroundNotificationUpdater0) {
        this.a = downloadService$ForegroundNotificationUpdater0;
    }

    @Override
    public final void run() {
        this.a.f();
    }
}

