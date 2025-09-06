package androidx.media3.exoplayer.analytics;

public final class e0 implements Runnable {
    public final DefaultAnalyticsCollector a;

    public e0(DefaultAnalyticsCollector defaultAnalyticsCollector0) {
        this.a = defaultAnalyticsCollector0;
    }

    @Override
    public final void run() {
        this.a.r3();
    }
}

