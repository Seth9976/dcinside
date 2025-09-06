package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
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
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.base.B;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

public interface AnalyticsListener {
    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface EventFlags {
    }

    @UnstableApi
    public static final class EventTime {
        public final long a;
        public final Timeline b;
        public final int c;
        @Nullable
        public final MediaPeriodId d;
        public final long e;
        public final Timeline f;
        public final int g;
        @Nullable
        public final MediaPeriodId h;
        public final long i;
        public final long j;

        public EventTime(long v, Timeline timeline0, int v1, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, long v2, Timeline timeline1, int v3, @Nullable MediaPeriodId mediaSource$MediaPeriodId1, long v4, long v5) {
            this.a = v;
            this.b = timeline0;
            this.c = v1;
            this.d = mediaSource$MediaPeriodId0;
            this.e = v2;
            this.f = timeline1;
            this.g = v3;
            this.h = mediaSource$MediaPeriodId1;
            this.i = v4;
            this.j = v5;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return EventTime.class == class0 && (this.a == ((EventTime)object0).a && this.c == ((EventTime)object0).c && this.e == ((EventTime)object0).e && this.g == ((EventTime)object0).g && this.i == ((EventTime)object0).i && this.j == ((EventTime)object0).j && B.a(this.b, ((EventTime)object0).b) && B.a(this.d, ((EventTime)object0).d) && B.a(this.f, ((EventTime)object0).f) && B.a(this.h, ((EventTime)object0).h));
            }
            return false;
        }

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
        }
    }

    @UnstableApi
    public static final class Events {
        private final FlagSet a;
        private final SparseArray b;

        public Events(FlagSet flagSet0, SparseArray sparseArray0) {
            this.a = flagSet0;
            SparseArray sparseArray1 = new SparseArray(flagSet0.d());
            for(int v = 0; v < flagSet0.d(); ++v) {
                int v1 = flagSet0.c(v);
                sparseArray1.append(v1, ((EventTime)Assertions.g(((EventTime)sparseArray0.get(v1)))));
            }
            this.b = sparseArray1;
        }

        public boolean a(int v) {
            return this.a.a(v);
        }

        public boolean b(int[] arr_v) {
            return this.a.b(arr_v);
        }

        public int c(int v) {
            return this.a.c(v);
        }

        public EventTime d(int v) {
            return (EventTime)Assertions.g(((EventTime)this.b.get(v)));
        }

        public int e() {
            return this.a.d();
        }
    }

    @UnstableApi
    public static final int A = 26;
    @UnstableApi
    public static final int B = 28;
    @UnstableApi
    public static final int C = 27;
    @UnstableApi
    public static final int D = 29;
    @UnstableApi
    public static final int E = 30;
    @UnstableApi
    public static final int F = 1000;
    @UnstableApi
    public static final int G = 1001;
    @UnstableApi
    public static final int H = 1002;
    @UnstableApi
    public static final int I = 1003;
    @UnstableApi
    public static final int J = 1004;
    @UnstableApi
    public static final int K = 1005;
    @UnstableApi
    public static final int L = 1006;
    @UnstableApi
    public static final int M = 1007;
    @UnstableApi
    public static final int N = 0x3F0;
    @UnstableApi
    public static final int O = 1009;
    @UnstableApi
    public static final int P = 1010;
    @UnstableApi
    public static final int Q = 0x3F3;
    @UnstableApi
    public static final int R = 0x3F4;
    @UnstableApi
    public static final int S = 0x3F5;
    @UnstableApi
    public static final int T = 0x3F6;
    @UnstableApi
    public static final int U = 0x3F7;
    @UnstableApi
    public static final int V = 0x3F8;
    @UnstableApi
    public static final int W = 0x3F9;
    @UnstableApi
    public static final int X = 0x3FA;
    @UnstableApi
    public static final int Y = 0x3FB;
    @UnstableApi
    public static final int Z = 1020;
    @UnstableApi
    public static final int a = 0;
    @UnstableApi
    public static final int a0 = 0x3FD;
    @UnstableApi
    public static final int b = 1;
    @UnstableApi
    public static final int b0 = 0x3FE;
    @UnstableApi
    public static final int c = 2;
    @UnstableApi
    public static final int c0 = 0x3FF;
    @UnstableApi
    public static final int d = 3;
    @UnstableApi
    public static final int d0 = 0x400;
    @UnstableApi
    public static final int e = 4;
    @UnstableApi
    public static final int e0 = 0x401;
    @UnstableApi
    public static final int f = 5;
    @UnstableApi
    public static final int f0 = 0x402;
    @UnstableApi
    public static final int g = 6;
    @UnstableApi
    public static final int g0 = 0x403;
    @UnstableApi
    public static final int h = 7;
    @UnstableApi
    public static final int h0 = 0x404;
    @UnstableApi
    public static final int i = 8;
    @UnstableApi
    public static final int i0 = 0x405;
    @UnstableApi
    public static final int j = 9;
    @UnstableApi
    public static final int j0 = 1030;
    @UnstableApi
    public static final int k = 10;
    @UnstableApi
    public static final int k0 = 0x407;
    @UnstableApi
    public static final int l = 11;
    @UnstableApi
    public static final int l0 = 0x408;
    @UnstableApi
    public static final int m = 12;
    @UnstableApi
    public static final int n = 13;
    @UnstableApi
    public static final int o = 14;
    @UnstableApi
    public static final int p = 15;
    @UnstableApi
    public static final int q = 16;
    @UnstableApi
    public static final int r = 17;
    @UnstableApi
    public static final int s = 18;
    @UnstableApi
    public static final int t = 19;
    @UnstableApi
    public static final int u = 20;
    @UnstableApi
    public static final int v = 21;
    @UnstableApi
    public static final int w = 22;
    @UnstableApi
    public static final int x = 23;
    @UnstableApi
    public static final int y = 24;
    @UnstableApi
    public static final int z = 25;

    @UnstableApi
    void A(EventTime arg1, int arg2, long arg3);

    @UnstableApi
    void A0(EventTime arg1, Format arg2, @Nullable DecoderReuseEvaluation arg3);

    @UnstableApi
    @Deprecated
    void B(EventTime arg1, String arg2, long arg3);

    @UnstableApi
    void C(EventTime arg1);

    @UnstableApi
    void D(EventTime arg1, Tracks arg2);

    @UnstableApi
    void F(EventTime arg1, VideoSize arg2);

    @UnstableApi
    void G(EventTime arg1, long arg2);

    @UnstableApi
    void H(EventTime arg1, long arg2, int arg3);

    @UnstableApi
    void I(EventTime arg1, MediaLoadData arg2);

    @UnstableApi
    void J(Player arg1, Events arg2);

    @UnstableApi
    void K(EventTime arg1, DeviceInfo arg2);

    @UnstableApi
    void L(EventTime arg1);

    @UnstableApi
    void M(EventTime arg1, Object arg2, long arg3);

    @UnstableApi
    void N(EventTime arg1, boolean arg2);

    @UnstableApi
    void O(EventTime arg1, int arg2, boolean arg3);

    @UnstableApi
    void P(EventTime arg1, Metadata arg2);

    @UnstableApi
    @Deprecated
    void Q(EventTime arg1, List arg2);

    @UnstableApi
    void R(EventTime arg1, boolean arg2);

    @UnstableApi
    void S(EventTime arg1, PlaybackException arg2);

    @UnstableApi
    void T(EventTime arg1, long arg2);

    @UnstableApi
    void U(EventTime arg1, DecoderCounters arg2);

    @UnstableApi
    void V(EventTime arg1, MediaMetadata arg2);

    @UnstableApi
    void W(EventTime arg1, AudioAttributes arg2);

    @UnstableApi
    void X(EventTime arg1, int arg2);

    @UnstableApi
    void Y(EventTime arg1, DecoderCounters arg2);

    @UnstableApi
    void Z(EventTime arg1);

    @UnstableApi
    void a0(EventTime arg1, PositionInfo arg2, PositionInfo arg3, int arg4);

    @UnstableApi
    void b(EventTime arg1, boolean arg2);

    @UnstableApi
    void b0(EventTime arg1, DecoderCounters arg2);

    @UnstableApi
    @Deprecated
    void c(EventTime arg1, int arg2);

    @UnstableApi
    void c0(EventTime arg1, Exception arg2);

    @UnstableApi
    void d(EventTime arg1, boolean arg2, int arg3);

    @UnstableApi
    void d0(EventTime arg1, float arg2);

    @UnstableApi
    void e(EventTime arg1);

    @UnstableApi
    void e0(EventTime arg1, LoadEventInfo arg2, MediaLoadData arg3, IOException arg4, boolean arg5);

    @UnstableApi
    void f(EventTime arg1, int arg2, long arg3, long arg4);

    @UnstableApi
    void f0(EventTime arg1, long arg2);

    @UnstableApi
    void g(EventTime arg1, Exception arg2);

    @UnstableApi
    void g0(EventTime arg1, int arg2, long arg3, long arg4);

    @UnstableApi
    void h(EventTime arg1, LoadEventInfo arg2, MediaLoadData arg3);

    @UnstableApi
    @Deprecated
    void h0(EventTime arg1, String arg2, long arg3);

    @UnstableApi
    void i(EventTime arg1, String arg2, long arg3, long arg4);

    @UnstableApi
    void i0(EventTime arg1, AudioTrackConfig arg2);

    @UnstableApi
    void j(EventTime arg1, TrackSelectionParameters arg2);

    @UnstableApi
    void j0(EventTime arg1, String arg2);

    @UnstableApi
    void k(EventTime arg1, Exception arg2);

    @UnstableApi
    void k0(EventTime arg1, String arg2);

    @UnstableApi
    void l(EventTime arg1, @Nullable MediaItem arg2, int arg3);

    @UnstableApi
    void l0(EventTime arg1);

    @UnstableApi
    void m(EventTime arg1, DecoderCounters arg2);

    @UnstableApi
    @Deprecated
    void m0(EventTime arg1, int arg2, int arg3, int arg4, float arg5);

    @UnstableApi
    void n(EventTime arg1, int arg2, int arg3);

    @UnstableApi
    @Deprecated
    void n0(EventTime arg1);

    @UnstableApi
    void o(EventTime arg1, int arg2);

    @UnstableApi
    void o0(EventTime arg1, LoadEventInfo arg2, MediaLoadData arg3);

    @UnstableApi
    void p(EventTime arg1, Commands arg2);

    @UnstableApi
    @Deprecated
    void p0(EventTime arg1, boolean arg2, int arg3);

    @UnstableApi
    void q(EventTime arg1, Exception arg2);

    @UnstableApi
    void q0(EventTime arg1, @Nullable PlaybackException arg2);

    @UnstableApi
    void r(EventTime arg1, boolean arg2);

    @UnstableApi
    @Deprecated
    void r0(EventTime arg1);

    @UnstableApi
    void s(EventTime arg1, int arg2);

    @UnstableApi
    void s0(EventTime arg1, long arg2);

    @UnstableApi
    void t(EventTime arg1, int arg2);

    @UnstableApi
    void t0(EventTime arg1, int arg2);

    @UnstableApi
    void u(EventTime arg1, Format arg2, @Nullable DecoderReuseEvaluation arg3);

    @UnstableApi
    void u0(EventTime arg1, CueGroup arg2);

    @UnstableApi
    void v(EventTime arg1, PlaybackParameters arg2);

    @UnstableApi
    void v0(EventTime arg1, String arg2, long arg3, long arg4);

    @UnstableApi
    void w(EventTime arg1, AudioTrackConfig arg2);

    @UnstableApi
    void w0(EventTime arg1, MediaMetadata arg2);

    @UnstableApi
    void x(EventTime arg1, int arg2);

    @UnstableApi
    void y(EventTime arg1, MediaLoadData arg2);

    @UnstableApi
    void y0(EventTime arg1, LoadEventInfo arg2, MediaLoadData arg3);

    @UnstableApi
    @Deprecated
    void z(EventTime arg1, boolean arg2);
}

