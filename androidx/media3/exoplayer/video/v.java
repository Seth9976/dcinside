package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.DecoderCounters;

public final class v implements Runnable {
    public final EventDispatcher a;
    public final DecoderCounters b;

    public v(EventDispatcher videoRendererEventListener$EventDispatcher0, DecoderCounters decoderCounters0) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = decoderCounters0;
    }

    @Override
    public final void run() {
        this.a.s(this.b);
    }
}

