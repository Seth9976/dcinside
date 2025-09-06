package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;

public final class e implements Runnable {
    public final VideoSinkImpl a;
    public final Listener b;
    public final VideoSize c;

    public e(VideoSinkImpl compositingVideoSinkProvider$VideoSinkImpl0, Listener videoSink$Listener0, VideoSize videoSize0) {
        this.a = compositingVideoSinkProvider$VideoSinkImpl0;
        this.b = videoSink$Listener0;
        this.c = videoSize0;
    }

    @Override
    public final void run() {
        this.a.G(this.b, this.c);
    }
}

