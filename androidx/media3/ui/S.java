package androidx.media3.ui;

public final class s implements Runnable {
    public final PlayerControlViewLayoutManager a;

    public s(PlayerControlViewLayoutManager playerControlViewLayoutManager0) {
        this.a = playerControlViewLayoutManager0;
    }

    @Override
    public final void run() {
        this.a.T();
    }
}

