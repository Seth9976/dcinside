package androidx.media3.exoplayer.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Y0;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.k;
import com.google.common.collect.O2;
import com.google.common.util.concurrent.C0;
import h4.m;
import java.nio.ByteBuffer;
import java.util.List;

@UnstableApi
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements FrameTimingEvaluator {
    @RequiresApi(26)
    static final class Api26 {
        @DoNotInline
        public static boolean a(Context context0) {
            DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
            Display display0 = displayManager0 == null ? null : displayManager0.getDisplay(0);
            if(display0 != null && display0.isHdr()) {
                int[] arr_v = display0.getHdrCapabilities().getSupportedHdrTypes();
                for(int v = 0; v < arr_v.length; ++v) {
                    if(arr_v[v] == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class CodecMaxValues {
        public final int a;
        public final int b;
        public final int c;

        public CodecMaxValues(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }
    }

    @RequiresApi(23)
    final class OnFrameRenderedListenerV23 implements Handler.Callback, OnFrameRenderedListener {
        private final Handler a;
        final MediaCodecVideoRenderer b;
        private static final int c;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter0) {
            Handler handler0 = Util.I(this);
            this.a = handler0;
            mediaCodecAdapter0.k(this, handler0);
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$OnFrameRenderedListener
        public void a(MediaCodecAdapter mediaCodecAdapter0, long v, long v1) {
            if(Util.a < 30) {
                Message message0 = Message.obtain(this.a, 0, ((int)(v >> 0x20)), ((int)v));
                this.a.sendMessageAtFrontOfQueue(message0);
                return;
            }
            this.b(v);
        }

        private void b(long v) {
            if(this == MediaCodecVideoRenderer.this.va && MediaCodecVideoRenderer.this.D0() != null) {
                if(v == 0x7FFFFFFFFFFFFFFFL) {
                    MediaCodecVideoRenderer.this.A2();
                    return;
                }
                try {
                    MediaCodecVideoRenderer.this.z2(v);
                }
                catch(ExoPlaybackException exoPlaybackException0) {
                    MediaCodecVideoRenderer.this.E1(exoPlaybackException0);
                }
            }
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            if(message0.what != 0) {
                return false;
            }
            this.b(message0.arg2);
            return true;
        }
    }

    private static final String Aa = "crop-bottom";
    private static final String Ba = "crop-top";
    private static final int[] Ca = null;
    private static final float Da = 1.5f;
    private static final long Ea = 0x7FFFFFFFFFFFFFFFL;
    private static final int Fa = 0x200000;
    private static final long Ga = -30000L;
    private static final long Ha = -500000L;
    private static boolean Ia = false;
    private static boolean Ja = false;
    private final Context Q9;
    @Nullable
    private final VideoSinkProvider R9;
    private final boolean S9;
    private final EventDispatcher T9;
    private final int U9;
    private final boolean V9;
    private final VideoFrameReleaseControl W9;
    private final FrameReleaseInfo X9;
    private CodecMaxValues Y9;
    private boolean Z9;
    private boolean aa;
    private VideoSink ba;
    private boolean ca;
    private List da;
    @Nullable
    private Surface ea;
    @Nullable
    private PlaceholderSurface fa;
    private Size ga;
    private boolean ha;
    private int ia;
    private long ja;
    private int ka;
    private int la;
    private int ma;
    private long na;
    private int oa;
    private long pa;
    private VideoSize qa;
    @Nullable
    private VideoSize ra;
    private int sa;
    private boolean ta;
    private int ua;
    @Nullable
    OnFrameRenderedListenerV23 va;
    @Nullable
    private VideoFrameMetadataListener wa;
    private static final String xa = "MediaCodecVideoRenderer";
    private static final String ya = "crop-left";
    private static final String za = "crop-right";

    static {
        MediaCodecVideoRenderer.Ca = new int[]{0x780, 1600, 0x5A0, 0x500, 960, 854, 640, 540, 480};
    }

    public MediaCodecVideoRenderer(Context context0, Factory mediaCodecAdapter$Factory0, MediaCodecSelector mediaCodecSelector0, long v, boolean z, @Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0, int v1) {
        this(context0, mediaCodecAdapter$Factory0, mediaCodecSelector0, v, z, handler0, videoRendererEventListener0, v1, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context0, Factory mediaCodecAdapter$Factory0, MediaCodecSelector mediaCodecSelector0, long v, boolean z, @Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0, int v1, float f) {
        this(context0, mediaCodecAdapter$Factory0, mediaCodecSelector0, v, z, handler0, videoRendererEventListener0, v1, f, null);
    }

    public MediaCodecVideoRenderer(Context context0, Factory mediaCodecAdapter$Factory0, MediaCodecSelector mediaCodecSelector0, long v, boolean z, @Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0, int v1, float f, @Nullable VideoSinkProvider videoSinkProvider0) {
        super(2, mediaCodecAdapter$Factory0, mediaCodecSelector0, z, f);
        Context context1 = context0.getApplicationContext();
        this.Q9 = context1;
        this.U9 = v1;
        this.R9 = videoSinkProvider0;
        this.T9 = new EventDispatcher(handler0, videoRendererEventListener0);
        this.S9 = videoSinkProvider0 == null;
        this.W9 = videoSinkProvider0 == null ? new VideoFrameReleaseControl(context1, this, v) : videoSinkProvider0.e();
        this.X9 = new FrameReleaseInfo();
        this.V9 = false;
        this.ga = Size.c;
        this.ia = 1;
        this.qa = VideoSize.i;
        this.ua = 0;
        this.ra = null;
        this.sa = -1000;
    }

    public MediaCodecVideoRenderer(Context context0, MediaCodecSelector mediaCodecSelector0) {
        this(context0, mediaCodecSelector0, 0L);
    }

    public MediaCodecVideoRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, long v) {
        this(context0, mediaCodecSelector0, v, null, null, 0);
    }

    public MediaCodecVideoRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, long v, @Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0, int v1) {
        this(context0, k.a(context0), mediaCodecSelector0, v, false, handler0, videoRendererEventListener0, v1, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context0, MediaCodecSelector mediaCodecSelector0, long v, boolean z, @Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0, int v1) {
        this(context0, k.a(context0), mediaCodecSelector0, v, z, handler0, videoRendererEventListener0, v1, 30.0f);
    }

    private void A2() {
        this.D1();
    }

    protected void B2() {
    }

    private void C2() {
        PlaceholderSurface placeholderSurface0 = this.fa;
        if(this.ea == placeholderSurface0) {
            this.ea = null;
        }
        if(placeholderSurface0 != null) {
            placeholderSurface0.release();
            this.fa = null;
        }
    }

    protected void D2(MediaCodecAdapter mediaCodecAdapter0, int v, long v1) {
        TraceUtil.a("releaseOutputBuffer");
        mediaCodecAdapter0.i(v, true);
        TraceUtil.b();
        ++this.u9.e;
        this.la = 0;
        if(this.ba == null) {
            this.r2(this.qa);
            this.p2();
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void E(float f, float f1) throws ExoPlaybackException {
        super.E(f, f1);
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.p(f);
            return;
        }
        this.W9.r(f);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int E0(DecoderInputBuffer decoderInputBuffer0) {
        return Util.a < 34 || !this.ta || decoderInputBuffer0.f >= this.M() ? 0 : 0x20;
    }

    private void E2(MediaCodecAdapter mediaCodecAdapter0, int v, long v1, long v2) {
        if(Util.a >= 21) {
            this.F2(mediaCodecAdapter0, v, v1, v2);
            return;
        }
        this.D2(mediaCodecAdapter0, v, v1);
    }

    @RequiresApi(21)
    protected void F2(MediaCodecAdapter mediaCodecAdapter0, int v, long v1, long v2) {
        TraceUtil.a("releaseOutputBuffer");
        mediaCodecAdapter0.f(v, v2);
        TraceUtil.b();
        ++this.u9.e;
        this.la = 0;
        if(this.ba == null) {
            this.r2(this.qa);
            this.p2();
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean G0() {
        return this.ta && Util.a < 23;
    }

    @RequiresApi(29)
    private static void G2(MediaCodecAdapter mediaCodecAdapter0, byte[] arr_b) {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("hdr10-plus-info", arr_b);
        mediaCodecAdapter0.a(bundle0);
    }

    private void H2(@Nullable Object object0) throws ExoPlaybackException {
        Surface surface0 = object0 instanceof Surface ? ((Surface)object0) : null;
        if(surface0 == null) {
            PlaceholderSurface placeholderSurface0 = this.fa;
            if(placeholderSurface0 == null) {
                MediaCodecInfo mediaCodecInfo0 = this.F0();
                if(mediaCodecInfo0 != null && this.O2(mediaCodecInfo0)) {
                    surface0 = PlaceholderSurface.d(this.Q9, mediaCodecInfo0.g);
                    this.fa = surface0;
                }
            }
            else {
                surface0 = placeholderSurface0;
            }
        }
        if(this.ea != surface0) {
            this.ea = surface0;
            if(this.ba == null) {
                this.W9.q(surface0);
            }
            this.ha = false;
            int v = this.getState();
            MediaCodecAdapter mediaCodecAdapter0 = this.D0();
            if(mediaCodecAdapter0 != null && this.ba == null) {
                if(Util.a < 23 || surface0 == null || this.Z9) {
                    this.v1();
                    this.e1();
                }
                else {
                    this.I2(mediaCodecAdapter0, surface0);
                }
            }
            if(surface0 == null || surface0 == this.fa) {
                this.ra = null;
                VideoSink videoSink0 = this.ba;
                if(videoSink0 != null) {
                    videoSink0.g();
                }
            }
            else {
                this.u2();
                if(v == 2) {
                    this.W9.e(true);
                }
            }
            this.w2();
            return;
        }
        if(surface0 != null && surface0 != this.fa) {
            this.u2();
            this.t2();
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float I0(float f, Format format0, Format[] arr_format) {
        float f1 = -1.0f;
        for(int v = 0; v < arr_format.length; ++v) {
            float f2 = arr_format[v].v;
            if(f2 != -1.0f) {
                f1 = Math.max(f1, f2);
            }
        }
        return f1 == -1.0f ? -1.0f : f1 * f;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean I1(MediaCodecInfo mediaCodecInfo0) {
        return this.ea != null || this.O2(mediaCodecInfo0);
    }

    @RequiresApi(23)
    protected void I2(MediaCodecAdapter mediaCodecAdapter0, Surface surface0) {
        mediaCodecAdapter0.n(surface0);
    }

    public void J2(List list0) {
        this.da = list0;
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.K(list0);
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List K0(MediaCodecSelector mediaCodecSelector0, Format format0, boolean z) throws DecoderQueryException {
        return MediaCodecUtil.x(MediaCodecVideoRenderer.i2(this.Q9, mediaCodecSelector0, format0, z, this.ta), format0);
    }

    protected boolean K2(long v, long v1, boolean z) {
        return v < -500000L && !z;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int L1(MediaCodecSelector mediaCodecSelector0, Format format0) throws DecoderQueryException {
        int v = 0;
        if(!MimeTypes.u(format0.n)) {
            return 0x80;
        }
        boolean z = format0.r != null;
        List list0 = MediaCodecVideoRenderer.i2(this.Q9, mediaCodecSelector0, format0, z, false);
        if(z && list0.isEmpty()) {
            list0 = MediaCodecVideoRenderer.i2(this.Q9, mediaCodecSelector0, format0, false, false);
        }
        if(list0.isEmpty()) {
            return 0x81;
        }
        if(!MediaCodecRenderer.M1(format0)) {
            return 130;
        }
        boolean z1 = true;
        MediaCodecInfo mediaCodecInfo0 = (MediaCodecInfo)list0.get(0);
        boolean z2 = mediaCodecInfo0.o(format0);
        if(!z2) {
            for(int v1 = 1; v1 < list0.size(); ++v1) {
                MediaCodecInfo mediaCodecInfo1 = (MediaCodecInfo)list0.get(v1);
                if(mediaCodecInfo1.o(format0)) {
                    mediaCodecInfo0 = mediaCodecInfo1;
                    z1 = false;
                    z2 = true;
                    break;
                }
            }
        }
        int v2 = mediaCodecInfo0.r(format0) ? 16 : 8;
        int v3 = mediaCodecInfo0.h ? 0x40 : 0;
        int v4 = z1 ? 0x80 : 0;
        if(Util.a >= 26 && "video/dolby-vision".equals(format0.n) && !Api26.a(this.Q9)) {
            v4 = 0x100;
        }
        if(z2) {
            List list1 = MediaCodecVideoRenderer.i2(this.Q9, mediaCodecSelector0, format0, z, true);
            if(!list1.isEmpty()) {
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo)MediaCodecUtil.x(list1, format0).get(0);
                if(mediaCodecInfo2.o(format0) && mediaCodecInfo2.r(format0)) {
                    v = 0x20;
                }
            }
        }
        return Y0.f((z2 ? 4 : 3), v2, v, v3, v4);
    }

    protected boolean L2(long v, long v1, boolean z) {
        return v < -30000L && !z;
    }

    protected boolean M2(long v, long v1) {
        return v < -30000L && v1 > 100000L;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected Configuration N0(MediaCodecInfo mediaCodecInfo0, Format format0, @Nullable MediaCrypto mediaCrypto0, float f) {
        if(this.fa != null && this.fa.a != mediaCodecInfo0.g) {
            this.C2();
        }
        CodecMaxValues mediaCodecVideoRenderer$CodecMaxValues0 = this.h2(mediaCodecInfo0, format0, this.O());
        this.Y9 = mediaCodecVideoRenderer$CodecMaxValues0;
        MediaFormat mediaFormat0 = this.l2(format0, mediaCodecInfo0.c, mediaCodecVideoRenderer$CodecMaxValues0, f, this.V9, (this.ta ? this.ua : 0));
        if(this.ea == null) {
            if(!this.O2(mediaCodecInfo0)) {
                throw new IllegalStateException();
            }
            if(this.fa == null) {
                this.fa = PlaceholderSurface.d(this.Q9, mediaCodecInfo0.g);
            }
            this.ea = this.fa;
        }
        this.v2(mediaFormat0);
        VideoSink videoSink0 = this.ba;
        return videoSink0 == null ? Configuration.b(mediaCodecInfo0, mediaFormat0, format0, this.ea, mediaCrypto0) : Configuration.b(mediaCodecInfo0, mediaFormat0, format0, videoSink0.a(), mediaCrypto0);
    }

    protected boolean N2() [...] // Inlined contents

    // 去混淆评级： 低(40)
    private boolean O2(MediaCodecInfo mediaCodecInfo0) {
        return Util.a >= 23 && !this.ta && !this.Z1(mediaCodecInfo0.a) && (!mediaCodecInfo0.g || PlaceholderSurface.c(this.Q9));
    }

    protected void P2(MediaCodecAdapter mediaCodecAdapter0, int v, long v1) {
        TraceUtil.a("skipVideoBuffer");
        mediaCodecAdapter0.i(v, false);
        TraceUtil.b();
        ++this.u9.f;
    }

    private void Q2() {
        MediaCodecAdapter mediaCodecAdapter0 = this.D0();
        if(mediaCodecAdapter0 == null) {
            return;
        }
        if(Util.a >= 35) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("importance", Math.max(0, -this.sa));
            mediaCodecAdapter0.a(bundle0);
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void R() {
        this.ra = null;
        VideoSink videoSink0 = this.ba;
        if(videoSink0 == null) {
            this.W9.g();
        }
        else {
            videoSink0.w();
        }
        this.w2();
        this.ha = false;
        this.va = null;
        try {
            super.R();
        }
        finally {
            this.T9.m(this.u9);
            this.T9.D(VideoSize.i);
        }
    }

    protected void R2(int v, int v1) {
        this.u9.h += v;
        int v2 = v + v1;
        this.u9.g += v2;
        this.ka += v2;
        int v3 = this.la + v2;
        this.la = v3;
        this.u9.i = Math.max(v3, this.u9.i);
        if(this.U9 > 0 && this.ka >= this.U9) {
            this.o2();
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
        super.S(z, z1);
        boolean z2 = this.J().b;
        Assertions.i(!z2 || this.ua != 0);
        if(this.ta != z2) {
            this.ta = z2;
            this.v1();
        }
        this.T9.o(this.u9);
        if(!this.ca) {
            if((this.da != null || !this.S9) && this.ba == null) {
                VideoSinkProvider videoSinkProvider0 = this.R9;
                if(videoSinkProvider0 == null) {
                    videoSinkProvider0 = new Builder(this.Q9, this.W9).f(this.I()).e();
                }
                this.ba = videoSinkProvider0.f();
            }
            this.ca = true;
        }
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.r(new Listener() {
                final MediaCodecVideoRenderer b;

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void a(VideoSink videoSink0) {
                    Assertions.k(MediaCodecVideoRenderer.this.ea);
                    MediaCodecVideoRenderer.this.y2();
                }

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void b(VideoSink videoSink0, VideoSinkException videoSink$VideoSinkException0) {
                    ExoPlaybackException exoPlaybackException0 = MediaCodecVideoRenderer.this.G(videoSink$VideoSinkException0, videoSink$VideoSinkException0.a, 7001);
                    MediaCodecVideoRenderer.this.E1(exoPlaybackException0);
                }

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void c(VideoSink videoSink0) {
                    MediaCodecVideoRenderer.this.R2(0, 1);
                }

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void d(VideoSink videoSink0, VideoSize videoSize0) {
                }
            }, C0.c());
            VideoFrameMetadataListener videoFrameMetadataListener0 = this.wa;
            if(videoFrameMetadataListener0 != null) {
                this.ba.e(videoFrameMetadataListener0);
            }
            if(this.ea != null && !this.ga.equals(Size.c)) {
                this.ba.c(this.ea, this.ga);
            }
            this.ba.p(this.Q0());
            List list0 = this.da;
            if(list0 != null) {
                this.ba.K(list0);
            }
            this.ba.m(z1);
            return;
        }
        Clock clock0 = this.I();
        this.W9.o(clock0);
        this.W9.h(z1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void S0(DecoderInputBuffer decoderInputBuffer0) throws ExoPlaybackException {
        if(!this.aa) {
            return;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(decoderInputBuffer0.g);
        if(byteBuffer0.remaining() >= 7) {
            int v = byteBuffer0.get();
            int v1 = byteBuffer0.getShort();
            int v2 = byteBuffer0.getShort();
            int v3 = byteBuffer0.get();
            int v4 = byteBuffer0.get();
            byteBuffer0.position(0);
            if(v == -75 && v1 == 60 && v2 == 1 && v3 == 4 && (v4 == 0 || v4 == 1)) {
                byte[] arr_b = new byte[byteBuffer0.remaining()];
                byteBuffer0.get(arr_b);
                byteBuffer0.position(0);
                MediaCodecVideoRenderer.G2(((MediaCodecAdapter)Assertions.g(this.D0())), arr_b);
            }
        }
    }

    protected void S2(long v) {
        this.u9.a(v);
        this.na += v;
        ++this.oa;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void T() {
        super.T();
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void U(long v, boolean z) throws ExoPlaybackException {
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.x(true);
            this.ba.k(this.O0(), 0L);
        }
        super.U(v, z);
        if(this.ba == null) {
            this.W9.m();
        }
        if(z) {
            this.W9.e(false);
        }
        this.w2();
        this.la = 0;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void V() {
        super.V();
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null && this.S9) {
            videoSink0.release();
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void X() {
        try {
            super.X();
            this.ca = false;
        }
        catch(Throwable throwable0) {
            this.ca = false;
            if(this.fa != null) {
                this.C2();
            }
            throw throwable0;
        }
        if(this.fa != null) {
            this.C2();
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void Y() {
        super.Y();
        this.ka = 0;
        this.ja = this.I().elapsedRealtime();
        this.na = 0L;
        this.oa = 0;
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.u();
            return;
        }
        this.W9.k();
    }

    private static boolean Y1() [...] // 潜在的解密器

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void Z() {
        this.o2();
        this.q2();
        VideoSink videoSink0 = this.ba;
        if(videoSink0 == null) {
            this.W9.l();
        }
        else {
            videoSink0.j();
        }
        super.Z();
    }

    protected boolean Z1(String s) {
        if(s.startsWith("OMX.google")) {
            return false;
        }
        synchronized(MediaCodecVideoRenderer.class) {
            if(!MediaCodecVideoRenderer.Ia) {
                MediaCodecVideoRenderer.Ja = MediaCodecVideoRenderer.d2();
                MediaCodecVideoRenderer.Ia = true;
            }
            return MediaCodecVideoRenderer.Ja;
        }
    }

    @RequiresApi(21)
    private static void a2(MediaFormat mediaFormat0, int v) {
        mediaFormat0.setFeatureEnabled("tunneled-playback", true);
        mediaFormat0.setInteger("audio-session-id", v);
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean b() {
        return super.b() && (this.ba == null || this.ba.b());
    }

    private static boolean b2() [...] // 潜在的解密器

    protected void c2(MediaCodecAdapter mediaCodecAdapter0, int v, long v1) {
        TraceUtil.a("dropVideoBuffer");
        mediaCodecAdapter0.i(v, false);
        TraceUtil.b();
        this.R2(0, 1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void d(long v, long v1) throws ExoPlaybackException {
        super.d(v, v1);
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            try {
                videoSink0.d(v, v1);
            }
            catch(VideoSinkException videoSink$VideoSinkException0) {
                throw this.G(videoSink$VideoSinkException0, videoSink$VideoSinkException0.a, 7001);
            }
        }
    }

    private static boolean d2() {
        int v = Util.a;
        if(v <= 28) {
            Util.b.hashCode();
            switch(Util.b) {
                case "aquaman": 
                case "dangal": 
                case "dangalFHD": 
                case "dangalUHD": 
                case "machuca": 
                case "magnolia": 
                case "once": 
                case "oneday": {
                    return true;
                }
            }
        }
        if(v <= 27 && "HWEML".equals(Util.b)) {
            return true;
        }
        String s = Util.d;
        s.hashCode();
        switch(s) {
            case "AFTA": {
                return true;
            }
            case "AFTEU011": {
                return true;
            }
            case "AFTEU014": {
                return true;
            }
            case "AFTEUFF014": {
                return true;
            }
            case "AFTJMST12": {
                return true;
            }
            case "AFTKMST12": {
                return true;
            }
            case "AFTN": {
                return true;
            }
            case "AFTR": {
                return true;
            }
            case "AFTSO001": {
                return true;
            }
            default: {
                if(v <= 26) {
                    Util.b.hashCode();
                    switch(Util.b) {
                        case "1601": {
                            return true;
                        }
                        case "1713": {
                            return true;
                        }
                        case "1714": {
                            return true;
                        }
                        case "601LV": {
                            return true;
                        }
                        case "602LV": {
                            return true;
                        }
                        case "A10-70F": {
                            return true;
                        }
                        case "A10-70L": {
                            return true;
                        }
                        case "A1601": {
                            return true;
                        }
                        case "A2016a40": {
                            return true;
                        }
                        case "A7000-a": {
                            return true;
                        }
                        case "A7000plus": {
                            return true;
                        }
                        case "A7010a48": {
                            return true;
                        }
                        case "A7020a48": {
                            return true;
                        }
                        case "ASUS_X00AD_2": {
                            return true;
                        }
                        case "AquaPowerM": {
                            return true;
                        }
                        case "Aura_Note_2": {
                            return true;
                        }
                        case "BLACK-1X": {
                            return true;
                        }
                        case "BRAVIA_ATV2": {
                            return true;
                        }
                        case "BRAVIA_ATV3_4K": {
                            return true;
                        }
                        case "C1": {
                            return true;
                        }
                        case "CP8676_I02": {
                            return true;
                        }
                        case "CPH1609": {
                            return true;
                        }
                        case "CPH1715": {
                            return true;
                        }
                        case "CPY83_I00": {
                            return true;
                        }
                        case "ComioS1": {
                            return true;
                        }
                        case "DM-01K": {
                            return true;
                        }
                        case "E5643": {
                            return true;
                        }
                        case "ELUGA_A3_Pro": {
                            return true;
                        }
                        case "ELUGA_Note": {
                            return true;
                        }
                        case "ELUGA_Prim": {
                            return true;
                        }
                        case "ELUGA_Ray_X": {
                            return true;
                        }
                        case "EverStar_S": {
                            return true;
                        }
                        case "F01H": {
                            return true;
                        }
                        case "F01J": {
                            return true;
                        }
                        case "F02H": {
                            return true;
                        }
                        case "F03H": {
                            return true;
                        }
                        case "F04H": {
                            return true;
                        }
                        case "F04J": {
                            return true;
                        }
                        case "F3111": {
                            return true;
                        }
                        case "F3113": {
                            return true;
                        }
                        case "F3116": {
                            return true;
                        }
                        case "F3211": {
                            return true;
                        }
                        case "F3213": {
                            return true;
                        }
                        case "F3215": {
                            return true;
                        }
                        case "F3311": {
                            return true;
                        }
                        case "GIONEE_GBL7360": {
                            return true;
                        }
                        case "GIONEE_SWW1609": {
                            return true;
                        }
                        case "GIONEE_SWW1627": {
                            return true;
                        }
                        case "GIONEE_SWW1631": {
                            return true;
                        }
                        case "GIONEE_WBL5708": {
                            return true;
                        }
                        case "GIONEE_WBL7365": {
                            return true;
                        }
                        case "GIONEE_WBL7519": {
                            return true;
                        }
                        case "GiONEE_CBL7513": {
                            return true;
                        }
                        case "GiONEE_GBL7319": {
                            return true;
                        }
                        case "HWBLN-H": {
                            return true;
                        }
                        case "HWCAM-H": {
                            return true;
                        }
                        case "HWVNS-H": {
                            return true;
                        }
                        case "HWWAS-H": {
                            return true;
                        }
                        case "Infinix-X572": {
                            return true;
                        }
                        case "JGZ": {
                            return true;
                        }
                        case "K50a40": {
                            return true;
                        }
                        case "LS-5017": {
                            return true;
                        }
                        case "M04": {
                            return true;
                        }
                        case "M5c": {
                            return true;
                        }
                        case "MEIZU_M5": {
                            return true;
                        }
                        case "MX6": {
                            return true;
                        }
                        case "NX541J": {
                            return true;
                        }
                        case "NX573J": {
                            return true;
                        }
                        case "OnePlus5T": {
                            return true;
                        }
                        case "P681": {
                            return true;
                        }
                        case "P85": {
                            return true;
                        }
                        case "PB2-670M": {
                            return true;
                        }
                        case "PGN528": {
                            return true;
                        }
                        case "PGN610": {
                            return true;
                        }
                        case "PGN611": {
                            return true;
                        }
                        case "PLE": {
                            return true;
                        }
                        case "PRO7S": {
                            return true;
                        }
                        case "Phantom6": {
                            return true;
                        }
                        case "Pixi4-7_3G": {
                            return true;
                        }
                        case "Pixi5-10_4G": {
                            return true;
                        }
                        case "Q350": {
                            return true;
                        }
                        case "Q4260": {
                            return true;
                        }
                        case "Q427": {
                            return true;
                        }
                        case "Q4310": {
                            return true;
                        }
                        case "Q5": {
                            return true;
                        }
                        case "QM16XE_U": {
                            return true;
                        }
                        case "QX1": {
                            return true;
                        }
                        case "RAIJIN": {
                            return true;
                        }
                        case "SVP-DTV15": {
                            return true;
                        }
                        case "Slate_Pro": {
                            return true;
                        }
                        case "TB3-730F": {
                            return true;
                        }
                        case "TB3-730X": {
                            return true;
                        }
                        case "TB3-850F": {
                            return true;
                        }
                        case "TB3-850M": {
                            return true;
                        }
                        case "V1": {
                            return true;
                        }
                        case "V23GB": {
                            return true;
                        }
                        case "V5": {
                            return true;
                        }
                        case "X3_HK": {
                            return true;
                        }
                        case "XE2X": {
                            return true;
                        }
                        case "XT1663": {
                            return true;
                        }
                        case "Z12_PRO": {
                            return true;
                        }
                        case "Z80": {
                            return true;
                        }
                        case "b5": {
                            return true;
                        }
                        case "cv1": {
                            return true;
                        }
                        case "cv3": {
                            return true;
                        }
                        case "deb": {
                            return true;
                        }
                        case "flo": {
                            return true;
                        }
                        case "fugu": {
                            return true;
                        }
                        case "griffin": {
                            return true;
                        }
                        case "htc_e56ml_dtul": {
                            return true;
                        }
                        case "hwALE-H": {
                            return true;
                        }
                        case "i9031": {
                            return true;
                        }
                        case "iball8735_9806": {
                            return true;
                        }
                        case "iris60": {
                            return true;
                        }
                        case "itel_S41": {
                            return true;
                        }
                        case "j2xlteins": {
                            return true;
                        }
                        case "kate": {
                            return true;
                        }
                        case "l5460": {
                            return true;
                        }
                        case "le_x6": {
                            return true;
                        }
                        case "manning": {
                            return true;
                        }
                        case "marino_f": {
                            return true;
                        }
                        case "mh": {
                            return true;
                        }
                        case "mido": {
                            return true;
                        }
                        case "namath": {
                            return true;
                        }
                        case "nicklaus_f": {
                            return true;
                        }
                        case "p212": {
                            return true;
                        }
                        case "pacificrim": {
                            return true;
                        }
                        case "panell_d": {
                            return true;
                        }
                        case "panell_dl": {
                            return true;
                        }
                        case "panell_ds": {
                            return true;
                        }
                        case "panell_dt": {
                            return true;
                        }
                        case "s905x018": {
                            return true;
                        }
                        case "santoni": {
                            return true;
                        }
                        case "taido_row": {
                            return true;
                        }
                        case "tcl_eu": {
                            return true;
                        }
                        case "vernee_M5": {
                            return true;
                        }
                        case "watson": {
                            return true;
                        }
                        case "whyred": {
                            return true;
                        }
                        case "woods_f": {
                            return true;
                        }
                        case "woods_fn": {
                            return true;
                        }
                        default: {
                            return s.equals("JSN-L21");
                        }
                    }
                }
                return false;
            }
        }
    }

    protected long e2() [...] // Inlined contents

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void f() {
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.f();
            return;
        }
        this.W9.a();
    }

    public static int f2(MediaCodecInfo mediaCodecInfo0, Format format0) {
        int v = format0.t;
        int v1 = format0.u;
        if(v != -1 && v1 != -1) {
            String s = (String)Assertions.g(format0.n);
            if("video/dolby-vision".equals(s)) {
                Pair pair0 = MediaCodecUtil.s(format0);
                if(pair0 == null) {
                    s = "video/hevc";
                }
                else {
                    switch(((int)(((Integer)pair0.first)))) {
                        case 1: 
                        case 2: 
                        case 0x200: {
                            s = "video/avc";
                            break;
                        }
                        default: {
                            s = "video/hevc";
                        }
                    }
                }
            }
            s.hashCode();
            switch(s) {
                case "video/3gpp": {
                    return v * v1 * 3 / 4;
                }
                case "video/av01": {
                    return v * v1 * 3 / 4;
                }
                case "video/avc": {
                    return "BRAVIA 4K 2015".equals(Util.d) || "Amazon".equals(Util.c) && ("KFSOWI".equals(Util.d) || "AFTS".equals(Util.d) && mediaCodecInfo0.g) ? -1 : (v + 15) / 16 * ((v1 + 15) / 16) * 0x300 / 4;
                }
                case "video/hevc": {
                    return Math.max(0x200000, v * v1 * 3 / 4);
                }
                case "video/mp4v-es": {
                    return v * v1 * 3 / 4;
                }
                case "video/x-vnd.on2.vp8": {
                    return v * v1 * 3 / 4;
                }
                case "video/x-vnd.on2.vp9": {
                    return v * v1 * 3 / 8;
                }
                default: {
                    return -1;
                }
            }
        }
        return -1;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void g1(Exception exception0) {
        Log.e("MediaCodecVideoRenderer", "Video codec error", exception0);
        this.T9.C(exception0);
    }

    @Nullable
    private static Point g2(MediaCodecInfo mediaCodecInfo0, Format format0) {
        int v = format0.u;
        int v1 = format0.t;
        int v2 = 0;
        boolean z = v > v1;
        int v3 = z ? v : v1;
        if(z) {
            v = v1;
        }
        int[] arr_v = MediaCodecVideoRenderer.Ca;
        while(v2 < arr_v.length) {
            int v4 = arr_v[v2];
            int v5 = (int)(((float)v4) * (((float)v) / ((float)v3)));
            if(v4 <= v3 || v5 <= v) {
                break;
            }
            if(Util.a >= 21) {
                int v6 = z ? v5 : v4;
                if(!z) {
                    v4 = v5;
                }
                Point point0 = mediaCodecInfo0.b(v6, v4);
                if(point0 != null && mediaCodecInfo0.w(point0.x, point0.y, ((double)format0.v))) {
                    return point0;
                }
            }
            else {
                try {
                    int v7 = (v4 + 15) / 16 * 16;
                    int v8 = (v5 + 15) / 16 * 16;
                    if(v7 * v8 <= MediaCodecUtil.Q()) {
                        int v9 = z ? v8 : v7;
                        if(!z) {
                            v7 = v8;
                        }
                        return new Point(v9, v7);
                    }
                    ++v2;
                    continue;
                }
                catch(DecoderQueryException unused_ex) {
                }
                break;
            }
            ++v2;
        }
        return null;
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void h1(String s, Configuration mediaCodecAdapter$Configuration0, long v, long v1) {
        this.T9.k(s, v, v1);
        this.Z9 = this.Z1(s);
        this.aa = ((MediaCodecInfo)Assertions.g(this.F0())).p();
        this.w2();
    }

    protected CodecMaxValues h2(MediaCodecInfo mediaCodecInfo0, Format format0, Format[] arr_format) {
        int v = format0.t;
        int v1 = format0.u;
        int v2 = MediaCodecVideoRenderer.j2(mediaCodecInfo0, format0);
        if(arr_format.length == 1) {
            if(v2 != -1) {
                int v3 = MediaCodecVideoRenderer.f2(mediaCodecInfo0, format0);
                if(v3 != -1) {
                    v2 = Math.min(((int)(((float)v2) * 1.5f)), v3);
                }
            }
            return new CodecMaxValues(v, v1, v2);
        }
        int v5 = 0;
        for(int v4 = 0; v4 < arr_format.length; ++v4) {
            Format format1 = arr_format[v4];
            if(format0.A != null && format1.A == null) {
                format1 = format1.a().P(format0.A).K();
            }
            if(mediaCodecInfo0.e(format0, format1).d != 0) {
                v5 |= (format1.t == -1 || format1.u == -1 ? 1 : 0);
                v = Math.max(v, format1.t);
                v1 = Math.max(v1, format1.u);
                v2 = Math.max(v2, MediaCodecVideoRenderer.j2(mediaCodecInfo0, format1));
            }
        }
        if(v5 != 0) {
            Log.n("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + v + "x" + v1);
            Point point0 = MediaCodecVideoRenderer.g2(mediaCodecInfo0, format0);
            if(point0 != null) {
                v = Math.max(v, point0.x);
                v1 = Math.max(v1, point0.y);
                v2 = Math.max(v2, MediaCodecVideoRenderer.f2(mediaCodecInfo0, format0.a().v0(v).Y(v1).K()));
                Log.n("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + v + "x" + v1);
            }
        }
        return new CodecMaxValues(v, v1, v2);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation i0(MediaCodecInfo mediaCodecInfo0, Format format0, Format format1) {
        DecoderReuseEvaluation decoderReuseEvaluation0 = mediaCodecInfo0.e(format0, format1);
        int v = decoderReuseEvaluation0.e;
        CodecMaxValues mediaCodecVideoRenderer$CodecMaxValues0 = (CodecMaxValues)Assertions.g(this.Y9);
        if(format1.t > mediaCodecVideoRenderer$CodecMaxValues0.a || format1.u > mediaCodecVideoRenderer$CodecMaxValues0.b) {
            v |= 0x100;
        }
        if(MediaCodecVideoRenderer.j2(mediaCodecInfo0, format1) > mediaCodecVideoRenderer$CodecMaxValues0.c) {
            v |= 0x40;
        }
        return v == 0 ? new DecoderReuseEvaluation(mediaCodecInfo0.a, format0, format1, decoderReuseEvaluation0.d, 0) : new DecoderReuseEvaluation(mediaCodecInfo0.a, format0, format1, 0, v);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void i1(String s) {
        this.T9.l(s);
    }

    private static List i2(Context context0, MediaCodecSelector mediaCodecSelector0, Format format0, boolean z, boolean z1) throws DecoderQueryException {
        String s = format0.n;
        if(s == null) {
            return O2.A();
        }
        if(Util.a >= 26 && "video/dolby-vision".equals(s) && !Api26.a(context0)) {
            List list0 = MediaCodecUtil.o(mediaCodecSelector0, format0, z, z1);
            return list0.isEmpty() ? MediaCodecUtil.w(mediaCodecSelector0, format0, z, z1) : list0;
        }
        return MediaCodecUtil.w(mediaCodecSelector0, format0, z, z1);
    }

    // 去混淆评级： 低(35)
    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean isReady() {
        boolean z = super.isReady() && (this.ba == null || this.ba.isReady());
        return !z || (this.fa == null || this.ea != this.fa) && this.D0() != null && !this.ta ? this.W9.d(z) : true;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    protected DecoderReuseEvaluation j1(FormatHolder formatHolder0) throws ExoPlaybackException {
        DecoderReuseEvaluation decoderReuseEvaluation0 = super.j1(formatHolder0);
        Format format0 = (Format)Assertions.g(formatHolder0.b);
        this.T9.p(format0, decoderReuseEvaluation0);
        return decoderReuseEvaluation0;
    }

    protected static int j2(MediaCodecInfo mediaCodecInfo0, Format format0) {
        if(format0.o != -1) {
            int v = format0.q.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                v2 += ((byte[])format0.q.get(v1)).length;
            }
            return format0.o + v2;
        }
        return MediaCodecVideoRenderer.f2(mediaCodecInfo0, format0);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
        switch(v) {
            case 1: {
                this.H2(object0);
                break;
            }
            case 4: {
                this.ia = (int)(((Integer)Assertions.g(object0)));
                MediaCodecAdapter mediaCodecAdapter0 = this.D0();
                if(mediaCodecAdapter0 != null) {
                    mediaCodecAdapter0.g(this.ia);
                    return;
                }
                break;
            }
            case 5: {
                int v1 = (int)(((Integer)Assertions.g(object0)));
                this.W9.n(v1);
                return;
            }
            case 7: {
                VideoFrameMetadataListener videoFrameMetadataListener0 = (VideoFrameMetadataListener)Assertions.g(object0);
                this.wa = videoFrameMetadataListener0;
                VideoSink videoSink1 = this.ba;
                if(videoSink1 != null) {
                    videoSink1.e(videoFrameMetadataListener0);
                    return;
                }
                break;
            }
            case 10: {
                int v2 = (int)(((Integer)Assertions.g(object0)));
                if(this.ua != v2) {
                    this.ua = v2;
                    if(this.ta) {
                        this.v1();
                        return;
                    }
                }
                break;
            }
            case 13: {
                this.J2(((List)Assertions.g(object0)));
                return;
            }
            case 14: {
                Size size0 = (Size)Assertions.g(object0);
                if(size0.b() != 0 && size0.a() != 0) {
                    this.ga = size0;
                    VideoSink videoSink0 = this.ba;
                    if(videoSink0 != null) {
                        videoSink0.c(((Surface)Assertions.k(this.ea)), size0);
                        return;
                    }
                }
                break;
            }
            case 16: {
                this.sa = (int)(((Integer)Assertions.g(object0)));
                this.Q2();
                return;
            }
            default: {
                super.k(v, object0);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void k1(Format format0, @Nullable MediaFormat mediaFormat0) {
        int v1;
        int v;
        MediaCodecAdapter mediaCodecAdapter0 = this.D0();
        if(mediaCodecAdapter0 != null) {
            mediaCodecAdapter0.g(this.ia);
        }
        if(this.ta) {
            v = format0.t;
            v1 = format0.u;
        }
        else {
            Assertions.g(mediaFormat0);
            boolean z = mediaFormat0.containsKey("crop-right") && mediaFormat0.containsKey("crop-left") && mediaFormat0.containsKey("crop-bottom") && mediaFormat0.containsKey("crop-top");
            int v2 = z ? mediaFormat0.getInteger("crop-right") - mediaFormat0.getInteger("crop-left") + 1 : mediaFormat0.getInteger("width");
            v1 = z ? mediaFormat0.getInteger("crop-bottom") - mediaFormat0.getInteger("crop-top") + 1 : mediaFormat0.getInteger("height");
            v = v2;
        }
        float f = format0.x;
        if(format0.w == 90 || format0.w == 270) {
            f = 1.0f / f;
            int v3 = v1;
            v1 = v;
            v = v3;
        }
        this.qa = new VideoSize(v, v1, 0, f);
        if(this.ba != null) {
            this.ba.s(1, format0.a().v0(v).Y(v1).n0(0).k0(f).K());
            return;
        }
        this.W9.p(format0.v);
    }

    private static int k2(int v, int v1) [...] // Inlined contents

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat l2(Format format0, String s, CodecMaxValues mediaCodecVideoRenderer$CodecMaxValues0, float f, boolean z, int v) {
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", s);
        mediaFormat0.setInteger("width", format0.t);
        mediaFormat0.setInteger("height", format0.u);
        MediaFormatUtil.x(mediaFormat0, format0.q);
        MediaFormatUtil.r(mediaFormat0, "frame-rate", format0.v);
        MediaFormatUtil.s(mediaFormat0, "rotation-degrees", format0.w);
        MediaFormatUtil.q(mediaFormat0, format0.A);
        if("video/dolby-vision".equals(format0.n)) {
            Pair pair0 = MediaCodecUtil.s(format0);
            if(pair0 != null) {
                MediaFormatUtil.s(mediaFormat0, "profile", ((int)(((Integer)pair0.first))));
            }
        }
        mediaFormat0.setInteger("max-width", mediaCodecVideoRenderer$CodecMaxValues0.a);
        mediaFormat0.setInteger("max-height", mediaCodecVideoRenderer$CodecMaxValues0.b);
        MediaFormatUtil.s(mediaFormat0, "max-input-size", mediaCodecVideoRenderer$CodecMaxValues0.c);
        int v1 = Util.a;
        if(v1 >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(z) {
            mediaFormat0.setInteger("no-post-process", 1);
            mediaFormat0.setInteger("auto-frc", 0);
        }
        if(v != 0) {
            MediaCodecVideoRenderer.a2(mediaFormat0, v);
        }
        if(v1 >= 35) {
            mediaFormat0.setInteger("importance", Math.max(0, -this.sa));
        }
        return mediaFormat0;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void m1(long v) {
        super.m1(v);
        if(!this.ta) {
            --this.ma;
        }
    }

    @Nullable
    protected Surface m2() {
        return this.ea;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void n1() {
        super.n1();
        VideoSink videoSink0 = this.ba;
        if(videoSink0 == null) {
            this.W9.j();
        }
        else {
            videoSink0.k(this.O0(), 0L);
        }
        this.w2();
    }

    protected boolean n2(long v, boolean z) throws ExoPlaybackException {
        int v1 = this.e0(v);
        if(v1 == 0) {
            return false;
        }
        if(z) {
            this.u9.d += v1;
            this.u9.f += this.ma;
        }
        else {
            ++this.u9.j;
            this.R2(v1, this.ma);
        }
        this.A0();
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            videoSink0.x(false);
        }
        return true;
    }

    @Override  // androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameTimingEvaluator
    public boolean o(long v, long v1) {
        return this.M2(v, v1);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void o1(DecoderInputBuffer decoderInputBuffer0) throws ExoPlaybackException {
        boolean z = this.ta;
        if(!z) {
            ++this.ma;
        }
        if(Util.a < 23 && z) {
            this.z2(decoderInputBuffer0.f);
        }
    }

    private void o2() {
        if(this.ka > 0) {
            long v = this.I().elapsedRealtime();
            this.T9.n(this.ka, v - this.ja);
            this.ka = 0;
            this.ja = v;
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void p1(Format format0) throws ExoPlaybackException {
        if(this.ba != null && !this.ba.isInitialized()) {
            try {
                this.ba.l(format0);
            }
            catch(VideoSinkException videoSink$VideoSinkException0) {
                throw this.G(videoSink$VideoSinkException0, format0, 7000);
            }
        }
    }

    private void p2() {
        if(this.W9.i() && this.ea != null) {
            this.y2();
        }
    }

    @Override  // androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameTimingEvaluator
    public boolean q(long v, long v1, boolean z) {
        return this.L2(v, v1, z);
    }

    private void q2() {
        int v = this.oa;
        if(v != 0) {
            this.T9.B(this.na, v);
            this.na = 0L;
            this.oa = 0;
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException r0(Throwable throwable0, @Nullable MediaCodecInfo mediaCodecInfo0) {
        return new MediaCodecVideoDecoderException(throwable0, mediaCodecInfo0, this.ea);
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean r1(long v, long v1, @Nullable MediaCodecAdapter mediaCodecAdapter0, @Nullable ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, Format format0) throws ExoPlaybackException {
        Assertions.g(mediaCodecAdapter0);
        long v6 = v5 - this.O0();
        int v7 = this.W9.c(v5, v, v1, this.P0(), z1, this.X9);
        if(v7 == 4) {
            return false;
        }
        if(z && !z1) {
            this.P2(mediaCodecAdapter0, v2, v6);
            return true;
        }
        if(this.ea == this.fa && this.ba == null) {
            if(this.X9.f() < 30000L) {
                this.P2(mediaCodecAdapter0, v2, v6);
                this.S2(this.X9.f());
                return true;
            }
            return false;
        }
        VideoSink videoSink0 = this.ba;
        if(videoSink0 != null) {
            try {
                videoSink0.d(v, v1);
            }
            catch(VideoSinkException videoSink$VideoSinkException0) {
                throw this.G(videoSink$VideoSinkException0, videoSink$VideoSinkException0.a, 7001);
            }
            long v8 = this.ba.i(v5, z1);
            if(v8 == 0x8000000000000001L) {
                return false;
            }
            this.E2(mediaCodecAdapter0, v2, v6, v8);
            return true;
        }
        switch(v7) {
            case 0: {
                long v9 = this.I().nanoTime();
                this.x2(v6, v9, format0);
                this.E2(mediaCodecAdapter0, v2, v6, v9);
                this.S2(this.X9.f());
                return true;
            }
            case 1: {
                return this.s2(((MediaCodecAdapter)Assertions.k(mediaCodecAdapter0)), v2, v6, format0);
            }
            case 2: {
                this.c2(mediaCodecAdapter0, v2, v6);
                this.S2(this.X9.f());
                return true;
            }
            case 3: {
                this.P2(mediaCodecAdapter0, v2, v6);
                this.S2(this.X9.f());
                return true;
            }
            case 5: {
                return false;
            }
            default: {
                throw new IllegalStateException(String.valueOf(v7));
            }
        }
    }

    private void r2(VideoSize videoSize0) {
        if(!videoSize0.equals(VideoSize.i) && !videoSize0.equals(this.ra)) {
            this.ra = videoSize0;
            this.T9.D(videoSize0);
        }
    }

    private boolean s2(MediaCodecAdapter mediaCodecAdapter0, int v, long v1, Format format0) {
        long v2 = this.X9.g();
        long v3 = this.X9.f();
        if(Util.a >= 21) {
            if(v2 == this.pa) {
                this.P2(mediaCodecAdapter0, v, v1);
            }
            else {
                this.x2(v1, v2, format0);
                this.F2(mediaCodecAdapter0, v, v1, v2);
            }
            this.S2(v3);
            this.pa = v2;
            return true;
        }
        if(v3 < 30000L) {
            if(v3 > 11000L) {
                try {
                    Thread.sleep((v3 - 10000L) / 1000L);
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            this.x2(v1, v2, format0);
            this.D2(mediaCodecAdapter0, v, v1);
            this.S2(v3);
            return true;
        }
        return false;
    }

    private void t2() {
        Surface surface0 = this.ea;
        if(surface0 != null && this.ha) {
            this.T9.A(surface0);
        }
    }

    private void u2() {
        VideoSize videoSize0 = this.ra;
        if(videoSize0 != null) {
            this.T9.D(videoSize0);
        }
    }

    private void v2(MediaFormat mediaFormat0) {
        if(this.ba != null && !this.ba.t()) {
            mediaFormat0.setInteger("allow-frame-drop", 0);
        }
    }

    private void w2() {
        if(this.ta) {
            int v = Util.a;
            if(v >= 23) {
                MediaCodecAdapter mediaCodecAdapter0 = this.D0();
                if(mediaCodecAdapter0 == null) {
                    return;
                }
                this.va = new OnFrameRenderedListenerV23(this, mediaCodecAdapter0);
                if(v >= 33) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putInt("tunnel-peek", 1);
                    mediaCodecAdapter0.a(bundle0);
                }
            }
        }
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void x1() {
        super.x1();
        this.ma = 0;
    }

    private void x2(long v, long v1, Format format0) {
        VideoFrameMetadataListener videoFrameMetadataListener0 = this.wa;
        if(videoFrameMetadataListener0 != null) {
            videoFrameMetadataListener0.l(v, v1, format0, this.J0());
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameTimingEvaluator
    public boolean y(long v, long v1, long v2, boolean z, boolean z1) throws ExoPlaybackException {
        return this.K2(v, v2, z) && this.n2(v1, z1);
    }

    @m({"displaySurface"})
    private void y2() {
        this.T9.A(this.ea);
        this.ha = true;
    }

    protected void z2(long v) throws ExoPlaybackException {
        this.Q1(v);
        this.r2(this.qa);
        ++this.u9.e;
        this.p2();
        this.m1(v);
    }
}

