package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.DecoderCounters;

public final class k implements Runnable {
    public final EventDispatcher a;
    public final DecoderCounters b;

    public k(EventDispatcher audioRendererEventListener$EventDispatcher0, DecoderCounters decoderCounters0) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = decoderCounters0;
    }

    @Override
    public final void run() {
        this.a.C(this.b);
    }
}

