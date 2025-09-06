package androidx.media3.exoplayer;

import O1.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.Events;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.common.z;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource.Factory;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

final class ExoPlayerImpl extends BasePlayer implements AudioComponent, DeviceComponent, TextComponent, VideoComponent, ExoPlayer {
    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        public static boolean a(Context context0, AudioDeviceInfo[] arr_audioDeviceInfo) {
            if(!Util.o1(context0)) {
                return true;
            }
            int v = 0;
            while(v < arr_audioDeviceInfo.length) {
                AudioDeviceInfo audioDeviceInfo0 = arr_audioDeviceInfo[v];
                switch(audioDeviceInfo0.getType()) {
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 8: 
                    case 11: {
                        return true;
                    label_8:
                        int v1 = Util.a;
                        if(v1 >= 26 && audioDeviceInfo0.getType() == 22) {
                            return true;
                        }
                        if(v1 >= 28 && audioDeviceInfo0.getType() == 23) {
                            return true;
                        }
                        if(v1 >= 0x1F) {
                            switch(audioDeviceInfo0.getType()) {
                                case 26: 
                                case 27: {
                                    return true;
                                }
                            }
                        }
                        if(v1 >= 33 && audioDeviceInfo0.getType() == 30) {
                            return true;
                        }
                        break;
                    }
                    default: {
                        goto label_8;
                    }
                }
                ++v;
            }
            return false;
        }

        @DoNotInline
        public static void b(AudioManager audioManager0, AudioDeviceCallback audioDeviceCallback0, Handler handler0) {
            audioManager0.registerAudioDeviceCallback(audioDeviceCallback0, handler0);
        }
    }

    @RequiresApi(0x1F)
    static final class Api31 {
        @DoNotInline
        public static PlayerId a(Context context0, ExoPlayerImpl exoPlayerImpl0, boolean z, String s) {
            MediaMetricsListener mediaMetricsListener0 = MediaMetricsListener.C0(context0);
            if(mediaMetricsListener0 == null) {
                Log.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE, s);
            }
            if(z) {
                exoPlayerImpl0.Q1(mediaMetricsListener0);
            }
            return new PlayerId(mediaMetricsListener0.J0(), s);
        }
    }

    final class ComponentListener implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, EventListener, PlayerControl, AudioOffloadListener, Listener, AudioRendererEventListener, MetadataOutput, TextOutput, VideoRendererEventListener, VideoSurfaceListener {
        final ExoPlayerImpl a;

        private ComponentListener() {
        }

        ComponentListener(androidx.media3.exoplayer.ExoPlayerImpl.1 exoPlayerImpl$10) {
        }

        @Override  // androidx.media3.exoplayer.ExoPlayer$AudioOffloadListener
        public void A(boolean z) {
            ExoPlayerImpl.this.h5();
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void B(int v, long v1, long v2) {
            ExoPlayerImpl.this.s1.B(v, v1, v2);
        }

        @Override  // androidx.media3.exoplayer.StreamVolumeManager$Listener
        public void C(int v) {
            DeviceInfo deviceInfo0 = ExoPlayerImpl.T3(ExoPlayerImpl.this.D1);
            if(!deviceInfo0.equals(ExoPlayerImpl.this.x2)) {
                ExoPlayerImpl.this.x2 = deviceInfo0;
                z0 z00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.T(deviceInfo0);
                ExoPlayerImpl.this.m1.m(29, z00);
            }
        }

        @Override  // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener
        public void D(Surface surface0) {
            ExoPlayerImpl.this.Z4(null);
        }

        @Override  // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener
        public void E(Surface surface0) {
            ExoPlayerImpl.this.Z4(surface0);
        }

        @Override  // androidx.media3.exoplayer.StreamVolumeManager$Listener
        public void F(int v, boolean z) {
            ExoPlayerImpl.this.m1.m(30, (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.H(v, z));
        }

        @Override  // androidx.media3.exoplayer.AudioFocusManager$PlayerControl
        public void G(float f) {
            ExoPlayerImpl.this.U4();
        }

        @Override  // androidx.media3.exoplayer.AudioFocusManager$PlayerControl
        public void H(int v) {
            boolean z = ExoPlayerImpl.this.D0();
            ExoPlayerImpl.this.d5(z, v, ExoPlayerImpl.c4(v));
        }

        // 检测为 Lambda 实现
        private static void Q(List list0, androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private static void R(CueGroup cueGroup0, androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private void S(androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private static void T(Metadata metadata0, androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private static void U(boolean z, androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private static void V(DeviceInfo deviceInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private static void W(int v, boolean z, androidx.media3.common.Player.Listener player$Listener0) [...]

        // 检测为 Lambda 实现
        private static void X(VideoSize videoSize0, androidx.media3.common.Player.Listener player$Listener0) [...]

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void a(VideoSize videoSize0) {
            ExoPlayerImpl.this.y2 = videoSize0;
            y0 y00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.a(videoSize0);
            ExoPlayerImpl.this.m1.m(25, y00);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void b(AudioTrackConfig audioSink$AudioTrackConfig0) {
            ExoPlayerImpl.this.s1.b(audioSink$AudioTrackConfig0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void c(AudioTrackConfig audioSink$AudioTrackConfig0) {
            ExoPlayerImpl.this.s1.c(audioSink$AudioTrackConfig0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void d(boolean z) {
            if(ExoPlayerImpl.this.n2 == z) {
                return;
            }
            ExoPlayerImpl.this.n2 = z;
            w0 w00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.d(z);
            ExoPlayerImpl.this.m1.m(23, w00);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void e(Exception exception0) {
            ExoPlayerImpl.this.s1.e(exception0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void f(String s) {
            ExoPlayerImpl.this.s1.f(s);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void g(String s) {
            ExoPlayerImpl.this.s1.g(s);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void h(String s, long v, long v1) {
            ExoPlayerImpl.this.s1.h(s, v, v1);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void i(DecoderCounters decoderCounters0) {
            ExoPlayerImpl.this.j2 = decoderCounters0;
            ExoPlayerImpl.this.s1.i(decoderCounters0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void j(DecoderCounters decoderCounters0) {
            ExoPlayerImpl.this.i2 = decoderCounters0;
            ExoPlayerImpl.this.s1.j(decoderCounters0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void k(Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
            ExoPlayerImpl.this.X1 = format0;
            ExoPlayerImpl.this.s1.k(format0, decoderReuseEvaluation0);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void l(DecoderCounters decoderCounters0) {
            ExoPlayerImpl.this.s1.l(decoderCounters0);
            ExoPlayerImpl.this.X1 = null;
            ExoPlayerImpl.this.j2 = null;
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void m(int v, long v1) {
            ExoPlayerImpl.this.s1.m(v, v1);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void n(Exception exception0) {
            ExoPlayerImpl.this.s1.n(exception0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void o(long v, int v1) {
            ExoPlayerImpl.this.s1.o(v, v1);
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
            ExoPlayerImpl.this.X4(surfaceTexture0);
            ExoPlayerImpl.this.N4(v, v1);
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
            ExoPlayerImpl.this.Z4(null);
            ExoPlayerImpl.this.N4(0, 0);
            return true;
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
            ExoPlayerImpl.this.N4(v, v1);
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void p(String s, long v, long v1) {
            ExoPlayerImpl.this.s1.p(s, v, v1);
        }

        @Override  // androidx.media3.exoplayer.AudioBecomingNoisyManager$EventListener
        public void q() {
            ExoPlayerImpl.this.d5(false, -1, 3);
        }

        @Override  // androidx.media3.exoplayer.text.TextOutput
        public void r(List list0) {
            x0 x00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.r(list0);
            ExoPlayerImpl.this.m1.m(27, x00);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void s(long v) {
            ExoPlayerImpl.this.s1.s(v);
        }

        @Override  // android.view.SurfaceHolder$Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
            ExoPlayerImpl.this.N4(v1, v2);
        }

        @Override  // android.view.SurfaceHolder$Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder0) {
            if(ExoPlayerImpl.this.d2) {
                Surface surface0 = surfaceHolder0.getSurface();
                ExoPlayerImpl.this.Z4(surface0);
            }
        }

        @Override  // android.view.SurfaceHolder$Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
            if(ExoPlayerImpl.this.d2) {
                ExoPlayerImpl.this.Z4(null);
            }
            ExoPlayerImpl.this.N4(0, 0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void t(Exception exception0) {
            ExoPlayerImpl.this.s1.t(exception0);
        }

        @Override  // androidx.media3.exoplayer.ExoPlayer$AudioOffloadListener
        public void u(boolean z) {
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void v(Object object0, long v) {
            ExoPlayerImpl.this.s1.v(object0, v);
            if(ExoPlayerImpl.this.Z1 == object0) {
                z z0 = new z();
                ExoPlayerImpl.this.m1.m(26, z0);
            }
        }

        @Override  // androidx.media3.exoplayer.text.TextOutput
        public void w(CueGroup cueGroup0) {
            ExoPlayerImpl.this.o2 = cueGroup0;
            t0 t00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.w(cueGroup0);
            ExoPlayerImpl.this.m1.m(27, t00);
        }

        @Override  // androidx.media3.exoplayer.metadata.MetadataOutput
        public void x(Metadata metadata0) {
            MediaMetadata mediaMetadata0 = ExoPlayerImpl.this.z2.a().L(metadata0).I();
            ExoPlayerImpl.this.z2 = mediaMetadata0;
            MediaMetadata mediaMetadata1 = ExoPlayerImpl.this.Q3();
            if(!mediaMetadata1.equals(ExoPlayerImpl.this.U1)) {
                ExoPlayerImpl.this.U1 = mediaMetadata1;
                u0 u00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.I(ExoPlayerImpl.this.U1);
                ExoPlayerImpl.this.m1.j(14, u00);
            }
            v0 v00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.x(metadata0);
            ExoPlayerImpl.this.m1.j(28, v00);
            ExoPlayerImpl.this.m1.g();
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void y(Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
            ExoPlayerImpl.this.W1 = format0;
            ExoPlayerImpl.this.s1.y(format0, decoderReuseEvaluation0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void z(DecoderCounters decoderCounters0) {
            ExoPlayerImpl.this.s1.z(decoderCounters0);
            ExoPlayerImpl.this.W1 = null;
            ExoPlayerImpl.this.i2 = null;
        }
    }

    static final class FrameMetadataListener implements Target, VideoFrameMetadataListener, CameraMotionListener {
        @Nullable
        private VideoFrameMetadataListener a;
        @Nullable
        private CameraMotionListener b;
        @Nullable
        private VideoFrameMetadataListener c;
        @Nullable
        private CameraMotionListener d;
        public static final int e = 7;
        public static final int f = 8;
        public static final int g = 10000;

        private FrameMetadataListener() {
        }

        FrameMetadataListener(androidx.media3.exoplayer.ExoPlayerImpl.1 exoPlayerImpl$10) {
        }

        @Override  // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void a(long v, float[] arr_f) {
            CameraMotionListener cameraMotionListener0 = this.d;
            if(cameraMotionListener0 != null) {
                cameraMotionListener0.a(v, arr_f);
            }
            CameraMotionListener cameraMotionListener1 = this.b;
            if(cameraMotionListener1 != null) {
                cameraMotionListener1.a(v, arr_f);
            }
        }

        @Override  // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void j() {
            CameraMotionListener cameraMotionListener0 = this.d;
            if(cameraMotionListener0 != null) {
                cameraMotionListener0.j();
            }
            CameraMotionListener cameraMotionListener1 = this.b;
            if(cameraMotionListener1 != null) {
                cameraMotionListener1.j();
            }
        }

        @Override  // androidx.media3.exoplayer.PlayerMessage$Target
        public void k(int v, @Nullable Object object0) {
            switch(v) {
                case 7: {
                    this.a = (VideoFrameMetadataListener)object0;
                    return;
                }
                case 8: {
                    this.b = (CameraMotionListener)object0;
                    return;
                }
                case 10000: {
                    if(((SphericalGLSurfaceView)object0) == null) {
                        this.c = null;
                        this.d = null;
                        return;
                    }
                    this.c = ((SphericalGLSurfaceView)object0).getVideoFrameMetadataListener();
                    this.d = ((SphericalGLSurfaceView)object0).getCameraMotionListener();
                }
            }
        }

        @Override  // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public void l(long v, long v1, Format format0, @Nullable MediaFormat mediaFormat0) {
            VideoFrameMetadataListener videoFrameMetadataListener0 = this.c;
            if(videoFrameMetadataListener0 != null) {
                videoFrameMetadataListener0.l(v, v1, format0, mediaFormat0);
            }
            VideoFrameMetadataListener videoFrameMetadataListener1 = this.a;
            if(videoFrameMetadataListener1 != null) {
                videoFrameMetadataListener1.l(v, v1, format0, mediaFormat0);
            }
        }
    }

    static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        private final Object a;
        private final MediaSource b;
        private Timeline c;

        public MediaSourceHolderSnapshot(Object object0, MaskingMediaSource maskingMediaSource0) {
            this.a = object0;
            this.b = maskingMediaSource0;
            this.c = maskingMediaSource0.U0();
        }

        @Override  // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Object a() {
            return this.a;
        }

        @Override  // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Timeline b() {
            return this.c;
        }

        public void d(Timeline timeline0) {
            this.c = timeline0;
        }
    }

    @RequiresApi(23)
    final class NoSuitableOutputPlaybackSuppressionAudioDeviceCallback extends AudioDeviceCallback {
        final ExoPlayerImpl a;

        private NoSuitableOutputPlaybackSuppressionAudioDeviceCallback() {
        }

        NoSuitableOutputPlaybackSuppressionAudioDeviceCallback(androidx.media3.exoplayer.ExoPlayerImpl.1 exoPlayerImpl$10) {
        }

        @Override  // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] arr_audioDeviceInfo) {
            if(ExoPlayerImpl.this.h4() && ExoPlayerImpl.this.A2.n == 3) {
                ExoPlayerImpl.this.f5(ExoPlayerImpl.this.A2.l, 1, 0);
            }
        }

        @Override  // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] arr_audioDeviceInfo) {
            if(!ExoPlayerImpl.this.h4()) {
                ExoPlayerImpl.this.f5(ExoPlayerImpl.this.A2.l, 1, 3);
            }
        }
    }

    private final FrameMetadataListener A1;
    private PlaybackInfo A2;
    private final AudioBecomingNoisyManager B1;
    private int B2;
    private final AudioFocusManager C1;
    private int C2;
    @Nullable
    private final StreamVolumeManager D1;
    private long D2;
    private final WakeLockManager E1;
    private static final String E2 = "ExoPlayerImpl";
    private final WifiLockManager F1;
    private final long G1;
    @Nullable
    private AudioManager H1;
    private final boolean I1;
    private int J1;
    private boolean K1;
    private int L1;
    private int M1;
    private boolean N1;
    private boolean O1;
    private SeekParameters P1;
    private ShuffleOrder Q1;
    private PreloadConfiguration R1;
    private boolean S1;
    private Commands T1;
    private MediaMetadata U1;
    private MediaMetadata V1;
    @Nullable
    private Format W1;
    @Nullable
    private Format X1;
    @Nullable
    private AudioTrack Y1;
    @Nullable
    private Object Z1;
    @Nullable
    private Surface a2;
    @Nullable
    private SurfaceHolder b2;
    final TrackSelectorResult c1;
    @Nullable
    private SphericalGLSurfaceView c2;
    final Commands d1;
    private boolean d2;
    private final ConditionVariable e1;
    @Nullable
    private TextureView e2;
    private final Context f1;
    private int f2;
    private final Player g1;
    private int g2;
    private final Renderer[] h1;
    private Size h2;
    private final TrackSelector i1;
    @Nullable
    private DecoderCounters i2;
    private final HandlerWrapper j1;
    @Nullable
    private DecoderCounters j2;
    private final PlaybackInfoUpdateListener k1;
    private int k2;
    private final ExoPlayerImplInternal l1;
    private AudioAttributes l2;
    private final ListenerSet m1;
    private float m2;
    private final CopyOnWriteArraySet n1;
    private boolean n2;
    private final Period o1;
    private CueGroup o2;
    private final List p1;
    @Nullable
    private VideoFrameMetadataListener p2;
    private final boolean q1;
    @Nullable
    private CameraMotionListener q2;
    private final Factory r1;
    private boolean r2;
    private final AnalyticsCollector s1;
    private boolean s2;
    private final Looper t1;
    private int t2;
    private final BandwidthMeter u1;
    @Nullable
    private PriorityTaskManager u2;
    private final long v1;
    private boolean v2;
    private final long w1;
    private boolean w2;
    private final long x1;
    private DeviceInfo x2;
    private final Clock y1;
    private VideoSize y2;
    private final ComponentListener z1;
    private MediaMetadata z2;

    static {
        MediaLibraryInfo.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(Builder exoPlayer$Builder0, @Nullable Player player0) {
        ConditionVariable conditionVariable0 = new ConditionVariable();
        this.e1 = conditionVariable0;
        try {
            Log.h("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + "AndroidXMedia3/1.4.1" + "] [" + Util.e + "]");
            Context context0 = exoPlayer$Builder0.a.getApplicationContext();
            this.f1 = context0;
            AnalyticsCollector analyticsCollector0 = (AnalyticsCollector)exoPlayer$Builder0.i.apply(exoPlayer$Builder0.b);
            this.s1 = analyticsCollector0;
            this.t2 = exoPlayer$Builder0.k;
            this.u2 = exoPlayer$Builder0.l;
            this.l2 = exoPlayer$Builder0.m;
            this.f2 = exoPlayer$Builder0.s;
            this.g2 = exoPlayer$Builder0.t;
            this.n2 = exoPlayer$Builder0.q;
            this.G1 = exoPlayer$Builder0.B;
            ComponentListener exoPlayerImpl$ComponentListener0 = new ComponentListener(this, null);
            this.z1 = exoPlayerImpl$ComponentListener0;
            FrameMetadataListener exoPlayerImpl$FrameMetadataListener0 = new FrameMetadataListener(null);
            this.A1 = exoPlayerImpl$FrameMetadataListener0;
            Handler handler0 = new Handler(exoPlayer$Builder0.j);
            Renderer[] arr_renderer = ((RenderersFactory)exoPlayer$Builder0.d.get()).a(handler0, exoPlayerImpl$ComponentListener0, exoPlayerImpl$ComponentListener0, exoPlayerImpl$ComponentListener0, exoPlayerImpl$ComponentListener0);
            this.h1 = arr_renderer;
            Assertions.i(arr_renderer.length > 0);
            TrackSelector trackSelector0 = (TrackSelector)exoPlayer$Builder0.f.get();
            this.i1 = trackSelector0;
            this.r1 = (Factory)exoPlayer$Builder0.e.get();
            BandwidthMeter bandwidthMeter0 = (BandwidthMeter)exoPlayer$Builder0.h.get();
            this.u1 = bandwidthMeter0;
            this.q1 = exoPlayer$Builder0.u;
            this.P1 = exoPlayer$Builder0.v;
            this.v1 = exoPlayer$Builder0.w;
            this.w1 = exoPlayer$Builder0.x;
            this.x1 = exoPlayer$Builder0.y;
            this.S1 = exoPlayer$Builder0.C;
            Looper looper0 = exoPlayer$Builder0.j;
            this.t1 = looper0;
            Clock clock0 = exoPlayer$Builder0.b;
            this.y1 = clock0;
            Player player1 = player0 == null ? this : player0;
            this.g1 = player1;
            boolean z = exoPlayer$Builder0.G;
            this.I1 = z;
            this.m1 = new ListenerSet(looper0, clock0, (androidx.media3.common.Player.Listener player$Listener0, FlagSet flagSet0) -> {
                Events player$Events0 = new Events(flagSet0);
                player$Listener0.N(this.g1, player$Events0);
            });
            this.n1 = new CopyOnWriteArraySet();
            this.p1 = new ArrayList();
            this.Q1 = new DefaultShuffleOrder(0);
            this.R1 = PreloadConfiguration.b;
            TrackSelectorResult trackSelectorResult0 = new TrackSelectorResult(new RendererConfiguration[arr_renderer.length], new ExoTrackSelection[arr_renderer.length], Tracks.b, null);
            this.c1 = trackSelectorResult0;
            this.o1 = new Period();
            Commands player$Commands0 = new androidx.media3.common.Player.Commands.Builder().c(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 0x1F, 20, 30, 21, 35, 22, 24, 27, 28, 0x20}).e(29, trackSelector0.h()).e(23, exoPlayer$Builder0.r).e(25, exoPlayer$Builder0.r).e(33, exoPlayer$Builder0.r).e(26, exoPlayer$Builder0.r).e(34, exoPlayer$Builder0.r).f();
            this.d1 = player$Commands0;
            this.T1 = new androidx.media3.common.Player.Commands.Builder().b(player$Commands0).a(4).a(10).f();
            this.j1 = clock0.c(looper0, null);
            e0 e00 = (PlaybackInfoUpdate exoPlayerImplInternal$PlaybackInfoUpdate0) -> {
                Z z0 = () -> this.g4(exoPlayerImplInternal$PlaybackInfoUpdate0);
                this.j1.k(z0);
            };
            this.k1 = e00;
            this.A2 = PlaybackInfo.k(trackSelectorResult0);
            analyticsCollector0.X(player1, looper0);
            int v = Util.a;
            PlayerId playerId0 = v >= 0x1F ? Api31.a(context0, this, exoPlayer$Builder0.D, exoPlayer$Builder0.H) : new PlayerId(exoPlayer$Builder0.H);
            ExoPlayerImplInternal exoPlayerImplInternal0 = new ExoPlayerImplInternal(arr_renderer, trackSelector0, trackSelectorResult0, ((LoadControl)exoPlayer$Builder0.g.get()), bandwidthMeter0, this.J1, this.K1, analyticsCollector0, this.P1, exoPlayer$Builder0.z, exoPlayer$Builder0.A, this.S1, exoPlayer$Builder0.I, looper0, clock0, e00, playerId0, exoPlayer$Builder0.E, this.R1);
            this.l1 = exoPlayerImplInternal0;
            this.m2 = 1.0f;
            this.J1 = 0;
            this.U1 = MediaMetadata.W0;
            this.V1 = MediaMetadata.W0;
            this.z2 = MediaMetadata.W0;
            this.B2 = -1;
            this.k2 = v < 21 ? this.i4(0) : Util.V(context0);
            this.o2 = CueGroup.c;
            this.r2 = true;
            this.M1(analyticsCollector0);
            bandwidthMeter0.c(new Handler(looper0), analyticsCollector0);
            this.f0(exoPlayerImpl$ComponentListener0);
            long v1 = exoPlayer$Builder0.c;
            if(v1 > 0L) {
                exoPlayerImplInternal0.A(v1);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager0 = new AudioBecomingNoisyManager(exoPlayer$Builder0.a, handler0, exoPlayerImpl$ComponentListener0);
            this.B1 = audioBecomingNoisyManager0;
            audioBecomingNoisyManager0.b(exoPlayer$Builder0.p);
            AudioFocusManager audioFocusManager0 = new AudioFocusManager(exoPlayer$Builder0.a, handler0, exoPlayerImpl$ComponentListener0);
            this.C1 = audioFocusManager0;
            audioFocusManager0.n((exoPlayer$Builder0.n ? this.l2 : null));
            if(z && v >= 23) {
                AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
                this.H1 = audioManager0;
                Api23.b(audioManager0, new NoSuitableOutputPlaybackSuppressionAudioDeviceCallback(this, null), new Handler(looper0));
            }
            if(exoPlayer$Builder0.r) {
                StreamVolumeManager streamVolumeManager0 = new StreamVolumeManager(exoPlayer$Builder0.a, handler0, exoPlayerImpl$ComponentListener0);
                this.D1 = streamVolumeManager0;
                streamVolumeManager0.m(Util.G0(this.l2.c));
            }
            else {
                this.D1 = null;
            }
            WakeLockManager wakeLockManager0 = new WakeLockManager(exoPlayer$Builder0.a);
            this.E1 = wakeLockManager0;
            wakeLockManager0.a(exoPlayer$Builder0.o != 0);
            WifiLockManager wifiLockManager0 = new WifiLockManager(exoPlayer$Builder0.a);
            this.F1 = wifiLockManager0;
            wifiLockManager0.a(exoPlayer$Builder0.o == 2);
            this.x2 = ExoPlayerImpl.T3(this.D1);
            this.y2 = VideoSize.i;
            this.h2 = Size.c;
            trackSelector0.l(this.l2);
            this.S4(1, 10, this.k2);
            this.S4(2, 10, this.k2);
            this.S4(1, 3, this.l2);
            this.S4(2, 4, this.f2);
            this.S4(2, 5, this.g2);
            this.S4(1, 9, Boolean.valueOf(this.n2));
            this.S4(2, 7, exoPlayerImpl$FrameMetadataListener0);
            this.S4(6, 8, exoPlayerImpl$FrameMetadataListener0);
            this.T4(16, this.t2);
        }
        catch(Throwable throwable0) {
            this.e1.f();
            throw throwable0;
        }
        conditionVariable0.f();
    }

    @Override  // androidx.media3.common.Player
    public TrackSelectionParameters A0() {
        this.i5();
        return this.i1.c();
    }

    // 检测为 Lambda 实现
    private static void A4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void B(@Nullable TextureView textureView0) {
        this.i5();
        if(textureView0 != null && textureView0 == this.e2) {
            this.Q();
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @a
    @Deprecated
    public TextComponent B0() {
        this.i5();
        return this;
    }

    @Override  // androidx.media3.common.BasePlayer
    public void B2(int v, long v1, int v2, boolean z) {
        this.i5();
        if(v == -1) {
            return;
        }
        Assertions.a(v >= 0);
        Timeline timeline0 = this.A2.a;
        if(!timeline0.w() && v >= timeline0.v()) {
            return;
        }
        this.s1.d0();
        ++this.L1;
        if(this.W()) {
            Log.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            PlaybackInfoUpdate exoPlayerImplInternal$PlaybackInfoUpdate0 = new PlaybackInfoUpdate(this.A2);
            exoPlayerImplInternal$PlaybackInfoUpdate0.b(1);
            this.k1.a(exoPlayerImplInternal$PlaybackInfoUpdate0);
            return;
        }
        PlaybackInfo playbackInfo0 = this.A2.e != 3 && (this.A2.e != 4 || timeline0.w()) ? this.A2 : this.A2.h(2);
        int v3 = this.n2();
        PlaybackInfo playbackInfo1 = this.L4(playbackInfo0, timeline0, this.M4(timeline0, v, v1));
        this.l1.L0(timeline0, v, Util.F1(v1));
        this.e5(playbackInfo1, 0, true, 1, this.Z3(playbackInfo1), v3, z);
    }

    // 检测为 Lambda 实现
    private static void B4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public void C(AudioAttributes audioAttributes0, boolean z) {
        this.i5();
        if(this.w2) {
            return;
        }
        if(!Util.g(this.l2, audioAttributes0)) {
            this.l2 = audioAttributes0;
            this.S4(1, 3, audioAttributes0);
            StreamVolumeManager streamVolumeManager0 = this.D1;
            if(streamVolumeManager0 != null) {
                streamVolumeManager0.m(Util.G0(audioAttributes0.c));
            }
            f0 f00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.r0(audioAttributes0);
            this.m1.j(20, f00);
        }
        this.C1.n((z ? audioAttributes0 : null));
        this.i1.l(audioAttributes0);
        boolean z1 = this.D0();
        int v = this.b();
        int v1 = this.C1.q(z1, v);
        this.d5(z1, v1, ExoPlayerImpl.c4(v1));
        this.m1.g();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public PlayerMessage C1(Target playerMessage$Target0) {
        this.i5();
        return this.W3(playerMessage$Target0);
    }

    // 检测为 Lambda 实现
    private static void C4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    public boolean D() {
        this.i5();
        return this.D1 == null ? false : this.D1.j();
    }

    @Override  // androidx.media3.common.Player
    public boolean D0() {
        this.i5();
        return this.A2.l;
    }

    @Override  // androidx.media3.common.Player
    public void D1(boolean z) {
        this.i5();
        int v = this.b();
        int v1 = this.C1.q(z, v);
        this.d5(z, v1, ExoPlayerImpl.c4(v1));
    }

    // 检测为 Lambda 实现
    private static void D4(MediaMetadata mediaMetadata0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void E(CameraMotionListener cameraMotionListener0) {
        this.i5();
        if(this.q2 != cameraMotionListener0) {
            return;
        }
        this.W3(this.A1).t(8).q(null).n();
    }

    @Override  // androidx.media3.common.Player
    public void E0(boolean z) {
        this.i5();
        if(this.K1 != z) {
            this.K1 = z;
            this.l1.n1(z);
            c0 c00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.F(z);
            this.m1.j(9, c00);
            this.b5();
            this.m1.g();
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format E1() {
        this.i5();
        return this.W1;
    }

    // 检测为 Lambda 实现
    private static void E4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public int F() {
        this.i5();
        return this.f2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public int F0() {
        this.i5();
        return this.h1.length;
    }

    @Override  // androidx.media3.common.Player
    public void F1(int v) {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.c(v);
        }
    }

    // 检测为 Lambda 实现
    private static void F4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void G(@Nullable Surface surface0) {
        this.i5();
        if(surface0 != null && surface0 == this.Z1) {
            this.Q();
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void G1(List list0, boolean z) {
        this.i5();
        this.V4(list0, -1, 0x8000000000000001L, z);
    }

    // 检测为 Lambda 实现
    private static void G4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void H() {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.c(1);
        }
    }

    @Override  // androidx.media3.common.Player
    public long H0() {
        this.i5();
        return this.x1;
    }

    // 检测为 Lambda 实现
    private static void H4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.common.Player
    public void I(int v, int v1, List list0) {
        this.i5();
        boolean z = false;
        Assertions.a(v >= 0 && v1 >= v);
        int v2 = this.p1.size();
        if(v > v2) {
            return;
        }
        int v3 = Math.min(v1, v2);
        if(this.R3(v, v3, list0)) {
            this.c5(v, v3, list0);
            return;
        }
        List list1 = this.V3(list0);
        if(this.p1.isEmpty()) {
            if(this.B2 == -1) {
                z = true;
            }
            this.G1(list1, z);
            return;
        }
        PlaybackInfo playbackInfo0 = this.P4(this.P3(this.A2, v3, list1), v, v3);
        this.e5(playbackInfo0, 0, !playbackInfo0.b.a.equals(this.A2.b.a), 4, this.Z3(playbackInfo0), -1, false);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void I0(int v, List list0) {
        this.i5();
        boolean z = false;
        Assertions.a(v >= 0);
        int v1 = Math.min(v, this.p1.size());
        if(this.p1.isEmpty()) {
            if(this.B2 == -1) {
                z = true;
            }
            this.G1(list0, z);
            return;
        }
        this.e5(this.P3(this.A2, v1, list0), 0, false, 5, 0x8000000000000001L, -1, false);
    }

    // 检测为 Lambda 实现
    private static void I4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public int J() {
        this.i5();
        return this.g2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public Renderer J0(int v) {
        this.i5();
        return this.h1[v];
    }

    @Override  // androidx.media3.common.Player
    public void J1(androidx.media3.common.Player.Listener player$Listener0) {
        this.i5();
        androidx.media3.common.Player.Listener player$Listener1 = (androidx.media3.common.Player.Listener)Assertions.g(player$Listener0);
        this.m1.l(player$Listener1);
    }

    // 检测为 Lambda 实现
    private static void J4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void K(List list0) {
        this.i5();
        try {
            Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(androidx.media3.common.VideoFrameProcessor.Factory.class);
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", classNotFoundException0);
        }
        this.S4(2, 13, list0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void K1(boolean z) {
        this.i5();
        if(this.w2) {
            return;
        }
        this.B1.b(z);
    }

    // 检测为 Lambda 实现
    private static void K4(PlaybackInfo playbackInfo0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$TextComponent, androidx.media3.common.Player
    public CueGroup L() {
        this.i5();
        return this.o2;
    }

    @Override  // androidx.media3.common.Player
    public int L0() {
        this.i5();
        return this.A2.a.w() ? this.C2 : this.A2.a.f(this.A2.b.a);
    }

    private PlaybackInfo L4(PlaybackInfo playbackInfo0, Timeline timeline0, @Nullable Pair pair0) {
        Assertions.a(timeline0.w() || pair0 != null);
        Timeline timeline1 = playbackInfo0.a;
        long v = this.Y3(playbackInfo0);
        PlaybackInfo playbackInfo1 = playbackInfo0.j(timeline0);
        if(timeline0.w()) {
            MediaPeriodId mediaSource$MediaPeriodId0 = PlaybackInfo.l();
            long v1 = Util.F1(this.D2);
            PlaybackInfo playbackInfo2 = playbackInfo1.d(mediaSource$MediaPeriodId0, v1, v1, v1, 0L, TrackGroupArray.e, this.c1, O2.A()).c(mediaSource$MediaPeriodId0);
            playbackInfo2.q = playbackInfo2.s;
            return playbackInfo2;
        }
        boolean z = playbackInfo1.b.a.equals(pair0.first);
        MediaPeriodId mediaSource$MediaPeriodId1 = z ? playbackInfo1.b : new MediaPeriodId(pair0.first);
        long v2 = (long)(((Long)pair0.second));
        long v3 = timeline1.w() ? Util.F1(v) : Util.F1(v) - timeline1.l(playbackInfo1.b.a, this.o1).r();
        if(z) {
            int v4 = Long.compare(v2, v3);
            if(v4 >= 0) {
                if(v4 != 0) {
                    goto label_25;
                }
                int v5 = timeline0.f(playbackInfo1.k.a);
                if(v5 == -1 || timeline0.j(v5, this.o1).c != timeline0.l(mediaSource$MediaPeriodId1.a, this.o1).c) {
                    timeline0.l(mediaSource$MediaPeriodId1.a, this.o1);
                    long v6 = mediaSource$MediaPeriodId1.c() ? this.o1.d(mediaSource$MediaPeriodId1.b, mediaSource$MediaPeriodId1.c) : this.o1.d;
                    playbackInfo1 = playbackInfo1.d(mediaSource$MediaPeriodId1, playbackInfo1.s, playbackInfo1.s, playbackInfo1.d, v6 - playbackInfo1.s, playbackInfo1.h, playbackInfo1.i, playbackInfo1.j).c(mediaSource$MediaPeriodId1);
                    playbackInfo1.q = v6;
                    return playbackInfo1;
                label_25:
                    Assertions.i(!mediaSource$MediaPeriodId1.c());
                    long v7 = Math.max(0L, playbackInfo1.r - (v2 - v3));
                    long v8 = playbackInfo1.k.equals(playbackInfo1.b) ? v2 + v7 : playbackInfo1.q;
                    playbackInfo1 = playbackInfo1.d(mediaSource$MediaPeriodId1, v2, v2, v2, v7, playbackInfo1.h, playbackInfo1.i, playbackInfo1.j);
                    playbackInfo1.q = v8;
                    return playbackInfo1;
                }
            }
            else {
                goto label_31;
            }
        }
        else {
        label_31:
            Assertions.i(!mediaSource$MediaPeriodId1.c());
            TrackGroupArray trackGroupArray0 = z ? playbackInfo1.h : TrackGroupArray.e;
            TrackSelectorResult trackSelectorResult0 = z ? playbackInfo1.i : this.c1;
            List list0 = z ? playbackInfo1.j : O2.A();
            playbackInfo1 = playbackInfo1.d(mediaSource$MediaPeriodId1, v2, v2, v2, 0L, trackGroupArray0, trackSelectorResult0, list0).c(mediaSource$MediaPeriodId1);
            playbackInfo1.q = v2;
        }
        return playbackInfo1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void M(int v) {
        this.i5();
        if(this.g2 == v) {
            return;
        }
        this.g2 = v;
        this.S4(2, 5, v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void M0(AudioOffloadListener exoPlayer$AudioOffloadListener0) {
        this.i5();
        this.n1.remove(exoPlayer$AudioOffloadListener0);
    }

    @Override  // androidx.media3.common.Player
    public void M1(androidx.media3.common.Player.Listener player$Listener0) {
        androidx.media3.common.Player.Listener player$Listener1 = (androidx.media3.common.Player.Listener)Assertions.g(player$Listener0);
        this.m1.c(player$Listener1);
    }

    @Nullable
    private Pair M4(Timeline timeline0, int v, long v1) {
        if(timeline0.w()) {
            this.B2 = v;
            if(v1 == 0x8000000000000001L) {
                v1 = 0L;
            }
            this.D2 = v1;
            this.C2 = 0;
            return null;
        }
        if(v != -1 && v < timeline0.v()) {
            return timeline0.p(this.b1, this.o1, v, Util.F1(v1));
        }
        v = timeline0.e(this.K1);
        v1 = timeline0.t(v, this.b1).c();
        return timeline0.p(this.b1, this.o1, v, Util.F1(v1));
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void N(@Nullable TextureView textureView0) {
        this.i5();
        if(textureView0 == null) {
            this.Q();
            return;
        }
        this.R4();
        this.e2 = textureView0;
        if(textureView0.getSurfaceTextureListener() != null) {
            Log.n("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView0.setSurfaceTextureListener(this.z1);
        SurfaceTexture surfaceTexture0 = textureView0.isAvailable() ? textureView0.getSurfaceTexture() : null;
        if(surfaceTexture0 == null) {
            this.Z4(null);
            this.N4(0, 0);
            return;
        }
        this.X4(surfaceTexture0);
        this.N4(textureView0.getWidth(), textureView0.getHeight());
    }

    @Override  // androidx.media3.common.Player
    public int N0() {
        this.i5();
        return this.W() ? this.A2.b.c : -1;
    }

    @Override  // androidx.media3.common.Player
    public int N1() {
        this.i5();
        return this.A2.n;
    }

    private void N4(int v, int v1) {
        if(v != this.h2.b() || v1 != this.h2.a()) {
            this.h2 = new Size(v, v1);
            V v2 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.l0(v, v1);
            this.m1.m(24, v2);
            this.S4(2, 14, new Size(v, v1));
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public VideoSize O() {
        this.i5();
        return this.y2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void O0(List list0) {
        this.i5();
        this.I0(this.p1.size(), list0);
    }

    @Override  // androidx.media3.common.Player
    public Timeline O1() {
        this.i5();
        return this.A2.a;
    }

    private List O3(int v, List list0) {
        List list1 = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            MediaSourceHolder mediaSourceList$MediaSourceHolder0 = new MediaSourceHolder(((MediaSource)list0.get(v1)), this.q1);
            list1.add(mediaSourceList$MediaSourceHolder0);
            MediaSourceHolderSnapshot exoPlayerImpl$MediaSourceHolderSnapshot0 = new MediaSourceHolderSnapshot(mediaSourceList$MediaSourceHolder0.b, mediaSourceList$MediaSourceHolder0.a);
            this.p1.add(v1 + v, exoPlayerImpl$MediaSourceHolderSnapshot0);
        }
        this.Q1 = this.Q1.g(v, list1.size());
        return list1;
    }

    private long O4(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, long v) {
        timeline0.l(mediaSource$MediaPeriodId0.a, this.o1);
        return v + this.o1.r();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void P0(MediaSource mediaSource0) {
        this.i5();
        this.k2(mediaSource0);
        this.n();
    }

    @Override  // androidx.media3.common.Player
    public Looper P1() {
        return this.t1;
    }

    private PlaybackInfo P3(PlaybackInfo playbackInfo0, int v, List list0) {
        ++this.L1;
        List list1 = this.O3(v, list0);
        Timeline timeline0 = this.U3();
        int v1 = this.a4(playbackInfo0);
        long v2 = this.Y3(playbackInfo0);
        PlaybackInfo playbackInfo1 = this.L4(playbackInfo0, timeline0, this.b4(playbackInfo0.a, timeline0, v1, v2));
        this.l1.o(v, list1, this.Q1);
        return playbackInfo1;
    }

    private PlaybackInfo P4(PlaybackInfo playbackInfo0, int v, int v1) {
        int v2 = this.a4(playbackInfo0);
        long v3 = this.Y3(playbackInfo0);
        ++this.L1;
        this.Q4(v, v1);
        Timeline timeline0 = this.U3();
        PlaybackInfo playbackInfo1 = this.L4(playbackInfo0, timeline0, this.b4(playbackInfo0.a, timeline0, v2, v3));
        if(playbackInfo1.e != 1 && playbackInfo1.e != 4 && v < v1 && v1 == this.p1.size() && v2 >= playbackInfo1.a.v()) {
            playbackInfo1 = playbackInfo1.h(4);
        }
        this.l1.x0(v, v1, this.Q1);
        return playbackInfo1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void Q() {
        this.i5();
        this.R4();
        this.Z4(null);
        this.N4(0, 0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @a
    @Deprecated
    public AudioComponent Q0() {
        this.i5();
        return this;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void Q1(AnalyticsListener analyticsListener0) {
        AnalyticsListener analyticsListener1 = (AnalyticsListener)Assertions.g(analyticsListener0);
        this.s1.O(analyticsListener1);
    }

    private MediaMetadata Q3() {
        Timeline timeline0 = this.O1();
        if(timeline0.w()) {
            return this.z2;
        }
        MediaItem mediaItem0 = timeline0.t(this.n2(), this.b1).c;
        return this.z2.a().K(mediaItem0.e).I();
    }

    private void Q4(int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            this.p1.remove(v2);
        }
        this.Q1 = this.Q1.f(v, v1);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void R(VideoFrameMetadataListener videoFrameMetadataListener0) {
        this.i5();
        if(this.p2 != videoFrameMetadataListener0) {
            return;
        }
        this.W3(this.A1).t(7).q(null).n();
    }

    @Override  // androidx.media3.common.Player
    public void R0(List list0, int v, long v1) {
        this.i5();
        this.x0(this.V3(list0), v, v1);
    }

    private boolean R3(int v, int v1, List list0) {
        if(v1 - v != list0.size()) {
            return false;
        }
        for(int v2 = v; v2 < v1; ++v2) {
            if(!((MediaSourceHolderSnapshot)this.p1.get(v2)).b.S(((MediaItem)list0.get(v2 - v)))) {
                return false;
            }
        }
        return true;
    }

    private void R4() {
        if(this.c2 != null) {
            this.W3(this.A1).t(10000).q(null).n();
            this.c2.i(this.z1);
            this.c2 = null;
        }
        TextureView textureView0 = this.e2;
        if(textureView0 != null) {
            if(textureView0.getSurfaceTextureListener() == this.z1) {
                this.e2.setSurfaceTextureListener(null);
            }
            else {
                Log.n("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            }
            this.e2 = null;
        }
        SurfaceHolder surfaceHolder0 = this.b2;
        if(surfaceHolder0 != null) {
            surfaceHolder0.removeCallback(this.z1);
            this.b2 = null;
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void S(@Nullable SurfaceView surfaceView0) {
        this.i5();
        this.x((surfaceView0 == null ? null : surfaceView0.getHolder()));
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public TrackSelectionArray S1() {
        this.i5();
        return new TrackSelectionArray(this.A2.i.c);
    }

    private int S3(boolean z, int v) {
        if(v == 0) {
            return 1;
        }
        if(this.I1) {
            if(z && !this.h4()) {
                return 3;
            }
            return z || this.A2.n != 3 ? 0 : 3;
        }
        return 0;
    }

    private void S4(int v, int v1, @Nullable Object object0) {
        Renderer[] arr_renderer = this.h1;
        for(int v2 = 0; v2 < arr_renderer.length; ++v2) {
            Renderer renderer0 = arr_renderer[v2];
            if(v == -1 || renderer0.g() == v) {
                this.W3(renderer0).t(v1).q(object0).n();
            }
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void T(CameraMotionListener cameraMotionListener0) {
        this.i5();
        this.q2 = cameraMotionListener0;
        this.W3(this.A1).t(8).q(cameraMotionListener0).n();
    }

    @Override  // androidx.media3.common.Player
    public long T0() {
        this.i5();
        return this.w1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public int T1(int v) {
        this.i5();
        return this.h1[v].g();
    }

    private static DeviceInfo T3(@Nullable StreamVolumeManager streamVolumeManager0) {
        int v = 0;
        androidx.media3.common.DeviceInfo.Builder deviceInfo$Builder0 = new androidx.media3.common.DeviceInfo.Builder(0).g((streamVolumeManager0 == null ? 0 : streamVolumeManager0.e()));
        if(streamVolumeManager0 != null) {
            v = streamVolumeManager0.d();
        }
        return deviceInfo$Builder0.f(v).e();
    }

    private void T4(int v, @Nullable Object object0) {
        this.S4(-1, v, object0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void U(int v) {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.n(v, 1);
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters U0() {
        this.i5();
        return this.i2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean U1() {
        this.i5();
        return this.S1;
    }

    private Timeline U3() {
        return new PlaylistTimeline(this.p1, this.Q1);
    }

    private void U4() {
        this.S4(1, 2, ((float)(this.m2 * this.C1.h())));
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean V() {
        this.i5();
        RendererConfiguration[] arr_rendererConfiguration = this.A2.i.b;
        for(int v = 0; v < arr_rendererConfiguration.length; ++v) {
            RendererConfiguration rendererConfiguration0 = arr_rendererConfiguration[v];
            if(rendererConfiguration0 != null && rendererConfiguration0.b) {
                return true;
            }
        }
        return false;
    }

    private List V3(List list0) {
        List list1 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            MediaItem mediaItem0 = (MediaItem)list0.get(v);
            list1.add(this.r1.g(mediaItem0));
        }
        return list1;
    }

    private void V4(List list0, int v, long v1, boolean z) {
        int v5;
        long v4;
        int v2 = this.a4(this.A2);
        long v3 = this.getCurrentPosition();
        boolean z1 = true;
        ++this.L1;
        if(!this.p1.isEmpty()) {
            this.Q4(0, this.p1.size());
        }
        List list1 = this.O3(0, list0);
        Timeline timeline0 = this.U3();
        if(!timeline0.w() && v >= timeline0.v()) {
            throw new IllegalSeekPositionException(timeline0, v, v1);
        }
        if(z) {
            v4 = 0x8000000000000001L;
            v5 = timeline0.e(this.K1);
        }
        else if(v == -1) {
            v5 = v2;
            v4 = v3;
        }
        else {
            v5 = v;
            v4 = v1;
        }
        PlaybackInfo playbackInfo0 = this.L4(this.A2, timeline0, this.M4(timeline0, v5, v4));
        int v6 = playbackInfo0.e;
        if(v5 != -1 && v6 != 1) {
            v6 = timeline0.w() || v5 >= timeline0.v() ? 4 : 2;
        }
        PlaybackInfo playbackInfo1 = playbackInfo0.h(v6);
        this.l1.Z0(list1, v5, Util.F1(v4), this.Q1);
        if(this.A2.b.a.equals(playbackInfo1.b.a) || this.A2.a.w()) {
            z1 = false;
        }
        this.e5(playbackInfo1, 0, z1, 4, this.Z3(playbackInfo1), -1, false);
    }

    @Override  // androidx.media3.common.Player
    public boolean W() {
        this.i5();
        return this.A2.b.c();
    }

    @Override  // androidx.media3.common.Player
    public MediaMetadata W0() {
        this.i5();
        return this.V1;
    }

    private PlayerMessage W3(Target playerMessage$Target0) {
        int v = this.a4(this.A2);
        Timeline timeline0 = this.A2.a;
        return v == -1 ? new PlayerMessage(this.l1, playerMessage$Target0, timeline0, 0, this.y1, this.l1.H()) : new PlayerMessage(this.l1, playerMessage$Target0, timeline0, v, this.y1, this.l1.H());
    }

    private void W4(SurfaceHolder surfaceHolder0) {
        this.d2 = false;
        this.b2 = surfaceHolder0;
        surfaceHolder0.addCallback(this.z1);
        Surface surface0 = this.b2.getSurface();
        if(surface0 != null && surface0.isValid()) {
            Rect rect0 = this.b2.getSurfaceFrame();
            this.N4(rect0.width(), rect0.height());
            return;
        }
        this.N4(0, 0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void X0(MediaSource mediaSource0, boolean z, boolean z1) {
        this.i5();
        this.e0(mediaSource0, z);
        this.n();
    }

    @Override  // androidx.media3.common.Player
    public Commands X1() {
        this.i5();
        return this.T1;
    }

    private Pair X3(PlaybackInfo playbackInfo0, PlaybackInfo playbackInfo1, boolean z, int v, boolean z1, boolean z2) {
        Timeline timeline0 = playbackInfo1.a;
        Timeline timeline1 = playbackInfo0.a;
        if(timeline1.w() && timeline0.w()) {
            return new Pair(Boolean.FALSE, -1);
        }
        if(timeline1.w() != timeline0.w()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if(!timeline0.t(timeline0.l(playbackInfo1.b.a, this.o1).c, this.b1).a.equals(timeline1.t(timeline1.l(playbackInfo0.b.a, this.o1).c, this.b1).a)) {
            if(z && v == 0) {
                return new Pair(Boolean.TRUE, 1);
            }
            if(z && v == 1) {
                return new Pair(Boolean.TRUE, 2);
            }
            if(!z1) {
                throw new IllegalStateException();
            }
            return new Pair(Boolean.TRUE, 3);
        }
        if(z && v == 0 && playbackInfo1.b.d < playbackInfo0.b.d) {
            return new Pair(Boolean.TRUE, 0);
        }
        return !z || v != 1 || !z2 ? new Pair(Boolean.FALSE, -1) : new Pair(Boolean.TRUE, 2);
    }

    private void X4(SurfaceTexture surfaceTexture0) {
        Surface surface0 = new Surface(surfaceTexture0);
        this.Z4(surface0);
        this.a2 = surface0;
    }

    @Override  // androidx.media3.common.Player
    public long Y() {
        this.i5();
        return Util.B2(this.A2.r);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void Y0(@Nullable PriorityTaskManager priorityTaskManager0) {
        this.i5();
        if(Util.g(this.u2, priorityTaskManager0)) {
            return;
        }
        if(this.v2) {
            ((PriorityTaskManager)Assertions.g(this.u2)).e(this.t2);
        }
        if(priorityTaskManager0 == null || !this.a()) {
            this.v2 = false;
        }
        else {
            priorityTaskManager0.a(this.t2);
            this.v2 = true;
        }
        this.u2 = priorityTaskManager0;
    }

    @Override  // androidx.media3.common.Player
    public void Y1(int v, int v1) {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.n(v, v1);
        }
    }

    private long Y3(PlaybackInfo playbackInfo0) {
        if(playbackInfo0.b.c()) {
            playbackInfo0.a.l(playbackInfo0.b.a, this.o1);
            if(playbackInfo0.c == 0x8000000000000001L) {
                int v = this.a4(playbackInfo0);
                return playbackInfo0.a.t(v, this.b1).c();
            }
            return this.o1.q() + Util.B2(playbackInfo0.c);
        }
        return Util.B2(this.Z3(playbackInfo0));
    }

    void Y4(boolean z) {
        this.r2 = z;
        this.m1.n(z);
        AnalyticsCollector analyticsCollector0 = this.s1;
        if(analyticsCollector0 instanceof DefaultAnalyticsCollector) {
            ((DefaultAnalyticsCollector)analyticsCollector0).t3(z);
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void Z(ShuffleOrder shuffleOrder0) {
        this.i5();
        Assertions.a(shuffleOrder0.getLength() == this.p1.size());
        this.Q1 = shuffleOrder0;
        Timeline timeline0 = this.U3();
        PlaybackInfo playbackInfo0 = this.L4(this.A2, timeline0, this.M4(timeline0, this.n2(), this.getCurrentPosition()));
        ++this.L1;
        this.l1.p1(shuffleOrder0);
        this.e5(playbackInfo0, 0, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // androidx.media3.common.Player
    public void Z0(TrackSelectionParameters trackSelectionParameters0) {
        this.i5();
        if(this.i1.h() && !trackSelectionParameters0.equals(this.i1.c())) {
            this.i1.m(trackSelectionParameters0);
            g0 g00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.g0(trackSelectionParameters0);
            this.m1.m(19, g00);
        }
    }

    private long Z3(PlaybackInfo playbackInfo0) {
        if(playbackInfo0.a.w()) {
            return Util.F1(this.D2);
        }
        long v = playbackInfo0.p ? playbackInfo0.m() : playbackInfo0.s;
        return playbackInfo0.b.c() ? v : this.O4(playbackInfo0.a, playbackInfo0.b, v);
    }

    private void Z4(@Nullable Object object0) {
        ArrayList arrayList0 = new ArrayList();
        Renderer[] arr_renderer = this.h1;
        boolean z = false;
        for(int v = 0; v < arr_renderer.length; ++v) {
            Renderer renderer0 = arr_renderer[v];
            if(renderer0.g() == 2) {
                arrayList0.add(this.W3(renderer0).t(1).q(object0).n());
            }
        }
        if(this.Z1 != null && this.Z1 != object0) {
            try {
                for(Object object1: arrayList0) {
                    ((PlayerMessage)object1).b(this.G1);
                }
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
            catch(TimeoutException unused_ex) {
                z = true;
            }
            Surface surface0 = this.a2;
            if(this.Z1 == surface0) {
                surface0.release();
                this.a2 = null;
            }
        }
        this.Z1 = object0;
        if(z) {
            this.a5(ExoPlaybackException.o(new ExoTimeoutException(3), 1003));
        }
    }

    @Override  // androidx.media3.common.Player
    public boolean a() {
        this.i5();
        return this.A2.g;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public Clock a0() {
        return this.y1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public SeekParameters a1() {
        this.i5();
        return this.P1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public PreloadConfiguration a2() {
        return this.R1;
    }

    // 去混淆评级： 低(20)
    private int a4(PlaybackInfo playbackInfo0) {
        return playbackInfo0.a.w() ? this.B2 : playbackInfo0.a.l(playbackInfo0.b.a, this.o1).c;
    }

    private void a5(@Nullable ExoPlaybackException exoPlaybackException0) {
        PlaybackInfo playbackInfo0 = this.A2.c(this.A2.b);
        playbackInfo0.q = playbackInfo0.s;
        playbackInfo0.r = 0L;
        PlaybackInfo playbackInfo1 = playbackInfo0.h(1);
        if(exoPlaybackException0 != null) {
            playbackInfo1 = playbackInfo1.f(exoPlaybackException0);
        }
        ++this.L1;
        this.l1.y1();
        this.e5(playbackInfo1, 0, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // androidx.media3.common.Player
    public int b() {
        this.i5();
        return this.A2.e;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public TrackSelector b0() {
        this.i5();
        return this.i1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @a
    @Deprecated
    public DeviceComponent b2() {
        this.i5();
        return this;
    }

    @Nullable
    private Pair b4(Timeline timeline0, Timeline timeline1, int v, long v1) {
        long v2 = 0x8000000000000001L;
        int v3 = -1;
        if(!timeline0.w() && !timeline1.w()) {
            Pair pair0 = timeline0.p(this.b1, this.o1, v, Util.F1(v1));
            Object object0 = pair0.first;
            if(timeline1.f(object0) != -1) {
                return pair0;
            }
            int v4 = ExoPlayerImplInternal.J0(this.b1, this.o1, this.J1, this.K1, object0, timeline0, timeline1);
            return v4 == -1 ? this.M4(timeline1, -1, 0x8000000000000001L) : this.M4(timeline1, v4, timeline1.t(v4, this.b1).c());
        }
        boolean z = !timeline0.w() && timeline1.w();
        if(!z) {
            v3 = v;
        }
        if(!z) {
            v2 = v1;
        }
        return this.M4(timeline1, v3, v2);
    }

    private void b5() {
        Commands player$Commands0 = this.T1;
        Commands player$Commands1 = Util.c0(this.g1, this.d1);
        this.T1 = player$Commands1;
        if(!player$Commands1.equals(player$Commands0)) {
            h0 h00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.L(this.T1);
            this.m1.j(13, h00);
        }
    }

    @Override  // androidx.media3.common.Player
    public void c0(List list0, boolean z) {
        this.i5();
        this.G1(this.V3(list0), z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public AnalyticsCollector c1() {
        this.i5();
        return this.s1;
    }

    private static int c4(int v) {
        return v == -1 ? 2 : 1;
    }

    private void c5(int v, int v1, List list0) {
        ++this.L1;
        this.l1.D1(v, v1, list0);
        for(int v2 = v; v2 < v1; ++v2) {
            MediaSourceHolderSnapshot exoPlayerImpl$MediaSourceHolderSnapshot0 = (MediaSourceHolderSnapshot)this.p1.get(v2);
            exoPlayerImpl$MediaSourceHolderSnapshot0.d(new TimelineWithUpdatedMediaItem(exoPlayerImpl$MediaSourceHolderSnapshot0.b(), ((MediaItem)list0.get(v2 - v))));
        }
        Timeline timeline0 = this.U3();
        this.e5(this.A2.j(timeline0), 0, false, 4, 0x8000000000000001L, -1, false);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public AudioAttributes d() {
        this.i5();
        return this.l2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void d0(@Nullable SeekParameters seekParameters0) {
        this.i5();
        if(seekParameters0 == null) {
            seekParameters0 = SeekParameters.g;
        }
        if(!this.P1.equals(seekParameters0)) {
            this.P1 = seekParameters0;
            this.l1.l1(seekParameters0);
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean d1() {
        this.i5();
        return this.A2.p;
    }

    @Override  // androidx.media3.common.Player
    public long d2() {
        this.i5();
        return this.Y3(this.A2);
    }

    private PositionInfo d4(long v) {
        MediaItem mediaItem0;
        Object object2;
        Object object1;
        int v2;
        int v1 = this.n2();
        if(this.A2.a.w()) {
            object2 = null;
            mediaItem0 = null;
            object1 = null;
            v2 = -1;
        }
        else {
            Object object0 = this.A2.b.a;
            this.A2.a.l(object0, this.o1);
            v2 = this.A2.a.f(object0);
            object1 = object0;
            object2 = this.A2.a.t(v1, this.b1).a;
            mediaItem0 = this.b1.c;
        }
        long v3 = Util.B2(v);
        return this.A2.b.c() ? new PositionInfo(object2, v1, mediaItem0, object1, v2, v3, Util.B2(ExoPlayerImpl.f4(this.A2)), this.A2.b.b, this.A2.b.c) : new PositionInfo(object2, v1, mediaItem0, object1, v2, v3, v3, this.A2.b.b, this.A2.b.c);
    }

    private void d5(boolean z, int v, int v1) {
        boolean z1 = z && v != -1;
        int v2 = this.S3(z1, v);
        if(this.A2.l == z1 && this.A2.n == v2 && this.A2.m == v1) {
            return;
        }
        this.f5(z1, v1, v2);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void e(VideoFrameMetadataListener videoFrameMetadataListener0) {
        this.i5();
        this.p2 = videoFrameMetadataListener0;
        this.W3(this.A1).t(7).q(videoFrameMetadataListener0).n();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void e0(MediaSource mediaSource0, boolean z) {
        this.i5();
        this.G1(Collections.singletonList(mediaSource0), z);
    }

    @Override  // androidx.media3.common.Player
    public long e1() {
        this.i5();
        if(this.A2.a.w()) {
            return this.D2;
        }
        PlaybackInfo playbackInfo0 = this.A2;
        if(playbackInfo0.k.d != playbackInfo0.b.d) {
            int v = this.n2();
            return playbackInfo0.a.t(v, this.b1).e();
        }
        long v1 = playbackInfo0.q;
        if(this.A2.k.c()) {
            Period timeline$Period0 = this.A2.a.l(this.A2.k.a, this.o1);
            long v2 = timeline$Period0.h(this.A2.k.b);
            if(v2 == 0x8000000000000000L) {
                return Util.B2(this.O4(this.A2.a, this.A2.k, timeline$Period0.d));
            }
            v1 = v2;
        }
        return Util.B2(this.O4(this.A2.a, this.A2.k, v1));
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format e2() {
        this.i5();
        return this.X1;
    }

    private PositionInfo e4(int v, PlaybackInfo playbackInfo0, int v1) {
        long v7;
        long v6;
        int v5;
        Object object1;
        int v4;
        Object object0;
        MediaItem mediaItem0;
        Period timeline$Period0 = new Period();
        if(playbackInfo0.a.w()) {
            v5 = v1;
            object1 = null;
            mediaItem0 = null;
            object0 = null;
            v4 = -1;
        }
        else {
            playbackInfo0.a.l(playbackInfo0.b.a, timeline$Period0);
            int v2 = timeline$Period0.c;
            int v3 = playbackInfo0.a.f(playbackInfo0.b.a);
            Window timeline$Window0 = playbackInfo0.a.t(v2, this.b1);
            mediaItem0 = this.b1.c;
            object0 = playbackInfo0.b.a;
            v4 = v3;
            object1 = timeline$Window0.a;
            v5 = v2;
        }
        if(v == 0) {
            if(playbackInfo0.b.c()) {
                v6 = timeline$Period0.d(playbackInfo0.b.b, playbackInfo0.b.c);
                v7 = ExoPlayerImpl.f4(playbackInfo0);
                return new PositionInfo(object1, v5, mediaItem0, object0, v4, Util.B2(v6), Util.B2(v7), playbackInfo0.b.b, playbackInfo0.b.c);
            }
            if(playbackInfo0.b.e != -1) {
                v6 = ExoPlayerImpl.f4(this.A2);
                return new PositionInfo(object1, v5, mediaItem0, object0, v4, Util.B2(v6), Util.B2(v6), playbackInfo0.b.b, playbackInfo0.b.c);
            }
            v6 = timeline$Period0.e + timeline$Period0.d;
            return new PositionInfo(object1, v5, mediaItem0, object0, v4, Util.B2(v6), Util.B2(v6), playbackInfo0.b.b, playbackInfo0.b.c);
        }
        if(playbackInfo0.b.c()) {
            v6 = playbackInfo0.s;
            v7 = ExoPlayerImpl.f4(playbackInfo0);
            return new PositionInfo(object1, v5, mediaItem0, object0, v4, Util.B2(v6), Util.B2(v7), playbackInfo0.b.b, playbackInfo0.b.c);
        }
        v6 = timeline$Period0.e + playbackInfo0.s;
        return new PositionInfo(object1, v5, mediaItem0, object0, v4, Util.B2(v6), Util.B2(v6), playbackInfo0.b.b, playbackInfo0.b.c);
    }

    private void e5(PlaybackInfo playbackInfo0, int v, boolean z, int v1, long v2, int v3, boolean z1) {
        PlaybackInfo playbackInfo1 = this.A2;
        this.A2 = playbackInfo0;
        boolean z2 = playbackInfo1.a.equals(playbackInfo0.a);
        Pair pair0 = this.X3(playbackInfo0, playbackInfo1, z, v1, !z2, z1);
        boolean z3 = ((Boolean)pair0.first).booleanValue();
        int v4 = (int)(((Integer)pair0.second));
        MediaItem mediaItem0 = null;
        if(z3) {
            if(!playbackInfo0.a.w()) {
                Period timeline$Period0 = playbackInfo0.a.l(playbackInfo0.b.a, this.o1);
                mediaItem0 = playbackInfo0.a.t(timeline$Period0.c, this.b1).c;
            }
            this.z2 = MediaMetadata.W0;
        }
        if(z3 || !playbackInfo1.j.equals(playbackInfo0.j)) {
            this.z2 = this.z2.a().M(playbackInfo0.j).I();
        }
        MediaMetadata mediaMetadata0 = this.Q3();
        boolean z4 = mediaMetadata0.equals(this.U1);
        this.U1 = mediaMetadata0;
        boolean z5 = playbackInfo1.l != playbackInfo0.l;
        boolean z6 = playbackInfo1.e != playbackInfo0.e;
        if(z6 || z5) {
            this.h5();
        }
        boolean z7 = playbackInfo0.g;
        boolean z8 = playbackInfo1.g != z7;
        if(z8) {
            this.g5(z7);
        }
        if(!z2) {
            Y y0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.Q(playbackInfo0.a, v);
            this.m1.j(0, y0);
        }
        if(z) {
            m0 m00 = (androidx.media3.common.Player.Listener player$Listener0) -> {
                player$Listener0.o0(v1);
                player$Listener0.Y(this.e4(v1, playbackInfo1, v3), this.d4(v2), v1);
            };
            this.m1.j(11, m00);
        }
        if(z3) {
            n0 n00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.i0(mediaItem0, v4);
            this.m1.j(1, n00);
        }
        if(playbackInfo1.f != playbackInfo0.f) {
            o0 o00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.w0(playbackInfo0.f);
            this.m1.j(10, o00);
            if(playbackInfo0.f != null) {
                p0 p00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.J(playbackInfo0.f);
                this.m1.j(10, p00);
            }
        }
        TrackSelectorResult trackSelectorResult0 = playbackInfo0.i;
        if(playbackInfo1.i != trackSelectorResult0) {
            this.i1.i(trackSelectorResult0.e);
            N n0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.S(playbackInfo0.i.d);
            this.m1.j(2, n0);
        }
        if(!z4) {
            O o0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.I(this.U1);
            this.m1.j(14, o0);
        }
        if(z8) {
            P p0 = (androidx.media3.common.Player.Listener player$Listener0) -> {
                player$Listener0.C(playbackInfo0.g);
                player$Listener0.p0(playbackInfo0.g);
            };
            this.m1.j(3, p0);
        }
        if(z6 || z5) {
            Q q0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.u0(playbackInfo0.l, playbackInfo0.e);
            this.m1.j(-1, q0);
        }
        if(z6) {
            S s0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.c0(playbackInfo0.e);
            this.m1.j(4, s0);
        }
        if(z5 || playbackInfo1.m != playbackInfo0.m) {
            i0 i00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.V(playbackInfo0.l, playbackInfo0.m);
            this.m1.j(5, i00);
        }
        if(playbackInfo1.n != playbackInfo0.n) {
            j0 j00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.a0(playbackInfo0.n);
            this.m1.j(6, j00);
        }
        if(playbackInfo1.n() != playbackInfo0.n()) {
            k0 k00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.Z(playbackInfo0.n());
            this.m1.j(7, k00);
        }
        if(!playbackInfo1.o.equals(playbackInfo0.o)) {
            l0 l00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.q(playbackInfo0.o);
            this.m1.j(12, l00);
        }
        this.b5();
        this.m1.g();
        if(playbackInfo1.p != playbackInfo0.p) {
            for(Object object0: this.n1) {
                ((AudioOffloadListener)object0).A(playbackInfo0.p);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.common.Player
    @Nullable
    public PlaybackException f() {
        return this.f();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public ExoPlaybackException f() {
        this.i5();
        return this.A2.f;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void f0(AudioOffloadListener exoPlayer$AudioOffloadListener0) {
        this.n1.add(exoPlayer$AudioOffloadListener0);
    }

    @Override  // androidx.media3.common.Player
    public void f2(int v, List list0) {
        this.i5();
        this.I0(v, this.V3(list0));
    }

    private static long f4(PlaybackInfo playbackInfo0) {
        Window timeline$Window0 = new Window();
        Period timeline$Period0 = new Period();
        playbackInfo0.a.l(playbackInfo0.b.a, timeline$Period0);
        return playbackInfo0.c == 0x8000000000000001L ? playbackInfo0.a.t(timeline$Period0.c, timeline$Window0).d() : timeline$Period0.r() + playbackInfo0.c;
    }

    private void f5(boolean z, int v, int v1) {
        ++this.L1;
        PlaybackInfo playbackInfo0 = (this.A2.p ? this.A2.a() : this.A2).e(z, v, v1);
        this.l1.d1(z, v, v1);
        this.e5(playbackInfo0, 0, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$VideoComponent
    public void g(int v) {
        this.i5();
        this.f2 = v;
        this.S4(2, 4, v);
    }

    @Override  // androidx.media3.common.Player
    public void g0(int v) {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.i(v);
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters g1() {
        this.i5();
        return this.j2;
    }

    private void g4(PlaybackInfoUpdate exoPlayerImplInternal$PlaybackInfoUpdate0) {
        int v = this.L1 - exoPlayerImplInternal$PlaybackInfoUpdate0.c;
        this.L1 = v;
        boolean z = true;
        if(exoPlayerImplInternal$PlaybackInfoUpdate0.d) {
            this.M1 = exoPlayerImplInternal$PlaybackInfoUpdate0.e;
            this.N1 = true;
        }
        if(v == 0) {
            Timeline timeline0 = exoPlayerImplInternal$PlaybackInfoUpdate0.b.a;
            if(!this.A2.a.w() && timeline0.w()) {
                this.B2 = -1;
                this.D2 = 0L;
                this.C2 = 0;
            }
            if(!timeline0.w()) {
                List list0 = ((PlaylistTimeline)timeline0).M();
                Assertions.i(list0.size() == this.p1.size());
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    ((MediaSourceHolderSnapshot)this.p1.get(v1)).d(((Timeline)list0.get(v1)));
                }
            }
            long v2 = 0x8000000000000001L;
            if(!this.N1) {
                z = false;
            }
            else if(exoPlayerImplInternal$PlaybackInfoUpdate0.b.b.equals(this.A2.b) && exoPlayerImplInternal$PlaybackInfoUpdate0.b.d == this.A2.s) {
                z = false;
            }
            else {
                v2 = timeline0.w() || exoPlayerImplInternal$PlaybackInfoUpdate0.b.b.c() ? exoPlayerImplInternal$PlaybackInfoUpdate0.b.d : this.O4(timeline0, exoPlayerImplInternal$PlaybackInfoUpdate0.b.b, exoPlayerImplInternal$PlaybackInfoUpdate0.b.d);
            }
            this.N1 = false;
            this.e5(exoPlayerImplInternal$PlaybackInfoUpdate0.b, 1, z, this.M1, v2, -1, false);
        }
    }

    private void g5(boolean z) {
        PriorityTaskManager priorityTaskManager0 = this.u2;
        if(priorityTaskManager0 != null) {
            if(z && !this.v2) {
                priorityTaskManager0.a(this.t2);
                this.v2 = true;
                return;
            }
            if(!z && this.v2) {
                priorityTaskManager0.e(this.t2);
                this.v2 = false;
            }
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public int getAudioSessionId() {
        this.i5();
        return this.k2;
    }

    @Override  // androidx.media3.common.Player
    public long getCurrentPosition() {
        this.i5();
        return Util.B2(this.Z3(this.A2));
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        this.i5();
        return this.x2;
    }

    @Override  // androidx.media3.common.Player
    public long getDuration() {
        this.i5();
        if(this.W()) {
            MediaPeriodId mediaSource$MediaPeriodId0 = this.A2.b;
            this.A2.a.l(mediaSource$MediaPeriodId0.a, this.o1);
            return Util.B2(this.o1.d(mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c));
        }
        return this.K0();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public float getVolume() {
        this.i5();
        return this.m2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public boolean h() {
        this.i5();
        return this.n2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void h0(MediaSource mediaSource0, long v) {
        this.i5();
        this.x0(Collections.singletonList(mediaSource0), 0, v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void h1(int v) {
        this.i5();
        if(this.t2 == v) {
            return;
        }
        if(this.v2) {
            PriorityTaskManager priorityTaskManager0 = (PriorityTaskManager)Assertions.g(this.u2);
            priorityTaskManager0.a(v);
            priorityTaskManager0.e(this.t2);
        }
        this.t2 = v;
        this.T4(16, v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void h2(int v, MediaSource mediaSource0) {
        this.i5();
        this.I0(v, Collections.singletonList(mediaSource0));
    }

    private boolean h4() {
        AudioManager audioManager0 = this.H1;
        if(audioManager0 != null && Util.a >= 23) {
            AudioDeviceInfo[] arr_audioDeviceInfo = audioManager0.getDevices(2);
            return Api23.a(this.f1, arr_audioDeviceInfo);
        }
        return true;
    }

    private void h5() {
        boolean z = true;
        switch(this.b()) {
            case 2: 
            case 3: {
                boolean z1 = this.d1();
                WakeLockManager wakeLockManager0 = this.E1;
                if(!this.D0() || z1) {
                    z = false;
                }
                wakeLockManager0.b(z);
                boolean z2 = this.D0();
                this.F1.b(z2);
                return;
            }
            case 1: 
            case 4: {
                this.E1.b(false);
                this.F1.b(false);
                return;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @Override  // androidx.media3.common.Player
    public int i() {
        this.i5();
        return this.J1;
    }

    @Override  // androidx.media3.common.Player
    public void i0(MediaMetadata mediaMetadata0) {
        this.i5();
        Assertions.g(mediaMetadata0);
        if(mediaMetadata0.equals(this.V1)) {
            return;
        }
        this.V1 = mediaMetadata0;
        b0 b00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.v0(this.V1);
        this.m1.m(15, b00);
    }

    @Override  // androidx.media3.common.Player
    public long i2() {
        this.i5();
        if(this.W()) {
            return this.A2.k.equals(this.A2.b) ? Util.B2(this.A2.q) : this.getDuration();
        }
        return this.e1();
    }

    private int i4(int v) {
        if(this.Y1 != null && this.Y1.getAudioSessionId() != v) {
            this.Y1.release();
            this.Y1 = null;
        }
        if(this.Y1 == null) {
            this.Y1 = new AudioTrack(3, 4000, 4, 2, 2, 0, v);
        }
        return this.Y1.getAudioSessionId();
    }

    private void i5() {
        this.e1.c();
        if(Thread.currentThread() != this.P1().getThread()) {
            String s = Util.S("Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[]{"jeb-dexdec-sb-st-2714", this.P1().getThread().getName()});
            if(this.r2) {
                throw new IllegalStateException(s);
            }
            Log.o("ExoPlayerImpl", s, (this.s2 ? null : new IllegalStateException()));
            this.s2 = true;
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void j(AuxEffectInfo auxEffectInfo0) {
        this.i5();
        this.S4(1, 6, auxEffectInfo0);
    }

    // 检测为 Lambda 实现
    private static void j4(int v, int v1, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void k(int v) {
        this.i5();
        if(this.k2 == v) {
            return;
        }
        if(v != 0) {
            if(Util.a < 21) {
                this.i4(v);
            }
        }
        else if(Util.a < 21) {
            v = this.i4(0);
        }
        else {
            v = Util.V(this.f1);
        }
        this.k2 = v;
        this.S4(1, 10, v);
        this.S4(2, 10, v);
        W w0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.E(v);
        this.m1.m(21, w0);
    }

    @Override  // androidx.media3.common.Player
    public void k0(int v, int v1) {
        this.i5();
        Assertions.a(v >= 0 && v1 >= v);
        int v2 = this.p1.size();
        int v3 = Math.min(v1, v2);
        if(v < v2 && v != v3) {
            PlaybackInfo playbackInfo0 = this.P4(this.A2, v, v3);
            this.e5(playbackInfo0, 0, !playbackInfo0.b.a.equals(this.A2.b.a), 4, this.Z3(playbackInfo0), -1, false);
        }
    }

    @Override  // androidx.media3.common.Player
    public void k1(boolean z, int v) {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.l(z, v);
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void k2(MediaSource mediaSource0) {
        this.i5();
        this.z1(Collections.singletonList(mediaSource0));
    }

    // 检测为 Lambda 实现
    private void k4(androidx.media3.common.Player.Listener player$Listener0, FlagSet flagSet0) [...]

    @Override  // androidx.media3.common.Player
    public void l(PlaybackParameters playbackParameters0) {
        this.i5();
        if(playbackParameters0 == null) {
            playbackParameters0 = PlaybackParameters.d;
        }
        if(this.A2.o.equals(playbackParameters0)) {
            return;
        }
        PlaybackInfo playbackInfo0 = this.A2.g(playbackParameters0);
        ++this.L1;
        this.l1.f1(playbackParameters0);
        this.e5(playbackInfo0, 0, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @a
    @Deprecated
    public VideoComponent l0() {
        this.i5();
        return this;
    }

    // 检测为 Lambda 实现
    private void l4(PlaybackInfoUpdate exoPlayerImplInternal$PlaybackInfoUpdate0) [...]

    @Override  // androidx.media3.common.Player
    public PlaybackParameters m() {
        this.i5();
        return this.A2.o;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public Looper m2() {
        return this.l1.H();
    }

    // 检测为 Lambda 实现
    private void m4(PlaybackInfoUpdate exoPlayerImplInternal$PlaybackInfoUpdate0) [...]

    @Override  // androidx.media3.common.Player
    public void n() {
        this.i5();
        boolean z = this.D0();
        int v = 2;
        int v1 = this.C1.q(z, 2);
        this.d5(z, v1, ExoPlayerImpl.c4(v1));
        PlaybackInfo playbackInfo0 = this.A2;
        if(playbackInfo0.e != 1) {
            return;
        }
        PlaybackInfo playbackInfo1 = playbackInfo0.f(null);
        if(playbackInfo1.a.w()) {
            v = 4;
        }
        PlaybackInfo playbackInfo2 = playbackInfo1.h(v);
        ++this.L1;
        this.l1.r0();
        this.e5(playbackInfo2, 1, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // androidx.media3.common.Player
    public int n2() {
        this.i5();
        int v = this.a4(this.A2);
        return v == -1 ? 0 : v;
    }

    // 检测为 Lambda 实现
    private static void n4(androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$AudioComponent, androidx.media3.common.Player
    public void o(float f) {
        this.i5();
        float f1 = Util.v(f, 0.0f, 1.0f);
        if(this.m2 == f1) {
            return;
        }
        this.m2 = f1;
        this.U4();
        U u0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.q0(f1);
        this.m1.m(22, u0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void o0(AnalyticsListener analyticsListener0) {
        this.i5();
        AnalyticsListener analyticsListener1 = (AnalyticsListener)Assertions.g(analyticsListener0);
        this.s1.U(analyticsListener1);
    }

    // 检测为 Lambda 实现
    private static void o4(AudioAttributes audioAttributes0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void p2(int v) {
        this.i5();
        switch(v) {
            case 0: {
                this.E1.a(false);
                this.F1.a(false);
                return;
            }
            case 1: {
                this.E1.a(true);
                this.F1.a(false);
                return;
            }
            case 2: {
                this.E1.a(true);
                this.F1.a(true);
            }
        }
    }

    // 检测为 Lambda 实现
    private static void p4(int v, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public void q(int v) {
        this.i5();
        if(this.J1 != v) {
            this.J1 = v;
            this.l1.j1(v);
            a0 a00 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.A(v);
            this.m1.j(8, a00);
            this.b5();
            this.m1.g();
        }
    }

    // 检测为 Lambda 实现
    private void q4(androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void r(boolean z) {
        this.i5();
        if(this.n2 == z) {
            return;
        }
        this.n2 = z;
        this.S4(1, 9, Boolean.valueOf(z));
        T t0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.d(z);
        this.m1.m(23, t0);
    }

    @Override  // androidx.media3.common.Player
    public Tracks r0() {
        this.i5();
        return this.A2.i.d;
    }

    @Override  // androidx.media3.common.Player
    public void r2(int v, int v1, int v2) {
        this.i5();
        Assertions.a(v >= 0 && v <= v1 && v2 >= 0);
        int v3 = this.p1.size();
        int v4 = Math.min(v1, v3);
        int v5 = Math.min(v2, v3 - (v4 - v));
        if(v < v3 && v != v4 && v != v5) {
            Timeline timeline0 = this.O1();
            ++this.L1;
            Util.E1(this.p1, v, v4, v5);
            Timeline timeline1 = this.U3();
            PlaybackInfo playbackInfo0 = this.L4(this.A2, timeline1, this.b4(timeline0, timeline1, this.a4(this.A2), this.Y3(this.A2)));
            this.l1.m0(v, v4, v5, this.Q1);
            this.e5(playbackInfo0, 0, false, 5, 0x8000000000000001L, -1, false);
        }
    }

    // 检测为 Lambda 实现
    private static void r4(int v, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.common.Player
    public void release() {
        Log.h("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "AndroidXMedia3/1.4.1" + "] [" + Util.e + "] [" + "media3.common" + "]");
        this.i5();
        if(Util.a < 21) {
            AudioTrack audioTrack0 = this.Y1;
            if(audioTrack0 != null) {
                audioTrack0.release();
                this.Y1 = null;
            }
        }
        this.B1.b(false);
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.k();
        }
        this.E1.b(false);
        this.F1.b(false);
        this.C1.j();
        if(!this.l1.t0()) {
            X x0 = (androidx.media3.common.Player.Listener player$Listener0) -> player$Listener0.J(ExoPlaybackException.o(new ExoTimeoutException(1), 1003));
            this.m1.m(10, x0);
        }
        this.m1.k();
        this.j1.f(null);
        this.u1.a(this.s1);
        PlaybackInfo playbackInfo0 = this.A2;
        if(playbackInfo0.p) {
            this.A2 = playbackInfo0.a();
        }
        PlaybackInfo playbackInfo1 = this.A2.h(1);
        this.A2 = playbackInfo1;
        PlaybackInfo playbackInfo2 = playbackInfo1.c(playbackInfo1.b);
        this.A2 = playbackInfo2;
        playbackInfo2.q = playbackInfo2.s;
        this.A2.r = 0L;
        this.s1.release();
        this.i1.j();
        this.R4();
        Surface surface0 = this.a2;
        if(surface0 != null) {
            surface0.release();
            this.a2 = null;
        }
        if(this.v2) {
            ((PriorityTaskManager)Assertions.g(this.u2)).e(this.t2);
            this.v2 = false;
        }
        this.o2 = CueGroup.c;
        this.w2 = true;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void s(@Nullable Surface surface0) {
        this.i5();
        this.R4();
        this.Z4(surface0);
        int v = surface0 == null ? 0 : -1;
        this.N4(v, v);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    @RequiresApi(23)
    public void s0(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        this.i5();
        this.S4(1, 12, audioDeviceInfo0);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void s1(boolean z) {
        this.i5();
        if(this.O1 != z) {
            this.O1 = z;
            if(!this.l1.V0(z)) {
                this.a5(ExoPlaybackException.o(new ExoTimeoutException(2), 1003));
            }
        }
    }

    // 检测为 Lambda 实现
    private static void s4(boolean z, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(@Nullable ImageOutput imageOutput0) {
        this.i5();
        this.S4(4, 15, imageOutput0);
    }

    @Override  // androidx.media3.common.Player
    public void stop() {
        this.i5();
        boolean z = this.D0();
        this.C1.q(z, 1);
        this.a5(null);
        this.o2 = new CueGroup(O2.A(), this.A2.s);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void t(@Nullable SurfaceView surfaceView0) {
        this.i5();
        if(surfaceView0 instanceof VideoDecoderOutputBufferRenderer) {
            this.R4();
            this.Z4(surfaceView0);
            this.W4(surfaceView0.getHolder());
            return;
        }
        if(surfaceView0 instanceof SphericalGLSurfaceView) {
            this.R4();
            this.c2 = (SphericalGLSurfaceView)surfaceView0;
            this.W3(this.A1).t(10000).q(this.c2).n();
            this.c2.d(this.z1);
            this.Z4(this.c2.getVideoSurface());
            this.W4(surfaceView0.getHolder());
            return;
        }
        this.u((surfaceView0 == null ? null : surfaceView0.getHolder()));
    }

    @Override  // androidx.media3.common.Player
    public boolean t2() {
        this.i5();
        return this.K1;
    }

    // 检测为 Lambda 实现
    private static void t4(boolean z, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void u(@Nullable SurfaceHolder surfaceHolder0) {
        this.i5();
        if(surfaceHolder0 == null) {
            this.Q();
            return;
        }
        this.R4();
        this.d2 = true;
        this.b2 = surfaceHolder0;
        surfaceHolder0.addCallback(this.z1);
        Surface surface0 = surfaceHolder0.getSurface();
        if(surface0 != null && surface0.isValid()) {
            this.Z4(surface0);
            Rect rect0 = surfaceHolder0.getSurfaceFrame();
            this.N4(rect0.width(), rect0.height());
            return;
        }
        this.Z4(null);
        this.N4(0, 0);
    }

    @Override  // androidx.media3.common.Player
    public int u0() {
        this.i5();
        return this.W() ? this.A2.b.b : -1;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void u2(MediaSource mediaSource0) {
        this.i5();
        this.O0(Collections.singletonList(mediaSource0));
    }

    // 检测为 Lambda 实现
    private static void u4(TrackSelectionParameters trackSelectionParameters0, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void v(boolean z) {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.l(z, 1);
        }
    }

    @Override  // androidx.media3.common.Player
    public Size v1() {
        this.i5();
        return this.h2;
    }

    // 检测为 Lambda 实现
    private static void v4(float f, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    @Deprecated
    public void w() {
        this.i5();
        StreamVolumeManager streamVolumeManager0 = this.D1;
        if(streamVolumeManager0 != null) {
            streamVolumeManager0.i(1);
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void w0(boolean z) {
        this.i5();
        if(this.S1 == z) {
            return;
        }
        this.S1 = z;
        this.l1.b1(z);
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void w1(PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.i5();
        if(this.R1.equals(exoPlayer$PreloadConfiguration0)) {
            return;
        }
        this.R1 = exoPlayer$PreloadConfiguration0;
        this.l1.h1(exoPlayer$PreloadConfiguration0);
    }

    @Override  // androidx.media3.common.Player
    public MediaMetadata w2() {
        this.i5();
        return this.U1;
    }

    // 检测为 Lambda 实现
    private void w4(androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$VideoComponent, androidx.media3.common.Player
    public void x(@Nullable SurfaceHolder surfaceHolder0) {
        this.i5();
        if(surfaceHolder0 != null && surfaceHolder0 == this.b2) {
            this.Q();
        }
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void x0(List list0, int v, long v1) {
        this.i5();
        this.V4(list0, v, v1, false);
    }

    @Override  // androidx.media3.common.Player
    public long x2() {
        this.i5();
        return this.v1;
    }

    // 检测为 Lambda 实现
    private static void x4(PlaybackInfo playbackInfo0, int v, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer$AudioComponent
    public void y() {
        this.i5();
        this.j(new AuxEffectInfo(0, 0.0f));
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public TrackGroupArray y0() {
        this.i5();
        return this.A2.h;
    }

    // 检测为 Lambda 实现
    private static void y4(int v, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, androidx.media3.common.Player.Listener player$Listener0) [...]

    @Override  // androidx.media3.exoplayer.ExoPlayer$DeviceComponent, androidx.media3.common.Player
    public int z() {
        this.i5();
        return this.D1 == null ? 0 : this.D1.g();
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public boolean z0() {
        this.i5();
        return this.w2;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayer
    public void z1(List list0) {
        this.i5();
        this.G1(list0, true);
    }

    // 检测为 Lambda 实现
    private static void z4(MediaItem mediaItem0, int v, androidx.media3.common.Player.Listener player$Listener0) [...]

    class androidx.media3.exoplayer.ExoPlayerImpl.1 {
    }

}

