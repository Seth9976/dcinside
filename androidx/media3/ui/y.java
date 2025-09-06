package androidx.media3.ui;

public final class y implements Runnable {
    public final PlayerControlViewLayoutManager a;

    public y(PlayerControlViewLayoutManager playerControlViewLayoutManager0) {
        this.a = playerControlViewLayoutManager0;
    }

    @Override
    public final void run() {
        this.a.G();
    }
}

