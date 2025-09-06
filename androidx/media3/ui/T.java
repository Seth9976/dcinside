package androidx.media3.ui;

public final class t implements Runnable {
    public final PlayerControlViewLayoutManager a;

    public t(PlayerControlViewLayoutManager playerControlViewLayoutManager0) {
        this.a = playerControlViewLayoutManager0;
    }

    @Override
    public final void run() {
        this.a.d0();
    }
}

