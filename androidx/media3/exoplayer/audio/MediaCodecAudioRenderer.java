package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer.WakeupListener;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.Y0;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.k;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.base.z;
import com.google.common.collect.O2;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

@UnstableApi
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        public static void a(AudioSink audioSink0, @Nullable Object object0) {
            audioSink0.u(((AudioDeviceInfo)object0));
        }
    }

    final class AudioSinkListener implements Listener {
        final MediaCodecAudioRenderer a;

        private AudioSinkListener() {
        }

        AudioSinkListener(androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.1 mediaCodecAudioRenderer$10) {
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void a(long v) {
            MediaCodecAudioRenderer.this.R9.H(v);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void b(AudioTrackConfig audioSink$AudioTrackConfig0) {
            MediaCodecAudioRenderer.this.R9.o(audioSink$AudioTrackConfig0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void c(AudioTrackConfig audioSink$AudioTrackConfig0) {
            MediaCodecAudioRenderer.this.R9.p(audioSink$AudioTrackConfig0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void d(boolean z) {
            MediaCodecAudioRenderer.this.R9.I(z);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void e(Exception exception0) {
            Log.e("MediaCodecAudioRenderer", "Audio sink error", exception0);
            MediaCodecAudioRenderer.this.R9.n(exception0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void f() {
            MediaCodecAudioRenderer.this.ba = true;
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void g(int v, long v1, long v2) {
            MediaCodecAudioRenderer.this.R9.J(v, v1, v2);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void h() {
            MediaCodecAudioRenderer.this.W();
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void i() {
            WakeupListener renderer$WakeupListener0 = MediaCodecAudioRenderer.this.R0();
            if(renderer$WakeupListener0 != null) {
                renderer$WakeupListener0.a();
            }
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void j() {
            MediaCodecAudioRenderer.this.e2();
        }

        @Override  // androidx.media3.exoplayer.audio.AudioSink$Listener
        public void k() {
            WakeupListener renderer$WakeupListener0 = MediaCodecAudioRenderer.this.R0();
            if(renderer$WakeupListener0 != null) {
                renderer$WakeupListener0.b();
            }
        }
    }

    private final Context Q9;
    private final EventDispatcher R9;
    private final AudioSink S9;
    private int T9;
    private boolean U9;
    private boolean V9;
    @Nullable
    private Format W9;
    @Nullable
    private Format X9;
    private long Y9;
    private boolean Z9;
    private boolean aa;
    private boolean ba;
    private int ca;
    private boolean da;
    private long ea;
    private static final String fa = "MediaCodecAudioRenderer";
    private static final String ga = "v-bits-per-sample";

    public MediaCodecAudioRenderer(Context context0, Factory mediaCodecAdapter$Factory0, MediaCodecSelector mediaCodecSelector0, boolean z, @Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioSink audioSink0) {
        super(1, mediaCodecAdapter$Factory0, mediaCodecSelector0, z, 44100.0f);
        this.Q9 = context0.getApplicationContext();
        this.S9 = audioSink0;
        this.ca = -1000;
        this.R9 = new EventDispatcher(handler0, audioRendererEventListener0);
        this.ea = 0x8000000000000001L;
        audioSink0.f(new AudioSinkListener(this, null));
    }

    public MediaCodecAudioRenderer(Context context0, MediaCodecSelector mediaCodecSelector0) {
        this(context0, mediaCodecSelector0, null, null);
    }

    public MediaCodecAudioRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, @Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0) {
        this(context0, mediaCodecSelector0, handler0, audioRendererEventListener0, new Builder(context0).i());
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, @Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioCapabilities audioCapabilities0, AudioProcessor[] arr_audioProcessor) {
        this(context0, mediaCodecSelector0, handler0, audioRendererEventListener0, new Builder().j(((AudioCapabilities)z.a(audioCapabilities0, AudioCapabilities.e))).m(arr_audioProcessor).i());
    }

    public MediaCodecAudioRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, @Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioSink audioSink0) {
        this(context0, k.a(context0), mediaCodecSelector0, false, handler0, audioRendererEventListener0, audioSink0);
    }

    public MediaCodecAudioRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, boolean z, @Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0, AudioSink audioSink0) {
        this(context0, k.a(context0), mediaCodecSelector0, z, handler0, audioRendererEventListener0, audioSink0);
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public long D() {
        if(this.getState() == 2) {
            this.g2();
        }
        return this.Y9;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float I0(float f, Format format0, Format[] arr_format) {
        int v1 = -1;
        for(int v = 0; v < arr_format.length; ++v) {
            int v2 = arr_format[v].C;
            if(v2 != -1) {
                v1 = Math.max(v1, v2);
            }
        }
        return v1 == -1 ? -1.0f : f * ((float)v1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List K0(MediaCodecSelector mediaCodecSelector0, Format format0, boolean z) throws DecoderQueryException {
        return MediaCodecUtil.x(MediaCodecAudioRenderer.c2(mediaCodecSelector0, format0, z, this.S9), format0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean K1(Format format0) {
        if(this.J().a != 0) {
            int v = this.Z1(format0);
            return (v & 0x200) == 0 || this.J().a != 2 && (v & 0x400) == 0 && (format0.E != 0 || format0.F != 0) ? this.S9.a(format0) : true;
        }
        return this.S9.a(format0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long L0(boolean z, long v, long v1) {
        long v2 = this.ea;
        if(v2 != 0x8000000000000001L) {
            long v3 = (long)(((float)(v2 - v)) / (this.m() == null ? 1.0f : this.m().a) / 2.0f);
            if(this.da) {
                v3 -= Util.F1(this.I().elapsedRealtime()) - v1;
            }
            return Math.max(10000L, v3);
        }
        return super.L0(z, v, v1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int L1(MediaCodecSelector mediaCodecSelector0, Format format0) throws DecoderQueryException {
        boolean z3;
        int v2;
        if(!MimeTypes.q(format0.n)) {
            return 0x80;
        }
        int v = Util.a < 21 ? 0 : 0x20;
        boolean z = true;
        boolean z1 = MediaCodecRenderer.M1(format0);
        if(!z1 || format0.K != 0 && MediaCodecUtil.y() == null) {
            v2 = 0;
        }
        else {
            int v1 = this.Z1(format0);
            if(this.S9.a(format0)) {
                return Y0.e(4, 8, v, v1);
            }
            v2 = v1;
        }
        if("audio/raw".equals(format0.n) && !this.S9.a(format0)) {
            return 0x81;
        }
        Format format1 = Util.A0(2, format0.B, format0.C);
        if(!this.S9.a(format1)) {
            return 0x81;
        }
        List list0 = MediaCodecAudioRenderer.c2(mediaCodecSelector0, format0, false, this.S9);
        if(list0.isEmpty()) {
            return 0x81;
        }
        if(!z1) {
            return 130;
        }
        MediaCodecInfo mediaCodecInfo0 = (MediaCodecInfo)list0.get(0);
        boolean z2 = mediaCodecInfo0.o(format0);
        if(!z2) {
            int v3 = 1;
            while(v3 < list0.size()) {
                MediaCodecInfo mediaCodecInfo1 = (MediaCodecInfo)list0.get(v3);
                if(mediaCodecInfo1.o(format0)) {
                    mediaCodecInfo0 = mediaCodecInfo1;
                    z3 = false;
                    goto label_36;
                }
                ++v3;
            }
        }
        z = z2;
        z3 = true;
    label_36:
        int v4 = z ? 4 : 3;
        int v5 = !z || !mediaCodecInfo0.r(format0) ? 8 : 16;
        int v6 = mediaCodecInfo0.h ? 0x40 : 0;
        return z3 ? v4 | v5 | v | v6 | 0x80 | v2 : v4 | v5 | v | v6 | v2;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected Configuration N0(MediaCodecInfo mediaCodecInfo0, Format format0, @Nullable MediaCrypto mediaCrypto0, float f) {
        this.T9 = this.b2(mediaCodecInfo0, format0, this.O());
        this.U9 = MediaCodecAudioRenderer.W1(mediaCodecInfo0.a);
        this.V9 = MediaCodecAudioRenderer.X1(mediaCodecInfo0.a);
        MediaFormat mediaFormat0 = this.d2(format0, mediaCodecInfo0.c, this.T9, f);
        this.X9 = !"audio/raw".equals(mediaCodecInfo0.b) || "audio/raw".equals(format0.n) ? null : format0;
        return Configuration.a(mediaCodecInfo0, mediaFormat0, format0, mediaCrypto0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void R() {
        try {
            this.aa = true;
            this.W9 = null;
            this.S9.flush();
        }
        catch(Throwable unused_ex) {
            try {
                super.R();
            }
            throw throwable0;
        }
        finally {
            this.R9.s(this.u9);
        }
        super.R();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
        super.S(z, z1);
        this.R9.t(this.u9);
        if(this.J().b) {
            this.S9.p();
        }
        else {
            this.S9.i();
        }
        PlayerId playerId0 = this.N();
        this.S9.A(playerId0);
        Clock clock0 = this.I();
        this.S9.s(clock0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void S0(DecoderInputBuffer decoderInputBuffer0) {
        if(Util.a >= 29 && (decoderInputBuffer0.b != null && Objects.equals(decoderInputBuffer0.b.n, "audio/opus") && this.Y0())) {
            ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(decoderInputBuffer0.g);
            int v = ((Format)Assertions.g(decoderInputBuffer0.b)).E;
            if(byteBuffer0.remaining() == 8) {
                long v1 = byteBuffer0.order(ByteOrder.LITTLE_ENDIAN).getLong();
                this.S9.y(v, ((int)(v1 * 48000L / 1000000000L)));
            }
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void U(long v, boolean z) throws ExoPlaybackException {
        super.U(v, z);
        this.S9.flush();
        this.Y9 = v;
        this.ba = false;
        this.Z9 = true;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void V() {
        this.S9.release();
    }

    // 去混淆评级： 中等(50)
    private static boolean W1(String s) {
        return Util.a < 24 && "OMX.SEC.aac.dec".equals(s) && "samsung".equals(Util.c) && (Util.b.startsWith("zeroflte") || Util.b.startsWith("herolte") || Util.b.startsWith("heroqlte"));
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void X() {
        try {
            this.ba = false;
            super.X();
        }
        catch(Throwable throwable0) {
            if(this.aa) {
                this.aa = false;
                this.S9.reset();
            }
            throw throwable0;
        }
        if(this.aa) {
            this.aa = false;
            this.S9.reset();
        }
    }

    // 去混淆评级： 低(40)
    private static boolean X1(String s) {
        return s.equals("OMX.google.opus.decoder") || s.equals("c2.android.opus.decoder") || s.equals("OMX.google.vorbis.decoder") || s.equals("c2.android.vorbis.decoder");
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void Y() {
        super.Y();
        this.S9.c();
        this.da = true;
    }

    // 去混淆评级： 低(20)
    private static boolean Y1() {
        return Util.a == 23 && ("ZTE B2017G".equals(Util.d) || "AXON 7 mini".equals(Util.d));
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void Z() {
        this.g2();
        this.da = false;
        this.S9.pause();
        super.Z();
    }

    private int Z1(Format format0) {
        AudioOffloadSupport audioOffloadSupport0 = this.S9.t(format0);
        if(!audioOffloadSupport0.a) {
            return 0;
        }
        int v = audioOffloadSupport0.b ? 0x600 : 0x200;
        return audioOffloadSupport0.c ? v | 0x800 : v;
    }

    // 去混淆评级： 低(30)
    private int a2(MediaCodecInfo mediaCodecInfo0, Format format0) {
        return !"OMX.google.raw.decoder".equals(mediaCodecInfo0.a) || (Util.a >= 24 || Util.a == 23 && Util.n1(this.Q9)) ? format0.o : -1;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean b() {
        return super.b() && this.S9.b();
    }

    protected int b2(MediaCodecInfo mediaCodecInfo0, Format format0, Format[] arr_format) {
        int v = this.a2(mediaCodecInfo0, format0);
        if(arr_format.length == 1) {
            return v;
        }
        for(int v1 = 0; v1 < arr_format.length; ++v1) {
            Format format1 = arr_format[v1];
            if(mediaCodecInfo0.e(format0, format1).d != 0) {
                v = Math.max(v, this.a2(mediaCodecInfo0, format1));
            }
        }
        return v;
    }

    private static List c2(MediaCodecSelector mediaCodecSelector0, Format format0, boolean z, AudioSink audioSink0) throws DecoderQueryException {
        if(format0.n == null) {
            return O2.A();
        }
        if(audioSink0.a(format0)) {
            MediaCodecInfo mediaCodecInfo0 = MediaCodecUtil.y();
            if(mediaCodecInfo0 != null) {
                return O2.B(mediaCodecInfo0);
            }
        }
        return MediaCodecUtil.w(mediaCodecSelector0, format0, z, false);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat d2(Format format0, String s, int v, float f) {
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", s);
        mediaFormat0.setInteger("channel-count", format0.B);
        mediaFormat0.setInteger("sample-rate", format0.C);
        MediaFormatUtil.x(mediaFormat0, format0.q);
        MediaFormatUtil.s(mediaFormat0, "max-input-size", v);
        int v1 = Util.a;
        if(v1 >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f && !MediaCodecAudioRenderer.Y1()) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(v1 <= 28 && "audio/ac4".equals(format0.n)) {
            mediaFormat0.setInteger("ac4-is-sync", 1);
        }
        if(v1 >= 24) {
            Format format1 = Util.A0(4, format0.B, format0.C);
            if(this.S9.q(format1) == 2) {
                mediaFormat0.setInteger("pcm-encoding", 4);
            }
        }
        if(v1 >= 0x20) {
            mediaFormat0.setInteger("max-output-channel-count", 99);
        }
        if(v1 >= 35) {
            mediaFormat0.setInteger("importance", Math.max(0, -this.ca));
        }
        return mediaFormat0;
    }

    @CallSuper
    protected void e2() {
        this.Z9 = true;
    }

    private void f2() {
        MediaCodecAdapter mediaCodecAdapter0 = this.D0();
        if(mediaCodecAdapter0 == null) {
            return;
        }
        if(Util.a >= 35) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("importance", Math.max(0, -this.ca));
            mediaCodecAdapter0.a(bundle0);
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void g1(Exception exception0) {
        Log.e("MediaCodecAudioRenderer", "Audio codec error", exception0);
        this.R9.m(exception0);
    }

    private void g2() {
        boolean z = this.b();
        long v = this.S9.z(z);
        if(v != 0x8000000000000000L) {
            if(!this.Z9) {
                v = Math.max(this.Y9, v);
            }
            this.Y9 = v;
            this.Z9 = false;
        }
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void h1(String s, Configuration mediaCodecAdapter$Configuration0, long v, long v1) {
        this.R9.q(s, v, v1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation i0(MediaCodecInfo mediaCodecInfo0, Format format0, Format format1) {
        DecoderReuseEvaluation decoderReuseEvaluation0 = mediaCodecInfo0.e(format0, format1);
        int v = this.Z0(format1) ? decoderReuseEvaluation0.e | 0x8000 : decoderReuseEvaluation0.e;
        if(this.a2(mediaCodecInfo0, format1) > this.T9) {
            v |= 0x40;
        }
        return v == 0 ? new DecoderReuseEvaluation(mediaCodecInfo0.a, format0, format1, decoderReuseEvaluation0.d, 0) : new DecoderReuseEvaluation(mediaCodecInfo0.a, format0, format1, 0, v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void i1(String s) {
        this.R9.r(s);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean isReady() {
        return this.S9.v() || super.isReady();
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public boolean j() {
        boolean z = this.ba;
        this.ba = false;
        return z;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    protected DecoderReuseEvaluation j1(FormatHolder formatHolder0) throws ExoPlaybackException {
        Format format0 = (Format)Assertions.g(formatHolder0.b);
        this.W9 = format0;
        DecoderReuseEvaluation decoderReuseEvaluation0 = super.j1(formatHolder0);
        this.R9.u(format0, decoderReuseEvaluation0);
        return decoderReuseEvaluation0;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
        switch(v) {
            case 2: {
                float f = (float)(((Float)Assertions.g(object0)));
                this.S9.o(f);
                break;
            }
            case 3: {
                AudioAttributes audioAttributes0 = (AudioAttributes)Assertions.g(((AudioAttributes)object0));
                this.S9.e(audioAttributes0);
                return;
            }
            case 6: {
                AuxEffectInfo auxEffectInfo0 = (AuxEffectInfo)Assertions.g(((AuxEffectInfo)object0));
                this.S9.j(auxEffectInfo0);
                return;
            }
            case 9: {
                boolean z = ((Boolean)Assertions.g(object0)).booleanValue();
                this.S9.r(z);
                return;
            }
            case 10: {
                int v1 = (int)(((Integer)Assertions.g(object0)));
                this.S9.k(v1);
                return;
            }
            case 12: {
                if(Util.a >= 23) {
                    Api23.a(this.S9, object0);
                    return;
                }
                break;
            }
            case 16: {
                this.ca = (int)(((Integer)Assertions.g(object0)));
                this.f2();
                return;
            }
            default: {
                super.k(v, object0);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void k1(Format format0, @Nullable MediaFormat mediaFormat0) throws ExoPlaybackException {
        int v;
        Format format1 = this.X9;
        int[] arr_v = null;
        if(format1 != null) {
            format0 = format1;
        }
        else if(this.D0() != null) {
            Assertions.g(mediaFormat0);
            if("audio/raw".equals(format0.n)) {
                v = format0.D;
            }
            else if(Util.a < 24 || !mediaFormat0.containsKey("pcm-encoding")) {
                v = mediaFormat0.containsKey("v-bits-per-sample") ? Util.z0(mediaFormat0.getInteger("v-bits-per-sample")) : 2;
            }
            else {
                v = mediaFormat0.getInteger("pcm-encoding");
            }
            Format format2 = new androidx.media3.common.Format.Builder().o0("audio/raw").i0(v).V(format0.E).W(format0.F).h0(format0.k).T(format0.l).a0(format0.a).c0(format0.b).d0(format0.c).e0(format0.d).q0(format0.e).m0(format0.f).N(mediaFormat0.getInteger("channel-count")).p0(mediaFormat0.getInteger("sample-rate")).K();
            if(!this.U9 || format2.B != 6) {
            label_25:
                if(this.V9) {
                    arr_v = VorbisUtil.a(format2.B);
                }
            }
            else {
                int v1 = format0.B;
                if(v1 < 6) {
                    arr_v = new int[v1];
                    for(int v2 = 0; v2 < format0.B; ++v2) {
                        arr_v[v2] = v2;
                    }
                    goto label_27;
                }
                goto label_25;
            }
        label_27:
            format0 = format2;
        }
        try {
            if(Util.a >= 29) {
                if(!this.Y0() || this.J().a == 0) {
                    this.S9.g(0);
                }
                else {
                    RendererConfiguration rendererConfiguration0 = this.J();
                    this.S9.g(rendererConfiguration0.a);
                }
            }
            this.S9.n(format0, 0, arr_v);
            return;
        }
        catch(ConfigurationException audioSink$ConfigurationException0) {
        }
        throw this.G(audioSink$ConfigurationException0, audioSink$ConfigurationException0.a, 5001);
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public void l(PlaybackParameters playbackParameters0) {
        this.S9.l(playbackParameters0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void l1(long v) {
        this.S9.B(v);
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters m() {
        return this.S9.m();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void n1() {
        super.n1();
        this.S9.C();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean r1(long v, long v1, @Nullable MediaCodecAdapter mediaCodecAdapter0, @Nullable ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, Format format0) throws ExoPlaybackException {
        Assertions.g(byteBuffer0);
        this.ea = 0x8000000000000001L;
        if(this.X9 != null && (v3 & 2) != 0) {
            ((MediaCodecAdapter)Assertions.g(mediaCodecAdapter0)).i(v2, false);
            return true;
        }
        if(z) {
            if(mediaCodecAdapter0 != null) {
                mediaCodecAdapter0.i(v2, false);
            }
            this.u9.f += v4;
            this.S9.C();
            return true;
        }
        try {
            if(this.S9.w(byteBuffer0, v5, v4)) {
                goto label_20;
            }
            this.ea = v5;
            return false;
        }
        catch(InitializationException audioSink$InitializationException0) {
            Format format1 = this.W9;
            int v6 = !this.Y0() || this.J().a == 0 ? 5001 : 5004;
            throw this.H(audioSink$InitializationException0, format1, audioSink$InitializationException0.b, v6);
        }
        catch(WriteException audioSink$WriteException0) {
            int v7 = !this.Y0() || this.J().a == 0 ? 5002 : 5003;
            throw this.H(audioSink$WriteException0, format0, audioSink$WriteException0.b, v7);
        }
    label_20:
        if(mediaCodecAdapter0 != null) {
            mediaCodecAdapter0.i(v2, false);
        }
        this.u9.e += v4;
        return true;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    @Nullable
    public MediaClock t() {
        return this;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() throws ExoPlaybackException {
        try {
            this.S9.x();
            if(this.M0() != 0x8000000000000001L) {
                this.ea = this.M0();
            }
        }
        catch(WriteException audioSink$WriteException0) {
            throw this.H(audioSink$WriteException0, audioSink$WriteException0.c, audioSink$WriteException0.b, (this.Y0() ? 5003 : 5002));
        }
    }

    class androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.1 {
    }

}

