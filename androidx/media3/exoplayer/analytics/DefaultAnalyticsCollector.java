package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.Events;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.base.B;
import com.google.common.collect.O2;
import com.google.common.collect.Q2.b;
import com.google.common.collect.Q2;
import com.google.common.collect.p3;
import h4.m;
import java.io.IOException;
import java.util.List;

@UnstableApi
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    static final class MediaPeriodQueueTracker {
        private final Period a;
        private O2 b;
        private Q2 c;
        @Nullable
        private MediaPeriodId d;
        private MediaPeriodId e;
        private MediaPeriodId f;

        public MediaPeriodQueueTracker(Period timeline$Period0) {
            this.a = timeline$Period0;
            this.b = O2.A();
            this.c = Q2.u();
        }

        private void b(b q2$b0, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline0) {
            if(mediaSource$MediaPeriodId0 == null) {
                return;
            }
            if(timeline0.f(mediaSource$MediaPeriodId0.a) != -1) {
                q2$b0.i(mediaSource$MediaPeriodId0, timeline0);
                return;
            }
            Timeline timeline1 = (Timeline)this.c.get(mediaSource$MediaPeriodId0);
            if(timeline1 != null) {
                q2$b0.i(mediaSource$MediaPeriodId0, timeline1);
            }
        }

        @Nullable
        private static MediaPeriodId c(Player player0, O2 o20, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Period timeline$Period0) {
            Timeline timeline0 = player0.O1();
            int v = player0.L0();
            Object object0 = timeline0.w() ? null : timeline0.s(v);
            int v1 = player0.W() || timeline0.w() ? -1 : timeline0.j(v, timeline$Period0).f(Util.F1(player0.getCurrentPosition()) - timeline$Period0.r());
            for(int v2 = 0; v2 < o20.size(); ++v2) {
                MediaPeriodId mediaSource$MediaPeriodId1 = (MediaPeriodId)o20.get(v2);
                if(MediaPeriodQueueTracker.i(mediaSource$MediaPeriodId1, object0, player0.W(), player0.u0(), player0.N0(), v1)) {
                    return mediaSource$MediaPeriodId1;
                }
            }
            return !o20.isEmpty() || mediaSource$MediaPeriodId0 == null || !MediaPeriodQueueTracker.i(mediaSource$MediaPeriodId0, object0, player0.W(), player0.u0(), player0.N0(), v1) ? null : mediaSource$MediaPeriodId0;
        }

        @Nullable
        public MediaPeriodId d() {
            return this.d;
        }

        // 去混淆评级： 低(20)
        @Nullable
        public MediaPeriodId e() {
            return this.b.isEmpty() ? null : ((MediaPeriodId)p3.w(this.b));
        }

        @Nullable
        public Timeline f(MediaPeriodId mediaSource$MediaPeriodId0) {
            return (Timeline)this.c.get(mediaSource$MediaPeriodId0);
        }

        @Nullable
        public MediaPeriodId g() {
            return this.e;
        }

        @Nullable
        public MediaPeriodId h() {
            return this.f;
        }

        // 去混淆评级： 低(30)
        private static boolean i(MediaPeriodId mediaSource$MediaPeriodId0, @Nullable Object object0, boolean z, int v, int v1, int v2) {
            return mediaSource$MediaPeriodId0.a.equals(object0) ? z && mediaSource$MediaPeriodId0.b == v && mediaSource$MediaPeriodId0.c == v1 || !z && mediaSource$MediaPeriodId0.b == -1 && mediaSource$MediaPeriodId0.e == v2 : false;
        }

        public void j(Player player0) {
            this.d = MediaPeriodQueueTracker.c(player0, this.b, this.e, this.a);
        }

        public void k(List list0, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Player player0) {
            this.b = O2.r(list0);
            if(!list0.isEmpty()) {
                this.e = (MediaPeriodId)list0.get(0);
                this.f = (MediaPeriodId)Assertions.g(mediaSource$MediaPeriodId0);
            }
            if(this.d == null) {
                this.d = MediaPeriodQueueTracker.c(player0, this.b, this.e, this.a);
            }
            this.m(player0.O1());
        }

        public void l(Player player0) {
            this.d = MediaPeriodQueueTracker.c(player0, this.b, this.e, this.a);
            this.m(player0.O1());
        }

        private void m(Timeline timeline0) {
            b q2$b0 = Q2.b();
            if(this.b.isEmpty()) {
                this.b(q2$b0, this.e, timeline0);
                if(!B.a(this.f, this.e)) {
                    this.b(q2$b0, this.f, timeline0);
                }
                if(!B.a(this.d, this.e) && !B.a(this.d, this.f)) {
                    this.b(q2$b0, this.d, timeline0);
                }
            }
            else {
                for(int v = 0; v < this.b.size(); ++v) {
                    this.b(q2$b0, ((MediaPeriodId)this.b.get(v)), timeline0);
                }
                if(!this.b.contains(this.d)) {
                    this.b(q2$b0, this.d, timeline0);
                }
            }
            this.c = q2$b0.d();
        }
    }

    private final Clock a;
    private final Period b;
    private final Window c;
    private final MediaPeriodQueueTracker d;
    private final SparseArray e;
    private ListenerSet f;
    private Player g;
    private HandlerWrapper h;
    private boolean i;

    public DefaultAnalyticsCollector(Clock clock0) {
        this.a = (Clock)Assertions.g(clock0);
        this.f = new ListenerSet(Util.k0(), clock0, new G());
        Period timeline$Period0 = new Period();
        this.b = timeline$Period0;
        this.c = new Window();
        this.d = new MediaPeriodQueueTracker(timeline$Period0);
        this.e = new SparseArray();
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void A(int v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 8, (AnalyticsListener analyticsListener0) -> analyticsListener0.t0(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void A2(EventTime analyticsListener$EventTime0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void B(int v, long v1, long v2) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F3, (AnalyticsListener analyticsListener0) -> analyticsListener0.g0(analyticsListener$EventTime0, v, v1, v2));
    }

    // 检测为 Lambda 实现
    private static void B2(EventTime analyticsListener$EventTime0, int v, long v1, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void C(boolean z) {
    }

    // 检测为 Lambda 实现
    private static void C2(EventTime analyticsListener$EventTime0, boolean z, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void D(List list0, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        Player player0 = (Player)Assertions.g(this.g);
        this.d.k(list0, mediaSource$MediaPeriodId0, player0);
    }

    // 检测为 Lambda 实现
    private static void D2(EventTime analyticsListener$EventTime0, boolean z, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void E(int v) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 21, (AnalyticsListener analyticsListener0) -> analyticsListener0.t(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void E2(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void F(boolean z) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 9, (AnalyticsListener analyticsListener0) -> analyticsListener0.r(analyticsListener$EventTime0, z));
    }

    // 检测为 Lambda 实现
    private static void F2(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void G(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 0x3FF, (AnalyticsListener analyticsListener0) -> analyticsListener0.L(analyticsListener$EventTime0));
    }

    // 检测为 Lambda 实现
    private static void G2(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void H(int v, boolean z) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 30, (AnalyticsListener analyticsListener0) -> analyticsListener0.O(analyticsListener$EventTime0, v, z));
    }

    // 检测为 Lambda 实现
    private static void H2(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void I(MediaMetadata mediaMetadata0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 14, (AnalyticsListener analyticsListener0) -> analyticsListener0.V(analyticsListener$EventTime0, mediaMetadata0));
    }

    // 检测为 Lambda 实现
    private static void I2(EventTime analyticsListener$EventTime0, long v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void J(PlaybackException playbackException0) {
        EventTime analyticsListener$EventTime0 = this.Y1(playbackException0);
        this.s3(analyticsListener$EventTime0, 10, (AnalyticsListener analyticsListener0) -> analyticsListener0.S(analyticsListener$EventTime0, playbackException0));
    }

    // 检测为 Lambda 实现
    private static void J2(EventTime analyticsListener$EventTime0, MediaItem mediaItem0, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void K(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 1003, (AnalyticsListener analyticsListener0) -> analyticsListener0.e0(analyticsListener$EventTime0, loadEventInfo0, mediaLoadData0, iOException0, z));
    }

    // 检测为 Lambda 实现
    private static void K2(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void L(Commands player$Commands0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 13, (AnalyticsListener analyticsListener0) -> analyticsListener0.p(analyticsListener$EventTime0, player$Commands0));
    }

    public static void L1(AnalyticsListener analyticsListener0, FlagSet flagSet0) {
    }

    // 检测为 Lambda 实现
    private static void L2(EventTime analyticsListener$EventTime0, Metadata metadata0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void M(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 1002, (AnalyticsListener analyticsListener0) -> analyticsListener0.y0(analyticsListener$EventTime0, loadEventInfo0, mediaLoadData0));
    }

    // 检测为 Lambda 实现
    private static void M2(EventTime analyticsListener$EventTime0, boolean z, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void N(Player player0, Events player$Events0) {
    }

    // 检测为 Lambda 实现
    private static void N2(EventTime analyticsListener$EventTime0, PlaybackParameters playbackParameters0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void O(AnalyticsListener analyticsListener0) {
        Assertions.g(analyticsListener0);
        this.f.c(analyticsListener0);
    }

    // 检测为 Lambda 实现
    private static void O2(EventTime analyticsListener$EventTime0, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void P(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 1004, (AnalyticsListener analyticsListener0) -> analyticsListener0.I(analyticsListener$EventTime0, mediaLoadData0));
    }

    // 检测为 Lambda 实现
    private static void P2(EventTime analyticsListener$EventTime0, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void Q(Timeline timeline0, int v) {
        Player player0 = (Player)Assertions.g(this.g);
        this.d.l(player0);
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 0, (AnalyticsListener analyticsListener0) -> analyticsListener0.X(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void Q2(EventTime analyticsListener$EventTime0, PlaybackException playbackException0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void R(long v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 17, (AnalyticsListener analyticsListener0) -> analyticsListener0.G(analyticsListener$EventTime0, v));
    }

    protected final EventTime R1() {
        return this.T1(this.d.d());
    }

    // 检测为 Lambda 实现
    private static void R2(EventTime analyticsListener$EventTime0, PlaybackException playbackException0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void S(Tracks tracks0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 2, (AnalyticsListener analyticsListener0) -> analyticsListener0.D(analyticsListener$EventTime0, tracks0));
    }

    @m({"player"})
    protected final EventTime S1(Timeline timeline0, int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        MediaPeriodId mediaSource$MediaPeriodId1 = timeline0.w() ? null : mediaSource$MediaPeriodId0;
        long v1 = this.a.elapsedRealtime();
        boolean z = timeline0.equals(this.g.O1()) && v == this.g.n2();
        long v2 = 0L;
        if(mediaSource$MediaPeriodId1 == null || !mediaSource$MediaPeriodId1.c()) {
            if(z) {
                v2 = this.g.d2();
            }
            else if(!timeline0.w()) {
                v2 = timeline0.t(v, this.c).c();
            }
        }
        else if(z && this.g.u0() == mediaSource$MediaPeriodId1.b && this.g.N0() == mediaSource$MediaPeriodId1.c) {
            v2 = this.g.getCurrentPosition();
        }
        Timeline timeline1 = this.g.O1();
        int v3 = this.g.n2();
        long v4 = this.g.getCurrentPosition();
        long v5 = this.g.Y();
        return new EventTime(v1, timeline0, v, mediaSource$MediaPeriodId1, v2, timeline1, v3, this.d.d(), v4, v5);
    }

    // 检测为 Lambda 实现
    private static void S2(EventTime analyticsListener$EventTime0, boolean z, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void T(DeviceInfo deviceInfo0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 29, (AnalyticsListener analyticsListener0) -> analyticsListener0.K(analyticsListener$EventTime0, deviceInfo0));
    }

    private EventTime T1(@Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        Assertions.g(this.g);
        Timeline timeline0 = mediaSource$MediaPeriodId0 == null ? null : this.d.f(mediaSource$MediaPeriodId0);
        if(mediaSource$MediaPeriodId0 != null && timeline0 != null) {
            return this.S1(timeline0, timeline0.l(mediaSource$MediaPeriodId0.a, this.b).c, mediaSource$MediaPeriodId0);
        }
        int v = this.g.n2();
        Timeline timeline1 = this.g.O1();
        if(v >= timeline1.v()) {
            timeline1 = Timeline.a;
        }
        return this.S1(timeline1, v, null);
    }

    // 检测为 Lambda 实现
    private static void T2(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void U(AnalyticsListener analyticsListener0) {
        this.f.l(analyticsListener0);
    }

    private EventTime U1() {
        return this.T1(this.d.e());
    }

    // 检测为 Lambda 实现
    private static void U2(EventTime analyticsListener$EventTime0, int v, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void V(boolean z, int v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 5, (AnalyticsListener analyticsListener0) -> analyticsListener0.d(analyticsListener$EventTime0, z, v));
    }

    private EventTime V1(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        Assertions.g(this.g);
        if(mediaSource$MediaPeriodId0 != null) {
            return this.d.f(mediaSource$MediaPeriodId0) == null ? this.S1(Timeline.a, v, mediaSource$MediaPeriodId0) : this.T1(mediaSource$MediaPeriodId0);
        }
        Timeline timeline0 = this.g.O1();
        if(v >= timeline0.v()) {
            timeline0 = Timeline.a;
        }
        return this.S1(timeline0, v, null);
    }

    // 检测为 Lambda 实现
    private static void V2(EventTime analyticsListener$EventTime0, Object object0, long v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void W(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 0x403, (AnalyticsListener analyticsListener0) -> analyticsListener0.e(analyticsListener$EventTime0));
    }

    private EventTime W1() {
        return this.T1(this.d.g());
    }

    // 检测为 Lambda 实现
    private static void W2(EventTime analyticsListener$EventTime0, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void X(Player player0, Looper looper0) {
        Assertions.i(this.g == null || this.d.b.isEmpty());
        this.g = (Player)Assertions.g(player0);
        this.h = this.a.c(looper0, null);
        this.f = this.f.f(looper0, (AnalyticsListener analyticsListener0, FlagSet flagSet0) -> analyticsListener0.J(player0, new androidx.media3.exoplayer.analytics.AnalyticsListener.Events(flagSet0, this.e)));
    }

    private EventTime X1() {
        return this.T1(this.d.h());
    }

    // 检测为 Lambda 实现
    private static void X2(EventTime analyticsListener$EventTime0, long v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
        if(v == 1) {
            this.i = false;
        }
        Player player0 = (Player)Assertions.g(this.g);
        this.d.j(player0);
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 11, (AnalyticsListener analyticsListener0) -> {
            analyticsListener0.c(analyticsListener$EventTime0, v);
            analyticsListener0.a0(analyticsListener$EventTime0, player$PositionInfo0, player$PositionInfo1, v);
        });
    }

    private EventTime Y1(@Nullable PlaybackException playbackException0) {
        if(playbackException0 instanceof ExoPlaybackException) {
            MediaPeriodId mediaSource$MediaPeriodId0 = ((ExoPlaybackException)playbackException0).j9;
            return mediaSource$MediaPeriodId0 == null ? this.R1() : this.T1(mediaSource$MediaPeriodId0);
        }
        return this.R1();
    }

    // 检测为 Lambda 实现
    private static void Y2(EventTime analyticsListener$EventTime0, long v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void Z(boolean z) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 7, (AnalyticsListener analyticsListener0) -> analyticsListener0.b(analyticsListener$EventTime0, z));
    }

    private static void Z1(AnalyticsListener analyticsListener0, FlagSet flagSet0) {
    }

    // 检测为 Lambda 实现
    private static void Z2(EventTime analyticsListener$EventTime0, boolean z, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void a(VideoSize videoSize0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 25, (AnalyticsListener analyticsListener0) -> {
            analyticsListener0.F(analyticsListener$EventTime0, videoSize0);
            analyticsListener0.m0(analyticsListener$EventTime0, videoSize0.a, videoSize0.b, videoSize0.c, videoSize0.d);
        });
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void a0(int v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 6, (AnalyticsListener analyticsListener0) -> analyticsListener0.x(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void a2(EventTime analyticsListener$EventTime0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void a3(EventTime analyticsListener$EventTime0, boolean z, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void b(AudioTrackConfig audioSink$AudioTrackConfig0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x407, (AnalyticsListener analyticsListener0) -> analyticsListener0.i0(analyticsListener$EventTime0, audioSink$AudioTrackConfig0));
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void b0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 1005, (AnalyticsListener analyticsListener0) -> analyticsListener0.y(analyticsListener$EventTime0, mediaLoadData0));
    }

    // 检测为 Lambda 实现
    private static void b2(EventTime analyticsListener$EventTime0, AudioAttributes audioAttributes0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void b3(EventTime analyticsListener$EventTime0, int v, int v1, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void c(AudioTrackConfig audioSink$AudioTrackConfig0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x408, (AnalyticsListener analyticsListener0) -> analyticsListener0.w(analyticsListener$EventTime0, audioSink$AudioTrackConfig0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void c0(int v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 4, (AnalyticsListener analyticsListener0) -> analyticsListener0.s(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void c2(EventTime analyticsListener$EventTime0, Exception exception0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void c3(EventTime analyticsListener$EventTime0, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void d(boolean z) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 23, (AnalyticsListener analyticsListener0) -> analyticsListener0.R(analyticsListener$EventTime0, z));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void d0() {
        if(!this.i) {
            EventTime analyticsListener$EventTime0 = this.R1();
            this.i = true;
            this.s3(analyticsListener$EventTime0, -1, (AnalyticsListener analyticsListener0) -> analyticsListener0.r0(analyticsListener$EventTime0));
        }
    }

    // 检测为 Lambda 实现
    private static void d2(EventTime analyticsListener$EventTime0, String s, long v, long v1, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void d3(EventTime analyticsListener$EventTime0, TrackSelectionParameters trackSelectionParameters0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void e(Exception exception0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F6, (AnalyticsListener analyticsListener0) -> analyticsListener0.c0(analyticsListener$EventTime0, exception0));
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void e0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 1000, (AnalyticsListener analyticsListener0) -> analyticsListener0.o0(analyticsListener$EventTime0, loadEventInfo0, mediaLoadData0));
    }

    // 检测为 Lambda 实现
    private static void e2(EventTime analyticsListener$EventTime0, String s, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void e3(EventTime analyticsListener$EventTime0, Tracks tracks0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void f(String s) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3FB, (AnalyticsListener analyticsListener0) -> analyticsListener0.k0(analyticsListener$EventTime0, s));
    }

    @Override  // androidx.media3.common.Player$Listener
    public void f0(long v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 16, (AnalyticsListener analyticsListener0) -> analyticsListener0.T(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void f2(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void f3(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void g(String s) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F4, (AnalyticsListener analyticsListener0) -> analyticsListener0.j0(analyticsListener$EventTime0, s));
    }

    @Override  // androidx.media3.common.Player$Listener
    public void g0(TrackSelectionParameters trackSelectionParameters0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 19, (AnalyticsListener analyticsListener0) -> analyticsListener0.j(analyticsListener$EventTime0, trackSelectionParameters0));
    }

    // 检测为 Lambda 实现
    private static void g2(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void g3(EventTime analyticsListener$EventTime0, Exception exception0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void h(String s, long v, long v1) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F0, (AnalyticsListener analyticsListener0) -> {
            analyticsListener0.h0(analyticsListener$EventTime0, s, v1);
            analyticsListener0.i(analyticsListener$EventTime0, s, v, v1);
        });
    }

    @Override  // androidx.media3.common.Player$Listener
    public void h0() {
    }

    // 检测为 Lambda 实现
    private static void h2(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void h3(EventTime analyticsListener$EventTime0, String s, long v, long v1, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void i(DecoderCounters decoderCounters0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 1007, (AnalyticsListener analyticsListener0) -> analyticsListener0.m(analyticsListener$EventTime0, decoderCounters0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void i0(@Nullable MediaItem mediaItem0, int v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 1, (AnalyticsListener analyticsListener0) -> analyticsListener0.l(analyticsListener$EventTime0, mediaItem0, v));
    }

    // 检测为 Lambda 实现
    private static void i2(EventTime analyticsListener$EventTime0, long v, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void i3(EventTime analyticsListener$EventTime0, String s, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void j(DecoderCounters decoderCounters0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F7, (AnalyticsListener analyticsListener0) -> analyticsListener0.b0(analyticsListener$EventTime0, decoderCounters0));
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void j0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, int v1) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 0x3FE, (AnalyticsListener analyticsListener0) -> {
            analyticsListener0.n0(analyticsListener$EventTime0);
            analyticsListener0.o(analyticsListener$EventTime0, v1);
        });
    }

    // 检测为 Lambda 实现
    private static void j2(EventTime analyticsListener$EventTime0, int v, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void j3(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void k(Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 1009, (AnalyticsListener analyticsListener0) -> analyticsListener0.u(analyticsListener$EventTime0, format0, decoderReuseEvaluation0));
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void k0(int v, MediaPeriodId mediaSource$MediaPeriodId0) {
    }

    // 检测为 Lambda 实现
    private static void k2(EventTime analyticsListener$EventTime0, Exception exception0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void k3(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void l(DecoderCounters decoderCounters0) {
        EventTime analyticsListener$EventTime0 = this.W1();
        this.s3(analyticsListener$EventTime0, 0x3F5, (AnalyticsListener analyticsListener0) -> analyticsListener0.Y(analyticsListener$EventTime0, decoderCounters0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void l0(int v, int v1) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 24, (AnalyticsListener analyticsListener0) -> analyticsListener0.n(analyticsListener$EventTime0, v, v1));
    }

    // 检测为 Lambda 实现
    private static void l2(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void l3(EventTime analyticsListener$EventTime0, long v, int v1, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void m(int v, long v1) {
        EventTime analyticsListener$EventTime0 = this.W1();
        this.s3(analyticsListener$EventTime0, 0x3FA, (AnalyticsListener analyticsListener0) -> analyticsListener0.A(analyticsListener$EventTime0, v, v1));
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void m0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 0x402, (AnalyticsListener analyticsListener0) -> analyticsListener0.l0(analyticsListener$EventTime0));
    }

    // 检测为 Lambda 实现
    private static void m2(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void m3(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void n(Exception exception0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x405, (AnalyticsListener analyticsListener0) -> analyticsListener0.g(analyticsListener$EventTime0, exception0));
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void n0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Exception exception0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 0x400, (AnalyticsListener analyticsListener0) -> analyticsListener0.k(analyticsListener$EventTime0, exception0));
    }

    // 检测为 Lambda 实现
    private static void n2(EventTime analyticsListener$EventTime0, int v, long v1, long v2, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void n3(EventTime analyticsListener$EventTime0, VideoSize videoSize0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void o(long v, int v1) {
        EventTime analyticsListener$EventTime0 = this.W1();
        this.s3(analyticsListener$EventTime0, 0x3FD, (AnalyticsListener analyticsListener0) -> analyticsListener0.H(analyticsListener$EventTime0, v, v1));
    }

    @Override  // androidx.media3.common.Player$Listener
    public void o0(int v) {
    }

    // 检测为 Lambda 实现
    private static void o2(EventTime analyticsListener$EventTime0, Commands player$Commands0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void o3(EventTime analyticsListener$EventTime0, float f, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void p(String s, long v, long v1) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F8, (AnalyticsListener analyticsListener0) -> {
            analyticsListener0.B(analyticsListener$EventTime0, s, v1);
            analyticsListener0.v0(analyticsListener$EventTime0, s, v, v1);
        });
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void p0(boolean z) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 3, (AnalyticsListener analyticsListener0) -> {
            analyticsListener0.z(analyticsListener$EventTime0, z);
            analyticsListener0.N(analyticsListener$EventTime0, z);
        });
    }

    // 检测为 Lambda 实现
    private static void p2(EventTime analyticsListener$EventTime0, int v, long v1, long v2, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private static void p3(EventTime analyticsListener$EventTime0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void q(PlaybackParameters playbackParameters0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 12, (AnalyticsListener analyticsListener0) -> analyticsListener0.v(analyticsListener$EventTime0, playbackParameters0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void q0(float f) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 22, (AnalyticsListener analyticsListener0) -> analyticsListener0.d0(analyticsListener$EventTime0, f));
    }

    // 检测为 Lambda 实现
    private static void q2(EventTime analyticsListener$EventTime0, List list0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private void q3(Player player0, AnalyticsListener analyticsListener0, FlagSet flagSet0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void r(List list0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 27, (AnalyticsListener analyticsListener0) -> analyticsListener0.Q(analyticsListener$EventTime0, list0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void r0(AudioAttributes audioAttributes0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 20, (AnalyticsListener analyticsListener0) -> analyticsListener0.W(analyticsListener$EventTime0, audioAttributes0));
    }

    // 检测为 Lambda 实现
    private static void r2(EventTime analyticsListener$EventTime0, CueGroup cueGroup0, AnalyticsListener analyticsListener0) [...]

    // 检测为 Lambda 实现
    private void r3() [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void release() {
        ((HandlerWrapper)Assertions.k(this.h)).k(() -> {
            EventTime analyticsListener$EventTime0 = this.R1();
            this.s3(analyticsListener$EventTime0, 0x404, (AnalyticsListener analyticsListener0) -> analyticsListener0.Z(analyticsListener$EventTime0));
            this.f.k();
        });
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void s(long v) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 1010, (AnalyticsListener analyticsListener0) -> analyticsListener0.f0(analyticsListener$EventTime0, v));
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void s0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 1001, (AnalyticsListener analyticsListener0) -> analyticsListener0.h(analyticsListener$EventTime0, loadEventInfo0, mediaLoadData0));
    }

    // 检测为 Lambda 实现
    private static void s2(EventTime analyticsListener$EventTime0, DeviceInfo deviceInfo0, AnalyticsListener analyticsListener0) [...]

    protected final void s3(EventTime analyticsListener$EventTime0, int v, Event listenerSet$Event0) {
        this.e.put(v, analyticsListener$EventTime0);
        this.f.m(v, listenerSet$Event0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void t(Exception exception0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 1030, (AnalyticsListener analyticsListener0) -> analyticsListener0.q(analyticsListener$EventTime0, exception0));
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void t0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        EventTime analyticsListener$EventTime0 = this.V1(v, mediaSource$MediaPeriodId0);
        this.s3(analyticsListener$EventTime0, 0x401, (AnalyticsListener analyticsListener0) -> analyticsListener0.C(analyticsListener$EventTime0));
    }

    // 检测为 Lambda 实现
    private static void t2(EventTime analyticsListener$EventTime0, int v, boolean z, AnalyticsListener analyticsListener0) [...]

    @Deprecated
    public void t3(boolean z) {
        this.f.n(z);
    }

    @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter$EventListener
    public final void u(int v, long v1, long v2) {
        EventTime analyticsListener$EventTime0 = this.U1();
        this.s3(analyticsListener$EventTime0, 1006, (AnalyticsListener analyticsListener0) -> analyticsListener0.f(analyticsListener$EventTime0, v, v1, v2));
    }

    @Override  // androidx.media3.common.Player$Listener
    public final void u0(boolean z, int v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, -1, (AnalyticsListener analyticsListener0) -> analyticsListener0.p0(analyticsListener$EventTime0, z, v));
    }

    // 检测为 Lambda 实现
    private static void u2(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void v(Object object0, long v) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 26, (AnalyticsListener analyticsListener0) -> analyticsListener0.M(analyticsListener$EventTime0, object0, v));
    }

    @Override  // androidx.media3.common.Player$Listener
    public void v0(MediaMetadata mediaMetadata0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 15, (AnalyticsListener analyticsListener0) -> analyticsListener0.w0(analyticsListener$EventTime0, mediaMetadata0));
    }

    // 检测为 Lambda 实现
    private static void v2(EventTime analyticsListener$EventTime0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public void w(CueGroup cueGroup0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 27, (AnalyticsListener analyticsListener0) -> analyticsListener0.u0(analyticsListener$EventTime0, cueGroup0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public void w0(@Nullable PlaybackException playbackException0) {
        EventTime analyticsListener$EventTime0 = this.Y1(playbackException0);
        this.s3(analyticsListener$EventTime0, 10, (AnalyticsListener analyticsListener0) -> analyticsListener0.q0(analyticsListener$EventTime0, playbackException0));
    }

    // 检测为 Lambda 实现
    private static void w2(EventTime analyticsListener$EventTime0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.common.Player$Listener
    public final void x(Metadata metadata0) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 28, (AnalyticsListener analyticsListener0) -> analyticsListener0.P(analyticsListener$EventTime0, metadata0));
    }

    @Override  // androidx.media3.common.Player$Listener
    public void x0(long v) {
        EventTime analyticsListener$EventTime0 = this.R1();
        this.s3(analyticsListener$EventTime0, 18, (AnalyticsListener analyticsListener0) -> analyticsListener0.s0(analyticsListener$EventTime0, v));
    }

    // 检测为 Lambda 实现
    private static void x2(EventTime analyticsListener$EventTime0, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void y(Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
        EventTime analyticsListener$EventTime0 = this.X1();
        this.s3(analyticsListener$EventTime0, 0x3F9, (AnalyticsListener analyticsListener0) -> analyticsListener0.A0(analyticsListener$EventTime0, format0, decoderReuseEvaluation0));
    }

    // 检测为 Lambda 实现
    private static void y2(EventTime analyticsListener$EventTime0, int v, AnalyticsListener analyticsListener0) [...]

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void z(DecoderCounters decoderCounters0) {
        EventTime analyticsListener$EventTime0 = this.W1();
        this.s3(analyticsListener$EventTime0, 1020, (AnalyticsListener analyticsListener0) -> analyticsListener0.U(analyticsListener$EventTime0, decoderCounters0));
    }

    // 检测为 Lambda 实现
    private static void z2(EventTime analyticsListener$EventTime0, Exception exception0, AnalyticsListener analyticsListener0) [...]
}

