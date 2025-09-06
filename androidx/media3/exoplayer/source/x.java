package androidx.media3.exoplayer.source;

public final class x implements Runnable {
    public final EventDispatcher a;
    public final MediaSourceEventListener b;
    public final MediaLoadData c;

    public x(EventDispatcher mediaSourceEventListener$EventDispatcher0, MediaSourceEventListener mediaSourceEventListener0, MediaLoadData mediaLoadData0) {
        this.a = mediaSourceEventListener$EventDispatcher0;
        this.b = mediaSourceEventListener0;
        this.c = mediaLoadData0;
    }

    @Override
    public final void run() {
        this.a.j(this.b, this.c);
    }
}

