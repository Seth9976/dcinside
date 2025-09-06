package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.ClippingConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.HashMap;
import java.util.IdentityHashMap;

@UnstableApi
public final class ConcatenatingMediaSource2 extends CompositeMediaSource {
    public static final class Builder {
        private final a a;
        private int b;
        @Nullable
        private MediaItem c;
        @Nullable
        private Factory d;

        public Builder() {
            this.a = O2.n();
        }

        @O1.a
        public Builder a(MediaItem mediaItem0) {
            return this.b(mediaItem0, 0x8000000000000001L);
        }

        @O1.a
        public Builder b(MediaItem mediaItem0, long v) {
            Assertions.g(mediaItem0);
            if(v == 0x8000000000000001L) {
                ClippingConfiguration mediaItem$ClippingConfiguration0 = mediaItem0.f;
                if(mediaItem$ClippingConfiguration0.c != 0x8000000000000000L) {
                    v = Util.B2(mediaItem$ClippingConfiguration0.d - mediaItem$ClippingConfiguration0.b);
                }
            }
            Assertions.l(this.d, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return this.d(this.d.g(mediaItem0), v);
        }

        @O1.a
        public Builder c(MediaSource mediaSource0) {
            return this.d(mediaSource0, 0x8000000000000001L);
        }

        @O1.a
        public Builder d(MediaSource mediaSource0, long v) {
            Assertions.g(mediaSource0);
            Assertions.j(!(mediaSource0 instanceof ProgressiveMediaSource) || v != 0x8000000000000001L, "Progressive media source must define an initial placeholder duration.");
            int v1 = this.b;
            this.b = v1 + 1;
            MediaSourceHolder concatenatingMediaSource2$MediaSourceHolder0 = new MediaSourceHolder(mediaSource0, v1, Util.F1(v));
            this.a.j(concatenatingMediaSource2$MediaSourceHolder0);
            return this;
        }

        public ConcatenatingMediaSource2 e() {
            Assertions.b(this.b > 0, "Must add at least one source to the concatenation.");
            if(this.c == null) {
                this.c = MediaItem.c(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.c, this.a.n(), null);
        }

        @O1.a
        public Builder f(MediaItem mediaItem0) {
            this.c = mediaItem0;
            return this;
        }

        @O1.a
        public Builder g(Factory mediaSource$Factory0) {
            this.d = (Factory)Assertions.g(mediaSource$Factory0);
            return this;
        }

        @O1.a
        public Builder h(Context context0) {
            return this.g(new DefaultMediaSourceFactory(context0));
        }
    }

    static final class ConcatenatedTimeline extends Timeline {
        private final MediaItem e;
        private final O2 f;
        private final O2 g;
        private final O2 h;
        private final boolean i;
        private final boolean j;
        private final long k;
        private final long l;
        @Nullable
        private final Object m;

        public ConcatenatedTimeline(MediaItem mediaItem0, O2 o20, O2 o21, O2 o22, boolean z, boolean z1, long v, long v1, @Nullable Object object0) {
            this.e = mediaItem0;
            this.f = o20;
            this.g = o21;
            this.h = o22;
            this.i = z;
            this.j = z1;
            this.k = v;
            this.l = v1;
            this.m = object0;
        }

        private long A(Period timeline$Period0, int v) {
            if(timeline$Period0.d == 0x8000000000000001L) {
                return 0x8000000000000001L;
            }
            long v1 = (long)(((Long)this.h.get(v)));
            return v == this.h.size() - 1 ? this.k - v1 : ((long)(((Long)this.h.get(v + 1)))) - v1;
        }

        @Override  // androidx.media3.common.Timeline
        public int f(Object object0) {
            if(object0 instanceof Pair && ((Pair)object0).first instanceof Integer) {
                int v = ConcatenatingMediaSource2.J0(object0);
                Object object1 = ConcatenatingMediaSource2.L0(object0);
                int v1 = ((Timeline)this.f.get(v)).f(object1);
                return v1 == -1 ? -1 : ((int)(((Integer)this.g.get(v)))) + v1;
            }
            return -1;
        }

        @Override  // androidx.media3.common.Timeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            int v1 = this.z(v);
            int v2 = (int)(((Integer)this.g.get(v1)));
            ((Timeline)this.f.get(v1)).k(v - v2, timeline$Period0, z);
            timeline$Period0.c = 0;
            timeline$Period0.e = (long)(((Long)this.h.get(v)));
            timeline$Period0.d = this.A(timeline$Period0, v);
            if(z) {
                timeline$Period0.b = ConcatenatingMediaSource2.P0(v1, Assertions.g(timeline$Period0.b));
            }
            return timeline$Period0;
        }

        @Override  // androidx.media3.common.Timeline
        public Period l(Object object0, Period timeline$Period0) {
            int v = ConcatenatingMediaSource2.J0(object0);
            Object object1 = ConcatenatingMediaSource2.L0(object0);
            Timeline timeline0 = (Timeline)this.f.get(v);
            int v1 = ((int)(((Integer)this.g.get(v)))) + timeline0.f(object1);
            timeline0.l(object1, timeline$Period0);
            timeline$Period0.c = 0;
            timeline$Period0.e = (long)(((Long)this.h.get(v1)));
            timeline$Period0.d = this.A(timeline$Period0, v1);
            timeline$Period0.b = object0;
            return timeline$Period0;
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return this.h.size();
        }

        @Override  // androidx.media3.common.Timeline
        public Object s(int v) {
            int v1 = this.z(v);
            int v2 = (int)(((Integer)this.g.get(v1)));
            return ConcatenatingMediaSource2.P0(v1, ((Timeline)this.f.get(v1)).s(v - v2));
        }

        @Override  // androidx.media3.common.Timeline
        public Window u(int v, Window timeline$Window0, long v1) {
            int v2 = this.m();
            long v3 = (long)(((Long)this.h.get(0)));
            return timeline$Window0.j(Window.q, this.e, this.m, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, this.i, this.j, null, this.l, this.k, 0, v2 - 1, -v3);
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return 1;
        }

        private int z(int v) {
            return Util.l(this.g, ((int)(v + 1)), false, false);
        }
    }

    static final class MediaSourceHolder {
        public final MaskingMediaSource a;
        public final int b;
        public final long c;
        public final HashMap d;
        public int e;

        public MediaSourceHolder(MediaSource mediaSource0, int v, long v1) {
            this.a = new MaskingMediaSource(mediaSource0, false);
            this.b = v;
            this.c = v1;
            this.d = new HashMap();
        }
    }

    private final O2 k;
    private final IdentityHashMap l;
    @Nullable
    private Handler m;
    private boolean n;
    @GuardedBy("this")
    private MediaItem o;
    private static final int p = 1;

    private ConcatenatingMediaSource2(MediaItem mediaItem0, O2 o20) {
        this.o = mediaItem0;
        this.k = o20;
        this.l = new IdentityHashMap();
    }

    ConcatenatingMediaSource2(MediaItem mediaItem0, O2 o20, androidx.media3.exoplayer.source.ConcatenatingMediaSource2.1 concatenatingMediaSource2$10) {
        this(mediaItem0, o20);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void B0(Object object0, MediaSource mediaSource0, Timeline timeline0) {
        this.U0(((Integer)object0), mediaSource0, timeline0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        int v1 = ConcatenatingMediaSource2.J0(mediaSource$MediaPeriodId0.a);
        MediaSourceHolder concatenatingMediaSource2$MediaSourceHolder0 = (MediaSourceHolder)this.k.get(v1);
        MediaPeriodId mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0.a(ConcatenatingMediaSource2.L0(mediaSource$MediaPeriodId0.a)).b(ConcatenatingMediaSource2.M0(mediaSource$MediaPeriodId0.d, this.k.size(), concatenatingMediaSource2$MediaSourceHolder0.b));
        this.w0(concatenatingMediaSource2$MediaSourceHolder0.b);
        ++concatenatingMediaSource2$MediaSourceHolder0.e;
        long v2 = mediaSource$MediaPeriodId0.c() ? 0L : ((long)(((Long)Assertions.g(((Long)concatenatingMediaSource2$MediaSourceHolder0.d.get(mediaSource$MediaPeriodId1.a))))));
        MediaPeriod mediaPeriod0 = new TimeOffsetMediaPeriod(concatenatingMediaSource2$MediaSourceHolder0.a.R0(mediaSource$MediaPeriodId1, allocator0, v - v2), v2);
        this.l.put(mediaPeriod0, concatenatingMediaSource2$MediaSourceHolder0);
        this.I0();
        return mediaPeriod0;
    }

    private void I0() {
        for(int v = 0; v < this.k.size(); ++v) {
            MediaSourceHolder concatenatingMediaSource2$MediaSourceHolder0 = (MediaSourceHolder)this.k.get(v);
            if(concatenatingMediaSource2$MediaSourceHolder0.e == 0) {
                this.v0(concatenatingMediaSource2$MediaSourceHolder0.b);
            }
        }
    }

    private static int J0(Object object0) {
        return (int)(((Integer)((Pair)object0).first));
    }

    private static int K0(long v, int v1) {
        return (int)(v % ((long)v1));
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        synchronized(this) {
            this.o = mediaItem0;
        }
    }

    private static Object L0(Object object0) {
        return ((Pair)object0).second;
    }

    private static long M0(long v, int v1, int v2) {
        return v * ((long)v1) + ((long)v2);
    }

    @Nullable
    protected MediaPeriodId N0(Integer integer0, MediaPeriodId mediaSource$MediaPeriodId0) {
        if(((int)integer0) != ConcatenatingMediaSource2.K0(mediaSource$MediaPeriodId0.d, this.k.size())) {
            return null;
        }
        long v = ConcatenatingMediaSource2.R0(mediaSource$MediaPeriodId0.d, this.k.size());
        return mediaSource$MediaPeriodId0.a(ConcatenatingMediaSource2.P0(((int)integer0), mediaSource$MediaPeriodId0.a)).b(v);
    }

    protected long O0(Integer integer0, long v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        if(v != 0x8000000000000001L && mediaSource$MediaPeriodId0 != null && !mediaSource$MediaPeriodId0.c()) {
            Long long0 = (Long)((MediaSourceHolder)this.k.get(((int)integer0))).d.get(mediaSource$MediaPeriodId0.a);
            return long0 == null ? v : v + Util.B2(((long)long0));
        }
        return v;
    }

    private static Object P0(int v, Object object0) {
        return Pair.create(v, object0);
    }

    protected int Q0(Integer integer0, int v) {
        return 0;
    }

    private static long R0(long v, int v1) {
        return v / ((long)v1);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        return true;
    }

    // 检测为 Lambda 实现
    private boolean S0(Message message0) [...]

    @Nullable
    private ConcatenatedTimeline T0() {
        Timeline timeline1;
        long v14;
        Object object2;
        Object object1;
        int v11;
        int v9;
        int v8;
        Window timeline$Window0 = new Window();
        Period timeline$Period0 = new Period();
        a o2$a0 = O2.n();
        a o2$a1 = O2.n();
        a o2$a2 = O2.n();
        int v = this.k.size();
        int v2 = 1;
        Object object0 = null;
        int v3 = 0;
        boolean z = false;
        boolean z1 = true;
        boolean z2 = false;
        long v4 = 0L;
        long v5 = 0L;
        long v6 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            MediaSourceHolder concatenatingMediaSource2$MediaSourceHolder0 = (MediaSourceHolder)this.k.get(v1);
            Timeline timeline0 = concatenatingMediaSource2$MediaSourceHolder0.a.U0();
            Assertions.b(!timeline0.w(), "Can\'t concatenate empty child Timeline.");
            o2$a0.j(timeline0);
            o2$a1.j(v3);
            v3 += timeline0.m();
            int v7 = 0;
            while(v7 < timeline0.v()) {
                timeline0.t(v7, timeline$Window0);
                if(!z) {
                    object0 = timeline$Window0.d;
                    z = true;
                }
                if(v2 == 0 || !Util.g(object0, timeline$Window0.d)) {
                    v8 = v1;
                    v9 = 0;
                }
                else {
                    v8 = v1;
                    v9 = 1;
                }
                long v10 = timeline$Window0.m;
                if(v10 == 0x8000000000000001L) {
                    v10 = concatenatingMediaSource2$MediaSourceHolder0.c;
                    if(v10 == 0x8000000000000001L) {
                        return null;
                    }
                }
                v4 += v10;
                if(concatenatingMediaSource2$MediaSourceHolder0.b != 0 || v7 != 0) {
                    v11 = v9;
                    object1 = object0;
                }
                else {
                    v11 = v9;
                    object1 = object0;
                    v5 = timeline$Window0.l;
                    v6 = -timeline$Window0.p;
                }
                z1 &= timeline$Window0.h || timeline$Window0.k;
                z2 |= timeline$Window0.i;
                int v12 = timeline$Window0.n;
                while(v12 <= timeline$Window0.o) {
                    o2$a2.j(v6);
                    timeline0.k(v12, timeline$Period0, true);
                    long v13 = timeline$Period0.d;
                    if(v13 == 0x8000000000000001L) {
                        Assertions.b(timeline$Window0.n == timeline$Window0.o, "Can\'t apply placeholder duration to multiple periods with unknown duration in a single window.");
                        v13 = timeline$Window0.p + v10;
                    }
                    if(v12 != timeline$Window0.n || concatenatingMediaSource2$MediaSourceHolder0.b == 0 && v7 == 0 || v13 == 0x8000000000000001L) {
                        object2 = object1;
                        timeline1 = timeline0;
                        v14 = 0L;
                    }
                    else {
                        object2 = object1;
                        v14 = -timeline$Window0.p;
                        v13 += v14;
                        timeline1 = timeline0;
                    }
                    Object object3 = Assertions.g(timeline$Period0.b);
                    Assertions.b(concatenatingMediaSource2$MediaSourceHolder0.e == 0 || !concatenatingMediaSource2$MediaSourceHolder0.d.containsKey(object3) || ((Long)concatenatingMediaSource2$MediaSourceHolder0.d.get(object3)).equals(v14), "Can\'t handle windows with changing offset in first period.");
                    concatenatingMediaSource2$MediaSourceHolder0.d.put(object3, v14);
                    v6 += v13;
                    ++v12;
                    object1 = object2;
                    timeline0 = timeline1;
                }
                ++v7;
                v1 = v8;
                v2 = v11;
                object0 = object1;
            }
        }
        MediaItem mediaItem0 = this.d();
        O2 o20 = o2$a0.n();
        O2 o21 = o2$a1.n();
        O2 o22 = o2$a2.n();
        return v2 == 0 ? new ConcatenatedTimeline(mediaItem0, o20, o21, o22, z1, z2, v4, v5, null) : new ConcatenatedTimeline(mediaItem0, o20, o21, o22, z1, z2, v4, v5, object0);
    }

    protected void U0(Integer integer0, MediaSource mediaSource0, Timeline timeline0) {
        this.V0();
    }

    private void V0() {
        if(!this.n) {
            ((Handler)Assertions.g(this.m)).obtainMessage(1).sendToTarget();
            this.n = true;
        }
    }

    private void W0() {
        this.n = false;
        ConcatenatedTimeline concatenatingMediaSource2$ConcatenatedTimeline0 = this.T0();
        if(concatenatingMediaSource2$ConcatenatedTimeline0 != null) {
            this.p0(concatenatingMediaSource2$ConcatenatedTimeline0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        synchronized(this) {
        }
        return this.o;
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void g0() {
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        super.o0(transferListener0);
        this.m = new Handler((Message message0) -> {
            if(message0.what == 1) {
                this.W0();
            }
            return true;
        });
        for(int v = 0; v < this.k.size(); ++v) {
            this.C0(v, ((MediaSourceHolder)this.k.get(v)).a);
        }
        this.V0();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void q0() {
        super.q0();
        Handler handler0 = this.m;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
            this.m = null;
        }
        this.n = false;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        MediaSourceHolder concatenatingMediaSource2$MediaSourceHolder0 = (MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.l.remove(mediaPeriod0)));
        MediaPeriod mediaPeriod1 = ((TimeOffsetMediaPeriod)mediaPeriod0).b();
        concatenatingMediaSource2$MediaSourceHolder0.a.r(mediaPeriod1);
        --concatenatingMediaSource2$MediaSourceHolder0.e;
        if(!this.l.isEmpty()) {
            this.I0();
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    @Nullable
    public Timeline x() {
        return this.T0();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    protected MediaPeriodId x0(Object object0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.N0(((Integer)object0), mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected long y0(Object object0, long v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.O0(((Integer)object0), v, mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected int z0(Object object0, int v) {
        return this.Q0(((Integer)object0), v);
    }

    class androidx.media3.exoplayer.source.ConcatenatingMediaSource2.1 {
    }

}

