package androidx.media3.exoplayer.source.ads;

public final class c implements Runnable {
    public final AdsMediaSource a;
    public final ComponentListener b;

    public c(AdsMediaSource adsMediaSource0, ComponentListener adsMediaSource$ComponentListener0) {
        this.a = adsMediaSource0;
        this.b = adsMediaSource$ComponentListener0;
    }

    @Override
    public final void run() {
        this.a.S0(this.b);
    }
}

