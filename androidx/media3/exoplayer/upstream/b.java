package androidx.media3.exoplayer.upstream;

public final class b implements Runnable {
    public final HandlerAndListener a;
    public final int b;
    public final long c;
    public final long d;

    public b(HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0, int v, long v1, long v2) {
        this.a = bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final void run() {
        EventDispatcher.d(this.a, this.b, this.c, this.d);
    }
}

