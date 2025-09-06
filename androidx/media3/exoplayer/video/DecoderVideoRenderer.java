package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;

@UnstableApi
public abstract class DecoderVideoRenderer extends BaseRenderer {
    @Nullable
    private VideoDecoderOutputBuffer A;
    private int B;
    @Nullable
    private Object C;
    @Nullable
    private Surface D;
    @Nullable
    private VideoDecoderOutputBufferRenderer E;
    @Nullable
    private VideoFrameMetadataListener F;
    @Nullable
    private DrmSession G;
    @Nullable
    private DrmSession H;
    private int I;
    private boolean J;
    private int K;
    private long L;
    private long M;
    private int M8;
    private boolean N;
    private long N8;
    private boolean O;
    private long O8;
    private boolean P;
    protected DecoderCounters P8;
    @Nullable
    private VideoSize Q;
    private static final String Q8 = "DecoderVideoRenderer";
    private static final int R8 = 0;
    private static final int S8 = 1;
    private static final int T8 = 2;
    private long X;
    private int Y;
    private int Z;
    private final long r;
    private final int s;
    private final EventDispatcher t;
    private final TimedValueQueue u;
    private final DecoderInputBuffer v;
    @Nullable
    private Format w;
    @Nullable
    private Format x;
    @Nullable
    private Decoder y;
    @Nullable
    private DecoderInputBuffer z;

    protected DecoderVideoRenderer(long v, @Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0, int v1) {
        super(2);
        this.r = v;
        this.s = v1;
        this.M = 0x8000000000000001L;
        this.u = new TimedValueQueue();
        this.v = DecoderInputBuffer.u();
        this.t = new EventDispatcher(handler0, videoRendererEventListener0);
        this.I = 0;
        this.B = -1;
        this.K = 0;
        this.P8 = new DecoderCounters();
    }

    @CallSuper
    protected void A0(long v) {
        --this.M8;
    }

    protected void B0(DecoderInputBuffer decoderInputBuffer0) {
    }

    private boolean C0(long v, long v1) throws ExoPlaybackException, DecoderException {
        if(this.L == 0x8000000000000001L) {
            this.L = v;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer0 = (VideoDecoderOutputBuffer)Assertions.g(this.A);
        long v2 = videoDecoderOutputBuffer0.b;
        long v3 = v2 - v;
        if(!this.l0()) {
            if(DecoderVideoRenderer.m0(v3)) {
                this.P0(videoDecoderOutputBuffer0);
                return true;
            }
            return false;
        }
        Format format0 = (Format)this.u.j(v2);
        if(format0 != null) {
            this.x = format0;
        }
        else if(this.x == null) {
            this.x = (Format)this.u.i();
        }
        long v4 = v2 - this.O8;
        if(this.N0(v3)) {
            this.E0(videoDecoderOutputBuffer0, v4, ((Format)Assertions.g(this.x)));
            return true;
        }
        if(this.getState() != 2 || v == this.L || this.L0(v3, v1) && this.p0(v)) {
            return false;
        }
        if(this.M0(v3, v1)) {
            this.i0(videoDecoderOutputBuffer0);
            return true;
        }
        if(v3 < 30000L) {
            this.E0(videoDecoderOutputBuffer0, v4, ((Format)Assertions.g(this.x)));
            return true;
        }
        return false;
    }

    @CallSuper
    protected void D0() {
        this.z = null;
        this.A = null;
        this.I = 0;
        this.J = false;
        this.M8 = 0;
        Decoder decoder0 = this.y;
        if(decoder0 != null) {
            ++this.P8.b;
            decoder0.release();
            String s = this.y.getName();
            this.t.l(s);
            this.y = null;
        }
        this.G0(null);
    }

    protected void E0(VideoDecoderOutputBuffer videoDecoderOutputBuffer0, long v, Format format0) throws DecoderException {
        VideoFrameMetadataListener videoFrameMetadataListener0 = this.F;
        if(videoFrameMetadataListener0 != null) {
            videoFrameMetadataListener0.l(v, this.I().nanoTime(), format0, null);
        }
        this.N8 = Util.F1(SystemClock.elapsedRealtime());
        boolean z = videoDecoderOutputBuffer0.f == 0 && this.E != null;
        if(!z && (videoDecoderOutputBuffer0.f != 1 || this.D == null)) {
            this.i0(videoDecoderOutputBuffer0);
            return;
        }
        this.t0(videoDecoderOutputBuffer0.h, videoDecoderOutputBuffer0.i);
        if(z) {
            ((VideoDecoderOutputBufferRenderer)Assertions.g(this.E)).setOutputBuffer(videoDecoderOutputBuffer0);
        }
        else {
            this.F0(videoDecoderOutputBuffer0, ((Surface)Assertions.g(this.D)));
        }
        this.Z = 0;
        ++this.P8.e;
        this.s0();
    }

    protected abstract void F0(VideoDecoderOutputBuffer arg1, Surface arg2) throws DecoderException;

    private void G0(@Nullable DrmSession drmSession0) {
        i.b(this.G, drmSession0);
        this.G = drmSession0;
    }

    protected abstract void H0(int arg1);

    private void I0() {
        this.M = this.r <= 0L ? 0x8000000000000001L : SystemClock.elapsedRealtime() + this.r;
    }

    protected final void J0(@Nullable Object object0) {
        if(object0 instanceof Surface) {
            this.D = (Surface)object0;
            this.E = null;
            this.B = 1;
        }
        else if(object0 instanceof VideoDecoderOutputBufferRenderer) {
            this.D = null;
            this.E = (VideoDecoderOutputBufferRenderer)object0;
            this.B = 0;
        }
        else {
            this.D = null;
            this.E = null;
            this.B = -1;
            object0 = null;
        }
        if(this.C != object0) {
            this.C = object0;
            if(object0 != null) {
                if(this.y != null) {
                    this.H0(this.B);
                }
                this.x0();
                return;
            }
            this.y0();
            return;
        }
        if(object0 != null) {
            this.z0();
        }
    }

    private void K0(@Nullable DrmSession drmSession0) {
        i.b(this.H, drmSession0);
        this.H = drmSession0;
    }

    protected boolean L0(long v, long v1) {
        return DecoderVideoRenderer.n0(v);
    }

    protected boolean M0(long v, long v1) {
        return DecoderVideoRenderer.m0(v);
    }

    private boolean N0(long v) {
        boolean z = this.getState() == 2;
        int v1 = this.K;
        switch(v1) {
            case 0: {
                return z;
            }
            case 1: {
                return true;
            }
            default: {
                if(v1 != 3) {
                    throw new IllegalStateException();
                }
                return z && this.O0(v, Util.F1(SystemClock.elapsedRealtime()) - this.N8);
            }
        }
    }

    protected boolean O0(long v, long v1) {
        return DecoderVideoRenderer.m0(v) && v1 > 100000L;
    }

    protected void P0(VideoDecoderOutputBuffer videoDecoderOutputBuffer0) {
        ++this.P8.f;
        videoDecoderOutputBuffer0.p();
    }

    protected void Q0(int v, int v1) {
        this.P8.h += v;
        int v2 = v + v1;
        this.P8.g += v2;
        this.Y += v2;
        int v3 = this.Z + v2;
        this.Z = v3;
        this.P8.i = Math.max(v3, this.P8.i);
        if(this.s > 0 && this.Y >= this.s) {
            this.r0();
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.w = null;
        this.Q = null;
        this.o0(0);
        try {
            this.K0(null);
            this.D0();
        }
        finally {
            this.t.m(this.P8);
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
        DecoderCounters decoderCounters0 = new DecoderCounters();
        this.P8 = decoderCounters0;
        this.t.o(decoderCounters0);
        this.K = z1;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) throws ExoPlaybackException {
        this.O = false;
        this.P = false;
        this.o0(1);
        this.L = 0x8000000000000001L;
        this.Z = 0;
        if(this.y != null) {
            this.k0();
        }
        if(z) {
            this.I0();
        }
        else {
            this.M = 0x8000000000000001L;
        }
        this.u.c();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void Y() {
        this.Y = 0;
        this.X = SystemClock.elapsedRealtime();
        this.N8 = Util.F1(SystemClock.elapsedRealtime());
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void Z() {
        this.M = 0x8000000000000001L;
        this.r0();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        this.O8 = v1;
        super.a0(arr_format, v, v1, mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.P;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) throws ExoPlaybackException {
        if(this.P) {
            return;
        }
        if(this.w == null) {
            FormatHolder formatHolder0 = this.K();
            this.v.f();
            int v2 = this.c0(formatHolder0, this.v, 2);
            if(v2 == -5) {
                this.w0(formatHolder0);
                goto label_14;
            }
            if(v2 == -4) {
                Assertions.i(this.v.j());
                this.O = true;
                this.P = true;
            }
            return;
        }
    label_14:
        this.q0();
        if(this.y != null) {
            try {
                TraceUtil.a("drainAndFeed");
                while(true) {
                    if(!this.h0(v, v1)) {
                        while(true) {
                            if(!this.j0()) {
                                TraceUtil.b();
                                return;
                            }
                        }
                    }
                }
            }
            catch(DecoderException decoderException0) {
                Log.e("DecoderVideoRenderer", "Video codec error", decoderException0);
                this.t.C(decoderException0);
                throw this.G(decoderException0, this.w, 4003);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void f() {
        if(this.K == 0) {
            this.K = 1;
        }
    }

    protected DecoderReuseEvaluation f0(String s, Format format0, Format format1) {
        return new DecoderReuseEvaluation(s, format0, format1, 0, 1);
    }

    protected abstract Decoder g0(Format arg1, @Nullable CryptoConfig arg2) throws DecoderException;

    private boolean h0(long v, long v1) throws ExoPlaybackException, DecoderException {
        if(this.A == null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer0 = (VideoDecoderOutputBuffer)((Decoder)Assertions.g(this.y)).a();
            this.A = videoDecoderOutputBuffer0;
            if(videoDecoderOutputBuffer0 == null) {
                return false;
            }
            this.P8.f += videoDecoderOutputBuffer0.c;
            this.M8 -= videoDecoderOutputBuffer0.c;
        }
        if(this.A.j()) {
            if(this.I == 2) {
                this.D0();
                this.q0();
                return false;
            }
            this.A.p();
            this.A = null;
            this.P = true;
            return false;
        }
        boolean z = this.C0(v, v1);
        if(z) {
            this.A0(((VideoDecoderOutputBuffer)Assertions.g(this.A)).b);
            this.A = null;
        }
        return z;
    }

    protected void i0(VideoDecoderOutputBuffer videoDecoderOutputBuffer0) {
        this.Q0(0, 1);
        videoDecoderOutputBuffer0.p();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if(this.w != null && (this.Q() || this.A != null) && (this.K == 3 || !this.l0())) {
            this.M = 0x8000000000000001L;
            return true;
        }
        if(this.M == 0x8000000000000001L) {
            return false;
        }
        if(SystemClock.elapsedRealtime() < this.M) {
            return true;
        }
        this.M = 0x8000000000000001L;
        return false;
    }

    private boolean j0() throws DecoderException, ExoPlaybackException {
        Decoder decoder0 = this.y;
        if(decoder0 != null && this.I != 2 && !this.O) {
            if(this.z == null) {
                DecoderInputBuffer decoderInputBuffer0 = (DecoderInputBuffer)decoder0.d();
                this.z = decoderInputBuffer0;
                if(decoderInputBuffer0 == null) {
                    return false;
                }
            }
            DecoderInputBuffer decoderInputBuffer1 = (DecoderInputBuffer)Assertions.g(this.z);
            if(this.I == 1) {
                decoderInputBuffer1.n(4);
                ((Decoder)Assertions.g(this.y)).b(decoderInputBuffer1);
                this.z = null;
                this.I = 2;
                return false;
            }
            FormatHolder formatHolder0 = this.K();
            switch(this.c0(formatHolder0, decoderInputBuffer1, 0)) {
                case -5: {
                    this.w0(formatHolder0);
                    return true;
                }
                case -4: {
                    if(decoderInputBuffer1.j()) {
                        this.O = true;
                        ((Decoder)Assertions.g(this.y)).b(decoderInputBuffer1);
                        this.z = null;
                        return false;
                    }
                    if(this.N) {
                        long v = decoderInputBuffer1.f;
                        Format format0 = (Format)Assertions.g(this.w);
                        this.u.a(v, format0);
                        this.N = false;
                    }
                    decoderInputBuffer1.s();
                    decoderInputBuffer1.b = this.w;
                    ((Decoder)Assertions.g(this.y)).b(decoderInputBuffer1);
                    ++this.M8;
                    this.J = true;
                    ++this.P8.c;
                    this.z = null;
                    return true;
                }
                case -3: {
                    return false;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
        switch(v) {
            case 1: {
                this.J0(object0);
                return;
            }
            case 7: {
                this.F = (VideoFrameMetadataListener)object0;
                return;
            }
            default: {
                super.k(v, object0);
            }
        }
    }

    @CallSuper
    protected void k0() throws ExoPlaybackException {
        this.M8 = 0;
        if(this.I != 0) {
            this.D0();
            this.q0();
            return;
        }
        this.z = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer0 = this.A;
        if(videoDecoderOutputBuffer0 != null) {
            videoDecoderOutputBuffer0.p();
            this.A = null;
        }
        Decoder decoder0 = (Decoder)Assertions.g(this.y);
        decoder0.flush();
        decoder0.c(this.M());
        this.J = false;
    }

    private boolean l0() {
        return this.B != -1;
    }

    private static boolean m0(long v) {
        return v < -30000L;
    }

    private static boolean n0(long v) {
        return v < -500000L;
    }

    private void o0(int v) {
        this.K = Math.min(this.K, v);
    }

    protected boolean p0(long v) throws ExoPlaybackException {
        int v1 = this.e0(v);
        if(v1 == 0) {
            return false;
        }
        ++this.P8.j;
        this.Q0(v1, this.M8);
        this.k0();
        return true;
    }

    private void q0() throws ExoPlaybackException {
        CryptoConfig cryptoConfig0;
        if(this.y != null) {
            return;
        }
        this.G0(this.H);
        DrmSession drmSession0 = this.G;
        if(drmSession0 == null) {
            cryptoConfig0 = null;
        }
        else {
            cryptoConfig0 = drmSession0.b();
            if(cryptoConfig0 == null && this.G.getError() == null) {
                return;
            }
        }
        try {
            long v = SystemClock.elapsedRealtime();
            Decoder decoder0 = this.g0(((Format)Assertions.g(this.w)), cryptoConfig0);
            this.y = decoder0;
            decoder0.c(this.M());
            this.H0(this.B);
            long v1 = SystemClock.elapsedRealtime();
            String s = ((Decoder)Assertions.g(this.y)).getName();
            this.t.k(s, v1, v1 - v);
            ++this.P8.a;
        }
        catch(DecoderException decoderException0) {
            Log.e("DecoderVideoRenderer", "Video codec error", decoderException0);
            this.t.C(decoderException0);
            throw this.G(decoderException0, this.w, 4001);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            throw this.G(outOfMemoryError0, this.w, 4001);
        }
    }

    private void r0() {
        if(this.Y > 0) {
            long v = SystemClock.elapsedRealtime();
            this.t.n(this.Y, v - this.X);
            this.Y = 0;
            this.X = v;
        }
    }

    private void s0() {
        if(this.K != 3) {
            this.K = 3;
            Object object0 = this.C;
            if(object0 != null) {
                this.t.A(object0);
            }
        }
    }

    private void t0(int v, int v1) {
        if(this.Q == null || this.Q.a != v || this.Q.b != v1) {
            VideoSize videoSize0 = new VideoSize(v, v1);
            this.Q = videoSize0;
            this.t.D(videoSize0);
        }
    }

    private void u0() {
        if(this.K == 3) {
            Object object0 = this.C;
            if(object0 != null) {
                this.t.A(object0);
            }
        }
    }

    private void v0() {
        VideoSize videoSize0 = this.Q;
        if(videoSize0 != null) {
            this.t.D(videoSize0);
        }
    }

    @CallSuper
    protected void w0(FormatHolder formatHolder0) throws ExoPlaybackException {
        this.N = true;
        Object object0 = Assertions.g(formatHolder0.b);
        this.K0(formatHolder0.a);
        Format format0 = this.w;
        this.w = (Format)object0;
        Decoder decoder0 = this.y;
        if(decoder0 == null) {
            this.q0();
            Format format1 = (Format)Assertions.g(this.w);
            this.t.p(format1, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation0 = this.H == this.G ? this.f0(decoder0.getName(), ((Format)Assertions.g(format0)), ((Format)object0)) : new DecoderReuseEvaluation(decoder0.getName(), ((Format)Assertions.g(format0)), ((Format)object0), 0, 0x80);
        if(decoderReuseEvaluation0.d == 0) {
            if(this.J) {
                this.I = 1;
            }
            else {
                this.D0();
                this.q0();
            }
        }
        Format format2 = (Format)Assertions.g(this.w);
        this.t.p(format2, decoderReuseEvaluation0);
    }

    private void x0() {
        this.v0();
        this.o0(1);
        if(this.getState() == 2) {
            this.I0();
        }
    }

    private void y0() {
        this.Q = null;
        this.o0(1);
    }

    private void z0() {
        this.v0();
        this.u0();
    }
}

