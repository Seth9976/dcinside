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
import androidx.media3.common.BasePlayer;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource.Factory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.ExtractorsFactory;
import java.util.List;

@UnstableApi
@Deprecated
public class SimpleExoPlayer extends BasePlayer implements AudioComponent, DeviceComponent, TextComponent, VideoComponent, ExoPlayer {
    @Deprecated
    public static final class Builder {
        private final androidx.media3.exoplayer.ExoPlayer.Builder a;

        @Deprecated
        public Builder(Context context0) {
            this.a = new androidx.media3.exoplayer.ExoPlayer.Builder(context0);
        }

        @Deprecated
        public Builder(Context context0, RenderersFactory renderersFactory0) {
            this.a = new androidx.media3.exoplayer.ExoPlayer.Builder(context0, renderersFactory0);
        }

        @Deprecated
        public Builder(Context context0, RenderersFactory renderersFactory0, TrackSelector trackSelector0, Factory mediaSource$Factory0, LoadControl loadControl0, BandwidthMeter bandwidthMeter0, AnalyticsCollector analyticsCollector0) {
            this.a = new androidx.media3.exoplayer.ExoPlayer.Builder(context0, renderersFactory0, mediaSource$Factory0, trackSelector0, loadControl0, bandwidthMeter0, analyticsCollector0);
        }

        @Deprecated
        public Builder(Context context0, RenderersFactory renderersFactory0, ExtractorsFactory extractorsFactory0) {
            this.a = new androidx.media3.exoplayer.ExoPlayer.Builder(context0, renderersFactory0, new DefaultMediaSourceFactory(context0, extractorsFactory0));
        }

        @Deprecated
        public Builder(Context context0, ExtractorsFactory extractorsFactory0) {
            this.a = new androidx.media3.exoplayer.ExoPlayer.Builder(context0, new DefaultMediaSourceFactory(context0, extractorsFactory0));
        }

        @Deprecated
        public SimpleExoPlayer b() {
            return this.a.x();
        }

        @a
        @Deprecated
        public Builder c(long v) {
            this.a.z(v);
            return this;
        }

        @a
        @Deprecated
        public Builder d(AnalyticsCollector analyticsCollector0) {
            this.a.W(analyticsCollector0);
            return this;
        }

        @a
        @Deprecated
        public Builder e(AudioAttributes audioAttributes0, boolean z) {
            this.a.X(audioAttributes0, z);
            return this;
        }

        @a
        @Deprecated
        public Builder f(BandwidthMeter bandwidthMeter0) {
            this.a.Y(bandwidthMeter0);
            return this;
        }

        @a
        @VisibleForTesting
        @Deprecated
        public Builder g(Clock clock0) {
            this.a.Z(clock0);
            return this;
        }

        @a
        @Deprecated
        public Builder h(long v) {
            this.a.a0(v);
            return this;
        }

        @a
        @Deprecated
        public Builder i(boolean z) {
            this.a.c0(z);
            return this;
        }

        @a
        @Deprecated
        public Builder j(LivePlaybackSpeedControl livePlaybackSpeedControl0) {
            this.a.d0(livePlaybackSpeedControl0);
            return this;
        }

        @a
        @Deprecated
        public Builder k(LoadControl loadControl0) {
            this.a.e0(loadControl0);
            return this;
        }

        @a
        @Deprecated
        public Builder l(Looper looper0) {
            this.a.f0(looper0);
            return this;
        }

        @a
        @Deprecated
        public Builder m(Factory mediaSource$Factory0) {
            this.a.h0(mediaSource$Factory0);
            return this;
        }

        @a
        @Deprecated
        public Builder n(boolean z) {
            this.a.j0(z);
            return this;
        }

        @a
        @Deprecated
        public Builder o(@Nullable PriorityTaskManager priorityTaskManager0) {
            this.a.m0(priorityTaskManager0);
            return this;
        }

        @a
        @Deprecated
        public Builder p(long v) {
            this.a.n0(v);
            return this;
        }

        @a
        @Deprecated
        public Builder q(@IntRange(from = 1L) long v) {
            this.a.p0(v);
            return this;
        }

        @a
        @Deprecated
        public Builder r(@IntRange(from = 1L) long v) {
            this.a.q0(v);
            return this;
        }

        @a
        @Deprecated
        public Builder s(SeekParameters seekParameters0) {
            this.a.r0(seekParameters0);
            return this;
        }

        @a
        @Deprecated
        public Builder t(boolean z) {
            this.a.s0(z);
            return this;
        }

        @a
        @Deprecated
        public Builder u(TrackSelector trackSelector0) {
            this.a.u0(trackSelector0);
            return this;
        }

        @a
        @Deprecated
        public Builder v(boolean z) {
            this.a.v0(z);
            return this;
        }

        @a
        @Deprecated
        public Builder w(int v) {
            this.a.x0(v);
            return this;
        }

        @a
        @Deprecated
        public Builder x(int v) {
            this.a.y0(v);
            return this;
        }

        @a
        @Deprecated
        public Builder y(int v) {
            this.a.z0(v);
            return this;
        }
    }

    private final ExoPlayerImpl c1;
    private final ConditionVariable d1;

    @Deprecated
    protected SimpleExoPlayer(Context context0, RenderersFactory renderersFactory0, TrackSelector trackSelector0, Factory mediaSource$Factory0, LoadControl loadControl0, BandwidthMeter bandwidthMeter0, AnalyticsCollector analyticsCollector0, boolean z, Clock clock0, Looper looper0) {
        this(new androidx.media3.exoplayer.ExoPlayer.Builder(context0, renderersFactory0, mediaSource$Factory0, trackSelector0, loadControl0, bandwidthMeter0, analyticsCollector0).v0(z).Z(clock0).f0(looper0));
    }

    SimpleExoPlayer(androidx.media3.exoplayer.ExoPlayer.Builder exoPlayer$Builder0) {
        ConditionVariable conditionVariable0 = new ConditionVariable();
        this.d1 = conditionVariable0;
        try {
            this.c1 = new ExoPlayerImpl(exoPlayer$Builder0, this);
        }
        catch(Throwable throwable0) {
            this.d1.f();
            throw throwable0;
        }
        conditionVariable0.f();
    }

    protected SimpleExoPlayer(Builder simpleExoPlayer$Builder0) {
        this(simpleExoPlayer$Builder0.a);
    }

    @Override  // androidx.media3.common.Player
    public TrackSelectionParameters A0() {
        this.H2();
        return this.c1.A0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void B(@Nullable TextureView textureView0) {
        this.H2();
        this.c1.B(textureView0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    @Deprecated
    public TextComponent B0() {
        return this;
    }

    @Override  // androidx.media3.common.BasePlayer
    @VisibleForTesting(otherwise = 4)
    public void B2(int v, long v1, int v2, boolean z) {
        this.H2();
        this.c1.B2(v, v1, v2, z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public void C(AudioAttributes audioAttributes0, boolean z) {
        this.H2();
        this.c1.C(audioAttributes0, z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public PlayerMessage C1(Target playerMessage$Target0) {
        this.H2();
        return this.c1.C1(playerMessage$Target0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    public boolean D() {
        this.H2();
        return this.c1.D();
    }

    @Override  // androidx.media3.common.Player
    public boolean D0() {
        this.H2();
        return this.c1.D0();
    }

    @Override  // androidx.media3.common.Player
    public void D1(boolean z) {
        this.H2();
        this.c1.D1(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void E(CameraMotionListener cameraMotionListener0) {
        this.H2();
        this.c1.E(cameraMotionListener0);
    }

    @Override  // androidx.media3.common.Player
    public void E0(boolean z) {
        this.H2();
        this.c1.E0(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format E1() {
        this.H2();
        return this.c1.E1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public int F() {
        this.H2();
        return this.c1.F();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public int F0() {
        this.H2();
        return this.c1.F0();
    }

    @Override  // androidx.media3.common.Player
    public void F1(int v) {
        this.H2();
        this.c1.F1(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void G(@Nullable Surface surface0) {
        this.H2();
        this.c1.G(surface0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void G1(List list0, boolean z) {
        this.H2();
        this.c1.G1(list0, z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void H() {
        this.H2();
        this.c1.H();
    }

    @Override  // androidx.media3.common.Player
    public long H0() {
        this.H2();
        return this.c1.H0();
    }

    private void H2() {
        this.d1.c();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.common.Player
    public void I(int v, int v1, List list0) {
        this.H2();
        this.c1.I(v, v1, list0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void I0(int v, List list0) {
        this.H2();
        this.c1.I0(v, list0);
    }

    void I2(boolean z) {
        this.H2();
        this.c1.Y4(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public int J() {
        this.H2();
        return this.c1.J();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public Renderer J0(int v) {
        this.H2();
        return this.c1.J0(v);
    }

    @Override  // androidx.media3.common.Player
    public void J1(Listener player$Listener0) {
        this.H2();
        this.c1.J1(player$Listener0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void K(List list0) {
        this.H2();
        this.c1.K(list0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void K1(boolean z) {
        this.H2();
        this.c1.K1(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$TextComponent, androidx.media3.common.Player
    public CueGroup L() {
        this.H2();
        return this.c1.L();
    }

    @Override  // androidx.media3.common.Player
    public int L0() {
        this.H2();
        return this.c1.L0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void M(int v) {
        this.H2();
        this.c1.M(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void M0(AudioOffloadListener exoPlayer$AudioOffloadListener0) {
        this.H2();
        this.c1.M0(exoPlayer$AudioOffloadListener0);
    }

    @Override  // androidx.media3.common.Player
    public void M1(Listener player$Listener0) {
        this.H2();
        this.c1.M1(player$Listener0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void N(@Nullable TextureView textureView0) {
        this.H2();
        this.c1.N(textureView0);
    }

    @Override  // androidx.media3.common.Player
    public int N0() {
        this.H2();
        return this.c1.N0();
    }

    @Override  // androidx.media3.common.Player
    public int N1() {
        this.H2();
        return this.c1.N1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public VideoSize O() {
        this.H2();
        return this.c1.O();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void O0(List list0) {
        this.H2();
        this.c1.O0(list0);
    }

    @Override  // androidx.media3.common.Player
    public Timeline O1() {
        this.H2();
        return this.c1.O1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void P0(MediaSource mediaSource0) {
        this.H2();
        this.c1.P0(mediaSource0);
    }

    @Override  // androidx.media3.common.Player
    public Looper P1() {
        this.H2();
        return this.c1.P1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void Q() {
        this.H2();
        this.c1.Q();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    @Deprecated
    public AudioComponent Q0() {
        return this;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void Q1(AnalyticsListener analyticsListener0) {
        this.H2();
        this.c1.Q1(analyticsListener0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void R(VideoFrameMetadataListener videoFrameMetadataListener0) {
        this.H2();
        this.c1.R(videoFrameMetadataListener0);
    }

    @Override  // androidx.media3.common.Player
    public void R0(List list0, int v, long v1) {
        this.H2();
        this.c1.R0(list0, v, v1);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void S(@Nullable SurfaceView surfaceView0) {
        this.H2();
        this.c1.S(surfaceView0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public TrackSelectionArray S1() {
        this.H2();
        return this.c1.S1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void T(CameraMotionListener cameraMotionListener0) {
        this.H2();
        this.c1.T(cameraMotionListener0);
    }

    @Override  // androidx.media3.common.Player
    public long T0() {
        this.H2();
        return this.c1.T0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public int T1(int v) {
        this.H2();
        return this.c1.T1(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void U(int v) {
        this.H2();
        this.c1.U(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters U0() {
        this.H2();
        return this.c1.U0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean U1() {
        this.H2();
        return this.c1.U1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean V() {
        this.H2();
        return this.c1.V();
    }

    @Override  // androidx.media3.common.Player
    public boolean W() {
        this.H2();
        return this.c1.W();
    }

    @Override  // androidx.media3.common.Player
    public MediaMetadata W0() {
        this.H2();
        return this.c1.W0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void X0(MediaSource mediaSource0, boolean z, boolean z1) {
        this.H2();
        this.c1.X0(mediaSource0, z, z1);
    }

    @Override  // androidx.media3.common.Player
    public Commands X1() {
        this.H2();
        return this.c1.X1();
    }

    @Override  // androidx.media3.common.Player
    public long Y() {
        this.H2();
        return this.c1.Y();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void Y0(@Nullable PriorityTaskManager priorityTaskManager0) {
        this.H2();
        this.c1.Y0(priorityTaskManager0);
    }

    @Override  // androidx.media3.common.Player
    public void Y1(int v, int v1) {
        this.H2();
        this.c1.Y1(v, v1);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void Z(ShuffleOrder shuffleOrder0) {
        this.H2();
        this.c1.Z(shuffleOrder0);
    }

    @Override  // androidx.media3.common.Player
    public void Z0(TrackSelectionParameters trackSelectionParameters0) {
        this.H2();
        this.c1.Z0(trackSelectionParameters0);
    }

    @Override  // androidx.media3.common.Player
    public boolean a() {
        this.H2();
        return this.c1.a();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public Clock a0() {
        this.H2();
        return this.c1.a0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public SeekParameters a1() {
        this.H2();
        return this.c1.a1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public PreloadConfiguration a2() {
        this.H2();
        return this.c1.a2();
    }

    @Override  // androidx.media3.common.Player
    public int b() {
        this.H2();
        return this.c1.b();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public TrackSelector b0() {
        this.H2();
        return this.c1.b0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    @Deprecated
    public DeviceComponent b2() {
        return this;
    }

    @Override  // androidx.media3.common.Player
    public void c0(List list0, boolean z) {
        this.H2();
        this.c1.c0(list0, z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public AnalyticsCollector c1() {
        this.H2();
        return this.c1.c1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public AudioAttributes d() {
        this.H2();
        return this.c1.d();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void d0(@Nullable SeekParameters seekParameters0) {
        this.H2();
        this.c1.d0(seekParameters0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean d1() {
        this.H2();
        return this.c1.d1();
    }

    @Override  // androidx.media3.common.Player
    public long d2() {
        this.H2();
        return this.c1.d2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void e(VideoFrameMetadataListener videoFrameMetadataListener0) {
        this.H2();
        this.c1.e(videoFrameMetadataListener0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void e0(MediaSource mediaSource0, boolean z) {
        this.H2();
        this.c1.e0(mediaSource0, z);
    }

    @Override  // androidx.media3.common.Player
    public long e1() {
        this.H2();
        return this.c1.e1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format e2() {
        this.H2();
        return this.c1.e2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.common.Player
    @Nullable
    public PlaybackException f() {
        return this.f();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public ExoPlaybackException f() {
        this.H2();
        return this.c1.f();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void f0(AudioOffloadListener exoPlayer$AudioOffloadListener0) {
        this.H2();
        this.c1.f0(exoPlayer$AudioOffloadListener0);
    }

    @Override  // androidx.media3.common.Player
    public void f2(int v, List list0) {
        this.H2();
        this.c1.f2(v, list0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void g(int v) {
        this.H2();
        this.c1.g(v);
    }

    @Override  // androidx.media3.common.Player
    public void g0(int v) {
        this.H2();
        this.c1.g0(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters g1() {
        this.H2();
        return this.c1.g1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public int getAudioSessionId() {
        this.H2();
        return this.c1.getAudioSessionId();
    }

    @Override  // androidx.media3.common.Player
    public long getCurrentPosition() {
        this.H2();
        return this.c1.getCurrentPosition();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        this.H2();
        return this.c1.getDeviceInfo();
    }

    @Override  // androidx.media3.common.Player
    public long getDuration() {
        this.H2();
        return this.c1.getDuration();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public float getVolume() {
        this.H2();
        return this.c1.getVolume();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public boolean h() {
        this.H2();
        return this.c1.h();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void h0(MediaSource mediaSource0, long v) {
        this.H2();
        this.c1.h0(mediaSource0, v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void h1(int v) {
        this.H2();
        this.c1.h1(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void h2(int v, MediaSource mediaSource0) {
        this.H2();
        this.c1.h2(v, mediaSource0);
    }

    @Override  // androidx.media3.common.Player
    public int i() {
        this.H2();
        return this.c1.i();
    }

    @Override  // androidx.media3.common.Player
    public void i0(MediaMetadata mediaMetadata0) {
        this.H2();
        this.c1.i0(mediaMetadata0);
    }

    @Override  // androidx.media3.common.Player
    public long i2() {
        this.H2();
        return this.c1.i2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void j(AuxEffectInfo auxEffectInfo0) {
        this.H2();
        this.c1.j(auxEffectInfo0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void k(int v) {
        this.H2();
        this.c1.k(v);
    }

    @Override  // androidx.media3.common.Player
    public void k0(int v, int v1) {
        this.H2();
        this.c1.k0(v, v1);
    }

    @Override  // androidx.media3.common.Player
    public void k1(boolean z, int v) {
        this.H2();
        this.c1.k1(z, v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void k2(MediaSource mediaSource0) {
        this.H2();
        this.c1.k2(mediaSource0);
    }

    @Override  // androidx.media3.common.Player
    public void l(PlaybackParameters playbackParameters0) {
        this.H2();
        this.c1.l(playbackParameters0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    @Deprecated
    public VideoComponent l0() {
        return this;
    }

    @Override  // androidx.media3.common.Player
    public PlaybackParameters m() {
        this.H2();
        return this.c1.m();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public Looper m2() {
        this.H2();
        return this.c1.m2();
    }

    @Override  // androidx.media3.common.Player
    public void n() {
        this.H2();
        this.c1.n();
    }

    @Override  // androidx.media3.common.Player
    public int n2() {
        this.H2();
        return this.c1.n2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public void o(float f) {
        this.H2();
        this.c1.o(f);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void o0(AnalyticsListener analyticsListener0) {
        this.H2();
        this.c1.o0(analyticsListener0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void p2(int v) {
        this.H2();
        this.c1.p2(v);
    }

    @Override  // androidx.media3.common.Player
    public void q(int v) {
        this.H2();
        this.c1.q(v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void r(boolean z) {
        this.H2();
        this.c1.r(z);
    }

    @Override  // androidx.media3.common.Player
    public Tracks r0() {
        this.H2();
        return this.c1.r0();
    }

    @Override  // androidx.media3.common.Player
    public void r2(int v, int v1, int v2) {
        this.H2();
        this.c1.r2(v, v1, v2);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.common.Player
    public void release() {
        this.H2();
        this.c1.release();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void s(@Nullable Surface surface0) {
        this.H2();
        this.c1.s(surface0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @RequiresApi(23)
    public void s0(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        this.H2();
        this.c1.s0(audioDeviceInfo0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void s1(boolean z) {
        this.H2();
        this.c1.s1(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(@Nullable ImageOutput imageOutput0) {
        this.H2();
        this.c1.setImageOutput(imageOutput0);
    }

    @Override  // androidx.media3.common.Player
    public void stop() {
        this.H2();
        this.c1.stop();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void t(@Nullable SurfaceView surfaceView0) {
        this.H2();
        this.c1.t(surfaceView0);
    }

    @Override  // androidx.media3.common.Player
    public boolean t2() {
        this.H2();
        return this.c1.t2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void u(@Nullable SurfaceHolder surfaceHolder0) {
        this.H2();
        this.c1.u(surfaceHolder0);
    }

    @Override  // androidx.media3.common.Player
    public int u0() {
        this.H2();
        return this.c1.u0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void u2(MediaSource mediaSource0) {
        this.H2();
        this.c1.u2(mediaSource0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void v(boolean z) {
        this.H2();
        this.c1.v(z);
    }

    @Override  // androidx.media3.common.Player
    public Size v1() {
        this.H2();
        return this.c1.v1();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void w() {
        this.H2();
        this.c1.w();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void w0(boolean z) {
        this.H2();
        this.c1.w0(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void w1(PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.H2();
        this.c1.w1(exoPlayer$PreloadConfiguration0);
    }

    @Override  // androidx.media3.common.Player
    public MediaMetadata w2() {
        this.H2();
        return this.c1.w2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void x(@Nullable SurfaceHolder surfaceHolder0) {
        this.H2();
        this.c1.x(surfaceHolder0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void x0(List list0, int v, long v1) {
        this.H2();
        this.c1.x0(list0, v, v1);
    }

    @Override  // androidx.media3.common.Player
    public long x2() {
        this.H2();
        return this.c1.x2();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void y() {
        this.H2();
        this.c1.y();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public TrackGroupArray y0() {
        this.H2();
        return this.c1.y0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    public int z() {
        this.H2();
        return this.c1.z();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean z0() {
        return this.c1.z0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void z1(List list0) {
        this.H2();
        this.c1.z1(list0);
    }
}

