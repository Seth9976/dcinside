package androidx.media3.exoplayer.dash;

public final class e implements Runnable {
    public final DashMediaSource a;

    public e(DashMediaSource dashMediaSource0) {
        this.a = dashMediaSource0;
    }

    @Override
    public final void run() {
        this.a.G0();
    }
}

