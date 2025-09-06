package androidx.media3.exoplayer.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent.Builder;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks.Group;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.FileDataSource.FileDataSourceException;
import androidx.media3.datasource.HttpDataSource.HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource.InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource.UdpDataSourceException;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.audio.AudioSink.InitializationException;
import androidx.media3.exoplayer.audio.AudioSink.WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession.DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.collect.O2;
import com.google.common.collect.u5;
import h4.e;
import h4.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@RequiresApi(0x1F)
@UnstableApi
public final class MediaMetricsListener implements AnalyticsListener, Listener {
    static final class ErrorInfo {
        public final int a;
        public final int b;

        public ErrorInfo(int v, int v1) {
            this.a = v;
            this.b = v1;
        }
    }

    static final class PendingFormatUpdate {
        public final Format a;
        public final int b;
        public final String c;

        public PendingFormatUpdate(Format format0, int v, String s) {
            this.a = format0;
            this.b = v;
            this.c = s;
        }
    }

    @Nullable
    private PendingFormatUpdate A0;
    @Nullable
    private PendingFormatUpdate B0;
    @Nullable
    private PendingFormatUpdate C0;
    @Nullable
    private Format D0;
    @Nullable
    private Format E0;
    @Nullable
    private Format F0;
    private boolean G0;
    private int H0;
    private boolean I0;
    private int J0;
    private int K0;
    private int L0;
    private boolean M0;
    private final Context m0;
    private final PlaybackSessionManager n0;
    private final PlaybackSession o0;
    private final long p0;
    private final Window q0;
    private final Period r0;
    private final HashMap s0;
    private final HashMap t0;
    @Nullable
    private String u0;
    @Nullable
    private PlaybackMetrics.Builder v0;
    private int w0;
    private int x0;
    private int y0;
    @Nullable
    private PlaybackException z0;

    private MediaMetricsListener(Context context0, PlaybackSession playbackSession0) {
        this.m0 = context0.getApplicationContext();
        this.o0 = playbackSession0;
        this.q0 = new Window();
        this.r0 = new Period();
        this.t0 = new HashMap();
        this.s0 = new HashMap();
        this.p0 = SystemClock.elapsedRealtime();
        this.x0 = 0;
        this.y0 = 0;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager0 = new DefaultPlaybackSessionManager();
        this.n0 = defaultPlaybackSessionManager0;
        defaultPlaybackSessionManager0.b(this);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void A(EventTime analyticsListener$EventTime0, int v, long v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void A0(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void B(EventTime analyticsListener$EventTime0, String s, long v) {
    }

    @e(expression = {"#1"}, result = true)
    private boolean B0(@Nullable PendingFormatUpdate mediaMetricsListener$PendingFormatUpdate0) {
        if(mediaMetricsListener$PendingFormatUpdate0 != null) {
            String s = this.n0.d();
            return mediaMetricsListener$PendingFormatUpdate0.c.equals(s);
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void C(EventTime analyticsListener$EventTime0) {
    }

    @Nullable
    public static MediaMetricsListener C0(Context context0) {
        MediaMetricsManager mediaMetricsManager0 = X0.a(context0.getSystemService("media_metrics"));
        return mediaMetricsManager0 == null ? null : new MediaMetricsListener(context0, mediaMetricsManager0.createPlaybackSession());
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void D(EventTime analyticsListener$EventTime0, Tracks tracks0) {
    }

    private void D0() {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.v0;
        if(playbackMetrics$Builder0 != null && this.M0) {
            playbackMetrics$Builder0.setAudioUnderrunCount(this.L0);
            this.v0.setVideoFramesDropped(this.J0);
            this.v0.setVideoFramesPlayed(this.K0);
            Long long0 = (Long)this.s0.get(this.u0);
            this.v0.setNetworkTransferDurationMillis((long0 == null ? 0L : ((long)long0)));
            Long long1 = (Long)this.t0.get(this.u0);
            this.v0.setNetworkBytesRead((long1 == null ? 0L : ((long)long1)));
            this.v0.setStreamSource((long1 == null || ((long)long1) <= 0L ? 0 : 1));
            PlaybackMetrics playbackMetrics0 = this.v0.build();
            this.o0.reportPlaybackMetrics(playbackMetrics0);
        }
        this.v0 = null;
        this.u0 = null;
        this.L0 = 0;
        this.J0 = 0;
        this.K0 = 0;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.M0 = false;
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void E(EventTime analyticsListener$EventTime0, String s, boolean z) {
        if((analyticsListener$EventTime0.d == null || !analyticsListener$EventTime0.d.c()) && s.equals(this.u0)) {
            this.D0();
        }
        this.s0.remove(s);
        this.t0.remove(s);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int E0(int v) {
        switch(Util.q0(v)) {
            case 6002: {
                return 24;
            }
            case 6003: {
                return 28;
            }
            case 6004: {
                return 25;
            }
            case 6005: {
                return 26;
            }
            default: {
                return 27;
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void F(EventTime analyticsListener$EventTime0, VideoSize videoSize0) {
        PendingFormatUpdate mediaMetricsListener$PendingFormatUpdate0 = this.A0;
        if(mediaMetricsListener$PendingFormatUpdate0 != null) {
            Format format0 = mediaMetricsListener$PendingFormatUpdate0.a;
            if(format0.u == -1) {
                this.A0 = new PendingFormatUpdate(format0.a().v0(videoSize0.a).Y(videoSize0.b).K(), mediaMetricsListener$PendingFormatUpdate0.b, mediaMetricsListener$PendingFormatUpdate0.c);
            }
        }
    }

    @Nullable
    private static DrmInitData F0(O2 o20) {
        u5 u50 = o20.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            Group tracks$Group0 = (Group)object0;
            for(int v = 0; v < tracks$Group0.a; ++v) {
                if(tracks$Group0.k(v)) {
                    DrmInitData drmInitData0 = tracks$Group0.d(v).r;
                    if(drmInitData0 != null) {
                        return drmInitData0;
                    }
                }
            }
        }
        return null;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void G(EventTime analyticsListener$EventTime0, long v) {
    }

    private static int G0(DrmInitData drmInitData0) {
        for(int v = 0; v < drmInitData0.d; ++v) {
            UUID uUID0 = drmInitData0.s(v).b;
            if(uUID0.equals(C.j2)) {
                return 3;
            }
            if(uUID0.equals(C.k2)) {
                return 2;
            }
            if(uUID0.equals(C.i2)) {
                return 6;
            }
        }
        return 1;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void H(EventTime analyticsListener$EventTime0, long v, int v1) {
    }

    private static ErrorInfo H0(PlaybackException playbackException0, Context context0, boolean z) {
        int v;
        boolean z1;
        if(playbackException0.a == 1001) {
            return new ErrorInfo(20, 0);
        }
        if(playbackException0 instanceof ExoPlaybackException) {
            z1 = ((ExoPlaybackException)playbackException0).e9 == 1;
            v = ((ExoPlaybackException)playbackException0).i9;
        }
        else {
            v = 0;
            z1 = false;
        }
        Throwable throwable0 = (Throwable)Assertions.g(playbackException0.getCause());
        if(throwable0 instanceof IOException) {
            if(throwable0 instanceof InvalidResponseCodeException) {
                return new ErrorInfo(5, ((InvalidResponseCodeException)throwable0).h);
            }
            if(!(throwable0 instanceof InvalidContentTypeException) && !(throwable0 instanceof ParserException)) {
                if(!(throwable0 instanceof HttpDataSourceException) && !(throwable0 instanceof UdpDataSourceException)) {
                    if(playbackException0.a == 1002) {
                        return new ErrorInfo(21, 0);
                    }
                    if(throwable0 instanceof DrmSessionException) {
                        Throwable throwable1 = (Throwable)Assertions.g(throwable0.getCause());
                        int v1 = Util.a;
                        if(v1 >= 21 && throwable1 instanceof MediaDrm.MediaDrmStateException) {
                            int v2 = Util.r0(((MediaDrm.MediaDrmStateException)throwable1).getDiagnosticInfo());
                            return new ErrorInfo(MediaMetricsListener.E0(v2), v2);
                        }
                        if(v1 >= 23 && W0.a(throwable1)) {
                            return new ErrorInfo(27, 0);
                        }
                        if(throwable1 instanceof NotProvisionedException) {
                            return new ErrorInfo(24, 0);
                        }
                        if(throwable1 instanceof DeniedByServerException) {
                            return new ErrorInfo(29, 0);
                        }
                        if(throwable1 instanceof UnsupportedDrmException) {
                            return new ErrorInfo(23, 0);
                        }
                        return throwable1 instanceof MissingSchemeDataException ? new ErrorInfo(28, 0) : new ErrorInfo(30, 0);
                    }
                    if(throwable0 instanceof FileDataSourceException && throwable0.getCause() instanceof FileNotFoundException) {
                        Throwable throwable2 = ((Throwable)Assertions.g(throwable0.getCause())).getCause();
                        return Util.a < 21 || !(throwable2 instanceof ErrnoException) || ((ErrnoException)throwable2).errno != OsConstants.EACCES ? new ErrorInfo(0x1F, 0) : new ErrorInfo(0x20, 0);
                    }
                    return new ErrorInfo(9, 0);
                }
                if(NetworkTypeObserver.d(context0).f() == 1) {
                    return new ErrorInfo(3, 0);
                }
                Throwable throwable3 = throwable0.getCause();
                if(throwable3 instanceof UnknownHostException) {
                    return new ErrorInfo(6, 0);
                }
                if(throwable3 instanceof SocketTimeoutException) {
                    return new ErrorInfo(7, 0);
                }
                return !(throwable0 instanceof HttpDataSourceException) || ((HttpDataSourceException)throwable0).d != 1 ? new ErrorInfo(8, 0) : new ErrorInfo(4, 0);
            }
            return z ? new ErrorInfo(10, 0) : new ErrorInfo(11, 0);
        }
        if(z1 && (v == 0 || v == 1)) {
            return new ErrorInfo(35, 0);
        }
        if(z1 && v == 3) {
            return new ErrorInfo(15, 0);
        }
        if(z1 && v == 2) {
            return new ErrorInfo(23, 0);
        }
        if(throwable0 instanceof DecoderInitializationException) {
            return new ErrorInfo(13, Util.r0(((DecoderInitializationException)throwable0).d));
        }
        if(throwable0 instanceof MediaCodecDecoderException) {
            return new ErrorInfo(14, ((MediaCodecDecoderException)throwable0).c);
        }
        if(throwable0 instanceof OutOfMemoryError) {
            return new ErrorInfo(14, 0);
        }
        if(throwable0 instanceof InitializationException) {
            return new ErrorInfo(17, ((InitializationException)throwable0).a);
        }
        if(throwable0 instanceof WriteException) {
            return new ErrorInfo(18, ((WriteException)throwable0).a);
        }
        if(throwable0 instanceof MediaCodec.CryptoException) {
            int v3 = ((MediaCodec.CryptoException)throwable0).getErrorCode();
            return new ErrorInfo(MediaMetricsListener.E0(v3), v3);
        }
        return new ErrorInfo(22, 0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void I(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
        if(analyticsListener$EventTime0.d == null) {
            return;
        }
        Format format0 = (Format)Assertions.g(mediaLoadData0.c);
        MediaPeriodId mediaSource$MediaPeriodId0 = (MediaPeriodId)Assertions.g(analyticsListener$EventTime0.d);
        String s = this.n0.e(analyticsListener$EventTime0.b, mediaSource$MediaPeriodId0);
        PendingFormatUpdate mediaMetricsListener$PendingFormatUpdate0 = new PendingFormatUpdate(format0, mediaLoadData0.d, s);
        switch(mediaLoadData0.b) {
            case 1: {
                this.B0 = mediaMetricsListener$PendingFormatUpdate0;
                return;
            }
            case 0: 
            case 2: {
                this.A0 = mediaMetricsListener$PendingFormatUpdate0;
                return;
            }
            case 3: {
                this.C0 = mediaMetricsListener$PendingFormatUpdate0;
            }
        }
    }

    private static Pair I0(String s) {
        String[] arr_s = Util.m2(s, "-");
        String s1 = arr_s[0];
        return arr_s.length < 2 ? Pair.create(s1, null) : Pair.create(s1, arr_s[1]);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void J(Player player0, Events analyticsListener$Events0) {
        if(analyticsListener$Events0.e() == 0) {
            return;
        }
        this.N0(analyticsListener$Events0);
        long v = SystemClock.elapsedRealtime();
        this.T0(player0, analyticsListener$Events0);
        this.P0(v);
        this.R0(player0, analyticsListener$Events0, v);
        this.O0(v);
        this.Q0(player0, analyticsListener$Events0, v);
        if(analyticsListener$Events0.a(0x404)) {
            EventTime analyticsListener$EventTime0 = analyticsListener$Events0.d(0x404);
            this.n0.h(analyticsListener$EventTime0);
        }
    }

    public LogSessionId J0() {
        return this.o0.getSessionId();
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void K(EventTime analyticsListener$EventTime0, DeviceInfo deviceInfo0) {
    }

    private static int K0(Context context0) {
        switch(NetworkTypeObserver.d(context0).f()) {
            case 0: {
                return 0;
            }
            case 1: {
                return 9;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 7: {
                return 3;
            }
            case 9: {
                return 8;
            }
            case 10: {
                return 7;
            }
            default: {
                return 1;
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void L(EventTime analyticsListener$EventTime0) {
    }

    private static int L0(MediaItem mediaItem0) {
        LocalConfiguration mediaItem$LocalConfiguration0 = mediaItem0.b;
        if(mediaItem$LocalConfiguration0 == null) {
            return 0;
        }
        switch(Util.Y0(mediaItem$LocalConfiguration0.a, mediaItem$LocalConfiguration0.b)) {
            case 0: {
                return 3;
            }
            case 1: {
                return 5;
            }
            case 2: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void M(EventTime analyticsListener$EventTime0, Object object0, long v) {
    }

    private static int M0(int v) {
        if(v != 1) {
            switch(v) {
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void N(EventTime analyticsListener$EventTime0, boolean z) {
    }

    private void N0(Events analyticsListener$Events0) {
        for(int v = 0; v < analyticsListener$Events0.e(); ++v) {
            int v1 = analyticsListener$Events0.c(v);
            EventTime analyticsListener$EventTime0 = analyticsListener$Events0.d(v1);
            if(v1 == 0) {
                this.n0.g(analyticsListener$EventTime0);
            }
            else if(v1 == 11) {
                this.n0.c(analyticsListener$EventTime0, this.w0);
            }
            else {
                this.n0.a(analyticsListener$EventTime0);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void O(EventTime analyticsListener$EventTime0, int v, boolean z) {
    }

    private void O0(long v) {
        int v1 = MediaMetricsListener.K0(this.m0);
        if(v1 != this.y0) {
            this.y0 = v1;
            NetworkEvent networkEvent0 = p1.a().setNetworkType(v1).setTimeSinceCreatedMillis(v - this.p0).build();
            this.o0.reportNetworkEvent(networkEvent0);
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void P(EventTime analyticsListener$EventTime0, Metadata metadata0) {
    }

    private void P0(long v) {
        PlaybackException playbackException0 = this.z0;
        if(playbackException0 == null) {
            return;
        }
        ErrorInfo mediaMetricsListener$ErrorInfo0 = MediaMetricsListener.H0(playbackException0, this.m0, this.H0 == 4);
        PlaybackErrorEvent playbackErrorEvent0 = r1.a().setTimeSinceCreatedMillis(v - this.p0).setErrorCode(mediaMetricsListener$ErrorInfo0.a).setSubErrorCode(mediaMetricsListener$ErrorInfo0.b).setException(playbackException0).build();
        this.o0.reportPlaybackErrorEvent(playbackErrorEvent0);
        this.M0 = true;
        this.z0 = null;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Q(EventTime analyticsListener$EventTime0, List list0) {
    }

    private void Q0(Player player0, Events analyticsListener$Events0, long v) {
        if(player0.b() != 2) {
            this.G0 = false;
        }
        if(player0.f() == null) {
            this.I0 = false;
        }
        else if(analyticsListener$Events0.a(10)) {
            this.I0 = true;
        }
        int v1 = this.Y0(player0);
        if(this.x0 != v1) {
            this.x0 = v1;
            this.M0 = true;
            PlaybackStateEvent playbackStateEvent0 = s1.a().setState(this.x0).setTimeSinceCreatedMillis(v - this.p0).build();
            this.o0.reportPlaybackStateEvent(playbackStateEvent0);
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void R(EventTime analyticsListener$EventTime0, boolean z) {
    }

    private void R0(Player player0, Events analyticsListener$Events0, long v) {
        if(analyticsListener$Events0.a(2)) {
            Tracks tracks0 = player0.r0();
            boolean z = tracks0.e(2);
            boolean z1 = tracks0.e(1);
            boolean z2 = tracks0.e(3);
            if(z || z1 || z2) {
                if(!z) {
                    this.W0(v, null, 0);
                }
                if(!z1) {
                    this.S0(v, null, 0);
                }
                if(!z2) {
                    this.U0(v, null, 0);
                }
            }
        }
        if(this.B0(this.A0)) {
            PendingFormatUpdate mediaMetricsListener$PendingFormatUpdate0 = this.A0;
            Format format0 = mediaMetricsListener$PendingFormatUpdate0.a;
            if(format0.u != -1) {
                this.W0(v, format0, mediaMetricsListener$PendingFormatUpdate0.b);
                this.A0 = null;
            }
        }
        if(this.B0(this.B0)) {
            this.S0(v, this.B0.a, this.B0.b);
            this.B0 = null;
        }
        if(this.B0(this.C0)) {
            this.U0(v, this.C0.a, this.C0.b);
            this.C0 = null;
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void S(EventTime analyticsListener$EventTime0, PlaybackException playbackException0) {
        this.z0 = playbackException0;
    }

    private void S0(long v, @Nullable Format format0, int v1) {
        if(Util.g(this.E0, format0)) {
            return;
        }
        int v2 = this.E0 != null || v1 != 0 ? v1 : 1;
        this.E0 = format0;
        this.X0(0, v, format0, v2);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void T(EventTime analyticsListener$EventTime0, long v) {
    }

    private void T0(Player player0, Events analyticsListener$Events0) {
        if(analyticsListener$Events0.a(0)) {
            EventTime analyticsListener$EventTime0 = analyticsListener$Events0.d(0);
            if(this.v0 != null) {
                this.V0(analyticsListener$EventTime0.b, analyticsListener$EventTime0.d);
            }
        }
        if(analyticsListener$Events0.a(2) && this.v0 != null) {
            DrmInitData drmInitData0 = MediaMetricsListener.F0(player0.r0().c());
            if(drmInitData0 != null) {
                this.v0.setDrmType(MediaMetricsListener.G0(drmInitData0));
            }
        }
        if(analyticsListener$Events0.a(0x3F3)) {
            ++this.L0;
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void U(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
        this.J0 += decoderCounters0.g;
        this.K0 += decoderCounters0.e;
    }

    private void U0(long v, @Nullable Format format0, int v1) {
        if(Util.g(this.F0, format0)) {
            return;
        }
        int v2 = this.F0 != null || v1 != 0 ? v1 : 1;
        this.F0 = format0;
        this.X0(2, v, format0, v2);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void V(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @m({"metricsBuilder"})
    private void V0(Timeline timeline0, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.v0;
        if(mediaSource$MediaPeriodId0 == null) {
            return;
        }
        int v = timeline0.f(mediaSource$MediaPeriodId0.a);
        if(v == -1) {
            return;
        }
        timeline0.j(v, this.r0);
        timeline0.t(this.r0.c, this.q0);
        playbackMetrics$Builder0.setStreamType(MediaMetricsListener.L0(this.q0.c));
        if(this.q0.m != 0x8000000000000001L && !this.q0.k && !this.q0.i && !this.q0.i()) {
            playbackMetrics$Builder0.setMediaDurationMillis(this.q0.e());
        }
        playbackMetrics$Builder0.setPlaybackType((this.q0.i() ? 2 : 1));
        this.M0 = true;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void W(EventTime analyticsListener$EventTime0, AudioAttributes audioAttributes0) {
    }

    private void W0(long v, @Nullable Format format0, int v1) {
        if(Util.g(this.D0, format0)) {
            return;
        }
        int v2 = this.D0 != null || v1 != 0 ? v1 : 1;
        this.D0 = format0;
        this.X0(1, v, format0, v2);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void X(EventTime analyticsListener$EventTime0, int v) {
    }

    private void X0(int v, long v1, @Nullable Format format0, int v2) {
        TrackChangeEvent.Builder trackChangeEvent$Builder0 = n1.a(v).setTimeSinceCreatedMillis(v1 - this.p0);
        if(format0 == null) {
            trackChangeEvent$Builder0.setTrackState(0);
        }
        else {
            trackChangeEvent$Builder0.setTrackState(1);
            trackChangeEvent$Builder0.setTrackChangeReason(MediaMetricsListener.M0(v2));
            String s = format0.m;
            if(s != null) {
                trackChangeEvent$Builder0.setContainerMimeType(s);
            }
            String s1 = format0.n;
            if(s1 != null) {
                trackChangeEvent$Builder0.setSampleMimeType(s1);
            }
            String s2 = format0.j;
            if(s2 != null) {
                trackChangeEvent$Builder0.setCodecName(s2);
            }
            int v3 = format0.i;
            if(v3 != -1) {
                trackChangeEvent$Builder0.setBitrate(v3);
            }
            int v4 = format0.t;
            if(v4 != -1) {
                trackChangeEvent$Builder0.setWidth(v4);
            }
            int v5 = format0.u;
            if(v5 != -1) {
                trackChangeEvent$Builder0.setHeight(v5);
            }
            int v6 = format0.B;
            if(v6 != -1) {
                trackChangeEvent$Builder0.setChannelCount(v6);
            }
            int v7 = format0.C;
            if(v7 != -1) {
                trackChangeEvent$Builder0.setAudioSampleRate(v7);
            }
            String s3 = format0.d;
            if(s3 != null) {
                Pair pair0 = MediaMetricsListener.I0(s3);
                trackChangeEvent$Builder0.setLanguage(((String)pair0.first));
                Object object0 = pair0.second;
                if(object0 != null) {
                    trackChangeEvent$Builder0.setLanguageRegion(((String)object0));
                }
            }
            float f = format0.v;
            if(f != -1.0f) {
                trackChangeEvent$Builder0.setVideoFrameRate(f);
            }
        }
        this.M0 = true;
        TrackChangeEvent trackChangeEvent0 = trackChangeEvent$Builder0.build();
        this.o0.reportTrackChangeEvent(trackChangeEvent0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Y(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    private int Y0(Player player0) {
        int v = player0.b();
        if(this.G0) {
            return 5;
        }
        if(this.I0) {
            return 13;
        }
        switch(v) {
            case 1: {
                return this.x0 == 0 ? this.x0 : 12;
            }
            case 2: {
                if(this.x0 != 0 && this.x0 != 2 && this.x0 != 12) {
                    if(!player0.D0()) {
                        return 7;
                    }
                    return player0.N1() == 0 ? 6 : 10;
                }
                return 2;
            }
            case 3: {
                if(!player0.D0()) {
                    return 4;
                }
                return player0.N1() == 0 ? 3 : 9;
            }
            case 4: {
                return 11;
            }
            default: {
                return this.x0;
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Z(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void a(EventTime analyticsListener$EventTime0, String s, String s1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void a0(EventTime analyticsListener$EventTime0, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
        if(v == 1) {
            this.G0 = true;
        }
        this.w0 = v;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void b(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void b0(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void c(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void c0(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void d(EventTime analyticsListener$EventTime0, boolean z, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void d0(EventTime analyticsListener$EventTime0, float f) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void e(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void e0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
        this.H0 = mediaLoadData0.a;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void f(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
        MediaPeriodId mediaSource$MediaPeriodId0 = analyticsListener$EventTime0.d;
        if(mediaSource$MediaPeriodId0 != null) {
            MediaPeriodId mediaSource$MediaPeriodId1 = (MediaPeriodId)Assertions.g(mediaSource$MediaPeriodId0);
            String s = this.n0.e(analyticsListener$EventTime0.b, mediaSource$MediaPeriodId1);
            Long long0 = (Long)this.t0.get(s);
            Long long1 = (Long)this.s0.get(s);
            long v3 = 0L;
            this.t0.put(s, ((long)((long0 == null ? 0L : ((long)long0)) + v1)));
            HashMap hashMap0 = this.s0;
            if(long1 != null) {
                v3 = (long)long1;
            }
            hashMap0.put(s, ((long)(v3 + ((long)v))));
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void f0(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void g(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void g0(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void h(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void h0(EventTime analyticsListener$EventTime0, String s, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void i(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void i0(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void j(EventTime analyticsListener$EventTime0, TrackSelectionParameters trackSelectionParameters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void j0(EventTime analyticsListener$EventTime0, String s) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void k(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void k0(EventTime analyticsListener$EventTime0, String s) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void l(EventTime analyticsListener$EventTime0, MediaItem mediaItem0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void l0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void m(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void m0(EventTime analyticsListener$EventTime0, int v, int v1, int v2, float f) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void n(EventTime analyticsListener$EventTime0, int v, int v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void n0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void o(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
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
    public void r(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void r0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void s(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void s0(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void t(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void t0(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void u(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void u0(EventTime analyticsListener$EventTime0, CueGroup cueGroup0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void v(EventTime analyticsListener$EventTime0, PlaybackParameters playbackParameters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void v0(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void w(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void w0(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void x(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void x0(EventTime analyticsListener$EventTime0, String s) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void y(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void y0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void z(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void z0(EventTime analyticsListener$EventTime0, String s) {
        if(analyticsListener$EventTime0.d != null && analyticsListener$EventTime0.d.c()) {
            return;
        }
        this.D0();
        this.u0 = s;
        this.v0 = q1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
        this.V0(analyticsListener$EventTime0.b, analyticsListener$EventTime0.d);
    }
}

