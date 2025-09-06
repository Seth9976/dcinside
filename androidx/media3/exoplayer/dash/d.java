package androidx.media3.exoplayer.dash;

public final class d implements Runnable {
    public final DashMediaSource a;

    public d(DashMediaSource dashMediaSource0) {
        this.a = dashMediaSource0;
    }

    @Override
    public final void run() {
        this.a.Y0();
    }
}

