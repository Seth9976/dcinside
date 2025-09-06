package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer.InsufficientCapacityException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer.WakeupListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession.DrmSessionException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.extractor.OpusUtil;
import h4.m;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

@UnstableApi
public abstract class MediaCodecRenderer extends BaseRenderer {
    @RequiresApi(21)
    static final class Api21 {
        @DoNotInline
        public static boolean a(MediaCodecAdapter mediaCodecAdapter0, MediaCodecRendererCodecAdapterListener mediaCodecRenderer$MediaCodecRendererCodecAdapterListener0) {
            return mediaCodecAdapter0.j(mediaCodecRenderer$MediaCodecRendererCodecAdapterListener0);
        }
    }

    @RequiresApi(0x1F)
    static final class Api31 {
        @DoNotInline
        public static void a(Configuration mediaCodecAdapter$Configuration0, PlayerId playerId0) {
            LogSessionId logSessionId0 = playerId0.a();
            if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                String s = logSessionId0.getStringId();
                mediaCodecAdapter$Configuration0.b.setString("log-session-id", s);
            }
        }
    }

    public static class DecoderInitializationException extends Exception {
        @Nullable
        public final String a;
        public final boolean b;
        @Nullable
        public final MediaCodecInfo c;
        @Nullable
        public final String d;
        @Nullable
        public final DecoderInitializationException e;
        private static final int f = -50000;
        private static final int g = 0xFFFF3CB1;
        private static final int h = 0xFFFF3CB2;

        public DecoderInitializationException(Format format0, @Nullable Throwable throwable0, boolean z, int v) {
            String s = DecoderInitializationException.b(v);
            this("Decoder init failed: [" + v + "], " + format0, throwable0, format0.n, z, null, s, null);
        }

        public DecoderInitializationException(Format format0, @Nullable Throwable throwable0, boolean z, MediaCodecInfo mediaCodecInfo0) {
            String s = Util.a < 21 ? null : DecoderInitializationException.d(throwable0);
            this("Decoder init failed: " + mediaCodecInfo0.a + ", " + format0, throwable0, format0.n, z, mediaCodecInfo0, s, null);
        }

        private DecoderInitializationException(@Nullable String s, @Nullable Throwable throwable0, @Nullable String s1, boolean z, @Nullable MediaCodecInfo mediaCodecInfo0, @Nullable String s2, @Nullable DecoderInitializationException mediaCodecRenderer$DecoderInitializationException0) {
            super(s, throwable0);
            this.a = s1;
            this.b = z;
            this.c = mediaCodecInfo0;
            this.d = s2;
            this.e = mediaCodecRenderer$DecoderInitializationException0;
        }

        // 去混淆评级： 中等(80)
        private static String b(int v) {
            return v >= 0 ? "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + Math.abs(v) : "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(v);
        }

        @CheckResult
        private DecoderInitializationException c(DecoderInitializationException mediaCodecRenderer$DecoderInitializationException0) {
            return new DecoderInitializationException(this.getMessage(), this.getCause(), this.a, this.b, this.c, this.d, mediaCodecRenderer$DecoderInitializationException0);
        }

        // 去混淆评级： 低(20)
        @Nullable
        @RequiresApi(21)
        private static String d(@Nullable Throwable throwable0) {
            return throwable0 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)throwable0).getDiagnosticInfo() : null;
        }
    }

    final class MediaCodecRendererCodecAdapterListener implements OnBufferAvailableListener {
        final MediaCodecRenderer a;

        private MediaCodecRendererCodecAdapterListener() {
        }

        MediaCodecRendererCodecAdapterListener(androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.1 mediaCodecRenderer$10) {
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$OnBufferAvailableListener
        public void a() {
            if(MediaCodecRenderer.this.G != null) {
                MediaCodecRenderer.this.G.b();
            }
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$OnBufferAvailableListener
        public void b() {
            if(MediaCodecRenderer.this.G != null) {
                MediaCodecRenderer.this.G.b();
            }
        }
    }

    static final class OutputStreamInfo {
        public final long a;
        public final long b;
        public final long c;
        public final TimedValueQueue d;
        public static final OutputStreamInfo e;

        static {
            OutputStreamInfo.e = new OutputStreamInfo(0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L);
        }

        public OutputStreamInfo(long v, long v1, long v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = new TimedValueQueue();
        }
    }

    private final ArrayDeque A;
    private static final long A9 = 1000L;
    private final OggOpusAudioPacketizer B;
    private static final int B9 = 0;
    @Nullable
    private Format C;
    private static final int C9 = 1;
    @Nullable
    private Format D;
    private static final int D9 = 2;
    @Nullable
    private DrmSession E;
    private static final int E9 = 0;
    @Nullable
    private DrmSession F;
    private static final int F9 = 1;
    @Nullable
    private WakeupListener G;
    private static final int G9 = 2;
    @Nullable
    private MediaCrypto H;
    private static final int H9 = 0;
    private long I;
    private static final int I9 = 1;
    private float J;
    private static final int J9 = 2;
    private float K;
    private static final int K9 = 3;
    @Nullable
    private MediaCodecAdapter L;
    private static final int L9 = 0;
    @Nullable
    private Format M;
    private boolean M8;
    private static final int M9 = 1;
    @Nullable
    private MediaFormat N;
    private boolean N8;
    private static final int N9 = 2;
    private boolean O;
    private boolean O8;
    private static final byte[] O9 = null;
    private float P;
    private boolean P8;
    private static final int P9 = 0x20;
    @Nullable
    private ArrayDeque Q;
    private boolean Q8;
    private boolean R8;
    private boolean S8;
    private boolean T8;
    private boolean U8;
    private boolean V8;
    private boolean W8;
    @Nullable
    private DecoderInitializationException X;
    private long X8;
    @Nullable
    private MediaCodecInfo Y;
    private int Y8;
    private int Z;
    private int Z8;
    @Nullable
    private ByteBuffer a9;
    private boolean b9;
    private boolean c9;
    private boolean d9;
    private boolean e9;
    private boolean f9;
    private boolean g9;
    private int h9;
    private int i9;
    private int j9;
    private boolean k9;
    private boolean l9;
    private boolean m9;
    private long n9;
    private long o9;
    private boolean p9;
    private boolean q9;
    private final Factory r;
    private boolean r9;
    private final MediaCodecSelector s;
    private boolean s9;
    private final boolean t;
    @Nullable
    private ExoPlaybackException t9;
    private final float u;
    protected DecoderCounters u9;
    private final DecoderInputBuffer v;
    private OutputStreamInfo v9;
    private final DecoderInputBuffer w;
    private long w9;
    private final DecoderInputBuffer x;
    private boolean x9;
    private final BatchBuffer y;
    protected static final float y9 = -1.0f;
    private final MediaCodec.BufferInfo z;
    private static final String z9 = "MediaCodecRenderer";

    static {
        MediaCodecRenderer.O9 = new byte[]{0, 0, 1, 103, 66, (byte)0xC0, 11, -38, 37, (byte)0x90, 0, 0, 1, 104, -50, 15, 19, 0x20, 0, 0, 1, 101, -120, (byte)0x84, 13, -50, 0x71, 24, (byte)0xA0, 0, 0x2F, -65, 28, 49, -61, 39, 93, 120};
    }

    public MediaCodecRenderer(int v, Factory mediaCodecAdapter$Factory0, MediaCodecSelector mediaCodecSelector0, boolean z, float f) {
        super(v);
        this.r = mediaCodecAdapter$Factory0;
        this.s = (MediaCodecSelector)Assertions.g(mediaCodecSelector0);
        this.t = z;
        this.u = f;
        this.v = DecoderInputBuffer.u();
        this.w = new DecoderInputBuffer(0);
        this.x = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer0 = new BatchBuffer();
        this.y = batchBuffer0;
        this.z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = 0x8000000000000001L;
        this.A = new ArrayDeque();
        this.v9 = OutputStreamInfo.e;
        batchBuffer0.r(0);
        batchBuffer0.d.order(ByteOrder.nativeOrder());
        this.B = new OggOpusAudioPacketizer();
        this.P = -1.0f;
        this.Z = 0;
        this.h9 = 0;
        this.Y8 = -1;
        this.Z8 = -1;
        this.X8 = 0x8000000000000001L;
        this.n9 = 0x8000000000000001L;
        this.o9 = 0x8000000000000001L;
        this.w9 = 0x8000000000000001L;
        this.i9 = 0;
        this.j9 = 0;
        this.u9 = new DecoderCounters();
    }

    protected final boolean A0() throws ExoPlaybackException {
        boolean z = this.B0();
        if(z) {
            this.e1();
        }
        return z;
    }

    private void A1() {
        this.Z8 = -1;
        this.a9 = null;
    }

    protected boolean B0() {
        if(this.L == null) {
            return false;
        }
        int v = this.j9;
        if(v != 3 && !this.N8 && (!this.O8 || this.m9) && (!this.P8 || !this.l9)) {
            if(v == 2) {
                Assertions.i(Util.a >= 23);
                if(Util.a >= 23) {
                    try {
                        this.P1();
                    }
                    catch(ExoPlaybackException exoPlaybackException0) {
                        Log.o("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", exoPlaybackException0);
                        this.v1();
                        return true;
                    }
                }
            }
            this.z0();
            return false;
        }
        this.v1();
        return true;
    }

    private void B1(@Nullable DrmSession drmSession0) {
        i.b(this.E, drmSession0);
        this.E = drmSession0;
    }

    private List C0(boolean z) throws DecoderQueryException {
        Format format0 = (Format)Assertions.g(this.C);
        List list0 = this.K0(this.s, format0, z);
        if(list0.isEmpty() && z) {
            list0 = this.K0(this.s, format0, false);
            if(!list0.isEmpty()) {
                Log.n("MediaCodecRenderer", "Drm session requires secure decoder for " + format0.n + ", but no secure decoder available. Trying to proceed with " + list0 + ".");
            }
        }
        return list0;
    }

    private void C1(OutputStreamInfo mediaCodecRenderer$OutputStreamInfo0) {
        this.v9 = mediaCodecRenderer$OutputStreamInfo0;
        long v = mediaCodecRenderer$OutputStreamInfo0.c;
        if(v != 0x8000000000000001L) {
            this.x9 = true;
            this.l1(v);
        }
    }

    @Nullable
    protected final MediaCodecAdapter D0() {
        return this.L;
    }

    protected final void D1() {
        this.s9 = true;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void E(float f, float f1) throws ExoPlaybackException {
        this.J = f;
        this.K = f1;
        this.O1(this.M);
    }

    protected int E0(DecoderInputBuffer decoderInputBuffer0) {
        return 0;
    }

    protected final void E1(ExoPlaybackException exoPlaybackException0) {
        this.t9 = exoPlaybackException0;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public final int F() {
        return 8;
    }

    @Nullable
    protected final MediaCodecInfo F0() {
        return this.Y;
    }

    public void F1(long v) {
        this.I = v;
    }

    protected boolean G0() {
        return false;
    }

    private void G1(@Nullable DrmSession drmSession0) {
        i.b(this.F, drmSession0);
        this.F = drmSession0;
    }

    protected float H0() {
        return this.P;
    }

    private boolean H1(long v) {
        return this.I == 0x8000000000000001L || this.I().elapsedRealtime() - v < this.I;
    }

    protected float I0(float f, Format format0, Format[] arr_format) {
        return -1.0f;
    }

    protected boolean I1(MediaCodecInfo mediaCodecInfo0) {
        return true;
    }

    @Nullable
    protected final MediaFormat J0() {
        return this.N;
    }

    protected boolean J1() [...] // Inlined contents

    protected abstract List K0(MediaCodecSelector arg1, Format arg2, boolean arg3) throws DecoderQueryException;

    protected boolean K1(Format format0) {
        return false;
    }

    protected long L0(boolean z, long v, long v1) {
        return super.z(v, v1);
    }

    protected abstract int L1(MediaCodecSelector arg1, Format arg2) throws DecoderQueryException;

    protected long M0() {
        return this.o9;
    }

    protected static boolean M1(Format format0) {
        return format0.K == 0 || format0.K == 2;
    }

    protected abstract Configuration N0(MediaCodecInfo arg1, Format arg2, @Nullable MediaCrypto arg3, float arg4);

    protected final boolean N1() throws ExoPlaybackException {
        return this.O1(this.M);
    }

    protected final long O0() {
        return this.v9.c;
    }

    private boolean O1(@Nullable Format format0) throws ExoPlaybackException {
        if(Util.a < 23) {
            return true;
        }
        if(this.L != null && this.j9 != 3 && this.getState() != 0) {
            float f = this.I0(this.K, ((Format)Assertions.g(format0)), this.O());
            float f1 = this.P;
            if(f1 == f) {
                return true;
            }
            if(f == -1.0f) {
                this.u0();
                return false;
            }
            if(f1 == -1.0f && f <= this.u) {
                return true;
            }
            Bundle bundle0 = new Bundle();
            bundle0.putFloat("operating-rate", f);
            ((MediaCodecAdapter)Assertions.g(this.L)).a(bundle0);
            this.P = f;
        }
        return true;
    }

    protected final long P0() {
        return this.v9.b;
    }

    @RequiresApi(23)
    private void P1() throws ExoPlaybackException {
        CryptoConfig cryptoConfig0 = ((DrmSession)Assertions.g(this.F)).b();
        if(cryptoConfig0 instanceof FrameworkCryptoConfig) {
            try {
                ((MediaCrypto)Assertions.g(this.H)).setMediaDrmSession(((FrameworkCryptoConfig)cryptoConfig0).b);
            }
            catch(MediaCryptoException mediaCryptoException0) {
                throw this.G(mediaCryptoException0, this.C, 6006);
            }
        }
        this.B1(this.F);
        this.i9 = 0;
        this.j9 = 0;
    }

    protected float Q0() {
        return this.J;
    }

    protected final void Q1(long v) throws ExoPlaybackException {
        Format format0 = (Format)this.v9.d.j(v);
        if(format0 == null && this.x9 && this.N != null) {
            format0 = (Format)this.v9.d.i();
        }
        if(format0 != null) {
            this.D = format0;
            this.k1(((Format)Assertions.g(this.D)), this.N);
            this.O = false;
            this.x9 = false;
        }
        else if(this.O && this.D != null) {
            this.k1(((Format)Assertions.g(this.D)), this.N);
            this.O = false;
            this.x9 = false;
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.C = null;
        this.C1(OutputStreamInfo.e);
        this.A.clear();
        this.B0();
    }

    @Nullable
    protected final WakeupListener R0() {
        return this.G;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
        this.u9 = new DecoderCounters();
    }

    protected void S0(DecoderInputBuffer decoderInputBuffer0) throws ExoPlaybackException {
    }

    private boolean T0() {
        return this.Z8 >= 0;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) throws ExoPlaybackException {
        this.p9 = false;
        this.q9 = false;
        this.s9 = false;
        if(this.d9) {
            this.y.f();
            this.x.f();
            this.e9 = false;
            this.B.d();
        }
        else {
            this.A0();
        }
        if(this.v9.d.l() > 0) {
            this.r9 = true;
        }
        this.v9.d.c();
        this.A.clear();
    }

    private boolean U0() {
        if(!this.y.C()) {
            return true;
        }
        long v = this.M();
        return this.a1(v, this.y.A()) == this.a1(v, this.x.f);
    }

    private void V0(Format format0) {
        this.s0();
        if("audio/mp4a-latm".equals(format0.n) || "audio/mpeg".equals(format0.n) || "audio/opus".equals(format0.n)) {
            this.y.D(0x20);
        }
        else {
            this.y.D(1);
        }
        this.d9 = true;
    }

    private void W0(MediaCodecInfo mediaCodecInfo0, @Nullable MediaCrypto mediaCrypto0) throws Exception {
        boolean z = false;
        Format format0 = (Format)Assertions.g(this.C);
        String s = mediaCodecInfo0.a;
        int v = Util.a;
        float f = -1.0f;
        float f1 = v >= 23 ? this.I0(this.K, format0, this.O()) : -1.0f;
        if(f1 > this.u) {
            f = f1;
        }
        this.p1(format0);
        long v1 = this.I().elapsedRealtime();
        Configuration mediaCodecAdapter$Configuration0 = this.N0(mediaCodecInfo0, format0, mediaCrypto0, f);
        if(v >= 0x1F) {
            Api31.a(mediaCodecAdapter$Configuration0, this.N());
        }
        try {
            TraceUtil.a(("createCodec:" + s));
            MediaCodecAdapter mediaCodecAdapter0 = this.r.a(mediaCodecAdapter$Configuration0);
            this.L = mediaCodecAdapter0;
            this.W8 = v >= 21 && Api21.a(mediaCodecAdapter0, new MediaCodecRendererCodecAdapterListener(this, null));
        }
        finally {
            TraceUtil.b();
        }
        long v3 = this.I().elapsedRealtime();
        if(!mediaCodecInfo0.o(format0)) {
            Log.n("MediaCodecRenderer", Util.S("Format exceeds selected codec\'s capabilities [%s, %s]", new Object[]{Format.l(format0), s}));
        }
        this.Y = mediaCodecInfo0;
        this.P = f;
        this.M = format0;
        this.Z = this.j0(s);
        this.M8 = MediaCodecRenderer.k0(s, ((Format)Assertions.g(this.M)));
        this.N8 = MediaCodecRenderer.p0(s);
        this.O8 = MediaCodecRenderer.q0(s);
        this.P8 = MediaCodecRenderer.m0(s);
        this.Q8 = MediaCodecRenderer.n0(s);
        this.R8 = MediaCodecRenderer.l0(s);
        this.S8 = false;
        this.V8 = MediaCodecRenderer.o0(mediaCodecInfo0) || this.G0();
        if(((MediaCodecAdapter)Assertions.g(this.L)).e()) {
            this.g9 = true;
            this.h9 = 1;
            if(this.Z != 0) {
                z = true;
            }
            this.T8 = z;
        }
        if(this.getState() == 2) {
            this.X8 = this.I().elapsedRealtime() + 1000L;
        }
        ++this.u9.a;
        this.h1(s, mediaCodecAdapter$Configuration0, v3, v3 - v1);
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void X() {
        try {
            this.s0();
            this.v1();
        }
        finally {
            this.G1(null);
        }
    }

    @m({"this.codecDrmSession"})
    private boolean X0() throws ExoPlaybackException {
        Assertions.i(this.H == null);
        DrmSession drmSession0 = this.E;
        CryptoConfig cryptoConfig0 = drmSession0.b();
        if(FrameworkCryptoConfig.d && cryptoConfig0 instanceof FrameworkCryptoConfig) {
            switch(drmSession0.getState()) {
                case 1: {
                    DrmSessionException drmSession$DrmSessionException0 = (DrmSessionException)Assertions.g(drmSession0.getError());
                    throw this.G(drmSession$DrmSessionException0, this.C, drmSession$DrmSessionException0.a);
                }
                case 4: {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        if(cryptoConfig0 == null) {
            return drmSession0.getError() != null;
        }
        if(cryptoConfig0 instanceof FrameworkCryptoConfig) {
            FrameworkCryptoConfig frameworkCryptoConfig0 = (FrameworkCryptoConfig)cryptoConfig0;
            try {
                this.H = new MediaCrypto(frameworkCryptoConfig0.a, frameworkCryptoConfig0.b);
                return true;
            }
            catch(MediaCryptoException mediaCryptoException0) {
                throw this.G(mediaCryptoException0, this.C, 6006);
            }
        }
        return true;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void Y() {
    }

    protected final boolean Y0() {
        return this.d9;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void Z() {
    }

    protected final boolean Z0(Format format0) {
        return this.F == null && this.K1(format0);
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format0) throws ExoPlaybackException {
        try {
            return this.L1(this.s, format0);
        }
        catch(DecoderQueryException mediaCodecUtil$DecoderQueryException0) {
            throw this.G(mediaCodecUtil$DecoderQueryException0, format0, 4002);
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        if(this.v9.c == 0x8000000000000001L) {
            this.C1(new OutputStreamInfo(0x8000000000000001L, v, v1));
            return;
        }
        if(!this.A.isEmpty() || this.n9 != 0x8000000000000001L && (this.w9 == 0x8000000000000001L || this.w9 < this.n9)) {
            OutputStreamInfo mediaCodecRenderer$OutputStreamInfo0 = new OutputStreamInfo(this.n9, v, v1);
            this.A.add(mediaCodecRenderer$OutputStreamInfo0);
        }
        else {
            this.C1(new OutputStreamInfo(0x8000000000000001L, v, v1));
            if(this.v9.c != 0x8000000000000001L) {
                this.n1();
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean a1(long v, long v1) {
        return v1 < v && (this.D == null || !Objects.equals(this.D.n, "audio/opus") || !OpusUtil.g(v, v1));
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.q9;
    }

    private static boolean b1(IllegalStateException illegalStateException0) {
        if(Util.a >= 21 && MediaCodecRenderer.c1(illegalStateException0)) {
            return true;
        }
        StackTraceElement[] arr_stackTraceElement = illegalStateException0.getStackTrace();
        return arr_stackTraceElement.length > 0 && arr_stackTraceElement[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi(21)
    private static boolean c1(IllegalStateException illegalStateException0) {
        return illegalStateException0 instanceof MediaCodec.CodecException;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) throws ExoPlaybackException {
        boolean z = false;
        if(this.s9) {
            this.s9 = false;
            this.q1();
        }
        ExoPlaybackException exoPlaybackException0 = this.t9;
        if(exoPlaybackException0 == null) {
            try {
                if(this.q9) {
                    this.w1();
                    return;
                }
                if(this.C == null && !this.t1(2)) {
                    return;
                }
                this.e1();
                if(!this.d9) {
                    if(this.L == null) {
                        DecoderCounters decoderCounters0 = this.u9;
                        decoderCounters0.d += this.e0(v);
                        this.t1(1);
                        return;
                    }
                    long v2 = this.I().elapsedRealtime();
                    TraceUtil.a("drainAndFeed");
                    while(true) {
                        if(!this.w0(v, v1) || !this.H1(v2)) {
                            while(true) {
                                if(!this.y0() || !this.H1(v2)) {
                                    TraceUtil.b();
                                    return;
                                }
                            }
                        }
                    }
                }
                TraceUtil.a("bypassRender");
                while(true) {
                    if(!this.h0(v, v1)) {
                        TraceUtil.b();
                        return;
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
            }
            if(!MediaCodecRenderer.b1(illegalStateException0)) {
                throw illegalStateException0;
            }
            this.g1(illegalStateException0);
            if(Util.a >= 21 && MediaCodecRenderer.d1(illegalStateException0)) {
                z = true;
                this.v1();
            }
            MediaCodecDecoderException mediaCodecDecoderException0 = this.r0(illegalStateException0, this.F0());
            throw this.H(mediaCodecDecoderException0, this.C, z, (mediaCodecDecoderException0.c == 1101 ? 4006 : 4003));
        }
        this.t9 = null;
        throw exoPlaybackException0;
    }

    // 去混淆评级： 低(20)
    @RequiresApi(21)
    private static boolean d1(IllegalStateException illegalStateException0) {
        return illegalStateException0 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)illegalStateException0).isRecoverable() : false;
    }

    protected final void e1() throws ExoPlaybackException {
        if(this.L == null && !this.d9) {
            Format format0 = this.C;
            if(format0 != null) {
                if(this.Z0(format0)) {
                    this.V0(format0);
                    return;
                }
                this.B1(this.F);
                if(this.E == null || this.X0()) {
                    try {
                        boolean z = this.E != null && this.E.h(((String)Assertions.k(format0.n)));
                        this.f1(this.H, z);
                        goto label_13;
                    }
                    catch(DecoderInitializationException mediaCodecRenderer$DecoderInitializationException0) {
                    }
                    throw this.G(mediaCodecRenderer$DecoderInitializationException0, format0, 4001);
                }
            label_13:
                MediaCrypto mediaCrypto0 = this.H;
                if(mediaCrypto0 != null && this.L == null) {
                    mediaCrypto0.release();
                    this.H = null;
                }
            }
        }
    }

    private void f1(@Nullable MediaCrypto mediaCrypto0, boolean z) throws DecoderInitializationException {
        Format format0 = (Format)Assertions.g(this.C);
        if(this.Q == null) {
            try {
                List list0 = this.C0(z);
                ArrayDeque arrayDeque0 = new ArrayDeque();
                this.Q = arrayDeque0;
                if(this.t) {
                    arrayDeque0.addAll(list0);
                }
                else if(!list0.isEmpty()) {
                    this.Q.add(((MediaCodecInfo)list0.get(0)));
                }
                this.X = null;
                goto label_14;
            }
            catch(DecoderQueryException mediaCodecUtil$DecoderQueryException0) {
            }
            throw new DecoderInitializationException(format0, mediaCodecUtil$DecoderQueryException0, z, 0xFFFF3CB2);
        }
    label_14:
        if(this.Q.isEmpty()) {
            throw new DecoderInitializationException(format0, null, z, 0xFFFF3CB1);
        }
        ArrayDeque arrayDeque1 = (ArrayDeque)Assertions.g(this.Q);
        while(this.L == null) {
            MediaCodecInfo mediaCodecInfo0 = (MediaCodecInfo)Assertions.g(((MediaCodecInfo)arrayDeque1.peekFirst()));
            if(!this.I1(mediaCodecInfo0)) {
                return;
            }
            try {
                this.W0(mediaCodecInfo0, mediaCrypto0);
            }
            catch(Exception exception0) {
                Log.o("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfo0, exception0);
                arrayDeque1.removeFirst();
                DecoderInitializationException mediaCodecRenderer$DecoderInitializationException0 = new DecoderInitializationException(format0, exception0, z, mediaCodecInfo0);
                this.g1(mediaCodecRenderer$DecoderInitializationException0);
                this.X = this.X == null ? mediaCodecRenderer$DecoderInitializationException0 : this.X.c(mediaCodecRenderer$DecoderInitializationException0);
                if(arrayDeque1.isEmpty()) {
                    throw this.X;
                }
                if(false) {
                    break;
                }
            }
        }
        this.Q = null;
    }

    private void g0() throws ExoPlaybackException {
        Assertions.i(!this.p9);
        FormatHolder formatHolder0 = this.K();
        this.x.f();
        do {
            this.x.f();
            switch(this.c0(formatHolder0, this.x, 0)) {
                case -5: {
                    this.j1(formatHolder0);
                    return;
                }
                case -4: {
                    if(this.x.j()) {
                        this.p9 = true;
                        this.o9 = this.n9;
                        return;
                    }
                    this.n9 = Math.max(this.n9, this.x.f);
                    if(this.h() || this.w.m()) {
                        this.o9 = this.n9;
                    }
                    if(this.r9) {
                        Format format0 = (Format)Assertions.g(this.C);
                        this.D = format0;
                        if(Objects.equals(format0.n, "audio/opus") && !this.D.q.isEmpty()) {
                            int v = OpusUtil.f(((byte[])this.D.q.get(0)));
                            this.D = ((Format)Assertions.g(this.D)).a().V(v).K();
                        }
                        this.k1(this.D, null);
                        this.r9 = false;
                    }
                    this.x.s();
                    if(this.D != null && Objects.equals(this.D.n, "audio/opus")) {
                        if(this.x.i()) {
                            this.x.b = this.D;
                            this.S0(this.x);
                        }
                        if(OpusUtil.g(this.M(), this.x.f)) {
                            List list0 = ((Format)Assertions.g(this.D)).q;
                            this.B.a(this.x, list0);
                        }
                    }
                    break;
                }
                case -3: {
                    if(this.h()) {
                        this.o9 = this.n9;
                    }
                    return;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        while(this.U0() && this.y.w(this.x));
        this.e9 = true;
    }

    protected void g1(Exception exception0) {
    }

    private boolean h0(long v, long v1) throws ExoPlaybackException {
        Assertions.i(!this.q9);
        if(this.y.C()) {
            if(this.r1(v, v1, null, this.y.d, this.Z8, 0, this.y.B(), this.y.z(), this.a1(this.M(), this.y.A()), this.y.j(), ((Format)Assertions.g(this.D)))) {
                this.m1(this.y.A());
                this.y.f();
                goto label_7;
            }
            return false;
        }
    label_7:
        if(this.p9) {
            this.q9 = true;
            return false;
        }
        if(this.e9) {
            Assertions.i(this.y.w(this.x));
            this.e9 = false;
        }
        if(this.f9) {
            if(this.y.C()) {
                return true;
            }
            this.s0();
            this.f9 = false;
            this.e1();
            if(!this.d9) {
                return false;
            }
        }
        this.g0();
        if(this.y.C()) {
            this.y.s();
        }
        return this.y.C() || this.p9 || this.f9;
    }

    protected void h1(String s, Configuration mediaCodecAdapter$Configuration0, long v, long v1) {
    }

    protected DecoderReuseEvaluation i0(MediaCodecInfo mediaCodecInfo0, Format format0, Format format1) {
        return new DecoderReuseEvaluation(mediaCodecInfo0.a, format0, format1, 0, 1);
    }

    protected void i1(String s) {
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.C != null && (this.Q() || this.T0() || this.X8 != 0x8000000000000001L && this.I().elapsedRealtime() < this.X8);
    }

    // 去混淆评级： 低(27)
    private int j0(String s) {
        int v = Util.a;
        if(v <= 25 && "OMX.Exynos.avc.dec.secure".equals(s) && (Util.d.startsWith("SM-T585") || Util.d.startsWith("SM-A510") || Util.d.startsWith("SM-A520") || Util.d.startsWith("SM-J700"))) {
            return 2;
        }
        return v >= 24 || !"OMX.Nvidia.h264.decode".equals(s) && !"OMX.Nvidia.h264.decode.secure".equals(s) || !"flounder".equals(Util.b) && !"flounder_lte".equals(Util.b) && !"grouper".equals(Util.b) && !"tilapia".equals(Util.b) ? 0 : 1;
    }

    @CallSuper
    @Nullable
    protected DecoderReuseEvaluation j1(FormatHolder formatHolder0) throws ExoPlaybackException {
        int v1;
        boolean z = true;
        this.r9 = true;
        Format format0 = (Format)Assertions.g(formatHolder0.b);
        String s = format0.n;
        if(s == null) {
            throw this.G(new IllegalArgumentException("Sample MIME type is null."), format0, 4005);
        }
        if(Objects.equals(s, "video/av01") && !format0.q.isEmpty()) {
            format0 = format0.a().b0(null).K();
        }
        this.G1(formatHolder0.a);
        this.C = format0;
        if(this.d9) {
            this.f9 = true;
            return null;
        }
        MediaCodecAdapter mediaCodecAdapter0 = this.L;
        if(mediaCodecAdapter0 == null) {
            this.Q = null;
            this.e1();
            return null;
        }
        MediaCodecInfo mediaCodecInfo0 = (MediaCodecInfo)Assertions.g(this.Y);
        Object object0 = Assertions.g(this.M);
        if(this.x0(mediaCodecInfo0, format0, this.E, this.F)) {
            this.u0();
            return new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 0x80);
        }
        boolean z1 = this.F != this.E;
        Assertions.i(!z1 || Util.a >= 23);
        DecoderReuseEvaluation decoderReuseEvaluation0 = this.i0(mediaCodecInfo0, ((Format)object0), format0);
        int v = decoderReuseEvaluation0.d;
        if(v == 0) {
            this.u0();
            v1 = 0;
        }
        else {
            v1 = 16;
            switch(v) {
                case 1: {
                    if(this.O1(format0)) {
                        this.M = format0;
                        if(z1) {
                            if(!this.v0()) {
                                return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 2);
                            }
                        }
                        else if(!this.t0()) {
                            return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 2);
                        }
                        return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 0);
                    }
                    break;
                }
                case 2: {
                    if(this.O1(format0)) {
                        this.g9 = true;
                        this.h9 = 1;
                        if(this.Z != 2 && (this.Z != 1 || format0.t != ((Format)object0).t || format0.u != ((Format)object0).u)) {
                            z = false;
                        }
                        this.T8 = z;
                        this.M = format0;
                        if(z1 && !this.v0()) {
                            return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 2);
                        }
                        return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 0);
                    }
                    break;
                }
                case 3: {
                    if(this.O1(format0)) {
                        this.M = format0;
                        if(z1 && !this.v0()) {
                            return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 2);
                        }
                        return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, 0);
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return decoderReuseEvaluation0.d == 0 || this.L == mediaCodecAdapter0 && this.j9 != 3 ? decoderReuseEvaluation0 : new DecoderReuseEvaluation(mediaCodecInfo0.a, ((Format)object0), format0, 0, v1);
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
        if(v == 11) {
            this.G = (WakeupListener)object0;
            return;
        }
        super.k(v, object0);
    }

    // 去混淆评级： 低(20)
    private static boolean k0(String s, Format format0) {
        return Util.a < 21 && format0.q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(s);
    }

    protected void k1(Format format0, @Nullable MediaFormat mediaFormat0) throws ExoPlaybackException {
    }

    // 去混淆评级： 中等(80)
    private static boolean l0(String s) {
        return Util.a < 21 && "OMX.SEC.mp3.dec".equals(s) && "samsung".equals(Util.c) && (Util.b.startsWith("baffin") || Util.b.startsWith("grand") || Util.b.startsWith("fortuna") || Util.b.startsWith("gprimelte") || Util.b.startsWith("j2y18lte") || Util.b.startsWith("ms01"));
    }

    protected void l1(long v) {
    }

    // 去混淆评级： 中等(60)
    private static boolean m0(String s) {
        return Util.a <= 23 && "OMX.google.vorbis.decoder".equals(s) || Util.a == 19 && (("hb2000".equals(Util.b) || "stvm8".equals(Util.b)) && ("OMX.amlogic.avc.decoder.awesome".equals(s) || "OMX.amlogic.avc.decoder.awesome.secure".equals(s)));
    }

    @CallSuper
    protected void m1(long v) {
        this.w9 = v;
        while(!this.A.isEmpty() && v >= ((OutputStreamInfo)this.A.peek()).a) {
            this.C1(((OutputStreamInfo)Assertions.g(((OutputStreamInfo)this.A.poll()))));
            this.n1();
        }
    }

    private static boolean n0(String s) {
        return Util.a == 21 && "OMX.google.aac.decoder".equals(s);
    }

    protected void n1() {
    }

    // 去混淆评级： 中等(120)
    private static boolean o0(MediaCodecInfo mediaCodecInfo0) {
        return Util.a <= 25 && "OMX.rk.video_decoder.avc".equals(mediaCodecInfo0.a) || Util.a <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(mediaCodecInfo0.a) || "OMX.broadcom.video_decoder.tunnel.secure".equals(mediaCodecInfo0.a) || "OMX.bcm.vdec.avc.tunnel".equals(mediaCodecInfo0.a) || "OMX.bcm.vdec.avc.tunnel.secure".equals(mediaCodecInfo0.a) || "OMX.bcm.vdec.hevc.tunnel".equals(mediaCodecInfo0.a) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(mediaCodecInfo0.a)) || "Amazon".equals(Util.c) && "AFTS".equals(Util.d) && mediaCodecInfo0.g;
    }

    protected void o1(DecoderInputBuffer decoderInputBuffer0) throws ExoPlaybackException {
    }

    // 去混淆评级： 低(30)
    private static boolean p0(String s) {
        return Util.a == 19 && Util.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(s) || "OMX.Exynos.avc.dec.secure".equals(s));
    }

    protected void p1(Format format0) throws ExoPlaybackException {
    }

    private static boolean q0(String s) {
        return Util.a == 29 && "c2.android.aac.decoder".equals(s);
    }

    @TargetApi(23)
    private void q1() throws ExoPlaybackException {
        switch(this.j9) {
            case 1: {
                this.z0();
                return;
            }
            case 2: {
                this.z0();
                this.P1();
                return;
            }
            case 3: {
                this.u1();
                return;
            }
            default: {
                this.q9 = true;
                this.w1();
            }
        }
    }

    protected MediaCodecDecoderException r0(Throwable throwable0, @Nullable MediaCodecInfo mediaCodecInfo0) {
        return new MediaCodecDecoderException(throwable0, mediaCodecInfo0);
    }

    protected abstract boolean r1(long arg1, long arg2, @Nullable MediaCodecAdapter arg3, @Nullable ByteBuffer arg4, int arg5, int arg6, int arg7, long arg8, boolean arg9, boolean arg10, Format arg11) throws ExoPlaybackException;

    private void s0() {
        this.f9 = false;
        this.y.f();
        this.x.f();
        this.e9 = false;
        this.d9 = false;
        this.B.d();
    }

    private void s1() {
        this.m9 = true;
        MediaFormat mediaFormat0 = ((MediaCodecAdapter)Assertions.g(this.L)).l();
        if(this.Z != 0 && mediaFormat0.getInteger("width") == 0x20 && mediaFormat0.getInteger("height") == 0x20) {
            this.U8 = true;
            return;
        }
        if(this.S8) {
            mediaFormat0.setInteger("channel-count", 1);
        }
        this.N = mediaFormat0;
        this.O = true;
    }

    private boolean t0() {
        if(this.k9) {
            this.i9 = 1;
            if(!this.N8 && !this.P8) {
                this.j9 = 1;
                return true;
            }
            this.j9 = 3;
            return false;
        }
        return true;
    }

    private boolean t1(int v) throws ExoPlaybackException {
        FormatHolder formatHolder0 = this.K();
        this.v.f();
        int v1 = this.c0(formatHolder0, this.v, v | 4);
        if(v1 == -5) {
            this.j1(formatHolder0);
            return true;
        }
        if(v1 == -4 && this.v.j()) {
            this.p9 = true;
            this.q1();
        }
        return false;
    }

    private void u0() throws ExoPlaybackException {
        if(this.k9) {
            this.i9 = 1;
            this.j9 = 3;
            return;
        }
        this.u1();
    }

    private void u1() throws ExoPlaybackException {
        this.v1();
        this.e1();
    }

    @TargetApi(23)
    private boolean v0() throws ExoPlaybackException {
        if(this.k9) {
            this.i9 = 1;
            if(!this.N8 && !this.P8) {
                this.j9 = 2;
                return true;
            }
            this.j9 = 3;
            return false;
        }
        this.P1();
        return true;
    }

    protected void v1() {
        try {
            MediaCodecAdapter mediaCodecAdapter0 = this.L;
            if(mediaCodecAdapter0 != null) {
                mediaCodecAdapter0.release();
                ++this.u9.b;
                this.i1(((MediaCodecInfo)Assertions.g(this.Y)).a);
            }
        }
        catch(Throwable throwable0) {
            try {
                this.L = null;
                MediaCrypto mediaCrypto0 = this.H;
                if(mediaCrypto0 != null) {
                    mediaCrypto0.release();
                }
            }
            throw throwable0;
        }
        finally {
            this.H = null;
            this.B1(null);
            this.y1();
        }
        this.L = null;
        MediaCrypto mediaCrypto1 = this.H;
        if(mediaCrypto1 != null) {
            mediaCrypto1.release();
        }
    }

    private boolean w0(long v, long v1) throws ExoPlaybackException {
        boolean z;
        int v2;
        MediaCodecAdapter mediaCodecAdapter0 = (MediaCodecAdapter)Assertions.g(this.L);
        if(!this.T0()) {
            if(!this.Q8 || !this.l9) {
                v2 = mediaCodecAdapter0.h(this.z);
            }
            else {
                try {
                    v2 = mediaCodecAdapter0.h(this.z);
                }
                catch(IllegalStateException unused_ex) {
                    this.q1();
                    if(this.q9) {
                        this.v1();
                    }
                    return false;
                }
            }
            if(v2 < 0) {
                if(v2 == -2) {
                    this.s1();
                    return true;
                }
                if(this.V8 && (this.p9 || this.i9 == 2)) {
                    this.q1();
                }
                return false;
            }
            if(this.U8) {
                this.U8 = false;
                mediaCodecAdapter0.i(v2, false);
                return true;
            }
            if(this.z.size == 0 && (this.z.flags & 4) != 0) {
                this.q1();
                return false;
            }
            this.Z8 = v2;
            ByteBuffer byteBuffer0 = mediaCodecAdapter0.p(v2);
            this.a9 = byteBuffer0;
            if(byteBuffer0 != null) {
                byteBuffer0.position(this.z.offset);
                this.a9.limit(this.z.offset + this.z.size);
            }
            if(this.R8) {
                MediaCodec.BufferInfo mediaCodec$BufferInfo0 = this.z;
                if(mediaCodec$BufferInfo0.presentationTimeUs == 0L && (mediaCodec$BufferInfo0.flags & 4) != 0 && this.n9 != 0x8000000000000001L) {
                    mediaCodec$BufferInfo0.presentationTimeUs = this.o9;
                }
            }
            this.b9 = this.z.presentationTimeUs < this.M();
            this.c9 = this.o9 != 0x8000000000000001L && this.o9 <= this.z.presentationTimeUs;
            this.Q1(this.z.presentationTimeUs);
        }
        if(!this.Q8 || !this.l9) {
            z = this.r1(v, v1, mediaCodecAdapter0, this.a9, this.Z8, this.z.flags, 1, this.z.presentationTimeUs, this.b9, this.c9, ((Format)Assertions.g(this.D)));
        }
        else {
            try {
                z = this.r1(v, v1, mediaCodecAdapter0, this.a9, this.Z8, this.z.flags, 1, this.z.presentationTimeUs, this.b9, this.c9, ((Format)Assertions.g(this.D)));
            }
            catch(IllegalStateException unused_ex) {
                this.q1();
                if(this.q9) {
                    this.v1();
                }
                return false;
            }
        }
        if(z) {
            this.m1(this.z.presentationTimeUs);
            boolean z1 = (this.z.flags & 4) != 0;
            this.A1();
            if(!z1) {
                return true;
            }
            this.q1();
        }
        return false;
    }

    protected void w1() throws ExoPlaybackException {
    }

    private boolean x0(MediaCodecInfo mediaCodecInfo0, Format format0, @Nullable DrmSession drmSession0, @Nullable DrmSession drmSession1) throws ExoPlaybackException {
        if(drmSession0 == drmSession1) {
            return false;
        }
        if(drmSession1 != null && drmSession0 != null) {
            CryptoConfig cryptoConfig0 = drmSession1.b();
            if(cryptoConfig0 == null) {
                return true;
            }
            CryptoConfig cryptoConfig1 = drmSession0.b();
            if(cryptoConfig1 != null && cryptoConfig0.getClass().equals(cryptoConfig1.getClass())) {
                if(!(cryptoConfig0 instanceof FrameworkCryptoConfig)) {
                    return false;
                }
                if(!drmSession1.e().equals(drmSession0.e())) {
                    return true;
                }
                return Util.a >= 23 ? C.k2.equals(drmSession0.e()) || C.k2.equals(drmSession1.e()) || !mediaCodecInfo0.g && drmSession1.h(((String)Assertions.g(format0.n))) : true;
            }
        }
        return true;
    }

    @CallSuper
    protected void x1() {
        this.z1();
        this.A1();
        this.X8 = 0x8000000000000001L;
        this.l9 = false;
        this.k9 = false;
        this.T8 = false;
        this.U8 = false;
        this.b9 = false;
        this.c9 = false;
        this.n9 = 0x8000000000000001L;
        this.o9 = 0x8000000000000001L;
        this.w9 = 0x8000000000000001L;
        this.i9 = 0;
        this.j9 = 0;
        this.h9 = this.g9;
    }

    private boolean y0() throws ExoPlaybackException {
        if(this.L != null && this.i9 != 2 && !this.p9) {
            MediaCodecAdapter mediaCodecAdapter0 = (MediaCodecAdapter)Assertions.g(this.L);
            if(this.Y8 < 0) {
                int v = mediaCodecAdapter0.o();
                this.Y8 = v;
                if(v < 0) {
                    return false;
                }
                this.w.d = mediaCodecAdapter0.m(v);
                this.w.f();
            }
            if(this.i9 == 1) {
                if(!this.V8) {
                    this.l9 = true;
                    mediaCodecAdapter0.b(this.Y8, 0, 0, 0L, 4);
                    this.z1();
                }
                this.i9 = 2;
                return false;
            }
            if(this.T8) {
                this.T8 = false;
                ((ByteBuffer)Assertions.g(this.w.d)).put(MediaCodecRenderer.O9);
                mediaCodecAdapter0.b(this.Y8, 0, MediaCodecRenderer.O9.length, 0L, 0);
                this.z1();
                this.k9 = true;
                return true;
            }
            if(this.h9 == 1) {
                for(int v1 = 0; v1 < ((Format)Assertions.g(this.M)).q.size(); ++v1) {
                    byte[] arr_b = (byte[])this.M.q.get(v1);
                    ((ByteBuffer)Assertions.g(this.w.d)).put(arr_b);
                }
                this.h9 = 2;
            }
            int v2 = ((ByteBuffer)Assertions.g(this.w.d)).position();
            FormatHolder formatHolder0 = this.K();
            try {
                switch(this.c0(formatHolder0, this.w, 0)) {
                    case -5: {
                        goto label_96;
                    }
                    case -3: {
                        goto label_101;
                    }
                }
            }
            catch(InsufficientCapacityException decoderInputBuffer$InsufficientCapacityException0) {
                this.g1(decoderInputBuffer$InsufficientCapacityException0);
                this.t1(0);
                this.z0();
                return true;
            }
            if(this.w.j()) {
                this.o9 = this.n9;
                if(this.h9 == 2) {
                    this.w.f();
                    this.h9 = 1;
                }
                this.p9 = true;
                if(!this.k9) {
                    this.q1();
                    return false;
                }
                try {
                    if(!this.V8) {
                        this.l9 = true;
                        mediaCodecAdapter0.b(this.Y8, 0, 0, 0L, 4);
                        this.z1();
                    }
                    return false;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                    throw this.G(mediaCodec$CryptoException0, this.C, Util.q0(mediaCodec$CryptoException0.getErrorCode()));
                }
            }
            if(!this.k9 && !this.w.l()) {
                this.w.f();
                if(this.h9 == 2) {
                    this.h9 = 1;
                }
                return true;
            }
            boolean z = this.w.t();
            if(z) {
                this.w.c.b(v2);
            }
            if(this.M8 && !z) {
                NalUnitUtil.b(((ByteBuffer)Assertions.g(this.w.d)));
                if(((ByteBuffer)Assertions.g(this.w.d)).position() == 0) {
                    return true;
                }
                this.M8 = false;
            }
            long v3 = this.w.f;
            if(this.r9) {
                if(this.A.isEmpty()) {
                    this.v9.d.a(v3, ((Format)Assertions.g(this.C)));
                }
                else {
                    ((OutputStreamInfo)this.A.peekLast()).d.a(v3, ((Format)Assertions.g(this.C)));
                }
                this.r9 = false;
            }
            this.n9 = Math.max(this.n9, v3);
            if(this.h() || this.w.m()) {
                this.o9 = this.n9;
            }
            this.w.s();
            if(this.w.i()) {
                this.S0(this.w);
            }
            this.o1(this.w);
            int v4 = this.E0(this.w);
            try {
                if(z) {
                    ((MediaCodecAdapter)Assertions.g(mediaCodecAdapter0)).d(this.Y8, 0, this.w.c, v3, v4);
                }
                else {
                    ((MediaCodecAdapter)Assertions.g(mediaCodecAdapter0)).b(this.Y8, 0, ((ByteBuffer)Assertions.g(this.w.d)).limit(), v3, v4);
                }
            }
            catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                throw this.G(mediaCodec$CryptoException1, this.C, Util.q0(mediaCodec$CryptoException1.getErrorCode()));
            }
            this.z1();
            this.k9 = true;
            this.h9 = 0;
            ++this.u9.c;
            return true;
        label_96:
            if(this.h9 == 2) {
                this.w.f();
                this.h9 = 1;
            }
            this.j1(formatHolder0);
            return true;
        label_101:
            if(this.h()) {
                this.o9 = this.n9;
            }
            return false;
        }
        return false;
    }

    @CallSuper
    protected void y1() {
        this.x1();
        this.t9 = null;
        this.Q = null;
        this.Y = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.m9 = false;
        this.P = -1.0f;
        this.Z = 0;
        this.M8 = false;
        this.N8 = false;
        this.O8 = false;
        this.P8 = false;
        this.Q8 = false;
        this.R8 = false;
        this.S8 = false;
        this.V8 = false;
        this.W8 = false;
        this.g9 = false;
        this.h9 = 0;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public final long z(long v, long v1) {
        return this.L0(this.W8, v, v1);
    }

    private void z0() {
        try {
            ((MediaCodecAdapter)Assertions.k(this.L)).flush();
        }
        finally {
            this.x1();
        }
    }

    private void z1() {
        this.Y8 = -1;
        this.w.d = null;
    }

    class androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.1 {
    }

}

