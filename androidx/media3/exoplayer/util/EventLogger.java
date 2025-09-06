package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import android.text.TextUtils;
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
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks.Group;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime;
import androidx.media3.exoplayer.analytics.AnalyticsListener.Events;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.google.common.collect.O2;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class EventLogger implements AnalyticsListener {
    private final String m0;
    private final Window n0;
    private final Period o0;
    private final long p0;
    private static final String q0 = "EventLogger";
    private static final int r0 = 3;
    private static final NumberFormat s0;

    static {
        NumberFormat numberFormat0 = NumberFormat.getInstance(Locale.US);
        EventLogger.s0 = numberFormat0;
        numberFormat0.setMinimumFractionDigits(2);
        numberFormat0.setMaximumFractionDigits(2);
        numberFormat0.setGroupingUsed(false);
    }

    public EventLogger() {
        this("EventLogger");
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector0) {
        this("EventLogger");
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector0, String s) {
        this(s);
    }

    public EventLogger(String s) {
        this.m0 = s;
        this.n0 = new Window();
        this.o0 = new Period();
        this.p0 = SystemClock.elapsedRealtime();
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void A(EventTime analyticsListener$EventTime0, int v, long v1) {
        this.K0(analyticsListener$EventTime0, "droppedFrames", Integer.toString(v));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void A0(EventTime analyticsListener$EventTime0, Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
        this.K0(analyticsListener$EventTime0, "videoInputFormat", Format.l(format0));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void B(EventTime analyticsListener$EventTime0, String s, long v) {
    }

    private static String B0(int v) {
        switch(v) {
            case 0: {
                return "REPEAT";
            }
            case 1: {
                return "AUTO";
            }
            case 2: {
                return "SEEK";
            }
            case 3: {
                return "PLAYLIST_CHANGED";
            }
            default: {
                return "?";
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void C(EventTime analyticsListener$EventTime0) {
        this.J0(analyticsListener$EventTime0, "drmKeysRestored");
    }

    private static String C0(int v) {
        switch(v) {
            case 1: {
                return "USER_REQUEST";
            }
            case 2: {
                return "AUDIO_FOCUS_LOSS";
            }
            case 3: {
                return "AUDIO_BECOMING_NOISY";
            }
            case 4: {
                return "REMOTE";
            }
            case 5: {
                return "END_OF_MEDIA_ITEM";
            }
            default: {
                return "?";
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void D(EventTime analyticsListener$EventTime0, Tracks tracks0) {
        this.L0("tracks [" + this.z0(analyticsListener$EventTime0));
        O2 o20 = tracks0.c();
        for(int v = 0; v < o20.size(); ++v) {
            Group tracks$Group0 = (Group)o20.get(v);
            this.L0("  group [");
            for(int v1 = 0; v1 < tracks$Group0.a; ++v1) {
                String s = EventLogger.I0(tracks$Group0.k(v1));
                String s1 = Util.s0(tracks$Group0.e(v1));
                this.L0("    " + s + " Track:" + v1 + ", " + Format.l(tracks$Group0.d(v1)) + ", supported=" + s1);
            }
            this.L0("  ]");
        }
        boolean z = false;
        for(int v2 = 0; !z && v2 < o20.size(); ++v2) {
            Group tracks$Group1 = (Group)o20.get(v2);
            for(int v3 = 0; !z && v3 < tracks$Group1.a; ++v3) {
                if(tracks$Group1.k(v3)) {
                    Metadata metadata0 = tracks$Group1.d(v3).k;
                    if(metadata0 != null && metadata0.f() > 0) {
                        this.L0("  Metadata [");
                        this.Q0(metadata0, "    ");
                        this.L0("  ]");
                        z = true;
                    }
                }
            }
        }
        this.L0("]");
    }

    private static String D0(int v) {
        switch(v) {
            case 0: {
                return "NONE";
            }
            case 1: {
                return "TRANSIENT_AUDIO_FOCUS_LOSS";
            }
            default: {
                return "?";
            }
        }
    }

    private static String E(int v) {
        switch(v) {
            case 0: {
                return "AUTO_TRANSITION";
            }
            case 1: {
                return "SEEK";
            }
            case 2: {
                return "SEEK_ADJUSTMENT";
            }
            case 3: {
                return "SKIP";
            }
            case 4: {
                return "REMOVE";
            }
            case 5: {
                return "INTERNAL";
            }
            case 6: {
                return "SILENCE_SKIP";
            }
            default: {
                return "?";
            }
        }
    }

    private static String E0(int v) {
        switch(v) {
            case 0: {
                return "OFF";
            }
            case 1: {
                return "ONE";
            }
            case 2: {
                return "ALL";
            }
            default: {
                return "?";
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void F(EventTime analyticsListener$EventTime0, VideoSize videoSize0) {
        this.K0(analyticsListener$EventTime0, "videoSize", videoSize0.a + ", " + videoSize0.b);
    }

    private static String F0(int v) {
        switch(v) {
            case 1: {
                return "IDLE";
            }
            case 2: {
                return "BUFFERING";
            }
            case 3: {
                return "READY";
            }
            case 4: {
                return "ENDED";
            }
            default: {
                return "?";
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void G(EventTime analyticsListener$EventTime0, long v) {
    }

    private static String G0(long v) {
        return v == 0x8000000000000001L ? "?" : EventLogger.s0.format(((double)(((float)v) / 1000.0f)));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void H(EventTime analyticsListener$EventTime0, long v, int v1) {
    }

    private static String H0(int v) {
        switch(v) {
            case 0: {
                return "PLAYLIST_CHANGED";
            }
            case 1: {
                return "SOURCE_UPDATE";
            }
            default: {
                return "?";
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void I(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
        this.K0(analyticsListener$EventTime0, "downstreamFormat", Format.l(mediaLoadData0.c));
    }

    // 去混淆评级： 低(20)
    private static String I0(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void J(Player player0, Events analyticsListener$Events0) {
    }

    private void J0(EventTime analyticsListener$EventTime0, String s) {
        this.L0(this.x0(analyticsListener$EventTime0, s, null, null));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void K(EventTime analyticsListener$EventTime0, DeviceInfo deviceInfo0) {
    }

    private void K0(EventTime analyticsListener$EventTime0, String s, String s1) {
        this.L0(this.x0(analyticsListener$EventTime0, s, s1, null));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void L(EventTime analyticsListener$EventTime0) {
        this.J0(analyticsListener$EventTime0, "drmKeysLoaded");
    }

    @UnstableApi
    protected void L0(String s) {
        Log.b(this.m0, s);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void M(EventTime analyticsListener$EventTime0, Object object0, long v) {
        this.K0(analyticsListener$EventTime0, "renderedFirstFrame", String.valueOf(object0));
    }

    private void M0(EventTime analyticsListener$EventTime0, String s, String s1, @Nullable Throwable throwable0) {
        this.O0(this.x0(analyticsListener$EventTime0, s, s1, throwable0));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void N(EventTime analyticsListener$EventTime0, boolean z) {
        this.K0(analyticsListener$EventTime0, "loading", Boolean.toString(z));
    }

    private void N0(EventTime analyticsListener$EventTime0, String s, @Nullable Throwable throwable0) {
        this.O0(this.x0(analyticsListener$EventTime0, s, null, throwable0));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void O(EventTime analyticsListener$EventTime0, int v, boolean z) {
    }

    @UnstableApi
    protected void O0(String s) {
        Log.d(this.m0, s);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void P(EventTime analyticsListener$EventTime0, Metadata metadata0) {
        this.L0("metadata [" + this.z0(analyticsListener$EventTime0));
        this.Q0(metadata0, "  ");
        this.L0("]");
    }

    private void P0(EventTime analyticsListener$EventTime0, String s, Exception exception0) {
        this.M0(analyticsListener$EventTime0, "internalError", s, exception0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Q(EventTime analyticsListener$EventTime0, List list0) {
    }

    private void Q0(Metadata metadata0, String s) {
        for(int v = 0; v < metadata0.f(); ++v) {
            this.L0(s + metadata0.e(v));
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void R(EventTime analyticsListener$EventTime0, boolean z) {
        this.K0(analyticsListener$EventTime0, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void S(EventTime analyticsListener$EventTime0, PlaybackException playbackException0) {
        this.N0(analyticsListener$EventTime0, "playerFailed", playbackException0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void T(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void U(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
        this.J0(analyticsListener$EventTime0, "videoDisabled");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void V(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void W(EventTime analyticsListener$EventTime0, AudioAttributes audioAttributes0) {
        this.K0(analyticsListener$EventTime0, "audioAttributes", audioAttributes0.a + "," + audioAttributes0.b + "," + audioAttributes0.c + "," + audioAttributes0.d);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void X(EventTime analyticsListener$EventTime0, int v) {
        int v1 = analyticsListener$EventTime0.b.m();
        int v2 = analyticsListener$EventTime0.b.v();
        this.L0("timeline [" + this.z0(analyticsListener$EventTime0) + ", periodCount=" + v1 + ", windowCount=" + v2 + ", reason=" + EventLogger.H0(v));
        for(int v4 = 0; v4 < Math.min(v1, 3); ++v4) {
            analyticsListener$EventTime0.b.j(v4, this.o0);
            this.L0("  period [" + EventLogger.G0(this.o0.m()) + "]");
        }
        if(v1 > 3) {
            this.L0("  ...");
        }
        for(int v3 = 0; v3 < Math.min(v2, 3); ++v3) {
            analyticsListener$EventTime0.b.t(v3, this.n0);
            this.L0("  window [" + EventLogger.G0(this.n0.e()) + ", seekable=" + this.n0.h + ", dynamic=" + this.n0.i + "]");
        }
        if(v2 > 3) {
            this.L0("  ...");
        }
        this.L0("]");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void Y(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
        this.J0(analyticsListener$EventTime0, "audioDisabled");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Z(EventTime analyticsListener$EventTime0) {
    }

    private static String a(AudioTrackConfig audioSink$AudioTrackConfig0) {
        return audioSink$AudioTrackConfig0.a + "," + audioSink$AudioTrackConfig0.c + "," + audioSink$AudioTrackConfig0.b + "," + audioSink$AudioTrackConfig0.d + "," + audioSink$AudioTrackConfig0.e + "," + audioSink$AudioTrackConfig0.f;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void a0(EventTime analyticsListener$EventTime0, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("reason=");
        stringBuilder0.append(EventLogger.E(v));
        stringBuilder0.append(", PositionInfo:old [");
        stringBuilder0.append("mediaItem=");
        stringBuilder0.append(player$PositionInfo0.c);
        stringBuilder0.append(", period=");
        stringBuilder0.append(player$PositionInfo0.f);
        stringBuilder0.append(", pos=");
        stringBuilder0.append(player$PositionInfo0.g);
        if(player$PositionInfo0.i != -1) {
            stringBuilder0.append(", contentPos=");
            stringBuilder0.append(player$PositionInfo0.h);
            stringBuilder0.append(", adGroup=");
            stringBuilder0.append(player$PositionInfo0.i);
            stringBuilder0.append(", ad=");
            stringBuilder0.append(player$PositionInfo0.j);
        }
        stringBuilder0.append("], PositionInfo:new [");
        stringBuilder0.append("mediaItem=");
        stringBuilder0.append(player$PositionInfo1.c);
        stringBuilder0.append(", period=");
        stringBuilder0.append(player$PositionInfo1.f);
        stringBuilder0.append(", pos=");
        stringBuilder0.append(player$PositionInfo1.g);
        if(player$PositionInfo1.i != -1) {
            stringBuilder0.append(", contentPos=");
            stringBuilder0.append(player$PositionInfo1.h);
            stringBuilder0.append(", adGroup=");
            stringBuilder0.append(player$PositionInfo1.i);
            stringBuilder0.append(", ad=");
            stringBuilder0.append(player$PositionInfo1.j);
        }
        stringBuilder0.append("]");
        this.K0(analyticsListener$EventTime0, "positionDiscontinuity", stringBuilder0.toString());
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void b(EventTime analyticsListener$EventTime0, boolean z) {
        this.K0(analyticsListener$EventTime0, "isPlaying", Boolean.toString(z));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void b0(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
        this.J0(analyticsListener$EventTime0, "videoEnabled");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void c(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void c0(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void d(EventTime analyticsListener$EventTime0, boolean z, int v) {
        this.K0(analyticsListener$EventTime0, "playWhenReady", z + ", " + EventLogger.C0(v));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void d0(EventTime analyticsListener$EventTime0, float f) {
        this.K0(analyticsListener$EventTime0, "volume", Float.toString(f));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void e(EventTime analyticsListener$EventTime0) {
        this.J0(analyticsListener$EventTime0, "drmSessionReleased");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void e0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
        this.P0(analyticsListener$EventTime0, "loadError", iOException0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void f(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void f0(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void g(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void g0(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
        this.M0(analyticsListener$EventTime0, "audioTrackUnderrun", v + ", " + v1 + ", " + v2, null);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void h(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void h0(EventTime analyticsListener$EventTime0, String s, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void i(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
        this.K0(analyticsListener$EventTime0, "audioDecoderInitialized", s);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void i0(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
        this.K0(analyticsListener$EventTime0, "audioTrackInit", EventLogger.a(audioSink$AudioTrackConfig0));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void j(EventTime analyticsListener$EventTime0, TrackSelectionParameters trackSelectionParameters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void j0(EventTime analyticsListener$EventTime0, String s) {
        this.K0(analyticsListener$EventTime0, "audioDecoderReleased", s);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void k(EventTime analyticsListener$EventTime0, Exception exception0) {
        this.P0(analyticsListener$EventTime0, "drmSessionManagerError", exception0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void k0(EventTime analyticsListener$EventTime0, String s) {
        this.K0(analyticsListener$EventTime0, "videoDecoderReleased", s);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void l(EventTime analyticsListener$EventTime0, @Nullable MediaItem mediaItem0, int v) {
        this.L0("mediaItem [" + this.z0(analyticsListener$EventTime0) + ", reason=" + EventLogger.B0(v) + "]");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void l0(EventTime analyticsListener$EventTime0) {
        this.J0(analyticsListener$EventTime0, "drmKeysRemoved");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void m(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
        this.J0(analyticsListener$EventTime0, "audioEnabled");
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void m0(EventTime analyticsListener$EventTime0, int v, int v1, int v2, float f) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void n(EventTime analyticsListener$EventTime0, int v, int v1) {
        this.K0(analyticsListener$EventTime0, "surfaceSize", v + ", " + v1);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void n0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void o(EventTime analyticsListener$EventTime0, int v) {
        this.K0(analyticsListener$EventTime0, "drmSessionAcquired", "state=" + v);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void o0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void p(EventTime analyticsListener$EventTime0, Commands player$Commands0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void p0(EventTime analyticsListener$EventTime0, boolean z, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void q(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void q0(EventTime analyticsListener$EventTime0, PlaybackException playbackException0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void r(EventTime analyticsListener$EventTime0, boolean z) {
        this.K0(analyticsListener$EventTime0, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void r0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void s(EventTime analyticsListener$EventTime0, int v) {
        this.K0(analyticsListener$EventTime0, "state", EventLogger.F0(v));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void s0(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void t(EventTime analyticsListener$EventTime0, int v) {
        this.K0(analyticsListener$EventTime0, "audioSessionId", Integer.toString(v));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void t0(EventTime analyticsListener$EventTime0, int v) {
        this.K0(analyticsListener$EventTime0, "repeatMode", EventLogger.E0(v));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void u(EventTime analyticsListener$EventTime0, Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
        this.K0(analyticsListener$EventTime0, "audioInputFormat", Format.l(format0));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void u0(EventTime analyticsListener$EventTime0, CueGroup cueGroup0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void v(EventTime analyticsListener$EventTime0, PlaybackParameters playbackParameters0) {
        this.K0(analyticsListener$EventTime0, "playbackParameters", playbackParameters0.toString());
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void v0(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
        this.K0(analyticsListener$EventTime0, "videoDecoderInitialized", s);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void w(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
        this.K0(analyticsListener$EventTime0, "audioTrackReleased", EventLogger.a(audioSink$AudioTrackConfig0));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void w0(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void x(EventTime analyticsListener$EventTime0, int v) {
        this.K0(analyticsListener$EventTime0, "playbackSuppressionReason", EventLogger.D0(v));
    }

    private String x0(EventTime analyticsListener$EventTime0, String s, @Nullable String s1, @Nullable Throwable throwable0) {
        String s2 = s + " [" + this.z0(analyticsListener$EventTime0);
        if(throwable0 instanceof PlaybackException) {
            s2 = s2 + ", errorCode=" + ((PlaybackException)throwable0).f();
        }
        if(s1 != null) {
            s2 = s2 + ", " + s1;
        }
        String s3 = Log.g(throwable0);
        if(!TextUtils.isEmpty(s3)) {
            s2 = s2 + "\n  " + s3.replace("\n", "\n  ") + '\n';
        }
        return s2 + "]";
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void y(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
        this.K0(analyticsListener$EventTime0, "upstreamDiscarded", Format.l(mediaLoadData0.c));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void y0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void z(EventTime analyticsListener$EventTime0, boolean z) {
    }

    private String z0(EventTime analyticsListener$EventTime0) {
        String s = "window=" + analyticsListener$EventTime0.c;
        if(analyticsListener$EventTime0.d != null) {
            s = s + ", period=" + analyticsListener$EventTime0.b.f(analyticsListener$EventTime0.d.a);
            if(analyticsListener$EventTime0.d.c()) {
                s = s + ", adGroup=" + analyticsListener$EventTime0.d.b + ", ad=" + analyticsListener$EventTime0.d.c;
            }
        }
        return "eventTime=" + EventLogger.G0(analyticsListener$EventTime0.a - this.p0) + ", mediaPos=" + EventLogger.G0(analyticsListener$EventTime0.e) + ", " + s;
    }
}

