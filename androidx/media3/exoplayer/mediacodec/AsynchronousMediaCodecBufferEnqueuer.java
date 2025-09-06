package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.d;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.c;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(23)
class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    static class MessageParams {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d;
        public long e;
        public int f;

        MessageParams() {
            this.d = new MediaCodec.CryptoInfo();
        }

        public void a(int v, int v1, int v2, long v3, int v4) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.e = v3;
            this.f = v4;
        }
    }

    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference d;
    private final ConditionVariable e;
    private boolean f;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque k;
    private static final Object l;

    static {
        AsynchronousMediaCodecBufferEnqueuer.k = new ArrayDeque();
        AsynchronousMediaCodecBufferEnqueuer.l = new Object();
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec0, HandlerThread handlerThread0) {
        this(mediaCodec0, handlerThread0, new ConditionVariable());
    }

    @VisibleForTesting
    AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec0, HandlerThread handlerThread0, ConditionVariable conditionVariable0) {
        this.a = mediaCodec0;
        this.b = handlerThread0;
        this.e = conditionVariable0;
        this.d = new AtomicReference();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void a(Bundle bundle0) {
        this.c();
        this.c.obtainMessage(4, bundle0).sendToTarget();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void b(int v, int v1, int v2, long v3, int v4) {
        this.c();
        MessageParams asynchronousMediaCodecBufferEnqueuer$MessageParams0 = AsynchronousMediaCodecBufferEnqueuer.p();
        asynchronousMediaCodecBufferEnqueuer$MessageParams0.a(v, v1, v2, v3, v4);
        this.c.obtainMessage(1, asynchronousMediaCodecBufferEnqueuer$MessageParams0).sendToTarget();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void c() {
        RuntimeException runtimeException0 = (RuntimeException)this.d.getAndSet(null);
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void d(int v, int v1, CryptoInfo cryptoInfo0, long v2, int v3) {
        this.c();
        MessageParams asynchronousMediaCodecBufferEnqueuer$MessageParams0 = AsynchronousMediaCodecBufferEnqueuer.p();
        asynchronousMediaCodecBufferEnqueuer$MessageParams0.a(v, v1, 0, v2, v3);
        AsynchronousMediaCodecBufferEnqueuer.h(cryptoInfo0, asynchronousMediaCodecBufferEnqueuer$MessageParams0.d);
        this.c.obtainMessage(2, asynchronousMediaCodecBufferEnqueuer$MessageParams0).sendToTarget();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void e() throws InterruptedException {
        this.g();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
        if(this.f) {
            try {
                this.o();
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(interruptedException0);
            }
        }
    }

    private void g() throws InterruptedException {
        this.e.d();
        ((Handler)Assertions.g(this.c)).obtainMessage(3).sendToTarget();
        this.e.a();
    }

    private static void h(CryptoInfo cryptoInfo0, MediaCodec.CryptoInfo mediaCodec$CryptoInfo0) {
        mediaCodec$CryptoInfo0.numSubSamples = cryptoInfo0.f;
        mediaCodec$CryptoInfo0.numBytesOfClearData = AsynchronousMediaCodecBufferEnqueuer.j(cryptoInfo0.d, mediaCodec$CryptoInfo0.numBytesOfClearData);
        mediaCodec$CryptoInfo0.numBytesOfEncryptedData = AsynchronousMediaCodecBufferEnqueuer.j(cryptoInfo0.e, mediaCodec$CryptoInfo0.numBytesOfEncryptedData);
        mediaCodec$CryptoInfo0.key = (byte[])Assertions.g(AsynchronousMediaCodecBufferEnqueuer.i(cryptoInfo0.b, mediaCodec$CryptoInfo0.key));
        mediaCodec$CryptoInfo0.iv = (byte[])Assertions.g(AsynchronousMediaCodecBufferEnqueuer.i(cryptoInfo0.a, mediaCodec$CryptoInfo0.iv));
        mediaCodec$CryptoInfo0.mode = cryptoInfo0.c;
        if(Util.a >= 24) {
            mediaCodec$CryptoInfo0.setPattern(c.a(cryptoInfo0.g, cryptoInfo0.h));
        }
    }

    @Nullable
    private static byte[] i(@Nullable byte[] arr_b, @Nullable byte[] arr_b1) {
        if(arr_b == null) {
            return arr_b1;
        }
        if(arr_b1 != null && arr_b1.length >= arr_b.length) {
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            return arr_b1;
        }
        return Arrays.copyOf(arr_b, arr_b.length);
    }

    @Nullable
    private static int[] j(@Nullable int[] arr_v, @Nullable int[] arr_v1) {
        if(arr_v == null) {
            return arr_v1;
        }
        if(arr_v1 != null && arr_v1.length >= arr_v.length) {
            System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
            return arr_v1;
        }
        return Arrays.copyOf(arr_v, arr_v.length);
    }

    private void k(Message message0) {
        MessageParams asynchronousMediaCodecBufferEnqueuer$MessageParams0 = null;
        switch(message0.what) {
            case 1: {
                asynchronousMediaCodecBufferEnqueuer$MessageParams0 = (MessageParams)message0.obj;
                this.l(asynchronousMediaCodecBufferEnqueuer$MessageParams0.a, asynchronousMediaCodecBufferEnqueuer$MessageParams0.b, asynchronousMediaCodecBufferEnqueuer$MessageParams0.c, asynchronousMediaCodecBufferEnqueuer$MessageParams0.e, asynchronousMediaCodecBufferEnqueuer$MessageParams0.f);
                break;
            }
            case 2: {
                asynchronousMediaCodecBufferEnqueuer$MessageParams0 = (MessageParams)message0.obj;
                this.m(asynchronousMediaCodecBufferEnqueuer$MessageParams0.a, asynchronousMediaCodecBufferEnqueuer$MessageParams0.b, asynchronousMediaCodecBufferEnqueuer$MessageParams0.d, asynchronousMediaCodecBufferEnqueuer$MessageParams0.e, asynchronousMediaCodecBufferEnqueuer$MessageParams0.f);
                break;
            }
            case 3: {
                this.e.f();
                break;
            }
            case 4: {
                this.n(((Bundle)message0.obj));
                break;
            }
            default: {
                IllegalStateException illegalStateException0 = new IllegalStateException(String.valueOf(message0.what));
                d.a(this.d, null, illegalStateException0);
            }
        }
        if(asynchronousMediaCodecBufferEnqueuer$MessageParams0 != null) {
            AsynchronousMediaCodecBufferEnqueuer.q(asynchronousMediaCodecBufferEnqueuer$MessageParams0);
        }
    }

    private void l(int v, int v1, int v2, long v3, int v4) {
        try {
            this.a.queueInputBuffer(v, v1, v2, v3, v4);
        }
        catch(RuntimeException runtimeException0) {
            d.a(this.d, null, runtimeException0);
        }
    }

    private void m(int v, int v1, MediaCodec.CryptoInfo mediaCodec$CryptoInfo0, long v2, int v3) {
        try {
            synchronized(AsynchronousMediaCodecBufferEnqueuer.l) {
                this.a.queueSecureInputBuffer(v, v1, mediaCodec$CryptoInfo0, v2, v3);
            }
        }
        catch(RuntimeException runtimeException0) {
            d.a(this.d, null, runtimeException0);
        }
    }

    private void n(Bundle bundle0) {
        try {
            this.a.setParameters(bundle0);
        }
        catch(RuntimeException runtimeException0) {
            d.a(this.d, null, runtimeException0);
        }
    }

    private void o() throws InterruptedException {
        ((Handler)Assertions.g(this.c)).removeCallbacksAndMessages(null);
        this.g();
    }

    private static MessageParams p() {
        ArrayDeque arrayDeque0 = AsynchronousMediaCodecBufferEnqueuer.k;
        synchronized(arrayDeque0) {
            if(arrayDeque0.isEmpty()) {
                return new MessageParams();
            }
        }
        return (MessageParams)arrayDeque0.removeFirst();
    }

    private static void q(MessageParams asynchronousMediaCodecBufferEnqueuer$MessageParams0) {
        synchronized(AsynchronousMediaCodecBufferEnqueuer.k) {
            AsynchronousMediaCodecBufferEnqueuer.k.add(asynchronousMediaCodecBufferEnqueuer$MessageParams0);
        }
    }

    @VisibleForTesting(otherwise = 5)
    void r(RuntimeException runtimeException0) {
        this.d.set(runtimeException0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
        if(this.f) {
            this.flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
        if(!this.f) {
            this.b.start();
            this.c = new Handler(this.b.getLooper()) {
                final AsynchronousMediaCodecBufferEnqueuer a;

                @Override  // android.os.Handler
                public void handleMessage(Message message0) {
                    AsynchronousMediaCodecBufferEnqueuer.this.k(message0);
                }
            };
            this.f = true;
        }
    }
}

