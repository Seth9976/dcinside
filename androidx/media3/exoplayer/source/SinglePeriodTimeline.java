package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.Builder;
import androidx.media3.common.MediaItem.LiveConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class SinglePeriodTimeline extends Timeline {
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    @Nullable
    private final Object o;
    @Nullable
    private final MediaItem p;
    @Nullable
    private final LiveConfiguration q;
    private static final Object r;
    private static final MediaItem s;

    static {
        SinglePeriodTimeline.r = new Object();
        SinglePeriodTimeline.s = new Builder().E("SinglePeriodTimeline").M(Uri.EMPTY).a();
    }

    @Deprecated
    public SinglePeriodTimeline(long v, long v1, long v2, long v3, long v4, long v5, long v6, boolean z, boolean z1, @Nullable Object object0, MediaItem mediaItem0, @Nullable LiveConfiguration mediaItem$LiveConfiguration0) {
        this(v, v1, v2, v3, v4, v5, v6, z, z1, false, object0, mediaItem0, mediaItem$LiveConfiguration0);
    }

    public SinglePeriodTimeline(long v, long v1, long v2, long v3, long v4, long v5, long v6, boolean z, boolean z1, boolean z2, @Nullable Object object0, MediaItem mediaItem0, @Nullable LiveConfiguration mediaItem$LiveConfiguration0) {
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        this.i = v4;
        this.j = v5;
        this.k = v6;
        this.l = z;
        this.m = z1;
        this.n = z2;
        this.o = object0;
        this.p = (MediaItem)Assertions.g(mediaItem0);
        this.q = mediaItem$LiveConfiguration0;
    }

    @Deprecated
    public SinglePeriodTimeline(long v, long v1, long v2, long v3, long v4, long v5, long v6, boolean z, boolean z1, boolean z2, @Nullable Object object0, @Nullable Object object1) {
        this(v, v1, v2, v3, v4, v5, v6, z, z1, false, object0, SinglePeriodTimeline.s.a().L(object1).a(), (z2 ? SinglePeriodTimeline.s.d : null));
    }

    public SinglePeriodTimeline(long v, long v1, long v2, long v3, boolean z, boolean z1, boolean z2, @Nullable Object object0, MediaItem mediaItem0) {
        this(0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, v, v1, v2, v3, z, z1, false, object0, mediaItem0, (z2 ? mediaItem0.d : null));
    }

    @Deprecated
    public SinglePeriodTimeline(long v, long v1, long v2, long v3, boolean z, boolean z1, boolean z2, @Nullable Object object0, @Nullable Object object1) {
        this(0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, v, v1, v2, v3, z, z1, z2, object0, object1);
    }

    public SinglePeriodTimeline(long v, boolean z, boolean z1, boolean z2, @Nullable Object object0, MediaItem mediaItem0) {
        this(v, v, 0L, 0L, z, z1, z2, object0, mediaItem0);
    }

    @Deprecated
    public SinglePeriodTimeline(long v, boolean z, boolean z1, boolean z2, @Nullable Object object0, @Nullable Object object1) {
        this(v, v, 0L, 0L, z, z1, z2, object0, object1);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.common.Timeline
    public int f(Object object0) {
        return SinglePeriodTimeline.r.equals(object0) ? 0 : -1;
    }

    @Override  // androidx.media3.common.Timeline
    public Period k(int v, Period timeline$Period0, boolean z) {
        Assertions.c(v, 0, 1);
        return z ? timeline$Period0.w(null, SinglePeriodTimeline.r, 0, this.h, -this.j) : timeline$Period0.w(null, null, 0, this.h, -this.j);
    }

    @Override  // androidx.media3.common.Timeline
    public int m() {
        return 1;
    }

    @Override  // androidx.media3.common.Timeline
    public Object s(int v) {
        Assertions.c(v, 0, 1);
        return SinglePeriodTimeline.r;
    }

    @Override  // androidx.media3.common.Timeline
    public Window u(int v, Window timeline$Window0, long v1) {
        Assertions.c(v, 0, 1);
        long v2 = this.k;
        boolean z = this.m;
        if(z && !this.n && v1 != 0L) {
            long v3 = this.i;
            if(v3 == 0x8000000000000001L) {
                return timeline$Window0.j(Window.q, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, 0x8000000000000001L, this.i, 0, 0, this.j);
            }
            v2 += v1;
            return v2 > v3 ? timeline$Window0.j(Window.q, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, 0x8000000000000001L, this.i, 0, 0, this.j) : timeline$Window0.j(Window.q, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, v2, this.i, 0, 0, this.j);
        }
        return timeline$Window0.j(Window.q, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, v2, this.i, 0, 0, this.j);
    }

    @Override  // androidx.media3.common.Timeline
    public int v() {
        return 1;
    }
}

