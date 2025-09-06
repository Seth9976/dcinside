package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import com.google.common.base.Q;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(23)
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    public static final class Factory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
        private final Q b;
        private final Q c;
        private boolean d;

        public Factory(int v) {
            this(() -> new HandlerThread(AsynchronousMediaCodecAdapter.u(v)), () -> new HandlerThread(AsynchronousMediaCodecAdapter.v(v)));
        }

        @VisibleForTesting
        Factory(Q q0, Q q1) {
            this.b = q0;
            this.c = q1;
            this.d = true;
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Factory
        public MediaCodecAdapter a(Configuration mediaCodecAdapter$Configuration0) throws IOException {
            return this.d(mediaCodecAdapter$Configuration0);
        }

        public AsynchronousMediaCodecAdapter d(Configuration mediaCodecAdapter$Configuration0) throws IOException {
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter1;
            AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer0;
            int v;
            MediaCodec mediaCodec0;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter0 = null;
            try {
                TraceUtil.a(("createCodec:" + mediaCodecAdapter$Configuration0.a.a));
                mediaCodec0 = null;
                mediaCodec0 = MediaCodec.createByCodecName(mediaCodecAdapter$Configuration0.a.a);
                v = mediaCodecAdapter$Configuration0.f;
                if(!this.d || !Factory.h(mediaCodecAdapter$Configuration0.c)) {
                    asynchronousMediaCodecBufferEnqueuer0 = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec0, ((HandlerThread)this.c.get()));
                }
                else {
                    asynchronousMediaCodecBufferEnqueuer0 = new SynchronousMediaCodecBufferEnqueuer(mediaCodec0);
                    v |= 4;
                }
                asynchronousMediaCodecAdapter1 = new AsynchronousMediaCodecAdapter(mediaCodec0, ((HandlerThread)this.b.get()), asynchronousMediaCodecBufferEnqueuer0, null);
            }
            catch(Exception exception0) {
                goto label_19;
            }
            try {
                TraceUtil.b();
                asynchronousMediaCodecAdapter1.x(mediaCodecAdapter$Configuration0.b, mediaCodecAdapter$Configuration0.d, mediaCodecAdapter$Configuration0.e, v);
                return asynchronousMediaCodecAdapter1;
            }
            catch(Exception exception0) {
                asynchronousMediaCodecAdapter0 = asynchronousMediaCodecAdapter1;
            }
        label_19:
            if(asynchronousMediaCodecAdapter0 != null) {
                asynchronousMediaCodecAdapter0.release();
            }
            else if(mediaCodec0 != null) {
                mediaCodec0.release();
            }
            throw exception0;
        }

        public void e(boolean z) {
            this.d = z;
        }

        // 检测为 Lambda 实现
        private static HandlerThread f(int v) [...]

        // 检测为 Lambda 实现
        private static HandlerThread g(int v) [...]

        // 去混淆评级： 低(20)
        @ChecksSdkIntAtLeast(api = 34)
        private static boolean h(Format format0) {
            return Util.a >= 34 ? Util.a >= 35 || MimeTypes.u(format0.n) : false;
        }
    }

    private final MediaCodec a;
    private final AsynchronousMediaCodecCallback b;
    private final MediaCodecBufferEnqueuer c;
    private boolean d;
    private int e;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec0, HandlerThread handlerThread0, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer0) {
        this.a = mediaCodec0;
        this.b = new AsynchronousMediaCodecCallback(handlerThread0);
        this.c = mediaCodecBufferEnqueuer0;
        this.e = 0;
    }

    AsynchronousMediaCodecAdapter(MediaCodec mediaCodec0, HandlerThread handlerThread0, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer0, androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.1 asynchronousMediaCodecAdapter$10) {
        this(mediaCodec0, handlerThread0, mediaCodecBufferEnqueuer0);
    }

    @VisibleForTesting
    void A(MediaFormat mediaFormat0) {
        this.b.onOutputFormatChanged(this.a, mediaFormat0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void a(Bundle bundle0) {
        this.c.a(bundle0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void b(int v, int v1, int v2, long v3, int v4) {
        this.c.b(v, v1, v2, v3, v4);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle c() {
        return this.a.getMetrics();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void d(int v, int v1, CryptoInfo cryptoInfo0, long v2, int v3) {
        this.c.d(v, v1, cryptoInfo0, v2, v3);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean e() {
        return false;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void f(int v, long v1) {
        this.a.releaseOutputBuffer(v, v1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.c.flush();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void g(int v) {
        this.a.setVideoScalingMode(v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int h(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        this.c.c();
        return this.b.d(mediaCodec$BufferInfo0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void i(int v, boolean z) {
        this.a.releaseOutputBuffer(v, z);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean j(OnBufferAvailableListener mediaCodecAdapter$OnBufferAvailableListener0) {
        this.b.p(mediaCodecAdapter$OnBufferAvailableListener0);
        return true;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void k(OnFrameRenderedListener mediaCodecAdapter$OnFrameRenderedListener0, Handler handler0) {
        d d0 = (MediaCodec mediaCodec0, long v, long v1) -> mediaCodecAdapter$OnFrameRenderedListener0.a(this, v, v1);
        this.a.setOnFrameRenderedListener(d0, handler0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat l() {
        return this.b.g();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer m(int v) {
        return this.a.getInputBuffer(v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void n(Surface surface0) {
        this.a.setOutputSurface(surface0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int o() {
        this.c.c();
        return this.b.c();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer p(int v) {
        return this.a.getOutputBuffer(v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if(this.e == 1) {
                this.c.shutdown();
                this.b.q();
                goto label_16;
            label_5:
                if(this.d) {
                    throw throwable0;
                }
                goto label_6;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            goto label_5;
        }
    label_6:
        if(Util.a >= 30 && Util.a < 33) {
            try {
                this.a.stop();
            }
            catch(Throwable throwable1) {
                this.a.release();
                this.d = true;
                throw throwable1;
            }
        }
        this.a.release();
        this.d = true;
        throw throwable0;
    label_16:
        this.e = 2;
        if(!this.d) {
            if(Util.a >= 30 && Util.a < 33) {
                try {
                    this.a.stop();
                }
                catch(Throwable throwable2) {
                    this.a.release();
                    this.d = true;
                    throw throwable2;
                }
            }
            this.a.release();
            this.d = true;
        }
    }

    private static String u(int v) {
        return AsynchronousMediaCodecAdapter.w(v, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    private static String v(int v) {
        return AsynchronousMediaCodecAdapter.w(v, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String w(int v, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(v == 1) {
            stringBuilder0.append("Audio");
            return stringBuilder0.toString();
        }
        if(v == 2) {
            stringBuilder0.append("Video");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("Unknown(");
        stringBuilder0.append(v);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    private void x(@Nullable MediaFormat mediaFormat0, @Nullable Surface surface0, @Nullable MediaCrypto mediaCrypto0, int v) {
        this.b.h(this.a);
        TraceUtil.a("configureCodec");
        this.a.configure(mediaFormat0, surface0, mediaCrypto0, v);
        TraceUtil.b();
        this.c.start();
        TraceUtil.a("startCodec");
        this.a.start();
        TraceUtil.b();
        this.e = 1;
    }

    // 检测为 Lambda 实现
    private void y(OnFrameRenderedListener mediaCodecAdapter$OnFrameRenderedListener0, MediaCodec mediaCodec0, long v, long v1) [...]

    @VisibleForTesting
    void z(MediaCodec.CodecException mediaCodec$CodecException0) {
        this.b.onError(this.a, mediaCodec$CodecException0);
    }

    class androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.1 {
    }

}

