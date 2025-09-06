package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
public interface LoadControl {
    public static final class Parameters {
        public final PlayerId a;
        public final Timeline b;
        public final MediaPeriodId c;
        public final long d;
        public final long e;
        public final float f;
        public final boolean g;
        public final boolean h;
        public final long i;

        public Parameters(PlayerId playerId0, Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1, float f, boolean z, boolean z1, long v2) {
            this.a = playerId0;
            this.b = timeline0;
            this.c = mediaSource$MediaPeriodId0;
            this.d = v;
            this.e = v1;
            this.f = f;
            this.g = z;
            this.h = z1;
            this.i = v2;
        }
    }

    @Deprecated
    public static final MediaPeriodId a;

    static {
        LoadControl.a = new MediaPeriodId(new Object());
    }

    @Deprecated
    boolean a();

    @Deprecated
    void b(Renderer[] arg1, TrackGroupArray arg2, ExoTrackSelection[] arg3);

    @Deprecated
    void c();

    void d(PlayerId arg1);

    @Deprecated
    void e(Timeline arg1, MediaPeriodId arg2, Renderer[] arg3, TrackGroupArray arg4, ExoTrackSelection[] arg5);

    boolean f(Parameters arg1);

    void g(PlayerId arg1, Timeline arg2, MediaPeriodId arg3, Renderer[] arg4, TrackGroupArray arg5, ExoTrackSelection[] arg6);

    @Deprecated
    void h();

    @Deprecated
    boolean i(long arg1, long arg2, float arg3);

    long j(PlayerId arg1);

    boolean k(Parameters arg1);

    @Deprecated
    long l();

    @Deprecated
    boolean m(long arg1, float arg2, boolean arg3, long arg4);

    Allocator n();

    @Deprecated
    void o();

    void p(PlayerId arg1);

    void q(PlayerId arg1);

    @Deprecated
    boolean r(Timeline arg1, MediaPeriodId arg2, long arg3, float arg4, boolean arg5, long arg6);

    boolean s(PlayerId arg1);
}

