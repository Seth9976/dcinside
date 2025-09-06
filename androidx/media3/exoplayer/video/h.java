package androidx.media3.exoplayer.video;

public final class h implements Runnable {
    public final VideoSinkImpl a;
    public final Listener b;

    public h(VideoSinkImpl compositingVideoSinkProvider$VideoSinkImpl0, Listener videoSink$Listener0) {
        this.a = compositingVideoSinkProvider$VideoSinkImpl0;
        this.b = videoSink$Listener0;
    }

    @Override
    public final void run() {
        this.a.E(this.b);
    }
}

