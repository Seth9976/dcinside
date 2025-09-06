package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;

public final class o implements Runnable {
    public final EventDispatcher a;
    public final VideoSize b;

    public o(EventDispatcher videoRendererEventListener$EventDispatcher0, VideoSize videoSize0) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = videoSize0;
    }

    @Override
    public final void run() {
        this.a.z(this.b);
    }
}

