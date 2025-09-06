package androidx.media3.exoplayer;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class MediaSourceList {
    final class ForwardingEventListener implements DrmSessionEventListener, MediaSourceEventListener {
        private final MediaSourceHolder a;
        final MediaSourceList b;

        public ForwardingEventListener(MediaSourceHolder mediaSourceList$MediaSourceHolder0) {
            this.a = mediaSourceList$MediaSourceHolder0;
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void G(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                MediaSourceList.this.i.k(() -> MediaSourceList.this.h.G(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second)));
            }
        }

        @Nullable
        private Pair I(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            MediaPeriodId mediaSource$MediaPeriodId1 = null;
            if(mediaSource$MediaPeriodId0 != null) {
                MediaPeriodId mediaSource$MediaPeriodId2 = MediaSourceList.o(this.a, mediaSource$MediaPeriodId0);
                if(mediaSource$MediaPeriodId2 == null) {
                    return null;
                }
                mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId2;
            }
            return Pair.create(MediaSourceList.t(this.a, v), mediaSource$MediaPeriodId1);
        }

        // 检测为 Lambda 实现
        private void J(Pair pair0, MediaLoadData mediaLoadData0) [...]

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void K(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                N0 n00 = () -> MediaSourceList.this.h.K(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), loadEventInfo0, mediaLoadData0, iOException0, z);
                MediaSourceList.this.i.k(n00);
            }
        }

        // 检测为 Lambda 实现
        private void L(Pair pair0) [...]

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void M(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                O0 o00 = () -> MediaSourceList.this.h.M(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), loadEventInfo0, mediaLoadData0);
                MediaSourceList.this.i.k(o00);
            }
        }

        // 检测为 Lambda 实现
        private void N(Pair pair0) [...]

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void P(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                S0 s00 = () -> MediaSourceList.this.h.P(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), mediaLoadData0);
                MediaSourceList.this.i.k(s00);
            }
        }

        // 检测为 Lambda 实现
        private void Q(Pair pair0) [...]

        // 检测为 Lambda 实现
        private void R(Pair pair0, int v) [...]

        // 检测为 Lambda 实现
        private void S(Pair pair0, Exception exception0) [...]

        // 检测为 Lambda 实现
        private void T(Pair pair0) [...]

        // 检测为 Lambda 实现
        private void V(Pair pair0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) [...]

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void W(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                U0 u00 = () -> MediaSourceList.this.h.W(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second));
                MediaSourceList.this.i.k(u00);
            }
        }

        // 检测为 Lambda 实现
        private void Y(Pair pair0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) [...]

        // 检测为 Lambda 实现
        private void Z(Pair pair0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) [...]

        // 检测为 Lambda 实现
        private void a0(Pair pair0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) [...]

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void b0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                L0 l00 = () -> MediaSourceList.this.h.b0(((int)(((Integer)pair0.first))), ((MediaPeriodId)Assertions.g(((MediaPeriodId)pair0.second))), mediaLoadData0);
                MediaSourceList.this.i.k(l00);
            }
        }

        // 检测为 Lambda 实现
        private void c0(Pair pair0, MediaLoadData mediaLoadData0) [...]

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void e0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                R0 r00 = () -> MediaSourceList.this.h.e0(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), loadEventInfo0, mediaLoadData0);
                MediaSourceList.this.i.k(r00);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void j0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, int v1) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                W0 w00 = () -> MediaSourceList.this.h.j0(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), v1);
                MediaSourceList.this.i.k(w00);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void k0(int v, MediaPeriodId mediaSource$MediaPeriodId0) {
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void m0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                P0 p00 = () -> MediaSourceList.this.h.m0(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second));
                MediaSourceList.this.i.k(p00);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void n0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Exception exception0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                Q0 q00 = () -> MediaSourceList.this.h.n0(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), exception0);
                MediaSourceList.this.i.k(q00);
            }
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void s0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                V0 v00 = () -> MediaSourceList.this.h.s0(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second), loadEventInfo0, mediaLoadData0);
                MediaSourceList.this.i.k(v00);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void t0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            Pair pair0 = this.I(v, mediaSource$MediaPeriodId0);
            if(pair0 != null) {
                T0 t00 = () -> MediaSourceList.this.h.t0(((int)(((Integer)pair0.first))), ((MediaPeriodId)pair0.second));
                MediaSourceList.this.i.k(t00);
            }
        }
    }

    static final class MediaSourceAndListener {
        public final MediaSource a;
        public final MediaSourceCaller b;
        public final ForwardingEventListener c;

        public MediaSourceAndListener(MediaSource mediaSource0, MediaSourceCaller mediaSource$MediaSourceCaller0, ForwardingEventListener mediaSourceList$ForwardingEventListener0) {
            this.a = mediaSource0;
            this.b = mediaSource$MediaSourceCaller0;
            this.c = mediaSourceList$ForwardingEventListener0;
        }
    }

    static final class MediaSourceHolder implements MediaSourceInfoHolder {
        public final MaskingMediaSource a;
        public final Object b;
        public final List c;
        public int d;
        public boolean e;

        public MediaSourceHolder(MediaSource mediaSource0, boolean z) {
            this.a = new MaskingMediaSource(mediaSource0, z);
            this.c = new ArrayList();
            this.b = new Object();
        }

        @Override  // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Object a() {
            return this.b;
        }

        @Override  // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Timeline b() {
            return this.a.U0();
        }

        public void c(int v) {
            this.d = v;
            this.e = false;
            this.c.clear();
        }
    }

    public interface MediaSourceListInfoRefreshListener {
        void c();
    }

    private final PlayerId a;
    private final List b;
    private final IdentityHashMap c;
    private final Map d;
    private final MediaSourceListInfoRefreshListener e;
    private final HashMap f;
    private final Set g;
    private final AnalyticsCollector h;
    private final HandlerWrapper i;
    private ShuffleOrder j;
    private boolean k;
    @Nullable
    private TransferListener l;
    private static final String m = "MediaSourceList";

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceList$MediaSourceListInfoRefreshListener0, AnalyticsCollector analyticsCollector0, HandlerWrapper handlerWrapper0, PlayerId playerId0) {
        this.a = playerId0;
        this.e = mediaSourceList$MediaSourceListInfoRefreshListener0;
        this.j = new DefaultShuffleOrder(0);
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.h = analyticsCollector0;
        this.i = handlerWrapper0;
        this.f = new HashMap();
        this.g = new HashSet();
    }

    private void A(MediaSourceHolder mediaSourceList$MediaSourceHolder0) {
        K0 k00 = (MediaSource mediaSource0, Timeline timeline0) -> this.e.c();
        ForwardingEventListener mediaSourceList$ForwardingEventListener0 = new ForwardingEventListener(this, mediaSourceList$MediaSourceHolder0);
        MediaSourceAndListener mediaSourceList$MediaSourceAndListener0 = new MediaSourceAndListener(mediaSourceList$MediaSourceHolder0.a, k00, mediaSourceList$ForwardingEventListener0);
        this.f.put(mediaSourceList$MediaSourceHolder0, mediaSourceList$MediaSourceAndListener0);
        Handler handler0 = Util.J();
        mediaSourceList$MediaSourceHolder0.a.a(handler0, mediaSourceList$ForwardingEventListener0);
        Handler handler1 = Util.J();
        mediaSourceList$MediaSourceHolder0.a.q(handler1, mediaSourceList$ForwardingEventListener0);
        mediaSourceList$MediaSourceHolder0.a.I(k00, this.l, this.a);
    }

    public void B() {
        for(Object object0: this.f.values()) {
            MediaSourceAndListener mediaSourceList$MediaSourceAndListener0 = (MediaSourceAndListener)object0;
            try {
                mediaSourceList$MediaSourceAndListener0.a.u(mediaSourceList$MediaSourceAndListener0.b);
            }
            catch(RuntimeException runtimeException0) {
                Log.e("MediaSourceList", "Failed to release child source.", runtimeException0);
            }
            mediaSourceList$MediaSourceAndListener0.a.A(mediaSourceList$MediaSourceAndListener0.c);
            mediaSourceList$MediaSourceAndListener0.a.F(mediaSourceList$MediaSourceAndListener0.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }

    public void C(MediaPeriod mediaPeriod0) {
        MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.c.remove(mediaPeriod0)));
        mediaSourceList$MediaSourceHolder0.a.r(mediaPeriod0);
        mediaSourceList$MediaSourceHolder0.c.remove(((MaskingMediaPeriod)mediaPeriod0).a);
        if(!this.c.isEmpty()) {
            this.l();
        }
        this.w(mediaSourceList$MediaSourceHolder0);
    }

    public Timeline D(int v, int v1, ShuffleOrder shuffleOrder0) {
        Assertions.a(v >= 0 && v <= v1 && v1 <= this.s());
        this.j = shuffleOrder0;
        this.E(v, v1);
        return this.j();
    }

    private void E(int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)this.b.remove(v2);
            this.d.remove(mediaSourceList$MediaSourceHolder0.b);
            this.h(v2, -mediaSourceList$MediaSourceHolder0.a.U0().v());
            mediaSourceList$MediaSourceHolder0.e = true;
            if(this.k) {
                this.w(mediaSourceList$MediaSourceHolder0);
            }
        }
    }

    public Timeline F(List list0, ShuffleOrder shuffleOrder0) {
        this.E(0, this.b.size());
        return this.f(this.b.size(), list0, shuffleOrder0);
    }

    public Timeline G(ShuffleOrder shuffleOrder0) {
        int v = this.s();
        if(shuffleOrder0.getLength() != v) {
            shuffleOrder0 = shuffleOrder0.d().g(0, v);
        }
        this.j = shuffleOrder0;
        return this.j();
    }

    public Timeline H(int v, int v1, List list0) {
        boolean z = false;
        Assertions.a(v >= 0 && v <= v1 && v1 <= this.s());
        if(list0.size() == v1 - v) {
            z = true;
        }
        Assertions.a(z);
        for(int v2 = v; v2 < v1; ++v2) {
            ((MediaSourceHolder)this.b.get(v2)).a.L(((MediaItem)list0.get(v2 - v)));
        }
        return this.j();
    }

    public Timeline f(int v, List list0, ShuffleOrder shuffleOrder0) {
        if(!list0.isEmpty()) {
            this.j = shuffleOrder0;
            for(int v1 = v; v1 < list0.size() + v; ++v1) {
                MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)list0.get(v1 - v);
                if(v1 > 0) {
                    MediaSourceHolder mediaSourceList$MediaSourceHolder1 = (MediaSourceHolder)this.b.get(v1 - 1);
                    mediaSourceList$MediaSourceHolder0.c(mediaSourceList$MediaSourceHolder1.d + mediaSourceList$MediaSourceHolder1.a.U0().v());
                }
                else {
                    mediaSourceList$MediaSourceHolder0.c(0);
                }
                this.h(v1, mediaSourceList$MediaSourceHolder0.a.U0().v());
                this.b.add(v1, mediaSourceList$MediaSourceHolder0);
                this.d.put(mediaSourceList$MediaSourceHolder0.b, mediaSourceList$MediaSourceHolder0);
                if(this.k) {
                    this.A(mediaSourceList$MediaSourceHolder0);
                    if(this.c.isEmpty()) {
                        this.g.add(mediaSourceList$MediaSourceHolder0);
                    }
                    else {
                        this.k(mediaSourceList$MediaSourceHolder0);
                    }
                }
            }
        }
        return this.j();
    }

    public Timeline g(@Nullable ShuffleOrder shuffleOrder0) {
        if(shuffleOrder0 == null) {
            shuffleOrder0 = this.j.d();
        }
        this.j = shuffleOrder0;
        this.E(0, this.s());
        return this.j();
    }

    private void h(int v, int v1) {
        while(v < this.b.size()) {
            MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)this.b.get(v);
            mediaSourceList$MediaSourceHolder0.d += v1;
            ++v;
        }
    }

    public MediaPeriod i(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        Object object0 = MediaSourceList.p(mediaSource$MediaPeriodId0.a);
        MediaPeriodId mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0.a(MediaSourceList.n(mediaSource$MediaPeriodId0.a));
        MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.d.get(object0)));
        this.m(mediaSourceList$MediaSourceHolder0);
        mediaSourceList$MediaSourceHolder0.c.add(mediaSource$MediaPeriodId1);
        MediaPeriod mediaPeriod0 = mediaSourceList$MediaSourceHolder0.a.R0(mediaSource$MediaPeriodId1, allocator0, v);
        this.c.put(mediaPeriod0, mediaSourceList$MediaSourceHolder0);
        this.l();
        return mediaPeriod0;
    }

    public Timeline j() {
        if(this.b.isEmpty()) {
            return Timeline.a;
        }
        int v1 = 0;
        for(int v = 0; v < this.b.size(); ++v) {
            MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)this.b.get(v);
            mediaSourceList$MediaSourceHolder0.d = v1;
            v1 += mediaSourceList$MediaSourceHolder0.a.U0().v();
        }
        return new PlaylistTimeline(this.b, this.j);
    }

    private void k(MediaSourceHolder mediaSourceList$MediaSourceHolder0) {
        MediaSourceAndListener mediaSourceList$MediaSourceAndListener0 = (MediaSourceAndListener)this.f.get(mediaSourceList$MediaSourceHolder0);
        if(mediaSourceList$MediaSourceAndListener0 != null) {
            mediaSourceList$MediaSourceAndListener0.a.N(mediaSourceList$MediaSourceAndListener0.b);
        }
    }

    private void l() {
        Iterator iterator0 = this.g.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)object0;
            if(mediaSourceList$MediaSourceHolder0.c.isEmpty()) {
                this.k(mediaSourceList$MediaSourceHolder0);
                iterator0.remove();
            }
        }
    }

    private void m(MediaSourceHolder mediaSourceList$MediaSourceHolder0) {
        this.g.add(mediaSourceList$MediaSourceHolder0);
        MediaSourceAndListener mediaSourceList$MediaSourceAndListener0 = (MediaSourceAndListener)this.f.get(mediaSourceList$MediaSourceHolder0);
        if(mediaSourceList$MediaSourceAndListener0 != null) {
            mediaSourceList$MediaSourceAndListener0.a.J(mediaSourceList$MediaSourceAndListener0.b);
        }
    }

    private static Object n(Object object0) {
        return AbstractConcatenatedTimeline.C(object0);
    }

    @Nullable
    private static MediaPeriodId o(MediaSourceHolder mediaSourceList$MediaSourceHolder0, MediaPeriodId mediaSource$MediaPeriodId0) {
        for(int v = 0; v < mediaSourceList$MediaSourceHolder0.c.size(); ++v) {
            if(((MediaPeriodId)mediaSourceList$MediaSourceHolder0.c.get(v)).d == mediaSource$MediaPeriodId0.d) {
                return mediaSource$MediaPeriodId0.a(MediaSourceList.q(mediaSourceList$MediaSourceHolder0, mediaSource$MediaPeriodId0.a));
            }
        }
        return null;
    }

    private static Object p(Object object0) {
        return AbstractConcatenatedTimeline.D(object0);
    }

    private static Object q(MediaSourceHolder mediaSourceList$MediaSourceHolder0, Object object0) {
        return AbstractConcatenatedTimeline.F(mediaSourceList$MediaSourceHolder0.b, object0);
    }

    public ShuffleOrder r() {
        return this.j;
    }

    public int s() {
        return this.b.size();
    }

    private static int t(MediaSourceHolder mediaSourceList$MediaSourceHolder0, int v) {
        return v + mediaSourceList$MediaSourceHolder0.d;
    }

    public boolean u() {
        return this.k;
    }

    // 检测为 Lambda 实现
    private void v(MediaSource mediaSource0, Timeline timeline0) [...]

    private void w(MediaSourceHolder mediaSourceList$MediaSourceHolder0) {
        if(mediaSourceList$MediaSourceHolder0.e && mediaSourceList$MediaSourceHolder0.c.isEmpty()) {
            MediaSourceAndListener mediaSourceList$MediaSourceAndListener0 = (MediaSourceAndListener)Assertions.g(((MediaSourceAndListener)this.f.remove(mediaSourceList$MediaSourceHolder0)));
            mediaSourceList$MediaSourceAndListener0.a.u(mediaSourceList$MediaSourceAndListener0.b);
            mediaSourceList$MediaSourceAndListener0.a.A(mediaSourceList$MediaSourceAndListener0.c);
            mediaSourceList$MediaSourceAndListener0.a.F(mediaSourceList$MediaSourceAndListener0.c);
            this.g.remove(mediaSourceList$MediaSourceHolder0);
        }
    }

    public Timeline x(int v, int v1, ShuffleOrder shuffleOrder0) {
        return this.y(v, v + 1, v1, shuffleOrder0);
    }

    public Timeline y(int v, int v1, int v2, ShuffleOrder shuffleOrder0) {
        Assertions.a(v >= 0 && v <= v1 && v1 <= this.s() && v2 >= 0);
        this.j = shuffleOrder0;
        if(v != v1 && v != v2) {
            int v3 = Math.min(v, v2);
            int v4 = Math.max(v1 - v + v2 - 1, v1 - 1);
            int v5 = ((MediaSourceHolder)this.b.get(v3)).d;
            Util.E1(this.b, v, v1, v2);
            while(v3 <= v4) {
                MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)this.b.get(v3);
                mediaSourceList$MediaSourceHolder0.d = v5;
                v5 += mediaSourceList$MediaSourceHolder0.a.U0().v();
                ++v3;
            }
            return this.j();
        }
        return this.j();
    }

    public void z(@Nullable TransferListener transferListener0) {
        Assertions.i(!this.k);
        this.l = transferListener0;
        for(int v = 0; v < this.b.size(); ++v) {
            MediaSourceHolder mediaSourceList$MediaSourceHolder0 = (MediaSourceHolder)this.b.get(v);
            this.A(mediaSourceList$MediaSourceHolder0);
            this.g.add(mediaSourceList$MediaSourceHolder0);
        }
        this.k = true;
    }
}

