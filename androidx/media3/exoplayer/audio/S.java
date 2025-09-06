package androidx.media3.exoplayer.audio;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

public final class s implements Runnable {
    public final EventDispatcher a;
    public final Format b;
    public final DecoderReuseEvaluation c;

    public s(EventDispatcher audioRendererEventListener$EventDispatcher0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = format0;
        this.c = decoderReuseEvaluation0;
    }

    @Override
    public final void run() {
        this.a.D(this.b, this.c);
    }
}

