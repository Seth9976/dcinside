package androidx.media3.exoplayer.audio;

import O1.g;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Y0;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.base.z;

@UnstableApi
public abstract class DecoderAudioRenderer extends BaseRenderer implements MediaClock {
    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        public static void a(AudioSink audioSink0, @Nullable Object object0) {
            audioSink0.u(((AudioDeviceInfo)object0));
        }
    }

    final class AudioSinkListener implements Listener {
        final DecoderAudioRenderer a;

        private AudioSinkListener() {
        }

        AudioSinkListener(androidx.media3.exoplayer.audio.DecoderAudioRenderer.1 decoderAudioRenderer$10) {
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void a(long v) {
            DecoderAudioRenderer.this.r.H(v);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void b(AudioTrackConfig audioSink$AudioTrackConfig0) {
            DecoderAudioRenderer.this.r.o(audioSink$AudioTrackConfig0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void c(AudioTrackConfig audioSink$AudioTrackConfig0) {
            DecoderAudioRenderer.this.r.p(audioSink$AudioTrackConfig0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void d(boolean z) {
            DecoderAudioRenderer.this.r.I(z);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void e(Exception exception0) {
            Log.e("DecoderAudioRenderer", "Audio sink error", exception0);
            DecoderAudioRenderer.this.r.n(exception0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void f() {
            DecoderAudioRenderer.this.O = true;
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void g(int v, long v1, long v2) {
            DecoderAudioRenderer.this.r.J(v, v1, v2);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void h() {
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void i() {
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void j() {
            DecoderAudioRenderer.this.r0();
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void k() {
        }
    }

    @Nullable
    private DecoderInputBuffer A;
    @Nullable
    private SimpleDecoderOutputBuffer B;
    @Nullable
    private DrmSession C;
    @Nullable
    private DrmSession D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private boolean I;
    private boolean J;
    private boolean K;
    private long L;
    private final long[] M;
    private int N;
    private boolean O;
    private static final String P = "DecoderAudioRenderer";
    private static final int Q = 0;
    private static final int X = 1;
    private static final int Y = 2;
    private static final int Z = 10;
    private final EventDispatcher r;
    private final AudioSink s;
    private final DecoderInputBuffer t;
    private DecoderCounters u;
    private Format v;
    private int w;
    private int x;
    private boolean y;
    @Nullable
    private Decoder z;

    public DecoderAudioRenderer() {
        this(null, null, new AudioProcessor[0]);
    }

    public DecoderAudioRenderer(@Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioCapabilities audioCapabilities0, AudioProcessor[] arr_audioProcessor) {
        this(handler0, audioRendererEventListener0, new Builder().j(((AudioCapabilities)z.a(audioCapabilities0, AudioCapabilities.e))).m(arr_audioProcessor).i());
    }

    public DecoderAudioRenderer(@Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioSink audioSink0) {
        super(1);
        this.r = new EventDispatcher(handler0, audioRendererEventListener0);
        this.s = audioSink0;
        audioSink0.f(new AudioSinkListener(this, null));
        this.t = DecoderInputBuffer.u();
        this.E = 0;
        this.G = true;
        this.w0(0x8000000000000001L);
        this.M = new long[10];
    }

    public DecoderAudioRenderer(@Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioProcessor[] arr_audioProcessor) {
        this(handler0, audioRendererEventListener0, null, arr_audioProcessor);
    }

    private void A0() {
        boolean z = this.b();
        long v = this.s.z(z);
        if(v != 0x8000000000000000L) {
            if(!this.I) {
                v = Math.max(this.H, v);
            }
            this.H = v;
            this.I = false;
        }
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public long D() {
        if(this.getState() == 2) {
            this.A0();
        }
        return this.H;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.v = null;
        this.G = true;
        this.w0(0x8000000000000001L);
        this.O = false;
        try {
            this.x0(null);
            this.u0();
            this.s.reset();
        }
        finally {
            this.r.s(this.u);
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
        DecoderCounters decoderCounters0 = new DecoderCounters();
        this.u = decoderCounters0;
        this.r.t(decoderCounters0);
        if(this.J().b) {
            this.s.p();
        }
        else {
            this.s.i();
        }
        PlayerId playerId0 = this.N();
        this.s.A(playerId0);
        Clock clock0 = this.I();
        this.s.s(clock0);
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) throws ExoPlaybackException {
        this.s.flush();
        this.H = v;
        this.O = false;
        this.I = true;
        this.J = false;
        this.K = false;
        if(this.z != null) {
            this.l0();
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void Y() {
        this.s.c();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void Z() {
        this.A0();
        this.s.pause();
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format0) {
        int v = 0;
        if(!MimeTypes.q(format0.n)) {
            return 0x80;
        }
        int v1 = this.z0(format0);
        if(v1 <= 2) {
            return Y0.c(v1);
        }
        if(Util.a >= 21) {
            v = 0x20;
        }
        return Y0.d(v1, 8, v);
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        super.a0(arr_format, v, v1, mediaSource$MediaPeriodId0);
        this.y = false;
        if(this.L == 0x8000000000000001L) {
            this.w0(v1);
            return;
        }
        int v2 = this.N;
        if(v2 == this.M.length) {
            Log.n("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.M[this.N - 1]);
        }
        else {
            this.N = v2 + 1;
        }
        this.M[this.N - 1] = v1;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.K && this.s.b();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) throws ExoPlaybackException {
        if(this.K) {
            try {
                this.s.x();
                return;
            }
            catch(WriteException audioSink$WriteException0) {
                throw this.H(audioSink$WriteException0, audioSink$WriteException0.c, audioSink$WriteException0.b, 5002);
            }
        }
        if(this.v == null) {
            FormatHolder formatHolder0 = this.K();
            this.t.f();
            int v2 = this.c0(formatHolder0, this.t, 2);
            if(v2 == -5) {
                this.q0(formatHolder0);
                goto label_20;
            }
            if(v2 == -4) {
                Assertions.i(this.t.j());
                this.J = true;
                try {
                    this.s0();
                    return;
                }
                catch(WriteException audioSink$WriteException1) {
                    throw this.G(audioSink$WriteException1, null, 5002);
                }
            }
            return;
        }
    label_20:
        this.p0();
        if(this.z != null) {
            try {
                TraceUtil.a("drainAndFeed");
                while(true) {
                    if(!this.j0()) {
                        while(true) {
                            if(!this.k0()) {
                                TraceUtil.b();
                                return;
                            }
                        }
                    }
                }
            }
            catch(DecoderException decoderException0) {
                Log.e("DecoderAudioRenderer", "Audio codec error", decoderException0);
                this.r.m(decoderException0);
                throw this.G(decoderException0, this.v, 4003);
            }
            catch(ConfigurationException audioSink$ConfigurationException0) {
                throw this.G(audioSink$ConfigurationException0, audioSink$ConfigurationException0.a, 5001);
            }
            catch(InitializationException audioSink$InitializationException0) {
                throw this.H(audioSink$InitializationException0, audioSink$InitializationException0.c, audioSink$InitializationException0.b, 5001);
            }
            catch(WriteException audioSink$WriteException2) {
                throw this.H(audioSink$WriteException2, audioSink$WriteException2.c, audioSink$WriteException2.b, 5002);
            }
        }
    }

    @g
    protected DecoderReuseEvaluation h0(String s, Format format0, Format format1) {
        return new DecoderReuseEvaluation(s, format0, format1, 0, 1);
    }

    @g
    protected abstract Decoder i0(Format arg1, @Nullable CryptoConfig arg2) throws DecoderException;

    // 去混淆评级： 低(30)
    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.s.v() || this.v != null && (this.Q() || this.B != null);
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public boolean j() {
        boolean z = this.O;
        this.O = false;
        return z;
    }

    private boolean j0() throws ExoPlaybackException, DecoderException, ConfigurationException, InitializationException, WriteException {
        if(this.B == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer0 = (SimpleDecoderOutputBuffer)this.z.a();
            this.B = simpleDecoderOutputBuffer0;
            if(simpleDecoderOutputBuffer0 == null) {
                return false;
            }
            int v = simpleDecoderOutputBuffer0.c;
            if(v > 0) {
                this.u.f += v;
                this.s.C();
            }
            if(this.B.k()) {
                this.t0();
            }
        }
        if(this.B.j()) {
            if(this.E == 2) {
                this.u0();
                this.p0();
                this.G = true;
                return false;
            }
            this.B.p();
            this.B = null;
            try {
                this.s0();
                return false;
            }
            catch(WriteException audioSink$WriteException0) {
                throw this.H(audioSink$WriteException0, audioSink$WriteException0.c, audioSink$WriteException0.b, 5002);
            }
        }
        if(this.G) {
            Format format0 = this.n0(this.z).a().V(this.w).W(this.x).h0(this.v.k).T(this.v.l).a0(this.v.a).c0(this.v.b).d0(this.v.c).e0(this.v.d).q0(this.v.e).m0(this.v.f).K();
            this.s.n(format0, 0, null);
            this.G = false;
        }
        if(this.s.w(this.B.f, this.B.b, 1)) {
            ++this.u.e;
            this.B.p();
            this.B = null;
            return true;
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
        switch(v) {
            case 2: {
                this.s.o(((float)(((Float)object0))));
                break;
            }
            case 3: {
                this.s.e(((AudioAttributes)object0));
                return;
            }
            case 6: {
                this.s.j(((AuxEffectInfo)object0));
                return;
            }
            case 9: {
                this.s.r(((Boolean)object0).booleanValue());
                return;
            }
            case 10: {
                this.s.k(((int)(((Integer)object0))));
                return;
            }
            case 12: {
                if(Util.a >= 23) {
                    Api23.a(this.s, object0);
                    return;
                }
                break;
            }
            default: {
                super.k(v, object0);
            }
        }
    }

    private boolean k0() throws DecoderException, ExoPlaybackException {
        Decoder decoder0 = this.z;
        if(decoder0 != null && this.E != 2 && !this.J) {
            if(this.A == null) {
                DecoderInputBuffer decoderInputBuffer0 = (DecoderInputBuffer)decoder0.d();
                this.A = decoderInputBuffer0;
                if(decoderInputBuffer0 == null) {
                    return false;
                }
            }
            if(this.E == 1) {
                this.A.n(4);
                this.z.b(this.A);
                this.A = null;
                this.E = 2;
                return false;
            }
            FormatHolder formatHolder0 = this.K();
            switch(this.c0(formatHolder0, this.A, 0)) {
                case -5: {
                    this.q0(formatHolder0);
                    return true;
                }
                case -4: {
                    if(this.A.j()) {
                        this.J = true;
                        this.z.b(this.A);
                        this.A = null;
                        return false;
                    }
                    if(!this.y) {
                        this.y = true;
                        this.A.e(0x8000000);
                    }
                    this.A.s();
                    this.A.b = this.v;
                    this.z.b(this.A);
                    this.F = true;
                    ++this.u.c;
                    this.A = null;
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

    @Override  // androidx.media3.exoplayer.MediaClock
    public void l(PlaybackParameters playbackParameters0) {
        this.s.l(playbackParameters0);
    }

    private void l0() throws ExoPlaybackException {
        if(this.E != 0) {
            this.u0();
            this.p0();
            return;
        }
        this.A = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer0 = this.B;
        if(simpleDecoderOutputBuffer0 != null) {
            simpleDecoderOutputBuffer0.p();
            this.B = null;
        }
        Decoder decoder0 = (Decoder)Assertions.g(this.z);
        decoder0.flush();
        decoder0.c(this.M());
        this.F = false;
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters m() {
        return this.s.m();
    }

    @g
    @Nullable
    protected int[] m0(Decoder decoder0) [...] // Inlined contents

    @g
    protected abstract Format n0(Decoder arg1);

    protected final int o0(Format format0) {
        return this.s.q(format0);
    }

    private void p0() throws ExoPlaybackException {
        CryptoConfig cryptoConfig0;
        if(this.z != null) {
            return;
        }
        this.v0(this.D);
        DrmSession drmSession0 = this.C;
        if(drmSession0 == null) {
            cryptoConfig0 = null;
        }
        else {
            cryptoConfig0 = drmSession0.b();
            if(cryptoConfig0 == null && this.C.getError() == null) {
                return;
            }
        }
        try {
            long v = SystemClock.elapsedRealtime();
            TraceUtil.a("createAudioDecoder");
            Decoder decoder0 = this.i0(this.v, cryptoConfig0);
            this.z = decoder0;
            decoder0.c(this.M());
            TraceUtil.b();
            long v1 = SystemClock.elapsedRealtime();
            String s = this.z.getName();
            this.r.q(s, v1, v1 - v);
            ++this.u.a;
        }
        catch(DecoderException decoderException0) {
            Log.e("DecoderAudioRenderer", "Audio codec error", decoderException0);
            this.r.m(decoderException0);
            throw this.G(decoderException0, this.v, 4001);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            throw this.G(outOfMemoryError0, this.v, 4001);
        }
    }

    private void q0(FormatHolder formatHolder0) throws ExoPlaybackException {
        Object object0 = Assertions.g(formatHolder0.b);
        this.x0(formatHolder0.a);
        Format format0 = this.v;
        this.v = (Format)object0;
        this.w = ((Format)object0).E;
        this.x = ((Format)object0).F;
        Decoder decoder0 = this.z;
        if(decoder0 == null) {
            this.p0();
            this.r.u(this.v, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation0 = this.D == this.C ? this.h0(decoder0.getName(), format0, ((Format)object0)) : new DecoderReuseEvaluation(decoder0.getName(), format0, ((Format)object0), 0, 0x80);
        if(decoderReuseEvaluation0.d == 0) {
            if(this.F) {
                this.E = 1;
            }
            else {
                this.u0();
                this.p0();
                this.G = true;
            }
        }
        this.r.u(this.v, decoderReuseEvaluation0);
    }

    @g
    @CallSuper
    protected void r0() {
        this.I = true;
    }

    private void s0() throws WriteException {
        this.K = true;
        this.s.x();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    @Nullable
    public MediaClock t() {
        return this;
    }

    private void t0() {
        this.s.C();
        if(this.N != 0) {
            this.w0(this.M[0]);
            int v = this.N - 1;
            this.N = v;
            System.arraycopy(this.M, 1, this.M, 0, v);
        }
    }

    private void u0() {
        this.A = null;
        this.B = null;
        this.E = 0;
        this.F = false;
        Decoder decoder0 = this.z;
        if(decoder0 != null) {
            ++this.u.b;
            decoder0.release();
            String s = this.z.getName();
            this.r.r(s);
            this.z = null;
        }
        this.v0(null);
    }

    private void v0(@Nullable DrmSession drmSession0) {
        i.b(this.C, drmSession0);
        this.C = drmSession0;
    }

    private void w0(long v) {
        this.L = v;
        if(v != 0x8000000000000001L) {
            this.s.B(v);
        }
    }

    private void x0(@Nullable DrmSession drmSession0) {
        i.b(this.D, drmSession0);
        this.D = drmSession0;
    }

    protected final boolean y0(Format format0) {
        return this.s.a(format0);
    }

    @g
    protected abstract int z0(Format arg1);

    class androidx.media3.exoplayer.audio.DecoderAudioRenderer.1 {
    }

}

