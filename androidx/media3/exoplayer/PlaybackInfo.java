package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import com.google.common.collect.O2;
import java.util.List;

final class PlaybackInfo {
    public final Timeline a;
    public final MediaPeriodId b;
    public final long c;
    public final long d;
    public final int e;
    @Nullable
    public final ExoPlaybackException f;
    public final boolean g;
    public final TrackGroupArray h;
    public final TrackSelectorResult i;
    public final List j;
    public final MediaPeriodId k;
    public final boolean l;
    public final int m;
    public final int n;
    public final PlaybackParameters o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    private static final MediaPeriodId u;

    static {
        PlaybackInfo.u = new MediaPeriodId(new Object());
    }

    public PlaybackInfo(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1, int v2, @Nullable ExoPlaybackException exoPlaybackException0, boolean z, TrackGroupArray trackGroupArray0, TrackSelectorResult trackSelectorResult0, List list0, MediaPeriodId mediaSource$MediaPeriodId1, boolean z1, int v3, int v4, PlaybackParameters playbackParameters0, long v5, long v6, long v7, long v8, boolean z2) {
        this.a = timeline0;
        this.b = mediaSource$MediaPeriodId0;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = exoPlaybackException0;
        this.g = z;
        this.h = trackGroupArray0;
        this.i = trackSelectorResult0;
        this.j = list0;
        this.k = mediaSource$MediaPeriodId1;
        this.l = z1;
        this.m = v3;
        this.n = v4;
        this.o = playbackParameters0;
        this.q = v5;
        this.r = v6;
        this.s = v7;
        this.t = v8;
        this.p = z2;
    }

    @CheckResult
    public PlaybackInfo a() {
        long v = this.q;
        long v1 = this.r;
        long v2 = this.m();
        long v3 = SystemClock.elapsedRealtime();
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, v, v1, v2, v3, this.p);
    }

    @CheckResult
    public PlaybackInfo b(boolean z) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public PlaybackInfo c(MediaPeriodId mediaSource$MediaPeriodId0) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mediaSource$MediaPeriodId0, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public PlaybackInfo d(MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1, long v2, long v3, TrackGroupArray trackGroupArray0, TrackSelectorResult trackSelectorResult0, List list0) {
        long v4 = this.q;
        long v5 = SystemClock.elapsedRealtime();
        return new PlaybackInfo(this.a, mediaSource$MediaPeriodId0, v1, v2, this.e, this.f, this.g, trackGroupArray0, trackSelectorResult0, list0, this.k, this.l, this.m, this.n, this.o, v4, v3, v, v5, this.p);
    }

    @CheckResult
    public PlaybackInfo e(boolean z, int v, int v1) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, v, v1, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public PlaybackInfo f(@Nullable ExoPlaybackException exoPlaybackException0) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, exoPlaybackException0, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public PlaybackInfo g(PlaybackParameters playbackParameters0) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, playbackParameters0, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public PlaybackInfo h(int v) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, v, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    @CheckResult
    public PlaybackInfo i(boolean z) {
        return new PlaybackInfo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    @CheckResult
    public PlaybackInfo j(Timeline timeline0) {
        return new PlaybackInfo(timeline0, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public static PlaybackInfo k(TrackSelectorResult trackSelectorResult0) {
        return new PlaybackInfo(Timeline.a, PlaybackInfo.u, 0x8000000000000001L, 0L, 1, null, false, TrackGroupArray.e, trackSelectorResult0, O2.A(), PlaybackInfo.u, false, 1, 0, PlaybackParameters.d, 0L, 0L, 0L, 0L, false);
    }

    public static MediaPeriodId l() {
        return PlaybackInfo.u;
    }

    public long m() {
        long v1;
        long v;
        if(!this.n()) {
            return this.s;
        }
        do {
            v = this.t;
            v1 = this.s;
        }
        while(v != this.t);
        long v2 = SystemClock.elapsedRealtime();
        return Util.F1(Util.B2(v1) + ((long)(((float)(v2 - v)) * this.o.a)));
    }

    public boolean n() {
        return this.e == 3 && this.l && this.n == 0;
    }

    public void o(long v) {
        this.s = v;
        this.t = SystemClock.elapsedRealtime();
    }
}

