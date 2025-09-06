package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

public final class u implements Runnable {
    public final EventDispatcher a;
    public final Format b;
    public final DecoderReuseEvaluation c;

    public u(EventDispatcher videoRendererEventListener$EventDispatcher0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = format0;
        this.c = decoderReuseEvaluation0;
    }

    @Override
    public final void run() {
        this.a.v(this.b, this.c);
    }
}

