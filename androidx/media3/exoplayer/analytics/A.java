package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;
import java.util.List;

public final class a {
    @UnstableApi
    public static void A(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @UnstableApi
    public static void B(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    public static void C(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v, long v1) {
    }

    @UnstableApi
    public static void D(AnalyticsListener analyticsListener0, Player player0, Events analyticsListener$Events0) {
    }

    @UnstableApi
    public static void E(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z) {
    }

    @UnstableApi
    public static void F(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z) {
    }

    @UnstableApi
    public static void G(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @UnstableApi
    public static void H(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @UnstableApi
    public static void I(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
    }

    @UnstableApi
    public static void J(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @UnstableApi
    @Deprecated
    public static void K(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z) {
    }

    @UnstableApi
    public static void L(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, long v) {
    }

    @UnstableApi
    public static void M(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, @Nullable MediaItem mediaItem0, int v) {
    }

    @UnstableApi
    public static void N(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @UnstableApi
    public static void O(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Metadata metadata0) {
    }

    @UnstableApi
    public static void P(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z, int v) {
    }

    @UnstableApi
    public static void Q(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, PlaybackParameters playbackParameters0) {
    }

    @UnstableApi
    public static void R(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }

    @UnstableApi
    public static void S(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }

    @UnstableApi
    public static void T(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, PlaybackException playbackException0) {
    }

    @UnstableApi
    public static void U(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, @Nullable PlaybackException playbackException0) {
    }

    @UnstableApi
    public static void V(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    @Deprecated
    public static void W(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z, int v) {
    }

    @UnstableApi
    public static void X(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @UnstableApi
    @Deprecated
    public static void Y(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }

    @UnstableApi
    public static void Z(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
    }

    @UnstableApi
    public static void a(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, AudioAttributes audioAttributes0) {
    }

    @UnstableApi
    public static void a0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Object object0, long v) {
    }

    @UnstableApi
    public static void b(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @UnstableApi
    public static void b0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }

    @UnstableApi
    @Deprecated
    public static void c(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, String s, long v) {
    }

    @UnstableApi
    public static void c0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, long v) {
    }

    @UnstableApi
    public static void d(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, String s, long v, long v1) {
    }

    @UnstableApi
    public static void d0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, long v) {
    }

    @UnstableApi
    public static void e(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, String s) {
    }

    @UnstableApi
    @Deprecated
    public static void e0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    public static void f(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @UnstableApi
    public static void f0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z) {
    }

    @UnstableApi
    public static void g(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @UnstableApi
    public static void g0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, boolean z) {
    }

    @UnstableApi
    public static void h(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
    }

    @UnstableApi
    public static void h0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v, int v1) {
    }

    @UnstableApi
    public static void i(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, long v) {
    }

    @UnstableApi
    public static void i0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }

    @UnstableApi
    public static void j(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }

    @UnstableApi
    public static void j0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, TrackSelectionParameters trackSelectionParameters0) {
    }

    @UnstableApi
    public static void k(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @UnstableApi
    public static void k0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Tracks tracks0) {
    }

    @UnstableApi
    public static void l(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
    }

    @UnstableApi
    public static void l0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
    }

    @UnstableApi
    public static void m(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
    }

    @UnstableApi
    public static void m0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @UnstableApi
    public static void n(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
    }

    @UnstableApi
    @Deprecated
    public static void n0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, String s, long v) {
    }

    @UnstableApi
    public static void o(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Commands player$Commands0) {
    }

    @UnstableApi
    public static void o0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, String s, long v, long v1) {
    }

    @UnstableApi
    public static void p(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
    }

    @UnstableApi
    public static void p0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, String s) {
    }

    @UnstableApi
    public static void q(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, CueGroup cueGroup0) {
    }

    @UnstableApi
    public static void q0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @UnstableApi
    @Deprecated
    public static void r(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, List list0) {
    }

    @UnstableApi
    public static void r0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @UnstableApi
    public static void s(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, DeviceInfo deviceInfo0) {
    }

    @UnstableApi
    public static void s0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, long v, int v1) {
    }

    @UnstableApi
    public static void t(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v, boolean z) {
    }

    @UnstableApi
    public static void t0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
    }

    @UnstableApi
    public static void u(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
    }

    @UnstableApi
    @Deprecated
    public static void u0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v, int v1, int v2, float f) {
    }

    @UnstableApi
    public static void v(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    public static void v0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, VideoSize videoSize0) {
    }

    @UnstableApi
    public static void w(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    public static void w0(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, float f) {
    }

    @UnstableApi
    public static void x(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    @Deprecated
    public static void y(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0) {
    }

    @UnstableApi
    public static void z(AnalyticsListener analyticsListener0, EventTime analyticsListener$EventTime0, int v) {
    }
}

