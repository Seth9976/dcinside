package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    public static class Factory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Factory
        public MediaCodecAdapter a(Configuration mediaCodecAdapter$Configuration0) throws IOException {
            MediaCodec mediaCodec0 = null;
            try {
                mediaCodec0 = this.b(mediaCodecAdapter$Configuration0);
                TraceUtil.a("configureCodec");
                mediaCodec0.configure(mediaCodecAdapter$Configuration0.b, mediaCodecAdapter$Configuration0.d, mediaCodecAdapter$Configuration0.e, mediaCodecAdapter$Configuration0.f);
                TraceUtil.b();
                TraceUtil.a("startCodec");
                mediaCodec0.start();
                TraceUtil.b();
                return new SynchronousMediaCodecAdapter(mediaCodec0, null);
            }
            catch(IOException | RuntimeException iOException0) {
                if(mediaCodec0 != null) {
                    mediaCodec0.release();
                }
                throw iOException0;
            }
        }

        protected MediaCodec b(Configuration mediaCodecAdapter$Configuration0) throws IOException {
            Assertions.g(mediaCodecAdapter$Configuration0.a);
            TraceUtil.a(("createCodec:" + mediaCodecAdapter$Configuration0.a.a));
            MediaCodec mediaCodec0 = MediaCodec.createByCodecName(mediaCodecAdapter$Configuration0.a.a);
            TraceUtil.b();
            return mediaCodec0;
        }
    }

    private final MediaCodec a;
    @Nullable
    private ByteBuffer[] b;
    @Nullable
    private ByteBuffer[] c;

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec0) {
        this.a = mediaCodec0;
        if(Util.a < 21) {
            this.b = mediaCodec0.getInputBuffers();
            this.c = mediaCodec0.getOutputBuffers();
        }
    }

    SynchronousMediaCodecAdapter(MediaCodec mediaCodec0, androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.1 synchronousMediaCodecAdapter$10) {
        this(mediaCodec0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void a(Bundle bundle0) {
        this.a.setParameters(bundle0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void b(int v, int v1, int v2, long v3, int v4) {
        this.a.queueInputBuffer(v, v1, v2, v3, v4);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle c() {
        return this.a.getMetrics();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void d(int v, int v1, CryptoInfo cryptoInfo0, long v2, int v3) {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = cryptoInfo0.a();
        this.a.queueSecureInputBuffer(v, v1, mediaCodec$CryptoInfo0, v2, v3);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean e() {
        return false;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(21)
    public void f(int v, long v1) {
        this.a.releaseOutputBuffer(v, v1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.a.flush();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void g(int v) {
        this.a.setVideoScalingMode(v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int h(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        int v;
        do {
            v = this.a.dequeueOutputBuffer(mediaCodec$BufferInfo0, 0L);
            if(v == -3 && Util.a < 21) {
                this.c = this.a.getOutputBuffers();
            }
        }
        while(v == -3);
        return v;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void i(int v, boolean z) {
        this.a.releaseOutputBuffer(v, z);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean j(OnBufferAvailableListener mediaCodecAdapter$OnBufferAvailableListener0) {
        return false;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void k(OnFrameRenderedListener mediaCodecAdapter$OnFrameRenderedListener0, Handler handler0) {
        E e0 = (MediaCodec mediaCodec0, long v, long v1) -> mediaCodecAdapter$OnFrameRenderedListener0.a(this, v, v1);
        this.a.setOnFrameRenderedListener(e0, handler0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat l() {
        return this.a.getOutputFormat();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer m(int v) {
        return Util.a < 21 ? this.b[v] : this.a.getInputBuffer(v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void n(Surface surface0) {
        this.a.setOutputSurface(surface0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int o() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer p(int v) {
        return Util.a < 21 ? this.c[v] : this.a.getOutputBuffer(v);
    }

    // 检测为 Lambda 实现
    private void r(OnFrameRenderedListener mediaCodecAdapter$OnFrameRenderedListener0, MediaCodec mediaCodec0, long v, long v1) [...]

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            this.b = null;
            this.c = null;
            if(Util.a >= 30 && Util.a < 33) {
                this.a.stop();
            }
        }
        finally {
            this.a.release();
        }
    }

    class androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.1 {
    }

}

