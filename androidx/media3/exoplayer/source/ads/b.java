package androidx.media3.exoplayer.source.ads;

public final class b implements Runnable {
    public final AdsMediaSource a;
    public final ComponentListener b;

    public b(AdsMediaSource adsMediaSource0, ComponentListener adsMediaSource$ComponentListener0) {
        this.a = adsMediaSource0;
        this.b = adsMediaSource$ComponentListener0;
    }

    @Override
    public final void run() {
        this.a.R0(this.b);
    }
}

