package androidx.media3.ui;

public final class f implements Runnable {
    public final LegacyPlayerControlView a;

    public f(LegacyPlayerControlView legacyPlayerControlView0) {
        this.a = legacyPlayerControlView0;
    }

    @Override
    public final void run() {
        this.a.A();
    }
}

