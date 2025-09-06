package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCodec;

public final class d implements MediaCodec.OnFrameRenderedListener {
    public final AsynchronousMediaCodecAdapter a;
    public final OnFrameRenderedListener b;

    public d(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter0, OnFrameRenderedListener mediaCodecAdapter$OnFrameRenderedListener0) {
        this.a = asynchronousMediaCodecAdapter0;
        this.b = mediaCodecAdapter$OnFrameRenderedListener0;
    }

    @Override  // android.media.MediaCodec$OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec0, long v, long v1) {
        this.a.y(this.b, mediaCodec0, v, v1);
    }
}

