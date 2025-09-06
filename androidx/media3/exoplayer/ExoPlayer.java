package androidx.media3.exoplayer;

import O1.a;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource.Factory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Q;
import com.google.common.base.t;
import java.util.List;

public interface ExoPlayer extends Player {
    @UnstableApi
    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void C(AudioAttributes arg1, boolean arg2);

        @Deprecated
        AudioAttributes d();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        float getVolume();

        @Deprecated
        boolean h();

        @Deprecated
        void j(AuxEffectInfo arg1);

        @Deprecated
        void k(int arg1);

        @Deprecated
        void o(float arg1);

        @Deprecated
        void r(boolean arg1);

        @Deprecated
        void y();
    }

    @UnstableApi
    public interface AudioOffloadListener {
        void A(boolean arg1);

        void u(boolean arg1);
    }

    public static final class Builder {
        long A;
        long B;
        boolean C;
        boolean D;
        @Nullable
        Looper E;
        boolean F;
        boolean G;
        String H;
        boolean I;
        final Context a;
        Clock b;
        long c;
        Q d;
        Q e;
        Q f;
        Q g;
        Q h;
        t i;
        Looper j;
        int k;
        @Nullable
        PriorityTaskManager l;
        AudioAttributes m;
        boolean n;
        int o;
        boolean p;
        boolean q;
        boolean r;
        int s;
        int t;
        boolean u;
        SeekParameters v;
        long w;
        long x;
        long y;
        LivePlaybackSpeedControl z;

        public Builder(Context context0) {
            this(context0, () -> new DefaultRenderersFactory(context0), () -> new DefaultMediaSourceFactory(context0, new DefaultExtractorsFactory()));
        }

        @UnstableApi
        public Builder(Context context0, RenderersFactory renderersFactory0) {
            this(context0, () -> renderersFactory0, () -> new DefaultMediaSourceFactory(context0, new DefaultExtractorsFactory()));
            Assertions.g(renderersFactory0);
        }

        @UnstableApi
        public Builder(Context context0, RenderersFactory renderersFactory0, Factory mediaSource$Factory0) {
            this(context0, () -> renderersFactory0, () -> mediaSource$Factory0);
            Assertions.g(renderersFactory0);
            Assertions.g(mediaSource$Factory0);
        }

        @UnstableApi
        public Builder(Context context0, RenderersFactory renderersFactory0, Factory mediaSource$Factory0, TrackSelector trackSelector0, LoadControl loadControl0, BandwidthMeter bandwidthMeter0, AnalyticsCollector analyticsCollector0) {
            this(context0, () -> renderersFactory0, () -> mediaSource$Factory0, () -> trackSelector0, () -> loadControl0, () -> bandwidthMeter0, (Clock clock0) -> analyticsCollector0);
            Assertions.g(renderersFactory0);
            Assertions.g(mediaSource$Factory0);
            Assertions.g(trackSelector0);
            Assertions.g(bandwidthMeter0);
            Assertions.g(analyticsCollector0);
        }

        @UnstableApi
        public Builder(Context context0, Factory mediaSource$Factory0) {
            this(context0, () -> new DefaultRenderersFactory(context0), () -> mediaSource$Factory0);
            Assertions.g(mediaSource$Factory0);
        }

        private Builder(Context context0, Q q0, Q q1) {
            this(context0, q0, q1, () -> new DefaultTrackSelector(context0), new F(), new G(context0), new H());
        }

        private Builder(Context context0, Q q0, Q q1, Q q2, Q q3, Q q4, t t0) {
            this.a = (Context)Assertions.g(context0);
            this.d = q0;
            this.e = q1;
            this.f = q2;
            this.g = q3;
            this.h = q4;
            this.i = t0;
            this.j = Util.k0();
            this.m = AudioAttributes.g;
            this.o = 0;
            this.s = 1;
            this.t = 0;
            this.u = true;
            this.v = SeekParameters.g;
            this.w = 5000L;
            this.x = 15000L;
            this.y = 3000L;
            this.z = new androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder().a();
            this.b = Clock.a;
            this.A = 500L;
            this.B = 2000L;
            this.D = true;
            this.H = "";
            this.k = -1000;
        }

        // 检测为 Lambda 实现
        private static RenderersFactory A(Context context0) [...]

        // 检测为 Lambda 实现
        private static Factory B(Context context0) [...]

        private static TrackSelector C(TrackSelector trackSelector0) [...] // Inlined contents

        private static LoadControl D(LoadControl loadControl0) [...] // Inlined contents

        private static BandwidthMeter E(BandwidthMeter bandwidthMeter0) [...] // Inlined contents

        private static AnalyticsCollector F(AnalyticsCollector analyticsCollector0, Clock clock0) [...] // Inlined contents

        // 检测为 Lambda 实现
        private static TrackSelector G(Context context0) [...]

        private static RenderersFactory I(RenderersFactory renderersFactory0) [...] // Inlined contents

        // 检测为 Lambda 实现
        private static Factory J(Context context0) [...]

        // 检测为 Lambda 实现
        private static RenderersFactory K(Context context0) [...]

        private static Factory L(Factory mediaSource$Factory0) [...] // Inlined contents

        private static RenderersFactory M(RenderersFactory renderersFactory0) [...] // Inlined contents

        private static Factory N(Factory mediaSource$Factory0) [...] // Inlined contents

        private static RenderersFactory O(RenderersFactory renderersFactory0) [...] // Inlined contents

        private static Factory P(Factory mediaSource$Factory0) [...] // Inlined contents

        private static AnalyticsCollector Q(AnalyticsCollector analyticsCollector0, Clock clock0) [...] // Inlined contents

        private static BandwidthMeter R(BandwidthMeter bandwidthMeter0) [...] // Inlined contents

        private static LoadControl S(LoadControl loadControl0) [...] // Inlined contents

        private static Factory T(Factory mediaSource$Factory0) [...] // Inlined contents

        private static RenderersFactory U(RenderersFactory renderersFactory0) [...] // Inlined contents

        private static TrackSelector V(TrackSelector trackSelector0) [...] // Inlined contents

        @a
        @UnstableApi
        public Builder W(AnalyticsCollector analyticsCollector0) {
            Assertions.i(!this.F);
            Assertions.g(analyticsCollector0);
            this.i = (Clock clock0) -> analyticsCollector0;
            return this;
        }

        @a
        public Builder X(AudioAttributes audioAttributes0, boolean z) {
            Assertions.i(!this.F);
            this.m = (AudioAttributes)Assertions.g(audioAttributes0);
            this.n = z;
            return this;
        }

        @a
        @UnstableApi
        public Builder Y(BandwidthMeter bandwidthMeter0) {
            Assertions.i(!this.F);
            Assertions.g(bandwidthMeter0);
            this.h = () -> bandwidthMeter0;
            return this;
        }

        @a
        @VisibleForTesting
        @UnstableApi
        public Builder Z(Clock clock0) {
            Assertions.i(!this.F);
            this.b = clock0;
            return this;
        }

        // 检测为 Lambda 实现
        public static RenderersFactory a(RenderersFactory renderersFactory0) [...]

        @a
        @UnstableApi
        public Builder a0(long v) {
            Assertions.i(!this.F);
            this.B = v;
            return this;
        }

        @a
        @UnstableApi
        public Builder b0(boolean z) {
            Assertions.i(!this.F);
            this.r = z;
            return this;
        }

        // 检测为 Lambda 实现
        public static Factory c(Factory mediaSource$Factory0) [...]

        @a
        public Builder c0(boolean z) {
            Assertions.i(!this.F);
            this.p = z;
            return this;
        }

        @a
        @UnstableApi
        public Builder d0(LivePlaybackSpeedControl livePlaybackSpeedControl0) {
            Assertions.i(!this.F);
            this.z = (LivePlaybackSpeedControl)Assertions.g(livePlaybackSpeedControl0);
            return this;
        }

        @a
        @UnstableApi
        public Builder e0(LoadControl loadControl0) {
            Assertions.i(!this.F);
            Assertions.g(loadControl0);
            this.g = () -> loadControl0;
            return this;
        }

        // 检测为 Lambda 实现
        public static RenderersFactory f(RenderersFactory renderersFactory0) [...]

        @a
        @UnstableApi
        public Builder f0(Looper looper0) {
            Assertions.i(!this.F);
            Assertions.g(looper0);
            this.j = looper0;
            return this;
        }

        // 检测为 Lambda 实现
        public static LoadControl g(LoadControl loadControl0) [...]

        @a
        @UnstableApi
        public Builder g0(@IntRange(from = 0L) long v) {
            Assertions.a(v >= 0L);
            Assertions.i(!this.F);
            this.y = v;
            return this;
        }

        // 检测为 Lambda 实现
        public static Factory h(Factory mediaSource$Factory0) [...]

        @a
        public Builder h0(Factory mediaSource$Factory0) {
            Assertions.i(!this.F);
            Assertions.g(mediaSource$Factory0);
            this.e = () -> mediaSource$Factory0;
            return this;
        }

        // 检测为 Lambda 实现
        public static BandwidthMeter i(BandwidthMeter bandwidthMeter0) [...]

        @a
        @UnstableApi
        public Builder i0(String s) {
            Assertions.i(!this.F);
            this.H = s;
            return this;
        }

        // 检测为 Lambda 实现
        public static Factory j(Factory mediaSource$Factory0) [...]

        @a
        @UnstableApi
        public Builder j0(boolean z) {
            Assertions.i(!this.F);
            this.C = z;
            return this;
        }

        @a
        @UnstableApi
        public Builder k0(Looper looper0) {
            Assertions.i(!this.F);
            this.E = looper0;
            return this;
        }

        @a
        @UnstableApi
        public Builder l0(int v) {
            Assertions.i(!this.F);
            this.k = v;
            return this;
        }

        // 检测为 Lambda 实现
        public static TrackSelector m(TrackSelector trackSelector0) [...]

        @a
        @UnstableApi
        public Builder m0(@Nullable PriorityTaskManager priorityTaskManager0) {
            Assertions.i(!this.F);
            this.l = priorityTaskManager0;
            return this;
        }

        // 检测为 Lambda 实现
        public static RenderersFactory n(RenderersFactory renderersFactory0) [...]

        @a
        @UnstableApi
        public Builder n0(long v) {
            Assertions.i(!this.F);
            this.A = v;
            return this;
        }

        // 检测为 Lambda 实现
        public static AnalyticsCollector o(AnalyticsCollector analyticsCollector0, Clock clock0) [...]

        @a
        @UnstableApi
        public Builder o0(RenderersFactory renderersFactory0) {
            Assertions.i(!this.F);
            Assertions.g(renderersFactory0);
            this.d = () -> renderersFactory0;
            return this;
        }

        // 检测为 Lambda 实现
        public static Factory p(Factory mediaSource$Factory0) [...]

        @a
        @UnstableApi
        public Builder p0(@IntRange(from = 1L) long v) {
            Assertions.a(v > 0L);
            Assertions.i(!this.F);
            this.w = v;
            return this;
        }

        // 检测为 Lambda 实现
        public static RenderersFactory q(RenderersFactory renderersFactory0) [...]

        @a
        @UnstableApi
        public Builder q0(@IntRange(from = 1L) long v) {
            Assertions.a(v > 0L);
            Assertions.i(!this.F);
            this.x = v;
            return this;
        }

        // 检测为 Lambda 实现
        public static AnalyticsCollector r(AnalyticsCollector analyticsCollector0, Clock clock0) [...]

        @a
        @UnstableApi
        public Builder r0(SeekParameters seekParameters0) {
            Assertions.i(!this.F);
            this.v = (SeekParameters)Assertions.g(seekParameters0);
            return this;
        }

        // 检测为 Lambda 实现
        public static TrackSelector s(TrackSelector trackSelector0) [...]

        @a
        @UnstableApi
        public Builder s0(boolean z) {
            Assertions.i(!this.F);
            this.q = z;
            return this;
        }

        // 检测为 Lambda 实现
        public static BandwidthMeter t(BandwidthMeter bandwidthMeter0) [...]

        @a
        @UnstableApi
        public Builder t0(boolean z) {
            Assertions.i(!this.F);
            this.G = z;
            return this;
        }

        @a
        @UnstableApi
        public Builder u0(TrackSelector trackSelector0) {
            Assertions.i(!this.F);
            Assertions.g(trackSelector0);
            this.f = () -> trackSelector0;
            return this;
        }

        // 检测为 Lambda 实现
        public static LoadControl v(LoadControl loadControl0) [...]

        @a
        @UnstableApi
        public Builder v0(boolean z) {
            Assertions.i(!this.F);
            this.u = z;
            return this;
        }

        public ExoPlayer w() {
            Assertions.i(!this.F);
            this.F = true;
            return new ExoPlayerImpl(this, null);
        }

        @a
        @UnstableApi
        public Builder w0(boolean z) {
            Assertions.i(!this.F);
            this.D = z;
            return this;
        }

        SimpleExoPlayer x() {
            Assertions.i(!this.F);
            this.F = true;
            return new SimpleExoPlayer(this);
        }

        @a
        @UnstableApi
        public Builder x0(int v) {
            Assertions.i(!this.F);
            this.t = v;
            return this;
        }

        @a
        @UnstableApi
        public Builder y(boolean z) {
            Assertions.i(!this.F);
            this.I = z;
            return this;
        }

        @a
        @UnstableApi
        public Builder y0(int v) {
            Assertions.i(!this.F);
            this.s = v;
            return this;
        }

        @a
        @UnstableApi
        public Builder z(long v) {
            Assertions.i(!this.F);
            this.c = v;
            return this;
        }

        @a
        public Builder z0(int v) {
            Assertions.i(!this.F);
            this.o = v;
            return this;
        }
    }

    @UnstableApi
    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        boolean D();

        @Deprecated
        void H();

        @Deprecated
        void U(int arg1);

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        void v(boolean arg1);

        @Deprecated
        void w();

        @Deprecated
        int z();
    }

    @UnstableApi
    public static class PreloadConfiguration {
        public final long a;
        public static final PreloadConfiguration b;

        static {
            PreloadConfiguration.b = new PreloadConfiguration(0x8000000000000001L);
        }

        public PreloadConfiguration(long v) {
            this.a = v;
        }
    }

    @UnstableApi
    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup L();
    }

    @UnstableApi
    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void B(@Nullable TextureView arg1);

        @Deprecated
        void E(CameraMotionListener arg1);

        @Deprecated
        int F();

        @Deprecated
        void G(@Nullable Surface arg1);

        @Deprecated
        int J();

        @Deprecated
        void M(int arg1);

        @Deprecated
        void N(@Nullable TextureView arg1);

        @Deprecated
        VideoSize O();

        @Deprecated
        void Q();

        @Deprecated
        void R(VideoFrameMetadataListener arg1);

        @Deprecated
        void S(@Nullable SurfaceView arg1);

        @Deprecated
        void T(CameraMotionListener arg1);

        @Deprecated
        void e(VideoFrameMetadataListener arg1);

        @Deprecated
        void g(int arg1);

        @Deprecated
        void s(@Nullable Surface arg1);

        @Deprecated
        void t(@Nullable SurfaceView arg1);

        @Deprecated
        void u(@Nullable SurfaceHolder arg1);

        @Deprecated
        void x(@Nullable SurfaceHolder arg1);
    }

    @UnstableApi
    public static final long Z0 = 500L;
    @UnstableApi
    public static final long a1 = 2000L;

    @Override  // androidx.media3.common.Player
    void A(int arg1, MediaItem arg2);

    @Nullable
    @UnstableApi
    @Deprecated
    TextComponent B0();

    @UnstableApi
    PlayerMessage C1(Target arg1);

    @UnstableApi
    void E(CameraMotionListener arg1);

    @Nullable
    @UnstableApi
    Format E1();

    @UnstableApi
    int F();

    @UnstableApi
    int F0();

    @UnstableApi
    void G1(List arg1, boolean arg2);

    @Override  // androidx.media3.common.Player
    void I(int arg1, int arg2, List arg3);

    @UnstableApi
    void I0(int arg1, List arg2);

    @UnstableApi
    int J();

    @UnstableApi
    Renderer J0(int arg1);

    @UnstableApi
    void K(List arg1);

    void K1(boolean arg1);

    @UnstableApi
    void M(int arg1);

    @UnstableApi
    void M0(AudioOffloadListener arg1);

    @UnstableApi
    void O0(List arg1);

    @UnstableApi
    @Deprecated
    void P0(MediaSource arg1);

    @Nullable
    @UnstableApi
    @Deprecated
    AudioComponent Q0();

    void Q1(AnalyticsListener arg1);

    @UnstableApi
    void R(VideoFrameMetadataListener arg1);

    @UnstableApi
    @Deprecated
    TrackSelectionArray S1();

    @UnstableApi
    void T(CameraMotionListener arg1);

    @UnstableApi
    int T1(int arg1);

    @Nullable
    @UnstableApi
    DecoderCounters U0();

    @UnstableApi
    boolean U1();

    @UnstableApi
    boolean V();

    @UnstableApi
    @Deprecated
    void X0(MediaSource arg1, boolean arg2, boolean arg3);

    @UnstableApi
    void Y0(@Nullable PriorityTaskManager arg1);

    @UnstableApi
    void Z(ShuffleOrder arg1);

    @UnstableApi
    Clock a0();

    @UnstableApi
    SeekParameters a1();

    @UnstableApi
    PreloadConfiguration a2();

    @Nullable
    @UnstableApi
    TrackSelector b0();

    @Nullable
    @UnstableApi
    @Deprecated
    DeviceComponent b2();

    @UnstableApi
    AnalyticsCollector c1();

    @UnstableApi
    void d0(@Nullable SeekParameters arg1);

    @UnstableApi
    boolean d1();

    @UnstableApi
    void e(VideoFrameMetadataListener arg1);

    @UnstableApi
    void e0(MediaSource arg1, boolean arg2);

    @Nullable
    @UnstableApi
    Format e2();

    @Override  // androidx.media3.common.Player
    @Nullable
    PlaybackException f();

    @Nullable
    ExoPlaybackException f();

    @UnstableApi
    void f0(AudioOffloadListener arg1);

    @UnstableApi
    void g(int arg1);

    @Nullable
    @UnstableApi
    DecoderCounters g1();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    boolean h();

    @UnstableApi
    void h0(MediaSource arg1, long arg2);

    @UnstableApi
    void h1(int arg1);

    @UnstableApi
    void h2(int arg1, MediaSource arg2);

    @UnstableApi
    void j(AuxEffectInfo arg1);

    @UnstableApi
    void k(int arg1);

    @UnstableApi
    void k2(MediaSource arg1);

    @Nullable
    @UnstableApi
    @Deprecated
    VideoComponent l0();

    @UnstableApi
    Looper m2();

    void o0(AnalyticsListener arg1);

    void p2(int arg1);

    @UnstableApi
    void r(boolean arg1);

    @Override  // androidx.media3.common.Player
    void release();

    @RequiresApi(23)
    @UnstableApi
    void s0(@Nullable AudioDeviceInfo arg1);

    @UnstableApi
    void s1(boolean arg1);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput arg1);

    @UnstableApi
    void u2(MediaSource arg1);

    @UnstableApi
    void w0(boolean arg1);

    @UnstableApi
    void w1(PreloadConfiguration arg1);

    @UnstableApi
    void x0(List arg1, int arg2, long arg3);

    @UnstableApi
    void y();

    @UnstableApi
    @Deprecated
    TrackGroupArray y0();

    @UnstableApi
    boolean z0();

    @UnstableApi
    void z1(List arg1);
}

