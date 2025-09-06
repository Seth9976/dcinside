package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import androidx.media3.common.util.Assertions;
import java.util.ArrayDeque;

@RequiresApi(23)
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    private final Object a;
    private final HandlerThread b;
    private Handler c;
    @GuardedBy("lock")
    private final CircularIntArray d;
    @GuardedBy("lock")
    private final CircularIntArray e;
    @GuardedBy("lock")
    private final ArrayDeque f;
    @GuardedBy("lock")
    private final ArrayDeque g;
    @GuardedBy("lock")
    @Nullable
    private MediaFormat h;
    @GuardedBy("lock")
    @Nullable
    private MediaFormat i;
    @GuardedBy("lock")
    @Nullable
    private MediaCodec.CodecException j;
    @GuardedBy("lock")
    @Nullable
    private MediaCodec.CryptoException k;
    @GuardedBy("lock")
    private long l;
    @GuardedBy("lock")
    private boolean m;
    @GuardedBy("lock")
    @Nullable
    private IllegalStateException n;
    @GuardedBy("lock")
    @Nullable
    private OnBufferAvailableListener o;

    AsynchronousMediaCodecCallback(HandlerThread handlerThread0) {
        this.a = new Object();
        this.b = handlerThread0;
        this.d = new CircularIntArray();
        this.e = new CircularIntArray();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    @GuardedBy("lock")
    private void b(MediaFormat mediaFormat0) {
        this.e.b(-2);
        this.g.add(mediaFormat0);
    }

    public int c() {
        synchronized(this.a) {
            this.j();
            int v1 = -1;
            if(this.i()) {
                return -1;
            }
            if(!this.d.h()) {
                v1 = this.d.i();
            }
            return v1;
        }
    }

    public int d(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.a) {
            this.j();
            if(this.i()) {
                return -1;
            }
            if(this.e.h()) {
                return -1;
            }
            int v1 = this.e.i();
            if(v1 >= 0) {
                Assertions.k(this.h);
                MediaCodec.BufferInfo mediaCodec$BufferInfo1 = (MediaCodec.BufferInfo)this.f.remove();
                mediaCodec$BufferInfo0.set(mediaCodec$BufferInfo1.offset, mediaCodec$BufferInfo1.size, mediaCodec$BufferInfo1.presentationTimeUs, mediaCodec$BufferInfo1.flags);
            }
            else if(v1 == -2) {
                this.h = (MediaFormat)this.g.remove();
            }
            return v1;
        }
    }

    public void e() {
        synchronized(this.a) {
            ++this.l;
            this.c.post(() -> synchronized(this.a) {
                if(this.m) {
                    return;
                }
                long v1 = this.l - 1L;
                this.l = v1;
                if(v1 > 0L) {
                    return;
                }
                if(v1 < 0L) {
                    this.o(new IllegalStateException());
                    return;
                }
                this.f();
            });
        }
    }

    @GuardedBy("lock")
    private void f() {
        if(!this.g.isEmpty()) {
            this.i = (MediaFormat)this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
    }

    public MediaFormat g() {
        synchronized(this.a) {
            MediaFormat mediaFormat0 = this.h;
            if(mediaFormat0 != null) {
                return mediaFormat0;
            }
        }
        throw new IllegalStateException();
    }

    public void h(MediaCodec mediaCodec0) {
        Assertions.i(this.c == null);
        this.b.start();
        Handler handler0 = new Handler(this.b.getLooper());
        mediaCodec0.setCallback(this, handler0);
        this.c = handler0;
    }

    @GuardedBy("lock")
    private boolean i() {
        return this.l > 0L || this.m;
    }

    @GuardedBy("lock")
    private void j() {
        this.k();
        this.m();
        this.l();
    }

    @GuardedBy("lock")
    private void k() {
        IllegalStateException illegalStateException0 = this.n;
        if(illegalStateException0 == null) {
            return;
        }
        this.n = null;
        throw illegalStateException0;
    }

    @GuardedBy("lock")
    private void l() {
        MediaCodec.CryptoException mediaCodec$CryptoException0 = this.k;
        if(mediaCodec$CryptoException0 == null) {
            return;
        }
        this.k = null;
        throw mediaCodec$CryptoException0;
    }

    @GuardedBy("lock")
    private void m() {
        MediaCodec.CodecException mediaCodec$CodecException0 = this.j;
        if(mediaCodec$CodecException0 == null) {
            return;
        }
        this.j = null;
        throw mediaCodec$CodecException0;
    }

    // 检测为 Lambda 实现
    private void n() [...]

    private void o(IllegalStateException illegalStateException0) {
        synchronized(this.a) {
            this.n = illegalStateException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public void onCryptoError(MediaCodec mediaCodec0, MediaCodec.CryptoException mediaCodec$CryptoException0) {
        synchronized(this.a) {
            this.k = mediaCodec$CryptoException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public void onError(MediaCodec mediaCodec0, MediaCodec.CodecException mediaCodec$CodecException0) {
        synchronized(this.a) {
            this.j = mediaCodec$CodecException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec0, int v) {
        synchronized(this.a) {
            this.d.b(v);
            OnBufferAvailableListener mediaCodecAdapter$OnBufferAvailableListener0 = this.o;
            if(mediaCodecAdapter$OnBufferAvailableListener0 != null) {
                mediaCodecAdapter$OnBufferAvailableListener0.a();
            }
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec0, int v, MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.a) {
            MediaFormat mediaFormat0 = this.i;
            if(mediaFormat0 != null) {
                this.b(mediaFormat0);
                this.i = null;
            }
            this.e.b(v);
            this.f.add(mediaCodec$BufferInfo0);
            OnBufferAvailableListener mediaCodecAdapter$OnBufferAvailableListener0 = this.o;
            if(mediaCodecAdapter$OnBufferAvailableListener0 != null) {
                mediaCodecAdapter$OnBufferAvailableListener0.b();
            }
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        synchronized(this.a) {
            this.b(mediaFormat0);
            this.i = null;
        }
    }

    public void p(OnBufferAvailableListener mediaCodecAdapter$OnBufferAvailableListener0) {
        synchronized(this.a) {
            this.o = mediaCodecAdapter$OnBufferAvailableListener0;
        }
    }

    public void q() {
        synchronized(this.a) {
            this.m = true;
            this.b.quit();
            this.f();
        }
    }
}

