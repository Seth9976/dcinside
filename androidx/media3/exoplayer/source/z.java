package androidx.media3.exoplayer.source;

public final class z implements Runnable {
    public final EventDispatcher a;
    public final MediaSourceEventListener b;
    public final LoadEventInfo c;
    public final MediaLoadData d;

    public z(EventDispatcher mediaSourceEventListener$EventDispatcher0, MediaSourceEventListener mediaSourceEventListener0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        this.a = mediaSourceEventListener$EventDispatcher0;
        this.b = mediaSourceEventListener0;
        this.c = loadEventInfo0;
        this.d = mediaLoadData0;
    }

    @Override
    public final void run() {
        this.a.l(this.b, this.c, this.d);
    }
}

