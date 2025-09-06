package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoFrameProcessingException;

public final class g implements Runnable {
    public final VideoSinkImpl a;
    public final Listener b;
    public final VideoFrameProcessingException c;

    public g(VideoSinkImpl compositingVideoSinkProvider$VideoSinkImpl0, Listener videoSink$Listener0, VideoFrameProcessingException videoFrameProcessingException0) {
        this.a = compositingVideoSinkProvider$VideoSinkImpl0;
        this.b = videoSink$Listener0;
        this.c = videoFrameProcessingException0;
    }

    @Override
    public final void run() {
        this.a.D(this.b, this.c);
    }
}

