package androidx.media3.exoplayer.audio;

import O1.a;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.media.AudioRouting;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack.StreamEventCallback;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;
import com.google.common.collect.O2;
import com.google.common.collect.u5;
import h4.m;
import j..util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

@UnstableApi
public final class DefaultAudioSink implements AudioSink {
    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        public static void a(AudioTrack audioTrack0, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi230) {
            audioTrack0.setPreferredDevice((audioDeviceInfoApi230 == null ? null : audioDeviceInfoApi230.a));
        }
    }

    @RequiresApi(0x1F)
    static final class Api31 {
        @DoNotInline
        public static void a(AudioTrack audioTrack0, PlayerId playerId0) {
            LogSessionId logSessionId0 = playerId0.a();
            if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack0.setLogSessionId(logSessionId0);
            }
        }
    }

    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport a(Format arg1, AudioAttributes arg2);
    }

    @Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider a;

        static {
            AudioTrackBufferSizeProvider.a = new Builder().h();
        }

        int a(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7);
    }

    public static final class androidx.media3.exoplayer.audio.DefaultAudioSink.Builder {
        @Nullable
        private final Context a;
        private AudioCapabilities b;
        @Nullable
        private androidx.media3.common.audio.AudioProcessorChain c;
        private boolean d;
        private boolean e;
        private boolean f;
        private AudioTrackBufferSizeProvider g;
        private AudioOffloadSupportProvider h;
        @Nullable
        private AudioOffloadListener i;

        @Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder() {
            this.a = null;
            this.b = AudioCapabilities.e;
            this.g = AudioTrackBufferSizeProvider.a;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder(Context context0) {
            this.a = context0;
            this.b = AudioCapabilities.e;
            this.g = AudioTrackBufferSizeProvider.a;
        }

        public DefaultAudioSink i() {
            Assertions.i(!this.f);
            this.f = true;
            if(this.c == null) {
                this.c = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            if(this.h == null) {
                this.h = new DefaultAudioOffloadSupportProvider(this.a);
            }
            return new DefaultAudioSink(this, null);
        }

        @a
        @Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder j(AudioCapabilities audioCapabilities0) {
            Assertions.g(audioCapabilities0);
            this.b = audioCapabilities0;
            return this;
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder k(AudioOffloadSupportProvider defaultAudioSink$AudioOffloadSupportProvider0) {
            this.h = defaultAudioSink$AudioOffloadSupportProvider0;
            return this;
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder l(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain0) {
            Assertions.g(audioProcessorChain0);
            this.c = audioProcessorChain0;
            return this;
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder m(AudioProcessor[] arr_audioProcessor) {
            Assertions.g(arr_audioProcessor);
            return this.l(new DefaultAudioProcessorChain(arr_audioProcessor));
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder n(AudioTrackBufferSizeProvider defaultAudioSink$AudioTrackBufferSizeProvider0) {
            this.g = defaultAudioSink$AudioTrackBufferSizeProvider0;
            return this;
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder o(boolean z) {
            this.e = z;
            return this;
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder p(boolean z) {
            this.d = z;
            return this;
        }

        @a
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder q(@Nullable AudioOffloadListener exoPlayer$AudioOffloadListener0) {
            this.i = exoPlayer$AudioOffloadListener0;
            return this;
        }
    }

    static final class Configuration {
        public final Format a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final AudioProcessingPipeline i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public Configuration(Format format0, int v, int v1, int v2, int v3, int v4, int v5, int v6, AudioProcessingPipeline audioProcessingPipeline0, boolean z, boolean z1, boolean z2) {
            this.a = format0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
            this.f = v4;
            this.g = v5;
            this.h = v6;
            this.i = audioProcessingPipeline0;
            this.j = z;
            this.k = z1;
            this.l = z2;
        }

        public AudioTrack a(AudioAttributes audioAttributes0, int v) throws InitializationException {
            AudioTrack audioTrack0;
            try {
                audioTrack0 = this.e(audioAttributes0, v);
            }
            catch(UnsupportedOperationException | IllegalArgumentException unsupportedOperationException0) {
                boolean z = this.m();
                throw new InitializationException(0, this.e, this.f, this.h, this.a, z, unsupportedOperationException0);
            }
            int v1 = audioTrack0.getState();
            if(v1 == 1) {
                return audioTrack0;
            }
            try {
                audioTrack0.release();
            }
            catch(Exception unused_ex) {
            }
            boolean z1 = this.m();
            throw new InitializationException(v1, this.e, this.f, this.h, this.a, z1, null);
        }

        public AudioTrackConfig b() {
            return new AudioTrackConfig(this.g, this.e, this.f, this.l, this.c == 1, this.h);
        }

        public boolean c(Configuration defaultAudioSink$Configuration0) {
            return defaultAudioSink$Configuration0.c == this.c && defaultAudioSink$Configuration0.g == this.g && defaultAudioSink$Configuration0.e == this.e && defaultAudioSink$Configuration0.f == this.f && defaultAudioSink$Configuration0.d == this.d && defaultAudioSink$Configuration0.j == this.j && defaultAudioSink$Configuration0.k == this.k;
        }

        public Configuration d(int v) {
            return new Configuration(this.a, this.b, this.c, this.d, this.e, this.f, this.g, v, this.i, this.j, this.k, this.l);
        }

        private AudioTrack e(AudioAttributes audioAttributes0, int v) {
            int v1 = Util.a;
            if(v1 >= 29) {
                return this.g(audioAttributes0, v);
            }
            return v1 < 21 ? this.h(audioAttributes0, v) : this.f(audioAttributes0, v);
        }

        @RequiresApi(21)
        private AudioTrack f(AudioAttributes audioAttributes0, int v) {
            return new AudioTrack(Configuration.j(audioAttributes0, this.l), Util.Z(this.e, this.f, this.g), this.h, 1, v);
        }

        @RequiresApi(29)
        private AudioTrack g(AudioAttributes audioAttributes0, int v) {
            AudioFormat audioFormat0 = Util.Z(this.e, this.f, this.g);
            android.media.AudioAttributes audioAttributes1 = Configuration.j(audioAttributes0, this.l);
            boolean z = true;
            AudioTrack.Builder audioTrack$Builder0 = c0.a().setAudioAttributes(audioAttributes1).setAudioFormat(audioFormat0).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(v);
            if(this.c != 1) {
                z = false;
            }
            return audioTrack$Builder0.setOffloadedPlayback(z).build();
        }

        private AudioTrack h(AudioAttributes audioAttributes0, int v) {
            int v1 = Util.G0(audioAttributes0.c);
            return v == 0 ? new AudioTrack(v1, this.e, this.f, this.g, this.h, 1) : new AudioTrack(v1, this.e, this.f, this.g, this.h, 1, v);
        }

        public long i(long v) {
            return Util.Y1(v, this.e);
        }

        // 去混淆评级： 低(20)
        @RequiresApi(21)
        private static android.media.AudioAttributes j(AudioAttributes audioAttributes0, boolean z) {
            return z ? Configuration.k() : audioAttributes0.b().a;
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public long l(long v) {
            return Util.Y1(v, this.a.C);
        }

        public boolean m() {
            return this.c == 1;
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] a;
        private final SilenceSkippingAudioProcessor b;
        private final SonicAudioProcessor c;

        public DefaultAudioProcessorChain(AudioProcessor[] arr_audioProcessor) {
            this(arr_audioProcessor, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        public DefaultAudioProcessorChain(AudioProcessor[] arr_audioProcessor, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor0, SonicAudioProcessor sonicAudioProcessor0) {
            AudioProcessor[] arr_audioProcessor1 = new AudioProcessor[arr_audioProcessor.length + 2];
            this.a = arr_audioProcessor1;
            System.arraycopy(arr_audioProcessor, 0, arr_audioProcessor1, 0, arr_audioProcessor.length);
            this.b = silenceSkippingAudioProcessor0;
            this.c = sonicAudioProcessor0;
            arr_audioProcessor1[arr_audioProcessor.length] = silenceSkippingAudioProcessor0;
            arr_audioProcessor1[arr_audioProcessor.length + 1] = sonicAudioProcessor0;
        }

        @Override  // androidx.media3.common.audio.AudioProcessorChain
        public AudioProcessor[] a() {
            return this.a;
        }

        @Override  // androidx.media3.common.audio.AudioProcessorChain
        public PlaybackParameters b(PlaybackParameters playbackParameters0) {
            this.c.l(playbackParameters0.a);
            this.c.k(playbackParameters0.b);
            return playbackParameters0;
        }

        @Override  // androidx.media3.common.audio.AudioProcessorChain
        public long c() {
            return this.b.u();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.common.audio.AudioProcessorChain
        public long d(long v) {
            return this.c.isActive() ? this.c.a(v) : v;
        }

        @Override  // androidx.media3.common.audio.AudioProcessorChain
        public boolean e(boolean z) {
            this.b.D(z);
            return z;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String s) {
            super(s);
        }

        InvalidAudioTrackTimestampException(String s, androidx.media3.exoplayer.audio.DefaultAudioSink.1 defaultAudioSink$10) {
            this(s);
        }
    }

    static final class MediaPositionParameters {
        public final PlaybackParameters a;
        public final long b;
        public final long c;

        private MediaPositionParameters(PlaybackParameters playbackParameters0, long v, long v1) {
            this.a = playbackParameters0;
            this.b = v;
            this.c = v1;
        }

        MediaPositionParameters(PlaybackParameters playbackParameters0, long v, long v1, androidx.media3.exoplayer.audio.DefaultAudioSink.1 defaultAudioSink$10) {
            this(playbackParameters0, v, v1);
        }
    }

    @RequiresApi(24)
    static final class OnRoutingChangedListenerApi24 {
        private final AudioTrack a;
        private final AudioCapabilitiesReceiver b;
        @Nullable
        private AudioRouting.OnRoutingChangedListener c;

        public OnRoutingChangedListenerApi24(AudioTrack audioTrack0, AudioCapabilitiesReceiver audioCapabilitiesReceiver0) {
            this.a = audioTrack0;
            this.b = audioCapabilitiesReceiver0;
            this.c = (AudioRouting audioRouting0) -> {
                if(this.c == null) {
                    return;
                }
                if(audioRouting0.getRoutedDevice() != null) {
                    AudioDeviceInfo audioDeviceInfo0 = audioRouting0.getRoutedDevice();
                    this.b.i(audioDeviceInfo0);
                }
            };
            Handler handler0 = new Handler(Looper.myLooper());
            audioTrack0.addOnRoutingChangedListener(this.c, handler0);
        }

        // 检测为 Lambda 实现
        @DoNotInline
        private void b(AudioRouting audioRouting0) [...]

        @DoNotInline
        public void c() {
            AudioRouting.OnRoutingChangedListener audioRouting$OnRoutingChangedListener0 = e0.a(Assertions.g(this.c));
            this.a.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener0);
            this.c = null;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface OutputMode {
    }

    static final class PendingExceptionHolder {
        private final long a;
        @Nullable
        private Exception b;
        private long c;

        public PendingExceptionHolder(long v) {
            this.a = v;
        }

        public void a() {
            this.b = null;
        }

        public void b(Exception exception0) throws Exception {
            long v = SystemClock.elapsedRealtime();
            if(this.b == null) {
                this.b = exception0;
                this.c = this.a + v;
            }
            if(v >= this.c) {
                Exception exception1 = this.b;
                if(exception1 != exception0) {
                    exception1.addSuppressed(exception0);
                }
                Exception exception2 = this.b;
                this.a();
                throw exception2;
            }
        }
    }

    final class PositionTrackerListener implements Listener {
        final DefaultAudioSink a;

        private PositionTrackerListener() {
        }

        PositionTrackerListener(androidx.media3.exoplayer.audio.DefaultAudioSink.1 defaultAudioSink$10) {
        }

        @Override  // androidx.media3.exoplayer.audio.AudioTrackPositionTracker$Listener
        public void a(long v) {
            if(DefaultAudioSink.this.A != null) {
                DefaultAudioSink.this.A.a(v);
            }
        }

        @Override  // androidx.media3.exoplayer.audio.AudioTrackPositionTracker$Listener
        public void b(long v, long v1, long v2, long v3) {
            String s = "Spurious audio timestamp (frame position mismatch): " + v + ", " + v1 + ", " + v2 + ", " + v3 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if(DefaultAudioSink.J0) {
                throw new InvalidAudioTrackTimestampException(s, null);
            }
            Log.n("DefaultAudioSink", s);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioTrackPositionTracker$Listener
        public void c(long v, long v1, long v2, long v3) {
            String s = "Spurious audio timestamp (system clock mismatch): " + v + ", " + v1 + ", " + v2 + ", " + v3 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if(DefaultAudioSink.J0) {
                throw new InvalidAudioTrackTimestampException(s, null);
            }
            Log.n("DefaultAudioSink", s);
        }

        @Override  // androidx.media3.exoplayer.audio.AudioTrackPositionTracker$Listener
        public void d(int v, long v1) {
            if(DefaultAudioSink.this.A != null) {
                long v2 = SystemClock.elapsedRealtime();
                DefaultAudioSink.this.A.g(v, v1, v2 - DefaultAudioSink.this.n0);
            }
        }

        @Override  // androidx.media3.exoplayer.audio.AudioTrackPositionTracker$Listener
        public void e(long v) {
            Log.n("DefaultAudioSink", "Ignoring impossibly large audio latency: " + v);
        }
    }

    @RequiresApi(29)
    final class StreamEventCallbackV29 {
        private final Handler a;
        private final AudioTrack.StreamEventCallback b;
        final DefaultAudioSink c;

        public StreamEventCallbackV29() {
            this.a = new Handler(Looper.myLooper());
            this.b = new AudioTrack.StreamEventCallback() {
                final StreamEventCallbackV29 b;

                @Override  // android.media.AudioTrack$StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack0, int v) {
                    if(!audioTrack0.equals(DefaultAudioSink.this.E)) {
                        return;
                    }
                    if(DefaultAudioSink.this.A != null && DefaultAudioSink.this.g0) {
                        DefaultAudioSink.this.A.k();
                    }
                }

                @Override  // android.media.AudioTrack$StreamEventCallback
                public void onPresentationEnded(AudioTrack audioTrack0) {
                    if(!audioTrack0.equals(DefaultAudioSink.this.E)) {
                        return;
                    }
                    DefaultAudioSink.this.f0 = true;
                }

                @Override  // android.media.AudioTrack$StreamEventCallback
                public void onTearDown(AudioTrack audioTrack0) {
                    if(!audioTrack0.equals(DefaultAudioSink.this.E)) {
                        return;
                    }
                    if(DefaultAudioSink.this.A != null && DefaultAudioSink.this.g0) {
                        DefaultAudioSink.this.A.k();
                    }
                }
            };
        }

        @DoNotInline
        public void a(AudioTrack audioTrack0) {
            Objects.requireNonNull(this.a);
            audioTrack0.registerStreamEventCallback(new androidx.emoji2.text.a(this.a), this.b);
        }

        @DoNotInline
        public void b(AudioTrack audioTrack0) {
            audioTrack0.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    @Nullable
    private androidx.media3.exoplayer.audio.AudioSink.Listener A;
    public static final float A0 = 0.1f;
    @Nullable
    private Configuration B;
    public static final float B0 = 8.0f;
    private Configuration C;
    private static final boolean C0 = false;
    private AudioProcessingPipeline D;
    public static final int D0 = 0;
    @Nullable
    private AudioTrack E;
    public static final int E0 = 1;
    private AudioCapabilities F;
    public static final int F0 = 2;
    private AudioCapabilitiesReceiver G;
    private static final int G0 = 0xFFFFFFE0;
    @Nullable
    private OnRoutingChangedListenerApi24 H;
    private static final int H0 = 100;
    private AudioAttributes I;
    private static final String I0 = "DefaultAudioSink";
    @Nullable
    private MediaPositionParameters J;
    public static boolean J0 = false;
    private MediaPositionParameters K;
    private static final Object K0 = null;
    private PlaybackParameters L;
    @GuardedBy("releaseExecutorLock")
    @Nullable
    private static ExecutorService L0 = null;
    private boolean M;
    @GuardedBy("releaseExecutorLock")
    private static int M0 = 0;
    @Nullable
    private ByteBuffer N;
    private int O;
    private long P;
    private long Q;
    private long R;
    private long S;
    private int T;
    private boolean U;
    private boolean V;
    private long W;
    private float X;
    @Nullable
    private ByteBuffer Y;
    private int Z;
    @Nullable
    private ByteBuffer a0;
    private byte[] b0;
    private int c0;
    private boolean d0;
    private boolean e0;
    private boolean f0;
    private boolean g0;
    @Nullable
    private final Context h;
    private boolean h0;
    private final androidx.media3.common.audio.AudioProcessorChain i;
    private int i0;
    private final boolean j;
    private AuxEffectInfo j0;
    private final ChannelMappingAudioProcessor k;
    @Nullable
    private AudioDeviceInfoApi23 k0;
    private final TrimmingAudioProcessor l;
    private boolean l0;
    private final O2 m;
    private long m0;
    private final O2 n;
    private long n0;
    private final ConditionVariable o;
    private boolean o0;
    private final AudioTrackPositionTracker p;
    private boolean p0;
    private final ArrayDeque q;
    @Nullable
    private Looper q0;
    private final boolean r;
    private long r0;
    private int s;
    private long s0;
    private StreamEventCallbackV29 t;
    private Handler t0;
    private final PendingExceptionHolder u;
    private static final int u0 = 1000000;
    private final PendingExceptionHolder v;
    private static final int v0 = 300000;
    private final AudioTrackBufferSizeProvider w;
    private static final int w0 = 100;
    private final AudioOffloadSupportProvider x;
    public static final float x0 = 1.0f;
    @Nullable
    private final AudioOffloadListener y;
    public static final float y0 = 0.1f;
    @Nullable
    private PlayerId z;
    public static final float z0 = 8.0f;

    static {
        DefaultAudioSink.K0 = new Object();
    }

    @m({"#1.audioProcessorChain"})
    private DefaultAudioSink(androidx.media3.exoplayer.audio.DefaultAudioSink.Builder defaultAudioSink$Builder0) {
        Context context0 = defaultAudioSink$Builder0.a;
        this.h = context0;
        this.I = AudioAttributes.g;
        this.F = context0 == null ? defaultAudioSink$Builder0.b : AudioCapabilities.f(context0, AudioAttributes.g, null);
        this.i = defaultAudioSink$Builder0.c;
        boolean z = true;
        this.j = Util.a >= 21 && defaultAudioSink$Builder0.d;
        if(Util.a < 23 || !defaultAudioSink$Builder0.e) {
            z = false;
        }
        this.r = z;
        this.s = 0;
        this.w = defaultAudioSink$Builder0.g;
        this.x = (AudioOffloadSupportProvider)Assertions.g(defaultAudioSink$Builder0.h);
        ConditionVariable conditionVariable0 = new ConditionVariable(Clock.a);
        this.o = conditionVariable0;
        conditionVariable0.f();
        this.p = new AudioTrackPositionTracker(new PositionTrackerListener(this, null));
        ChannelMappingAudioProcessor channelMappingAudioProcessor0 = new ChannelMappingAudioProcessor();
        this.k = channelMappingAudioProcessor0;
        TrimmingAudioProcessor trimmingAudioProcessor0 = new TrimmingAudioProcessor();
        this.l = trimmingAudioProcessor0;
        this.m = O2.D(new ToInt16PcmAudioProcessor(), channelMappingAudioProcessor0, trimmingAudioProcessor0);
        this.n = O2.B(new ToFloatPcmAudioProcessor());
        this.X = 1.0f;
        this.i0 = 0;
        this.j0 = new AuxEffectInfo(0, 0.0f);
        this.K = new MediaPositionParameters(PlaybackParameters.d, 0L, 0L, null);
        this.L = PlaybackParameters.d;
        this.M = false;
        this.q = new ArrayDeque();
        this.u = new PendingExceptionHolder(100L);
        this.v = new PendingExceptionHolder(100L);
        this.y = defaultAudioSink$Builder0.i;
    }

    DefaultAudioSink(androidx.media3.exoplayer.audio.DefaultAudioSink.Builder defaultAudioSink$Builder0, androidx.media3.exoplayer.audio.DefaultAudioSink.1 defaultAudioSink$10) {
        this(defaultAudioSink$Builder0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void A(@Nullable PlayerId playerId0) {
        this.z = playerId0;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void B(long v) {
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void C() {
        this.U = true;
    }

    private void N(long v) {
        PlaybackParameters playbackParameters0;
        if(this.v0()) {
            playbackParameters0 = PlaybackParameters.d;
        }
        else {
            playbackParameters0 = this.t0() ? this.i.b(this.L) : PlaybackParameters.d;
            this.L = playbackParameters0;
        }
        this.M = this.t0() ? this.i.e(this.M) : false;
        MediaPositionParameters defaultAudioSink$MediaPositionParameters0 = new MediaPositionParameters(playbackParameters0, Math.max(0L, v), this.C.i(this.W()), null);
        this.q.add(defaultAudioSink$MediaPositionParameters0);
        this.s0();
        androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0 = this.A;
        if(audioSink$Listener0 != null) {
            audioSink$Listener0.d(this.M);
        }
    }

    private long O(long v) {
        while(!this.q.isEmpty() && v >= ((MediaPositionParameters)this.q.getFirst()).c) {
            this.K = (MediaPositionParameters)this.q.remove();
        }
        long v1 = v - this.K.c;
        if(this.q.isEmpty()) {
            long v2 = this.i.d(v1);
            return this.K.b + v2;
        }
        MediaPositionParameters defaultAudioSink$MediaPositionParameters0 = (MediaPositionParameters)this.q.getFirst();
        return defaultAudioSink$MediaPositionParameters0.b - Util.x0(defaultAudioSink$MediaPositionParameters0.c - v, this.K.a.a);
    }

    private long P(long v) {
        long v1 = this.i.c();
        long v2 = this.C.i(v1);
        long v3 = this.r0;
        if(v1 > v3) {
            long v4 = this.C.i(v1 - v3);
            this.r0 = v1;
            this.X(v4);
        }
        return v + v2;
    }

    private AudioTrack Q(Configuration defaultAudioSink$Configuration0) throws InitializationException {
        try {
            AudioTrack audioTrack0 = defaultAudioSink$Configuration0.a(this.I, this.i0);
            AudioOffloadListener exoPlayer$AudioOffloadListener0 = this.y;
            if(exoPlayer$AudioOffloadListener0 != null) {
                exoPlayer$AudioOffloadListener0.u(DefaultAudioSink.b0(audioTrack0));
                return audioTrack0;
            }
            return audioTrack0;
        }
        catch(InitializationException audioSink$InitializationException0) {
            androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0 = this.A;
            if(audioSink$Listener0 != null) {
                audioSink$Listener0.e(audioSink$InitializationException0);
            }
            throw audioSink$InitializationException0;
        }
    }

    private AudioTrack R() throws InitializationException {
        try {
            return this.Q(((Configuration)Assertions.g(this.C)));
        }
        catch(InitializationException audioSink$InitializationException0) {
            Configuration defaultAudioSink$Configuration0 = this.C;
            if(defaultAudioSink$Configuration0.h > 1000000) {
                Configuration defaultAudioSink$Configuration1 = defaultAudioSink$Configuration0.d(1000000);
                try {
                    AudioTrack audioTrack0 = this.Q(defaultAudioSink$Configuration1);
                    this.C = defaultAudioSink$Configuration1;
                    return audioTrack0;
                }
                catch(InitializationException audioSink$InitializationException1) {
                    audioSink$InitializationException0.addSuppressed(audioSink$InitializationException1);
                }
            }
            this.e0();
            throw audioSink$InitializationException0;
        }
    }

    private boolean S() throws WriteException {
        if(!this.D.g()) {
            ByteBuffer byteBuffer0 = this.a0;
            if(byteBuffer0 == null) {
                return true;
            }
            this.w0(byteBuffer0, 0x8000000000000000L);
            return this.a0 == null;
        }
        this.D.i();
        this.j0(0x8000000000000000L);
        return this.D.f() && (this.a0 == null || !this.a0.hasRemaining());
    }

    private static int T(int v, int v1, int v2) {
        int v3 = AudioTrack.getMinBufferSize(v, v1, v2);
        Assertions.i(v3 != -2);
        return v3;
    }

    private static int U(int v, ByteBuffer byteBuffer0) {
        switch(v) {
            case 9: {
                int v1 = MpegAudioUtil.m(Util.d0(byteBuffer0, byteBuffer0.position()));
                if(v1 == -1) {
                    throw new IllegalArgumentException();
                }
                return v1;
            }
            case 10: {
                return 0x400;
            }
            case 11: 
            case 12: {
                return 0x800;
            }
            case 14: {
                int v2 = Ac3Util.b(byteBuffer0);
                return v2 == -1 ? 0 : Ac3Util.i(byteBuffer0, v2) * 16;
            }
            case 15: {
                return 0x200;
            }
            case 16: {
                return 0x400;
            }
            case 17: {
                return Ac4Util.c(byteBuffer0);
            }
            case 5: 
            case 6: 
            case 18: {
                return Ac3Util.e(byteBuffer0);
            }
            case 20: {
                return OpusUtil.h(byteBuffer0);
            }
            case 7: 
            case 8: 
            case 30: {
                return DtsUtil.f(byteBuffer0);
            }
            default: {
                throw new IllegalStateException("Unexpected audio encoding: " + v);
            }
        }
    }

    private long V() {
        return this.C.c == 0 ? this.P / ((long)this.C.b) : this.Q;
    }

    private long W() {
        return this.C.c == 0 ? (this.R + ((long)this.C.d) - 1L) / ((long)this.C.d) : this.S;
    }

    private void X(long v) {
        this.s0 += v;
        if(this.t0 == null) {
            this.t0 = new Handler(Looper.myLooper());
        }
        this.t0.removeCallbacksAndMessages(null);
        this.t0.postDelayed(() -> if(this.s0 >= 300000L) {
            this.A.f();
            this.s0 = 0L;
        }, 100L);
    }

    private boolean Y() throws InitializationException {
        if(!this.o.e()) {
            return false;
        }
        AudioTrack audioTrack0 = this.R();
        this.E = audioTrack0;
        if(DefaultAudioSink.b0(audioTrack0)) {
            this.k0(this.E);
            Configuration defaultAudioSink$Configuration0 = this.C;
            if(defaultAudioSink$Configuration0.k) {
                this.E.setOffloadDelayPadding(defaultAudioSink$Configuration0.a.E, defaultAudioSink$Configuration0.a.F);
            }
        }
        int v = Util.a;
        if(v >= 0x1F) {
            PlayerId playerId0 = this.z;
            if(playerId0 != null) {
                Api31.a(this.E, playerId0);
            }
        }
        this.i0 = this.E.getAudioSessionId();
        this.p.s(this.E, this.C.c == 2, this.C.g, this.C.d, this.C.h);
        this.p0();
        int v1 = this.j0.a;
        if(v1 != 0) {
            this.E.attachAuxEffect(v1);
            this.E.setAuxEffectSendLevel(this.j0.b);
        }
        AudioDeviceInfoApi23 audioDeviceInfoApi230 = this.k0;
        if(audioDeviceInfoApi230 != null && v >= 23) {
            Api23.a(this.E, audioDeviceInfoApi230);
            AudioCapabilitiesReceiver audioCapabilitiesReceiver0 = this.G;
            if(audioCapabilitiesReceiver0 != null) {
                audioCapabilitiesReceiver0.i(this.k0.a);
            }
        }
        if(v >= 24) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver1 = this.G;
            if(audioCapabilitiesReceiver1 != null) {
                this.H = new OnRoutingChangedListenerApi24(this.E, audioCapabilitiesReceiver1);
            }
        }
        this.V = true;
        androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0 = this.A;
        if(audioSink$Listener0 != null) {
            audioSink$Listener0.b(this.C.b());
        }
        return true;
    }

    // 去混淆评级： 低(20)
    private static boolean Z(int v) {
        return Util.a >= 24 && v == -6 || v == 0xFFFFFFE0;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean a(Format format0) {
        return this.q(format0) != 0;
    }

    private boolean a0() {
        return this.E != null;
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean b() {
        return !this.a0() || this.d0 && !this.v();
    }

    private static boolean b0(AudioTrack audioTrack0) {
        return Util.a >= 29 && audioTrack0.isOffloadedPlayback();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void c() {
        this.g0 = true;
        if(this.a0()) {
            this.p.v();
            this.E.play();
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public AudioAttributes d() {
        return this.I;
    }

    // 检测为 Lambda 实现
    private static void d0(AudioTrack audioTrack0, androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0, Handler handler0, AudioTrackConfig audioSink$AudioTrackConfig0, ConditionVariable conditionVariable0) [...]

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void e(AudioAttributes audioAttributes0) {
        if(this.I.equals(audioAttributes0)) {
            return;
        }
        this.I = audioAttributes0;
        if(this.l0) {
            return;
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver0 = this.G;
        if(audioCapabilitiesReceiver0 != null) {
            audioCapabilitiesReceiver0.h(audioAttributes0);
        }
        this.flush();
    }

    private void e0() {
        if(!this.C.m()) {
            return;
        }
        this.o0 = true;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void f(androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0) {
        this.A = audioSink$Listener0;
    }

    // 检测为 Lambda 实现
    private void f0() [...]

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        if(this.a0()) {
            this.m0();
            if(this.p.i()) {
                this.E.pause();
            }
            if(DefaultAudioSink.b0(this.E)) {
                ((StreamEventCallbackV29)Assertions.g(this.t)).b(this.E);
            }
            int v = Util.a;
            if(v < 21 && !this.h0) {
                this.i0 = 0;
            }
            AudioTrackConfig audioSink$AudioTrackConfig0 = this.C.b();
            Configuration defaultAudioSink$Configuration0 = this.B;
            if(defaultAudioSink$Configuration0 != null) {
                this.C = defaultAudioSink$Configuration0;
                this.B = null;
            }
            this.p.q();
            if(v >= 24) {
                OnRoutingChangedListenerApi24 defaultAudioSink$OnRoutingChangedListenerApi240 = this.H;
                if(defaultAudioSink$OnRoutingChangedListenerApi240 != null) {
                    defaultAudioSink$OnRoutingChangedListenerApi240.c();
                    this.H = null;
                }
            }
            DefaultAudioSink.l0(this.E, this.o, this.A, audioSink$AudioTrackConfig0);
            this.E = null;
        }
        this.v.a();
        this.u.a();
        this.r0 = 0L;
        this.s0 = 0L;
        Handler handler0 = this.t0;
        if(handler0 != null) {
            ((Handler)Assertions.g(handler0)).removeCallbacksAndMessages(null);
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void g(int v) {
        Assertions.i(Util.a >= 29);
        this.s = v;
    }

    private void g0() {
        if(this.G == null && this.h != null) {
            this.q0 = Looper.myLooper();
            Q q0 = (AudioCapabilities audioCapabilities0) -> {
                String s = "null";
                Looper looper0 = Looper.myLooper();
                Looper looper1 = this.q0;
                if(looper1 != looper0) {
                    String s1 = looper1 == null ? "null" : looper1.getThread().getName();
                    if(looper0 != null) {
                        s = looper0.getThread().getName();
                    }
                    throw new IllegalStateException("Current looper (" + s + ") is not the playback looper (" + s1 + ")");
                }
                if(!audioCapabilities0.equals(this.F)) {
                    this.F = audioCapabilities0;
                    androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0 = this.A;
                    if(audioSink$Listener0 != null) {
                        audioSink$Listener0.h();
                    }
                }
            };
            AudioCapabilitiesReceiver audioCapabilitiesReceiver0 = new AudioCapabilitiesReceiver(this.h, q0, this.I, this.k0);
            this.G = audioCapabilitiesReceiver0;
            this.F = audioCapabilitiesReceiver0.g();
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean h() {
        return this.M;
    }

    // 检测为 Lambda 实现
    public void h0(AudioCapabilities audioCapabilities0) [...]

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void i() {
        if(this.l0) {
            this.l0 = false;
            this.flush();
        }
    }

    private void i0() {
        if(!this.e0) {
            this.e0 = true;
            long v = this.W();
            this.p.g(v);
            if(DefaultAudioSink.b0(this.E)) {
                this.f0 = false;
            }
            this.E.stop();
            this.O = 0;
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void j(AuxEffectInfo auxEffectInfo0) {
        if(this.j0.equals(auxEffectInfo0)) {
            return;
        }
        int v = auxEffectInfo0.a;
        float f = auxEffectInfo0.b;
        AudioTrack audioTrack0 = this.E;
        if(audioTrack0 != null) {
            if(this.j0.a != v) {
                audioTrack0.attachAuxEffect(v);
            }
            if(v != 0) {
                this.E.setAuxEffectSendLevel(f);
            }
        }
        this.j0 = auxEffectInfo0;
    }

    private void j0(long v) throws WriteException {
        if(!this.D.g()) {
            this.w0((this.Y == null ? AudioProcessor.a : this.Y), v);
            return;
        }
        while(!this.D.f()) {
            while(true) {
                ByteBuffer byteBuffer0 = this.D.d();
                if(!byteBuffer0.hasRemaining()) {
                    break;
                }
                this.w0(byteBuffer0, v);
                if(byteBuffer0.hasRemaining()) {
                    return;
                }
            }
            if(this.Y == null || !this.Y.hasRemaining()) {
                break;
            }
            this.D.j(this.Y);
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void k(int v) {
        if(this.i0 != v) {
            this.i0 = v;
            this.h0 = v != 0;
            this.flush();
        }
    }

    @RequiresApi(29)
    private void k0(AudioTrack audioTrack0) {
        if(this.t == null) {
            this.t = new StreamEventCallbackV29(this);
        }
        this.t.a(audioTrack0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void l(PlaybackParameters playbackParameters0) {
        this.L = new PlaybackParameters(Util.v(playbackParameters0.a, 0.1f, 8.0f), Util.v(playbackParameters0.b, 0.1f, 8.0f));
        if(this.v0()) {
            this.o0();
            return;
        }
        this.n0(playbackParameters0);
    }

    private static void l0(AudioTrack audioTrack0, ConditionVariable conditionVariable0, @Nullable androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0, AudioTrackConfig audioSink$AudioTrackConfig0) {
        conditionVariable0.d();
        Handler handler0 = new Handler(Looper.myLooper());
        synchronized(DefaultAudioSink.K0) {
            if(DefaultAudioSink.L0 == null) {
                DefaultAudioSink.L0 = Util.G1("ExoPlayer:AudioTrackReleaseThread");
            }
            ++DefaultAudioSink.M0;
            DefaultAudioSink.L0.execute(() -> try {
                audioTrack0.flush();
                audioTrack0.release();
            }
            finally {
                if(audioSink$Listener0 != null && handler0.getLooper().getThread().isAlive()) {
                    handler0.post(new O(audioSink$Listener0, audioSink$AudioTrackConfig0));
                }
                conditionVariable0.f();
                Object object0 = DefaultAudioSink.K0;
                synchronized(object0) {
                    int v2 = DefaultAudioSink.M0 - 1;
                    DefaultAudioSink.M0 = v2;
                    if(v2 == 0) {
                        DefaultAudioSink.L0.shutdown();
                        DefaultAudioSink.L0 = null;
                    }
                }
            });
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters m() {
        return this.L;
    }

    private void m0() {
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = 0L;
        this.p0 = false;
        this.T = 0;
        this.K = new MediaPositionParameters(this.L, 0L, 0L, null);
        this.W = 0L;
        this.J = null;
        this.q.clear();
        this.Y = null;
        this.Z = 0;
        this.a0 = null;
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        this.N = null;
        this.O = 0;
        this.l.n();
        this.s0();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void n(Format format0, int v, @Nullable int[] arr_v) throws ConfigurationException {
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v8;
        boolean z1;
        int v7;
        boolean z;
        int v6;
        int v5;
        AudioProcessingPipeline audioProcessingPipeline1;
        int v4;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioProcessor$AudioFormat1;
        int[] arr_v1;
        int v1;
        this.g0();
        if("audio/raw".equals(format0.n)) {
            Assertions.a(Util.f1(format0.D));
            v1 = Util.C0(format0.D, format0.B);
            com.google.common.collect.O2.a o2$a0 = new com.google.common.collect.O2.a();
            if(this.u0(format0.D)) {
                o2$a0.l(this.n);
            }
            else {
                o2$a0.l(this.m);
                o2$a0.k(this.i.a());
            }
            AudioProcessingPipeline audioProcessingPipeline0 = new AudioProcessingPipeline(o2$a0.n());
            if(audioProcessingPipeline0.equals(this.D)) {
                audioProcessingPipeline0 = this.D;
            }
            this.l.o(format0.E, format0.F);
            if(Util.a >= 21 || format0.B != 8 || arr_v != null) {
                arr_v1 = arr_v;
            }
            else {
                arr_v1 = new int[6];
                for(int v2 = 0; v2 < 6; ++v2) {
                    arr_v1[v2] = v2;
                }
            }
            this.k.m(arr_v1);
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioProcessor$AudioFormat0 = new androidx.media3.common.audio.AudioProcessor.AudioFormat(format0);
            try {
                audioProcessor$AudioFormat1 = audioProcessingPipeline0.a(audioProcessor$AudioFormat0);
            }
            catch(UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException0) {
                throw new ConfigurationException(audioProcessor$UnhandledAudioFormatException0, format0);
            }
            int v3 = Util.a0(audioProcessor$AudioFormat1.b);
            v4 = Util.C0(audioProcessor$AudioFormat1.c, audioProcessor$AudioFormat1.b);
            audioProcessingPipeline1 = audioProcessingPipeline0;
            v5 = audioProcessor$AudioFormat1.a;
            v6 = v3;
            z = this.r;
            v7 = 0;
            z1 = false;
            v8 = audioProcessor$AudioFormat1.c;
        }
        else {
            AudioProcessingPipeline audioProcessingPipeline2 = new AudioProcessingPipeline(O2.A());
            int v9 = format0.C;
            AudioOffloadSupport audioOffloadSupport0 = this.s == 0 ? AudioOffloadSupport.d : this.t(format0);
            if(this.s != 0 && audioOffloadSupport0.a) {
                int v10 = MimeTypes.f(((String)Assertions.g(format0.n)), format0.j);
                audioProcessingPipeline1 = audioProcessingPipeline2;
                v5 = v9;
                z1 = audioOffloadSupport0.b;
                v8 = v10;
                v6 = Util.a0(format0.B);
                v1 = -1;
                v4 = -1;
                v7 = 1;
                z = true;
                goto label_66;
            }
            Pair pair0 = this.F.k(format0, this.I);
            if(pair0 == null) {
                throw new ConfigurationException("Unable to configure passthrough for: " + format0, format0);
            }
            int v11 = (int)(((Integer)pair0.first));
            audioProcessingPipeline1 = audioProcessingPipeline2;
            v5 = v9;
            v6 = (int)(((Integer)pair0.second));
            v8 = v11;
            z = this.r;
            v1 = -1;
            v4 = -1;
            v7 = 2;
            z1 = false;
        }
    label_66:
        if(v8 == 0) {
            throw new ConfigurationException("Invalid output encoding (mode=" + v7 + ") for: " + format0, format0);
        }
        if(v6 == 0) {
            throw new ConfigurationException("Invalid output channel config (mode=" + v7 + ") for: " + format0, format0);
        }
        int v12 = !"audio/vnd.dts.hd;profile=lbr".equals(format0.n) || format0.i != -1 ? format0.i : 768000;
        if(v == 0) {
            int v18 = DefaultAudioSink.T(v5, v6, v8);
            v14 = v8;
            v15 = v6;
            v16 = v4;
            v17 = v5;
            v13 = this.w.a(v18, v8, v7, (v4 == -1 ? 1 : v4), v5, v12, (z ? 8.0 : 1.0));
        }
        else {
            v13 = v;
            v14 = v8;
            v15 = v6;
            v16 = v4;
            v17 = v5;
        }
        this.o0 = false;
        Configuration defaultAudioSink$Configuration0 = new Configuration(format0, v1, v7, v16, v17, v15, v14, v13, audioProcessingPipeline1, z, z1, this.l0);
        if(this.a0()) {
            this.B = defaultAudioSink$Configuration0;
            return;
        }
        this.C = defaultAudioSink$Configuration0;
    }

    private void n0(PlaybackParameters playbackParameters0) {
        MediaPositionParameters defaultAudioSink$MediaPositionParameters0 = new MediaPositionParameters(playbackParameters0, 0x8000000000000001L, 0x8000000000000001L, null);
        if(this.a0()) {
            this.J = defaultAudioSink$MediaPositionParameters0;
            return;
        }
        this.K = defaultAudioSink$MediaPositionParameters0;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void o(float f) {
        if(this.X != f) {
            this.X = f;
            this.p0();
        }
    }

    @RequiresApi(23)
    private void o0() {
        if(this.a0()) {
            PlaybackParams playbackParams0 = D.a().allowDefaults().setSpeed(this.L.a).setPitch(this.L.b).setAudioFallbackMode(2);
            try {
                this.E.setPlaybackParams(playbackParams0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                Log.o("DefaultAudioSink", "Failed to set playback params", illegalArgumentException0);
            }
            PlaybackParameters playbackParameters0 = new PlaybackParameters(this.E.getPlaybackParams().getSpeed(), this.E.getPlaybackParams().getPitch());
            this.L = playbackParameters0;
            this.p.t(playbackParameters0.a);
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void p() {
        Assertions.i(Util.a >= 21);
        Assertions.i(this.h0);
        if(!this.l0) {
            this.l0 = true;
            this.flush();
        }
    }

    private void p0() {
        if(this.a0()) {
            if(Util.a >= 21) {
                DefaultAudioSink.q0(this.E, this.X);
                return;
            }
            DefaultAudioSink.r0(this.E, this.X);
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.g0 = false;
        if(this.a0() && (this.p.p() || DefaultAudioSink.b0(this.E))) {
            this.E.pause();
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public int q(Format format0) {
        this.g0();
        if("audio/raw".equals(format0.n)) {
            if(!Util.f1(format0.D)) {
                Log.n("DefaultAudioSink", "Invalid PCM encoding: " + format0.D);
                return 0;
            }
            return format0.D == 2 || this.j && format0.D == 4 ? 2 : 1;
        }
        return this.F.o(format0, this.I) ? 2 : 0;
    }

    @RequiresApi(21)
    private static void q0(AudioTrack audioTrack0, float f) {
        audioTrack0.setVolume(f);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void r(boolean z) {
        this.M = z;
        this.n0((this.v0() ? PlaybackParameters.d : this.L));
    }

    private static void r0(AudioTrack audioTrack0, float f) {
        audioTrack0.setStereoVolume(f, f);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver0 = this.G;
        if(audioCapabilitiesReceiver0 != null) {
            audioCapabilitiesReceiver0.j();
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        this.flush();
        u5 u50 = this.m.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            ((AudioProcessor)object0).reset();
        }
        u5 u51 = this.n.i();
        while(u51.hasNext()) {
            Object object1 = u51.next();
            ((AudioProcessor)object1).reset();
        }
        AudioProcessingPipeline audioProcessingPipeline0 = this.D;
        if(audioProcessingPipeline0 != null) {
            audioProcessingPipeline0.k();
        }
        this.g0 = false;
        this.o0 = false;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void s(Clock clock0) {
        this.p.u(clock0);
    }

    private void s0() {
        this.D = this.C.i;
        this.C.i.b();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport t(Format format0) {
        return this.o0 ? AudioOffloadSupport.d : this.x.a(format0, this.I);
    }

    // 去混淆评级： 低(20)
    private boolean t0() {
        return !this.l0 && (this.C.c == 0 && !this.u0(this.C.a.D));
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public void u(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        this.k0 = audioDeviceInfo0 == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo0);
        AudioCapabilitiesReceiver audioCapabilitiesReceiver0 = this.G;
        if(audioCapabilitiesReceiver0 != null) {
            audioCapabilitiesReceiver0.i(audioDeviceInfo0);
        }
        AudioTrack audioTrack0 = this.E;
        if(audioTrack0 != null) {
            Api23.a(audioTrack0, this.k0);
        }
    }

    // 去混淆评级： 低(20)
    private boolean u0(int v) {
        return this.j && Util.e1(v);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean v() {
        if(this.a0() && (Util.a < 29 || !this.E.isOffloadedPlayback() || !this.f0)) {
            long v = this.W();
            return this.p.h(v);
        }
        return false;
    }

    private boolean v0() {
        return this.C != null && this.C.j && Util.a >= 23;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean w(ByteBuffer byteBuffer0, long v, int v1) throws InitializationException, WriteException {
        Assertions.a(this.Y == null || byteBuffer0 == this.Y);
        if(this.B != null) {
            if(!this.S()) {
                return false;
            }
            if(this.B.c(this.C)) {
                this.C = this.B;
                this.B = null;
                if(this.E != null && DefaultAudioSink.b0(this.E) && this.C.k) {
                    if(this.E.getPlayState() == 3) {
                        this.E.setOffloadEndOfStream();
                        this.p.a();
                    }
                    this.E.setOffloadDelayPadding(this.C.a.E, this.C.a.F);
                    this.p0 = true;
                }
            }
            else {
                this.i0();
                if(this.v()) {
                    return false;
                }
                this.flush();
            }
            this.N(v);
        }
        if(!this.a0()) {
            try {
                if(!this.Y()) {
                    return false;
                }
            }
            catch(InitializationException audioSink$InitializationException0) {
                if(audioSink$InitializationException0.b) {
                    throw audioSink$InitializationException0;
                }
                this.u.b(audioSink$InitializationException0);
                return false;
            }
        }
        this.u.a();
        if(this.V) {
            this.W = Math.max(0L, v);
            this.U = false;
            this.V = false;
            if(this.v0()) {
                this.o0();
            }
            this.N(v);
            if(this.g0) {
                this.c();
            }
        }
        long v2 = this.W();
        if(!this.p.k(v2)) {
            return false;
        }
        if(this.Y == null) {
            Assertions.a(byteBuffer0.order() == ByteOrder.LITTLE_ENDIAN);
            if(!byteBuffer0.hasRemaining()) {
                return true;
            }
            Configuration defaultAudioSink$Configuration0 = this.C;
            if(defaultAudioSink$Configuration0.c != 0 && this.T == 0) {
                int v3 = DefaultAudioSink.U(defaultAudioSink$Configuration0.g, byteBuffer0);
                this.T = v3;
                if(v3 == 0) {
                    return true;
                }
            }
            if(this.J != null) {
                if(!this.S()) {
                    return false;
                }
                this.N(v);
                this.J = null;
            }
            long v4 = this.W + this.C.l(this.V() - this.l.m());
            if(!this.U && Math.abs(v4 - v) > 200000L) {
                androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0 = this.A;
                if(audioSink$Listener0 != null) {
                    audioSink$Listener0.e(new UnexpectedDiscontinuityException(v, v4));
                }
                this.U = true;
            }
            if(this.U) {
                if(!this.S()) {
                    return false;
                }
                long v5 = v - v4;
                this.W += v5;
                this.U = false;
                this.N(v);
                androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener1 = this.A;
                if(audioSink$Listener1 != null && v5 != 0L) {
                    audioSink$Listener1.j();
                }
            }
            if(this.C.c == 0) {
                this.P += (long)byteBuffer0.remaining();
            }
            else {
                this.Q += ((long)this.T) * ((long)v1);
            }
            this.Y = byteBuffer0;
            this.Z = v1;
        }
        this.j0(v);
        if(!this.Y.hasRemaining()) {
            this.Y = null;
            this.Z = 0;
            return true;
        }
        long v6 = this.W();
        if(this.p.j(v6)) {
            Log.n("DefaultAudioSink", "Resetting stalled audio track");
            this.flush();
            return true;
        }
        return false;
    }

    private void w0(ByteBuffer byteBuffer0, long v) throws WriteException {
        int v4;
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer1 = this.a0;
        boolean z = true;
        if(byteBuffer1 == null) {
            this.a0 = byteBuffer0;
            if(Util.a < 21) {
                int v1 = byteBuffer0.remaining();
                if(this.b0 == null || this.b0.length < v1) {
                    this.b0 = new byte[v1];
                }
                byteBuffer0.get(this.b0, 0, v1);
                byteBuffer0.position(byteBuffer0.position());
                this.c0 = 0;
            }
        }
        else {
            Assertions.a(byteBuffer1 == byteBuffer0);
        }
        int v2 = byteBuffer0.remaining();
        if(Util.a < 21) {
            int v3 = this.p.c(this.R);
            if(v3 > 0) {
                v4 = this.E.write(this.b0, this.c0, Math.min(v2, v3));
                if(v4 > 0) {
                    this.c0 += v4;
                    byteBuffer0.position(byteBuffer0.position() + v4);
                }
            }
            else {
                v4 = 0;
            }
        }
        else if(this.l0) {
            Assertions.i(v != 0x8000000000000001L);
            if(v == 0x8000000000000000L) {
                v = this.m0;
            }
            else {
                this.m0 = v;
            }
            v4 = this.y0(this.E, byteBuffer0, v2, v);
        }
        else {
            v4 = DefaultAudioSink.x0(this.E, byteBuffer0, v2);
        }
        this.n0 = SystemClock.elapsedRealtime();
        if(v4 < 0) {
            if(!DefaultAudioSink.Z(v4)) {
                z = false;
            }
            else if(this.W() <= 0L) {
                if(DefaultAudioSink.b0(this.E)) {
                    this.e0();
                }
                else {
                    z = false;
                }
            }
            WriteException audioSink$WriteException0 = new WriteException(v4, this.C.a, z);
            androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener0 = this.A;
            if(audioSink$Listener0 != null) {
                audioSink$Listener0.e(audioSink$WriteException0);
            }
            if(!audioSink$WriteException0.b) {
                this.v.b(audioSink$WriteException0);
                return;
            }
            this.F = AudioCapabilities.e;
            throw audioSink$WriteException0;
        }
        this.v.a();
        if(DefaultAudioSink.b0(this.E)) {
            if(this.S > 0L) {
                this.p0 = false;
            }
            if(this.g0) {
                androidx.media3.exoplayer.audio.AudioSink.Listener audioSink$Listener1 = this.A;
                if(audioSink$Listener1 != null && v4 < v2 && !this.p0) {
                    audioSink$Listener1.i();
                }
            }
        }
        int v5 = this.C.c;
        if(v5 == 0) {
            this.R += (long)v4;
        }
        if(v4 == v2) {
            if(v5 != 0) {
                if(byteBuffer0 != this.Y) {
                    z = false;
                }
                Assertions.i(z);
                this.S += ((long)this.T) * ((long)this.Z);
            }
            this.a0 = null;
        }
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void x() throws WriteException {
        if(!this.d0 && this.a0() && this.S()) {
            this.i0();
            this.d0 = true;
        }
    }

    @RequiresApi(21)
    private static int x0(AudioTrack audioTrack0, ByteBuffer byteBuffer0, int v) {
        return audioTrack0.write(byteBuffer0, v, 1);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void y(int v, int v1) {
        if(this.E != null && DefaultAudioSink.b0(this.E) && (this.C != null && this.C.k)) {
            this.E.setOffloadDelayPadding(v, v1);
        }
    }

    @RequiresApi(21)
    private int y0(AudioTrack audioTrack0, ByteBuffer byteBuffer0, int v, long v1) {
        if(Util.a >= 26) {
            return audioTrack0.write(byteBuffer0, v, 1, v1 * 1000L);
        }
        if(this.N == null) {
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(16);
            this.N = byteBuffer1;
            byteBuffer1.order(ByteOrder.BIG_ENDIAN);
            this.N.putInt(0x55550001);
        }
        if(this.O == 0) {
            this.N.putInt(4, v);
            this.N.putLong(8, v1 * 1000L);
            this.N.position(0);
            this.O = v;
        }
        int v2 = this.N.remaining();
        if(v2 > 0) {
            int v3 = audioTrack0.write(this.N, v2, 1);
            if(v3 < 0) {
                this.O = 0;
                return v3;
            }
            if(v3 < v2) {
                return 0;
            }
        }
        int v4 = DefaultAudioSink.x0(audioTrack0, byteBuffer0, v);
        if(v4 < 0) {
            this.O = 0;
            return v4;
        }
        this.O -= v4;
        return v4;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public long z(boolean z) {
        return !this.a0() || this.V ? 0x8000000000000000L : this.P(this.O(Math.min(this.p.d(z), this.C.i(this.W()))));
    }

    class androidx.media3.exoplayer.audio.DefaultAudioSink.1 {
    }

}

