package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.media3.decoder.CryptoInfo;

@RequiresApi(23)
class SynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    private final MediaCodec a;

    public SynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec0) {
        this.a = mediaCodec0;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void a(Bundle bundle0) {
        this.a.setParameters(bundle0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void b(int v, int v1, int v2, long v3, int v4) {
        this.a.queueInputBuffer(v, v1, v2, v3, v4);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void c() {
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void d(int v, int v1, CryptoInfo cryptoInfo0, long v2, int v3) {
        this.a.queueSecureInputBuffer(v, v1, cryptoInfo0.a(), v2, v3);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void e() {
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
    }
}

