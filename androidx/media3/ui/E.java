package androidx.media3.ui;

public final class e implements Runnable {
    public final LegacyPlayerControlView a;

    public e(LegacyPlayerControlView legacyPlayerControlView0) {
        this.a = legacyPlayerControlView0;
    }

    @Override
    public final void run() {
        this.a.P();
    }
}

